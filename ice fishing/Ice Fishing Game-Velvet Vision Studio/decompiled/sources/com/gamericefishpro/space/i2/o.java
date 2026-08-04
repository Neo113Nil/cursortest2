package com.gamericefishpro.space.i2;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o extends com.gamericefishpro.space.ei.j implements Function0 {
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.B = i3;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0099 A[LOOP:0: B:21:0x0063->B:32:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x014f A[LOOP:4: B:72:0x011e->B:83:0x014f, LOOP_END] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        ContentCaptureSession contentCaptureSessionA;
        com.gamericefishpro.space.h2.a1 a1Var;
        switch (this.B) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                View view = (View) this.e;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    com.gamericefishpro.space.d4.i.f(view);
                }
                if (i < 29 || (contentCaptureSessionA = com.gamericefishpro.space.i6.w.a(view)) == null) {
                    return null;
                }
                return new com.gamericefishpro.space.u6.s(5, contentCaptureSessionA, view);
            case 1:
                com.gamericefishpro.space.m1.e eVar = (com.gamericefishpro.space.m1.e) this.e;
                com.gamericefishpro.space.t.i0 i0Var = eVar.c;
                com.gamericefishpro.space.t.i0 i0Var2 = eVar.d;
                com.gamericefishpro.space.m1.k kVar = eVar.a;
                com.gamericefishpro.space.m1.u uVarF = kVar.f();
                if (uVarF == null) {
                    Object[] objArr = i0Var2.b;
                    long[] jArr = i0Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j & 255) < 128) {
                                        com.gamericefishpro.space.h2.b bVar = (com.gamericefishpro.space.h2.b) objArr[(i2 << 3) + i4];
                                        com.gamericefishpro.space.m1.s sVar = com.gamericefishpro.space.m1.s.d;
                                        bVar.B0();
                                        throw null;
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
                } else if (uVarF.G) {
                    if (i0Var.c(uVarF)) {
                        uVarF.G0();
                    }
                    uVarF.F0();
                    if (!uVarF.d.G) {
                        com.gamericefishpro.space.e2.a.b("visitAncestors called on an unattached node");
                    }
                    com.gamericefishpro.space.h1.l lVar = uVarF.d;
                    com.gamericefishpro.space.h2.f0 f0VarS = com.gamericefishpro.space.h2.k.s(uVarF);
                    int i5 = 0;
                    while (f0VarS != null) {
                        if ((f0VarS.Z.f.v & 5120) != 0) {
                            while (lVar != null) {
                                int i6 = lVar.i;
                                if ((i6 & 5120) != 0) {
                                    if ((i6 & 1024) != 0) {
                                        i5++;
                                    }
                                    if ((lVar instanceof com.gamericefishpro.space.h2.b) && i0Var2.c(lVar)) {
                                        if (i5 <= 1) {
                                            ((com.gamericefishpro.space.h2.b) lVar).B0();
                                            throw null;
                                        }
                                        com.gamericefishpro.space.m1.s sVar2 = com.gamericefishpro.space.m1.s.d;
                                        ((com.gamericefishpro.space.h2.b) lVar).B0();
                                        throw null;
                                    }
                                }
                                lVar = lVar.w;
                            }
                        }
                        f0VarS = f0VarS.v();
                        lVar = (f0VarS == null || (a1Var = f0VarS.Z) == null) ? null : a1Var.e;
                    }
                    Object[] objArr2 = i0Var2.b;
                    long[] jArr2 = i0Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr2[i7];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((j2 & 255) < 128) {
                                        com.gamericefishpro.space.h2.b bVar2 = (com.gamericefishpro.space.h2.b) objArr2[(i7 << 3) + i9];
                                        com.gamericefishpro.space.m1.s sVar3 = com.gamericefishpro.space.m1.s.d;
                                        bVar2.B0();
                                        throw null;
                                    }
                                    j2 >>= 8;
                                }
                                if (i8 == 8) {
                                    if (i7 != length2) {
                                        i7++;
                                    }
                                }
                            } else if (i7 != length2) {
                                i7++;
                            }
                        }
                    }
                }
                if (kVar.f() == null || kVar.c.F0() == com.gamericefishpro.space.m1.s.i) {
                    kVar.c();
                }
                i0Var.b();
                i0Var2.b();
                eVar.e = false;
                return Unit.a;
            case 2:
                com.gamericefishpro.space.s5.t tVar = (com.gamericefishpro.space.s5.t) this.e;
                com.gamericefishpro.space.ui.c cVar = tVar.a;
                if (cVar == null) {
                    Intrinsics.h("coroutineScope");
                    throw null;
                }
                com.gamericefishpro.space.pi.a0.f(cVar, null);
                tVar.i();
                com.gamericefishpro.space.s5.p pVar = tVar.e;
                if (pVar != null) {
                    pVar.f.close();
                    return Unit.a;
                }
                Intrinsics.h("connectionManager");
                throw null;
            default:
                return Boolean.valueOf(((com.gamericefishpro.space.y.g0) this.e).O.H0(7));
        }
    }
}
