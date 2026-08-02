package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes4.dex */
public final class dfv extends jnb {
    public final pu0 j;
    public final wev k;
    public final String l;
    public final boolean m;
    public final xfv o;
    public final boolean n = true;
    public final ybf p = new ybf(ern.a(tfv.class), new xpp(29, this), new cfv(0, new jvu(16, this)));

    public dfv(pu0 pu0Var, wev wevVar, String str, boolean z, xfv xfvVar) {
        this.j = pu0Var;
        this.k = wevVar;
        this.l = str;
        this.m = z;
        this.o = xfvVar;
    }

    @Override // defpackage.jnb, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ybf ybfVar = this.p;
        ox6.B(((tfv) ybfVar.getValue()).H(), wyf.F(getLifecycle()), new lot(17, this));
        if (bundle == null) {
            ((tfv) ybfVar.getValue()).L(this.l, this.m);
        }
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
        composeView.setContent(new wn5(new afv(this, 0), 1986813826, true));
        return composeView;
    }
}
