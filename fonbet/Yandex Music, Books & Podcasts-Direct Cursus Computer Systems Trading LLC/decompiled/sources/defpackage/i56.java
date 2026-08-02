package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes3.dex */
public final class i56 extends jnb {
    public final pu0 j;
    public final e56 k;
    public final jyr l = btf.b(new r25(24, this));

    public i56(pu0 pu0Var, e56 e56Var) {
        this.j = pu0Var;
        this.k = e56Var;
    }

    public final void A(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-675109900);
        if ((((oq5Var.h(this) ? 32 : 16) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pu0 pu0Var = this.j;
            jf0.g(new qzm[0], ((Boolean) gld.O(pu0Var.a, oq5Var).getValue()).booleanValue(), pu0Var.b, pu0Var.c, ild.C(2107285454, new y61(wn5Var, 6), oq5Var), oq5Var, 24576);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(this, wn5Var, i, 6);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new h56(this, 0), 1879352789, true));
        return composeView;
    }
}
