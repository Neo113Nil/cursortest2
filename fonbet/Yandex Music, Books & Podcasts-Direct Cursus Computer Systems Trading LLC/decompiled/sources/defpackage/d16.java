package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.a;

/* loaded from: classes3.dex */
public final class d16 extends jnb implements q1s {
    public final u12 j;
    public final gfo k = gfo.Tab;
    public final jyr l = btf.b(new a16(this, 0));
    public final ix6 m = new ix6(19, new suc(this, new ruc("ConcertTabFragment", true)));
    public final jyr n = btf.b(new a16(this, 1));
    public final cvo o = new cvo(wjb.ConcertsLandingScreen, hlb.Fullscreen, (glb) null, new dvo("concerts"), (avo) null, 52);
    public final ybf p = new ybf(ern.a(g26.class), new gz4(8, this), new gz4(9, new a16(this, 2)));

    public d16(u12 u12Var) {
        this.j = u12Var;
    }

    public final void A(qnq qnqVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1707996437);
        if ((((oq5Var.h(qnqVar) ? 4 : 2) | i | (oq5Var.h(this) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ybf ybfVar = this.p;
            boolean f = oq5Var.f((g26) ybfVar.getValue());
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                y16 y16Var = (y16) this.l.getValue();
                hn5 hn5Var = qnqVar.b;
                g26 g26Var = (g26) ybfVar.getValue();
                jyr b = btf.b(new a16(this, 3));
                ozw ozwVar = new ozw(18, this);
                qyf F = wyf.F(getLifecycle());
                tmb x = x();
                y16Var.getClass();
                hn5Var.getClass();
                d26 d26Var = new d26(sj.l(), (nmj) ((jyr) y16Var.a.f).getValue(), qnqVar, g26Var, b, new oa1(hn5Var, 1), ozwVar, F, x, sj.k());
                oq5Var.k0(d26Var);
                K = d26Var;
            }
            zc4.b((c26) K, a.a(d.d(vci.a, 1.0f), "concert_landing_content"), oq5Var, 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(this, qnqVar, i, 4);
        }
    }

    @Override // defpackage.q1s
    public final void j() {
        ((g26) this.p.getValue()).T();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        composeView.setViewCompositionStrategy(new sml(viewLifecycleOwner.getLifecycle()));
        composeView.setContent(new wn5(new b16(this, 0), 1252232107, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: y */
    public final gfo getO() {
        return this.k;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return this.o;
    }
}
