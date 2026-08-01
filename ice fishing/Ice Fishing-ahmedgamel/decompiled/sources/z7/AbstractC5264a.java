package z7;

import I7.p;

/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5264a implements InterfaceC5270g {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5271h f42267n;

    public AbstractC5264a(InterfaceC5271h interfaceC5271h) {
        this.f42267n = interfaceC5271h;
    }

    @Override // z7.InterfaceC5270g
    public final InterfaceC5271h getKey() {
        return this.f42267n;
    }

    @Override // z7.InterfaceC5272i
    public /* bridge */ InterfaceC5272i i(InterfaceC5271h interfaceC5271h) {
        return A8.b.q(this, interfaceC5271h);
    }

    @Override // z7.InterfaceC5272i
    public final Object l(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // z7.InterfaceC5272i
    public InterfaceC5270g m(InterfaceC5271h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // z7.InterfaceC5272i
    public final /* bridge */ InterfaceC5272i n(InterfaceC5272i interfaceC5272i) {
        return A8.b.r(this, interfaceC5272i);
    }
}
