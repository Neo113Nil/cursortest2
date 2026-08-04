package com.gamericefishpro.space.e;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.b2.e0;
import com.gamericefishpro.space.f1.z;
import com.gamericefishpro.space.f2.s0;
import com.gamericefishpro.space.g0.v;
import com.gamericefishpro.space.h0.v0;
import com.gamericefishpro.space.h2.h0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.s1;
import com.gamericefishpro.space.t.i0;
import com.gamericefishpro.space.t0.d0;
import com.gamericefishpro.space.t0.d2;
import com.gamericefishpro.space.t0.e2;
import com.gamericefishpro.space.t0.g2;
import com.gamericefishpro.space.t0.q1;
import com.gamericefishpro.space.t0.x;
import com.gamericefishpro.space.t0.y1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:119:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x009f A[LOOP:0: B:19:0x006a->B:29:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listF;
        d2 d2VarD;
        int i = this.d;
        com.gamericefishpro.space.g1.k kVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.i;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((j) obj2).c = (Function0) obj;
                return Unit.a;
            case 1:
                ((m) obj2).d = (Function2) obj;
                return Unit.a;
            case 2:
                v vVar = (v) obj;
                com.gamericefishpro.space.g0.g gVar = (com.gamericefishpro.space.g0.g) ((d0) obj2).getValue();
                return new com.gamericefishpro.space.g0.h(vVar, gVar, new z((IntRange) vVar.d.f.getValue(), gVar));
            case 3:
                com.gamericefishpro.space.t0.r rVar = ((com.gamericefishpro.space.g1.f) obj2).d;
                e2 e2Var = rVar.c;
                d2 d2VarD2 = e2Var.d();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < e2Var.e) {
                            if (d2VarD2.l(i2)) {
                                Object objN = d2VarD2.n(i2);
                                if (objN != obj) {
                                    y1 y1Var = objN instanceof y1 ? (y1) objN : null;
                                    if ((y1Var != null ? y1Var.a : null) == obj) {
                                    }
                                }
                                com.gamericefishpro.space.g1.k kVar2 = new com.gamericefishpro.space.g1.k(i2, null);
                                d2VarD2.c();
                                kVar = kVar2;
                                if (kVar != null) {
                                    int i3 = kVar.a;
                                    Integer num = kVar.b;
                                    d2VarD = e2Var.d();
                                    try {
                                        ArrayList arrayListN = com.gamericefishpro.space.u6.f.N(d2VarD, i3, num);
                                        d2VarD.c();
                                        listF = CollectionsKt.F(arrayListN, rVar.I());
                                    } catch (Throwable th) {
                                        d2VarD.c();
                                        throw th;
                                    }
                                } else {
                                    listF = g0.d;
                                }
                                return new com.gamericefishpro.space.g1.a(listF);
                            }
                            int[] iArr = d2VarD2.b;
                            int i4 = i2 + 1;
                            int iC = (i4 < d2VarD2.c ? iArr[(i4 * 5) + 4] : d2VarD2.e) - g2.c(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iC) {
                                    i2 = i4;
                                } else {
                                    Object objH = d2VarD2.h(i2, i5);
                                    if (objH != obj) {
                                        y1 y1Var2 = objH instanceof y1 ? (y1) objH : null;
                                        if ((y1Var2 != null ? y1Var2.a : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    kVar = new com.gamericefishpro.space.g1.k(i2, Integer.valueOf(i5));
                                }
                            }
                        } else {
                            Unit unit = Unit.a;
                        }
                        d2VarD2.c();
                        if (kVar != null) {
                            int i6 = kVar.a;
                            Integer num2 = kVar.b;
                            d2VarD = e2Var.d();
                            ArrayList arrayListN2 = com.gamericefishpro.space.u6.f.N(d2VarD, i6, num2);
                            d2VarD.c();
                            listF = CollectionsKt.F(arrayListN2, rVar.I());
                        } else {
                            listF = g0.d;
                        }
                        return new com.gamericefishpro.space.g1.a(listF);
                    } catch (Throwable th2) {
                        d2VarD2.c();
                        throw th2;
                    }
                }
            case 4:
                ((com.gamericefishpro.space.g5.p) obj2).e((com.gamericefishpro.space.f5.k) obj, false);
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return new v0((com.gamericefishpro.space.e1.f) obj2, m0.c(), (com.gamericefishpro.space.e1.c) obj);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.hj.d dVar = (com.gamericefishpro.space.hj.d) obj2;
                com.gamericefishpro.space.b1.d dVar2 = (com.gamericefishpro.space.b1.d) obj;
                if (dVar.b == null) {
                    dVar.b = dVar.a(dVar2);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.n7.q qVar = (com.gamericefishpro.space.n7.q) obj2;
                Function0 function0 = (Function0) obj;
                s1 s1Var = qVar.k;
                if (s1Var != null) {
                    s1Var.c(null);
                }
                qVar.e(new com.gamericefishpro.space.j7.c(19));
                function0.invoke();
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.s7.i iVar = (com.gamericefishpro.space.s7.i) obj2;
                a0.u(com.gamericefishpro.space.z4.m0.h(iVar), null, new e0(iVar, objArr == true ? 1 : 0, 11), 3);
                int i7 = com.gamericefishpro.space.s7.d.c;
                ((com.gamericefishpro.space.t0.v0) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 9:
                q1 q1Var = (q1) obj;
                if (((com.gamericefishpro.space.b1.a) ((com.gamericefishpro.space.r5.b) obj2).e).get() == 0) {
                    q1Var.invoke();
                }
                return Unit.a;
            case 10:
                i0 i0Var = (i0) obj2;
                x xVar = (x) obj;
                Object[] objArr3 = i0Var.b;
                long[] jArr = i0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j = jArr[i8];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j) < 128) {
                                    xVar.A(objArr3[(i8 << 3) + i10]);
                                }
                                j >>= 8;
                            }
                            if (i9 == 8) {
                                if (i8 != length) {
                                    i8++;
                                }
                            }
                        } else if (i8 != length) {
                            i8++;
                        }
                    }
                }
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.v7.i iVar2 = (com.gamericefishpro.space.v7.i) obj2;
                Function0 function1 = (Function0) obj;
                if (!iVar2.e) {
                    iVar2.e = true;
                    a0.u(com.gamericefishpro.space.z4.m0.h(iVar2), null, new com.gamericefishpro.space.v7.h(iVar2, objArr2 == true ? 1 : 0, 1), 3);
                }
                function1.invoke();
                return Unit.a;
            case 12:
                ((com.gamericefishpro.space.ri.i) obj2).k((Comparable) obj);
                return Unit.a;
            case 13:
                com.gamericefishpro.space.y.r rVar2 = (com.gamericefishpro.space.y.r) obj2;
                h0 h0Var = (h0) obj;
                rVar2.P = rVar2.K.a(h0Var.d.c(), h0Var.getLayoutDirection(), h0Var);
                return Unit.a;
            default:
                ((com.gamericefishpro.space.ei.a0) obj2).d = com.gamericefishpro.space.h2.k.h((com.gamericefishpro.space.y.g0) obj, s0.a);
                return Unit.a;
        }
    }
}
