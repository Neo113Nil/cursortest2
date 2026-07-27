package kotlin.text;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishHandlerToolbar extends CatchingFishJUnitToastKtor {
    public CatchingFishMVIContext CatchingFishParcelableFAB;

    public void CatchingFishNavigation(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.CatchingFishStateLiveData(view, i);
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        CatchingFishNavigation(coordinatorLayout, view, i);
        if (this.CatchingFishParcelableFAB == null) {
            this.CatchingFishParcelableFAB = new CatchingFishMVIContext(view);
        }
        CatchingFishMVIContext catchingFishMVIContext = this.CatchingFishParcelableFAB;
        View view2 = (View) catchingFishMVIContext.CatchingFishWorkManager;
        catchingFishMVIContext.CatchingFishReduxKtor = view2.getTop();
        catchingFishMVIContext.CatchingFishDaggerWebsocket = view2.getLeft();
        CatchingFishMVIContext catchingFishMVIContext2 = this.CatchingFishParcelableFAB;
        View view3 = (View) catchingFishMVIContext2.CatchingFishWorkManager;
        int top = 0 - (view3.getTop() - catchingFishMVIContext2.CatchingFishReduxKtor);
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - catchingFishMVIContext2.CatchingFishDaggerWebsocket));
        return true;
    }
}
