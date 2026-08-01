package k0;

import android.view.View;

/* renamed from: k0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205t {

    /* renamed from: a, reason: collision with root package name */
    public V.g f3594a;

    /* renamed from: b, reason: collision with root package name */
    public int f3595b;

    /* renamed from: c, reason: collision with root package name */
    public int f3596c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3597d;
    public boolean e;

    public C0205t() {
        d();
    }

    public final void a() {
        this.f3596c = this.f3597d ? this.f3594a.g() : this.f3594a.k();
    }

    public final void b(View view, int i) {
        if (this.f3597d) {
            this.f3596c = this.f3594a.m() + this.f3594a.b(view);
        } else {
            this.f3596c = this.f3594a.e(view);
        }
        this.f3595b = i;
    }

    public final void c(View view, int i) {
        int m2 = this.f3594a.m();
        if (m2 >= 0) {
            b(view, i);
            return;
        }
        this.f3595b = i;
        if (!this.f3597d) {
            int e = this.f3594a.e(view);
            int k2 = e - this.f3594a.k();
            this.f3596c = e;
            if (k2 > 0) {
                int g2 = (this.f3594a.g() - Math.min(0, (this.f3594a.g() - m2) - this.f3594a.b(view))) - (this.f3594a.c(view) + e);
                if (g2 < 0) {
                    this.f3596c -= Math.min(k2, -g2);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f3594a.g() - m2) - this.f3594a.b(view);
        this.f3596c = this.f3594a.g() - g3;
        if (g3 > 0) {
            int c2 = this.f3596c - this.f3594a.c(view);
            int k3 = this.f3594a.k();
            int min = c2 - (Math.min(this.f3594a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.f3596c = Math.min(g3, -min) + this.f3596c;
            }
        }
    }

    public final void d() {
        this.f3595b = -1;
        this.f3596c = Integer.MIN_VALUE;
        this.f3597d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3595b + ", mCoordinate=" + this.f3596c + ", mLayoutFromEnd=" + this.f3597d + ", mValid=" + this.e + '}';
    }
}
