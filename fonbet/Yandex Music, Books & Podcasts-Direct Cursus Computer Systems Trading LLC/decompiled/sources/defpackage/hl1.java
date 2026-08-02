package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.g;

/* loaded from: classes3.dex */
public final class hl1 implements o3e {
    public final Context a;
    public final ne1 b;
    public final ArrayList c;

    public hl1(Context context, ne1 ne1Var, ArrayList arrayList) {
        ne1Var.getClass();
        this.a = context;
        this.b = ne1Var;
        this.c = arrayList;
    }

    @Override // defpackage.o3e
    public final bg5 b(List list, spd spdVar, hq5 hq5Var, int i) {
        list.getClass();
        spdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1148207464);
        mqs mqsVar = ((nk1) this.c.get(spdVar.c)).b;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K).a;
        boolean f = oq5Var.f(mqsVar) | oq5Var.f(spdVar);
        Context context = this.a;
        boolean f2 = f | oq5Var.f(context);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            ne1 ne1Var = this.b;
            ne1Var.getClass();
            mqsVar.getClass();
            fdj fdjVar = ne1Var.g;
            thj N = szf.N(mqsVar, spdVar);
            je1 je1Var = ne1Var.f;
            u51 u51Var = ne1Var.a;
            kxi kxiVar = ne1Var.b;
            hv0 hv0Var = new hv0(ne1Var, null, 1);
            kc kcVar = new kc(18, ne1Var, N);
            u51Var.getClass();
            qnq qnqVar = je1Var.a;
            K2 = f8g.K(mm6Var, fdjVar, mqsVar, context, new ik1(qnqVar.b, qnqVar.a, hv0Var, u51Var, kxiVar, kcVar));
            oq5Var.k0(K2);
        }
        bg5 bg5Var = (bg5) K2;
        oq5Var.p(false);
        return bg5Var;
    }
}
