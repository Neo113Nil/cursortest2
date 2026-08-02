package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o3.AbstractC4803a;

/* loaded from: classes2.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC4803a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f36572b;

    /* renamed from: d, reason: collision with root package name */
    public int f36574d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f36576f;

    /* renamed from: c, reason: collision with root package name */
    public int f36573c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f36575e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f36575e < 0) {
            this.f36575e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f36572b) {
            int i = this.f36573c;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y7 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y7 - this.f36574d) > this.f36575e) {
                    this.f36574d = y7;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f36576f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f36573c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // o3.AbstractC4803a, B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i6) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i6) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i6, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean o(int i, int i4, View view) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    @Override // B.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f36576f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f36576f.computeCurrentVelocity(1000);
                this.f36576f.getYVelocity(this.f36573c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f36573c);
                if (findPointerIndex != -1) {
                    this.f36574d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f36573c = motionEvent.getPointerId(i);
                    this.f36574d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f36576f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.f36572b;
            }
        }
        this.f36572b = false;
        this.f36573c = -1;
        VelocityTracker velocityTracker3 = this.f36576f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f36576f = null;
        }
        velocityTracker = this.f36576f;
        if (velocityTracker != null) {
        }
        if (!this.f36572b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
