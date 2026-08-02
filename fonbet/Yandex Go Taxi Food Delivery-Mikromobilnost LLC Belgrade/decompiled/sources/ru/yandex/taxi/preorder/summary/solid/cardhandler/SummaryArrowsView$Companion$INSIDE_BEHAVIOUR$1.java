package ru.yandex.taxi.preorder.summary.solid.cardhandler;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ArrowsView;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ru/yandex/taxi/preorder/summary/solid/cardhandler/SummaryArrowsView$Companion$INSIDE_BEHAVIOUR$1", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$a;", "Lru/yandex/taxi/widget/ArrowsView;", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SummaryArrowsView$Companion$INSIDE_BEHAVIOUR$1 extends CoordinatorLayout.a {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ((ArrowsView) view).setTranslationY(-r2.getPaddingTop());
        return true;
    }
}
