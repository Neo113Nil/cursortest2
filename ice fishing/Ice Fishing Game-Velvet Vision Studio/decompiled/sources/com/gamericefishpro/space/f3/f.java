package com.gamericefishpro.space.f3;

import android.graphics.Canvas;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.h2.b2;
import com.gamericefishpro.space.h2.c2;
import com.gamericefishpro.space.h2.f0;
import com.gamericefishpro.space.h2.o1;
import com.gamericefishpro.space.o1.h0;
import com.gamericefishpro.space.o1.n0;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.v.k0;
import com.gamericefishpro.space.v.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z zVar, f0 f0Var, z zVar2) {
        super(1);
        this.d = 0;
        this.e = zVar;
        this.v = f0Var;
        this.i = zVar2;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z zVar = (z) this.e;
                f0 f0Var = (f0) this.v;
                z zVar2 = (z) this.i;
                com.gamericefishpro.space.o1.q qVarJ = ((com.gamericefishpro.space.q1.d) obj).x().j();
                if (zVar.getView().getVisibility() != 8) {
                    zVar.R = true;
                    o1 o1Var = f0Var.H;
                    com.gamericefishpro.space.i2.t tVar = o1Var instanceof com.gamericefishpro.space.i2.t ? (com.gamericefishpro.space.i2.t) o1Var : null;
                    if (tVar != null) {
                        Canvas canvasA = com.gamericefishpro.space.o1.c.a(qVarJ);
                        tVar.getAndroidViewsHandler$ui().getClass();
                        zVar2.draw(canvasA);
                    }
                    zVar.R = false;
                }
                return Unit.a;
            case 1:
                c2 c2Var = (c2) obj;
                com.gamericefishpro.space.k1.e eVar = (com.gamericefishpro.space.k1.e) c2Var;
                if (!((com.gamericefishpro.space.k1.b) ((com.gamericefishpro.space.i2.t) com.gamericefishpro.space.h2.k.t((com.gamericefishpro.space.k1.e) this.i)).m8getDragAndDropManager()).b.contains(eVar) || !com.gamericefishpro.space.wa.b.b(eVar, com.gamericefishpro.space.a.a.r((com.gamericefishpro.space.vb.c) this.v))) {
                    return b2.d;
                }
                ((a0) this.e).d = c2Var;
                return b2.i;
            case 2:
                com.gamericefishpro.space.m1.u uVar = (com.gamericefishpro.space.m1.u) obj;
                if (Intrinsics.a(uVar, (com.gamericefishpro.space.m1.u) this.e)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.a(uVar, ((com.gamericefishpro.space.m1.k) this.i).c)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((com.gamericefishpro.space.ei.l) this.v).invoke(uVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 3:
                return new com.gamericefishpro.space.a5.e((com.gamericefishpro.space.f1.u) this.e, this.i, (com.gamericefishpro.space.v.q) this.v, 3);
            case 4:
                h0 h0Var = (h0) obj;
                s2 s2Var = (s2) this.i;
                s2 s2Var2 = (s2) this.e;
                h0Var.d(s2Var2 != null ? ((Number) s2Var2.getValue()).floatValue() : 1.0f);
                h0Var.i(s2Var != null ? ((Number) s2Var.getValue()).floatValue() : 1.0f);
                h0Var.k(s2Var != null ? ((Number) s2Var.getValue()).floatValue() : 1.0f);
                s2 s2Var3 = (s2) this.v;
                h0Var.t(s2Var3 != null ? ((n0) s2Var3.getValue()).a : n0.b);
                return Unit.a;
            default:
                k0 k0Var = (k0) this.v;
                int iOrdinal = ((com.gamericefishpro.space.v.y) obj).ordinal();
                n0 n0Var = null;
                if (iOrdinal == 0) {
                    r0 r0Var = k0Var.a;
                } else if (iOrdinal == 1) {
                    n0Var = (n0) this.e;
                } else {
                    if (iOrdinal != 2) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    r0 r0Var2 = k0Var.a;
                }
                return new n0(n0Var != null ? n0Var.a : n0.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(com.gamericefishpro.space.m1.u uVar, com.gamericefishpro.space.m1.k kVar, Function1 function1) {
        super(1);
        this.d = 2;
        this.e = uVar;
        this.i = kVar;
        this.v = (com.gamericefishpro.space.ei.l) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.d = i;
        this.e = obj;
        this.i = obj2;
        this.v = obj3;
    }
}
