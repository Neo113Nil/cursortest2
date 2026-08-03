package q3;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5749a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5750b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f5749a) {
            case 0:
                Thread thread = new Thread(runnable, this.f5750b);
                thread.setPriority(10);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, this.f5750b);
                thread2.setDaemon(true);
                return thread2;
        }
    }
}
