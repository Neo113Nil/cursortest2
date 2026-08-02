package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import flex.theme.ThemedColor;

/* loaded from: classes4.dex */
public final class qjh extends pjm0 {
    public final exy0 a;
    public FrameLayout b;
    public dxy0 c;

    public qjh(exy0 exy0Var) {
        this.a = exy0Var;
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        return (FrameLayout) view;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        this.b = frameLayout;
        return frameLayout;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.b = null;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        ew2 ew2Var = (ew2) obj;
        dxy0 dxy0Var = this.c;
        if (dxy0Var != null) {
            dxy0Var.x();
        }
        ThemedColor themedColor = ((ojh) ((mjm0) ew2Var.b)).a;
        FrameLayout frameLayout = this.b;
        exy0 exy0Var = this.a;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(exy0Var.a(themedColor));
        }
        if (themedColor != null) {
            this.c = exy0Var.b(themedColor, new pjh(0, this));
        }
    }
}
