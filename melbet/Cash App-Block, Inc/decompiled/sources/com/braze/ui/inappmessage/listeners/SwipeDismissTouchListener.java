package com.braze.ui.inappmessage.listeners;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public abstract class SwipeDismissTouchListener implements View.OnTouchListener {
    private final long mAnimationTime;
    private final DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private int mSwipingVerticalSlop;
    private boolean mSwipingVertically;
    private final Object mToken;
    private float mTranslationX;
    private float mTranslationY;
    private VelocityTracker mVelocityTracker;
    private final VerticalDismissDirection mVerticalDismissDirection;
    private final View mView;
    private int mViewWidth = 1;
    private int mViewHeight = 1;

    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);
    }

    public enum VerticalDismissDirection {
        NONE,
        UP,
        DOWN
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks, VerticalDismissDirection verticalDismissDirection) {
        long j;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        try {
            j = view.getContext().getResources().getInteger(R.integer.config_shortAnimTime);
        } catch (Resources.NotFoundException unused) {
            j = 200;
        }
        this.mAnimationTime = j;
        this.mView = view;
        this.mToken = obj;
        this.mCallbacks = dismissCallbacks;
        this.mVerticalDismissDirection = verticalDismissDirection;
    }

    private void handleHorizontalActionUp(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - this.mDownX;
        float xVelocity = this.mVelocityTracker.getXVelocity();
        float abs = Math.abs(xVelocity);
        float abs2 = Math.abs(this.mVelocityTracker.getYVelocity());
        boolean z = false;
        if (Math.abs(rawX) <= this.mViewWidth / 2 || !this.mSwiping) {
            if (this.mMinFlingVelocity > abs || abs > this.mMaxFlingVelocity || abs2 >= abs || !this.mSwiping) {
                r5 = false;
            } else {
                boolean z2 = ((xVelocity > RecyclerView.DECELERATION_RATE ? 1 : (xVelocity == RecyclerView.DECELERATION_RATE ? 0 : -1)) < 0) == ((rawX > RecyclerView.DECELERATION_RATE ? 1 : (rawX == RecyclerView.DECELERATION_RATE ? 0 : -1)) < 0);
                z = xVelocity > RecyclerView.DECELERATION_RATE;
                r5 = z2;
            }
        } else if (rawX > RecyclerView.DECELERATION_RATE) {
            z = true;
        }
        if (!r5) {
            if (this.mSwiping) {
                this.mView.animate().translationX(RecyclerView.DECELERATION_RATE).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
            }
        } else {
            ViewPropertyAnimator animate = this.mView.animate();
            int i = this.mViewWidth;
            if (!z) {
                i = -i;
            }
            animate.translationX(i).alpha(RecyclerView.DECELERATION_RATE).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SwipeDismissTouchListener.this.performDismiss();
                }
            });
        }
    }

    private void handleVerticalActionUp(MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY() - this.mDownY;
        float yVelocity = this.mVelocityTracker.getYVelocity();
        float abs = Math.abs(yVelocity);
        float abs2 = Math.abs(this.mVelocityTracker.getXVelocity());
        boolean z = false;
        if (Math.abs(rawY) > this.mViewHeight / 2) {
            if (rawY > RecyclerView.DECELERATION_RATE) {
                z = true;
            }
        } else if (this.mMinFlingVelocity > abs || abs > this.mMaxFlingVelocity || abs2 >= abs) {
            r5 = false;
        } else {
            boolean z2 = ((yVelocity > RecyclerView.DECELERATION_RATE ? 1 : (yVelocity == RecyclerView.DECELERATION_RATE ? 0 : -1)) < 0) == ((rawY > RecyclerView.DECELERATION_RATE ? 1 : (rawY == RecyclerView.DECELERATION_RATE ? 0 : -1)) < 0);
            z = yVelocity > RecyclerView.DECELERATION_RATE;
            r5 = z2;
        }
        if (r5) {
            if (isVerticalSwipeInAllowedDirection(z ? 1.0f : -1.0f)) {
                ViewPropertyAnimator animate = this.mView.animate();
                int i = this.mViewHeight;
                if (!z) {
                    i = -i;
                }
                animate.translationY(i).alpha(RecyclerView.DECELERATION_RATE).setDuration(this.mAnimationTime).setListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        SwipeDismissTouchListener.this.performDismiss();
                    }
                });
                return;
            }
        }
        this.mView.animate().translationY(RecyclerView.DECELERATION_RATE).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
    }

    private boolean isVerticalSwipeInAllowedDirection(float f) {
        VerticalDismissDirection verticalDismissDirection = this.mVerticalDismissDirection;
        return verticalDismissDirection == VerticalDismissDirection.DOWN ? f > RecyclerView.DECELERATION_RATE : verticalDismissDirection == VerticalDismissDirection.UP && f < RecyclerView.DECELERATION_RATE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performDismiss$0(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.mView.setLayoutParams(layoutParams);
    }

    private void requestDisallowParentIntercept(MotionEvent motionEvent) {
        this.mView.getParent().requestDisallowInterceptTouchEvent(true);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
        this.mView.onTouchEvent(obtain);
        obtain.recycle();
    }

    private void resetTransientState() {
        this.mTranslationX = RecyclerView.DECELERATION_RATE;
        this.mTranslationY = RecyclerView.DECELERATION_RATE;
        this.mDownX = RecyclerView.DECELERATION_RATE;
        this.mDownY = RecyclerView.DECELERATION_RATE;
        this.mSwiping = false;
        this.mSwipingVertically = false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        motionEvent.offsetLocation(this.mTranslationX, this.mTranslationY);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        if (this.mViewHeight < 2) {
            this.mViewHeight = this.mView.getHeight();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
            if (this.mCallbacks.canDismiss(this.mToken)) {
                VelocityTracker obtain = VelocityTracker.obtain();
                this.mVelocityTracker = obtain;
                obtain.addMovement(motionEvent);
            }
            return false;
        }
        if (actionMasked == 1) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
                this.mVelocityTracker.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
                if (this.mSwipingVertically) {
                    handleVerticalActionUp(motionEvent);
                } else {
                    handleHorizontalActionUp(motionEvent);
                }
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
                resetTransientState();
            }
        } else if (actionMasked == 2) {
            VelocityTracker velocityTracker2 = this.mVelocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                float rawX = motionEvent.getRawX() - this.mDownX;
                float rawY = motionEvent.getRawY() - this.mDownY;
                if (!this.mSwiping && !this.mSwipingVertically) {
                    if (Math.abs(rawX) > this.mSlop && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                        this.mSwiping = true;
                        int i = this.mSlop;
                        if (rawX <= RecyclerView.DECELERATION_RATE) {
                            i = -i;
                        }
                        this.mSwipingSlop = i;
                        requestDisallowParentIntercept(motionEvent);
                    } else if (this.mVerticalDismissDirection != VerticalDismissDirection.NONE && Math.abs(rawY) > this.mSlop && Math.abs(rawX) < Math.abs(rawY) / 2.0f && isVerticalSwipeInAllowedDirection(rawY)) {
                        this.mSwipingVertically = true;
                        int i2 = this.mSlop;
                        if (rawY <= RecyclerView.DECELERATION_RATE) {
                            i2 = -i2;
                        }
                        this.mSwipingVerticalSlop = i2;
                        requestDisallowParentIntercept(motionEvent);
                    }
                }
                if (this.mSwiping) {
                    this.mTranslationX = rawX;
                    this.mView.setTranslationX(rawX - this.mSwipingSlop);
                    return true;
                }
                if (this.mSwipingVertically) {
                    this.mTranslationY = rawY;
                    this.mView.setTranslationY(rawY - this.mSwipingVerticalSlop);
                    return true;
                }
            }
        } else if (actionMasked == 3 && this.mVelocityTracker != null) {
            this.mView.animate().translationX(RecyclerView.DECELERATION_RATE).translationY(RecyclerView.DECELERATION_RATE).alpha(1.0f).setDuration(this.mAnimationTime).setListener(null);
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
            resetTransientState();
        }
        return false;
    }

    public void performDismiss() {
        final ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        final int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SwipeDismissTouchListener.this.mCallbacks.onDismiss(SwipeDismissTouchListener.this.mView, SwipeDismissTouchListener.this.mToken);
                SwipeDismissTouchListener.this.mView.setAlpha(1.0f);
                SwipeDismissTouchListener.this.mView.setTranslationX(RecyclerView.DECELERATION_RATE);
                SwipeDismissTouchListener.this.mView.setTranslationY(RecyclerView.DECELERATION_RATE);
                layoutParams.height = height;
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new KnotSpinnerView$$ExternalSyntheticLambda3(2, this, layoutParams));
        duration.start();
    }
}
