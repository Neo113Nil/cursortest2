package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements ThreadFactory {
    public final /* synthetic */ String GWasM1elztuh;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.GWasM1elztuh);
        thread.setPriority(10);
        return thread;
    }
}
