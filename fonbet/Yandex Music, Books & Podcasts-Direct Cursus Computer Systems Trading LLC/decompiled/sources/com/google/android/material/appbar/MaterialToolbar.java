package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.mi;
import defpackage.pd;
import defpackage.rvf;
import defpackage.t1n;
import defpackage.vdn;
import java.util.ArrayList;
import java.util.Collections;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] I0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer D0;
    public boolean E0;
    public boolean F0;
    public ImageView.ScaleType G0;
    public Boolean H0;

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray B = bcx.B(context2, attributeSet, vdn.I, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (B.hasValue(2)) {
            setNavigationIconTint(B.getColor(2, -1));
        }
        this.E0 = B.getBoolean(4, false);
        this.F0 = B.getBoolean(3, false);
        int i2 = B.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = I0;
            if (i2 < scaleTypeArr.length) {
                this.G0 = scaleTypeArr[i2];
            }
        }
        if (B.hasValue(0)) {
            this.H0 = Boolean.valueOf(B.getBoolean(0, false));
        }
        B.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : mi.n(background);
        if (valueOf != null) {
            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a();
            aVar.r(valueOf);
            aVar.n(context2);
            aVar.q(getElevation());
            setBackground(aVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.G0;
    }

    public Integer getNavigationIconTint() {
        return this.D0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rvf.L(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        t1n t1nVar = pd.j;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.E0 || this.F0) {
            ArrayList I = pd.I(this, getTitle());
            TextView textView = I.isEmpty() ? null : (TextView) Collections.min(I, t1nVar);
            ArrayList I2 = pd.I(this, getSubtitle());
            TextView textView2 = I2.isEmpty() ? null : (TextView) Collections.max(I2, t1nVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.E0 && textView != null) {
                    x(textView, pair);
                }
                if (this.F0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.H0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.G0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof com.google.android.material.shape.a) {
            ((com.google.android.material.shape.a) background).q(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.H0;
        if (bool == null || bool.booleanValue() != z) {
            this.H0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.G0 != scaleType) {
            this.G0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.D0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.D0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.D0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.F0 != z) {
            this.F0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.E0 != z) {
            this.E0 = z;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public MaterialToolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }
}
