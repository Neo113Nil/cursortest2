package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.bb.a;
import com.gamericefishpro.space.d6.c;
import com.gamericefishpro.space.r4.d;
import com.gamericefishpro.space.r5.b0;
import com.gamericefishpro.space.r5.c0;
import com.gamericefishpro.space.r5.j0;
import com.gamericefishpro.space.z9.b;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends b0 {
    public final d k;
    public c l;
    public final View.OnLayoutChangeListener m;

    public CarouselLayoutManager() {
        d dVar = new d();
        new b();
        this.m = new View.OnLayoutChangeListener() { // from class: com.gamericefishpro.space.z9.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                view.post(new com.appsflyer.a(26, this.a));
            }
        };
        this.k = dVar;
        W();
        d0(0);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean E() {
        return true;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void K(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        d dVar = this.k;
        float dimension = dVar.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        dVar.a = dimension;
        float dimension2 = dVar.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        dVar.b = dimension2;
        W();
        recyclerView.addOnLayoutChangeListener(this.m);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void L(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.m);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void M(AccessibilityEvent accessibilityEvent) {
        super.M(accessibilityEvent);
        if (q() > 0) {
            accessibilityEvent.setFromIndex(b0.A(p(0)));
            accessibilityEvent.setToIndex(b0.A(p(q() - 1)));
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean V(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int X(int i, a aVar, j0 j0Var) {
        if (!c0() || q() == 0 || i == 0) {
            return 0;
        }
        aVar.f(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int Y(int i, a aVar, j0 j0Var) {
        if (!d() || q() == 0 || i == 0) {
            return 0;
        }
        aVar.f(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean c() {
        return c0();
    }

    public final boolean c0() {
        return this.l.a == 0;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final boolean d() {
        return !c0();
    }

    public final void d0(int i) {
        com.gamericefishpro.space.z9.c cVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "invalid orientation:"));
        }
        b(null);
        c cVar2 = this.l;
        if (cVar2 == null || i != cVar2.a) {
            if (i == 0) {
                cVar = new com.gamericefishpro.space.z9.c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new com.gamericefishpro.space.z9.c(this, 0);
            }
            this.l = cVar;
            W();
        }
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int g(j0 j0Var) {
        q();
        return 0;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int h(j0 j0Var) {
        return 0;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int i(j0 j0Var) {
        return 0;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int j(j0 j0Var) {
        q();
        return 0;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int k(j0 j0Var) {
        return 0;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final int l(j0 j0Var) {
        return 0;
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final c0 m() {
        return new c0(-2, -2);
    }

    @Override // com.gamericefishpro.space.r5.b0
    public final void t(View view, Rect rect) {
        super.t(view, rect);
        rect.centerY();
        if (c0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new b();
        this.m = new View.OnLayoutChangeListener() { // from class: com.gamericefishpro.space.z9.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new com.appsflyer.a(26, this.a));
            }
        };
        this.k = new d();
        W();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.gamericefishpro.space.s9.a.b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            W();
            d0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
