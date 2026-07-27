package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class CatchingFishAppCompatOkHttp implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout CatchingFishReduxKtor;

    public CatchingFishAppCompatOkHttp(CoordinatorLayout coordinatorLayout) {
        this.CatchingFishReduxKtor = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.CatchingFishReduxKtor.CatchingFishJetpackCompose;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.CatchingFishReduxKtor;
        coordinatorLayout.CatchingFishAnimationMockk(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.CatchingFishJetpackCompose;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
