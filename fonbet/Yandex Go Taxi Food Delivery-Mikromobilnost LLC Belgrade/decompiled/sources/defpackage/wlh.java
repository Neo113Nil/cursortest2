package defpackage;

import com.google.android.gms.internal.measurement.e;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class wlh implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;

    public wlh() {
        this.a = 0;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            default:
                Thread newThread = ((ThreadFactory) obj).newThread(runnable);
                newThread.setName("ScionFrontendApi");
                return newThread;
        }
    }

    public wlh(e eVar) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
    }
}
