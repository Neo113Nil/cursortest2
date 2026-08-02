package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.bubbles.BubblePopupWindow;
import com.yandex.bubbles.b;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredGravity;
import com.ybsdk.widgets.tooltip.TooltipCommon$PreferredPosition;
import com.ybsdk.widgets.tooltip.a;
import com.ybsdk.widgets.tooltip.util.TooltipPopupWindow;

/* loaded from: classes11.dex */
public final /* synthetic */ class v6e0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View w;
    public final /* synthetic */ Object x;

    public /* synthetic */ v6e0(Object obj, ImageView imageView, View view, View view2, int i) {
        this.a = i;
        this.x = obj;
        this.b = imageView;
        this.c = view;
        this.w = view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        boolean intersect;
        wce0 fe6Var;
        boolean z;
        TooltipCommon$PreferredPosition tooltipCommon$PreferredPosition;
        int i;
        int height;
        ee6 ee6Var;
        ee6 ee6Var2;
        int i2 = this.a;
        View view = this.w;
        View view2 = this.c;
        ImageView imageView = this.b;
        Object obj = this.x;
        int i3 = 1;
        int i4 = 0;
        switch (i2) {
            case 0:
                b bVar = (b) obj;
                if (view2 != null && view2.isShown()) {
                    Rect rect = new Rect();
                    if (view2.getGlobalVisibleRect(rect)) {
                        Point a = ij91.a(view2.getContext());
                        intersect = rect.intersect(new Rect(0, 0, a.x, a.y));
                        if (!intersect) {
                            if (view.isAttachedToWindow()) {
                                int i5 = w6e0.a[bVar.a.ordinal()];
                                int[] iArr = wce0.c;
                                if (i5 == 1) {
                                    view2.getLocationOnScreen(iArr);
                                    fe6Var = iArr[1] > (view2.getRootView().getHeight() - iArr[1]) - view2.getHeight() ? new fe6(view2, view, 1) : new fe6(view2, view, 0);
                                } else if (i5 != 2) {
                                    w511.b();
                                    break;
                                } else {
                                    Point point = new Point(bVar.b);
                                    int i6 = point.x;
                                    int i7 = bVar.i;
                                    point.x = i6 - i7;
                                    point.y += i7;
                                    fe6Var = new u69(view2, view, point);
                                }
                                Point f = fe6Var.f();
                                BubblePopupWindow bubblePopupWindow = bVar.e;
                                if (bubblePopupWindow != null) {
                                    bubblePopupWindow.update(f.x, f.y, -2, -2);
                                }
                                imageView.setRotation(fe6Var.e());
                                int width = imageView.getWidth();
                                View view3 = fe6Var.a;
                                view3.getLocationInWindow(iArr);
                                int measuredWidth = ((view3.getMeasuredWidth() / 2) + (iArr[0] - f.x)) - (width / 2);
                                int dimension = (int) (view3.getContext().getResources().getDimension(ksg0.bubble_arrow_height) + view3.getContext().getResources().getDimension(ksg0.bubble_background_corner_radius));
                                imageView.setTranslationX(Math.min(Math.max(measuredWidth, dimension), (fe6Var.b.getMeasuredWidth() - dimension) - width));
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                                if (layoutParams.gravity != fe6Var.c()) {
                                    layoutParams.gravity = fe6Var.c();
                                    imageView.setLayoutParams(layoutParams);
                                    break;
                                }
                            }
                        } else {
                            view2.getViewTreeObserver().removeOnPreDrawListener(bVar.f);
                            bVar.a();
                            break;
                        }
                    }
                }
                intersect = false;
                if (!intersect) {
                }
                break;
            default:
                a aVar = (a) obj;
                TooltipCommon$PreferredGravity tooltipCommon$PreferredGravity = aVar.m;
                if (view2 != null && view2.isShown()) {
                    Rect rect2 = new Rect();
                    if (view2.getGlobalVisibleRect(rect2)) {
                        Point b = fj91.b(view2.getContext());
                        z = rect2.intersect(new Rect(0, 0, b.x, b.y));
                        view.setVisibility(!z ? 0 : 8);
                        if (view.isAttachedToWindow() && view.getMeasuredWidth() != 0 && !com.ybsdk.core.utils.ext.view.b.i(view2).equals(aVar.z)) {
                            aVar.z = com.ybsdk.core.utils.ext.view.b.i(view2);
                            tooltipCommon$PreferredPosition = aVar.l;
                            Point j = com.ybsdk.core.utils.ext.view.b.j(view2);
                            i = j.y;
                            height = (view2.getRootView().getHeight() - j.y) - view2.getHeight();
                            boolean z2 = i - view2.getHeight() <= view.getHeight();
                            boolean z3 = height <= view.getHeight();
                            if (tooltipCommon$PreferredPosition == TooltipCommon$PreferredPosition.TOP || !z2) {
                                if (tooltipCommon$PreferredPosition != TooltipCommon$PreferredPosition.BOTTOM && z3) {
                                    ee6Var = new ee6(view2, view, i4);
                                } else if (i <= height) {
                                    ee6Var2 = new ee6(view2, view, i3);
                                } else {
                                    ee6Var = new ee6(view2, view, i4);
                                }
                                ee6Var2 = ee6Var;
                            } else {
                                ee6Var2 = new ee6(view2, view, i3);
                            }
                            Point g = ee6Var2.g(tooltipCommon$PreferredGravity);
                            TooltipPopupWindow tooltipPopupWindow = aVar.u;
                            if (tooltipPopupWindow != null) {
                                tooltipPopupWindow.update(g.x, g.y, -2, -2);
                            }
                            imageView.setRotation(ee6Var2.e());
                            imageView.setTranslationX(ee6Var2.d(g, imageView.getWidth(), tooltipCommon$PreferredGravity) + aVar.j);
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                            if (layoutParams2.gravity != ee6Var2.c()) {
                                layoutParams2.gravity = ee6Var2.c();
                                imageView.setLayoutParams(layoutParams2);
                                break;
                            }
                        }
                    }
                }
                z = false;
                view.setVisibility(!z ? 0 : 8);
                if (view.isAttachedToWindow()) {
                    aVar.z = com.ybsdk.core.utils.ext.view.b.i(view2);
                    tooltipCommon$PreferredPosition = aVar.l;
                    Point j2 = com.ybsdk.core.utils.ext.view.b.j(view2);
                    i = j2.y;
                    height = (view2.getRootView().getHeight() - j2.y) - view2.getHeight();
                    if (i - view2.getHeight() <= view.getHeight()) {
                    }
                    if (height <= view.getHeight()) {
                    }
                    if (tooltipCommon$PreferredPosition == TooltipCommon$PreferredPosition.TOP) {
                    }
                    if (tooltipCommon$PreferredPosition != TooltipCommon$PreferredPosition.BOTTOM) {
                    }
                    if (i <= height) {
                    }
                }
                break;
        }
        return true;
    }
}
