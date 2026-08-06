package E1;

import m1.EnumC0985a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C.j f331a = new C.j(5, "NULL");

    public static /* synthetic */ D1.d a(j jVar, B1.c cVar, int i2, int i3, int i4) {
        l1.i iVar = cVar;
        if ((i4 & 1) != 0) {
            iVar = l1.j.f8138a;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return jVar.o(iVar, i2, i3);
    }

    public static final Object b(l1.i iVar, Object obj, Object obj2, t1.p pVar, l1.d frame) {
        Object m2 = F1.a.m(iVar, obj2);
        try {
            s sVar = new s(frame, iVar);
            kotlin.jvm.internal.s.a(2, pVar);
            Object invoke = pVar.invoke(obj, sVar);
            F1.a.g(iVar, m2);
            if (invoke == EnumC0985a.f8194a) {
                kotlin.jvm.internal.i.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            F1.a.g(iVar, m2);
            throw th;
        }
    }
}
