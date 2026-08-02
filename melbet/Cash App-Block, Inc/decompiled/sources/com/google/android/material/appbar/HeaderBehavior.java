package com.google.android.material.appbar;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.fillr.browsersdk.Fillr;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public int activePointerId;
    public Fillr.AnonymousClass2 flingRunnable;
    public boolean isBeingDragged;
    public int lastMotionY;
    public OverScroller scroller;
    public int touchSlop;
    public VelocityTracker velocityTracker;

    public abstract int getTopBottomOffsetForScrollingSibling();

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i = this.activePointerId;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.lastMotionY) > this.touchSlop) {
                    this.lastMotionY = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).lastNestedScrollingChildRef;
            boolean z = (weakReference == null || !((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) && coordinatorLayout.isPointInChildBounds(view, x, y2);
            this.isBeingDragged = z;
            if (z) {
                this.lastMotionY = y2;
                this.activePointerId = motionEvent.getPointerId(0);
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f6  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        HeaderBehavior headerBehavior = this;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(headerBehavior.activePointerId);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = headerBehavior.lastMotionY - y;
                    headerBehavior.lastMotionY = y;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    headerBehavior.setHeaderTopBottomOffset(coordinatorLayout, view, headerBehavior.getTopBottomOffsetForScrollingSibling() - i, appBarLayout.getTopInset() + (-appBarLayout.getDownNestedScrollRange()), 0);
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    headerBehavior.activePointerId = motionEvent.getPointerId(i2);
                    headerBehavior.lastMotionY = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = headerBehavior.velocityTracker;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !headerBehavior.isBeingDragged || z;
        }
        VelocityTracker velocityTracker3 = headerBehavior.velocityTracker;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            headerBehavior.velocityTracker.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
            float yVelocity = headerBehavior.velocityTracker.getYVelocity(headerBehavior.activePointerId);
            AppBarLayout appBarLayout2 = (AppBarLayout) view;
            int i3 = -appBarLayout2.getTotalScrollRange();
            Runnable runnable = headerBehavior.flingRunnable;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                headerBehavior.flingRunnable = null;
            }
            if (headerBehavior.scroller == null) {
                headerBehavior.scroller = new OverScroller(view.getContext());
            }
            headerBehavior.scroller.fling(0, headerBehavior.getTopAndBottomOffset(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (headerBehavior.scroller.computeScrollOffset()) {
                Fillr.AnonymousClass2 anonymousClass2 = new Fillr.AnonymousClass2(this, coordinatorLayout, view, false, 27);
                headerBehavior = this;
                headerBehavior.flingRunnable = anonymousClass2;
                view.postOnAnimation(anonymousClass2);
            } else {
                ((AppBarLayout.BaseBehavior) headerBehavior).snapToChildIfNeeded(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.liftOnScroll) {
                    appBarLayout2.setLiftedState(appBarLayout2.shouldLift(AppBarLayout.BaseBehavior.findFirstScrollingChild(coordinatorLayout)));
                }
            }
            z = true;
            headerBehavior.isBeingDragged = false;
            headerBehavior.activePointerId = -1;
            velocityTracker = headerBehavior.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                headerBehavior.velocityTracker = null;
            }
            velocityTracker2 = headerBehavior.velocityTracker;
            if (velocityTracker2 != null) {
            }
            if (headerBehavior.isBeingDragged) {
            }
        }
        z = false;
        headerBehavior.isBeingDragged = false;
        headerBehavior.activePointerId = -1;
        velocityTracker = headerBehavior.velocityTracker;
        if (velocityTracker != null) {
        }
        velocityTracker2 = headerBehavior.velocityTracker;
        if (velocityTracker2 != null) {
        }
        if (headerBehavior.isBeingDragged) {
        }
    }

    public abstract int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    public final void setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, View view, int i) {
        setHeaderTopBottomOffset(coordinatorLayout, view, i, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE);
    }
}
