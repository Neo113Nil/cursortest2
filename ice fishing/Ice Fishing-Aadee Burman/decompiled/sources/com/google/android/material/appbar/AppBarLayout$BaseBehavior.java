package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m3.AbstractC4732a;

/* loaded from: classes2.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC4732a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f35803b;

    /* renamed from: d, reason: collision with root package name */
    public int f35805d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f35807f;

    /* renamed from: c, reason: collision with root package name */
    public int f35804c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f35806e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f35806e < 0) {
            this.f35806e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f35803b) {
            int i = this.f35804c;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y7 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y7 - this.f35805d) > this.f35806e) {
                    this.f35805d = y7;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f35807f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f35804c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // m3.AbstractC4732a, B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i6, int[] iArr, int i9) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9, int[] iArr) {
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
    public final boolean o(int i, int i6, View view) {
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
            VelocityTracker velocityTracker2 = this.f35807f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f35807f.computeCurrentVelocity(1000);
                this.f35807f.getYVelocity(this.f35804c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f35804c);
                if (findPointerIndex != -1) {
                    this.f35805d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f35804c = motionEvent.getPointerId(i);
                    this.f35805d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f35807f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.f35803b;
            }
        }
        this.f35803b = false;
        this.f35804c = -1;
        VelocityTracker velocityTracker3 = this.f35807f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f35807f = null;
        }
        velocityTracker = this.f35807f;
        if (velocityTracker != null) {
        }
        if (!this.f35803b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
