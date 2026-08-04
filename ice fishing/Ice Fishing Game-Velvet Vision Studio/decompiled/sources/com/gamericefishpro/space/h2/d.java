package com.gamericefishpro.space.h2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.ei.l implements Function1 {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d e;
    public static final d i;
    public static final d v;
    public static final d w;
    public static final d y;
    public static final d z;
    public final /* synthetic */ int d;

    static {
        int i2 = 1;
        e = new d(i2, 0);
        i = new d(i2, 1);
        v = new d(i2, 2);
        w = new d(i2, 3);
        y = new d(i2, 4);
        z = new d(i2, 5);
        A = new d(i2, 6);
        B = new d(i2, 7);
        C = new d(i2, 8);
        D = new d(i2, 9);
        E = new d(i2, 10);
        F = new d(i2, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0119 A[LOOP:0: B:71:0x00e2->B:81:0x0119, LOOP_END] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = (g) obj;
                f0 f0Var = gVar instanceof f0 ? (f0) gVar : null;
                if (f0Var == null || !f0Var.k0) {
                    return Unit.a;
                }
                throw new IllegalStateException("Apply is called on deactivated node " + gVar);
            case 1:
                s1 s1Var = (s1) obj;
                if (s1Var.t()) {
                    n0 n0Var = s1Var.e;
                    if (!n0Var.D) {
                        Function1 function1D = s1Var.d.d();
                        com.gamericefishpro.space.t.h0 h0Var = n0Var.G;
                        if (function1D != null) {
                            n0Var.h0(s1Var, 9223372034707292159L, 0L);
                            n0Var.z = function1D;
                        } else if (h0Var != null) {
                            Object[] objArr = h0Var.c;
                            long[] jArr = h0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j = jArr[i2];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j) < 128) {
                                                n0Var.x0((com.gamericefishpro.space.t.i0) objArr[(i2 << 3) + i4]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i3 == 8) {
                                            if (i2 != length) {
                                                i2++;
                                            }
                                        }
                                    } else if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                            h0Var.a();
                        }
                    }
                }
                return Unit.a;
            case 2:
                n1 n1Var = ((f1) obj).e0;
                if (n1Var != null) {
                    n1Var.invalidate();
                }
                return Unit.a;
            case 3:
                f1 f1Var = (f1) obj;
                f0 f0Var2 = f1Var.H;
                try {
                    if (f1Var.t()) {
                        f1Var.g1(true);
                        break;
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    f0Var2.Y(th);
                    throw null;
                }
            case 4:
                k1 k1Var = (k1) obj;
                if (k1Var.t()) {
                    k1Var.d.E();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                f0 f0Var3 = (f0) obj;
                if (f0Var3.H()) {
                    f0Var3.U(false);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                f0 f0Var4 = (f0) obj;
                if (f0Var4.H()) {
                    f0Var4.U(false);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                f0 f0Var5 = (f0) obj;
                if (f0Var5.H()) {
                    f0Var5.S(false);
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                f0 f0Var6 = (f0) obj;
                if (f0Var6.H()) {
                    f0Var6.S(false);
                }
                return Unit.a;
            case 9:
                f0 f0Var7 = (f0) obj;
                if (f0Var7.H()) {
                    f0.T(f0Var7, false, 7);
                }
                return Unit.a;
            case 10:
                f0 f0Var8 = (f0) obj;
                if (f0Var8.H()) {
                    f0.V(f0Var8, false, 7);
                }
                return Unit.a;
            default:
                f0 f0Var9 = (f0) obj;
                if (f0Var9.H()) {
                    f0Var9.F();
                }
                return Unit.a;
        }
    }
}
