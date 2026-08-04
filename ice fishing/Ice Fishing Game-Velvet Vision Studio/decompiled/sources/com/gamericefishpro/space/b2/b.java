package com.gamericefishpro.space.b2;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f2.s0;
import com.gamericefishpro.space.h2.a1;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.x1;
import com.gamericefishpro.space.i2.r1;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.o1.h0;
import com.gamericefishpro.space.o1.k0;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj, Object obj2) {
        super(0);
        this.d = i;
        this.e = obj;
        this.i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.gamericefishpro.space.h1.l] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.gamericefishpro.space.v0.e] */
    /* JADX WARN: Type inference failed for: r7v11 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.gamericefishpro.space.o2.o oVar;
        com.gamericefishpro.space.h2.f0 f0Var;
        com.gamericefishpro.space.n1.c cVar;
        int i = this.d;
        Object obj = this.i;
        Object obj2 = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((c) obj2).d((com.gamericefishpro.space.h1.l) obj);
                return Unit.a;
            case 1:
                ((com.gamericefishpro.space.ei.a0) obj2).d = com.gamericefishpro.space.h2.k.h((com.gamericefishpro.space.f3.w) obj, s0.a);
                return Unit.a;
            case 2:
                a1 a1Var = ((com.gamericefishpro.space.h2.f0) obj2).Z;
                com.gamericefishpro.space.ei.a0 a0Var = (com.gamericefishpro.space.ei.a0) obj;
                if ((a1Var.f.v & 8) != 0) {
                    for (com.gamericefishpro.space.h1.l lVar = a1Var.e; lVar != null; lVar = lVar.w) {
                        if ((lVar.i & 8) != 0) {
                            ?? E = lVar;
                            ?? eVar = 0;
                            while (E != 0) {
                                if (E instanceof x1) {
                                    x1 x1Var = (x1) E;
                                    if (x1Var.Y()) {
                                        com.gamericefishpro.space.o2.l lVar2 = new com.gamericefishpro.space.o2.l();
                                        a0Var.d = lVar2;
                                        lVar2.v = true;
                                    }
                                    if (x1Var.a0()) {
                                        ((com.gamericefishpro.space.o2.l) a0Var.d).i = true;
                                    }
                                    x1Var.L((com.gamericefishpro.space.o2.w) a0Var.d);
                                } else if ((E.i & 8) != 0 && (E instanceof com.gamericefishpro.space.h2.j)) {
                                    com.gamericefishpro.space.h1.l lVar3 = ((com.gamericefishpro.space.h2.j) E).I;
                                    int i2 = 0;
                                    while (lVar3 != null) {
                                        if ((lVar3.i & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                E = E;
                                                eVar = eVar;
                                                eVar = eVar;
                                                E = lVar3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new com.gamericefishpro.space.v0.e(new com.gamericefishpro.space.h1.l[16]);
                                                }
                                                if (E != 0) {
                                                    eVar.b(E);
                                                    E = 0;
                                                }
                                                eVar.b(lVar3);
                                            }
                                        } else {
                                            E = E;
                                            eVar = eVar;
                                        }
                                        lVar3 = lVar3.y;
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
                                E = com.gamericefishpro.space.h2.k.e(eVar);
                            }
                        }
                    }
                }
                return Unit.a;
            case 3:
                h0 h0Var = f1.f0;
                ((Function1) obj2).invoke(h0Var);
                f1 f1Var = (f1) obj;
                k0 k0Var = f1Var.W;
                k0 k0Var2 = h0Var.C;
                boolean z = k0Var != k0Var2;
                boolean z2 = f1Var.X;
                boolean z3 = h0Var.D;
                boolean z4 = z2 != z3;
                if (z || z4) {
                    f1Var.W = k0Var2;
                    f1Var.X = z3;
                    if (f1Var.Y && (z4 || (z3 && z))) {
                        f1Var.H.F();
                    }
                }
                f1Var.Y = true;
                h0Var.J = h0Var.C.a(h0Var.E, h0Var.G, h0Var.F);
                return Unit.a;
            case 4:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent((MotionEvent) obj));
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.i2.z zVar = (com.gamericefishpro.space.i2.z) obj;
                r1 r1Var = (r1) obj2;
                com.gamericefishpro.space.o2.i iVar = r1Var.w;
                com.gamericefishpro.space.o2.i iVar2 = r1Var.y;
                Float f = r1Var.i;
                Float f2 = r1Var.v;
                float fFloatValue = (iVar == null || f == null) ? 0.0f : ((Number) iVar.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (iVar2 == null || f2 == null) ? 0.0f : ((Number) iVar2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iA = zVar.A(r1Var.d);
                    com.gamericefishpro.space.o2.p pVar = (com.gamericefishpro.space.o2.p) zVar.s().b(zVar.E);
                    if (pVar != null) {
                        try {
                            com.gamericefishpro.space.e4.h hVar = zVar.G;
                            if (hVar != null) {
                                hVar.a.setBoundsInScreen(zVar.k(pVar));
                                Unit unit = Unit.a;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.a;
                        }
                    }
                    com.gamericefishpro.space.o2.p pVar2 = (com.gamericefishpro.space.o2.p) zVar.s().b(zVar.F);
                    if (pVar2 != null) {
                        try {
                            com.gamericefishpro.space.e4.h hVar2 = zVar.H;
                            if (hVar2 != null) {
                                hVar2.a.setBoundsInScreen(zVar.k(pVar2));
                                Unit unit3 = Unit.a;
                            }
                        } catch (IllegalStateException unused2) {
                            Unit unit4 = Unit.a;
                        }
                    }
                    zVar.v.invalidate();
                    com.gamericefishpro.space.o2.p pVar3 = (com.gamericefishpro.space.o2.p) zVar.s().b(iA);
                    if (pVar3 != null && (oVar = pVar3.a) != null && (f0Var = oVar.c) != null) {
                        if (iVar != null) {
                            zVar.J.h(iA, iVar);
                        }
                        if (iVar2 != null) {
                            zVar.K.h(iA, iVar2);
                        }
                        zVar.w(f0Var);
                    }
                    break;
                }
                if (iVar != null) {
                    r1Var.i = (Float) iVar.a.invoke();
                }
                if (iVar2 != null) {
                    r1Var.v = (Float) iVar2.a.invoke();
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((com.gamericefishpro.space.l1.c) obj2).J.invoke((com.gamericefishpro.space.l1.d) obj);
                return Unit.a;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                Function0 function0 = (Function0) obj2;
                if (function0 != null && (cVar = (com.gamericefishpro.space.n1.c) function0.invoke()) != null) {
                    return cVar;
                }
                f1 f1Var2 = (f1) obj;
                if (!f1Var2.K0().G) {
                    f1Var2 = null;
                }
                if (f1Var2 != null) {
                    return d5.h(0L, com.gamericefishpro.space.d9.h.Q(f1Var2.i));
                }
                return null;
            case 9:
                ((com.gamericefishpro.space.ei.a0) obj2).d = ((com.gamericefishpro.space.m1.u) obj).C0();
                return Unit.a;
            case 10:
                SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences((String) obj, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            default:
                Context applicationContext = (Context) obj2;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                String name = ((com.gamericefishpro.space.o4.b) obj).a;
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(name, "name");
                String fileName = name + ".preferences_pb";
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                return new File(applicationContext.getApplicationContext().getFilesDir(), com.gamericefishpro.space.m5.a.u("datastore/", fileName));
        }
    }
}
