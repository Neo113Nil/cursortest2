package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p7 implements ThreadFactory {
    public final /* synthetic */ String qoPGr6Ce;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.qoPGr6Ce);
        thread.setPriority(10);
        return thread;
    }
}
