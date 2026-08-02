package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes4.dex */
public final class e3m extends jnb {
    public final cvl j;
    public final dl k;

    public e3m(cvl cvlVar, dl dlVar) {
        this.j = cvlVar;
        this.k = dlVar;
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
        composeView.setContent(new wn5(new d3m(this, 0), -464021555, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return new cvo(wjb.TrackListScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Playlist, this.j.e()), 44);
    }
}
