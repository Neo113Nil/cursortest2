package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0505t {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC0506u f5109n;

    /* renamed from: u, reason: collision with root package name */
    public final C0488b f5110u;

    public ReflectiveGenericLifecycleObserver(InterfaceC0506u interfaceC0506u) {
        this.f5109n = interfaceC0506u;
        C0490d c0490d = C0490d.f5125c;
        Class<?> cls = interfaceC0506u.getClass();
        C0488b c0488b = (C0488b) c0490d.f5126a.get(cls);
        this.f5110u = c0488b == null ? c0490d.a(cls, null) : c0488b;
    }

    @Override // androidx.lifecycle.InterfaceC0505t
    public final void a(InterfaceC0507v interfaceC0507v, EnumC0500n enumC0500n) {
        HashMap hashMap = this.f5110u.f5121a;
        List list = (List) hashMap.get(enumC0500n);
        InterfaceC0506u interfaceC0506u = this.f5109n;
        C0488b.a(list, interfaceC0507v, enumC0500n, interfaceC0506u);
        C0488b.a((List) hashMap.get(EnumC0500n.ON_ANY), interfaceC0507v, enumC0500n, interfaceC0506u);
    }
}
