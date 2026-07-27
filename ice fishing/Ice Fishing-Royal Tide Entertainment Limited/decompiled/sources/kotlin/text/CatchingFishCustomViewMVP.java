package kotlin.text;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class CatchingFishCustomViewMVP implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout CatchingFishReduxKtor;

    public CatchingFishCustomViewMVP(CoordinatorLayout coordinatorLayout) {
        this.CatchingFishReduxKtor = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.CatchingFishReduxKtor.CatchingFishAnimationMockk(0);
        return true;
    }
}
