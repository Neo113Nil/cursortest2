package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
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
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.material.R$styleable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public class SearchBar extends Toolbar {
    public final boolean adaptiveMaxWidthEnabled;
    public final int adaptiveMaxWidthParentBreakpoint;
    public final int backgroundColor;
    public final MaterialShapeDrawable backgroundShape;
    public View centerView;
    public final boolean defaultMarginsEnabled;
    public final Drawable defaultNavigationIcon;
    public boolean defaultScrollFlagsEnabled;
    public int endSiblingViewId;
    public final boolean forceDefaultNavigationOnClickListener;
    public final boolean layoutInflated;
    public final AnonymousClass1 liftColorListener;
    public boolean liftOnScroll;
    public final ColorStateList liftOnScrollColor;
    public int maxWidth;
    public int menuResId;
    public ActionMenuView menuView;
    public ImageButton navIconButton;
    public final Integer navigationIconTint;
    public Drawable originalNavigationIconBackground;
    public final TextView placeholderTextView;
    public final zzc searchBarAnimationHelper;
    public int startSiblingViewId;
    public boolean textCentered;
    public final TextView textView;
    public final FrameLayout textViewContainer;
    public final boolean tintNavigationIcon;

    /* renamed from: com.google.android.material.search.SearchBar$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public AnonymousClass1() {
        }
    }

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(13);
        public String text;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        boolean z;
        this.menuResId = -1;
        this.liftColorListener = new AnonymousClass1();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                a$$ExternalSyntheticBUOutline0.m("SearchBar does not support title. Use hint or text instead.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                a$$ExternalSyntheticBUOutline0.m("SearchBar does not support subtitle. Use hint or text instead.");
                throw null;
            }
        }
        this.adaptiveMaxWidthParentBreakpoint = getResources().getDimensionPixelSize(R.dimen.m3_searchbar_parent_width_breakpoint);
        Drawable drawable = DimensionKt.getDrawable(context2, R.drawable.ic_search_black_24);
        this.defaultNavigationIcon = drawable;
        zzc zzcVar = new zzc(7);
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.searchBarAnimationHelper = zzcVar;
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.SearchBar, i, R.style.Widget_Material3_SearchBar, new int[0]);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder(context2, attributeSet, i, R.style.Widget_Material3_SearchBar).build();
        int color = obtainStyledAttributes.getColor(5, 0);
        this.backgroundColor = color;
        this.liftOnScrollColor = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 13);
        float dimension = obtainStyledAttributes.getDimension(8, RecyclerView.DECELERATION_RATE);
        this.defaultMarginsEnabled = obtainStyledAttributes.getBoolean(6, true);
        this.defaultScrollFlagsEnabled = obtainStyledAttributes.getBoolean(7, true);
        boolean z2 = obtainStyledAttributes.getBoolean(11, false);
        this.forceDefaultNavigationOnClickListener = obtainStyledAttributes.getBoolean(10, false);
        this.tintNavigationIcon = obtainStyledAttributes.getBoolean(19, true);
        if (obtainStyledAttributes.hasValue(14)) {
            this.navigationIconTint = Integer.valueOf(obtainStyledAttributes.getColor(14, -1));
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        CharSequence string2 = obtainStyledAttributes.getString(2);
        CharSequence string3 = obtainStyledAttributes.getString(3);
        float dimension2 = obtainStyledAttributes.getDimension(17, -1.0f);
        int color2 = obtainStyledAttributes.getColor(16, 0);
        this.textCentered = obtainStyledAttributes.getBoolean(18, false);
        this.liftOnScroll = obtainStyledAttributes.getBoolean(12, false);
        this.maxWidth = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.adaptiveMaxWidthEnabled = obtainStyledAttributes.getBoolean(4, false);
        this.startSiblingViewId = obtainStyledAttributes.getResourceId(15, -1);
        this.endSiblingViewId = obtainStyledAttributes.getResourceId(9, -1);
        obtainStyledAttributes.recycle();
        if (z2) {
            z = true;
        } else {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawable);
            z = true;
            setNavigationIconDecorative(true);
        }
        setClickable(z);
        setFocusable(z);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.layoutInflated = z;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.textView = textView;
        TextView textView2 = (TextView) findViewById(R.id.open_search_bar_placeholder_text_view);
        this.placeholderTextView = textView2;
        this.textViewContainer = (FrameLayout) findViewById(R.id.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        setText(string2);
        setHint(string3);
        setTextCentered(this.textCentered);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(build);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(dimension);
        if (dimension2 >= RecyclerView.DECELERATION_RATE) {
            MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
            materialShapeDrawable2.drawableState.strokeWidth = dimension2;
            materialShapeDrawable2.invalidateSelf();
            materialShapeDrawable2.setStrokeColor(ColorStateList.valueOf(color2));
        }
        int resolveColor = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, R.attr.colorControlHighlight));
        this.backgroundShape.setFillColor(ColorStateList.valueOf(color));
        ColorStateList valueOf = ColorStateList.valueOf(resolveColor);
        MaterialShapeDrawable materialShapeDrawable3 = this.backgroundShape;
        RippleDrawable rippleDrawable = new RippleDrawable(valueOf, materialShapeDrawable3, materialShapeDrawable3);
        FocusRingDrawable.layer(getContext(), rippleDrawable, this.backgroundShape);
        setBackground(rippleDrawable);
    }

    public final void addLiftOnScrollProgressListener$1() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.liftOnScrollColor == null) {
            return;
        }
        appBarLayoutParentIfExists.liftProgressListeners.add(this.liftColorListener);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(RecyclerView.DECELERATION_RATE);
        }
        super.addView(view, i, layoutParams);
    }

    public final AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void inflateMenu(int i) {
        super.inflateMenu(i);
        this.menuResId = i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RetryKt.setParentAbsoluteElevation(this, this.backgroundShape);
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_vertical);
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
        setOrClearDefaultScrollFlags();
        if (this.liftOnScroll) {
            addLiftOnScrollProgressListener$1();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.liftProgressListeners.remove(this.liftColorListener);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        TextView textView = this.textView;
        CharSequence text = textView.getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(textView.getHint());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            text = textView.getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.centerView;
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
        setHandwritingBoundsInsets();
        TextView textView = this.textView;
        if (textView == null || !this.textCentered) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.textViewContainer;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        boolean z2 = getLayoutDirection() == 1;
        if (this.menuView == null) {
            this.menuView = ViewUtils.getActionMenuView(this);
        }
        View view2 = this.menuView;
        if (this.navIconButton == null) {
            this.navIconButton = ViewUtils.getNavigationIconButton(this);
        }
        View view3 = this.navIconButton;
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
        int paddingLeft = getPaddingLeft() - i11;
        RtlSpacingHelper rtlSpacingHelper = this.mContentInsets;
        int max3 = Math.max(paddingLeft, (rtlSpacingHelper != null ? rtlSpacingHelper.mLeft : 0) - i11);
        int measuredWidth8 = i12 - (getMeasuredWidth() - getPaddingRight());
        int measuredWidth9 = getMeasuredWidth();
        RtlSpacingHelper rtlSpacingHelper2 = this.mContentInsets;
        int max4 = ((max - max2) + Math.max(max3, 0)) - Math.max(Math.max(measuredWidth8, i12 - (measuredWidth9 - (rtlSpacingHelper2 != null ? rtlSpacingHelper2.mRight : 0))), 0);
        frameLayout.layout(measuredWidth4 + max4, measuredHeight3, measuredWidth5 + max4, measuredHeight4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = this.maxWidth;
        if (i4 >= 0 && size > i4) {
            i = View.MeasureSpec.makeMeasureSpec(i4, mode);
        } else if (this.adaptiveMaxWidthEnabled && size > (i3 = this.adaptiveMaxWidthParentBreakpoint)) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max(i3, Math.round(size * 0.5f)), mode);
        }
        super.onMeasure(i, i2);
        View view = this.centerView;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        setText(savedState.text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = this.textView.getText();
        savedState.text = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.defaultScrollFlagsEnabled = z;
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    public void setEndSiblingViewId(int i) {
        this.endSiblingViewId = i;
    }

    public final void setHandwritingBoundsInsets() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton navigationIconButton = ViewUtils.getNavigationIconButton(this);
        int width = (navigationIconButton == null || !navigationIconButton.isClickable()) ? 0 : z ? getWidth() - navigationIconButton.getLeft() : navigationIconButton.getRight();
        ActionMenuView actionMenuView = ViewUtils.getActionMenuView(this);
        int right = actionMenuView != null ? z ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft() : 0;
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, RecyclerView.DECELERATION_RATE, -width, RecyclerView.DECELERATION_RATE);
    }

    public void setHint(CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
        if (z) {
            addLiftOnScrollProgressListener$1();
            return;
        }
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.liftProgressListeners.remove(this.liftColorListener);
        }
    }

    public void setMaxWidth(int i) {
        if (this.maxWidth != i) {
            this.maxWidth = i;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int resolveColor;
        if (this.tintNavigationIcon && drawable != null) {
            Integer num = this.navigationIconTint;
            if (num != null) {
                resolveColor = num.intValue();
            } else {
                resolveColor = MaterialColors.resolveColor(getContext(), MaterialAttributes.resolveTypedValueOrThrow(this, drawable == this.defaultNavigationIcon ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface));
            }
            drawable = drawable.mutate();
            drawable.setTint(resolveColor);
        }
        super.setNavigationIcon(drawable);
    }

    public final void setNavigationIconDecorative(boolean z) {
        ImageButton navigationIconButton = ViewUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z);
        navigationIconButton.setFocusable(!z);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        navigationIconButton.setBackgroundDrawable(z ? null : this.originalNavigationIconBackground);
        setHandwritingBoundsInsets();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.searchBarAnimationHelper.getClass();
    }

    public final void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.scrollFlags == 0) {
                    layoutParams.scrollFlags = 53;
                }
            } else if (layoutParams.scrollFlags == 53) {
                layoutParams.scrollFlags = 0;
            }
        }
    }

    public void setStartSiblingViewId(int i) {
        this.startSiblingViewId = i;
    }

    public void setStrokeColor(int i) {
        if (this.backgroundShape.drawableState.strokeColor.getDefaultColor() != i) {
            this.backgroundShape.setStrokeColor(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        MaterialShapeDrawable.MaterialShapeDrawableState materialShapeDrawableState = materialShapeDrawable.drawableState;
        if (materialShapeDrawableState.strokeWidth != f) {
            materialShapeDrawableState.strokeWidth = f;
            materialShapeDrawable.invalidateSelf();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
        this.placeholderTextView.setText(charSequence);
    }

    public void setTextCentered(boolean z) {
        this.textCentered = z;
        TextView textView = this.textView;
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
        this.placeholderTextView.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean initialized;

        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof AppBarLayout)) {
                this.initialized = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setTouchscreenBlocksFocus(false);
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(RecyclerView.DECELERATION_RATE);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }
    }

    public void setHint(int i) {
        this.textView.setHint(i);
    }

    public void setText(int i) {
        this.textView.setText(i);
        this.placeholderTextView.setText(i);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public SearchBar(Context context) {
        this(context, null);
    }
}
