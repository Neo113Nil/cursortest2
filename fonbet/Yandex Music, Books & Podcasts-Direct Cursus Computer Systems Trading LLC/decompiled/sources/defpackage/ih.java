package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class ih implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ ih(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new hh(runnable, 0), "glide-active-resources");
            case 1:
                return new jt1(runnable);
            default:
                return new v0o(runnable);
        }
    }
}
