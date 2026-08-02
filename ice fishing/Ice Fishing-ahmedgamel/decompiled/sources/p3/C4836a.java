package p3;

import O.X;
import W.d;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4836a extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f39812a;

    /* renamed from: b, reason: collision with root package name */
    public int f39813b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f39814c;

    public C4836a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f39814c = swipeDismissBehavior;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i4) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = X.f2142a;
        boolean z6 = view.getLayoutDirection() == 1;
        int i6 = this.f39814c.f36594d;
        if (i6 == 0) {
            if (z6) {
                width = this.f39812a - view.getWidth();
                width2 = this.f39812a;
            } else {
                width = this.f39812a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i6 != 1) {
            width = this.f39812a - view.getWidth();
            width2 = view.getWidth() + this.f39812a;
        } else if (z6) {
            width = this.f39812a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f39812a - view.getWidth();
            width2 = this.f39812a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // W.d
    public final int clampViewPositionVertical(View view, int i, int i4) {
        return view.getTop();
    }

    @Override // W.d
    public final int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // W.d
    public final void onViewCaptured(View view, int i) {
        this.f39813b = i;
        this.f39812a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f39814c;
            swipeDismissBehavior.f36593c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f36593c = false;
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        this.f39814c.getClass();
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i4, int i6, int i9) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f39814c;
        float f2 = width * swipeDismissBehavior.f36595e;
        float width2 = view.getWidth() * swipeDismissBehavior.f36596f;
        float abs = Math.abs(i - this.f39812a);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f39812a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // W.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewReleased(View view, float f2, float f9) {
        int i;
        this.f39813b = -1;
        int width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f39814c;
        boolean z6 = true;
        if (f2 != 0.0f) {
            WeakHashMap weakHashMap = X.f2142a;
            boolean z9 = view.getLayoutDirection() == 1;
            int i4 = swipeDismissBehavior.f36594d;
            if (i4 != 2) {
                if (i4 == 0) {
                    i = this.f39812a;
                    z6 = false;
                } else {
                    i = this.f39812a;
                    z6 = false;
                }
            }
            if (f2 >= 0.0f) {
                int left = view.getLeft();
                int i6 = this.f39812a;
                if (left >= i6) {
                    i = i6 + width;
                }
            }
            i = this.f39812a - width;
        }
        if (swipeDismissBehavior.f36591a.q(i, view.getTop())) {
            RunnableC3214fP runnableC3214fP = new RunnableC3214fP(swipeDismissBehavior, view, z6);
            WeakHashMap weakHashMap2 = X.f2142a;
            view.postOnAnimation(runnableC3214fP);
        }
    }

    @Override // W.d
    public final boolean tryCaptureView(View view, int i) {
        int i4 = this.f39813b;
        return (i4 == -1 || i4 == i) && this.f39814c.r(view);
    }
}
