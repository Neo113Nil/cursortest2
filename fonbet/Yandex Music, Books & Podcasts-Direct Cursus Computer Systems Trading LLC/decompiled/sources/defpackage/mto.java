package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class mto {
    public static final boolean a;
    public static final int b;
    public static final AtomicReference c = new AtomicReference();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[LOOP:0: B:12:0x0039->B:20:0x006c, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        boolean z;
        String property;
        int parseInt;
        ScheduledExecutorService newScheduledThreadPool;
        String property2;
        try {
            property2 = System.getProperty("rx2.purge-enabled");
        } catch (Throwable unused) {
        }
        if (property2 == null) {
            z = true;
            a = z;
            if (z) {
                try {
                    property = System.getProperty("rx2.purge-period-seconds");
                } catch (Throwable unused2) {
                }
                if (property != null) {
                    parseInt = Integer.parseInt(property);
                    b = parseInt;
                    if (!a) {
                        return;
                    }
                    while (true) {
                        AtomicReference atomicReference = c;
                        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
                        if (scheduledExecutorService != null) {
                            return;
                        }
                        newScheduledThreadPool = Executors.newScheduledThreadPool(1, new wjo("RxSchedulerPurge"));
                        while (!atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                            if (atomicReference.get() != scheduledExecutorService) {
                                break;
                            }
                        }
                        q qVar = new q(22);
                        long j = b;
                        newScheduledThreadPool.scheduleAtFixedRate(qVar, j, j, TimeUnit.SECONDS);
                        return;
                        newScheduledThreadPool.shutdownNow();
                    }
                }
            }
            parseInt = 1;
            b = parseInt;
            if (!a) {
            }
        } else {
            z = PListParser.TAG_TRUE.equals(property2);
            a = z;
            if (z) {
            }
            parseInt = 1;
            b = parseInt;
            if (!a) {
            }
        }
    }
}
