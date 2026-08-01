package androidx.lifecycle;

/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102t {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0097n f2044a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0100q f2045b;

    public final void a(InterfaceC0101s interfaceC0101s, EnumC0096m enumC0096m) {
        EnumC0097n a2 = enumC0096m.a();
        EnumC0097n enumC0097n = this.f2044a;
        D1.i.e(enumC0097n, "state1");
        if (a2.compareTo(enumC0097n) < 0) {
            enumC0097n = a2;
        }
        this.f2044a = enumC0097n;
        this.f2045b.a(interfaceC0101s, enumC0096m);
        this.f2044a = a2;
    }
}
