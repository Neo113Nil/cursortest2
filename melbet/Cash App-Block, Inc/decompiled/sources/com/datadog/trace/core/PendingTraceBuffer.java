package com.datadog.trace.core;

import com.bugsnag.android.Client;
import com.datadog.android.api.InternalLogger;
import com.datadog.trace.api.Config;
import com.datadog.trace.api.time.SystemTimeSource;
import com.datadog.trace.util.AgentThreadFactory;
import com.google.android.gms.auth.api.zbc;
import java.util.concurrent.atomic.AtomicInteger;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MpscBlockingConsumerArrayQueue;

/* loaded from: classes4.dex */
public abstract class PendingTraceBuffer implements AutoCloseable {

    public final class DelayingPendingTraceBuffer extends PendingTraceBuffer {
        public volatile boolean closed = false;
        public final AtomicInteger flushCounter = new AtomicInteger(0);
        public final MpscBlockingConsumerArrayQueue queue = new MpscBlockingConsumerArrayQueue(4096);
        public final LongRunningTracesTracker runningTracesTracker;
        public final SystemTimeSource timeSource;
        public final Thread worker;

        public final class FlushElement implements Element {
            public static final FlushElement FLUSH_ELEMENT = new FlushElement();

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final DDSpan getRootSpan() {
                return null;
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final boolean lastReferencedNanosAgo() {
                return false;
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final long oldestFinishedTime() {
                return 0L;
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final boolean setEnqueued(boolean z) {
                return true;
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final void write() {
            }

            @Override // com.datadog.trace.core.PendingTraceBuffer.Element
            public final boolean writeOnBufferFull() {
                return true;
            }
        }

        public final class WriteDrain implements MessagePassingQueue.Consumer {
            public static final WriteDrain WRITE_DRAIN = new WriteDrain();
        }

        public DelayingPendingTraceBuffer(SystemTimeSource systemTimeSource, Config config) {
            Client.AnonymousClass7 anonymousClass7 = new Client.AnonymousClass7(this, 17);
            ThreadGroup threadGroup = AgentThreadFactory.AGENT_THREAD_GROUP;
            Thread thread = new Thread(AgentThreadFactory.AGENT_THREAD_GROUP, anonymousClass7, "dd-trace-monitor");
            thread.setDaemon(true);
            thread.setContextClassLoader(null);
            thread.setUncaughtExceptionHandler(new AgentThreadFactory.AnonymousClass1());
            this.worker = thread;
            this.timeSource = systemTimeSource;
            this.runningTracesTracker = config.longRunningTraceEnabled ? new LongRunningTracesTracker(config) : null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            FlushElement flushElement = FlushElement.FLUSH_ELEMENT;
            if (this.worker.isAlive()) {
                int i = this.flushCounter.get();
                boolean offer = this.queue.offer(flushElement);
                int i2 = 1;
                while (!this.closed && !offer) {
                    int i3 = i2 + 1;
                    if (i2 <= 3) {
                        Thread.yield();
                    } else {
                        try {
                            Thread.sleep(10L);
                        } catch (Throwable unused) {
                        }
                    }
                    i2 = i3;
                    offer = this.queue.offer(flushElement);
                }
                int i4 = this.flushCounter.get();
                while (!this.closed && i >= i4) {
                    int i5 = i2 + 1;
                    if (i2 <= 3) {
                        Thread.yield();
                    } else {
                        try {
                            Thread.sleep(10L);
                        } catch (Throwable unused2) {
                        }
                    }
                    i2 = i5;
                    i4 = this.flushCounter.get();
                }
            }
            this.closed = true;
            this.worker.interrupt();
            try {
                this.worker.join(800L);
            } catch (InterruptedException unused3) {
            }
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public final void enqueue(Element element) {
            if (!element.setEnqueued(true) || this.queue.offer(element)) {
                return;
            }
            element.setEnqueued(false);
            if (element.writeOnBufferFull()) {
                element.write();
            }
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public final boolean longRunningSpansEnabled() {
            return this.runningTracesTracker != null;
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public final void start() {
            this.worker.start();
        }
    }

    public final class DiscardingPendingTraceBuffer extends PendingTraceBuffer {
        public final zbc log;

        public DiscardingPendingTraceBuffer(InternalLogger internalLogger) {
            this.log = new zbc(4, DiscardingPendingTraceBuffer.class.getSimpleName(), internalLogger);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public final void enqueue(Element element) {
            this.log.debug("PendingTrace enqueued but won't be reported. Root span: {}", element.getRootSpan());
        }

        @Override // com.datadog.trace.core.PendingTraceBuffer
        public final void start() {
        }
    }

    public interface Element {
        DDSpan getRootSpan();

        boolean lastReferencedNanosAgo();

        long oldestFinishedTime();

        boolean setEnqueued(boolean z);

        void write();

        boolean writeOnBufferFull();
    }

    public abstract void enqueue(Element element);

    public boolean longRunningSpansEnabled() {
        return false;
    }

    public abstract void start();
}
