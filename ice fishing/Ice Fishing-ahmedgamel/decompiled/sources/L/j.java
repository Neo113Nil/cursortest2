package L;

import L3.u;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1604a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1604a) {
            case 0:
                return new i(runnable);
            default:
                return new Thread(new u(4, runnable), "glide-active-resources");
        }
    }
}
