package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.rum.internal.anr.ANRDetectorRunnable;
import com.fillr.n;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.mlkit.vision.common.zzb;
import com.google.mlkit.vision.text.internal.zzr;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior {
    public boolean interceptingEvents;
    public zzb listener;
    public boolean requestingDisallowInterceptTouchEvent;
    public ViewDragHelper viewDragHelper;
    public int swipeDirection = 2;
    public float alphaStartSwipeDistance = RecyclerView.DECELERATION_RATE;
    public float alphaEndSwipeDistance = 0.5f;
    public final AnonymousClass1 dragCallback = new ViewDragHelper.Callback() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        public int activePointerId = -1;
        public int originalCapturedViewLeft;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i) {
            int width;
            int width2;
            boolean z = view.getLayoutDirection() == 1;
            int i2 = SwipeDismissBehavior.this.swipeDirection;
            if (i2 == 0) {
                width = this.originalCapturedViewLeft;
                if (z) {
                    width -= view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width2 = view.getWidth() + width;
                }
            } else {
                int i3 = this.originalCapturedViewLeft;
                if (i2 != 1) {
                    width = i3 - view.getWidth();
                    width2 = this.originalCapturedViewLeft + view.getWidth();
                } else if (z) {
                    width2 = view.getWidth() + i3;
                    width = i3;
                } else {
                    width = i3 - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                }
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.requestingDisallowInterceptTouchEvent = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.requestingDisallowInterceptTouchEvent = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i) {
            zzb zzbVar = SwipeDismissBehavior.this.listener;
            if (zzbVar != null) {
                BaseTransientBottomBar.AnonymousClass5 anonymousClass5 = ((BaseTransientBottomBar) zzbVar.zza).managerCallback;
                if (i == 0) {
                    n.getInstance().restoreTimeoutIfPaused(anonymousClass5);
                } else if (i == 1 || i == 2) {
                    n.getInstance().pauseTimeout(anonymousClass5);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i, int i2) {
            float width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float f = width * swipeDismissBehavior.alphaStartSwipeDistance;
            float width2 = view.getWidth() * swipeDismissBehavior.alphaEndSwipeDistance;
            float abs = Math.abs(i - this.originalCapturedViewLeft);
            if (abs <= f) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(RecyclerView.DECELERATION_RATE);
            } else {
                view.setAlpha(Math.min(Math.max(RecyclerView.DECELERATION_RATE, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
        
            if (java.lang.Math.abs(r9.getLeft() - r8.originalCapturedViewLeft) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onViewReleased(View view, float f, float f2) {
            int i;
            zzb zzbVar;
            this.activePointerId = -1;
            int width = view.getWidth();
            boolean z = false;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            if (f != RecyclerView.DECELERATION_RATE) {
                boolean z2 = view.getLayoutDirection() == 1;
                int i2 = swipeDismissBehavior.swipeDirection;
                if (i2 != 2) {
                    i = i2 == 0 ? this.originalCapturedViewLeft : this.originalCapturedViewLeft;
                }
                if (f >= RecyclerView.DECELERATION_RATE) {
                    int left = view.getLeft();
                    int i3 = this.originalCapturedViewLeft;
                    if (left >= i3) {
                        i = i3 + width;
                        z = true;
                    }
                }
                i = this.originalCapturedViewLeft - width;
                z = true;
            }
            if (swipeDismissBehavior.viewDragHelper.settleCapturedViewAt(i, view.getTop())) {
                view.postOnAnimation(new ANRDetectorRunnable(swipeDismissBehavior, view, z));
            } else {
                if (!z || (zzbVar = swipeDismissBehavior.listener) == null) {
                    return;
                }
                zzbVar.onDismiss(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i) {
            int i2 = this.activePointerId;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (z) {
            if (this.viewDragHelper == null) {
                this.viewDragHelper = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
            }
            if (!this.requestingDisallowInterceptTouchEvent && this.viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            ViewCompat.removeActionWithId(view, PKIFailureInfo.badCertTemplate);
            ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(view, 0);
            if (canSwipeDismissView(view)) {
                ViewCompat.replaceAccessibilityAction(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new zzr(this, 2));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.viewDragHelper == null) {
            return false;
        }
        if (this.requestingDisallowInterceptTouchEvent && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }
}
