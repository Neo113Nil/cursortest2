package androidx.lifecycle;

import java.io.Closeable;
import l0.C0233d;

/* loaded from: classes.dex */
public final class J implements InterfaceC0100q, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f2005a;

    /* renamed from: b, reason: collision with root package name */
    public final I f2006b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2007c;

    public J(String str, I i) {
        this.f2005a = str;
        this.f2006b = i;
    }

    @Override // androidx.lifecycle.InterfaceC0100q
    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
        if (enumC0096m == EnumC0096m.ON_DESTROY) {
            this.f2007c = false;
            interfaceC0101s.d().f(this);
        }
    }

    public final void b(C0103u c0103u, C0233d c0233d) {
        D1.i.e(c0233d, "registry");
        D1.i.e(c0103u, "lifecycle");
        if (this.f2007c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2007c = true;
        c0103u.a(this);
        c0233d.f(this.f2005a, this.f2006b.e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
