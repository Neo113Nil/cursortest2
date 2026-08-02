package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public final class n07 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a = 1;
    public final ViewGroup b;

    public n07(LinearLayout linearLayout) {
        linearLayout.getClass();
        this.b = linearLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                TransitionManager.endTransitions(this.b);
                break;
            default:
                l8t.b(this.b);
                break;
        }
    }

    public n07(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this.b = constraintLayout;
    }
}
