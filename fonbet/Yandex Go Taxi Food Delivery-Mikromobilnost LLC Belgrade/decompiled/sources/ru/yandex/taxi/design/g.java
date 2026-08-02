package ru.yandex.taxi.design;

import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bgc;
import defpackage.npr;
import defpackage.ny61;
import defpackage.sbc;
import defpackage.sls;
import defpackage.xw31;
import defpackage.zy11;

/* loaded from: classes9.dex */
public final class g {
    public final ListItemComponent a;
    public final View b;
    public sls c = new bgc(12);
    public sls d = new bgc(12);
    public final boolean e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public float k;

    public g(ListItemComponent listItemComponent, ClickableImageView clickableImageView) {
        this.a = listItemComponent;
        this.b = clickableImageView;
        this.e = xw31.n(listItemComponent.getContext());
    }

    public final void a() {
        float width;
        float f;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.b.getLocationOnScreen(iArr);
        this.a.getLocationOnScreen(iArr2);
        float f2 = iArr[1];
        this.f = r2.getHeight();
        float f3 = iArr2[1];
        if (this.e) {
            width = iArr[0];
            f = iArr2[0] + r3.getWidth();
            this.i = r3.getWidth();
        } else {
            width = iArr[0] + r2.getWidth();
            f = iArr2[0];
            this.i = 0.0f;
        }
        this.g = width - f;
        this.h = f2 - f3;
        d(0.0f);
    }

    public final void b(View view) {
        final int i = 0;
        if (view instanceof ScrollView) {
            final ScrollView scrollView = (ScrollView) view;
            a();
            final FloatingTitleScrollTracker$ScrollableViewGroupTracker floatingTitleScrollTracker$ScrollableViewGroupTracker = new FloatingTitleScrollTracker$ScrollableViewGroupTracker(scrollView) { // from class: ru.yandex.taxi.design.FloatingTitleScrollTracker$ScrollViewTracker
            };
            floatingTitleScrollTracker$ScrollableViewGroupTracker.init();
            this.c = new sls() { // from class: ru.yandex.taxi.design.f
                @Override // defpackage.sls
                public final Object invoke() {
                    int i2 = i;
                    zy11 zy11Var = zy11.a;
                    FloatingTitleScrollTracker$ScrollableViewGroupTracker floatingTitleScrollTracker$ScrollableViewGroupTracker2 = floatingTitleScrollTracker$ScrollableViewGroupTracker;
                    switch (i2) {
                        case 0:
                            ((FloatingTitleScrollTracker$ScrollViewTracker) floatingTitleScrollTracker$ScrollableViewGroupTracker2).release();
                            break;
                        default:
                            ((FloatingTitleScrollTracker$NestedScrollViewTracker) floatingTitleScrollTracker$ScrollableViewGroupTracker2).release();
                            break;
                    }
                    return zy11Var;
                }
            };
            return;
        }
        if (!(view instanceof RecyclerView)) {
            if (!(view instanceof NestedScrollView)) {
                ny61.g("Unsupported view type");
                return;
            }
            final NestedScrollView nestedScrollView = (NestedScrollView) view;
            a();
            final FloatingTitleScrollTracker$ScrollableViewGroupTracker floatingTitleScrollTracker$ScrollableViewGroupTracker2 = new FloatingTitleScrollTracker$ScrollableViewGroupTracker(nestedScrollView) { // from class: ru.yandex.taxi.design.FloatingTitleScrollTracker$NestedScrollViewTracker
            };
            floatingTitleScrollTracker$ScrollableViewGroupTracker2.init();
            final int i2 = 1;
            this.c = new sls() { // from class: ru.yandex.taxi.design.f
                @Override // defpackage.sls
                public final Object invoke() {
                    int i22 = i2;
                    zy11 zy11Var = zy11.a;
                    FloatingTitleScrollTracker$ScrollableViewGroupTracker floatingTitleScrollTracker$ScrollableViewGroupTracker22 = floatingTitleScrollTracker$ScrollableViewGroupTracker2;
                    switch (i22) {
                        case 0:
                            ((FloatingTitleScrollTracker$ScrollViewTracker) floatingTitleScrollTracker$ScrollableViewGroupTracker22).release();
                            break;
                        default:
                            ((FloatingTitleScrollTracker$NestedScrollViewTracker) floatingTitleScrollTracker$ScrollableViewGroupTracker22).release();
                            break;
                    }
                    return zy11Var;
                }
            };
            return;
        }
        a();
        npr nprVar = new npr(this, (RecyclerView) view);
        RecyclerView recyclerView = nprVar.a;
        recyclerView.addOnScrollListener(nprVar);
        Rect h = xw31.h(recyclerView);
        nprVar.c = h;
        Rect rect = new Rect(h);
        rect.top = this.a.getMeasuredHeight() + h.top;
        nprVar.d = rect;
        xw31.H(recyclerView, rect);
        recyclerView.scrollToPosition(0);
        this.c = new sbc(29, nprVar);
    }

    public final void c(float f) {
        float f2 = this.g * f;
        ListItemComponent listItemComponent = this.a;
        listItemComponent.setTranslationX(f2);
        float f3 = this.h * f;
        d(f);
        float f4 = (1.0f - f) + (f / 1.5f);
        listItemComponent.setTranslationY((((this.f - (listItemComponent.getHeight() / 1.5f)) / 2.0f) * f) + f3);
        listItemComponent.setPivotX(this.i);
        listItemComponent.setPivotY(0.0f);
        listItemComponent.setScaleX(f4);
        listItemComponent.setScaleY(f4);
        if (Float.floatToIntBits(f) != Float.floatToIntBits(this.k)) {
            this.k = f;
            this.d.invoke();
        }
        if (f == 1.0f) {
            listItemComponent.setTitleMaxLines(1);
            listItemComponent.setTitleEllipsizeMode(1);
        } else {
            listItemComponent.setTitleMaxLines(Integer.MAX_VALUE);
            listItemComponent.setTitleEllipsizeMode(0);
        }
    }

    public final void d(float f) {
        float height = this.h + this.b.getHeight();
        ListItemComponent listItemComponent = this.a;
        this.j = (int) (((height - listItemComponent.getHeight()) * f) + listItemComponent.getBottom());
    }
}
