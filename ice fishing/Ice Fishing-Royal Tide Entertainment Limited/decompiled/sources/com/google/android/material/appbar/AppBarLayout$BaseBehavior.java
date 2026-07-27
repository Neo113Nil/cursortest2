package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.text.CatchingFishHandlerToolbar;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends CatchingFishHandlerToolbar {
    public int CatchingFishCoroutine = -1;
    public int CatchingFishDaggerWebsocket = -1;
    public int CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;
    public VelocityTracker CatchingFishWorkManager;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishAnimationMockk(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishCloudMessaging(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final /* synthetic */ void CatchingFishFragmentHandler(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishOkHttp(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    @Override // kotlin.text.CatchingFishJUnitToastKtor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishRoomDatabase(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.CatchingFishWorkManager;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.CatchingFishWorkManager.computeCurrentVelocity(1000);
                this.CatchingFishWorkManager.getYVelocity(this.CatchingFishCoroutine);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.CatchingFishCoroutine);
                if (findPointerIndex != -1) {
                    this.CatchingFishReduxKtor = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.CatchingFishCoroutine = motionEvent.getPointerId(i);
                    this.CatchingFishReduxKtor = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.CatchingFishWorkManager;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.CatchingFishSnackbar;
            }
        }
        this.CatchingFishSnackbar = false;
        this.CatchingFishCoroutine = -1;
        VelocityTracker velocityTracker3 = this.CatchingFishWorkManager;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.CatchingFishWorkManager = null;
        }
        velocityTracker = this.CatchingFishWorkManager;
        if (velocityTracker != null) {
        }
        if (!this.CatchingFishSnackbar) {
        }
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final void CatchingFishStateLiveData(View view, View view2, int i) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final Parcelable CatchingFishUnitTesting(View view) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelFAB(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishHandlerToolbar, kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishViewModelScope(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // kotlin.text.CatchingFishJUnitToastKtor
    public final boolean CatchingFishWorkManager(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.CatchingFishDaggerWebsocket < 0) {
            this.CatchingFishDaggerWebsocket = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.CatchingFishSnackbar) {
            int i = this.CatchingFishCoroutine;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.CatchingFishReduxKtor) > this.CatchingFishDaggerWebsocket) {
                    this.CatchingFishReduxKtor = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.CatchingFishWorkManager;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.CatchingFishCoroutine = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
