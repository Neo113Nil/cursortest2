package N;

import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Object f1898c;

    public d(int i) {
        super(i);
        this.f1898c = new Object();
    }

    @Override // N.c
    public final Object a() {
        Object a9;
        synchronized (this.f1898c) {
            a9 = super.a();
        }
        return a9;
    }

    @Override // N.c
    public final boolean c(Object instance) {
        boolean c9;
        h.e(instance, "instance");
        synchronized (this.f1898c) {
            c9 = super.c(instance);
        }
        return c9;
    }
}
