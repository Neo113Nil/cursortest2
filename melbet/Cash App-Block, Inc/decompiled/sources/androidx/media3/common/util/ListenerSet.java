package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.tracing.Trace;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public final class ListenerSet {
    public final ArrayDeque flushingEvents;
    public final IterationFinishedEvent iterationFinishedEvent;
    public final SystemHandlerWrapper iterationFinishedHandler;
    public final CopyOnWriteArraySet listeners;
    public final ArrayDeque queuedEvents;
    public boolean released;
    public final Object releasedLock;
    public final Thread thread;
    public final boolean throwsWhenUsingWrongThread;

    public interface Event {
        void invoke(Object obj);
    }

    public interface IterationFinishedEvent {
        void invoke(Object obj, FlagSet flagSet);
    }

    public final class ListenerHolder {
        public FlagSet.Builder flagsBuilder = new FlagSet.Builder(0);
        public final Object listener;
        public boolean needsIterationFinishedEvent;
        public boolean released;

        public ListenerHolder(Object obj) {
            this.listener = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ListenerHolder.class != obj.getClass()) {
                return false;
            }
            return this.listener.equals(((ListenerHolder) obj).listener);
        }

        public final int hashCode() {
            return this.listener.hashCode();
        }
    }

    public ListenerSet(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, SystemClock systemClock, IterationFinishedEvent iterationFinishedEvent, boolean z) {
        this.thread = thread;
        this.listeners = copyOnWriteArraySet;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.releasedLock = new Object();
        this.flushingEvents = new ArrayDeque();
        this.queuedEvents = new ArrayDeque();
        if (looper == null || systemClock == null || iterationFinishedEvent == null) {
            this.iterationFinishedHandler = null;
        } else {
            this.iterationFinishedHandler = systemClock.createHandler(looper, new ListenerSet$$ExternalSyntheticLambda0(this, 0));
        }
        this.throwsWhenUsingWrongThread = z;
    }

    public final void add(Object obj) {
        obj.getClass();
        synchronized (this.releasedLock) {
            try {
                if (this.released) {
                    return;
                }
                this.listeners.add(new ListenerHolder(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flushEvents() {
        if (this.throwsWhenUsingWrongThread) {
            Trace.checkState(Thread.currentThread() == this.thread);
        }
        ArrayDeque arrayDeque = this.queuedEvents;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.iterationFinishedEvent != null) {
            SystemHandlerWrapper systemHandlerWrapper = this.iterationFinishedHandler;
            systemHandlerWrapper.getClass();
            Handler handler = systemHandlerWrapper.handler;
            if (!handler.hasMessages(1)) {
                SystemHandlerWrapper.SystemMessage obtainMessage = systemHandlerWrapper.obtainMessage(1);
                Message message = obtainMessage.message;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                obtainMessage.recycle();
            }
        }
        ArrayDeque arrayDeque2 = this.flushingEvents;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void queueEvent(int i, Event event) {
        int i2 = 0;
        if (this.throwsWhenUsingWrongThread) {
            Trace.checkState(Thread.currentThread() == this.thread);
        }
        this.queuedEvents.add(new ListenerSet$$ExternalSyntheticLambda1(new CopyOnWriteArraySet(this.listeners), i, event, i2));
    }

    public final void release() {
        if (this.throwsWhenUsingWrongThread) {
            Trace.checkState(Thread.currentThread() == this.thread);
        }
        synchronized (this.releasedLock) {
            this.released = true;
        }
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ListenerHolder listenerHolder = (ListenerHolder) it.next();
            IterationFinishedEvent iterationFinishedEvent = this.iterationFinishedEvent;
            listenerHolder.released = true;
            if (iterationFinishedEvent != null && listenerHolder.needsIterationFinishedEvent) {
                listenerHolder.needsIterationFinishedEvent = false;
                iterationFinishedEvent.invoke(listenerHolder.listener, listenerHolder.flagsBuilder.build());
            }
        }
        this.listeners.clear();
    }

    public final void remove(Object obj) {
        if (this.throwsWhenUsingWrongThread) {
            Trace.checkState(Thread.currentThread() == this.thread);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = this.listeners;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ListenerHolder listenerHolder = (ListenerHolder) it.next();
            if (listenerHolder.listener.equals(obj)) {
                listenerHolder.released = true;
                IterationFinishedEvent iterationFinishedEvent = this.iterationFinishedEvent;
                if (iterationFinishedEvent != null && listenerHolder.needsIterationFinishedEvent) {
                    listenerHolder.needsIterationFinishedEvent = false;
                    iterationFinishedEvent.invoke(listenerHolder.listener, listenerHolder.flagsBuilder.build());
                }
                copyOnWriteArraySet.remove(listenerHolder);
            }
        }
    }

    public final void sendEvent(int i, Event event) {
        queueEvent(i, event);
        flushEvents();
    }

    public ListenerSet(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
