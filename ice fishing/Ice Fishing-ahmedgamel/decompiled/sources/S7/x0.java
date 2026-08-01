package S7;

import z7.InterfaceC5270g;
import z7.InterfaceC5271h;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public final class x0 implements InterfaceC5270g, InterfaceC5271h {

    /* renamed from: n, reason: collision with root package name */
    public static final x0 f3006n = new x0();

    @Override // z7.InterfaceC5272i
    public final InterfaceC5272i i(InterfaceC5271h interfaceC5271h) {
        return A8.b.q(this, interfaceC5271h);
    }

    @Override // z7.InterfaceC5272i
    public final Object l(Object obj, I7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5270g m(InterfaceC5271h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(this, key)) {
            return this;
        }
        return null;
    }

    @Override // z7.InterfaceC5272i
    public final InterfaceC5272i n(InterfaceC5272i interfaceC5272i) {
        return A8.b.r(this, interfaceC5272i);
    }

    @Override // z7.InterfaceC5270g
    public final InterfaceC5271h getKey() {
        return this;
    }
}
