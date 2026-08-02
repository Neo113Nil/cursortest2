package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.g;

/* loaded from: classes4.dex */
public final class gl1 implements o3e {
    public final Context a;
    public final sk1 b;
    public final ArrayList c;

    public gl1(Context context, sk1 sk1Var, ArrayList arrayList) {
        sk1Var.getClass();
        this.a = context;
        this.b = sk1Var;
        this.c = arrayList;
    }

    @Override // defpackage.o3e
    public final bg5 b(List list, spd spdVar, hq5 hq5Var, int i) {
        list.getClass();
        spdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-354743982);
        mqs mqsVar = ((mk1) this.c.get(spdVar.c)).b;
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
            sk1 sk1Var = this.b;
            sk1Var.getClass();
            mqsVar.getClass();
            fdj fdjVar = sk1Var.f;
            thj N = szf.N(mqsVar, spdVar);
            q21 q21Var = sk1Var.e;
            kxi kxiVar = sk1Var.a;
            ri1 ri1Var = new ri1(3, sk1Var);
            a3 a3Var = new a3(28, sk1Var, N);
            kxiVar.getClass();
            qnq qnqVar = q21Var.a;
            K2 = f8g.K(mm6Var, fdjVar, mqsVar, context, new n26(qnqVar.b, qnqVar.a, ri1Var, kxiVar, a3Var));
            oq5Var.k0(K2);
        }
        bg5 bg5Var = (bg5) K2;
        oq5Var.p(false);
        return bg5Var;
    }
}
