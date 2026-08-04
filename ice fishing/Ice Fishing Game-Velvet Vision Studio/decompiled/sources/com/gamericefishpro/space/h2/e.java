package com.gamericefishpro.space.h2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.ei.l implements Function2 {
    public static final e e;
    public static final e i;
    public static final e v;
    public static final e w;
    public final /* synthetic */ int d;

    static {
        int i2 = 2;
        e = new e(i2, 0);
        i = new e(i2, 1);
        v = new e(i2, 2);
        w = new e(i2, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                ((g) obj).getClass();
                break;
            case 1:
                ((f0) ((g) obj)).c0((com.gamericefishpro.space.f2.l0) obj2);
                break;
            case 2:
                ((f0) ((g) obj)).d0((com.gamericefishpro.space.h1.m) obj2);
                break;
            default:
                com.gamericefishpro.space.t0.z zVar = (com.gamericefishpro.space.t0.z) obj2;
                f0 f0Var = (f0) ((g) obj);
                f0Var.V = zVar;
                a1 a1Var = f0Var.Z;
                t2 t2Var = com.gamericefishpro.space.i2.b1.h;
                com.gamericefishpro.space.b1.l lVar = (com.gamericefishpro.space.b1.l) zVar;
                lVar.getClass();
                f0Var.Z((com.gamericefishpro.space.c3.c) com.gamericefishpro.space.t0.i.w(lVar, t2Var));
                com.gamericefishpro.space.c3.l lVar2 = (com.gamericefishpro.space.c3.l) com.gamericefishpro.space.t0.i.w(lVar, com.gamericefishpro.space.i2.b1.n);
                if (f0Var.T != lVar2) {
                    f0Var.T = lVar2;
                    f0Var.E();
                    f0 f0VarV = f0Var.v();
                    if (f0VarV != null) {
                        f0VarV.C();
                    }
                    f0Var.D();
                    for (com.gamericefishpro.space.h1.l lVar3 = a1Var.f; lVar3 != null; lVar3 = lVar3.y) {
                        lVar3.h0();
                    }
                }
                f0Var.e0((com.gamericefishpro.space.i2.z1) com.gamericefishpro.space.t0.i.w(lVar, com.gamericefishpro.space.i2.b1.s));
                com.gamericefishpro.space.h1.l lVar4 = a1Var.f;
                if ((lVar4.v & 32768) != 0) {
                    while (lVar4 != null) {
                        if ((lVar4.i & 32768) != 0) {
                            ?? E = lVar4;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof h) {
                                    com.gamericefishpro.space.h1.l lVar5 = ((com.gamericefishpro.space.h1.l) ((h) E)).d;
                                    if (lVar5.G) {
                                        g1.c(lVar5);
                                    } else {
                                        lVar5.C = true;
                                    }
                                } else if ((E.i & 32768) != 0 && (E instanceof j)) {
                                    com.gamericefishpro.space.h1.l lVar6 = ((j) E).I;
                                    int i2 = 0;
                                    while (lVar6 != null) {
                                        if ((lVar6.i & 32768) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                E = E;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E = lVar6;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(lVar6);
                                            }
                                        } else {
                                            E = E;
                                            eVar = eVar;
                                        }
                                        lVar6 = lVar6.y;
                                        E = E;
                                        eVar = eVar;
                                    }
                                    if (i2 == 1) {
                                        E = E;
                                        eVar = eVar;
                                    } else {
                                        E = E;
                                        eVar = eVar;
                                    }
                                }
                                E = k.e(eVar);
                            }
                        }
                        if ((lVar4.v & 32768) != 0) {
                            lVar4 = lVar4.y;
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
