package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes3.dex */
public final /* synthetic */ class c34 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c34(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        switch (this.a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.b;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new he0(14, carouselLayoutManager));
                    break;
                }
                break;
            case 1:
                s2e s2eVar = (s2e) this.b;
                if (i8 - i6 != i4 - i2) {
                    b2c b2cVar = ujf.a;
                    Context context = s2eVar.e;
                    b2cVar.getClass();
                    context.getClass();
                    int r = ngg.r(context, s2eVar.E ? 170 : 130) + ((int) TypedValue.applyDimension(1, 106, context.getResources().getDisplayMetrics()));
                    View view2 = s2eVar.i;
                    int i9 = 0;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            i9 = marginLayoutParams.bottomMargin;
                        }
                    } else {
                        su4.s(2, null, "parent container not a View!", null);
                    }
                    s2eVar.z = r - i9;
                    s2eVar.o();
                    break;
                }
                break;
            case 2:
                nbl nblVar = (nbl) this.b;
                int i10 = nblVar.l;
                PopupWindow popupWindow = nblVar.k;
                int i11 = i4 - i2;
                int i12 = i8 - i6;
                if ((i3 - i != i7 - i5 || i11 != i12) && popupWindow.isShowing()) {
                    nblVar.p();
                    popupWindow.update(view, (nblVar.getWidth() - popupWindow.getWidth()) - i10, (-popupWindow.getHeight()) - i10, -1, -1);
                    break;
                }
                break;
            case 3:
                sbl sblVar = (sbl) this.b;
                nbl nblVar2 = sblVar.a;
                int width = (nblVar2.getWidth() - nblVar2.getPaddingLeft()) - nblVar2.getPaddingRight();
                int height3 = (nblVar2.getHeight() - nblVar2.getPaddingBottom()) - nblVar2.getPaddingTop();
                ViewGroup viewGroup = sblVar.c;
                int c = sbl.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int max = Math.max(c, sbl.c(sblVar.k) + sbl.c(sblVar.i));
                ViewGroup viewGroup2 = sblVar.d;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        height2 += marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin;
                    }
                }
                boolean z = width <= max || height3 <= (height2 * 2) + paddingBottom;
                if (sblVar.A != z) {
                    sblVar.A = z;
                    view.post(new obl(sblVar, 0));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!sblVar.A && z2) {
                    view.post(new obl(sblVar, 1));
                    break;
                }
                break;
            default:
                nsu nsuVar = (nsu) this.b;
                if (i8 - i6 != i4 - i2) {
                    nsuVar.a.getHolder().setFixedSize((int) (view.getMeasuredWidth() * nsuVar.d), (int) (view.getMeasuredHeight() * nsuVar.d));
                    break;
                }
                break;
        }
    }
}
