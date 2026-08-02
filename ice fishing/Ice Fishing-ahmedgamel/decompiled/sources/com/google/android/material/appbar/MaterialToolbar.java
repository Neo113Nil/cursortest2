package com.google.android.material.appbar;

import A3.n;
import A3.o;
import G3.g;
import L3.a;
import O.L;
import O.X;
import Z2.d;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l.m;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: D0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f36578D0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: A0, reason: collision with root package name */
    public boolean f36579A0;

    /* renamed from: B0, reason: collision with root package name */
    public ImageView.ScaleType f36580B0;
    public Boolean C0;

    /* renamed from: y0, reason: collision with root package name */
    public Integer f36581y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f36582z0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5248R.attr.toolbarStyle, C5248R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC4742a.f39435s, C5248R.attr.toolbarStyle, C5248R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (f2.hasValue(2)) {
            setNavigationIconTint(f2.getColor(2, -1));
        }
        this.f36582z0 = f2.getBoolean(4, false);
        this.f36579A0 = f2.getBoolean(3, false);
        int i = f2.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f36578D0;
            if (i < scaleTypeArr.length) {
                this.f36580B0 = scaleTypeArr[i];
            }
        }
        if (f2.hasValue(0)) {
            this.C0 = Boolean.valueOf(f2.getBoolean(0, false));
        }
        f2.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : h.d(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.j(valueOf);
            gVar.h(context2);
            WeakHashMap weakHashMap = X.f2142a;
            gVar.i(L.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f36580B0;
    }

    public Integer getNavigationIconTint() {
        return this.f36581y0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z6 = menu instanceof m;
        if (z6) {
            ((m) menu).w();
        }
        super.m(i);
        if (z6) {
            ((m) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            d.q(this, (g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z6, i, i4, i6, i9);
        int i10 = 0;
        ImageView imageView2 = null;
        if (this.f36582z0 || this.f36579A0) {
            ArrayList d9 = n.d(this, getTitle());
            boolean isEmpty = d9.isEmpty();
            o oVar = n.f180c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(d9, oVar);
            ArrayList d10 = n.d(this, getSubtitle());
            TextView textView2 = d10.isEmpty() ? null : (TextView) Collections.max(d10, oVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i11 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f36582z0 && textView != null) {
                    x(textView, pair);
                }
                if (this.f36579A0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i10 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i10);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i10++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.C0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f36580B0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z6) {
        Boolean bool = this.C0;
        if (bool == null || bool.booleanValue() != z6) {
            this.C0 = Boolean.valueOf(z6);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f36580B0 != scaleType) {
            this.f36580B0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f36581y0 != null) {
            drawable = drawable.mutate();
            H.a.g(drawable, this.f36581y0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f36581y0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f36579A0 != z6) {
            this.f36579A0 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f36582z0 != z6) {
            this.f36582z0 = z6;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i4 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i4 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i4, textView.getBottom());
    }
}
