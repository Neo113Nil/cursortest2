package L;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1692a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1692a) {
            case 0:
                return new i(runnable);
            default:
                return new Thread(new O3.i(3, runnable), "glide-active-resources");
        }
    }
}
