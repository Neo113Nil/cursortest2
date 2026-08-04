package com.gamericefishpro.space.f0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d0.q0;
import com.gamericefishpro.space.d0.u0;
import com.gamericefishpro.space.d0.w0;
import com.gamericefishpro.space.f2.h1;
import com.gamericefishpro.space.f2.m0;
import com.gamericefishpro.space.h0.d0;
import com.gamericefishpro.space.h0.f0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.z.k1;
import com.gamericefishpro.space.z.v0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ com.gamericefishpro.space.d0.g c;
    public final /* synthetic */ com.gamericefishpro.space.pi.x d;
    public final /* synthetic */ f0 e;
    public final /* synthetic */ k1 f;
    public final /* synthetic */ u0 g;
    public final /* synthetic */ Object h;

    public o(w wVar, w0 w0Var, com.gamericefishpro.space.ei.q qVar, com.gamericefishpro.space.d0.g gVar, com.gamericefishpro.space.pi.x xVar, com.gamericefishpro.space.o1.v vVar, f0 f0Var, com.gamericefishpro.space.h1.c cVar) {
        this.f = wVar;
        this.g = w0Var;
        this.b = qVar;
        this.c = gVar;
        this.d = xVar;
        this.e = f0Var;
        this.h = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:240:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:254:0x0650  */
    /* JADX WARN: Code duplicated, block: B:263:0x0673  */
    private final m0 b(d0 d0Var, long j) throws Throwable {
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List arrayList;
        int i7;
        float f;
        List arrayList2;
        d0 d0Var2;
        boolean z;
        int i8;
        Integer numValueOf;
        Integer numValueOf2;
        h1 h1Var;
        q qVar;
        int i9;
        boolean zA = com.gamericefishpro.space.c3.k.a(0L, 0L);
        h1 h1Var2 = d0Var.e;
        w0 w0Var = (w0) this.g;
        k1 k1Var = this.f;
        w wVar = (w) k1Var;
        wVar.s.getValue();
        boolean z2 = wVar.b || h1Var2.n();
        v0 v0Var = v0.d;
        com.gamericefishpro.space.y.q.h(j, v0Var);
        int iJ = h1Var2.J(w0Var.d(h1Var2.getLayoutDirection()));
        int iJ2 = h1Var2.J(w0Var.c(h1Var2.getLayoutDirection()));
        int iJ3 = h1Var2.J(w0Var.b);
        int iJ4 = h1Var2.J(w0Var.d) + iJ3;
        int i10 = iJ2 + iJ;
        int i11 = iJ4 - iJ3;
        long jH = com.gamericefishpro.space.c3.b.h(-i10, -iJ4, j);
        j jVar = (j) this.b.invoke();
        c cVar = jVar.c;
        int iH = com.gamericefishpro.space.c3.a.h(jH);
        int iG = com.gamericefishpro.space.c3.a.g(jH);
        cVar.a.h(iH);
        cVar.b.h(iG);
        com.gamericefishpro.space.d0.g gVar = this.c;
        if (gVar == null) {
            com.gamericefishpro.space.c0.a.b("null verticalArrangement when isVertical == true");
            throw new com.gamericefishpro.space.oh.e();
        }
        int iJ5 = h1Var2.J(gVar.a());
        int i12 = jVar.b.k().a;
        int iG2 = com.gamericefishpro.space.c3.a.g(j) - iJ4;
        w wVar2 = (w) k1Var;
        int i13 = i12;
        n nVar = new n(jH, jVar, d0Var, i13, iJ5, (com.gamericefishpro.space.h1.c) this.h, iJ3, i11, (((long) iJ) << 32) | (((long) iJ3) & 4294967295L), wVar2);
        com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
        Function1 function1E = gVarE != null ? gVarE.e() : null;
        com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
        try {
            s sVar = wVar.e;
            int iG3 = sVar.b.g();
            int i14 = com.gamericefishpro.space.h0.n.i(iG3, jVar, sVar.e);
            if (iG3 != i14) {
                sVar.b.h(i14);
                sVar.f.b(iG3);
            }
            int iG4 = sVar.c.g();
            Unit unit = Unit.a;
            com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            List listG = com.gamericefishpro.space.h0.n.g(jVar, wVar.r, wVar.o);
            float fFloatValue = (h1Var2.n() || !z2) ? wVar.h : ((Number) ((com.gamericefishpro.space.w.j) wVar.w.i).e.getValue()).floatValue();
            com.gamericefishpro.space.h0.w wVar3 = wVar.n;
            boolean zN = h1Var2.n();
            com.gamericefishpro.space.t0.v0 v0Var2 = wVar.v;
            if (iJ3 < 0) {
                com.gamericefishpro.space.c0.a.a("invalid beforeContentPadding");
            }
            if (r11 < 0) {
                com.gamericefishpro.space.c0.a.a("invalid afterContentPadding");
            }
            j jVar2 = nVar.e;
            com.gamericefishpro.space.pi.x xVar = this.d;
            if (i13 <= 0) {
                int iJ6 = com.gamericefishpro.space.c3.a.j(jH);
                int i15 = com.gamericefishpro.space.c3.a.i(jH);
                wVar3.c(iJ6, i15, new ArrayList(), jVar2.d, nVar, zN, 1, z2, 0, 0);
                if (!zN) {
                    wVar3.b();
                    if (!zA) {
                        iJ6 = com.gamericefishpro.space.c3.b.f((int) 0, jH);
                        i15 = com.gamericefishpro.space.c3.b.e((int) 0, jH);
                    }
                }
                h1Var = h1Var2;
                qVar = new q(null, 0, false, 0.0f, h1Var2.y(com.gamericefishpro.space.c3.b.f(iJ6 + i10, j), com.gamericefishpro.space.c3.b.e(i15 + iJ4, j), com.gamericefishpro.space.ph.m0.c(), new com.gamericefishpro.space.d0.p(21)), 0.0f, false, xVar, d0Var, nVar.v, g0.d, -iJ3, iG2 + r11, 0, v0Var, i11, iJ5);
            } else {
                if (i14 >= i13) {
                    i14 = i13 - 1;
                    iG4 = 0;
                }
                int iRound = Math.round(fFloatValue);
                int i16 = iG4 - iRound;
                if (i14 == 0 && i16 < 0) {
                    iRound += i16;
                    i16 = 0;
                }
                com.gamericefishpro.space.ph.r rVar = new com.gamericefishpro.space.ph.r();
                int i17 = -iJ3;
                int i18 = i17 + (iJ5 < 0 ? iJ5 : 0);
                int i19 = i16 + i18;
                float f2 = fFloatValue;
                int iMax = 0;
                while (true) {
                    j2 = nVar.v;
                    if (i19 >= 0 || i14 <= 0) {
                        break;
                    }
                    i14--;
                    r rVarS = nVar.s(i14, j2);
                    rVar.add(0, rVarS);
                    iMax = Math.max(iMax, rVarS.m);
                    i19 += rVarS.l;
                }
                if (i19 < i18) {
                    i = iRound - (i18 - i19);
                    i19 = i18;
                } else {
                    i = iRound;
                }
                int i20 = i19 - i18;
                int i21 = iG2 + r11;
                int i22 = i14;
                int i23 = i21 < 0 ? 0 : i21;
                int i24 = i20;
                int i25 = -i20;
                int i26 = i22;
                int i27 = 0;
                boolean z3 = false;
                while (i27 < rVar.i) {
                    if (i25 >= i23) {
                        rVar.c(i27);
                        Unit unit2 = Unit.a;
                        z3 = true;
                    } else {
                        i26++;
                        i25 += ((r) rVar.get(i27)).l;
                        i27++;
                    }
                }
                int i28 = i25;
                int iMax2 = iMax;
                boolean z4 = z3;
                int i29 = i26;
                while (i29 < i13 && (i28 < i23 || i28 <= 0 || rVar.isEmpty())) {
                    int i30 = i23;
                    r rVarS2 = nVar.s(i29, j2);
                    int i31 = i13;
                    int i32 = rVarS2.l;
                    i28 += i32;
                    if (i28 <= i18) {
                        i9 = i18;
                        if (i29 != i31 - 1) {
                            i24 -= i32;
                            Unit unit3 = Unit.a;
                            i22 = i29 + 1;
                            z4 = true;
                        }
                        i29++;
                        i23 = i30;
                        i18 = i9;
                        i13 = i31;
                    } else {
                        i9 = i18;
                    }
                    int iMax3 = Math.max(iMax2, rVarS2.m);
                    rVar.addLast(rVarS2);
                    iMax2 = iMax3;
                    i29++;
                    i23 = i30;
                    i18 = i9;
                    i13 = i31;
                }
                int i33 = i13;
                if (i28 < iG2) {
                    int i34 = iG2 - i28;
                    i28 += i34;
                    int i35 = i24 - i34;
                    while (i35 < iJ3 && i22 > 0) {
                        int i36 = i22 - 1;
                        int i37 = i34;
                        r rVarS3 = nVar.s(i36, j2);
                        rVar.add(0, rVarS3);
                        iMax2 = Math.max(iMax2, rVarS3.m);
                        i35 += rVarS3.l;
                        i22 = i36;
                        i34 = i37;
                    }
                    int i38 = i35;
                    i2 = i + i34;
                    if (i38 < 0) {
                        i2 += i38;
                        i28 += i38;
                        i3 = i22;
                        i4 = 0;
                    } else {
                        i3 = i22;
                        i4 = i38;
                    }
                } else {
                    i2 = i;
                    i3 = i22;
                    i4 = i24;
                }
                int i39 = iMax2;
                float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i2) || Math.abs(Math.round(f2)) < Math.abs(i2)) ? f2 : i2;
                float f4 = f2 - f3;
                float f5 = 0.0f;
                if (zN && i2 > i && f4 <= 0.0f) {
                    f5 = (i2 - i) + f4;
                }
                float f6 = f5;
                if (i4 < 0) {
                    com.gamericefishpro.space.c0.a.a("negative currentFirstItemScrollOffset");
                }
                int i40 = -i4;
                r rVar2 = (r) rVar.first();
                if (iJ3 > 0 || iJ5 < 0) {
                    int iB = rVar.b();
                    r rVar3 = rVar2;
                    int i41 = 0;
                    while (i41 < iB) {
                        int i42 = iB;
                        int i43 = ((r) rVar.get(i41)).l;
                        if (i4 == 0 || i43 > i4 || i41 == com.gamericefishpro.space.ph.x.e(rVar)) {
                            break;
                        }
                        i4 -= i43;
                        i41++;
                        rVar3 = (r) rVar.get(i41);
                        iB = i42;
                    }
                    rVar2 = rVar3;
                    i5 = 0;
                } else {
                    i5 = 0;
                }
                int iMax4 = Math.max(i5, i3);
                int i44 = i3 - 1;
                if (iMax4 <= i44) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        i6 = i4;
                        arrayList.add(nVar.s(i44, j2));
                        if (i44 == iMax4) {
                            break;
                        }
                        i44--;
                        i4 = i6;
                    }
                } else {
                    i6 = i4;
                    arrayList = null;
                }
                int size = listG.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i45 = size - 1;
                        int iIntValue = ((Number) listG.get(size)).intValue();
                        if (iIntValue < iMax4) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nVar.s(iIntValue, j2));
                        }
                        if (i45 < 0) {
                            break;
                        }
                        size = i45;
                    }
                }
                if (arrayList == null) {
                    arrayList = g0.d;
                }
                int iMax5 = i39;
                int i46 = 0;
                for (int size2 = arrayList.size(); i46 < size2; size2 = size2) {
                    iMax5 = Math.max(iMax5, ((r) arrayList.get(i46)).m);
                    i46++;
                }
                int iMin = Math.min(((r) CollectionsKt.B(rVar)).a, i33 - 1);
                int i47 = ((r) CollectionsKt.B(rVar)).a + 1;
                if (i47 <= iMin) {
                    List arrayList3 = null;
                    while (true) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        i7 = iMax5;
                        f = f3;
                        arrayList2 = arrayList3;
                        arrayList2.add(nVar.s(i47, j2));
                        if (i47 == iMin) {
                            break;
                        }
                        i47++;
                        arrayList3 = arrayList2;
                        iMax5 = i7;
                        f3 = f;
                    }
                } else {
                    i7 = iMax5;
                    f = f3;
                    arrayList2 = null;
                }
                if (arrayList2 != null && ((r) CollectionsKt.B(arrayList2)).a > iMin) {
                    iMin = ((r) CollectionsKt.B(arrayList2)).a;
                }
                int size3 = listG.size();
                int i48 = 0;
                while (i48 < size3) {
                    List list = listG;
                    int iIntValue2 = ((Number) listG.get(i48)).intValue();
                    if (iIntValue2 > iMin) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(nVar.s(iIntValue2, j2));
                    }
                    i48++;
                    listG = list;
                }
                if (arrayList2 == null) {
                    arrayList2 = g0.d;
                }
                int size4 = arrayList2.size();
                int iMax6 = i7;
                for (int i49 = 0; i49 < size4; i49++) {
                    iMax6 = Math.max(iMax6, ((r) arrayList2.get(i49)).m);
                }
                boolean z5 = Intrinsics.a(rVar2, rVar.first()) && arrayList.isEmpty() && arrayList2.isEmpty();
                int iF = com.gamericefishpro.space.c3.b.f(iMax6, jH);
                int iE = com.gamericefishpro.space.c3.b.e(i28, jH);
                boolean z6 = i28 < Math.min(iE, iG2);
                if (z6 && i40 != 0) {
                    com.gamericefishpro.space.c0.a.c("non-zero itemsScrollOffset");
                }
                ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size() + rVar.b());
                if (z6) {
                    if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                        com.gamericefishpro.space.c0.a.a("no extra items");
                    }
                    int iB2 = rVar.b();
                    int[] iArr = new int[iB2];
                    for (int i50 = 0; i50 < iB2; i50++) {
                        iArr[i50] = ((r) rVar.get(i50)).k;
                    }
                    int[] iArr2 = new int[iB2];
                    if (gVar == null) {
                        com.gamericefishpro.space.c0.a.b("null verticalArrangement when isVertical == true");
                        throw new com.gamericefishpro.space.oh.e();
                    }
                    d0Var2 = d0Var;
                    gVar.b(iE, d0Var2, iArr, iArr2);
                    IntRange intRangeR = com.gamericefishpro.space.ph.v.r(iArr2);
                    int i51 = intRangeR.d;
                    int i52 = intRangeR.e;
                    int i53 = intRangeR.i;
                    if ((i53 > 0 && i51 <= i52) || (i53 < 0 && i52 <= i51)) {
                        while (true) {
                            int i54 = iArr2[i51];
                            z = z5;
                            r rVar4 = (r) rVar.get(i51);
                            rVar4.k(i54, iF, iE);
                            arrayList4.add(rVar4);
                            if (i51 == i52) {
                                break;
                            }
                            i51 += i53;
                            z5 = z;
                        }
                    } else {
                        z = z5;
                    }
                } else {
                    d0Var2 = d0Var;
                    z = z5;
                    int size5 = arrayList.size();
                    int i55 = i40;
                    int i56 = 0;
                    while (i56 < size5) {
                        List list2 = arrayList;
                        r rVar5 = (r) arrayList.get(i56);
                        i55 -= rVar5.l;
                        rVar5.k(i55, iF, iE);
                        arrayList4.add(rVar5);
                        i56++;
                        size5 = size5;
                        arrayList = list2;
                    }
                    int iB3 = rVar.b();
                    int i57 = i40;
                    for (int i58 = 0; i58 < iB3; i58++) {
                        r rVar6 = (r) rVar.get(i58);
                        rVar6.k(i57, iF, iE);
                        arrayList4.add(rVar6);
                        i57 += rVar6.l;
                    }
                    int size6 = arrayList2.size();
                    for (int i59 = 0; i59 < size6; i59++) {
                        r rVar7 = (r) arrayList2.get(i59);
                        rVar7.k(i57, iF, iE);
                        arrayList4.add(rVar7);
                        i57 += rVar7.l;
                    }
                }
                int i60 = i6;
                wVar3.c(iF, iE, arrayList4, jVar2.d, nVar, zN, 1, z2, i60, i28);
                if (zN) {
                    i8 = iE;
                } else {
                    wVar3.b();
                    if (zA) {
                        i8 = iE;
                    } else {
                        iF = com.gamericefishpro.space.c3.b.f(Math.max(iF, (int) 0), jH);
                        int iE2 = com.gamericefishpro.space.c3.b.e(Math.max(iE, (int) 0), jH);
                        if (iE2 != iE) {
                            int size7 = arrayList4.size();
                            for (int i61 = 0; i61 < size7; i61++) {
                                ((r) arrayList4.get(i61)).o = iE2;
                            }
                        }
                        i8 = iE2;
                    }
                }
                r rVar8 = (r) rVar.h();
                int i62 = rVar8 != null ? rVar8.a : 0;
                r rVar9 = (r) rVar.l();
                int i63 = rVar9 != null ? rVar9.a : 0;
                jVar2.b.getClass();
                int i64 = iF;
                List listF = com.gamericefishpro.space.h0.n.f(this.e, i62, i63, arrayList4, com.gamericefishpro.space.t.k.a, iJ3, i64, i8, new com.gamericefishpro.space.a7.c(3, nVar));
                if (z) {
                    r rVar10 = (r) CollectionsKt.firstOrNull(arrayList4);
                    if (rVar10 != null) {
                        numValueOf = Integer.valueOf(rVar10.a);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    r rVar11 = (r) rVar.h();
                    if (rVar11 != null) {
                        numValueOf = Integer.valueOf(rVar11.a);
                    } else {
                        numValueOf = null;
                    }
                }
                if (z) {
                    r rVar12 = (r) CollectionsKt.C(arrayList4);
                    if (rVar12 != null) {
                        numValueOf2 = Integer.valueOf(rVar12.a);
                    } else {
                        numValueOf2 = null;
                    }
                } else {
                    r rVar13 = (r) rVar.l();
                    if (rVar13 != null) {
                        numValueOf2 = Integer.valueOf(rVar13.a);
                    } else {
                        numValueOf2 = null;
                    }
                }
                boolean z7 = i29 < i33 || i28 > iG2;
                m0 m0VarY = h1Var2.y(com.gamericefishpro.space.c3.b.f(i64 + i10, j), com.gamericefishpro.space.c3.b.e(i8 + iJ4, j), com.gamericefishpro.space.ph.m0.c(), new p(v0Var2, arrayList4, listF, zN, 0));
                h1Var = h1Var2;
                qVar = new q(rVar2, i60, z7, f, m0VarY, f6, z4, xVar, d0Var2, nVar.v, com.gamericefishpro.space.h0.n.o(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, arrayList4, listF), i17, i21, i33, v0.d, r11, iJ5);
            }
            wVar.f(qVar, h1Var.n(), false);
            return qVar;
        } catch (Throwable th) {
            com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x035b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0365  */
    /* JADX WARN: Code duplicated, block: B:118:0x038f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0394  */
    /* JADX WARN: Code duplicated, block: B:120:0x0397  */
    /* JADX WARN: Code duplicated, block: B:126:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:145:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:147:0x0403  */
    /* JADX WARN: Code duplicated, block: B:148:0x0406  */
    /* JADX WARN: Code duplicated, block: B:150:0x040d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0410  */
    /* JADX WARN: Code duplicated, block: B:155:0x0420  */
    /* JADX WARN: Code duplicated, block: B:162:0x045c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0467  */
    /* JADX WARN: Code duplicated, block: B:208:0x051b A[LOOP:6: B:191:0x04ca->B:208:0x051b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x0527  */
    /* JADX WARN: Code duplicated, block: B:214:0x0530  */
    /* JADX WARN: Code duplicated, block: B:217:0x0539  */
    /* JADX WARN: Code duplicated, block: B:232:0x059a  */
    /* JADX WARN: Code duplicated, block: B:234:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:237:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:243:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:245:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:247:0x05d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:258:0x0604  */
    /* JADX WARN: Code duplicated, block: B:259:0x0607  */
    /* JADX WARN: Code duplicated, block: B:266:0x061a A[LOOP:12: B:265:0x0618->B:266:0x061a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x0636  */
    /* JADX WARN: Code duplicated, block: B:274:0x0643  */
    /* JADX WARN: Code duplicated, block: B:277:0x0651 A[LOOP:13: B:276:0x064f->B:277:0x0651, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x0662  */
    /* JADX WARN: Code duplicated, block: B:294:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:296:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:298:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:302:0x06df A[LOOP:17: B:299:0x06c7->B:302:0x06df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:303:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:306:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:308:0x0702 A[LOOP:19: B:307:0x0700->B:308:0x0702, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:312:0x071d A[LOOP:20: B:311:0x071b->B:312:0x071d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:315:0x074e  */
    /* JADX WARN: Code duplicated, block: B:317:0x0753  */
    /* JADX WARN: Code duplicated, block: B:319:0x0769  */
    /* JADX WARN: Code duplicated, block: B:321:0x0770 A[LOOP:16: B:320:0x076e->B:321:0x0770, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:328:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:356:0x0463 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x052e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x06e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x05e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final m0 a(d0 d0Var, long j) throws Throwable {
        com.gamericefishpro.space.u6.e eVar;
        int iC;
        int iG;
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        int i4;
        com.gamericefishpro.space.g0.n nVar;
        int i5;
        float f5;
        com.gamericefishpro.space.g0.n nVar2;
        int i6;
        int size;
        int i7;
        List arrayList;
        int i8;
        List list;
        int i9;
        com.gamericefishpro.space.g0.n nVar3;
        List arrayList2;
        int size2;
        int i10;
        List list2;
        int iB;
        int i11;
        int i12;
        com.gamericefishpro.space.g0.n nVar4;
        int iH;
        int iE;
        List listF;
        boolean z;
        int size3;
        int i13;
        int length;
        ArrayList arrayList3;
        d0 d0Var2;
        com.gamericefishpro.space.g0.j jVar;
        int size4;
        com.gamericefishpro.space.g0.n nVar5;
        int size5;
        int i14;
        int i15;
        int size6;
        int i16;
        com.gamericefishpro.space.g0.m[] mVarArrA;
        int length2;
        int i17;
        int i18;
        int i19;
        List list3;
        int i20;
        boolean z2;
        com.gamericefishpro.space.g0.l lVar;
        int iE2;
        int size7;
        int i21;
        int size8;
        int[] iArr;
        int i22;
        int[] iArr2;
        int i23;
        int iIntValue;
        int i24;
        List list4;
        com.gamericefishpro.space.g0.m mVar;
        int iIntValue2;
        com.gamericefishpro.space.g0.m[] mVarArr;
        com.gamericefishpro.space.g0.m mVar2;
        com.gamericefishpro.space.g0.m mVar3;
        int i25;
        int i26;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return b(d0Var, j);
            default:
                boolean zA = com.gamericefishpro.space.c3.k.a(0L, 0L);
                h1 h1Var = d0Var.e;
                k1 k1Var = this.f;
                com.gamericefishpro.space.g0.v vVar = (com.gamericefishpro.space.g0.v) k1Var;
                vVar.s.getValue();
                boolean z3 = vVar.b || h1Var.n();
                v0 v0Var = v0.d;
                com.gamericefishpro.space.y.q.h(j, v0Var);
                com.gamericefishpro.space.c3.l layoutDirection = h1Var.getLayoutDirection();
                u0 u0Var = this.g;
                int iJ = h1Var.J(u0Var.d(layoutDirection));
                int iJ2 = h1Var.J(u0Var.c(h1Var.getLayoutDirection()));
                int iJ3 = h1Var.J(u0Var.b());
                int iJ4 = h1Var.J(u0Var.a()) + iJ3;
                int i27 = iJ2 + iJ;
                int i28 = iJ4 - iJ3;
                long jH = com.gamericefishpro.space.c3.b.h(-i27, -iJ4, j);
                com.gamericefishpro.space.g0.h hVar = (com.gamericefishpro.space.g0.h) this.b.invoke();
                com.gamericefishpro.space.g0.s sVar = hVar.b.b;
                com.gamericefishpro.space.g0.c cVar = (com.gamericefishpro.space.g0.c) this.h;
                if (cVar.d != null && com.gamericefishpro.space.c3.a.b(cVar.b, jH) && cVar.c == h1Var.b()) {
                    eVar = cVar.d;
                    Intrinsics.b(eVar);
                } else {
                    cVar.b = jH;
                    cVar.c = h1Var.b();
                    com.gamericefishpro.space.u6.e eVar2 = (com.gamericefishpro.space.u6.e) cVar.a.invoke(d0Var, new com.gamericefishpro.space.c3.a(jH));
                    cVar.d = eVar2;
                    eVar = eVar2;
                }
                int length3 = ((int[]) eVar.b).length;
                if (length3 != sVar.i) {
                    sVar.i = length3;
                    ArrayList arrayList4 = sVar.b;
                    arrayList4.clear();
                    arrayList4.add(new com.gamericefishpro.space.g0.p(0, 0));
                    sVar.c = 0;
                    sVar.d = 0;
                    sVar.e = 0;
                    sVar.f = -1;
                    sVar.g.clear();
                }
                com.gamericefishpro.space.d0.g gVar = this.c;
                if (gVar == null) {
                    com.gamericefishpro.space.c0.a.b("null verticalArrangement when isVertical == true");
                    throw new com.gamericefishpro.space.oh.e();
                }
                int iJ5 = h1Var.J(gVar.a());
                int i29 = hVar.b.k().a;
                int iG2 = com.gamericefishpro.space.c3.a.g(j) - iJ4;
                h1 h1Var2 = h1Var;
                com.gamericefishpro.space.g0.j jVar2 = new com.gamericefishpro.space.g0.j(hVar, d0Var, iJ5, (com.gamericefishpro.space.g0.v) k1Var, iJ3, i28, (((long) iJ) << 32) | (((long) iJ3) & 4294967295L));
                com.gamericefishpro.space.g0.k kVar = new com.gamericefishpro.space.g0.k(eVar, i29, iJ5, jVar2, sVar);
                q0 q0Var = new q0(10, sVar, kVar);
                com.gamericefishpro.space.a7.c cVar2 = new com.gamericefishpro.space.a7.c(7, sVar);
                com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
                List arrayList5 = null;
                Function1 function1E = gVarE != null ? gVarE.e() : null;
                com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
                try {
                    s sVar2 = vVar.d;
                    int iG3 = sVar2.b.g();
                    int i30 = com.gamericefishpro.space.h0.n.i(iG3, hVar, sVar2.e);
                    if (iG3 != i30) {
                        sVar2.b.h(i30);
                        sVar2.f.b(iG3);
                    }
                    if (i30 < i29 || i29 <= 0) {
                        iC = sVar.c(i30);
                        iG = sVar2.c.g();
                    } else {
                        iC = sVar.c(i29 - 1);
                        iG = 0;
                    }
                    Unit unit = Unit.a;
                    com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                    List listG = com.gamericefishpro.space.h0.n.g(hVar, vVar.q, vVar.n);
                    float fFloatValue = (h1Var2.n() || !z3) ? vVar.g : ((Number) ((com.gamericefishpro.space.w.j) vVar.v.i).e.getValue()).floatValue();
                    com.gamericefishpro.space.h0.w wVar = vVar.m;
                    boolean zN = h1Var2.n();
                    com.gamericefishpro.space.g0.l lVar2 = vVar.c;
                    com.gamericefishpro.space.t0.v0 v0Var2 = vVar.r;
                    if (iJ3 < 0) {
                        com.gamericefishpro.space.c0.a.a("negative beforeContentPadding");
                    }
                    if (i28 < 0) {
                        com.gamericefishpro.space.c0.a.a("negative afterContentPadding");
                    }
                    com.gamericefishpro.space.g0.h hVar2 = jVar2.e;
                    com.gamericefishpro.space.pi.x xVar = this.d;
                    if (i29 <= 0) {
                        int iJ6 = com.gamericefishpro.space.c3.a.j(jH);
                        int i31 = com.gamericefishpro.space.c3.a.i(jH);
                        wVar.c(iJ6, i31, new ArrayList(), hVar2.c, jVar2, zN, length3, z3, 0, 0);
                        if (!zN) {
                            wVar.b();
                            if (!zA) {
                                iJ6 = com.gamericefishpro.space.c3.b.f((int) 0, jH);
                                i31 = com.gamericefishpro.space.c3.b.e((int) 0, jH);
                            }
                        }
                        lVar = new com.gamericefishpro.space.g0.l(null, 0, false, 0.0f, h1Var2.y(com.gamericefishpro.space.c3.b.f(iJ6 + i27, j), com.gamericefishpro.space.c3.b.e(i31 + iJ4, j), com.gamericefishpro.space.ph.m0.c(), new com.gamericefishpro.space.f5.q(5)), 0.0f, false, xVar, d0Var, length3, q0Var, cVar2, g0.d, -iJ3, iG2 + i28, 0, v0Var, i28, iJ5);
                    } else {
                        int i32 = iC;
                        com.gamericefishpro.space.g0.j jVar3 = jVar2;
                        int i33 = iJ3;
                        h1 h1Var3 = h1Var2;
                        int iRound = Math.round(fFloatValue);
                        int i34 = iG - iRound;
                        if (i32 == 0 && i34 < 0) {
                            iRound += i34;
                            i34 = 0;
                        }
                        float f6 = fFloatValue;
                        com.gamericefishpro.space.ph.r rVar = new com.gamericefishpro.space.ph.r();
                        int i35 = -i33;
                        int i36 = i35 + (iJ5 < 0 ? iJ5 : 0);
                        int i37 = i34 + i36;
                        while (i37 < 0 && i32 > 0) {
                            h1 h1Var4 = h1Var3;
                            int i38 = i32 - 1;
                            com.gamericefishpro.space.g0.n nVarB = kVar.b(i38);
                            rVar.add(0, nVarB);
                            i37 += nVarB.g;
                            i32 = i38;
                            h1Var3 = h1Var4;
                        }
                        h1 h1Var5 = h1Var3;
                        if (i37 < i36) {
                            iRound -= i36 - i37;
                            i37 = i36;
                        }
                        int i39 = iRound;
                        int i40 = i37 - i36;
                        int i41 = iG2 + i28;
                        if (i41 < 0) {
                            i41 = 0;
                        }
                        int i42 = -i40;
                        int i43 = i40;
                        int i44 = i32;
                        int i45 = 0;
                        boolean z4 = false;
                        while (i45 < rVar.i) {
                            if (i42 >= i41) {
                                rVar.c(i45);
                                Unit unit2 = Unit.a;
                                z4 = true;
                            } else {
                                i44++;
                                i42 += ((com.gamericefishpro.space.g0.n) rVar.get(i45)).g;
                                i45++;
                            }
                        }
                        boolean z5 = z4;
                        int i46 = i44;
                        while (i46 < i29 && (i42 < i41 || i42 <= 0 || rVar.isEmpty())) {
                            int i47 = i41;
                            com.gamericefishpro.space.g0.n nVarB2 = kVar.b(i46);
                            int i48 = i46;
                            int i49 = nVarB2.g;
                            com.gamericefishpro.space.g0.m[] mVarArr2 = nVarB2.b;
                            if (mVarArr2.length == 0) {
                                if (i42 < iG2) {
                                    int i50 = iG2 - i42;
                                    i25 = i42 + i50;
                                    i3 = i43 - i50;
                                    while (i3 < i33 && i32 > 0) {
                                        int i51 = i32 - 1;
                                        int i52 = i25;
                                        com.gamericefishpro.space.g0.n nVarB3 = kVar.b(i51);
                                        rVar.add(0, nVarB3);
                                        i3 += nVarB3.g;
                                        i32 = i51;
                                        i25 = i52;
                                        i33 = i33;
                                    }
                                    i26 = i25;
                                    i = i33;
                                    i2 = i50 + i39;
                                    if (i3 < 0) {
                                        i2 += i3;
                                        i42 = i26 + i3;
                                        i3 = 0;
                                    } else {
                                        i42 = i26;
                                    }
                                } else {
                                    i = i33;
                                    i2 = i39;
                                    i3 = i43;
                                }
                                if (Integer.signum(Math.round(f6)) == Integer.signum(i2) || Math.abs(Math.round(f6)) < Math.abs(i2)) {
                                    f = f6;
                                } else {
                                    f = i2;
                                }
                                f2 = f6 - f;
                                f3 = 0.0f;
                                if (zN && i2 > i39 && f2 <= 0.0f) {
                                    f3 = (i2 - i39) + f2;
                                }
                                f4 = f3;
                                if (i3 < 0) {
                                    com.gamericefishpro.space.c0.a.a("negative initial offset");
                                }
                                i4 = -i3;
                                nVar = (com.gamericefishpro.space.g0.n) rVar.h();
                                if (nVar != null || (mVar3 = (com.gamericefishpro.space.g0.m) com.gamericefishpro.space.ph.v.q(nVar.b)) == null) {
                                    i5 = 0;
                                } else {
                                    i5 = mVar3.a;
                                }
                                f5 = f;
                                nVar2 = (com.gamericefishpro.space.g0.n) rVar.l();
                                if (nVar2 != null) {
                                    mVarArr = nVar2.b;
                                    Intrinsics.checkNotNullParameter(mVarArr, "<this>");
                                    if (mVarArr.length == 0) {
                                        mVar2 = null;
                                    } else {
                                        mVar2 = mVarArr[mVarArr.length - 1];
                                    }
                                    if (mVar2 != null) {
                                        i6 = mVar2.a;
                                    } else {
                                        i6 = 0;
                                    }
                                } else {
                                    i6 = 0;
                                }
                                size = listG.size();
                                i7 = i3;
                                arrayList = null;
                                i8 = 0;
                                while (true) {
                                    com.gamericefishpro.space.g0.s sVar3 = kVar.e;
                                    if (i8 < size) {
                                        int i53 = i8;
                                        iIntValue2 = ((Number) listG.get(i8)).intValue();
                                        if (iIntValue2 < 0 && iIntValue2 < i5) {
                                            int i54 = sVar3.i;
                                            int iE3 = sVar3.e(iIntValue2);
                                            com.gamericefishpro.space.g0.m mVarS = jVar3.s(iIntValue2, kVar.a(0, iE3), 0, iE3, jVar3.v);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            List list5 = arrayList;
                                            list5.add(mVarS);
                                            arrayList = list5;
                                        }
                                        i8 = i53 + 1;
                                        i5 = i5;
                                    } else {
                                        int i55 = i5;
                                        if (arrayList == null) {
                                            arrayList = g0.d;
                                        }
                                        list = arrayList;
                                        if (zN || lVar2 == null) {
                                            i9 = i6;
                                            nVar3 = nVar;
                                            arrayList2 = null;
                                        } else {
                                            List list6 = lVar2.m;
                                            if (list6.isEmpty()) {
                                                i9 = i6;
                                                nVar3 = nVar;
                                                arrayList2 = null;
                                            } else {
                                                int size9 = list6.size();
                                                while (true) {
                                                    size9--;
                                                    if (-1 >= size9) {
                                                        mVar = null;
                                                    } else if (((com.gamericefishpro.space.g0.m) list6.get(size9)).a > i6 && (size9 == 0 || ((com.gamericefishpro.space.g0.m) list6.get(size9 - 1)).a <= i6)) {
                                                        mVar = (com.gamericefishpro.space.g0.m) list6.get(size9);
                                                    }
                                                }
                                                com.gamericefishpro.space.g0.m mVar4 = (com.gamericefishpro.space.g0.m) CollectionsKt.B(list6);
                                                com.gamericefishpro.space.g0.n nVar6 = (com.gamericefishpro.space.g0.n) CollectionsKt.C(rVar);
                                                int i56 = nVar6 != null ? nVar6.a + 1 : 0;
                                                if (mVar != null) {
                                                    int i57 = mVar.a;
                                                    i9 = i6;
                                                    int iMin = Math.min(mVar4.a, i29 - 1);
                                                    if (i57 <= iMin) {
                                                        arrayList2 = null;
                                                        while (true) {
                                                            if (arrayList2 != null) {
                                                                nVar3 = nVar;
                                                                int size10 = arrayList2.size();
                                                                list = list;
                                                                int i58 = 0;
                                                                while (true) {
                                                                    if (i58 < size10) {
                                                                        int i59 = i58;
                                                                        com.gamericefishpro.space.g0.m[] mVarArr3 = ((com.gamericefishpro.space.g0.n) arrayList2.get(i58)).b;
                                                                        List list7 = arrayList2;
                                                                        int length4 = mVarArr3.length;
                                                                        int i60 = 0;
                                                                        while (true) {
                                                                            if (i60 < length4) {
                                                                                int i61 = i60;
                                                                                if (mVarArr3[i61].a == i57) {
                                                                                    arrayList2 = list7;
                                                                                } else {
                                                                                    i60 = i61 + 1;
                                                                                }
                                                                            } else {
                                                                                i58 = i59 + 1;
                                                                                arrayList2 = list7;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i57 != iMin) {
                                                                        i57++;
                                                                        nVar = nVar3;
                                                                        list = list;
                                                                    }
                                                                }
                                                            } else {
                                                                list = list;
                                                                nVar3 = nVar;
                                                            }
                                                            List list8 = arrayList2;
                                                            arrayList2 = list8 == null ? new ArrayList() : list8;
                                                            com.gamericefishpro.space.g0.n nVarB4 = kVar.b(i56);
                                                            i56++;
                                                            arrayList2.add(nVarB4);
                                                            if (i57 != iMin) {
                                                                i57++;
                                                                nVar = nVar3;
                                                                list = list;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i9 = i6;
                                                }
                                                nVar3 = nVar;
                                                arrayList2 = null;
                                            }
                                        }
                                        if (arrayList2 == null) {
                                            arrayList2 = g0.d;
                                        }
                                        size2 = listG.size();
                                        i10 = 0;
                                        while (i10 < size2) {
                                            iIntValue = ((Number) listG.get(i10)).intValue();
                                            if (i9 + 1 <= iIntValue || iIntValue >= i29) {
                                                i24 = size2;
                                                list4 = listG;
                                            } else if (zN) {
                                                int size11 = arrayList2.size();
                                                int i62 = 0;
                                                while (true) {
                                                    if (i62 < size11) {
                                                        i24 = size2;
                                                        com.gamericefishpro.space.g0.m[] mVarArr4 = ((com.gamericefishpro.space.g0.n) arrayList2.get(i62)).b;
                                                        list4 = listG;
                                                        int length5 = mVarArr4.length;
                                                        int i63 = 0;
                                                        while (true) {
                                                            if (i63 < length5) {
                                                                int i64 = i63;
                                                                if (mVarArr4[i64].a != iIntValue) {
                                                                    i63 = i64 + 1;
                                                                }
                                                            } else {
                                                                i62++;
                                                                size2 = i24;
                                                                listG = list4;
                                                            }
                                                        }
                                                    } else {
                                                        i24 = size2;
                                                        list4 = listG;
                                                        int i65 = sVar3.i;
                                                        int iE4 = sVar3.e(iIntValue);
                                                        com.gamericefishpro.space.g0.m mVarS2 = jVar3.s(iIntValue, kVar.a(0, iE4), 0, iE4, jVar3.v);
                                                        if (arrayList5 == null) {
                                                            arrayList5 = new ArrayList();
                                                        }
                                                        List list9 = arrayList5;
                                                        list9.add(mVarS2);
                                                        arrayList5 = list9;
                                                    }
                                                }
                                            } else {
                                                i24 = size2;
                                                list4 = listG;
                                                int i66 = sVar3.i;
                                                int iE5 = sVar3.e(iIntValue);
                                                com.gamericefishpro.space.g0.m mVarS3 = jVar3.s(iIntValue, kVar.a(0, iE5), 0, iE5, jVar3.v);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                }
                                                List list10 = arrayList5;
                                                list10.add(mVarS3);
                                                arrayList5 = list10;
                                            }
                                            i10++;
                                            size2 = i24;
                                            listG = list4;
                                        }
                                        if (arrayList5 == null) {
                                            arrayList5 = g0.d;
                                        }
                                        list2 = arrayList5;
                                        if (i <= 0 || iJ5 < 0) {
                                            iB = rVar.b();
                                            com.gamericefishpro.space.g0.n nVar7 = nVar3;
                                            i11 = i7;
                                            i12 = 0;
                                            while (i12 < iB) {
                                                int i67 = ((com.gamericefishpro.space.g0.n) rVar.get(i12)).g;
                                                if (i11 != 0 || i67 > i11 || i12 == com.gamericefishpro.space.ph.x.e(rVar)) {
                                                    i7 = i11;
                                                    nVar4 = nVar7;
                                                } else {
                                                    i11 -= i67;
                                                    i12++;
                                                    nVar7 = (com.gamericefishpro.space.g0.n) rVar.get(i12);
                                                }
                                            }
                                            i7 = i11;
                                            nVar4 = nVar7;
                                        } else {
                                            nVar4 = nVar3;
                                        }
                                        iH = com.gamericefishpro.space.c3.a.h(jH);
                                        iE = com.gamericefishpro.space.c3.b.e(i42, jH);
                                        listF = rVar;
                                        if (!arrayList2.isEmpty()) {
                                            listF = CollectionsKt.F(rVar, arrayList2);
                                        }
                                        if (i42 < Math.min(iE, iG2)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z && i4 != 0) {
                                            com.gamericefishpro.space.c0.a.c("non-zero firstLineScrollOffset");
                                        }
                                        size3 = listF.size();
                                        i13 = 0;
                                        length = 0;
                                        while (i13 < size3) {
                                            length += ((com.gamericefishpro.space.g0.n) listF.get(i13)).b.length;
                                            i13++;
                                            i42 = i42;
                                        }
                                        int i68 = i42;
                                        arrayList3 = new ArrayList(length);
                                        if (z) {
                                            if (list.isEmpty() || !list2.isEmpty()) {
                                                com.gamericefishpro.space.c0.a.a("no items");
                                            }
                                            size8 = listF.size();
                                            iArr = new int[size8];
                                            for (i22 = 0; i22 < size8; i22++) {
                                                iArr[i22] = ((com.gamericefishpro.space.g0.n) listF.get(i22)).f;
                                            }
                                            iArr2 = new int[size8];
                                            if (gVar != null) {
                                                com.gamericefishpro.space.c0.a.b("null verticalArrangement");
                                                throw new com.gamericefishpro.space.oh.e();
                                            }
                                            d0Var2 = d0Var;
                                            gVar.b(iE, d0Var2, iArr, iArr2);
                                            IntRange intRangeR = com.gamericefishpro.space.ph.v.r(iArr2);
                                            int i69 = intRangeR.d;
                                            int i70 = intRangeR.e;
                                            i23 = intRangeR.i;
                                            if ((i23 <= 0 && i69 <= i70) || (i23 < 0 && i70 <= i69)) {
                                                while (true) {
                                                    jVar = jVar3;
                                                    com.gamericefishpro.space.g0.m[] mVarArrA2 = ((com.gamericefishpro.space.g0.n) listF.get(i69)).a(iArr2[i69], iH, iE);
                                                    int length6 = mVarArrA2.length;
                                                    int i71 = 0;
                                                    while (i71 < length6) {
                                                        int i72 = i71;
                                                        arrayList3.add(mVarArrA2[i72]);
                                                        i71 = i72 + 1;
                                                    }
                                                    if (i69 != i70) {
                                                        i69 += i23;
                                                        jVar3 = jVar;
                                                    }
                                                }
                                            }
                                            nVar5 = nVar4;
                                        } else {
                                            d0Var2 = d0Var;
                                            jVar = jVar3;
                                            size4 = list.size() - 1;
                                            if (size4 >= 0) {
                                                i18 = i4;
                                                while (true) {
                                                    i19 = size4 - 1;
                                                    list3 = list;
                                                    com.gamericefishpro.space.g0.m mVar5 = (com.gamericefishpro.space.g0.m) list3.get(size4);
                                                    nVar5 = nVar4;
                                                    i18 -= mVar5.l;
                                                    mVar5.d(i18, iH, iE);
                                                    arrayList3.add(mVar5);
                                                    if (i19 < 0) {
                                                        size4 = i19;
                                                        list = list3;
                                                        nVar4 = nVar5;
                                                    }
                                                }
                                            } else {
                                                nVar5 = nVar4;
                                            }
                                            size5 = listF.size();
                                            i14 = i4;
                                            i15 = 0;
                                            while (i15 < size5) {
                                                com.gamericefishpro.space.g0.n nVar8 = (com.gamericefishpro.space.g0.n) listF.get(i15);
                                                mVarArrA = nVar8.a(i14, iH, iE);
                                                int i73 = size5;
                                                int i74 = i15;
                                                i17 = 0;
                                                for (length2 = mVarArrA.length; i17 < length2; length2 = length2) {
                                                    arrayList3.add(mVarArrA[i17]);
                                                    i17++;
                                                }
                                                i14 += nVar8.g;
                                                i15 = i74 + 1;
                                                size5 = i73;
                                            }
                                            size6 = list2.size();
                                            for (i16 = 0; i16 < size6; i16++) {
                                                com.gamericefishpro.space.g0.m mVar6 = (com.gamericefishpro.space.g0.m) list2.get(i16);
                                                mVar6.d(i14, iH, iE);
                                                arrayList3.add(mVar6);
                                                i14 += mVar6.l;
                                            }
                                        }
                                        com.gamericefishpro.space.g0.j jVar4 = jVar;
                                        wVar.c(iH, iE, arrayList3, hVar2.c, jVar4, zN, length3, z3, i7, i68);
                                        int i75 = i7;
                                        if (!zN) {
                                            wVar.b();
                                            if (!zA) {
                                                iH = com.gamericefishpro.space.c3.b.f(Math.max(iH, (int) 0), jH);
                                                iE2 = com.gamericefishpro.space.c3.b.e(Math.max(iE, (int) 0), jH);
                                                if (iE2 != iE) {
                                                    size7 = arrayList3.size();
                                                    for (i21 = 0; i21 < size7; i21++) {
                                                        ((com.gamericefishpro.space.g0.m) arrayList3.get(i21)).m = iE2;
                                                    }
                                                }
                                                iE = iE2;
                                            }
                                        }
                                        int i76 = iH;
                                        hVar2.b.getClass();
                                        i20 = i9;
                                        int i77 = iE;
                                        List listF2 = com.gamericefishpro.space.h0.n.f(this.e, i55, i20, arrayList3, com.gamericefishpro.space.t.k.a, i, i76, i77, new q0(11, kVar, jVar4));
                                        if (i20 == i29 - 1 || i68 > iG2) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        h1Var2 = h1Var5;
                                        lVar = new com.gamericefishpro.space.g0.l(nVar5, i75, z2, f5, h1Var5.y(com.gamericefishpro.space.c3.b.f(i76 + i27, j), com.gamericefishpro.space.c3.b.e(i77 + iJ4, j), com.gamericefishpro.space.ph.m0.c(), new p(v0Var2, arrayList3, listF2, zN, 1)), f4, z5, xVar, d0Var2, length3, q0Var, cVar2, com.gamericefishpro.space.h0.n.o(i55, i20, arrayList3, listF2), i35, i41, i29, v0.d, i28, iJ5);
                                    }
                                }
                            } else {
                                i42 += i49;
                                if (i42 <= i36) {
                                    Intrinsics.checkNotNullParameter(mVarArr2, "<this>");
                                    if (mVarArr2.length == 0) {
                                        throw new NoSuchElementException("Array is empty.");
                                    }
                                    Intrinsics.checkNotNullParameter(mVarArr2, "<this>");
                                    if (mVarArr2[mVarArr2.length - 1].a != i29 - 1) {
                                        i43 -= i49;
                                        Unit unit3 = Unit.a;
                                        i32 = i48 + 1;
                                        z5 = true;
                                    } else {
                                        rVar.addLast(nVarB2);
                                    }
                                } else {
                                    rVar.addLast(nVarB2);
                                }
                                i46 = i48 + 1;
                                i41 = i47;
                            }
                        }
                        if (i42 < iG2) {
                            int i510 = iG2 - i42;
                            i25 = i42 + i510;
                            i3 = i43 - i510;
                            while (i3 < i33) {
                                int i511 = i32 - 1;
                                int i512 = i25;
                                com.gamericefishpro.space.g0.n nVarB5 = kVar.b(i511);
                                rVar.add(0, nVarB5);
                                i3 += nVarB5.g;
                                i32 = i511;
                                i25 = i512;
                                i33 = i33;
                            }
                            i26 = i25;
                            i = i33;
                            i2 = i510 + i39;
                            if (i3 < 0) {
                                i2 += i3;
                                i42 = i26 + i3;
                                i3 = 0;
                            } else {
                                i42 = i26;
                            }
                        } else {
                            i = i33;
                            i2 = i39;
                            i3 = i43;
                        }
                        if (Integer.signum(Math.round(f6)) == Integer.signum(i2)) {
                            f = f6;
                        } else {
                            f = f6;
                        }
                        f2 = f6 - f;
                        f3 = 0.0f;
                        if (zN) {
                            f3 = (i2 - i39) + f2;
                        }
                        f4 = f3;
                        if (i3 < 0) {
                            com.gamericefishpro.space.c0.a.a("negative initial offset");
                        }
                        i4 = -i3;
                        nVar = (com.gamericefishpro.space.g0.n) rVar.h();
                        if (nVar != null) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                        }
                        f5 = f;
                        nVar2 = (com.gamericefishpro.space.g0.n) rVar.l();
                        if (nVar2 != null) {
                            mVarArr = nVar2.b;
                            Intrinsics.checkNotNullParameter(mVarArr, "<this>");
                            if (mVarArr.length == 0) {
                                mVar2 = null;
                            } else {
                                mVar2 = mVarArr[mVarArr.length - 1];
                            }
                            if (mVar2 != null) {
                                i6 = mVar2.a;
                            } else {
                                i6 = 0;
                            }
                        } else {
                            i6 = 0;
                        }
                        size = listG.size();
                        i7 = i3;
                        arrayList = null;
                        i8 = 0;
                        while (true) {
                            com.gamericefishpro.space.g0.s sVar4 = kVar.e;
                            if (i8 < size) {
                                int i513 = i8;
                                iIntValue2 = ((Number) listG.get(i8)).intValue();
                                if (iIntValue2 < 0) {
                                }
                                i8 = i513 + 1;
                                i5 = i5;
                            } else {
                                int i514 = i5;
                                if (arrayList == null) {
                                    arrayList = g0.d;
                                }
                                list = arrayList;
                                if (zN) {
                                    i9 = i6;
                                    nVar3 = nVar;
                                    arrayList2 = null;
                                } else {
                                    i9 = i6;
                                    nVar3 = nVar;
                                    arrayList2 = null;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = g0.d;
                                }
                                size2 = listG.size();
                                i10 = 0;
                                while (i10 < size2) {
                                    iIntValue = ((Number) listG.get(i10)).intValue();
                                    if (i9 + 1 <= iIntValue) {
                                        i24 = size2;
                                        list4 = listG;
                                    } else {
                                        i24 = size2;
                                        list4 = listG;
                                    }
                                    i10++;
                                    size2 = i24;
                                    listG = list4;
                                }
                                if (arrayList5 == null) {
                                    arrayList5 = g0.d;
                                }
                                list2 = arrayList5;
                                if (i <= 0) {
                                    iB = rVar.b();
                                    com.gamericefishpro.space.g0.n nVar9 = nVar3;
                                    i11 = i7;
                                    i12 = 0;
                                    while (i12 < iB) {
                                        int i610 = ((com.gamericefishpro.space.g0.n) rVar.get(i12)).g;
                                        if (i11 != 0) {
                                        }
                                        i7 = i11;
                                        nVar4 = nVar9;
                                    }
                                    i7 = i11;
                                    nVar4 = nVar9;
                                } else {
                                    iB = rVar.b();
                                    com.gamericefishpro.space.g0.n nVar10 = nVar3;
                                    i11 = i7;
                                    i12 = 0;
                                    while (i12 < iB) {
                                        int i611 = ((com.gamericefishpro.space.g0.n) rVar.get(i12)).g;
                                        if (i11 != 0) {
                                        }
                                        i7 = i11;
                                        nVar4 = nVar10;
                                    }
                                    i7 = i11;
                                    nVar4 = nVar10;
                                }
                                iH = com.gamericefishpro.space.c3.a.h(jH);
                                iE = com.gamericefishpro.space.c3.b.e(i42, jH);
                                listF = rVar;
                                if (!arrayList2.isEmpty()) {
                                    listF = CollectionsKt.F(rVar, arrayList2);
                                }
                                if (i42 < Math.min(iE, iG2)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    com.gamericefishpro.space.c0.a.c("non-zero firstLineScrollOffset");
                                }
                                size3 = listF.size();
                                i13 = 0;
                                length = 0;
                                while (i13 < size3) {
                                    length += ((com.gamericefishpro.space.g0.n) listF.get(i13)).b.length;
                                    i13++;
                                    i42 = i42;
                                }
                                int i612 = i42;
                                arrayList3 = new ArrayList(length);
                                if (z) {
                                    if (list.isEmpty()) {
                                        com.gamericefishpro.space.c0.a.a("no items");
                                    } else {
                                        com.gamericefishpro.space.c0.a.a("no items");
                                    }
                                    size8 = listF.size();
                                    iArr = new int[size8];
                                    while (i22 < size8) {
                                        iArr[i22] = ((com.gamericefishpro.space.g0.n) listF.get(i22)).f;
                                    }
                                    iArr2 = new int[size8];
                                    if (gVar != null) {
                                        com.gamericefishpro.space.c0.a.b("null verticalArrangement");
                                        throw new com.gamericefishpro.space.oh.e();
                                    }
                                    d0Var2 = d0Var;
                                    gVar.b(iE, d0Var2, iArr, iArr2);
                                    IntRange intRangeR2 = com.gamericefishpro.space.ph.v.r(iArr2);
                                    int i613 = intRangeR2.d;
                                    int i78 = intRangeR2.e;
                                    i23 = intRangeR2.i;
                                    jVar = i23 <= 0 ? jVar3 : jVar3;
                                    nVar5 = nVar4;
                                } else {
                                    d0Var2 = d0Var;
                                    jVar = jVar3;
                                    size4 = list.size() - 1;
                                    if (size4 >= 0) {
                                        i18 = i4;
                                        while (true) {
                                            i19 = size4 - 1;
                                            list3 = list;
                                            com.gamericefishpro.space.g0.m mVar7 = (com.gamericefishpro.space.g0.m) list3.get(size4);
                                            nVar5 = nVar4;
                                            i18 -= mVar7.l;
                                            mVar7.d(i18, iH, iE);
                                            arrayList3.add(mVar7);
                                            if (i19 < 0) {
                                                size4 = i19;
                                                list = list3;
                                                nVar4 = nVar5;
                                            }
                                        }
                                    } else {
                                        nVar5 = nVar4;
                                    }
                                    size5 = listF.size();
                                    i14 = i4;
                                    i15 = 0;
                                    while (i15 < size5) {
                                        com.gamericefishpro.space.g0.n nVar11 = (com.gamericefishpro.space.g0.n) listF.get(i15);
                                        mVarArrA = nVar11.a(i14, iH, iE);
                                        int i79 = size5;
                                        int i710 = i15;
                                        i17 = 0;
                                        while (i17 < length2) {
                                            arrayList3.add(mVarArrA[i17]);
                                            i17++;
                                        }
                                        i14 += nVar11.g;
                                        i15 = i710 + 1;
                                        size5 = i79;
                                    }
                                    size6 = list2.size();
                                    while (i16 < size6) {
                                        com.gamericefishpro.space.g0.m mVar8 = (com.gamericefishpro.space.g0.m) list2.get(i16);
                                        mVar8.d(i14, iH, iE);
                                        arrayList3.add(mVar8);
                                        i14 += mVar8.l;
                                    }
                                }
                                com.gamericefishpro.space.g0.j jVar5 = jVar;
                                wVar.c(iH, iE, arrayList3, hVar2.c, jVar5, zN, length3, z3, i7, i612);
                                int i711 = i7;
                                if (!zN) {
                                    wVar.b();
                                    if (!zA) {
                                        iH = com.gamericefishpro.space.c3.b.f(Math.max(iH, (int) 0), jH);
                                        iE2 = com.gamericefishpro.space.c3.b.e(Math.max(iE, (int) 0), jH);
                                        if (iE2 != iE) {
                                            size7 = arrayList3.size();
                                            while (i21 < size7) {
                                                ((com.gamericefishpro.space.g0.m) arrayList3.get(i21)).m = iE2;
                                            }
                                        }
                                        iE = iE2;
                                    }
                                }
                                int i712 = iH;
                                hVar2.b.getClass();
                                i20 = i9;
                                int i713 = iE;
                                List listF3 = com.gamericefishpro.space.h0.n.f(this.e, i514, i20, arrayList3, com.gamericefishpro.space.t.k.a, i, i712, i713, new q0(11, kVar, jVar5));
                                if (i20 == i29 - 1) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                h1Var2 = h1Var5;
                                lVar = new com.gamericefishpro.space.g0.l(nVar5, i711, z2, f5, h1Var5.y(com.gamericefishpro.space.c3.b.f(i712 + i27, j), com.gamericefishpro.space.c3.b.e(i713 + iJ4, j), com.gamericefishpro.space.ph.m0.c(), new p(v0Var2, arrayList3, listF3, zN, 1)), f4, z5, xVar, d0Var2, length3, q0Var, cVar2, com.gamericefishpro.space.h0.n.o(i514, i20, arrayList3, listF3), i35, i41, i29, v0.d, i28, iJ5);
                            }
                        }
                    }
                    vVar.f(lVar, h1Var2.n(), false);
                    return lVar;
                } catch (Throwable th) {
                    com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                    throw th;
                }
        }
    }

    public o(com.gamericefishpro.space.g0.v vVar, u0 u0Var, com.gamericefishpro.space.ei.q qVar, com.gamericefishpro.space.g0.c cVar, com.gamericefishpro.space.d0.g gVar, com.gamericefishpro.space.d0.d dVar, com.gamericefishpro.space.pi.x xVar, com.gamericefishpro.space.o1.v vVar2, f0 f0Var) {
        this.f = vVar;
        this.g = u0Var;
        this.b = qVar;
        this.h = cVar;
        this.c = gVar;
        this.d = xVar;
        this.e = f0Var;
    }
}
