package defpackage;

import androidx.compose.foundation.lazy.a;
import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class bam extends uif implements ryc {
    public final /* synthetic */ List r;
    public final /* synthetic */ vqn s;
    public final /* synthetic */ rbm t;
    public final /* synthetic */ u0s u;
    public final /* synthetic */ jab v;
    public final /* synthetic */ mxs w;
    public final /* synthetic */ wp x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bam(List list, vqn vqnVar, rbm rbmVar, u0s u0sVar, jab jabVar, mxs mxsVar, wp wpVar) {
        super(4);
        this.r = list;
        this.s = vqnVar;
        this.t = rbmVar;
        this.u = u0sVar;
        this.v = jabVar;
        this.w = mxsVar;
        this.x = wpVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            int i2 = i & 126;
            hcj hcjVar = (hcj) this.r.get(intValue);
            oq5Var.Z(-111321383);
            boolean z = hcjVar instanceof fcj;
            vci vciVar = vci.a;
            wp wpVar = this.x;
            if (z) {
                oq5Var.Z(-111258144);
                fcj fcjVar = (fcj) hcjVar;
                mqs mqsVar = fcjVar.b;
                vqn vqnVar = this.s;
                int i3 = vqnVar.a + 1;
                vqnVar.a = i3;
                thj L = szf.L(mqsVar, i3);
                dej dejVar = fcjVar.a;
                rbm rbmVar = this.t;
                u0s u0sVar = this.u;
                jab jabVar = this.v;
                wdj G = t7g.G(rbmVar, mqsVar, intValue, u0sVar, jabVar, L, oq5Var, (i2 << 3) & 896, 32);
                rbm rbmVar2 = this.t;
                boolean h = oq5Var.h(rbmVar2) | oq5Var.h(jabVar);
                u0s u0sVar2 = this.u;
                boolean h2 = h | oq5Var.h(u0sVar2);
                mxs mxsVar = this.w;
                boolean h3 = h2 | oq5Var.h(mxsVar);
                Object K = oq5Var.K();
                if (h3 || K == gq5.a) {
                    K = new cam(rbmVar2, jabVar, u0sVar2, mxsVar);
                    oq5Var.k0(K);
                }
                asq.k(dejVar, G, b.b(androidx.compose.ui.platform.a.a(wyf.s(com.yandex.music.core.ui.compose.a.c(vciVar, null, L, (pyc) K, 15), wpVar), "non_music_track"), intValue), oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!(hcjVar instanceof gcj)) {
                    throw vz1.i(oq5Var, -1666158998, false);
                }
                oq5Var.Z(-110358772);
                rzf.f(((gcj) hcjVar).a, 0, oq5Var, wyf.s(vciVar, wpVar));
                oq5Var.p(false);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
