package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.a;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.eup;
import defpackage.fzo;
import defpackage.gzo;
import defpackage.ivf;
import defpackage.mhm;
import defpackage.pd;
import defpackage.qgg;
import defpackage.qq6;
import defpackage.rvf;
import defpackage.vdn;
import defpackage.vp0;
import defpackage.y2x;
import java.util.LinkedHashSet;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class SearchBar extends Toolbar {
    public final TextView D0;
    public final TextView E0;
    public final FrameLayout F0;
    public final int G0;
    public boolean H0;
    public final ColorStateList I0;
    public final boolean J0;
    public final boolean K0;
    public final mhm L0;
    public final Drawable M0;
    public final boolean N0;
    public final boolean O0;
    public View P0;
    public final Integer Q0;
    public Drawable R0;
    public int S0;
    public boolean T0;
    public final a U0;
    public boolean V0;
    public int W0;
    public ActionMenuView X0;
    public ImageButton Y0;
    public final fzo Z0;

    public SearchBar(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.S0 = -1;
        this.Z0 = new fzo(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                qq6.d("SearchBar does not support title. Use hint or text instead.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                qq6.d("SearchBar does not support subtitle. Use hint or text instead.");
                throw null;
            }
        }
        Drawable w = y2x.w(context2, getDefaultNavigationIconResource());
        this.M0 = w;
        mhm mhmVar = new mhm();
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.L0 = mhmVar;
        TypedArray B = bcx.B(context2, attributeSet, vdn.L, i, R.style.Widget_Material3_SearchBar, new int[0]);
        eup e = eup.c(context2, attributeSet, i, R.style.Widget_Material3_SearchBar).e();
        int color = B.getColor(4, 0);
        this.G0 = color;
        this.I0 = ivf.D(context2, B, 11);
        float dimension = B.getDimension(7, 0.0f);
        this.K0 = B.getBoolean(5, true);
        this.T0 = B.getBoolean(6, true);
        boolean z = B.getBoolean(9, false);
        this.O0 = B.getBoolean(8, false);
        this.N0 = B.getBoolean(16, true);
        if (B.hasValue(12)) {
            this.Q0 = Integer.valueOf(B.getColor(12, -1));
        }
        int resourceId = B.getResourceId(0, -1);
        String string = B.getString(2);
        String string2 = B.getString(3);
        float dimension2 = B.getDimension(14, -1.0f);
        int color2 = B.getColor(13, 0);
        this.V0 = B.getBoolean(15, false);
        this.H0 = B.getBoolean(10, false);
        this.W0 = B.getDimensionPixelSize(1, -1);
        B.recycle();
        if (!z) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : w);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.J0 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.D0 = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.E0 = textView2;
        this.F0 = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        setTextCentered(this.V0);
        a aVar = new a(e);
        this.U0 = aVar;
        aVar.n(getContext());
        this.U0.q(dimension);
        if (dimension2 >= 0.0f) {
            a aVar2 = this.U0;
            aVar2.b.k = dimension2;
            aVar2.invalidateSelf();
            aVar2.x(ColorStateList.valueOf(color2));
        }
        int N = qgg.N(R.attr.colorControlHighlight, this);
        this.U0.r(ColorStateList.valueOf(color));
        ColorStateList valueOf = ColorStateList.valueOf(N);
        a aVar3 = this.U0;
        setBackground(new RippleDrawable(valueOf, aVar3, aVar3));
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton H = pd.H(this);
        if (H == null) {
            return;
        }
        H.setClickable(!z);
        H.setFocusable(!z);
        Drawable background = H.getBackground();
        if (background != null) {
            this.R0 = background;
        }
        H.setBackgroundDrawable(z ? null : this.R0);
        y();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.J0 && this.P0 == null && !(view instanceof ActionMenuView)) {
            this.P0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public View getCenterView() {
        return this.P0;
    }

    public float getCompatElevation() {
        a aVar = this.U0;
        return aVar != null ? aVar.b.n : getElevation();
    }

    public float getCornerSize() {
        return this.U0.l();
    }

    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.D0.getHint();
    }

    public int getMaxWidth() {
        return this.W0;
    }

    public int getMenuResId() {
        return this.S0;
    }

    public TextView getPlaceholderTextView() {
        return this.E0;
    }

    public int getStrokeColor() {
        return this.U0.b.e.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.U0.b.k;
    }

    @NonNull
    public CharSequence getText() {
        return this.D0.getText();
    }

    public boolean getTextCentered() {
        return this.V0;
    }

    @NonNull
    public TextView getTextView() {
        return this.D0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        super.m(i);
        this.S0 = i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rvf.K(this, this.U0);
        if (this.K0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            if (i == 0) {
                i = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i;
            int i2 = marginLayoutParams.topMargin;
            if (i2 == 0) {
                i2 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i2;
            int i3 = marginLayoutParams.rightMargin;
            if (i3 != 0) {
                dimensionPixelSize = i3;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i4 = marginLayoutParams.bottomMargin;
            if (i4 != 0) {
                dimensionPixelSize2 = i4;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        z();
        if (this.H0) {
            x();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.s.remove(this.Z0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.P0;
        if (view != null && view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        y();
        TextView textView = this.D0;
        if (textView == null || !this.V0) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.F0;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        boolean z2 = getLayoutDirection() == 1;
        if (this.X0 == null) {
            this.X0 = pd.F(this);
        }
        View view2 = this.X0;
        if (this.Y0 == null) {
            this.Y0 = pd.H(this);
        }
        View view3 = this.Y0;
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i7 = measuredWidth6 + measuredWidth4;
        int i8 = measuredWidth7 + measuredWidth4;
        View view4 = z2 ? view2 : view3;
        if (z2) {
            view2 = view3;
        }
        int max = view4 != null ? Math.max(view4.getRight() - i7, 0) : 0;
        int i9 = i7 + max;
        int i10 = i8 + max;
        int max2 = view2 != null ? Math.max(i10 - view2.getLeft(), 0) : 0;
        int i11 = i9 - max2;
        int i12 = i10 - max2;
        int max3 = ((max - max2) + Math.max(Math.max(getPaddingLeft() - i11, getContentInsetLeft() - i11), 0)) - Math.max(Math.max(i12 - (getMeasuredWidth() - getPaddingRight()), i12 - (getMeasuredWidth() - getContentInsetRight())), 0);
        frameLayout.layout(measuredWidth4 + max3, measuredHeight3, measuredWidth5 + max3, measuredHeight4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.W0;
        if (i3 >= 0 && i3 < View.MeasureSpec.getSize(i)) {
            i = View.MeasureSpec.makeMeasureSpec(this.W0, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        View view = this.P0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof gzo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gzo gzoVar = (gzo) parcelable;
        super.onRestoreInstanceState(gzoVar.a);
        setText(gzoVar.c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        gzo gzoVar = new gzo(super.onSaveInstanceState());
        CharSequence text = getText();
        gzoVar.c = text == null ? null : text.toString();
        return gzoVar;
    }

    public void setCenterView(View view) {
        View view2 = this.P0;
        if (view2 != null) {
            removeView(view2);
            this.P0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.T0 = z;
        z();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        a aVar = this.U0;
        if (aVar != null) {
            aVar.q(f);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.D0.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z) {
        this.H0 = z;
        if (z) {
            x();
            return;
        }
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.s.remove(this.Z0);
        }
    }

    public void setMaxWidth(int i) {
        if (this.W0 != i) {
            this.W0 = i;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int N;
        if (this.N0 && drawable != null) {
            Integer num = this.Q0;
            if (num != null) {
                N = num.intValue();
            } else {
                N = qgg.N(drawable == this.M0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface, this);
            }
            drawable = drawable.mutate();
            drawable.setTint(N);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.O0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.L0.getClass();
    }

    public void setPlaceholderText(String str) {
        this.E0.setText(str);
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.U0.x(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            a aVar = this.U0;
            aVar.b.k = f;
            aVar.invalidateSelf();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.D0.setText(charSequence);
        this.E0.setText(charSequence);
    }

    public void setTextCentered(boolean z) {
        this.V0 = z;
        TextView textView = this.D0;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            layoutParams.gravity = 1;
            textView.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            textView.setGravity(0);
        }
        textView.setLayoutParams(layoutParams);
        this.E0.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void x() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.I0 == null) {
            return;
        }
        appBarLayoutParentIfExists.s.add(this.Z0);
    }

    public final void y() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton H = pd.H(this);
        int width = (H == null || !H.isClickable()) ? 0 : z ? getWidth() - H.getLeft() : H.getRight();
        ActionMenuView F = pd.F(this);
        int right = F != null ? z ? F.getRight() : getWidth() - F.getLeft() : 0;
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    public final void z() {
        if (getLayoutParams() instanceof vp0) {
            vp0 vp0Var = (vp0) getLayoutParams();
            if (this.T0) {
                if (vp0Var.a == 0) {
                    vp0Var.a = 53;
                }
            } else if (vp0Var.a == 53) {
                vp0Var.a = 0;
            }
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.uk6
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof AppBarLayout)) {
                this.initialized = true;
                setAppBarLayoutTransparent((AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        @Override // com.google.android.material.appbar.g
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }
    }

    public void setHint(int i) {
        this.D0.setHint(i);
    }

    public void setText(int i) {
        this.D0.setText(i);
        this.E0.setText(i);
    }

    public SearchBar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }
}
