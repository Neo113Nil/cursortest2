package v7;

import E7.p;

/* renamed from: v7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5130a implements InterfaceC5136g {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC5137h f41367n;

    public AbstractC5130a(InterfaceC5137h interfaceC5137h) {
        this.f41367n = interfaceC5137h;
    }

    @Override // v7.InterfaceC5138i
    public /* bridge */ InterfaceC5138i g(InterfaceC5137h interfaceC5137h) {
        return com.bumptech.glide.e.s(this, interfaceC5137h);
    }

    @Override // v7.InterfaceC5136g
    public final InterfaceC5137h getKey() {
        return this.f41367n;
    }

    @Override // v7.InterfaceC5138i
    public InterfaceC5136g i(InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // v7.InterfaceC5138i
    public final Object m(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // v7.InterfaceC5138i
    public final /* bridge */ InterfaceC5138i n(InterfaceC5138i interfaceC5138i) {
        return com.bumptech.glide.e.w(this, interfaceC5138i);
    }
}
