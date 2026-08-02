package z7;

import I7.p;

/* renamed from: z7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5237a implements InterfaceC5243g {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5244h f42236n;

    public AbstractC5237a(InterfaceC5244h interfaceC5244h) {
        this.f42236n = interfaceC5244h;
    }

    @Override // z7.InterfaceC5243g
    public final InterfaceC5244h getKey() {
        return this.f42236n;
    }

    @Override // z7.InterfaceC5245i
    public /* bridge */ InterfaceC5245i i(InterfaceC5244h interfaceC5244h) {
        return A8.b.q(this, interfaceC5244h);
    }

    @Override // z7.InterfaceC5245i
    public final Object l(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // z7.InterfaceC5245i
    public InterfaceC5243g m(InterfaceC5244h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // z7.InterfaceC5245i
    public final /* bridge */ InterfaceC5245i n(InterfaceC5245i interfaceC5245i) {
        return A8.b.t(this, interfaceC5245i);
    }
}
