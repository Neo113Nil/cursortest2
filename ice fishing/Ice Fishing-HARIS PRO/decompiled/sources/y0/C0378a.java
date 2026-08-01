package y0;

import D.b;
import O.K;
import R.j;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378a extends j {

    /* renamed from: a, reason: collision with root package name */
    public int f4766a;

    /* renamed from: b, reason: collision with root package name */
    public int f4767b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f4768c;

    public C0378a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f4768c = swipeDismissBehavior;
    }

    @Override // R.j
    public final int J(View view) {
        return view.getWidth();
    }

    @Override // R.j
    public final void a0(View view, int i) {
        this.f4767b = i;
        this.f4766a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f4768c;
            swipeDismissBehavior.f2362c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f2362c = false;
        }
    }

    @Override // R.j
    public final void b0(int i) {
        this.f4768c.getClass();
    }

    @Override // R.j
    public final void c0(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f4768c;
        float f2 = width * swipeDismissBehavior.e;
        float width2 = view.getWidth() * swipeDismissBehavior.f2364f;
        float abs = Math.abs(i - this.f4766a);
        if (abs <= f2) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(RecyclerView.f2111C0);
        } else {
            view.setAlpha(Math.min(Math.max(RecyclerView.f2111C0, 1.0f - ((abs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        if (java.lang.Math.abs(r1) >= java.lang.Math.round(r5 * 0.5f)) goto L27;
     */
    @Override // R.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(View view, float f2, float f3) {
        int i;
        this.f4767b = -1;
        int width = view.getWidth();
        boolean z2 = true;
        SwipeDismissBehavior swipeDismissBehavior = this.f4768c;
        if (f2 != RecyclerView.f2111C0) {
            WeakHashMap weakHashMap = K.f747a;
            boolean z3 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.f2363d;
            if (i2 != 2) {
                if (i2 == 0) {
                    i = this.f4766a;
                    z2 = false;
                } else {
                    i = this.f4766a;
                    z2 = false;
                }
            }
            if (f2 >= RecyclerView.f2111C0) {
                int left = view.getLeft();
                int i3 = this.f4766a;
                if (left >= i3) {
                    i = i3 + width;
                }
            }
            i = this.f4766a - width;
        } else {
            int left2 = view.getLeft() - this.f4766a;
            float width2 = view.getWidth();
            swipeDismissBehavior.getClass();
        }
        if (swipeDismissBehavior.f2360a.s(i, view.getTop())) {
            b bVar = new b(swipeDismissBehavior, view, z2);
            WeakHashMap weakHashMap2 = K.f747a;
            view.postOnAnimation(bVar);
        }
    }

    @Override // R.j
    public final int m(View view, int i) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = K.f747a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = this.f4768c.f2363d;
        if (i2 == 0) {
            if (z2) {
                width = this.f4766a - view.getWidth();
                width2 = this.f4766a;
            } else {
                width = this.f4766a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f4766a - view.getWidth();
            width2 = view.getWidth() + this.f4766a;
        } else if (z2) {
            width = this.f4766a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f4766a - view.getWidth();
            width2 = this.f4766a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // R.j
    public final int n(View view, int i) {
        return view.getTop();
    }

    @Override // R.j
    public final boolean r0(View view, int i) {
        int i2 = this.f4767b;
        return (i2 == -1 || i2 == i) && this.f4768c.v(view);
    }
}
