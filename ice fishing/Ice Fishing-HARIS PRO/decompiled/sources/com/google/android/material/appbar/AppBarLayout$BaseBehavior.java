package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import w0.AbstractC0365a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC0365a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2342b;

    /* renamed from: d, reason: collision with root package name */
    public int f2344d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f2345f;

    /* renamed from: c, reason: collision with root package name */
    public int f2343c = -1;
    public int e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // B.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.e < 0) {
            this.e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2342b) {
            int i = this.f2343c;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y2 - this.f2344d) > this.e) {
                this.f2344d = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f2345f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f2343c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // w0.AbstractC0365a, B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final void o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final void q(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final Parcelable r(View view) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final boolean s(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final void t(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // B.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f2345f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f2345f.computeCurrentVelocity(1000);
                this.f2345f.getYVelocity(this.f2343c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2343c);
                if (findPointerIndex == -1) {
                    return false;
                }
                this.f2344d = (int) motionEvent.getY(findPointerIndex);
                view.getClass();
                throw new ClassCastException();
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f2343c = motionEvent.getPointerId(i);
                    this.f2344d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f2345f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return this.f2342b;
            }
        }
        this.f2342b = false;
        this.f2343c = -1;
        VelocityTracker velocityTracker3 = this.f2345f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f2345f = null;
        }
        velocityTracker = this.f2345f;
        if (velocityTracker != null) {
        }
        return this.f2342b;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
