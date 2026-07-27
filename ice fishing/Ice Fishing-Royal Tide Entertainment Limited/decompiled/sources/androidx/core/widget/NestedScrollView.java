package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.text.CatchingFishAdMobRoomRoom;
import kotlin.text.CatchingFishAndroidXRealm;
import kotlin.text.CatchingFishBiometricFlux;
import kotlin.text.CatchingFishBundleCoroutine;
import kotlin.text.CatchingFishDaggerFirebase;
import kotlin.text.CatchingFishDataStore;
import kotlin.text.CatchingFishFABCameraX;
import kotlin.text.CatchingFishFABRealmRealm;
import kotlin.text.CatchingFishGsonFlux;
import kotlin.text.CatchingFishIntentExoPlayer;
import kotlin.text.CatchingFishJUnitHandlerFAB;
import kotlin.text.CatchingFishMockkWidget;
import kotlin.text.CatchingFishOkHttpAnimation;
import kotlin.text.CatchingFishPicassoPayPal;
import kotlin.text.CatchingFishRobolectricHilt;
import kotlin.text.CatchingFishToastCoroutine;
import kotlin.text.CatchingFishViewPagerMockk;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements CatchingFishOkHttpAnimation {
    public final int CatchingFish;
    public boolean CatchingFishAnimationMockk;
    public int CatchingFishCardViewRealm;
    public final CatchingFishToastCoroutine CatchingFishCardViewView;
    public int CatchingFishCloudMessaging;
    public final int CatchingFishCoroutineFlow;
    public float CatchingFishCustomView;
    public int CatchingFishDaggerHiltFAB;
    public long CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public final CatchingFishPicassoPayPal CatchingFishFragmentFactory;
    public CatchingFishFABRealmRealm CatchingFishFragmentHandler;
    public int CatchingFishGsonAppCompat;
    public final int CatchingFishJetpackCompose;
    public final EdgeEffect CatchingFishLayout;
    public final CatchingFishMockkWidget CatchingFishMVPRobolectric;
    public boolean CatchingFishNavigation;
    public boolean CatchingFishOkHttp;
    public final int[] CatchingFishParcelableFlux;
    public CatchingFishDaggerFirebase CatchingFishPayPal;
    public final float CatchingFishReduxKtor;
    public boolean CatchingFishRoomDatabase;
    public final int[] CatchingFishSpannableWidget;
    public VelocityTracker CatchingFishStateLiveData;
    public View CatchingFishUnitTesting;
    public final EdgeEffect CatchingFishViewModelFAB;
    public final OverScroller CatchingFishViewModelScope;
    public final Rect CatchingFishWorkManager;
    public static final float CatchingFishMutableLiveData = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final CatchingFishBiometricFlux CatchingFishJobScheduler = new CatchingFishBiometricFlux(3);
    public static final int[] CatchingFishPayPalService = {R.attr.fillViewport};

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.catchingfish.fishcatcherpro.R.attr.nestedScrollViewStyle);
        this.CatchingFishWorkManager = new Rect();
        this.CatchingFishEspressoTesting = true;
        this.CatchingFishOkHttp = false;
        this.CatchingFishUnitTesting = null;
        this.CatchingFishAnimationMockk = false;
        this.CatchingFishNavigation = true;
        this.CatchingFishDaggerHiltFAB = -1;
        this.CatchingFishSpannableWidget = new int[2];
        this.CatchingFishParcelableFlux = new int[2];
        this.CatchingFishFragmentFactory = new CatchingFishPicassoPayPal(getContext(), new CatchingFishViewPagerMockk(20, this));
        int i = Build.VERSION.SDK_INT;
        this.CatchingFishViewModelFAB = i >= 31 ? CatchingFishBundleCoroutine.CatchingFishParcelableFAB(context, attributeSet) : new EdgeEffect(context);
        this.CatchingFishLayout = i >= 31 ? CatchingFishBundleCoroutine.CatchingFishParcelableFAB(context, attributeSet) : new EdgeEffect(context);
        this.CatchingFishReduxKtor = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.CatchingFishViewModelScope = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.CatchingFish = viewConfiguration.getScaledTouchSlop();
        this.CatchingFishJetpackCompose = viewConfiguration.getScaledMinimumFlingVelocity();
        this.CatchingFishCoroutineFlow = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CatchingFishPayPalService, com.catchingfish.fishcatcherpro.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.CatchingFishCardViewView = new CatchingFishToastCoroutine();
        this.CatchingFishMVPRobolectric = new CatchingFishMockkWidget(this);
        setNestedScrollingEnabled(true);
        CatchingFishFABCameraX.CatchingFishOkHttp(this, CatchingFishJobScheduler);
    }

    public static boolean CatchingFishEspressoTesting(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && CatchingFishEspressoTesting((View) parent, nestedScrollView);
    }

    private CatchingFishFABRealmRealm getScrollFeedbackProvider() {
        if (this.CatchingFishFragmentHandler == null) {
            this.CatchingFishFragmentHandler = new CatchingFishFABRealmRealm(this);
        }
        return this.CatchingFishFragmentHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int CatchingFish(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        CatchingFishMockkWidget catchingFishMockkWidget = this.CatchingFishMVPRobolectric;
        if (i4 == 1) {
            catchingFishMockkWidget.CatchingFishWorkManager(2, i4);
        }
        boolean CatchingFishSnackbar = this.CatchingFishMVPRobolectric.CatchingFishSnackbar(0, i, i4, this.CatchingFishParcelableFlux, this.CatchingFishSpannableWidget);
        int[] iArr = this.CatchingFishSpannableWidget;
        int[] iArr2 = this.CatchingFishParcelableFlux;
        if (CatchingFishSnackbar) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = CatchingFishStateLiveData(i5, 0, scrollY, scrollRange) && !catchingFishMockkWidget.CatchingFishDaggerWebsocket(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().CatchingFishParcelableFAB.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.CatchingFishMVPRobolectric.CatchingFishCoroutine(0, scrollY2, 0, i5 - scrollY2, this.CatchingFishSpannableWidget, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.CatchingFishLayout;
        EdgeEffect edgeEffect2 = this.CatchingFishViewModelFAB;
        if (i9 < 0) {
            if (z4) {
                CatchingFishRobolectricHilt.CatchingFishCameraXIntent(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().CatchingFishParcelableFAB.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z4) {
            CatchingFishRobolectricHilt.CatchingFishCameraXIntent(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                z2 = false;
                getScrollFeedbackProvider().CatchingFishParcelableFAB.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
            } else {
                z2 = false;
            }
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.CatchingFishStateLiveData) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                CatchingFishSpannableWidget(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
        }
        postInvalidateOnAnimation();
        z3 = z2;
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
        }
        return i7;
    }

    public final void CatchingFishAnimationMockk(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.CatchingFishDaggerHiltFAB) {
            int i = actionIndex == 0 ? 1 : 0;
            this.CatchingFishCloudMessaging = (int) motionEvent.getY(i);
            this.CatchingFishDaggerHiltFAB = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.CatchingFishStateLiveData;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean CatchingFishCloudMessaging(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.CatchingFishWorkManager;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return CatchingFishNavigation(i, rect.top, rect.bottom);
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishCoroutine(View view, int i, int i2, int[] iArr, int i3) {
        this.CatchingFishMVPRobolectric.CatchingFishSnackbar(i, i2, i3, iArr, null);
    }

    public final void CatchingFishCoroutineFlow(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.CatchingFishDaggerWebsocket > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.CatchingFishViewModelScope.startScroll(getScrollX(), scrollY, 0, max, 250);
            if (z) {
                this.CatchingFishMVPRobolectric.CatchingFishWorkManager(2, 1);
            } else {
                CatchingFishSpannableWidget(1);
            }
            this.CatchingFishCardViewRealm = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.CatchingFishViewModelScope.isFinished()) {
                this.CatchingFishViewModelScope.abortAnimation();
                CatchingFishSpannableWidget(1);
            }
            scrollBy(i, i2);
        }
        this.CatchingFishDaggerWebsocket = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean CatchingFishDaggerHiltFAB(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.CatchingFishViewModelFAB;
        if (CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect) != 0.0f) {
            CatchingFishRobolectricHilt.CatchingFishCameraXIntent(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.CatchingFishLayout;
        if (CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect2) == 0.0f) {
            return z;
        }
        CatchingFishRobolectricHilt.CatchingFishCameraXIntent(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final int CatchingFishDaggerWebsocket(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void CatchingFishFragmentHandler(int i) {
        if (getChildCount() > 0) {
            this.CatchingFishViewModelScope.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.CatchingFishMVPRobolectric.CatchingFishWorkManager(2, 1);
            this.CatchingFishCardViewRealm = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                CatchingFishAndroidXRealm.CatchingFishParcelableFAB(this, Math.abs(this.CatchingFishViewModelScope.getCurrVelocity()));
            }
        }
    }

    public final boolean CatchingFishJetpackCompose(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float CatchingFishCoroutineFlow = CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect) * getHeight();
        float abs = Math.abs(-i) * 0.35f;
        float f = this.CatchingFishReduxKtor * 0.015f;
        double log = Math.log(abs / f);
        double d = CatchingFishMutableLiveData;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < CatchingFishCoroutineFlow;
    }

    public final boolean CatchingFishLayout(KeyEvent keyEvent) {
        this.CatchingFishWorkManager.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? CatchingFishCloudMessaging(33) : CatchingFishReduxKtor(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? CatchingFishCloudMessaging(130) : CatchingFishReduxKtor(130);
                    }
                    if (keyCode == 62) {
                        CatchingFishRoomDatabase(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return CatchingFishCloudMessaging(33);
                    }
                    if (keyCode == 93) {
                        return CatchingFishCloudMessaging(130);
                    }
                    if (keyCode == 122) {
                        CatchingFishRoomDatabase(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        CatchingFishRoomDatabase(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final boolean CatchingFishNavigation(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            CatchingFish(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    public final boolean CatchingFishOkHttp(View view, int i, int i2) {
        Rect rect = this.CatchingFishWorkManager;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishParcelableFAB(View view, View view2, int i, int i2) {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishCardViewView;
        if (i2 == 1) {
            catchingFishToastCoroutine.CatchingFishSnackbar = i;
        } else {
            catchingFishToastCoroutine.CatchingFishParcelableFAB = i;
        }
        this.CatchingFishMVPRobolectric.CatchingFishWorkManager(2, i2);
    }

    public final boolean CatchingFishReduxKtor(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !CatchingFishOkHttp(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            CatchingFish(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.CatchingFishWorkManager;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            CatchingFish(CatchingFishDaggerWebsocket(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !CatchingFishOkHttp(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final void CatchingFishRoomDatabase(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.CatchingFishWorkManager;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        CatchingFishNavigation(i, i2, i3);
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishSnackbar(View view, int i) {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishCardViewView;
        if (i == 1) {
            catchingFishToastCoroutine.CatchingFishSnackbar = 0;
        } else {
            catchingFishToastCoroutine.CatchingFishParcelableFAB = 0;
        }
        CatchingFishSpannableWidget(i);
    }

    public final void CatchingFishSpannableWidget(int i) {
        this.CatchingFishMVPRobolectric.CatchingFishViewModelScope(i);
    }

    public final boolean CatchingFishStateLiveData(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 > i4) {
            i6 = i4;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z2 = false;
                if (z2 && !this.CatchingFishMVPRobolectric.CatchingFishDaggerWebsocket(1)) {
                    this.CatchingFishViewModelScope.springBack(i5, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i5, i6);
                return !z || z2;
            }
            i6 = 0;
        }
        z2 = true;
        if (z2) {
            this.CatchingFishViewModelScope.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    public final void CatchingFishUnitTesting(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.CatchingFishMVPRobolectric.CatchingFishCoroutine(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final boolean CatchingFishViewModelFAB(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // kotlin.text.CatchingFishViewGson
    public final void CatchingFishViewModelScope(View view, int i, int i2, int i3, int i4, int i5) {
        CatchingFishUnitTesting(i4, i5, null);
    }

    @Override // kotlin.text.CatchingFishOkHttpAnimation
    public final void CatchingFishWorkManager(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        CatchingFishUnitTesting(i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i;
        if (this.CatchingFishViewModelScope.isFinished()) {
            return;
        }
        this.CatchingFishViewModelScope.computeScrollOffset();
        int currY = this.CatchingFishViewModelScope.getCurrY();
        int i2 = currY - this.CatchingFishCardViewRealm;
        int height = getHeight();
        EdgeEffect edgeEffect = this.CatchingFishViewModelFAB;
        EdgeEffect edgeEffect2 = this.CatchingFishLayout;
        if (i2 <= 0 || CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect) == 0.0f) {
            if (i2 < 0 && CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect2) != 0.0f) {
                float f = height;
                round = Math.round(CatchingFishRobolectricHilt.CatchingFishCameraXIntent(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (round != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.CatchingFishCardViewRealm = currY;
            int[] iArr = this.CatchingFishParcelableFlux;
            iArr[1] = 0;
            this.CatchingFishMVPRobolectric.CatchingFishSnackbar(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            int scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                CatchingFishAndroidXRealm.CatchingFishParcelableFAB(this, Math.abs(this.CatchingFishViewModelScope.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                CatchingFishStateLiveData(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.CatchingFishMVPRobolectric.CatchingFishCoroutine(0, scrollY2, 0, i4, this.CatchingFishSpannableWidget, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.CatchingFishViewModelScope.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.CatchingFishViewModelScope.getCurrVelocity());
                    }
                }
                this.CatchingFishViewModelScope.abortAnimation();
                CatchingFishSpannableWidget(1);
            }
            if (this.CatchingFishViewModelScope.isFinished()) {
                postInvalidateOnAnimation();
                return;
            } else {
                CatchingFishSpannableWidget(1);
                return;
            }
        }
        round = Math.round(CatchingFishRobolectricHilt.CatchingFishCameraXIntent(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i2) {
            edgeEffect.finish();
        }
        i2 -= round;
        int i32 = i2;
        this.CatchingFishCardViewRealm = currY;
        int[] iArr2 = this.CatchingFishParcelableFlux;
        iArr2[1] = 0;
        this.CatchingFishMVPRobolectric.CatchingFishSnackbar(0, i32, 1, iArr2, null);
        i = i32 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
        }
        if (i != 0) {
        }
        if (i != 0) {
        }
        if (this.CatchingFishViewModelScope.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? (scrollY - max) + bottom : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || CatchingFishLayout(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent CatchingFishReduxKtor;
        CatchingFishMockkWidget catchingFishMockkWidget = this.CatchingFishMVPRobolectric;
        if (catchingFishMockkWidget.CatchingFishReduxKtor && (CatchingFishReduxKtor = catchingFishMockkWidget.CatchingFishReduxKtor(0)) != null) {
            try {
                return CatchingFishReduxKtor.onNestedFling(catchingFishMockkWidget.CatchingFishCoroutine, f, f2, z);
            } catch (AbstractMethodError unused) {
                Objects.toString(CatchingFishReduxKtor);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.CatchingFishMVPRobolectric.CatchingFishParcelableFAB(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.CatchingFishMVPRobolectric.CatchingFishSnackbar(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.CatchingFishMVPRobolectric.CatchingFishCoroutine(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.CatchingFishViewModelFAB;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            } else {
                i = 0;
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.CatchingFishLayout;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i2 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        CatchingFishToastCoroutine catchingFishToastCoroutine = this.CatchingFishCardViewView;
        return catchingFishToastCoroutine.CatchingFishSnackbar | catchingFishToastCoroutine.CatchingFishParcelableFAB;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.CatchingFishCustomView == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.CatchingFishCustomView = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.CatchingFishCustomView;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.CatchingFishMVPRobolectric.CatchingFishDaggerWebsocket(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.CatchingFishMVPRobolectric.CatchingFishReduxKtor;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.CatchingFishOkHttp = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0122, code lost:
    
        if (r0 >= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00d7, code lost:
    
        if (r7 >= 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        NestedScrollView nestedScrollView;
        float f2;
        NestedScrollView nestedScrollView2;
        float f3;
        long j;
        float f4;
        float sqrt;
        int i6;
        NestedScrollView nestedScrollView3;
        float f5;
        if (motionEvent.getAction() != 8 || this.CatchingFishAnimationMockk) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            i2 = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            i2 = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            i2 = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        CatchingFish(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, i2, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            CatchingFishPicassoPayPal catchingFishPicassoPayPal = this.CatchingFishFragmentFactory;
            NestedScrollView nestedScrollView4 = (NestedScrollView) catchingFishPicassoPayPal.CatchingFishSnackbar.CatchingFishDaggerWebsocket;
            int[] iArr = catchingFishPicassoPayPal.CatchingFishViewModelFAB;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i7 = 1;
            if (catchingFishPicassoPayPal.CatchingFishWorkManager == source && catchingFishPicassoPayPal.CatchingFishViewModelScope == deviceId && catchingFishPicassoPayPal.CatchingFishDaggerWebsocket == i) {
                z = false;
                i3 = 0;
            } else {
                Context context = catchingFishPicassoPayPal.CatchingFishParcelableFAB;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i3 = 0;
                int source2 = motionEvent.getSource();
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 34) {
                    Method method = CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB;
                    i4 = CatchingFishDataStore.CatchingFishWorkManager(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = CatchingFishAdMobRoomRoom.CatchingFishParcelableFAB;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device != null && device.getMotionRange(i, source2) != null) {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier != 0) {
                            i4 = resources.getDimensionPixelSize(identifier);
                        }
                    }
                    i4 = Integer.MAX_VALUE;
                }
                iArr[0] = i4;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i8 >= 34) {
                    i5 = CatchingFishDataStore.CatchingFishDaggerWebsocket(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 != null && device2.getMotionRange(i, source3) != null) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            i5 = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 != 0) {
                            i5 = resources2.getDimensionPixelSize(identifier2);
                        }
                    }
                    i5 = Integer.MIN_VALUE;
                }
                iArr[1] = i5;
                catchingFishPicassoPayPal.CatchingFishWorkManager = source;
                catchingFishPicassoPayPal.CatchingFishViewModelScope = deviceId;
                catchingFishPicassoPayPal.CatchingFishDaggerWebsocket = i;
                z = true;
            }
            if (iArr[i3] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = catchingFishPicassoPayPal.CatchingFishCoroutine;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                catchingFishPicassoPayPal.CatchingFishCoroutine = null;
                return true;
            }
            if (catchingFishPicassoPayPal.CatchingFishCoroutine == null) {
                catchingFishPicassoPayPal.CatchingFishCoroutine = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = catchingFishPicassoPayPal.CatchingFishCoroutine;
            Map map = CatchingFishJUnitHandlerFAB.CatchingFishParcelableFAB;
            velocityTracker2.addMovement(motionEvent);
            int i9 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = CatchingFishJUnitHandlerFAB.CatchingFishParcelableFAB;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new CatchingFishIntentExoPlayer());
                }
                CatchingFishIntentExoPlayer catchingFishIntentExoPlayer = (CatchingFishIntentExoPlayer) map2.get(velocityTracker2);
                long[] jArr = catchingFishIntentExoPlayer.CatchingFishSnackbar;
                long eventTime = motionEvent.getEventTime();
                if (catchingFishIntentExoPlayer.CatchingFishReduxKtor != 0 && eventTime - jArr[catchingFishIntentExoPlayer.CatchingFishDaggerWebsocket] > 40) {
                    catchingFishIntentExoPlayer.CatchingFishReduxKtor = i3;
                    catchingFishIntentExoPlayer.CatchingFishCoroutine = 0.0f;
                }
                int i10 = (catchingFishIntentExoPlayer.CatchingFishDaggerWebsocket + 1) % 20;
                catchingFishIntentExoPlayer.CatchingFishDaggerWebsocket = i10;
                int i11 = catchingFishIntentExoPlayer.CatchingFishReduxKtor;
                if (i11 != 20) {
                    catchingFishIntentExoPlayer.CatchingFishReduxKtor = i11 + 1;
                }
                catchingFishIntentExoPlayer.CatchingFishParcelableFAB[i10] = motionEvent.getAxisValue(26);
                jArr[catchingFishIntentExoPlayer.CatchingFishDaggerWebsocket] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            CatchingFishIntentExoPlayer catchingFishIntentExoPlayer2 = (CatchingFishIntentExoPlayer) CatchingFishJUnitHandlerFAB.CatchingFishParcelableFAB.get(velocityTracker2);
            if (catchingFishIntentExoPlayer2 != null) {
                float[] fArr = catchingFishIntentExoPlayer2.CatchingFishParcelableFAB;
                long[] jArr2 = catchingFishIntentExoPlayer2.CatchingFishSnackbar;
                int i12 = catchingFishIntentExoPlayer2.CatchingFishReduxKtor;
                if (i12 >= 2) {
                    int i13 = catchingFishIntentExoPlayer2.CatchingFishDaggerWebsocket;
                    int i14 = ((i13 + 20) - (i12 - 1)) % 20;
                    long j2 = jArr2[i13];
                    while (true) {
                        j = jArr2[i14];
                        if (j2 - j <= 100) {
                            break;
                        }
                        catchingFishIntentExoPlayer2.CatchingFishReduxKtor--;
                        i14 = (i14 + 1) % 20;
                    }
                    int i15 = catchingFishIntentExoPlayer2.CatchingFishReduxKtor;
                    if (i15 >= 2) {
                        if (i15 == 2) {
                            int i16 = (i14 + 1) % 20;
                            if (j != jArr2[i16]) {
                                nestedScrollView = nestedScrollView4;
                                f4 = Float.MAX_VALUE;
                                i6 = 1000;
                                sqrt = fArr[i16] / (r12 - j);
                            }
                        } else {
                            f4 = Float.MAX_VALUE;
                            float f6 = 0.0f;
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 >= catchingFishIntentExoPlayer2.CatchingFishReduxKtor - 1) {
                                    break;
                                }
                                int i19 = i17 + i14;
                                long j3 = jArr2[i19 % 20];
                                int i20 = (i19 + 1) % i9;
                                if (jArr2[i20] == j3) {
                                    nestedScrollView3 = nestedScrollView4;
                                } else {
                                    i18++;
                                    nestedScrollView3 = nestedScrollView4;
                                    float sqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f6) * 2.0f));
                                    float f7 = fArr[i20] / (jArr2[i20] - j3);
                                    float abs = (Math.abs(f7) * (f7 - sqrt2)) + f6;
                                    if (i18 == i7) {
                                        abs *= 0.5f;
                                    }
                                    f6 = abs;
                                }
                                i17++;
                                nestedScrollView4 = nestedScrollView3;
                                i9 = 20;
                                i7 = 1;
                            }
                            nestedScrollView = nestedScrollView4;
                            sqrt = ((float) Math.sqrt(Math.abs(f6) * 2.0f)) * (f6 < 0.0f ? -1.0f : 1.0f);
                            i6 = 1000;
                        }
                        f5 = sqrt * i6;
                        catchingFishIntentExoPlayer2.CatchingFishCoroutine = f5;
                        if (f5 >= (-Math.abs(f4))) {
                            catchingFishIntentExoPlayer2.CatchingFishCoroutine = -Math.abs(f4);
                        } else if (catchingFishIntentExoPlayer2.CatchingFishCoroutine > Math.abs(f4)) {
                            catchingFishIntentExoPlayer2.CatchingFishCoroutine = Math.abs(f4);
                        }
                    }
                }
                nestedScrollView = nestedScrollView4;
                f4 = Float.MAX_VALUE;
                i6 = 1000;
                sqrt = 0.0f;
                f5 = sqrt * i6;
                catchingFishIntentExoPlayer2.CatchingFishCoroutine = f5;
                if (f5 >= (-Math.abs(f4))) {
                }
            } else {
                nestedScrollView = nestedScrollView4;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                f2 = CatchingFishDataStore.CatchingFishSnackbar(velocityTracker2, i);
            } else if (i == 0) {
                f2 = velocityTracker2.getXVelocity();
            } else if (i == 1) {
                f2 = velocityTracker2.getYVelocity();
            } else {
                CatchingFishIntentExoPlayer catchingFishIntentExoPlayer3 = (CatchingFishIntentExoPlayer) CatchingFishJUnitHandlerFAB.CatchingFishParcelableFAB.get(velocityTracker2);
                f2 = (catchingFishIntentExoPlayer3 == null || i != 26) ? 0.0f : catchingFishIntentExoPlayer3.CatchingFishCoroutine;
            }
            float f8 = f2 * (-nestedScrollView.getVerticalScrollFactorCompat());
            float signum = Math.signum(f8);
            if (z || !(signum == Math.signum(catchingFishPicassoPayPal.CatchingFishReduxKtor) || signum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.CatchingFishViewModelScope.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f8) >= iArr[0]) {
                float max = Math.max(-r2, Math.min(f8, iArr[1]));
                if (max == 0.0f) {
                    f3 = 0.0f;
                } else {
                    nestedScrollView2.CatchingFishViewModelScope.abortAnimation();
                    nestedScrollView2.CatchingFishFragmentHandler((int) max);
                    f3 = max;
                }
                catchingFishPicassoPayPal.CatchingFishReduxKtor = f3;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.CatchingFishAnimationMockk) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.CatchingFishDaggerHiltFAB;
                    if (i2 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i2)) != -1) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.CatchingFishCloudMessaging) > this.CatchingFish && (2 & getNestedScrollAxes()) == 0) {
                            this.CatchingFishAnimationMockk = true;
                            this.CatchingFishCloudMessaging = y;
                            if (this.CatchingFishStateLiveData == null) {
                                this.CatchingFishStateLiveData = VelocityTracker.obtain();
                            }
                            this.CatchingFishStateLiveData.addMovement(motionEvent);
                            this.CatchingFishGsonAppCompat = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        CatchingFishAnimationMockk(motionEvent);
                    }
                }
            }
            this.CatchingFishAnimationMockk = false;
            this.CatchingFishDaggerHiltFAB = -1;
            VelocityTracker velocityTracker = this.CatchingFishStateLiveData;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.CatchingFishStateLiveData = null;
            }
            if (this.CatchingFishViewModelScope.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            CatchingFishSpannableWidget(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.CatchingFishCloudMessaging = y2;
                    this.CatchingFishDaggerHiltFAB = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.CatchingFishStateLiveData;
                    if (velocityTracker2 == null) {
                        this.CatchingFishStateLiveData = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.CatchingFishStateLiveData.addMovement(motionEvent);
                    this.CatchingFishViewModelScope.computeScrollOffset();
                    if (!CatchingFishDaggerHiltFAB(motionEvent) && this.CatchingFishViewModelScope.isFinished()) {
                        z = false;
                    }
                    this.CatchingFishAnimationMockk = z;
                    this.CatchingFishMVPRobolectric.CatchingFishWorkManager(2, 0);
                }
            }
            if (!CatchingFishDaggerHiltFAB(motionEvent) && this.CatchingFishViewModelScope.isFinished()) {
                z = false;
            }
            this.CatchingFishAnimationMockk = z;
            VelocityTracker velocityTracker3 = this.CatchingFishStateLiveData;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.CatchingFishStateLiveData = null;
            }
        }
        return this.CatchingFishAnimationMockk;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.CatchingFishEspressoTesting = false;
        View view = this.CatchingFishUnitTesting;
        if (view != null && CatchingFishEspressoTesting(view, this)) {
            View view2 = this.CatchingFishUnitTesting;
            Rect rect = this.CatchingFishWorkManager;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(rect);
            if (CatchingFishDaggerWebsocket != 0) {
                scrollBy(0, CatchingFishDaggerWebsocket);
            }
        }
        this.CatchingFishUnitTesting = null;
        if (!this.CatchingFishOkHttp) {
            if (this.CatchingFishPayPal != null) {
                scrollTo(getScrollX(), this.CatchingFishPayPal.CatchingFishReduxKtor);
                this.CatchingFishPayPal = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.CatchingFishOkHttp = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.CatchingFishRoomDatabase && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        CatchingFishFragmentHandler((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.CatchingFishMVPRobolectric.CatchingFishParcelableFAB(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.CatchingFishMVPRobolectric.CatchingFishSnackbar(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        CatchingFishUnitTesting(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        CatchingFishParcelableFAB(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && CatchingFishOkHttp(findNextFocus, 0, getHeight())) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof CatchingFishDaggerFirebase)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        CatchingFishDaggerFirebase catchingFishDaggerFirebase = (CatchingFishDaggerFirebase) parcelable;
        super.onRestoreInstanceState(catchingFishDaggerFirebase.getSuperState());
        this.CatchingFishPayPal = catchingFishDaggerFirebase;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CatchingFishDaggerFirebase catchingFishDaggerFirebase = new CatchingFishDaggerFirebase(super.onSaveInstanceState());
        catchingFishDaggerFirebase.CatchingFishReduxKtor = getScrollY();
        return catchingFishDaggerFirebase;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !CatchingFishOkHttp(findFocus, 0, i4)) {
            return;
        }
        Rect rect = this.CatchingFishWorkManager;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(rect);
        if (CatchingFishDaggerWebsocket != 0) {
            if (this.CatchingFishNavigation) {
                CatchingFishCoroutineFlow(0, CatchingFishDaggerWebsocket, false);
            } else {
                scrollBy(0, CatchingFishDaggerWebsocket);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return CatchingFishViewModelFAB(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        CatchingFishSnackbar(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float CatchingFishCameraXIntent;
        int round;
        int i;
        ViewParent parent2;
        if (this.CatchingFishStateLiveData == null) {
            this.CatchingFishStateLiveData = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.CatchingFishGsonAppCompat = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        obtain.offsetLocation(0.0f, this.CatchingFishGsonAppCompat);
        CatchingFishMockkWidget catchingFishMockkWidget = this.CatchingFishMVPRobolectric;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.CatchingFishViewModelFAB;
            EdgeEffect edgeEffect2 = this.CatchingFishLayout;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.CatchingFishStateLiveData;
                velocityTracker.computeCurrentVelocity(1000, this.CatchingFishCoroutineFlow);
                int yVelocity = (int) velocityTracker.getYVelocity(this.CatchingFishDaggerHiltFAB);
                if (Math.abs(yVelocity) >= this.CatchingFishJetpackCompose) {
                    if (CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect) != 0.0f) {
                        if (CatchingFishJetpackCompose(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            CatchingFishFragmentHandler(-yVelocity);
                        }
                    } else if (CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect2) != 0.0f) {
                        int i2 = -yVelocity;
                        if (CatchingFishJetpackCompose(edgeEffect2, i2)) {
                            edgeEffect2.onAbsorb(i2);
                        } else {
                            CatchingFishFragmentHandler(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f2 = i3;
                        if (!catchingFishMockkWidget.CatchingFishParcelableFAB(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            CatchingFishFragmentHandler(i3);
                        }
                    }
                } else if (this.CatchingFishViewModelScope.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.CatchingFishDaggerHiltFAB = -1;
                this.CatchingFishAnimationMockk = false;
                VelocityTracker velocityTracker2 = this.CatchingFishStateLiveData;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.CatchingFishStateLiveData = null;
                }
                CatchingFishSpannableWidget(0);
                this.CatchingFishViewModelFAB.onRelease();
                this.CatchingFishLayout.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.CatchingFishDaggerHiltFAB);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i4 = this.CatchingFishCloudMessaging - y;
                    float x = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect) != 0.0f) {
                        CatchingFishCameraXIntent = -CatchingFishRobolectricHilt.CatchingFishCameraXIntent(edgeEffect, -height, x);
                        if (CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        if (CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect2) != 0.0f) {
                            CatchingFishCameraXIntent = CatchingFishRobolectricHilt.CatchingFishCameraXIntent(edgeEffect2, height, 1.0f - x);
                            if (CatchingFishRobolectricHilt.CatchingFishCoroutineFlow(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                        }
                        round = Math.round(f * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        i = i4 - round;
                        if (!this.CatchingFishAnimationMockk && Math.abs(i) > this.CatchingFish) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.CatchingFishAnimationMockk = true;
                            i = i <= 0 ? i - this.CatchingFish : i + this.CatchingFish;
                        }
                        if (this.CatchingFishAnimationMockk) {
                            int CatchingFish = CatchingFish(i, 1, motionEvent, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.CatchingFishCloudMessaging = y - CatchingFish;
                            this.CatchingFishGsonAppCompat += CatchingFish;
                        }
                    }
                    f = CatchingFishCameraXIntent;
                    round = Math.round(f * getHeight());
                    if (round != 0) {
                    }
                    i = i4 - round;
                    if (!this.CatchingFishAnimationMockk) {
                        parent2 = getParent();
                        if (parent2 != null) {
                        }
                        this.CatchingFishAnimationMockk = true;
                        if (i <= 0) {
                        }
                    }
                    if (this.CatchingFishAnimationMockk) {
                    }
                }
            } else if (actionMasked == 3) {
                if (this.CatchingFishAnimationMockk && getChildCount() > 0) {
                    if (this.CatchingFishViewModelScope.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.CatchingFishDaggerHiltFAB = -1;
                this.CatchingFishAnimationMockk = false;
                VelocityTracker velocityTracker3 = this.CatchingFishStateLiveData;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.CatchingFishStateLiveData = null;
                }
                CatchingFishSpannableWidget(0);
                this.CatchingFishViewModelFAB.onRelease();
                this.CatchingFishLayout.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.CatchingFishCloudMessaging = (int) motionEvent.getY(actionIndex);
                this.CatchingFishDaggerHiltFAB = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                CatchingFishAnimationMockk(motionEvent);
                this.CatchingFishCloudMessaging = (int) motionEvent.getY(motionEvent.findPointerIndex(this.CatchingFishDaggerHiltFAB));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.CatchingFishAnimationMockk && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.CatchingFishViewModelScope.isFinished()) {
                this.CatchingFishViewModelScope.abortAnimation();
                CatchingFishSpannableWidget(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.CatchingFishCloudMessaging = y2;
            this.CatchingFishDaggerHiltFAB = pointerId;
            catchingFishMockkWidget.CatchingFishWorkManager(2, 0);
        }
        VelocityTracker velocityTracker4 = this.CatchingFishStateLiveData;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.CatchingFishEspressoTesting) {
            this.CatchingFishUnitTesting = view2;
        } else {
            Rect rect = this.CatchingFishWorkManager;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(rect);
            if (CatchingFishDaggerWebsocket != 0) {
                scrollBy(0, CatchingFishDaggerWebsocket);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(rect);
        boolean z2 = CatchingFishDaggerWebsocket != 0;
        if (z2) {
            if (z) {
                scrollBy(0, CatchingFishDaggerWebsocket);
                return z2;
            }
            CatchingFishCoroutineFlow(0, CatchingFishDaggerWebsocket, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.CatchingFishStateLiveData) != null) {
            velocityTracker.recycle();
            this.CatchingFishStateLiveData = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.CatchingFishEspressoTesting = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.CatchingFishRoomDatabase) {
            this.CatchingFishRoomDatabase = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        CatchingFishMockkWidget catchingFishMockkWidget = this.CatchingFishMVPRobolectric;
        if (catchingFishMockkWidget.CatchingFishReduxKtor) {
            ViewGroup viewGroup = catchingFishMockkWidget.CatchingFishCoroutine;
            WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
            viewGroup.stopNestedScroll();
        }
        catchingFishMockkWidget.CatchingFishReduxKtor = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.CatchingFishNavigation = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.CatchingFishMVPRobolectric.CatchingFishWorkManager(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        CatchingFishSpannableWidget(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(CatchingFishGsonFlux catchingFishGsonFlux) {
    }
}
