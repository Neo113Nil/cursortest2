package W7;

import E2.C0316m;
import z7.InterfaceC5240d;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0316m f3610a = new C0316m("NULL", 1);

    public static final Object a(InterfaceC5245i interfaceC5245i, Object obj, Object obj2, I7.p pVar, InterfaceC5240d frame) {
        Object invoke;
        Object m9 = X7.a.m(interfaceC5245i, obj2);
        try {
            v vVar = new v(frame, interfaceC5245i);
            if (pVar instanceof B7.a) {
                kotlin.jvm.internal.u.b(2, pVar);
                invoke = pVar.invoke(obj, vVar);
            } else {
                invoke = A8.b.x(pVar, obj, vVar);
            }
            X7.a.g(interfaceC5245i, m9);
            if (invoke == A7.a.f215n) {
                kotlin.jvm.internal.h.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            X7.a.g(interfaceC5245i, m9);
            throw th;
        }
    }
}
