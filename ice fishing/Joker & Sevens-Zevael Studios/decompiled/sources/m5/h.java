package m5;

import java.util.List;
import m0.r;
import m0.u1;
import m0.v1;
import m0.x1;
import m0.x2;
import m0.z;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f4895a = new x2(e.f4886h);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4896b = 36;

    public static final void a(List list, d dVar, String str, r rVar, int i10) {
        u0.d dVar2 = hd.b.f2879a;
        rVar.Z(-209920213);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Navigator must have at least one screen");
        }
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Navigator key can't be empty");
        }
        v1 a6 = n5.g.f5070a.a(v0.k.c(rVar));
        a6.f4789f = false;
        z.a(a6, u0.e.b(rVar, -1982643221, new g(list, str, dVar)), rVar, 56);
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new g(list, dVar, str, i10);
        }
    }

    public static final void b(k5.a aVar, r rVar, int i10) {
        u0.d dVar = hd.b.f2879a;
        rVar.Z(644293085);
        d dVar2 = new d();
        rVar.Y(-470755924);
        int hashCode = Long.hashCode(rVar.T);
        int i11 = f4896b;
        u2.b.i(i11);
        String num = Integer.toString(hashCode, i11);
        pc.j.d(num, "toString(...)");
        rVar.q(false);
        a(i7.b.z(aVar), dVar2, num, rVar, 24584);
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a1.g(aVar, dVar2, num, i10);
        }
    }

    public static final Object c(u1 u1Var, r rVar) {
        pc.j.e(u1Var, "<this>");
        rVar.Y(864469981);
        Object j3 = rVar.j(u1Var);
        if (j3 == null) {
            throw new IllegalStateException("CompositionLocal is null");
        }
        rVar.q(false);
        return j3;
    }
}
