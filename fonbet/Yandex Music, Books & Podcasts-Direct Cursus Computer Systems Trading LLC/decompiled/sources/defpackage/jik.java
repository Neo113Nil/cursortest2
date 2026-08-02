package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes4.dex */
public final class jik extends jnb {
    public final cjk j;
    public final dik k;
    public final ybf l;
    public final jyr m;
    public final cvo n = new cvo(wjb.PaywallScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);

    public jik(n8m n8mVar, suh suhVar, cjk cjkVar, dik dikVar) {
        this.j = cjkVar;
        this.k = dikVar;
        this.l = new ybf(ern.a(gjk.class), new lvj(2, this), new lvj(3, new y6g(29, n8mVar, this)));
        this.m = btf.b(new iik(0, suhVar, this));
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ox6.B(((gjk) this.l.getValue()).G(), wyf.F(getLifecycle()), new fmi(19, this));
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
        composeView.setContent(new wn5(new hik(this, 1), -1130194283, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getJ() {
        return this.n;
    }
}
