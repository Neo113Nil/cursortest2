package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes4.dex */
public final class kru extends jnb {
    public final pu0 j;
    public final mpu k;
    public final dsu l;
    public final cvo m = new cvo(wjb.MultivibeScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);

    public kru(pu0 pu0Var, mpu mpuVar, dsu dsuVar) {
        this.j = pu0Var;
        this.k = mpuVar;
        this.l = dsuVar;
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
        composeView.setContent(new wn5(new jru(this, 0), 911301618, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return this.m;
    }
}
