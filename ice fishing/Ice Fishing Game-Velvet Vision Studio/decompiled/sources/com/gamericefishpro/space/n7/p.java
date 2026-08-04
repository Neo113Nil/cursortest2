package com.gamericefishpro.space.n7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f2.t0;
import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.t.c0;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t0.d0;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.y.a1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    public /* synthetic */ p(int i, int i2, Object obj, Object obj2) {
        this.d = i2;
        this.i = obj;
        this.e = i;
        this.v = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.t0.t tVar;
        int i;
        com.gamericefishpro.space.t0.t tVar2;
        int i2;
        int i3;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = 0;
        Object obj2 = this.v;
        Object obj3 = this.i;
        switch (i4) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                g gVar = (g) obj;
                com.gamericefishpro.space.i7.c cVar = ((q) obj3).g;
                com.gamericefishpro.space.i7.a[][] aVarArr = (com.gamericefishpro.space.i7.a[][]) cVar.d;
                ArrayList arrayList = new ArrayList(aVarArr.length);
                for (com.gamericefishpro.space.i7.a[] aVarArr2 : aVarArr) {
                    arrayList.add(com.gamericefishpro.space.ph.v.w(aVarArr2));
                }
                return g.a(gVar, arrayList, cVar.a, 0, this.e, 0, 0, null, false, cVar.b, false, false, false, null, 0, 0, linkedHashMap, null, null, 228980);
            case 1:
                p1 p1Var = (p1) obj3;
                c0 c0Var = (c0) obj2;
                com.gamericefishpro.space.t0.t tVar3 = (com.gamericefishpro.space.t0.t) obj;
                if (p1Var.e == i5 && Intrinsics.a(c0Var, p1Var.f) && (tVar3 instanceof com.gamericefishpro.space.t0.x)) {
                    long[] jArr = c0Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j = jArr[i7];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = i6;
                                while (i10 < i9) {
                                    if ((255 & j) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        Object obj4 = c0Var.b[i11];
                                        boolean z = c0Var.c[i11] != i5;
                                        if (z) {
                                            i3 = i8;
                                            com.gamericefishpro.space.t0.x xVar = (com.gamericefishpro.space.t0.x) tVar3;
                                            tVar2 = tVar3;
                                            h0 h0Var = xVar.z;
                                            y3.I(h0Var, obj4, p1Var);
                                            i2 = i5;
                                            if (obj4 instanceof d0) {
                                                d0 d0Var = (d0) obj4;
                                                if (!h0Var.c(d0Var)) {
                                                    y3.J(xVar.C, d0Var);
                                                }
                                                h0 h0Var2 = p1Var.g;
                                                if (h0Var2 != null) {
                                                    h0Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            tVar2 = tVar3;
                                            i2 = i5;
                                            i3 = i8;
                                        }
                                        if (z) {
                                            c0Var.f(i11);
                                        }
                                    } else {
                                        tVar2 = tVar3;
                                        i2 = i5;
                                        i3 = i8;
                                    }
                                    j >>= i3;
                                    i10++;
                                    i8 = i3;
                                    tVar3 = tVar2;
                                    i5 = i2;
                                }
                                tVar = tVar3;
                                i = i5;
                                if (i9 == i8) {
                                }
                            } else {
                                tVar = tVar3;
                                i = i5;
                            }
                            if (i7 != length) {
                                i7++;
                                tVar3 = tVar;
                                i5 = i;
                                i6 = 0;
                            }
                        }
                    }
                }
                return Unit.a;
            default:
                a1 a1Var = (a1) obj3;
                u0 u0Var = (u0) obj2;
                t0 t0Var = (t0) obj;
                int iG = a1Var.H.a.g();
                if (iG < 0) {
                    iG = 0;
                }
                if (iG <= i5) {
                    i5 = iG;
                }
                int i12 = -i5;
                boolean z2 = a1Var.I;
                int i13 = z2 ? 0 : i12;
                if (!z2) {
                    i12 = 0;
                }
                t0Var.d = true;
                t0.o(t0Var, u0Var, i13, i12);
                Unit unit = Unit.a;
                t0Var.d = false;
                return Unit.a;
        }
    }
}
