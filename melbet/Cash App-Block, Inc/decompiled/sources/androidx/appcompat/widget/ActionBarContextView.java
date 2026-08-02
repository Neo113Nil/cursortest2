package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.fido.zzfz;
import com.squareup.cash.R;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public class ActionBarContextView extends ViewGroup {
    public ActionMenuPresenter mActionMenuPresenter;
    public View mClose;
    public View mCloseButton;
    public final int mCloseItemLayout;
    public int mContentHeight;
    public View mCustomView;
    public boolean mEatingHover;
    public boolean mEatingTouch;
    public ActionMenuView mMenuView;
    public final Context mPopupContext;
    public CharSequence mSubtitle;
    public final int mSubtitleStyleRes;
    public TextView mSubtitleView;
    public CharSequence mTitle;
    public LinearLayout mTitleLayout;
    public boolean mTitleOptional;
    public final int mTitleStyleRes;
    public TextView mTitleView;
    public final zzfz mVisAnimListener;
    public ViewPropertyAnimatorCompat mVisibilityAnim;

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        zzfz zzfzVar = new zzfz();
        zzfzVar.zza = this;
        zzfzVar.zzc = false;
        this.mVisAnimListener = zzfzVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMode, i, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : DimensionKt.getDrawable(context, resourceId));
        this.mTitleStyleRes = obtainStyledAttributes.getResourceId(5, 0);
        this.mSubtitleStyleRes = obtainStyledAttributes.getResourceId(4, 0);
        this.mContentHeight = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.mCloseItemLayout = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int measureChildView(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, PKIFailureInfo.systemUnavail), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int positionChild(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, m, i, measuredHeight + m);
        } else {
            view.layout(i, m, i + measuredWidth, measuredHeight + m);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void initForMode(ActionMode actionMode) {
        View view = this.mClose;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.mCloseItemLayout, (ViewGroup) this, false);
            this.mClose = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.mClose);
        }
        View findViewById = this.mClose.findViewById(R.id.action_mode_close_button);
        this.mCloseButton = findViewById;
        findViewById.setOnClickListener(new Toolbar.AnonymousClass4(actionMode, 2));
        MenuBuilder menu = actionMode.getMenu();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.hideOverflowMenu();
            ActionMenuPresenter.OverflowPopup overflowPopup = actionMenuPresenter.mActionButtonPopup;
            if (overflowPopup != null && overflowPopup.isShowing()) {
                overflowPopup.mPopup.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.mActionMenuPresenter = actionMenuPresenter2;
        actionMenuPresenter2.mReserveOverflow = true;
        actionMenuPresenter2.mReserveOverflowSet = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menu.addMenuPresenter(this.mActionMenuPresenter, this.mPopupContext);
        ActionMenuPresenter actionMenuPresenter3 = this.mActionMenuPresenter;
        MenuView menuView = actionMenuPresenter3.mMenuView;
        if (menuView == null) {
            MenuView menuView2 = (MenuView) actionMenuPresenter3.mSystemInflater.inflate(actionMenuPresenter3.mMenuLayoutRes, (ViewGroup) this, false);
            actionMenuPresenter3.mMenuView = menuView2;
            menuView2.initialize(actionMenuPresenter3.mMenu);
            actionMenuPresenter3.updateMenuView();
        }
        MenuView menuView3 = actionMenuPresenter3.mMenuView;
        if (menuView != menuView3) {
            ((ActionMenuView) menuView3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) menuView3;
        this.mMenuView = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.mMenuView, layoutParams);
    }

    public final void initTitle() {
        if (this.mTitleLayout == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.mTitleLayout = linearLayout;
            this.mTitleView = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.mSubtitleView = (TextView) this.mTitleLayout.findViewById(R.id.action_bar_subtitle);
            int i = this.mTitleStyleRes;
            if (i != 0) {
                this.mTitleView.setTextAppearance(getContext(), i);
            }
            int i2 = this.mSubtitleStyleRes;
            if (i2 != 0) {
                this.mSubtitleView.setTextAppearance(getContext(), i2);
            }
        }
        this.mTitleView.setText(this.mTitle);
        this.mSubtitleView.setText(this.mSubtitle);
        boolean isEmpty = TextUtils.isEmpty(this.mTitle);
        boolean isEmpty2 = TextUtils.isEmpty(this.mSubtitle);
        this.mSubtitleView.setVisibility(!isEmpty2 ? 0 : 8);
        this.mTitleLayout.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.mTitleLayout.getParent() == null) {
            addView(this.mTitleLayout);
        }
    }

    public final void killMode() {
        removeAllViews();
        this.mCustomView = null;
        this.mMenuView = null;
        this.mActionMenuPresenter = null;
        View view = this.mCloseButton;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.ActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mMaxItems = ActionBarPolicy.get(actionMenuPresenter.mContext).getMaxActionButtons();
            MenuBuilder menuBuilder = actionMenuPresenter.mMenu;
            if (menuBuilder != null) {
                menuBuilder.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.hideOverflowMenu();
            ActionMenuPresenter.OverflowPopup overflowPopup = this.mActionMenuPresenter.mActionButtonPopup;
            if (overflowPopup == null || !overflowPopup.isShowing()) {
                return;
            }
            overflowPopup.mPopup.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.mEatingHover = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.mClose;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mClose.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int positionChild = positionChild(i7, paddingTop, paddingTop2, this.mClose, z2) + i7;
            paddingRight = z2 ? positionChild - i6 : positionChild + i6;
        }
        LinearLayout linearLayout = this.mTitleLayout;
        if (linearLayout != null && this.mCustomView == null && linearLayout.getVisibility() != 8) {
            paddingRight += positionChild(paddingRight, paddingTop, paddingTop2, this.mTitleLayout, z2);
        }
        View view2 = this.mCustomView;
        if (view2 != null) {
            positionChild(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            positionChild(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            a$$ExternalSyntheticBUOutline0.m$1(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            a$$ExternalSyntheticBUOutline0.m$1(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.mContentHeight;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, PKIFailureInfo.systemUnavail);
        View view = this.mClose;
        if (view != null) {
            int measureChildView = measureChildView(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mClose.getLayoutParams();
            paddingLeft = measureChildView - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = measureChildView(this.mMenuView, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.mTitleLayout;
        if (linearLayout != null && this.mCustomView == null) {
            if (this.mTitleOptional) {
                this.mTitleLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.mTitleLayout.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.mTitleLayout.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = measureChildView(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.mCustomView;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.mCustomView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.mContentHeight > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.mEatingTouch = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.mCustomView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mCustomView = view;
        if (view != null && (linearLayout = this.mTitleLayout) != null) {
            removeView(linearLayout);
            this.mTitleLayout = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        initTitle();
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        initTitle();
        ViewCompat.setAccessibilityPaneTitle(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.mTitleOptional) {
            requestLayout();
        }
        this.mTitleOptional = z;
    }

    @Override // android.view.View
    /* renamed from: setVisibility$androidx$appcompat$widget$AbsActionBarView, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mVisibilityAnim;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            super.setVisibility(i);
        }
    }

    public final ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mVisibilityAnim;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        zzfz zzfzVar = this.mVisAnimListener;
        if (i != 0) {
            ViewPropertyAnimatorCompat animate = ViewCompat.animate(this);
            animate.alpha(RecyclerView.DECELERATION_RATE);
            animate.setDuration(j);
            ((ActionBarContextView) zzfzVar.zza).mVisibilityAnim = animate;
            zzfzVar.zzb = i;
            animate.setListener(zzfzVar);
            return animate;
        }
        if (getVisibility() != 0) {
            setAlpha(RecyclerView.DECELERATION_RATE);
        }
        ViewPropertyAnimatorCompat animate2 = ViewCompat.animate(this);
        animate2.alpha(1.0f);
        animate2.setDuration(j);
        ((ActionBarContextView) zzfzVar.zza).mVisibilityAnim = animate2;
        zzfzVar.zzb = i;
        animate2.setListener(zzfzVar);
        return animate2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
