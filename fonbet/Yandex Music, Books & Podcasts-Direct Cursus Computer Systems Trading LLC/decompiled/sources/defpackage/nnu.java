package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class nnu {
    public static final float a = 4;
    public static final float b = 64;

    public static final void a(uoi uoiVar, hq5 hq5Var, int i) {
        int i2;
        uoiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1715714379);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(uoiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
            boolean h = ((i2 & 14) == 4) | oq5Var.h(view);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new npt(uoiVar, view, (Continuation) null, 12);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, uoiVar, (Function2) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(uoiVar, i, 23);
        }
    }

    public static final vm0 b(uoi uoiVar, hq5 hq5Var, int i) {
        uoiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = vq2.a(1.0f);
            oq5Var.k0(K);
        }
        fk0 fk0Var = (fk0) K;
        boolean h = ((((i & 14) ^ 6) > 4 && oq5Var.f(uoiVar)) || (i & 6) == 4) | oq5Var.h(fk0Var) | oq5Var.d(150);
        Object K2 = oq5Var.K();
        if (h || K2 == kjnVar) {
            K2 = new h0t(uoiVar, fk0Var, (Continuation) null, 11);
            oq5Var.k0(K2);
        }
        gld.w(oq5Var, uoiVar, (Function2) K2);
        return fk0Var.c;
    }

    public static final float c(boolean z, hq5 hq5Var) {
        float f;
        if (z) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(-942987914);
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            f = w1g.p(nu0.i(), 0, oq5Var, 0, 2);
            oq5Var.p(false);
        } else {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(-942986044);
            oq5Var2.p(false);
            f = 0;
        }
        h6g h6gVar3 = nu0.a;
        h6g h6gVar4 = h6g.c;
        float p = f + w1g.p(nu0.a(), 2, hq5Var, 48, 0) + (a * 2);
        float f2 = b;
        return p < f2 ? f2 : p;
    }
}
