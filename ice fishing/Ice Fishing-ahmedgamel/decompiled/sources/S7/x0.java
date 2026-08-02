package S7;

import z7.InterfaceC5243g;
import z7.InterfaceC5244h;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public final class x0 implements InterfaceC5243g, InterfaceC5244h {

    /* renamed from: n, reason: collision with root package name */
    public static final x0 f3089n = new x0();

    @Override // z7.InterfaceC5245i
    public final InterfaceC5245i i(InterfaceC5244h interfaceC5244h) {
        return A8.b.q(this, interfaceC5244h);
    }

    @Override // z7.InterfaceC5245i
    public final Object l(Object obj, I7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5243g m(InterfaceC5244h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(this, key)) {
            return this;
        }
        return null;
    }

    @Override // z7.InterfaceC5245i
    public final InterfaceC5245i n(InterfaceC5245i interfaceC5245i) {
        return A8.b.t(this, interfaceC5245i);
    }

    @Override // z7.InterfaceC5243g
    public final InterfaceC5244h getKey() {
        return this;
    }
}
