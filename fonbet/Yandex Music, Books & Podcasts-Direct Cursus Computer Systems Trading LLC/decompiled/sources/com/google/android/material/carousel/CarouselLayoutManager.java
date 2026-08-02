package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.amh;
import defpackage.b44;
import defpackage.c34;
import defpackage.ceg;
import defpackage.d34;
import defpackage.e34;
import defpackage.jpn;
import defpackage.k5r;
import defpackage.kpn;
import defpackage.vdn;
import defpackage.xq0;
import defpackage.yon;
import defpackage.yz0;
import defpackage.zon;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends yon implements jpn {
    public final yz0 p;
    public ceg q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new e34();
        this.r = new c34(0, this);
        this.p = new yz0();
        R0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.g);
            obtainStyledAttributes.getInt(0, 0);
            R0();
            j1(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.yon
    public final void A0() {
        a0();
    }

    @Override // defpackage.yon
    public final void C0(int i, int i2) {
        a0();
    }

    @Override // defpackage.yon
    public final int D(kpn kpnVar) {
        Q();
        return 0;
    }

    @Override // defpackage.yon
    public final int E(kpn kpnVar) {
        return 0;
    }

    @Override // defpackage.yon
    public final void E0(amh amhVar, kpn kpnVar) {
        if (kpnVar.b() > 0) {
            if ((h1() ? this.n : this.o) > 0.0f) {
                i1();
                o0(amhVar.d(0));
                throw null;
            }
        }
        M0(amhVar);
    }

    @Override // defpackage.yon
    public final int F(kpn kpnVar) {
        return 0;
    }

    @Override // defpackage.yon
    public final void F0(kpn kpnVar) {
        if (Q() == 0) {
            return;
        }
        yon.f0(P(0));
    }

    @Override // defpackage.yon
    public final int G(kpn kpnVar) {
        Q();
        return 0;
    }

    @Override // defpackage.yon
    public final int H(kpn kpnVar) {
        return 0;
    }

    @Override // defpackage.yon
    public final int I(kpn kpnVar) {
        return 0;
    }

    @Override // defpackage.yon
    public final zon M() {
        return new zon(-2, -2);
    }

    @Override // defpackage.yon
    public final boolean Q0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.yon
    public final int S0(int i, amh amhVar, kpn kpnVar) {
        if (!h1() || Q() == 0 || i == 0) {
            return 0;
        }
        o0(amhVar.d(0));
        throw null;
    }

    @Override // defpackage.yon
    public final void T0(int i) {
    }

    @Override // defpackage.yon
    public final void U(Rect rect, View view) {
        super.U(rect, view);
        rect.centerY();
        if (h1()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // defpackage.yon
    public final int U0(int i, amh amhVar, kpn kpnVar) {
        if (!y() || Q() == 0 || i == 0) {
            return 0;
        }
        o0(amhVar.d(0));
        throw null;
    }

    @Override // defpackage.jpn
    public final PointF c(int i) {
        return null;
    }

    @Override // defpackage.yon
    public final void d1(RecyclerView recyclerView, int i) {
        d34 d34Var = new d34(this, recyclerView.getContext());
        d34Var.a = i;
        e1(d34Var);
    }

    public final float g1(float f, float f2) {
        return i1() ? f - f2 : f + f2;
    }

    public final boolean h1() {
        return this.q.b == 0;
    }

    public final boolean i1() {
        return h1() && this.b.getLayoutDirection() == 1;
    }

    public final void j1(int i) {
        b44 b44Var;
        if (i != 0 && i != 1) {
            xq0.x(k5r.i(i, "invalid orientation:"));
            return;
        }
        v(null);
        ceg cegVar = this.q;
        if (cegVar == null || i != cegVar.b) {
            if (i == 0) {
                b44Var = new b44(this, 1);
            } else {
                if (i != 1) {
                    xq0.x("invalid orientation");
                    return;
                }
                b44Var = new b44(this, 0);
            }
            this.q = b44Var;
            R0();
        }
    }

    @Override // defpackage.yon
    public final boolean k0() {
        return true;
    }

    @Override // defpackage.yon
    public final void o0(View view) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // defpackage.yon
    public final void s0(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        yz0 yz0Var = this.p;
        float f = yz0Var.a;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        yz0Var.a = f;
        float f2 = yz0Var.b;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        yz0Var.b = f2;
        R0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.yon
    public final void t0(RecyclerView recyclerView, amh amhVar) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x003a, code lost:
    
        if (r6 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        if (i1() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        if (r6 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0051, code lost:
    
        if (i1() != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View u0(View view, int i, amh amhVar, kpn kpnVar) {
        char c;
        if (Q() == 0) {
            return null;
        }
        int i2 = this.q.b;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        }
                        c = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c = 0;
                    }
                }
                if (c == 0) {
                    return null;
                }
                if (c == 65535) {
                    if (yon.f0(view) == 0) {
                        return null;
                    }
                    int f0 = yon.f0(P(0)) - 1;
                    if (f0 < 0 || f0 >= a0()) {
                        return P(i1() ? Q() - 1 : 0);
                    }
                    this.q.l();
                    throw null;
                }
                if (yon.f0(view) == a0() - 1) {
                    return null;
                }
                int f02 = yon.f0(P(Q() - 1)) + 1;
                if (f02 < 0 || f02 >= a0()) {
                    return P(i1() ? 0 : Q() - 1);
                }
                this.q.l();
                throw null;
            }
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    @Override // defpackage.yon
    public final void v0(AccessibilityEvent accessibilityEvent) {
        super.v0(accessibilityEvent);
        if (Q() > 0) {
            accessibilityEvent.setFromIndex(yon.f0(P(0)));
            accessibilityEvent.setToIndex(yon.f0(P(Q() - 1)));
        }
    }

    @Override // defpackage.yon
    public final boolean x() {
        return h1();
    }

    @Override // defpackage.yon
    public final boolean y() {
        return !h1();
    }

    @Override // defpackage.yon
    public final void z0(int i, int i2) {
        a0();
    }

    public CarouselLayoutManager() {
        yz0 yz0Var = new yz0();
        new e34();
        this.r = new c34(0, this);
        this.p = yz0Var;
        R0();
        j1(0);
    }
}
