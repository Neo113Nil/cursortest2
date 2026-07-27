package com.google.android.material.carousel;

import D.RunnableC0282a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.AbstractC3376ix;
import com.google.android.gms.internal.ads.C3675oP;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.icefishing.icefishinglive2.AbstractC4404f;
import com.icefishing.icefishinglive2.C5275R;
import k3.AbstractC4632a;
import r3.C4953b;
import r3.C4954c;
import r3.C4955d;
import r3.C4957f;
import t0.AbstractC4990E;
import t0.C4991F;
import t0.C5000O;
import t0.InterfaceC4999N;

/* loaded from: classes2.dex */
public class CarouselLayoutManager extends AbstractC4990E implements InterfaceC4999N {

    /* renamed from: p, reason: collision with root package name */
    public final C4957f f35909p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractC3376ix f35910q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f35911r;

    public CarouselLayoutManager() {
        C4957f c4957f = new C4957f();
        new C4954c();
        this.f35911r = new View.OnLayoutChangeListener() { // from class: r3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i6, int i9, int i10, int i11, int i12, int i13, int i14) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i == i11 && i6 == i12 && i9 == i13 && i10 == i14) {
                    return;
                }
                view.post(new RunnableC0282a(26, carouselLayoutManager));
            }
        };
        this.f35909p = c4957f;
        l0();
        C0(0);
    }

    public final boolean A0() {
        return this.f35910q.f31138b == 0;
    }

    public final boolean B0() {
        return A0() && C() == 1;
    }

    public final void C0(int i) {
        C4955d c4955d;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "invalid orientation:"));
        }
        c(null);
        AbstractC3376ix abstractC3376ix = this.f35910q;
        if (abstractC3376ix == null || i != abstractC3376ix.f31138b) {
            if (i == 0) {
                c4955d = new C4955d(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c4955d = new C4955d(this, 0);
            }
            this.f35910q = c4955d;
            l0();
        }
    }

    @Override // t0.AbstractC4990E
    public final boolean L() {
        return true;
    }

    @Override // t0.AbstractC4990E
    public final void Q(RecyclerView recyclerView) {
        C4957f c4957f = this.f35909p;
        Context context = recyclerView.getContext();
        float f3 = c4957f.f40380a;
        if (f3 <= 0.0f) {
            f3 = context.getResources().getDimension(C5275R.dimen.m3_carousel_small_item_size_min);
        }
        c4957f.f40380a = f3;
        float f9 = c4957f.f40381b;
        if (f9 <= 0.0f) {
            f9 = context.getResources().getDimension(C5275R.dimen.m3_carousel_small_item_size_max);
        }
        c4957f.f40381b = f9;
        l0();
        recyclerView.addOnLayoutChangeListener(this.f35911r);
    }

    @Override // t0.AbstractC4990E
    public final void R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f35911r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (B0() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (B0() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // t0.AbstractC4990E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View S(View view, int i, C3675oP c3675oP, C5000O c5000o) {
        char c9;
        if (v() == 0) {
            return null;
        }
        int i6 = this.f35910q.f31138b;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i6 == 0) {
                    }
                    c9 = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        }
                        c9 = 0;
                    } else {
                        if (i6 == 0) {
                        }
                        c9 = 0;
                    }
                }
                if (c9 == 0) {
                    return null;
                }
                if (c9 == 65535) {
                    if (AbstractC4990E.H(view) == 0) {
                        return null;
                    }
                    int H8 = AbstractC4990E.H(u(0)) - 1;
                    if (H8 < 0 || H8 >= B()) {
                        return u(B0() ? v() - 1 : 0);
                    }
                    this.f35910q.d();
                    throw null;
                }
                if (AbstractC4990E.H(view) == B() - 1) {
                    return null;
                }
                int H9 = AbstractC4990E.H(u(v() - 1)) + 1;
                if (H9 < 0 || H9 >= B()) {
                    return u(B0() ? 0 : v() - 1);
                }
                this.f35910q.d();
                throw null;
            }
            c9 = 1;
            if (c9 == 0) {
            }
        }
        c9 = 65535;
        if (c9 == 0) {
        }
    }

    @Override // t0.AbstractC4990E
    public final void T(AccessibilityEvent accessibilityEvent) {
        super.T(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC4990E.H(u(0)));
            accessibilityEvent.setToIndex(AbstractC4990E.H(u(v() - 1)));
        }
    }

    @Override // t0.AbstractC4990E
    public final void W(int i, int i6) {
        B();
    }

    @Override // t0.AbstractC4990E
    public final void Z(int i, int i6) {
        B();
    }

    @Override // t0.InterfaceC4999N
    public final PointF a(int i) {
        return null;
    }

    @Override // t0.AbstractC4990E
    public final void b0(C3675oP c3675oP, C5000O c5000o) {
        if (c5000o.b() > 0) {
            if ((A0() ? this.f40549n : this.f40550o) > 0.0f) {
                B0();
                View view = c3675oP.i(0, Long.MAX_VALUE).f40590a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        g0(c3675oP);
    }

    @Override // t0.AbstractC4990E
    public final void c0(C5000O c5000o) {
        if (v() == 0) {
            return;
        }
        AbstractC4990E.H(u(0));
    }

    @Override // t0.AbstractC4990E
    public final boolean d() {
        return A0();
    }

    @Override // t0.AbstractC4990E
    public final boolean e() {
        return !A0();
    }

    @Override // t0.AbstractC4990E
    public final int j(C5000O c5000o) {
        v();
        return 0;
    }

    @Override // t0.AbstractC4990E
    public final int k(C5000O c5000o) {
        return 0;
    }

    @Override // t0.AbstractC4990E
    public final boolean k0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z6) {
        return false;
    }

    @Override // t0.AbstractC4990E
    public final int l(C5000O c5000o) {
        return 0;
    }

    @Override // t0.AbstractC4990E
    public final int m(C5000O c5000o) {
        v();
        return 0;
    }

    @Override // t0.AbstractC4990E
    public final int m0(int i, C3675oP c3675oP, C5000O c5000o) {
        if (!A0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c3675oP.i(0, Long.MAX_VALUE).f40590a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t0.AbstractC4990E
    public final int n(C5000O c5000o) {
        return 0;
    }

    @Override // t0.AbstractC4990E
    public final void n0(int i) {
    }

    @Override // t0.AbstractC4990E
    public final int o(C5000O c5000o) {
        return 0;
    }

    @Override // t0.AbstractC4990E
    public final int o0(int i, C3675oP c3675oP, C5000O c5000o) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = c3675oP.i(0, Long.MAX_VALUE).f40590a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t0.AbstractC4990E
    public final C4991F r() {
        return new C4991F(-2, -2);
    }

    @Override // t0.AbstractC4990E
    public final void x0(RecyclerView recyclerView, int i) {
        C4953b c4953b = new C4953b(0, recyclerView.getContext(), this);
        c4953b.f40757a = i;
        y0(c4953b);
    }

    @Override // t0.AbstractC4990E
    public final void y(Rect rect, View view) {
        super.y(rect, view);
        rect.centerY();
        if (A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i6) {
        new C4954c();
        this.f35911r = new View.OnLayoutChangeListener() { // from class: r3.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i9, int i62, int i92, int i10, int i11, int i12, int i13, int i14) {
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                if (i9 == i11 && i62 == i12 && i92 == i13 && i10 == i14) {
                    return;
                }
                view.post(new RunnableC0282a(26, carouselLayoutManager));
            }
        };
        this.f35909p = new C4957f();
        l0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4632a.f38630b);
            obtainStyledAttributes.getInt(0, 0);
            l0();
            C0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
