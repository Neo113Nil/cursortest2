package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0501o f5141a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0505t f5142b;

    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        EnumC0501o a9 = enumC0500n.a();
        EnumC0501o state1 = this.f5141a;
        kotlin.jvm.internal.h.e(state1, "state1");
        if (a9.compareTo(state1) < 0) {
            state1 = a9;
        }
        this.f5141a = state1;
        this.f5142b.a(interfaceC0507v, enumC0500n);
        this.f5141a = a9;
    }
}
