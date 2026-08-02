package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class v3e implements o3e {
    public final osj a;
    public final ArrayList b;

    public v3e(osj osjVar, ArrayList arrayList) {
        osjVar.getClass();
        this.a = osjVar;
        this.b = arrayList;
    }

    @Override // defpackage.o3e
    public final bg5 b(List list, spd spdVar, hq5 hq5Var, int i) {
        list.getClass();
        spdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1365856418);
        mqs mqsVar = ((jo6) this.b.get(spdVar.c)).b;
        boolean h = ((((i & 896) ^ 384) > 256 && oq5Var.f(this)) || (i & 384) == 256) | oq5Var.h(mqsVar) | oq5Var.h(spdVar);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (h || K == kjnVar) {
            K = new p3e(0, this, mqsVar, spdVar);
            oq5Var.k0(K);
        }
        Function1 function1 = (Function1) K;
        osj osjVar = this.a;
        boolean f = oq5Var.f(osjVar);
        Object K2 = oq5Var.K();
        if (f || K2 == kjnVar) {
            aub aubVar = new aub(1, osjVar, osj.class, "onOverflowClick", "onOverflowClick(Lru/yandex/music/data/audio/Track;)V", 0, 14);
            oq5Var.k0(aubVar);
            K2 = aubVar;
        }
        Function1 function12 = (Function1) ((h9f) K2);
        Object K3 = oq5Var.K();
        if (K3 == kjnVar) {
            K3 = new rea(17);
            oq5Var.k0(K3);
        }
        bg5 I = up6.I(mqsVar, function1, function12, (Function2) K3, oq5Var);
        oq5Var.p(false);
        return I;
    }

    @Override // defpackage.o3e
    public final wdj d(List list, spd spdVar, oq5 oq5Var) {
        list.getClass();
        spdVar.getClass();
        oq5Var.Z(-1049763645);
        mqs mqsVar = ((jo6) this.b.get(spdVar.c)).b;
        l18 l18Var = l18.b;
        bdt I = hag.I(fdj.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        wdj t = aaw.t(mqsVar, new w50(4, this, spdVar), (fdj) qdcVar.C(I), null, oq5Var, 199680);
        oq5Var.p(false);
        return t;
    }
}
