package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cds {
    public final bds a;
    public final ogi b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public cds(bds bdsVar, ogi ogiVar, long j) {
        this.a = bdsVar;
        this.b = ogiVar;
        this.c = j;
        ArrayList arrayList = ogiVar.h;
        float f = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((ads) ((t5k) arrayList.get(0)).a.d).d(0);
        if (!arrayList.isEmpty()) {
            t5k t5kVar = (t5k) CollectionsKt.Y(arrayList);
            f = ((ads) t5kVar.a.d).d(r4.g - 1) + t5kVar.f;
        }
        this.e = f;
        this.f = ogiVar.g;
    }

    public final i2o a(int i) {
        ogi ogiVar = this.b;
        ogiVar.o(i);
        int length = ((mn0) ogiVar.a.b).b.length();
        ArrayList arrayList = ogiVar.h;
        t5k t5kVar = (t5k) arrayList.get(i == length ? u75.g(arrayList) : cb0.w(arrayList, i));
        return ((ads) t5kVar.a.d).f.isRtlCharAt(t5kVar.d(i)) ? i2o.b : i2o.a;
    }

    public final ynn b(int i) {
        float i2;
        float i3;
        float h;
        float h2;
        ogi ogiVar = this.b;
        ogiVar.n(i);
        ArrayList arrayList = ogiVar.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.w(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        int d = t5kVar.d(i);
        CharSequence charSequence = (CharSequence) ih0Var.e;
        if (d < 0 || d >= charSequence.length()) {
            StringBuilder q = k5r.q(d, "offset(", ") is out of bounds [0,");
            q.append(charSequence.length());
            q.append(')');
            tme.a(q.toString());
        }
        ads adsVar = (ads) ih0Var.d;
        Layout layout = adsVar.f;
        int lineForOffset = layout.getLineForOffset(d);
        float g = adsVar.g(lineForOffset);
        float e = adsVar.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                h = adsVar.i(d, false);
                h2 = adsVar.i(d + 1, true);
            } else if (isRtlCharAt) {
                h = adsVar.h(d, false);
                h2 = adsVar.h(d + 1, true);
            } else {
                i2 = adsVar.i(d, false);
                i3 = adsVar.i(d + 1, true);
            }
            float f = h;
            i2 = h2;
            i3 = f;
        } else {
            i2 = adsVar.h(d, false);
            i3 = adsVar.h(d + 1, true);
        }
        RectF rectF = new RectF(i2, g, i3, e);
        return t5kVar.a(new ynn(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final boolean c() {
        long j = this.c;
        float f = (int) (j >> 32);
        ogi ogiVar = this.b;
        return f < ogiVar.d || ogiVar.c || ((float) ((int) (j & 4294967295L))) < ogiVar.e;
    }

    public final float d(int i) {
        ogi ogiVar = this.b;
        ogiVar.p(i);
        ArrayList arrayList = ogiVar.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.x(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        int i2 = i - t5kVar.d;
        ads adsVar = (ads) ih0Var.d;
        return adsVar.f.getLineRight(i2) + (i2 == adsVar.g + (-1) ? adsVar.k : 0.0f);
    }

    public final int e(int i) {
        ogi ogiVar = this.b;
        ogiVar.p(i);
        ArrayList arrayList = ogiVar.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.x(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        return ((ads) ih0Var.d).f.getLineStart(i - t5kVar.d) + t5kVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cds)) {
            return false;
        }
        cds cdsVar = (cds) obj;
        return Intrinsics.d(this.a, cdsVar.a) && this.b.equals(cdsVar.b) && hqe.a(this.c, cdsVar.c) && this.d == cdsVar.d && this.e == cdsVar.e && Intrinsics.d(this.f, cdsVar.f);
    }

    public final i2o f(int i) {
        ogi ogiVar = this.b;
        ogiVar.o(i);
        int length = ((mn0) ogiVar.a.b).b.length();
        ArrayList arrayList = ogiVar.h;
        t5k t5kVar = (t5k) arrayList.get(i == length ? u75.g(arrayList) : cb0.w(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        int d = t5kVar.d(i);
        ads adsVar = (ads) ih0Var.d;
        return adsVar.f.getParagraphDirection(adsVar.f.getLineForOffset(d)) == 1 ? i2o.a : i2o.b;
    }

    public final nh0 g(int i, int i2) {
        ogi ogiVar = this.b;
        dn9 dn9Var = ogiVar.a;
        if (i < 0 || i > i2 || i2 > ((mn0) dn9Var.b).b.length()) {
            StringBuilder l = dfi.l("Start(", i, i2, ") or End(", ") is out of range [0..");
            l.append(((mn0) dn9Var.b).b.length());
            l.append("), or start > end!");
            tme.a(l.toString());
        }
        if (i == i2) {
            return ph0.a();
        }
        nh0 a = ph0.a();
        cb0.z(ogiVar.h, y5g.P(i, i2), new ngi(a, i, i2, 0));
        return a;
    }

    public final long h(int i) {
        int I;
        int i2;
        int z;
        ogi ogiVar = this.b;
        ogiVar.o(i);
        int length = ((mn0) ogiVar.a.b).b.length();
        ArrayList arrayList = ogiVar.h;
        t5k t5kVar = (t5k) arrayList.get(i == length ? u75.g(arrayList) : cb0.w(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        int d = t5kVar.d(i);
        ah3 j = ((ads) ih0Var.d).j();
        if (j.x(j.I(d))) {
            j.j(d);
            I = d;
            while (I != -1 && (!j.x(I) || j.t(I))) {
                I = j.I(I);
            }
        } else {
            j.j(d);
            I = j.w(d) ? (!j.u(d) || j.s(d)) ? j.I(d) : d : j.s(d) ? j.I(d) : -1;
        }
        if (I == -1) {
            I = d;
        }
        if (j.t(j.z(d))) {
            j.j(d);
            i2 = d;
            while (i2 != -1 && (j.x(i2) || !j.t(i2))) {
                i2 = j.z(i2);
            }
        } else {
            j.j(d);
            if (j.s(d)) {
                if (!j.u(d) || j.w(d)) {
                    z = j.z(d);
                    i2 = z;
                } else {
                    i2 = d;
                }
            } else if (j.w(d)) {
                z = j.z(d);
                i2 = z;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            d = i2;
        }
        return t5kVar.b(y5g.P(I, d), false);
    }

    public final int hashCode() {
        return this.f.hashCode() + eta.a(eta.a(tlm.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutResult(layoutInput=");
        sb.append(this.a);
        sb.append(", multiParagraph=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append((Object) hqe.b(this.c));
        sb.append(", firstBaseline=");
        sb.append(this.d);
        sb.append(", lastBaseline=");
        sb.append(this.e);
        sb.append(", placeholderRects=");
        return k5r.o(sb, this.f, ')');
    }
}
