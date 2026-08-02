package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class con implements tb6 {
    public final Context a;
    public final long b;
    public final float c;
    public final float d;
    public final boolean e;
    public final float f;
    public final long g;
    public final float h;
    public final float i;
    public final float j;
    public final boolean k;
    public final float l;
    public final long m;
    public final float n;
    public final long o;
    public final float p;
    public final float q;
    public final boolean r;
    public final float s;
    public final long t;
    public final float u;
    public final float v;

    public con(Context context, long j) {
        float f = Float.compare(fma.b(j), (float) 105) < 0 ? 8 : 12;
        float f2 = Float.compare(fma.b(j), (float) 105) < 0 ? 4 : 8;
        boolean z = Float.compare(fma.c(j), (float) 340) < 0 || Float.compare(fma.b(j), (float) 80) < 0;
        float b = fma.b(j) - (2 * f);
        long m = xv.m(b, b);
        float f3 = Float.compare(fma.b(j), (float) 105) < 0 ? 2.7f : 2.56f;
        float c = (((fma.c(j) - b) - (3.0f * f)) - (2 * f2)) / 4;
        float b2 = (fma.b(j) - (2 * f)) / f3;
        boolean z2 = Float.compare(c, (float) 48) >= 0;
        float c2 = (fma.c(j) - b) - (3 * f);
        long z3 = v7g.z(14);
        float f4 = c2 * 0.4f;
        long z4 = v7g.z(16);
        float f5 = c2 * 0.7f;
        float b3 = ((fma.b(j) - b2) - (2 * f)) - f2;
        float f6 = 4;
        float c3 = kes.c(z3) * f6;
        float f7 = 3;
        context.getClass();
        float applyDimension = TypedValue.applyDimension(2, c3 / f7, context.getResources().getDisplayMetrics());
        Resources resources = context.getResources();
        resources.getClass();
        float f8 = applyDimension / resources.getDisplayMetrics().density;
        float applyDimension2 = TypedValue.applyDimension(2, (kes.c(z4) * f6) / f7, context.getResources().getDisplayMetrics());
        Resources resources2 = context.getResources();
        resources2.getClass();
        boolean z5 = Float.compare((applyDimension2 / resources2.getDisplayMetrics().density) + f8, b3) <= 0;
        float f9 = 1;
        float f10 = 14;
        long m2 = xv.m(f10, f10);
        float f11 = z ? 0.8f : 1.0f;
        float b4 = ((fma.b(j) / 3) - (2 * f)) - f9;
        context.getClass();
        this.a = context;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = b;
        this.g = m;
        this.h = f3;
        this.i = c;
        this.j = b2;
        this.k = z2;
        this.l = c2;
        this.m = z3;
        this.n = f4;
        this.o = z4;
        this.p = f5;
        this.q = b3;
        this.r = z5;
        this.s = f9;
        this.t = m2;
        this.u = f11;
        this.v = b4;
    }

    @Override // defpackage.tb6
    public final float a() {
        return this.c;
    }

    public final con c() {
        long j = this.b;
        return new con(this.a, xv.m(fma.c(j), (fma.b(j) / 3) * 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof con)) {
            return false;
        }
        con conVar = (con) obj;
        return Intrinsics.d(this.a, conVar.a) && fma.a(this.b, conVar.b) && cma.a(this.c, conVar.c) && cma.a(this.d, conVar.d) && this.e == conVar.e && cma.a(this.f, conVar.f) && fma.a(this.g, conVar.g) && Float.compare(this.h, conVar.h) == 0 && cma.a(this.i, conVar.i) && cma.a(this.j, conVar.j) && this.k == conVar.k && cma.a(this.l, conVar.l) && kes.a(this.m, conVar.m) && cma.a(this.n, conVar.n) && kes.a(this.o, conVar.o) && cma.a(this.p, conVar.p) && cma.a(this.q, conVar.q) && this.r == conVar.r && cma.a(this.s, conVar.s) && fma.a(this.t, conVar.t) && Float.compare(this.u, conVar.u) == 0 && cma.a(this.v, conVar.v);
    }

    @Override // defpackage.tb6
    public final Context getContext() {
        return this.a;
    }

    public final int hashCode() {
        int a = eta.a(k5r.e(eta.a(eta.a(eta.a(tlm.c(this.g, eta.a(k5r.e(eta.a(eta.a(tlm.c(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31), 31, this.e), this.f, 31), 31), this.h, 31), this.i, 31), this.j, 31), 31, this.k), this.l, 31);
        les[] lesVarArr = kes.b;
        return Float.hashCode(this.v) + eta.a(tlm.c(this.t, eta.a(k5r.e(eta.a(eta.a(tlm.c(this.o, eta.a(tlm.c(this.m, a, 31), this.n, 31), 31), this.p, 31), this.q, 31), 31, this.r), this.s, 31), 31), this.u, 31);
    }

    public final String toString() {
        String d = fma.d(this.b);
        String b = cma.b(this.c);
        String b2 = cma.b(this.d);
        String b3 = cma.b(this.f);
        String d2 = fma.d(this.g);
        String b4 = cma.b(this.i);
        String b5 = cma.b(this.j);
        String b6 = cma.b(this.l);
        String d3 = kes.d(this.m);
        String b7 = cma.b(this.n);
        String d4 = kes.d(this.o);
        String b8 = cma.b(this.p);
        String b9 = cma.b(this.q);
        String b10 = cma.b(this.s);
        String d5 = fma.d(this.t);
        String b11 = cma.b(this.v);
        StringBuilder sb = new StringBuilder("RectangleContentConfig(context=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(d);
        sb.append(", contentPadding=");
        su4.v(sb, b, ", secondaryContentPadding=", b2, ", isSmallSize=");
        sb.append(this.e);
        sb.append(", coverImageSide=");
        sb.append(b3);
        sb.append(", coverImageSize=");
        sb.append(d2);
        sb.append(", buttonsScale=");
        sb.append(this.h);
        sb.append(", buttonWidth=");
        su4.v(sb, b4, ", buttonHeight=", b5, ", showExpandedButtons=");
        sb.append(this.k);
        sb.append(", maxTextPlaceholderWidth=");
        sb.append(b6);
        sb.append(", subtitleFontSize=");
        su4.v(sb, d3, ", subtitlePlaceholderWidth=", b7, ", titleFontSize=");
        su4.v(sb, d4, ", titlePlaceholderWidth=", b8, ", textAvailableHeightSpace=");
        sb.append(b9);
        sb.append(", showSubtitle=");
        sb.append(this.r);
        sb.append(", dividerThickness=");
        su4.v(sb, b10, ", logoSize=", d5, ", iconScale=");
        sb.append(this.u);
        sb.append(", recentlyCoverSide=");
        sb.append(b11);
        sb.append(")");
        return sb.toString();
    }
}
