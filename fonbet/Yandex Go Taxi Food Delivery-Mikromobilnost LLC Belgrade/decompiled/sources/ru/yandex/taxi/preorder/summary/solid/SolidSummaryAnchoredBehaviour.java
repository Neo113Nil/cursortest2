package ru.yandex.taxi.preorder.summary.solid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ny61;
import defpackage.wfh0;
import kotlin.Metadata;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/preorder/summary/solid/SolidSummaryAnchoredBehaviour;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "Landroid/view/View;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SolidSummaryAnchoredBehaviour extends CoordinatorLayout.a {
    public SolidSummaryAnchoredBehaviour(Context context, AttributeSet attributeSet) {
        if (context != null) {
            return;
        }
        ny61.g("SolidSummaryAnchoredBehaviour requires non-null Context");
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean b(View view, View view2) {
        return view2.getId() == wfh0.solid_container;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ny61.g("The view is not a child of CoordinatorLayout");
            return false;
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof AnchorBottomSheetBehavior)) {
            ny61.g("The view is not associated with AnchorBottomSheetBehavior");
            return false;
        }
        AnchorBottomSheetBehavior anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) behavior;
        view.setTranslationY((-coordinatorLayout.getHeight()) + Math.max(view2.getTop(), anchorBottomSheetBehavior.w(anchorBottomSheetBehavior.x)));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        View findViewById = !(view.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) ? null : coordinatorLayout.findViewById(wfh0.solid_container);
        if (findViewById == null) {
            return false;
        }
        e(coordinatorLayout, view, findViewById);
        return false;
    }

    public SolidSummaryAnchoredBehaviour() {
    }
}
