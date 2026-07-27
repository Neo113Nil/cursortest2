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
import com.catchingfish.fishcatcherpro.R;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishGradleSpannable;
import kotlin.text.CatchingFishIntentMVPDagger;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishMVVMGraphQL;
import kotlin.text.CatchingFishMutableLiveData;
import kotlin.text.CatchingFishOkHttpPicasso;
import kotlin.text.CatchingFishRecyclerView;
import kotlin.text.CatchingFishSharedFlowAdMob;
import kotlin.text.CatchingFishToast;
import kotlin.text.CatchingFishToolbarCameraX;
import kotlin.text.CatchingFishWidgetGlide;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public TextView CatchingFish;
    public View CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public final int CatchingFishCoroutineFlow;
    public boolean CatchingFishDaggerHiltFAB;
    public final Context CatchingFishDaggerWebsocket;
    public CharSequence CatchingFishEspressoTesting;
    public boolean CatchingFishFragmentHandler;
    public final int CatchingFishJetpackCompose;
    public CatchingFishIntentMVPDagger CatchingFishLayout;
    public TextView CatchingFishNavigation;
    public CharSequence CatchingFishOkHttp;
    public final CatchingFishMutableLiveData CatchingFishReduxKtor;
    public LinearLayout CatchingFishRoomDatabase;
    public final int CatchingFishSpannableWidget;
    public View CatchingFishStateLiveData;
    public View CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public CatchingFishToast CatchingFishViewModelScope;
    public ActionMenuView CatchingFishWorkManager;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.CatchingFishReduxKtor = new CatchingFishMutableLiveData(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.CatchingFishDaggerWebsocket = context;
        } else {
            this.CatchingFishDaggerWebsocket = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishWidgetGlide.CatchingFishReduxKtor, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : CatchingFishLayoutRoomFAB.CatchingFishCustomView(context, resourceId));
        this.CatchingFishJetpackCompose = obtainStyledAttributes.getResourceId(5, 0);
        this.CatchingFishCoroutineFlow = obtainStyledAttributes.getResourceId(4, 0);
        this.CatchingFishViewModelFAB = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.CatchingFishSpannableWidget = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int CatchingFishViewModelScope(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public static int CatchingFishWorkManager(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public final void CatchingFishCoroutine(CatchingFishGradleSpannable catchingFishGradleSpannable) {
        View view = this.CatchingFishUnitTesting;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.CatchingFishSpannableWidget, (ViewGroup) this, false);
            this.CatchingFishUnitTesting = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.CatchingFishUnitTesting);
        }
        View findViewById = this.CatchingFishUnitTesting.findViewById(R.id.action_mode_close_button);
        this.CatchingFishAnimationMockk = findViewById;
        findViewById.setOnClickListener(new CatchingFishToolbarCameraX(0, catchingFishGradleSpannable));
        CatchingFishSharedFlowAdMob CatchingFishCoroutine = catchingFishGradleSpannable.CatchingFishCoroutine();
        CatchingFishToast catchingFishToast = this.CatchingFishViewModelScope;
        if (catchingFishToast != null) {
            catchingFishToast.CatchingFishReduxKtor();
            CatchingFishRecyclerView catchingFishRecyclerView = catchingFishToast.CatchingFishSpannableWidget;
            if (catchingFishRecyclerView != null && catchingFishRecyclerView.CatchingFishSnackbar()) {
                catchingFishRecyclerView.CatchingFishLayout.dismiss();
            }
        }
        CatchingFishToast catchingFishToast2 = new CatchingFishToast(getContext());
        this.CatchingFishViewModelScope = catchingFishToast2;
        catchingFishToast2.CatchingFishAnimationMockk = true;
        catchingFishToast2.CatchingFishStateLiveData = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        CatchingFishCoroutine.CatchingFishSnackbar(this.CatchingFishViewModelScope, this.CatchingFishDaggerWebsocket);
        CatchingFishToast catchingFishToast3 = this.CatchingFishViewModelScope;
        CatchingFishOkHttpPicasso catchingFishOkHttpPicasso = catchingFishToast3.CatchingFishCloudMessaging;
        if (catchingFishOkHttpPicasso == null) {
            CatchingFishOkHttpPicasso catchingFishOkHttpPicasso2 = (CatchingFishOkHttpPicasso) catchingFishToast3.CatchingFishViewModelScope.inflate(catchingFishToast3.CatchingFishLayout, (ViewGroup) this, false);
            catchingFishToast3.CatchingFishCloudMessaging = catchingFishOkHttpPicasso2;
            catchingFishOkHttpPicasso2.CatchingFishSnackbar(catchingFishToast3.CatchingFishWorkManager);
            catchingFishToast3.CatchingFishWorkManager();
        }
        CatchingFishOkHttpPicasso catchingFishOkHttpPicasso3 = catchingFishToast3.CatchingFishCloudMessaging;
        if (catchingFishOkHttpPicasso != catchingFishOkHttpPicasso3) {
            ((ActionMenuView) catchingFishOkHttpPicasso3).setPresenter(catchingFishToast3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) catchingFishOkHttpPicasso3;
        this.CatchingFishWorkManager = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.CatchingFishWorkManager, layoutParams);
    }

    public final void CatchingFishDaggerWebsocket() {
        removeAllViews();
        this.CatchingFishStateLiveData = null;
        this.CatchingFishWorkManager = null;
        this.CatchingFishViewModelScope = null;
        View view = this.CatchingFishAnimationMockk;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final CatchingFishIntentMVPDagger CatchingFishLayout(int i, long j) {
        CatchingFishIntentMVPDagger catchingFishIntentMVPDagger = this.CatchingFishLayout;
        if (catchingFishIntentMVPDagger != null) {
            catchingFishIntentMVPDagger.CatchingFishSnackbar();
        }
        CatchingFishMutableLiveData catchingFishMutableLiveData = this.CatchingFishReduxKtor;
        if (i != 0) {
            CatchingFishIntentMVPDagger CatchingFishParcelableFAB = CatchingFishFABCameraX.CatchingFishParcelableFAB(this);
            CatchingFishParcelableFAB.CatchingFishParcelableFAB(0.0f);
            CatchingFishParcelableFAB.CatchingFishCoroutine(j);
            catchingFishMutableLiveData.CatchingFishCoroutine.CatchingFishLayout = CatchingFishParcelableFAB;
            catchingFishMutableLiveData.CatchingFishSnackbar = i;
            CatchingFishParcelableFAB.CatchingFishReduxKtor(catchingFishMutableLiveData);
            return CatchingFishParcelableFAB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        CatchingFishIntentMVPDagger CatchingFishParcelableFAB2 = CatchingFishFABCameraX.CatchingFishParcelableFAB(this);
        CatchingFishParcelableFAB2.CatchingFishParcelableFAB(1.0f);
        CatchingFishParcelableFAB2.CatchingFishCoroutine(j);
        catchingFishMutableLiveData.CatchingFishCoroutine.CatchingFishLayout = CatchingFishParcelableFAB2;
        catchingFishMutableLiveData.CatchingFishSnackbar = i;
        CatchingFishParcelableFAB2.CatchingFishReduxKtor(catchingFishMutableLiveData);
        return CatchingFishParcelableFAB2;
    }

    public final void CatchingFishReduxKtor() {
        if (this.CatchingFishRoomDatabase == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.CatchingFishRoomDatabase = linearLayout;
            this.CatchingFishNavigation = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.CatchingFish = (TextView) this.CatchingFishRoomDatabase.findViewById(R.id.action_bar_subtitle);
            int i = this.CatchingFishJetpackCompose;
            if (i != 0) {
                this.CatchingFishNavigation.setTextAppearance(getContext(), i);
            }
            int i2 = this.CatchingFishCoroutineFlow;
            if (i2 != 0) {
                this.CatchingFish.setTextAppearance(getContext(), i2);
            }
        }
        this.CatchingFishNavigation.setText(this.CatchingFishEspressoTesting);
        this.CatchingFish.setText(this.CatchingFishOkHttp);
        boolean isEmpty = TextUtils.isEmpty(this.CatchingFishEspressoTesting);
        boolean isEmpty2 = TextUtils.isEmpty(this.CatchingFishOkHttp);
        this.CatchingFish.setVisibility(!isEmpty2 ? 0 : 8);
        this.CatchingFishRoomDatabase.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.CatchingFishRoomDatabase.getParent() == null) {
            addView(this.CatchingFishRoomDatabase);
        }
    }

    @Override // android.view.View
    /* renamed from: CatchingFishViewModelFAB, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            CatchingFishIntentMVPDagger catchingFishIntentMVPDagger = this.CatchingFishLayout;
            if (catchingFishIntentMVPDagger != null) {
                catchingFishIntentMVPDagger.CatchingFishSnackbar();
            }
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.CatchingFishLayout != null ? this.CatchingFishReduxKtor.CatchingFishSnackbar : getVisibility();
    }

    public int getContentHeight() {
        return this.CatchingFishViewModelFAB;
    }

    public CharSequence getSubtitle() {
        return this.CatchingFishOkHttp;
    }

    public CharSequence getTitle() {
        return this.CatchingFishEspressoTesting;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, CatchingFishWidgetGlide.CatchingFishParcelableFAB, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        CatchingFishToast catchingFishToast = this.CatchingFishViewModelScope;
        if (catchingFishToast != null) {
            Configuration configuration2 = catchingFishToast.CatchingFishDaggerWebsocket.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            catchingFishToast.CatchingFish = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishToast.CatchingFishWorkManager;
            if (catchingFishSharedFlowAdMob != null) {
                catchingFishSharedFlowAdMob.CatchingFishStateLiveData(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CatchingFishToast catchingFishToast = this.CatchingFishViewModelScope;
        if (catchingFishToast != null) {
            catchingFishToast.CatchingFishReduxKtor();
            CatchingFishRecyclerView catchingFishRecyclerView = this.CatchingFishViewModelScope.CatchingFishSpannableWidget;
            if (catchingFishRecyclerView == null || !catchingFishRecyclerView.CatchingFishSnackbar()) {
                return;
            }
            catchingFishRecyclerView.CatchingFishLayout.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.CatchingFishCloudMessaging = false;
        }
        if (!this.CatchingFishCloudMessaging) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.CatchingFishCloudMessaging = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.CatchingFishCloudMessaging = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.CatchingFishUnitTesting;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.CatchingFishUnitTesting.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int CatchingFishViewModelScope = CatchingFishViewModelScope(this.CatchingFishUnitTesting, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? CatchingFishViewModelScope - i6 : CatchingFishViewModelScope + i6;
        }
        LinearLayout linearLayout = this.CatchingFishRoomDatabase;
        if (linearLayout != null && this.CatchingFishStateLiveData == null && linearLayout.getVisibility() != 8) {
            paddingRight += CatchingFishViewModelScope(this.CatchingFishRoomDatabase, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.CatchingFishStateLiveData;
        if (view2 != null) {
            CatchingFishViewModelScope(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.CatchingFishWorkManager;
        if (actionMenuView != null) {
            CatchingFishViewModelScope(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.CatchingFishViewModelFAB;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.CatchingFishUnitTesting;
        if (view != null) {
            int CatchingFishWorkManager = CatchingFishWorkManager(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.CatchingFishUnitTesting.getLayoutParams();
            paddingLeft = CatchingFishWorkManager - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.CatchingFishWorkManager;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = CatchingFishWorkManager(this.CatchingFishWorkManager, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.CatchingFishRoomDatabase;
        if (linearLayout != null && this.CatchingFishStateLiveData == null) {
            if (this.CatchingFishDaggerHiltFAB) {
                this.CatchingFishRoomDatabase.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.CatchingFishRoomDatabase.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.CatchingFishRoomDatabase.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = CatchingFishWorkManager(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.CatchingFishStateLiveData;
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
            this.CatchingFishStateLiveData.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.CatchingFishViewModelFAB > 0) {
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
            this.CatchingFishFragmentHandler = false;
        }
        if (!this.CatchingFishFragmentHandler) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.CatchingFishFragmentHandler = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.CatchingFishFragmentHandler = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.CatchingFishViewModelFAB = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.CatchingFishStateLiveData;
        if (view2 != null) {
            removeView(view2);
        }
        this.CatchingFishStateLiveData = view;
        if (view != null && (linearLayout = this.CatchingFishRoomDatabase) != null) {
            removeView(linearLayout);
            this.CatchingFishRoomDatabase = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.CatchingFishOkHttp = charSequence;
        CatchingFishReduxKtor();
    }

    public void setTitle(CharSequence charSequence) {
        this.CatchingFishEspressoTesting = charSequence;
        CatchingFishReduxKtor();
        CatchingFishFABCameraX.CatchingFishUnitTesting(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.CatchingFishDaggerHiltFAB) {
            requestLayout();
        }
        this.CatchingFishDaggerHiltFAB = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
