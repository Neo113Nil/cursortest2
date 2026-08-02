package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes3.dex */
public final class gk3 extends jnb {
    public final hk3 j;
    public final xj3 k;

    public gk3(hk3 hk3Var, xj3 xj3Var) {
        this.j = hk3Var;
        this.k = xj3Var;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(new wn5(new fk3(this, 0), -80586659, true));
        return composeView;
    }
}
