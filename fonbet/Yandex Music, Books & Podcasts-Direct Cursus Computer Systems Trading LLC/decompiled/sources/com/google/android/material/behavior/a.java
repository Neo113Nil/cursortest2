package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;
import defpackage.bnd;
import defpackage.geu;
import defpackage.gu2;
import defpackage.ju2;
import defpackage.x3n;
import defpackage.zur;

/* loaded from: classes3.dex */
public final class a extends geu {
    public int a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.geu
    public final int a(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.c.swipeDirection;
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
                width2 = view.getWidth() + this.a;
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.a;
            }
        }
        return SwipeDismissBehavior.clamp(width, i, width2);
    }

    @Override // defpackage.geu
    public final int b(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.geu
    public final int c(View view) {
        return view.getWidth();
    }

    @Override // defpackage.geu
    public final void f(int i, View view) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.requestingDisallowInterceptTouchEvent = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.requestingDisallowInterceptTouchEvent = false;
        }
    }

    @Override // defpackage.geu
    public final void g(int i) {
        zur zurVar = this.c.listener;
        if (zurVar != null) {
            gu2 gu2Var = ((ju2) ((bnd) zurVar).b).t;
            if (i == 0) {
                x3n.h0().J0(gu2Var);
            } else if (i == 1 || i == 2) {
                x3n.h0().C0(gu2Var);
            }
        }
    }

    @Override // defpackage.geu
    public final void h(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.alphaStartSwipeDistance;
        float width2 = view.getWidth() * swipeDismissBehavior.alphaEndSwipeDistance;
        float abs = Math.abs(i - this.a);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(f, width2, abs), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.a) >= java.lang.Math.round(r9.getWidth() * r3.dragDismissThreshold)) goto L27;
     */
    @Override // defpackage.geu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, float f, float f2) {
        int i;
        zur zurVar;
        this.b = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.swipeDirection;
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
        if (swipeDismissBehavior.viewDragHelper.q(i, view.getTop())) {
            view.postOnAnimation(new c(swipeDismissBehavior, view, z));
        } else {
            if (!z || (zurVar = swipeDismissBehavior.listener) == null) {
                return;
            }
            ((bnd) zurVar).r(view);
        }
    }

    @Override // defpackage.geu
    public final boolean j(int i, View view) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.canSwipeDismissView(view);
    }
}
