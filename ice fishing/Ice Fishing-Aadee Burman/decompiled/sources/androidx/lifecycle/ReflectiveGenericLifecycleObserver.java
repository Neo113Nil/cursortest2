package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0501t {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0502u f5142n;

    /* renamed from: u, reason: collision with root package name */
    public final C0484b f5143u;

    public ReflectiveGenericLifecycleObserver(InterfaceC0502u interfaceC0502u) {
        this.f5142n = interfaceC0502u;
        C0486d c0486d = C0486d.f5158c;
        Class<?> cls = interfaceC0502u.getClass();
        C0484b c0484b = (C0484b) c0486d.f5159a.get(cls);
        this.f5143u = c0484b == null ? c0486d.a(cls, null) : c0484b;
    }

    @Override // androidx.lifecycle.InterfaceC0501t
    public final void a(InterfaceC0503v interfaceC0503v, EnumC0496n enumC0496n) {
        HashMap hashMap = this.f5143u.f5154a;
        List list = (List) hashMap.get(enumC0496n);
        InterfaceC0502u interfaceC0502u = this.f5142n;
        C0484b.a(list, interfaceC0503v, enumC0496n, interfaceC0502u);
        C0484b.a((List) hashMap.get(EnumC0496n.ON_ANY), interfaceC0503v, enumC0496n, interfaceC0502u);
    }
}
