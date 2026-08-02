package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.coroutines.g;

/* loaded from: classes3.dex */
public final class u3e implements o3e {
    public final List a;
    public final List b;
    public final cvl c;
    public final mdc d;
    public final rdk e;
    public final g6c f;
    public final rmb g;
    public final g0l h;
    public final kxi i;

    public u3e(List list, List list2, cvl cvlVar, mdc mdcVar, rdk rdkVar, g6c g6cVar, rmb rmbVar, g0l g0lVar, kxi kxiVar) {
        cvlVar.getClass();
        kxiVar.getClass();
        this.a = list;
        this.b = list2;
        this.c = cvlVar;
        this.d = mdcVar;
        this.e = rdkVar;
        this.f = g6cVar;
        this.g = rmbVar;
        this.h = g0lVar;
        this.i = kxiVar;
    }

    @Override // defpackage.o3e
    public final bg5 b(List list, spd spdVar, hq5 hq5Var, int i) {
        list.getClass();
        spdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-429379503);
        mqs mqsVar = (mqs) this.a.get(spdVar.c);
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = gld.R(g.a, oq5Var);
            oq5Var.k0(K);
        }
        mm6 mm6Var = (mm6) K;
        boolean f = oq5Var.f(mqsVar) | oq5Var.f(spdVar);
        mdc mdcVar = this.d;
        boolean f2 = f | oq5Var.f(mdcVar) | oq5Var.f(context);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            K2 = up6.C(mm6Var, mqsVar, context, new s3e(this, mdcVar, mqsVar, szf.N(mqsVar, spdVar), 0), false);
            oq5Var.k0(K2);
        }
        bg5 bg5Var = (bg5) K2;
        oq5Var.p(false);
        return bg5Var;
    }
}
