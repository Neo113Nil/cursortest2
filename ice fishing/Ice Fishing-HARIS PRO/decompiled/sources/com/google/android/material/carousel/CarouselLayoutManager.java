package com.google.android.material.carousel;

import D1.h;
import E0.b;
import E0.c;
import E0.d;
import E0.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.lumenpath.harispro.hrnavigator.R;
import k0.K;
import k0.L;
import k0.Q;
import k0.W;
import k0.X;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends K implements W {

    /* renamed from: p, reason: collision with root package name */
    public final f f2445p;

    /* renamed from: q, reason: collision with root package name */
    public d f2446q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f2447r;

    public CarouselLayoutManager() {
        f fVar = new f();
        new c();
        this.f2447r = new View.OnLayoutChangeListener() { // from class: E0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new D.a(1, carouselLayoutManager));
            }
        };
        this.f2445p = fVar;
        p0();
        G0(0);
    }

    @Override // k0.K
    public final void B0(RecyclerView recyclerView, int i) {
        b bVar = new b(this, recyclerView.getContext(), 0);
        bVar.f3614a = i;
        C0(bVar);
    }

    public final boolean E0() {
        return this.f2446q.f177a == 0;
    }

    public final boolean F0() {
        return E0() && C() == 1;
    }

    public final void G0(int i) {
        d dVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(h.e("invalid orientation:", i));
        }
        c(null);
        d dVar2 = this.f2446q;
        if (dVar2 == null || i != dVar2.f177a) {
            if (i == 0) {
                dVar = new d(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                dVar = new d(this, 0);
            }
            this.f2446q = dVar;
            p0();
        }
    }

    @Override // k0.K
    public final boolean L() {
        return true;
    }

    @Override // k0.K
    public final void O(View view) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // k0.K
    public final void S(RecyclerView recyclerView) {
        f fVar = this.f2445p;
        Context context = recyclerView.getContext();
        float f2 = fVar.f180a;
        if (f2 <= RecyclerView.f2111C0) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        fVar.f180a = f2;
        float f3 = fVar.f181b;
        if (f3 <= RecyclerView.f2111C0) {
            f3 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        fVar.f181b = f3;
        p0();
        recyclerView.addOnLayoutChangeListener(this.f2447r);
    }

    @Override // k0.K
    public final void T(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2447r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003a, code lost:
    
        if (r7 == 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0043, code lost:
    
        if (F0() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0046, code lost:
    
        if (r7 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
    
        if (F0() != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // k0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View U(View view, int i, Q q2, X x2) {
        char c2;
        if (v() == 0) {
            return null;
        }
        int i2 = this.f2446q.f177a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c2 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        }
                        c2 = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c2 = 0;
                    }
                }
                if (c2 == 0) {
                    return null;
                }
                if (c2 == 65535) {
                    if (K.H(view) == 0) {
                        return null;
                    }
                    int H2 = K.H(u(0)) - 1;
                    if (H2 < 0 || H2 >= B()) {
                        return u(F0() ? v() - 1 : 0);
                    }
                    this.f2446q.a();
                    throw null;
                }
                if (K.H(view) == B() - 1) {
                    return null;
                }
                int H3 = K.H(u(v() - 1)) + 1;
                if (H3 < 0 || H3 >= B()) {
                    return u(F0() ? 0 : v() - 1);
                }
                this.f2446q.a();
                throw null;
            }
            c2 = 1;
            if (c2 == 0) {
            }
        }
        c2 = 65535;
        if (c2 == 0) {
        }
    }

    @Override // k0.K
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(K.H(u(0)));
            accessibilityEvent.setToIndex(K.H(u(v() - 1)));
        }
    }

    @Override // k0.K
    public final void Z(int i, int i2) {
        B();
    }

    @Override // k0.W
    public final PointF a(int i) {
        return null;
    }

    @Override // k0.K
    public final void c0(int i, int i2) {
        B();
    }

    @Override // k0.K
    public final boolean d() {
        return E0();
    }

    @Override // k0.K
    public final boolean e() {
        return !E0();
    }

    @Override // k0.K
    public final void e0(Q q2, X x2) {
        if (x2.b() > 0) {
            if ((E0() ? this.f3394n : this.f3395o) > RecyclerView.f2111C0) {
                F0();
                O(q2.k(0, Long.MAX_VALUE).f3449a);
                throw null;
            }
        }
        k0(q2);
    }

    @Override // k0.K
    public final void f0(X x2) {
        if (v() == 0) {
            return;
        }
        K.H(u(0));
    }

    @Override // k0.K
    public final int j(X x2) {
        v();
        return 0;
    }

    @Override // k0.K
    public final int k(X x2) {
        return 0;
    }

    @Override // k0.K
    public final int l(X x2) {
        return 0;
    }

    @Override // k0.K
    public final int m(X x2) {
        v();
        return 0;
    }

    @Override // k0.K
    public final int n(X x2) {
        return 0;
    }

    @Override // k0.K
    public final int o(X x2) {
        return 0;
    }

    @Override // k0.K
    public final boolean o0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // k0.K
    public final int q0(int i, Q q2, X x2) {
        if (!E0() || v() == 0 || i == 0) {
            return 0;
        }
        O(q2.k(0, Long.MAX_VALUE).f3449a);
        throw null;
    }

    @Override // k0.K
    public final L r() {
        return new L(-2, -2);
    }

    @Override // k0.K
    public final void r0(int i) {
    }

    @Override // k0.K
    public final int s0(int i, Q q2, X x2) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        O(q2.k(0, Long.MAX_VALUE).f3449a);
        throw null;
    }

    @Override // k0.K
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (E0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new c();
        this.f2447r = new View.OnLayoutChangeListener() { // from class: E0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                carouselLayoutManager.getClass();
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new D.a(1, carouselLayoutManager));
            }
        };
        this.f2445p = new f();
        p0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.e);
            obtainStyledAttributes.getInt(0, 0);
            p0();
            G0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
