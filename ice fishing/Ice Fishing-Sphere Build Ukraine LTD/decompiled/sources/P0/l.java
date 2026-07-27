package P0;

import Q0.AbstractC0068a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final A.j f850a = new A.j(11, "NULL");

    public static /* synthetic */ O0.d a(j jVar, M0.c cVar, int i2, int i3, int i4) {
        v0.i iVar = cVar;
        if ((i4 & 1) != 0) {
            iVar = v0.j.f3014e;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return jVar.h(iVar, i2, i3);
    }

    public static final Object b(v0.i iVar, Object obj, Object obj2, D0.p pVar, v0.d dVar) {
        Object n2 = AbstractC0068a.n(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            E0.s.a(2, pVar);
            Object f2 = pVar.f(obj, sVar);
            AbstractC0068a.h(iVar, n2);
            if (f2 == w0.a.f3076e) {
                E0.i.e(dVar, "frame");
            }
            return f2;
        } catch (Throwable th) {
            AbstractC0068a.h(iVar, n2);
            throw th;
        }
    }
}
