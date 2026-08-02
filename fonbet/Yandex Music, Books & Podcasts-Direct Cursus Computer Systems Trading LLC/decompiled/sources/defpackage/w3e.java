package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.coroutines.g;

/* loaded from: classes3.dex */
public final class w3e implements o3e {
    public final List a;
    public final rmb b;
    public final gs4 c;
    public final cka d;
    public final g0l e;
    public final kxi f;

    public w3e(List list, rmb rmbVar, gs4 gs4Var, cka ckaVar, g0l g0lVar, kxi kxiVar) {
        kxiVar.getClass();
        this.a = list;
        this.b = rmbVar;
        this.c = gs4Var;
        this.d = ckaVar;
        this.e = g0lVar;
        this.f = kxiVar;
    }

    @Override // defpackage.o3e
    public final bg5 b(List list, spd spdVar, hq5 hq5Var, int i) {
        list.getClass();
        spdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1908717203);
        mqs mqsVar = (mqs) this.a.get(spdVar.c);
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = gld.R(g.a, oq5Var);
            oq5Var.k0(K);
        }
        mm6 mm6Var = (mm6) K;
        boolean f = oq5Var.f(mqsVar) | oq5Var.f(spdVar) | oq5Var.f(context);
        Object K2 = oq5Var.K();
        if (f || K2 == kjnVar) {
            K2 = up6.C(mm6Var, mqsVar, context, new t3e(0, this, spdVar, szf.N(mqsVar, spdVar)), false);
            oq5Var.k0(K2);
        }
        bg5 bg5Var = (bg5) K2;
        oq5Var.p(false);
        return bg5Var;
    }
}
