package W7;

import z7.InterfaceC5267d;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final D2.b f3448a = new D2.b("NULL", 1);

    public static final Object a(InterfaceC5272i interfaceC5272i, Object obj, Object obj2, I7.p pVar, InterfaceC5267d frame) {
        Object invoke;
        Object m4 = X7.a.m(interfaceC5272i, obj2);
        try {
            v vVar = new v(frame, interfaceC5272i);
            if (pVar instanceof B7.a) {
                kotlin.jvm.internal.u.b(2, pVar);
                invoke = pVar.invoke(obj, vVar);
            } else {
                invoke = A8.b.u(pVar, obj, vVar);
            }
            X7.a.g(interfaceC5272i, m4);
            if (invoke == A7.a.f58n) {
                kotlin.jvm.internal.h.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            X7.a.g(interfaceC5272i, m4);
            throw th;
        }
    }
}
