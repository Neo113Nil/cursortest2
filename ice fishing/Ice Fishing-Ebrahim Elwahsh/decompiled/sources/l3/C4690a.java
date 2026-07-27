package l3;

import O.X;
import W.d;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import h3.l;
import java.util.WeakHashMap;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4690a extends d {

    /* renamed from: a, reason: collision with root package name */
    public int f39045a;

    /* renamed from: b, reason: collision with root package name */
    public int f39046b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f39047c;

    public C4690a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f39047c = swipeDismissBehavior;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i4) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = X.f2240a;
        boolean z8 = view.getLayoutDirection() == 1;
        int i9 = this.f39047c.f35989d;
        if (i9 == 0) {
            if (z8) {
                width = this.f39045a - view.getWidth();
                width2 = this.f39045a;
            } else {
                width = this.f39045a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i9 != 1) {
            width = this.f39045a - view.getWidth();
            width2 = view.getWidth() + this.f39045a;
        } else if (z8) {
            width = this.f39045a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f39045a - view.getWidth();
            width2 = this.f39045a;
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
        this.f39046b = i;
        this.f39045a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f39047c;
            swipeDismissBehavior.f35988c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f35988c = false;
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        this.f39047c.getClass();
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i4, int i9, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f39047c;
        float f6 = width * swipeDismissBehavior.f35990e;
        float width2 = view.getWidth() * swipeDismissBehavior.f35991f;
        float abs = Math.abs(i - this.f39045a);
        if (abs <= f6) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f6) / (width2 - f6))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f39045a) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // W.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewReleased(View view, float f6, float f9) {
        int i;
        this.f39046b = -1;
        int width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f39047c;
        boolean z8 = true;
        if (f6 != 0.0f) {
            WeakHashMap weakHashMap = X.f2240a;
            boolean z9 = view.getLayoutDirection() == 1;
            int i4 = swipeDismissBehavior.f35989d;
            if (i4 != 2) {
                if (i4 == 0) {
                    i = this.f39045a;
                    z8 = false;
                } else {
                    i = this.f39045a;
                    z8 = false;
                }
            }
            if (f6 >= 0.0f) {
                int left = view.getLeft();
                int i9 = this.f39045a;
                if (left >= i9) {
                    i = i9 + width;
                }
            }
            i = this.f39045a - width;
        }
        if (swipeDismissBehavior.f35986a.q(i, view.getTop())) {
            l lVar = new l(swipeDismissBehavior, view, z8);
            WeakHashMap weakHashMap2 = X.f2240a;
            view.postOnAnimation(lVar);
        }
    }

    @Override // W.d
    public final boolean tryCaptureView(View view, int i) {
        int i4 = this.f39046b;
        return (i4 == -1 || i4 == i) && this.f39047c.r(view);
    }
}
