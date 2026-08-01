package n3;

import O.X;
import W.d;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4756a extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f39472a;

    /* renamed from: b, reason: collision with root package name */
    public int f39473b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f39474c;

    public C4756a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f39474c = swipeDismissBehavior;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i6) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = X.f2054a;
        boolean z3 = view.getLayoutDirection() == 1;
        int i9 = this.f39474c.f35826d;
        if (i9 == 0) {
            if (z3) {
                width = this.f39472a - view.getWidth();
                width2 = this.f39472a;
            } else {
                width = this.f39472a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i9 != 1) {
            width = this.f39472a - view.getWidth();
            width2 = view.getWidth() + this.f39472a;
        } else if (z3) {
            width = this.f39472a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f39472a - view.getWidth();
            width2 = this.f39472a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // W.d
    public final int clampViewPositionVertical(View view, int i, int i6) {
        return view.getTop();
    }

    @Override // W.d
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // W.d
    public final void onViewCaptured(View view, int i) {
        this.f39473b = i;
        this.f39472a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f39474c;
            swipeDismissBehavior.f35825c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f35825c = false;
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        this.f39474c.getClass();
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i6, int i9, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f39474c;
        float f3 = width * swipeDismissBehavior.f35827e;
        float width2 = view.getWidth() * swipeDismissBehavior.f35828f;
        float abs = Math.abs(i - this.f39472a);
        if (abs <= f3) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f3) / (width2 - f3))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f39472a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // W.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewReleased(View view, float f3, float f9) {
        int i;
        this.f39473b = -1;
        int width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f39474c;
        boolean z3 = true;
        if (f3 != 0.0f) {
            WeakHashMap weakHashMap = X.f2054a;
            boolean z6 = view.getLayoutDirection() == 1;
            int i6 = swipeDismissBehavior.f35826d;
            if (i6 != 2) {
                if (i6 == 0) {
                    i = this.f39472a;
                    z3 = false;
                } else {
                    i = this.f39472a;
                    z3 = false;
                }
            }
            if (f3 >= 0.0f) {
                int left = view.getLeft();
                int i9 = this.f39472a;
                if (left >= i9) {
                    i = i9 + width;
                }
            }
            i = this.f39472a - width;
        }
        if (swipeDismissBehavior.f35823a.q(i, view.getTop())) {
            RunnableC3191fP runnableC3191fP = new RunnableC3191fP(swipeDismissBehavior, view, z3);
            WeakHashMap weakHashMap2 = X.f2054a;
            view.postOnAnimation(runnableC3191fP);
        }
    }

    @Override // W.d
    public final boolean tryCaptureView(View view, int i) {
        int i6 = this.f39473b;
        return (i6 == -1 || i6 == i) && this.f39474c.r(view);
    }
}
