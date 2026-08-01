package androidx.lifecycle;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0497o f5174a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0501t f5175b;

    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        EnumC0497o a9 = enumC0496n.a();
        EnumC0497o state1 = this.f5174a;
        kotlin.jvm.internal.h.e(state1, "state1");
        if (a9.compareTo(state1) < 0) {
            state1 = a9;
        }
        this.f5174a = state1;
        this.f5175b.a(interfaceC0503v, enumC0496n);
        this.f5174a = a9;
    }
}
