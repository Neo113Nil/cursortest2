package com.yandex.alicekit.core.slideup;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.e7o;
import defpackage.hrg;
import defpackage.l1j;
import defpackage.twq;
import defpackage.uk6;
import defpackage.uq1;
import defpackage.uwq;
import defpackage.vwq;
import defpackage.wdn;
import defpackage.wdu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class SlidingBehavior extends uk6 {
    private static final int BASE_SETTLE_DURATION = 150;
    private static final int INVALID_STATE = -1;
    static final int MAX_SETTLE_DURATION = 320;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int WIDE_EXPANDED_PERCENTAGE = 80;
    private int mAnchorPoint;
    private View mChildView;
    private int mIgnoreTopOffset;
    private boolean mIgnoreTouchEvents;
    private float mInitialTouchX;
    private float mInitialTouchY;
    private int mInitialViewPositionOnTouch;

    @NonNull
    private List<twq> mListeners;
    private final float mMaxVelocity;
    private final float mMinVelocity;
    private boolean mNestedScrollInProcess;

    @NonNull
    private final uwq mNestedVelocityTracker;
    private int mPendingState;
    private int mPercentageForStayExpanded;
    private int mPercentageOfSlideViewThatCouldFling;
    private OverScroller mScroller;
    private vwq mSettleRunnable;
    private View mSlideView;
    private int mSlideViewTopMargin;
    private int mState;
    private boolean mTouchOutsideEnabled;
    private final int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private int mVisiblePixels;

    public SlidingBehavior(Context context) {
        this.mState = 2;
        this.mPendingState = 0;
        this.mPercentageForStayExpanded = 50;
        this.mPercentageOfSlideViewThatCouldFling = 20;
        this.mListeners = new ArrayList();
        this.mNestedVelocityTracker = new uwq();
        this.mTouchOutsideEnabled = true;
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMaxVelocity = r0.getScaledMaximumFlingVelocity();
        this.mMinVelocity = context.getResources().getDisplayMetrics().density * 400.0f;
    }

    private int calculateSettleDuration(int i, int i2) {
        return Math.min((int) (((Math.abs(i) / i2) + 1.0f) * 150.0f), MAX_SETTLE_DURATION);
    }

    @NonNull
    private OverScroller getScroller(View view) {
        if (this.mScroller == null) {
            this.mScroller = new OverScroller(view.getContext(), new AccelerateDecelerateInterpolator());
        }
        return this.mScroller;
    }

    @NonNull
    private View getViewToSlide() {
        if (this.mChildView == null) {
            uq1.a("setPosition can be used only after layout", new AssertionError("setPosition can be used only after layout"));
        }
        View view = this.mSlideView;
        return view != null ? view : this.mChildView;
    }

    private void resetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(int i) {
        if (this.mChildView == null) {
            uq1.a("setPosition can be used only after layout", new AssertionError("setPosition can be used only after layout"));
        }
        View viewToSlide = getViewToSlide();
        int height = viewToSlide.getHeight();
        int top = viewToSlide.getTop();
        int min = Math.min(height, Math.max(0, i));
        this.mVisiblePixels = min;
        int i2 = ((height + this.mSlideViewTopMargin) - min) - top;
        WeakHashMap weakHashMap = wdu.a;
        viewToSlide.offsetTopAndBottom(i2);
        if (this.mListeners.size() <= 0) {
            return;
        }
        this.mListeners.get(0).getClass();
        l1j.f();
    }

    private void setState(int i) {
        if (i != this.mState) {
            this.mState = i;
            Iterator<twq> it = this.mListeners.iterator();
            if (it.hasNext()) {
                throw hrg.j(it);
            }
        }
    }

    private long settleAt(View view, int i) {
        if (this.mChildView == null) {
            uq1.a("settleAt can be used after layout", new AssertionError("settleAt can be used after layout"));
        }
        int i2 = i - this.mVisiblePixels;
        if (i2 == 0) {
            OverScroller overScroller = this.mScroller;
            if (overScroller != null && !overScroller.isFinished()) {
                return 0L;
            }
            updateStateByCurrentPosition();
            return 0L;
        }
        int calculateSettleDuration = calculateSettleDuration(i2, view.getHeight());
        OverScroller scroller = getScroller(view);
        scroller.startScroll(0, this.mVisiblePixels, 0, i2, calculateSettleDuration);
        if (scroller.computeScrollOffset()) {
            setState(4);
            if (this.mSettleRunnable == null) {
                this.mSettleRunnable = new vwq(this, scroller, this.mChildView);
            }
            vwq vwqVar = this.mSettleRunnable;
            WeakHashMap weakHashMap = wdu.a;
            view.postOnAnimation(vwqVar);
        } else {
            updateStateByCurrentPosition();
        }
        return calculateSettleDuration;
    }

    private void settleAtFlingDirection(View view, float f) {
        int height = view.getHeight();
        int i = this.mAnchorPoint;
        float f2 = this.mInitialTouchY;
        if (i != 0) {
            f2 = Math.abs(i - (height - f2));
        }
        int i2 = this.mAnchorPoint;
        boolean z = f2 / (i2 == 0 ? (float) height : (float) i2) <= ((float) this.mPercentageOfSlideViewThatCouldFling) / 100.0f;
        float f3 = this.mMinVelocity;
        if (f > f3 && this.mVisiblePixels > i2) {
            settleAt(view, height);
            return;
        }
        if (f < (-f3) && this.mVisiblePixels > i2) {
            if (z) {
                settleAt(view, i2);
                return;
            } else {
                settleAtNearestPosition(view);
                return;
            }
        }
        if (f > f3 && this.mVisiblePixels < i2) {
            settleAt(view, i2);
            return;
        }
        if (f >= (-f3) || this.mVisiblePixels >= i2) {
            settleAtNearestPosition(view);
        } else if (z) {
            settleAt(view, 0);
        } else {
            settleAtNearestPosition(view);
        }
    }

    private void settleAtNearestPosition(View view) {
        int height = view.getHeight();
        float f = this.mPercentageForStayExpanded / 100.0f;
        int i = this.mVisiblePixels;
        float f2 = i;
        int i2 = this.mAnchorPoint;
        if (f2 > ((height - i2) * f) + i2) {
            settleAt(view, height);
        } else if (i > i2 * f) {
            settleAt(view, i2);
        } else {
            settleAt(view, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStateByCurrentPosition() {
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && !overScroller.isFinished()) {
            uq1.a("Animation must be finished", new AssertionError("Animation must be finished"));
        }
        int i = this.mVisiblePixels;
        if (i == 0) {
            setState(2);
        } else if (i == this.mAnchorPoint) {
            setState(1);
        } else {
            setState(0);
        }
    }

    public void addListener(twq twqVar) {
        if (this.mListeners.contains(twqVar)) {
            return;
        }
        this.mListeners.add(twqVar);
    }

    public long animateToState(int i) {
        if (this.mChildView == null) {
            this.mPendingState = i;
            return 0L;
        }
        View viewToSlide = getViewToSlide();
        if (i == 0) {
            return settleAt(viewToSlide, viewToSlide.getHeight());
        }
        if (i != 1) {
            if (i == 2) {
                return settleAt(viewToSlide, 0);
            }
            e7o.e();
            return 0L;
        }
        int i2 = this.mAnchorPoint;
        if (i2 != 0) {
            return settleAt(viewToSlide, i2);
        }
        e7o.e();
        return 0L;
    }

    public void disableAnchoring() {
        this.mAnchorPoint = 0;
    }

    public int getState() {
        return this.mState;
    }

    public boolean isSliding() {
        int i = this.mState;
        return i == 3 || i == 4;
    }

    @Override // defpackage.uk6
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        if (this.mChildView != null && view.isShown() && view.isShown()) {
            if (motionEvent.getAction() == 3) {
                this.mIgnoreTouchEvents = false;
                resetVelocityTracker();
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.mIgnoreTouchEvents = false;
                resetVelocityTracker();
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            View viewToSlide = getViewToSlide();
            int action = motionEvent.getAction();
            if (action == 0) {
                uwq uwqVar = this.mNestedVelocityTracker;
                uwqVar.getClass();
                uwqVar.a = System.currentTimeMillis();
                if (coordinatorLayout.z(viewToSlide, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    OverScroller overScroller = this.mScroller;
                    if (overScroller != null) {
                        overScroller.forceFinished(true);
                    }
                    vwq vwqVar = this.mSettleRunnable;
                    if (vwqVar != null) {
                        view.removeCallbacks(vwqVar);
                    }
                } else {
                    this.mIgnoreTouchEvents = true;
                    if (this.mTouchOutsideEnabled) {
                        Iterator<twq> it = this.mListeners.iterator();
                        if (it.hasNext()) {
                            throw hrg.j(it);
                        }
                    }
                }
                this.mInitialTouchY = motionEvent.getY();
                this.mInitialTouchX = motionEvent.getX();
                this.mInitialViewPositionOnTouch = this.mVisiblePixels;
                if (this.mInitialTouchY < coordinatorLayout.getHeight() + coordinatorLayout.getTop() && this.mInitialTouchY > this.mIgnoreTopOffset) {
                    this.mIgnoreTouchEvents = true;
                }
            } else {
                if (action == 1) {
                    OverScroller overScroller2 = this.mScroller;
                    if (overScroller2 == null || overScroller2.isFinished()) {
                        settleAtFlingDirection(viewToSlide, this.mNestedVelocityTracker.b);
                    }
                    uwq uwqVar2 = this.mNestedVelocityTracker;
                    uwqVar2.a = 0L;
                    uwqVar2.b = 0.0f;
                    return false;
                }
                if (action == 2) {
                    float y = motionEvent.getY() - this.mInitialTouchY;
                    if (!this.mIgnoreTouchEvents && Math.abs(y) > this.mTouchSlop) {
                        float x = motionEvent.getX() - this.mInitialTouchX;
                        if (this.mState != 3 && Math.abs(y) > Math.abs(x)) {
                            setState(3);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.uk6
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        coordinatorLayout.B(i, view);
        this.mChildView = view;
        if (view.getVisibility() == 8) {
            return true;
        }
        View viewToSlide = getViewToSlide();
        this.mSlideViewTopMargin = viewToSlide == view ? coordinatorLayout.getPaddingTop() : 0;
        setPosition(this.mVisiblePixels);
        int height = viewToSlide.getHeight();
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            int i2 = this.mState;
            if (i2 == 0) {
                this.mVisiblePixels = height;
                setPosition(height);
            } else if (i2 == 1) {
                int i3 = this.mAnchorPoint;
                this.mVisiblePixels = i3;
                setPosition(i3);
            } else {
                int i4 = this.mPendingState;
                if (i4 != -1) {
                    if (i4 == 0) {
                        settleAt(viewToSlide, height);
                    } else if (i4 == 1) {
                        settleAt(viewToSlide, this.mAnchorPoint);
                    }
                    this.mPendingState = -1;
                }
            }
        } else if (this.mScroller.getFinalY() > this.mAnchorPoint) {
            settleAt(viewToSlide, height);
        }
        return true;
    }

    @Override // defpackage.uk6
    public boolean onNestedPreFling(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, float f, float f2) {
        if (this.mState != 3) {
            return false;
        }
        settleAtFlingDirection(getViewToSlide(), f2);
        return true;
    }

    @Override // defpackage.uk6
    public void onNestedPreScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2, @NonNull int[] iArr, int i3) {
        int height = getViewToSlide().getHeight();
        if (this.mState == 3 || this.mVisiblePixels < height) {
            setState(3);
            iArr[1] = i2;
            setPosition(this.mVisiblePixels + i2);
            uwq uwqVar = this.mNestedVelocityTracker;
            uwqVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (uwqVar.a != 0) {
                uwqVar.b = (i2 * 1000.0f) / (currentTimeMillis - r8);
            }
            uwqVar.a = currentTimeMillis;
        }
    }

    @Override // defpackage.uk6
    public void onNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2, int i3, int i4, int i5) {
        if (i2 < 0) {
            this.mNestedScrollInProcess = true;
        }
        if (this.mNestedScrollInProcess || i4 >= 0) {
            return;
        }
        setState(3);
        setPosition(this.mVisiblePixels + i4);
    }

    @Override // defpackage.uk6
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i, int i2) {
        this.mIgnoreTouchEvents = true;
        return i == 2 && i2 == 0 && view == view2;
    }

    @Override // defpackage.uk6
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i) {
        this.mNestedScrollInProcess = false;
        this.mNestedVelocityTracker.a = 0L;
        if (this.mState != 3) {
            return;
        }
        settleAtFlingDirection(getViewToSlide(), this.mNestedVelocityTracker.b);
    }

    @Override // defpackage.uk6
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        OverScroller overScroller;
        if (this.mChildView == null) {
            return false;
        }
        if (motionEvent.getAction() == 3) {
            resetVelocityTracker();
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        View viewToSlide = getViewToSlide();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (!this.mIgnoreTouchEvents && ((overScroller = this.mScroller) == null || overScroller.isFinished())) {
                    this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
                    settleAtFlingDirection(getViewToSlide(), -this.mVelocityTracker.getYVelocity());
                }
                return false;
            }
            if (action == 2) {
                if (!this.mIgnoreTouchEvents && Math.abs(this.mInitialTouchY - motionEvent.getY()) > this.mTouchSlop) {
                    setState(3);
                }
                if (this.mState == 3) {
                    setPosition(this.mInitialViewPositionOnTouch + ((int) (this.mInitialTouchY - motionEvent.getY())));
                    return true;
                }
            }
        } else {
            if (coordinatorLayout.z(viewToSlide, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
            this.mIgnoreTouchEvents = true;
        }
        return false;
    }

    public void removeListener(twq twqVar) {
        this.mListeners.remove(twqVar);
    }

    public void setAnchorPoint(int i) {
        this.mAnchorPoint = i;
    }

    public void setIgnoreTopOffset(int i) {
        this.mIgnoreTopOffset = i;
    }

    public void setInitialState(int i) {
        if (this.mChildView == null) {
            this.mState = i;
        } else {
            e7o.n();
        }
    }

    public void setPercentageForStayExpanded(int i) {
        this.mPercentageForStayExpanded = i;
    }

    public void setPercentageOfSlideViewThatCouldFling(int i) {
        this.mPercentageOfSlideViewThatCouldFling = i;
    }

    public void setSlideView(View view) {
        this.mSlideView = view;
    }

    public void setTouchOutsideEnabled(boolean z) {
        this.mTouchOutsideEnabled = z;
    }

    public SlidingBehavior(Context context, AttributeSet attributeSet) {
        this(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wdn.a);
        this.mAnchorPoint = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
