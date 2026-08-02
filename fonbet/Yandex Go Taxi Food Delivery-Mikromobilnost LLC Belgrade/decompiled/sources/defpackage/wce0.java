package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.WindowInsets;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;

/* loaded from: classes11.dex */
public abstract class wce0 {
    public static final int[] c = new int[2];
    public final View a;
    public final View b;

    public /* synthetic */ wce0(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public int a(Point point, TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity) {
        int i;
        int measuredWidth;
        int measuredWidth2;
        View view = this.a;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        int i2 = rootWindowInsets != null ? n751.h(null, rootWindowInsets).a.h(519).a : 0;
        int i3 = fj91.b(view.getContext()).x;
        View view2 = this.b;
        int width = (i3 - view2.getWidth()) + i2;
        int i4 = vce0.a[tooltipCommon$PreferredGravity.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                measuredWidth = (view.getMeasuredWidth() / 2) + point.x;
                measuredWidth2 = view2.getMeasuredWidth() / 2;
            } else {
                if (i4 != 3) {
                    w511.b();
                    return 0;
                }
                measuredWidth = view.getMeasuredWidth() + point.x;
                measuredWidth2 = view2.getMeasuredWidth();
            }
            i = measuredWidth - measuredWidth2;
        } else {
            i = point.x;
        }
        if (width < i2) {
            width = i2;
        }
        return y6i0.d(i, i2, width);
    }

    public int b(int[] iArr) {
        int i = iArr[0];
        View view = this.a;
        int measuredWidth = (view.getMeasuredWidth() / 2) + i;
        View view2 = this.b;
        int measuredWidth2 = measuredWidth - (view2.getMeasuredWidth() / 2);
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        int stableInsetLeft = rootWindowInsets != null ? rootWindowInsets.getStableInsetLeft() : 0;
        return Math.max(Math.min(measuredWidth2, (ij91.a(view.getContext()).x - view2.getMeasuredWidth()) + stableInsetLeft), stableInsetLeft);
    }

    public abstract int c();

    public int d(Point point, int i, TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity) {
        int i2;
        View view = this.a;
        Point j = b.j(view);
        View view2 = this.b;
        int b = m810.b(view2.getResources().getDimension(mwg0.ybsdk_bubble_arrow_vertical_margin));
        int measuredWidth = (view2.getMeasuredWidth() - b) - i;
        int measuredWidth2 = fj91.b(view2.getContext()).x - view2.getMeasuredWidth();
        int min = Math.min(b, measuredWidth);
        int max = Math.max(b, measuredWidth);
        int i3 = vce0.a[tooltipCommon$PreferredGravity.ordinal()];
        if (i3 == 1) {
            i2 = (j.x - measuredWidth2) + b;
        } else if (i3 == 2) {
            i2 = ((view.getMeasuredWidth() / 2) + (j.x - point.x)) - (i / 2);
        } else {
            if (i3 != 3) {
                w511.b();
                return 0;
            }
            i2 = ((view.getMeasuredWidth() + j.x) - b) - i;
        }
        return y6i0.d(i2, min, max);
    }

    public abstract float e();

    public abstract Point f();

    public abstract Point g(TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity);
}
