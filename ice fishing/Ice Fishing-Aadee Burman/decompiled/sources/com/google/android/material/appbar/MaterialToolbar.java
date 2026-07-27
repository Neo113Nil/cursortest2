package com.google.android.material.appbar;

import B.i;
import E3.g;
import J3.a;
import L3.F;
import O.L;
import O.X;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.icefishing.icefishinglive2.C5275R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import l.m;
import y3.k;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: I0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f35809I0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: D0, reason: collision with root package name */
    public Integer f35810D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f35811E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f35812F0;

    /* renamed from: G0, reason: collision with root package name */
    public ImageView.ScaleType f35813G0;

    /* renamed from: H0, reason: collision with root package name */
    public Boolean f35814H0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5275R.attr.toolbarStyle, C5275R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray f3 = k.f(context2, attributeSet, AbstractC4632a.f38646s, C5275R.attr.toolbarStyle, C5275R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (f3.hasValue(2)) {
            setNavigationIconTint(f3.getColor(2, -1));
        }
        this.f35811E0 = f3.getBoolean(4, false);
        this.f35812F0 = f3.getBoolean(3, false);
        int i = f3.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f35809I0;
            if (i < scaleTypeArr.length) {
                this.f35813G0 = scaleTypeArr[i];
            }
        }
        if (f3.hasValue(0)) {
            this.f35814H0 = Boolean.valueOf(f3.getBoolean(0, false));
        }
        f3.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : V2.a.n(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.j(valueOf);
            gVar.h(context2);
            WeakHashMap weakHashMap = X.f2054a;
            gVar.i(L.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f35813G0;
    }

    public Integer getNavigationIconTint() {
        return this.f35810D0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z3 = menu instanceof m;
        if (z3) {
            ((m) menu).w();
        }
        super.m(i);
        if (z3) {
            ((m) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            F.s(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z3, i, i6, i9, i10);
        int i11 = 0;
        ImageView imageView2 = null;
        if (this.f35811E0 || this.f35812F0) {
            ArrayList d2 = k.d(this, getTitle());
            boolean isEmpty = d2.isEmpty();
            i iVar = k.f41924c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(d2, iVar);
            ArrayList d9 = k.d(this, getSubtitle());
            TextView textView2 = d9.isEmpty() ? null : (TextView) Collections.max(d9, iVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i12 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i12 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i12 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f35811E0 && textView != null) {
                    x(textView, pair);
                }
                if (this.f35812F0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i11);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i11++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f35814H0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f35813G0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f3);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f35814H0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f35814H0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f35813G0 != scaleType) {
            this.f35813G0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f35810D0 != null) {
            drawable = drawable.mutate();
            H.a.g(drawable, this.f35810D0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f35810D0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f35812F0 != z3) {
            this.f35812F0 = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f35811E0 != z3) {
            this.f35811E0 = z3;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i6 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i6 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i6 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i6 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i6, textView.getBottom());
    }
}
