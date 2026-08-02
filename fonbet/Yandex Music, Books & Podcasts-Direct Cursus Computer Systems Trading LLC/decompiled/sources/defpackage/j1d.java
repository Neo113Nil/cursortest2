package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.o;

/* loaded from: classes3.dex */
public final class j1d extends o {
    public final g1d g;
    public final fi1 h;
    public final jyr i;

    public j1d(g1d g1dVar, fi1 fi1Var, jyr jyrVar) {
        this.g = g1dVar;
        this.h = fi1Var;
        this.i = jyrVar;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ehv.i);
        composeView.setContent(new wn5(new nha(11, this), -1235548826, true));
        return composeView;
    }
}
