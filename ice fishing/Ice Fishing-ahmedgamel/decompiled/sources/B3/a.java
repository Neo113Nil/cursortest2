package B3;

import S0.f;
import android.graphics.Typeface;
import t2.n;
import y3.C5234b;

/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: n, reason: collision with root package name */
    public final Typeface f186n;

    /* renamed from: u, reason: collision with root package name */
    public final n f187u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f188v;

    public a(n nVar, Typeface typeface) {
        this.f186n = typeface;
        this.f187u = nVar;
    }

    @Override // S0.f
    public final void p(int i) {
        if (this.f188v) {
            return;
        }
        C5234b c5234b = (C5234b) this.f187u.f40859a;
        if (c5234b.j(this.f186n)) {
            c5234b.h(false);
        }
    }

    @Override // S0.f
    public final void q(Typeface typeface, boolean z3) {
        if (this.f188v) {
            return;
        }
        C5234b c5234b = (C5234b) this.f187u.f40859a;
        if (c5234b.j(typeface)) {
            c5234b.h(false);
        }
    }
}
