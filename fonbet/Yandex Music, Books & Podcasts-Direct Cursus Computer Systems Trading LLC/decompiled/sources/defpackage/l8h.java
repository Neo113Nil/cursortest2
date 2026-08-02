package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class l8h extends WeakReference {
    public static final boolean f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", PListParser.TAG_TRUE));
    public static final RuntimeException g;
    public final ReferenceQueue a;
    public final ConcurrentMap b;
    public final String c;
    public final SoftReference d;
    public final AtomicBoolean e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        g = runtimeException;
    }

    public l8h(m8h m8hVar, j8h j8hVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(m8hVar, referenceQueue);
        this.e = new AtomicBoolean();
        this.d = new SoftReference(f ? new RuntimeException("ManagedChannel allocation site") : g);
        this.c = j8hVar.toString();
        this.a = referenceQueue;
        this.b = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            l8h l8hVar = (l8h) referenceQueue.poll();
            if (l8hVar == null) {
                return;
            }
            SoftReference softReference = l8hVar.d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            l8hVar.b.remove(l8hVar);
            softReference.clear();
            if (!l8hVar.e.get()) {
                Level level = Level.SEVERE;
                Logger logger = m8h.e;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{l8hVar.c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.b.remove(this);
        this.d.clear();
        a(this.a);
    }
}
