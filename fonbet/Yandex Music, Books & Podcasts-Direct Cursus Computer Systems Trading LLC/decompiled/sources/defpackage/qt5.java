package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class qt5 extends jnb {
    public final wt5 j;
    public final cvo k;
    public final ybf l;
    public final jyr m = btf.b(new r25(10, this));

    public qt5(lt5 lt5Var, wt5 wt5Var) {
        this.j = wt5Var;
        this.k = new cvo(wjb.ConcertsGridScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.ConcertsSelection, ouj.o(lt5Var.a, StringUtils.PROCESS_POSTFIX_DELIMITER, lt5Var.b)), 44);
        this.l = new ybf(ern.a(xt5.class), new gz4(5, this), new gz4(6, new ap1(28, this, lt5Var)));
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
        composeView.setContent(new wn5(new pt5(this, 0), 1680569033, true));
        return composeView;
    }

    @Override // defpackage.jnb
    /* renamed from: z */
    public final cvo getK() {
        return this.k;
    }
}
