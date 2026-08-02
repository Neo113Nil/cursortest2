package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes4.dex */
public final class p65 extends jnb {
    public final pu0 j;
    public final c65 k;
    public final cvo l = new cvo(wjb.CollectionVideoclipsScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final ybf m = new ybf(ern.a(u65.class), new gz4(3, this), new gz4(4, new o65(this, 0)));
    public final jyr n = btf.b(new o65(this, 1));

    public p65(pu0 pu0Var, c65 c65Var) {
        this.j = pu0Var;
        this.k = c65Var;
    }

    public final void A(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1045822251);
        int i2 = (oq5Var.h(this) ? 32 : 16) | i;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            jf0.a(new qzm[0], this.j, false, ild.C(-1868027059, new y61(wn5Var, 4), oq5Var), oq5Var, 0, 4);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(this, wn5Var, i, 23);
        }
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new kv4(4, this), -813923074, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getN() {
        return this.l;
    }
}
