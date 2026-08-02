package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.d;

/* loaded from: classes11.dex */
public final class vxw0 extends kq31 {
    public int a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public vxw0(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.kq31
    public final int a(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.c.x;
        if (i2 == 0) {
            width = this.a;
            if (z) {
                width -= view.getWidth();
                width2 = this.a;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.a;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.a + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.a;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.kq31
    public final int b(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // defpackage.kq31
    public final int c(View view) {
        return view.getWidth();
    }

    @Override // defpackage.kq31
    public final void g(int i, View view) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.w = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.w = false;
        }
    }

    @Override // defpackage.kq31
    public final void h(int i) {
        dc5 dc5Var = this.c.b;
        if (dc5Var != null) {
            cc5 cc5Var = dc5Var.a.s;
            if (i == 0) {
                d.b().e(cc5Var);
            } else if (i == 1 || i == 2) {
                d.b().d(cc5Var);
            }
        }
    }

    @Override // defpackage.kq31
    public final void i(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.z;
        float width2 = view.getWidth() * swipeDismissBehavior.A;
        float abs = Math.abs(i - this.a);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.a) >= java.lang.Math.round(r9.getWidth() * r3.y)) goto L27;
     */
    @Override // defpackage.kq31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(View view, float f, float f2) {
        int i;
        dc5 dc5Var;
        this.b = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.x;
            if (i2 != 2) {
                i = i2 == 0 ? this.a : this.a;
            }
            if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.a;
                if (left >= i3) {
                    i = i3 + width;
                    z = true;
                }
            }
            i = this.a - width;
            z = true;
        }
        if (swipeDismissBehavior.a.r(i, view.getTop())) {
            view.postOnAnimation(new wxw0(swipeDismissBehavior, view, z));
        } else {
            if (!z || (dc5Var = swipeDismissBehavior.b) == null) {
                return;
            }
            dc5Var.a(view);
        }
    }

    @Override // defpackage.kq31
    public final boolean k(int i, View view) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.u(view);
    }
}
