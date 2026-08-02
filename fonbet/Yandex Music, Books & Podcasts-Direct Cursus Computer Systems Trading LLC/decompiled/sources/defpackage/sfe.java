package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes3.dex */
public final class sfe extends jnb {
    public final zfe j;
    public final nfe k;
    public final cvo l = new cvo(wjb.RestorePurchasesScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final jyr m = btf.b(new qfe(this, 0));
    public final ybf n = new ybf(ern.a(ige.class), new pva(12, this), new pva(13, new qfe(this, 1)));

    public sfe(zfe zfeVar, nfe nfeVar) {
        this.j = zfeVar;
        this.k = nfeVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new rfe(this, 0), -959590176, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return this.l;
    }
}
