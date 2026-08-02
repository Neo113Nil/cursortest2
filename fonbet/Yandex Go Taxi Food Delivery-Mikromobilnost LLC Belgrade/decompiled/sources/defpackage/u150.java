package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes11.dex */
public final class u150 implements ThreadFactory {
    public final AtomicInteger a = new AtomicInteger(1);
    public final String b = "ImagesExecutor";
    public final int c = 4;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.b + LicenseUtility.SEPARATOR + this.a.getAndIncrement());
        thread.setPriority(this.c);
        return thread;
    }
}
