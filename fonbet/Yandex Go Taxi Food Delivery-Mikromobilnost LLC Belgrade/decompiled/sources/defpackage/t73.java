package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.function.Supplier;
import ru.yandex.taxi.widget.ArrowsView;

/* loaded from: classes10.dex */
public final class t73 extends CoordinatorLayout.a {
    public boolean a;
    public boolean b;
    public final /* synthetic */ ArrowsView c;

    public t73(ArrowsView arrowsView) {
        this.c = arrowsView;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        u((ArrowsView) view, view2);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i) {
        ArrowsView arrowsView = (ArrowsView) view;
        ViewGroup.LayoutParams layoutParams = arrowsView.getLayoutParams();
        View findViewById = !(layoutParams instanceof CoordinatorLayout.LayoutParams) ? null : coordinatorLayout.findViewById(((CoordinatorLayout.LayoutParams) layoutParams).getAnchorId());
        if (findViewById == null) {
            return false;
        }
        u(arrowsView, findViewById);
        return false;
    }

    public final boolean u(ArrowsView arrowsView, View view) {
        Supplier supplier;
        boolean z;
        int paddingTop;
        u73 u73Var;
        Integer num;
        int i;
        Supplier supplier2;
        Integer num2;
        u73 u73Var2;
        Integer num3;
        int i2;
        Integer num4;
        int top = view.getTop();
        int measuredHeight = (arrowsView.getMeasuredHeight() - arrowsView.getPaddingTop()) - arrowsView.getPaddingBottom();
        ArrowsView arrowsView2 = this.c;
        supplier = arrowsView2.insideTopOffsetSupplier;
        int i3 = 0;
        int intValue = (supplier == null || (num4 = (Integer) supplier.get()) == null) ? 0 : num4.intValue();
        if (measuredHeight > top - intValue) {
            paddingTop = (intValue - top) - arrowsView2.getPaddingTop();
            this.b = false;
            if (this.a) {
                z = true;
            } else {
                u73Var2 = arrowsView.decorator;
                ArrowsView arrowsView3 = u73Var2.a;
                num3 = arrowsView3.colorFilter;
                i2 = arrowsView3.arrowEndColor;
                int intValue2 = num3 != null ? num3.intValue() : 0;
                s73 s73Var = new s73(u73Var2.a, 4);
                z = true;
                cma1.e(intValue2, i2, 300L, 0L, s73Var, null);
            }
            this.a = z;
        } else {
            z = true;
            paddingTop = (-measuredHeight) - arrowsView.getPaddingTop();
            this.a = false;
            if (!this.b) {
                u73Var = arrowsView.decorator;
                ArrowsView arrowsView4 = u73Var.a;
                num = arrowsView4.colorFilter;
                i = arrowsView4.arrowDefaultColor;
                cma1.e(num != null ? num.intValue() : 0, i, 300L, 0L, new s73(arrowsView4, 4), null);
            }
            this.b = true;
        }
        supplier2 = arrowsView2.extraTopOffsetSupplier;
        if (supplier2 != null && (num2 = (Integer) supplier2.get()) != null) {
            i3 = num2.intValue();
        }
        arrowsView.setTranslationY(paddingTop + i3);
        return z;
    }
}
