package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes3.dex */
public final class c2d extends jnb {
    public final pu0 j;
    public final w1d k;

    public c2d(pu0 pu0Var, w1d w1dVar) {
        this.j = pu0Var;
        this.k = w1dVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new b2d(this, 0), 1116492747, true));
        return composeView;
    }
}
