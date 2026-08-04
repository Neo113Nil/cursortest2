package com.gamericefishpro.space.h0;

import android.view.View;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d0.n1;
import com.gamericefishpro.space.t0.o1;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.t2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final a a = new a(1);

    public static final void a(final Function0 function0, final com.gamericefishpro.space.h1.m mVar, final m0 m0Var, final com.gamericefishpro.space.f0.o oVar, com.gamericefishpro.space.t0.r rVar, final int i) {
        rVar.b0(1055276397);
        int i2 = (rVar.h(function0) ? 4 : 2) | i | (rVar.f(mVar) ? 32 : 16) | (rVar.f(m0Var) ? 256 : 128) | (rVar.f(oVar) ? 2048 : 1024);
        if (rVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            final com.gamericefishpro.space.t0.v0 v0VarZ = com.gamericefishpro.space.t0.i.z(function0, rVar);
            c(com.gamericefishpro.space.b1.n.c(-933153643, new com.gamericefishpro.space.di.c() { // from class: com.gamericefishpro.space.h0.a0
                @Override // com.gamericefishpro.space.di.c
                public final Object a(Object obj, Object obj2, Object obj3) {
                    com.gamericefishpro.space.h1.m mVarC;
                    com.gamericefishpro.space.e1.c cVar = (com.gamericefishpro.space.e1.c) obj;
                    com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj2;
                    ((Integer) obj3).getClass();
                    Object objP = rVar2.P();
                    com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
                    if (objP == fVar) {
                        objP = new y(cVar, new com.gamericefishpro.space.f0.k(v0VarZ, 2));
                        rVar2.k0(objP);
                    }
                    final y yVar = (y) objP;
                    Object objP2 = rVar2.P();
                    if (objP2 == fVar) {
                        com.gamericefishpro.space.u6.l lVar = new com.gamericefishpro.space.u6.l();
                        lVar.d = yVar;
                        com.gamericefishpro.space.t.c0 c0Var = com.gamericefishpro.space.t.m0.a;
                        lVar.e = new com.gamericefishpro.space.t.c0();
                        objP2 = new com.gamericefishpro.space.f2.g1(lVar);
                        rVar2.k0(objP2);
                    }
                    final com.gamericefishpro.space.f2.g1 g1Var = (com.gamericefishpro.space.f2.g1) objP2;
                    final m0 m0Var2 = m0Var;
                    if (m0Var2 != null) {
                        rVar2.a0(1743490539);
                        rVar2.a0(887527095);
                        final a1 a1Var = c1.a;
                        if (a1Var != null) {
                            rVar2.a0(1345554384);
                            rVar2.p(false);
                        } else {
                            rVar2.a0(1345603457);
                            View view = (View) rVar2.j(com.gamericefishpro.space.i2.j0.f);
                            boolean zF = rVar2.f(view);
                            Object objP3 = rVar2.P();
                            if (zF || objP3 == fVar) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objP3 = tag instanceof a1 ? (a1) tag : null;
                                if (objP3 == null) {
                                    objP3 = new c(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objP3);
                                }
                                rVar2.k0(objP3);
                            }
                            a1Var = (a1) objP3;
                            rVar2.p(false);
                        }
                        rVar2.p(false);
                        Object[] objArr = {m0Var2, yVar, g1Var, a1Var};
                        boolean zF2 = rVar2.f(m0Var2) | rVar2.h(yVar) | rVar2.h(g1Var) | rVar2.h(a1Var);
                        Object objP4 = rVar2.P();
                        if (zF2 || objP4 == fVar) {
                            objP4 = new Function1() { // from class: com.gamericefishpro.space.h0.c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    z0 z0Var = new z0(yVar, g1Var, a1Var);
                                    m0 m0Var3 = m0Var2;
                                    m0Var3.c = z0Var;
                                    return new com.gamericefishpro.space.e.c(3, m0Var3);
                                }
                            };
                            rVar2.k0(objP4);
                        }
                        Function1 function1 = (Function1) objP4;
                        boolean zF3 = false;
                        for (Object obj4 : Arrays.copyOf(objArr, 4)) {
                            zF3 |= rVar2.f(obj4);
                        }
                        Object objP5 = rVar2.P();
                        if (zF3 || objP5 == fVar) {
                            rVar2.k0(new com.gamericefishpro.space.t0.e0(function1));
                        }
                    } else {
                        rVar2.a0(1737291469);
                    }
                    rVar2.p(false);
                    int i3 = n0.a;
                    com.gamericefishpro.space.h1.m mVar2 = mVar;
                    if (m0Var2 != null && (mVarC = mVar2.c(new f1(m0Var2))) != null) {
                        mVar2 = mVarC;
                    }
                    boolean zF4 = rVar2.f(yVar);
                    com.gamericefishpro.space.f0.o oVar2 = oVar;
                    boolean zF5 = zF4 | rVar2.f(oVar2);
                    Object objP6 = rVar2.P();
                    if (zF5 || objP6 == fVar) {
                        objP6 = new com.gamericefishpro.space.d0.w(6, yVar, oVar2);
                        rVar2.k0(objP6);
                    }
                    com.gamericefishpro.space.f2.x.a(g1Var, mVar2, (Function2) objP6, rVar2, 8);
                    return Unit.a;
                }
            }, rVar), rVar, 6);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2(mVar, m0Var, oVar, i) { // from class: com.gamericefishpro.space.h0.b0
                public final /* synthetic */ com.gamericefishpro.space.h1.m e;
                public final /* synthetic */ m0 i;
                public final /* synthetic */ com.gamericefishpro.space.f0.o v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iD = com.gamericefishpro.space.t0.i.D(1);
                    n.a(this.d, this.e, this.i, this.v, (com.gamericefishpro.space.t0.r) obj, iD);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Object obj, final int i, final j0 j0Var, final com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, final int i2) {
        int i3;
        rVar.b0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (rVar.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rVar.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= rVar.h(j0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= rVar.h(hVar) ? 2048 : 1024;
        }
        if (rVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zF = rVar.f(obj) | rVar.f(j0Var);
            Object objP = rVar.P();
            Object obj2 = com.gamericefishpro.space.t0.n.a;
            if (zF || objP == obj2) {
                objP = new h0(obj, j0Var);
                rVar.k0(objP);
            }
            h0 h0Var = (h0) objP;
            h0Var.c = i;
            com.gamericefishpro.space.t0.f1 f1Var = h0Var.g;
            o1 o1Var = com.gamericefishpro.space.f2.s0.a;
            h0 h0Var2 = (h0) rVar.j(o1Var);
            com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
            Function1 function1E = gVarE != null ? gVarE.e() : null;
            com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
            try {
                if (h0Var2 != ((h0) f1Var.getValue())) {
                    f1Var.setValue(h0Var2);
                    if (h0Var.d > 0) {
                        h0 h0Var3 = h0Var.e;
                        if (h0Var3 != null) {
                            h0Var3.b();
                        }
                        if (h0Var2 != null) {
                            h0Var2.a();
                        } else {
                            h0Var2 = null;
                        }
                        h0Var.e = h0Var2;
                    }
                }
                Unit unit = Unit.a;
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                boolean zF2 = rVar.f(h0Var);
                Object objP2 = rVar.P();
                if (zF2 || objP2 == obj2) {
                    objP2 = new com.gamericefishpro.space.a7.c(10, h0Var);
                    rVar.k0(objP2);
                }
                com.gamericefishpro.space.t0.i.d(h0Var, (Function1) objP2, rVar);
                com.gamericefishpro.space.t0.i.a(o1Var.a(h0Var), hVar, rVar, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                throw th;
            }
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new Function2() { // from class: com.gamericefishpro.space.h0.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    n.b(obj, i, j0Var, hVar, (com.gamericefishpro.space.t0.r) obj3, com.gamericefishpro.space.t0.i.D(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(com.gamericefishpro.space.b1.h hVar, com.gamericefishpro.space.t0.r rVar, int i) {
        rVar.b0(-709502251);
        if (rVar.S(i & 1, (i & 3) != 2)) {
            t2 t2Var = com.gamericefishpro.space.e1.h.a;
            com.gamericefishpro.space.e1.f fVar = (com.gamericefishpro.space.e1.f) rVar.j(t2Var);
            com.gamericefishpro.space.e1.d dVarD = com.gamericefishpro.space.e1.k.d(rVar);
            Object[] objArr = {fVar};
            com.gamericefishpro.space.u6.c cVar = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.g7.a(2), new com.gamericefishpro.space.d0.q0(16, fVar, dVarD));
            boolean zH = rVar.h(fVar) | rVar.h(dVarD);
            Object objP = rVar.P();
            if (zH || objP == com.gamericefishpro.space.t0.n.a) {
                objP = new com.gamericefishpro.space.e.e(5, fVar, dVarD);
                rVar.k0(objP);
            }
            v0 v0Var = (v0) com.gamericefishpro.space.e1.k.b(objArr, cVar, (Function0) objP, rVar, 0);
            com.gamericefishpro.space.t0.i.a(t2Var.a(v0Var), com.gamericefishpro.space.b1.n.c(-412824043, new com.gamericefishpro.space.d0.w(hVar, v0Var, 7), rVar), rVar, 56);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new n1(i, 4, hVar);
        }
    }

    public static final void d(z zVar, Object obj, int i, Object obj2, com.gamericefishpro.space.t0.r rVar, int i2) {
        rVar.b0(1439843069);
        int i3 = (rVar.f(zVar) ? 4 : 2) | i2 | (rVar.f(obj) ? 32 : 16) | (rVar.d(i) ? 256 : 128) | (rVar.f(obj2) ? 2048 : 1024);
        if (rVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            ((com.gamericefishpro.space.e1.c) obj).a(obj2, com.gamericefishpro.space.b1.n.c(980966366, new com.gamericefishpro.space.b1.f(i, zVar, obj2), rVar), rVar, 48);
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.c(zVar, obj, i, obj2, i2);
        }
    }

    public static final int e(int i, com.gamericefishpro.space.v0.e eVar) {
        int i2 = eVar.i - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = eVar.d;
            int i5 = ((j) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((j) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final List f(f0 f0Var, int i, int i2, ArrayList arrayList, com.gamericefishpro.space.t.v vVar, int i3, int i4, int i5, Function1 function1) {
        int i6;
        com.gamericefishpro.space.t.v vVar2;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        if (f0Var == null || arrayList.isEmpty() || (i6 = vVar.b) == 0) {
            return com.gamericefishpro.space.ph.g0.d;
        }
        int i9 = -1;
        if (i2 - i < 0 || i6 == 0) {
            vVar2 = com.gamericefishpro.space.t.k.a;
        } else {
            IntRange intRangeF = com.gamericefishpro.space.ji.f.f(0, i6);
            int i10 = intRangeF.d;
            int i11 = intRangeF.e;
            int iB = -1;
            if (i10 <= i11) {
                while (vVar.b(i10) <= i) {
                    iB = vVar.b(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
            }
            if (iB == -1) {
                vVar2 = com.gamericefishpro.space.t.k.a;
            } else {
                com.gamericefishpro.space.t.v vVar3 = com.gamericefishpro.space.t.k.a;
                vVar2 = new com.gamericefishpro.space.t.v(1);
                vVar2.a(iB);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj2 = arrayList.get(i12);
            int index = ((e0) obj2).getIndex();
            int[] iArr = vVar.a;
            int i13 = vVar.b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = vVar2.a;
        int i15 = vVar2.b;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            int size2 = arrayList.size();
            int i18 = 0;
            int i19 = 0;
            while (true) {
                if (i19 >= size2) {
                    i18 = i9;
                    break;
                }
                Object obj3 = arrayList.get(i19);
                i19++;
                if (((e0) obj3).getIndex() == i17) {
                    break;
                }
                i18++;
            }
            e0 e0Var = i18 == i9 ? (e0) function1.invoke(Integer.valueOf(i17)) : (e0) arrayList.remove(i18);
            int iE = e0Var.e();
            if (i18 == i9) {
                j = 4294967295L;
                i7 = Integer.MIN_VALUE;
            } else {
                long jF = e0Var.f(0);
                if (e0Var.a()) {
                    j = 4294967295L;
                    j2 = jF & 4294967295L;
                } else {
                    j = 4294967295L;
                    j2 = jF >> 32;
                }
                i7 = (int) j2;
            }
            int size3 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((e0) obj).getIndex() != i17) {
                    break;
                }
                i20++;
            }
            e0 e0Var2 = (e0) obj;
            if (e0Var2 != null) {
                long jF2 = e0Var2.f(0);
                i8 = (int) (e0Var2.a() ? jF2 & j : jF2 >> 32);
            } else {
                i8 = Integer.MIN_VALUE;
            }
            int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
            if (i8 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i8 - iE);
            }
            e0Var.c();
            e0Var.d(iMax, i4, i5);
            arrayList2.add(e0Var);
            i16++;
            i9 = -1;
        }
        return arrayList2;
    }

    public static final List g(z zVar, j0 j0Var, l lVar) {
        IntRange intRange;
        com.gamericefishpro.space.v0.e eVar = lVar.a;
        if (!(eVar.i != 0) && j0Var.d.isEmpty()) {
            return com.gamericefishpro.space.ph.g0.d;
        }
        ArrayList arrayList = new ArrayList();
        if (lVar.a.i != 0) {
            int i = eVar.i;
            if (i == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar.d;
            int i2 = ((k) objArr[0]).a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((k) objArr[i3]).a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                com.gamericefishpro.space.c0.a.a("negative minIndex");
            }
            int i5 = eVar.i;
            if (i5 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar.d;
            int i6 = ((k) objArr2[0]).b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((k) objArr2[i7]).b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            intRange = new IntRange(i2, Math.min(i6, zVar.a() - 1), 1);
        } else {
            IntRange.w.getClass();
            intRange = IntRange.y;
        }
        int size = j0Var.d.size();
        for (int i9 = 0; i9 < size; i9++) {
            h0 h0Var = (h0) j0Var.get(i9);
            int i10 = i(h0Var.c, zVar, h0Var.a);
            int i11 = intRange.d;
            if ((i10 > intRange.e || i11 > i10) && i10 >= 0 && i10 < zVar.a()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        int i12 = intRange.d;
        int i13 = intRange.e;
        if (i12 <= i13) {
            while (true) {
                arrayList.add(Integer.valueOf(i12));
                if (i12 == i13) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public static com.gamericefishpro.space.t0.v0 h() {
        return new com.gamericefishpro.space.t0.f1(Unit.a, com.gamericefishpro.space.t0.f.v);
    }

    public static final int i(int i, z zVar, Object obj) {
        int iD;
        return (obj == null || zVar.a() == 0 || (i < zVar.a() && obj.equals(zVar.b(i))) || (iD = zVar.d(obj)) == -1) ? i : iD;
    }

    public static final com.gamericefishpro.space.h1.m m(r rVar, l lVar, com.gamericefishpro.space.z.v0 v0Var) {
        return new m(rVar, lVar, v0Var);
    }

    public static final com.gamericefishpro.space.h1.m n(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.ei.q qVar, p0 p0Var, com.gamericefishpro.space.z.v0 v0Var, boolean z) {
        return mVar.c(new q0(qVar, p0Var, v0Var, z));
    }

    public static final List o(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return com.gamericefishpro.space.ph.g0.d;
        }
        ArrayList arrayListM = CollectionsKt.M(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            e0 e0Var = (e0) arrayList.get(i3);
            int index = e0Var.getIndex();
            if (i <= index && index <= i2) {
                arrayListM.add(e0Var);
            }
        }
        com.gamericefishpro.space.ph.b0.k(arrayListM, a);
        return arrayListM;
    }

    public Object j(int i) {
        j jVarD = k().d(i);
        return jVarD.c.a().invoke(Integer.valueOf(i - jVarD.a));
    }

    public abstract com.gamericefishpro.space.f1.z k();

    public Object l(int i) {
        Object objInvoke;
        j jVarD = k().d(i);
        int i2 = i - jVarD.a;
        Function1 key = jVarD.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new h(i) : objInvoke;
    }
}
