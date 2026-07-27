package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import k3.AbstractC4645a;

/* loaded from: classes2.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC4645a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f35966b;

    /* renamed from: d, reason: collision with root package name */
    public int f35968d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f35970f;

    /* renamed from: c, reason: collision with root package name */
    public int f35967c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f35969e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f35969e < 0) {
            this.f35969e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f35966b) {
            int i = this.f35967c;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y6 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y6 - this.f35968d) > this.f35969e) {
                    this.f35968d = y6;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f35970f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f35967c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // k3.AbstractC4645a, B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i9) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i9) {
        throw new ClassCastException();
    }

    @Override // B.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i9, int[] iArr) {
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
            VelocityTracker velocityTracker2 = this.f35970f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f35970f.computeCurrentVelocity(1000);
                this.f35970f.getYVelocity(this.f35967c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f35967c);
                if (findPointerIndex != -1) {
                    this.f35968d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f35967c = motionEvent.getPointerId(i);
                    this.f35968d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f35970f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.f35966b;
            }
        }
        this.f35966b = false;
        this.f35967c = -1;
        VelocityTracker velocityTracker3 = this.f35970f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f35970f = null;
        }
        velocityTracker = this.f35970f;
        if (velocityTracker != null) {
        }
        if (!this.f35966b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
