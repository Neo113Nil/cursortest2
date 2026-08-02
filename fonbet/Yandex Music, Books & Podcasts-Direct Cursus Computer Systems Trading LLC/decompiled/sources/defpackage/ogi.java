package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class ogi {
    public final dn9 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public ogi(dn9 dn9Var, long j, int i, int i2) {
        boolean z;
        int i3;
        int h;
        int i4;
        this.a = dn9Var;
        this.b = i;
        if (ga6.k(j) != 0 || ga6.j(j) != 0) {
            tme.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) dn9Var.f;
        int size = arrayList2.size();
        float f = 0.0f;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            u5k u5kVar = (u5k) arrayList2.get(i5);
            mh0 mh0Var = u5kVar.a;
            int i7 = ga6.i(j);
            if (ga6.d(j)) {
                i3 = i5;
                h = ga6.h(j) - ((int) Math.ceil(f));
                if (h < 0) {
                    h = 0;
                }
            } else {
                i3 = i5;
                h = ga6.h(j);
            }
            ih0 ih0Var = new ih0(mh0Var, this.b - i6, i2, ia6.b(i7, h, 5));
            ads adsVar = (ads) ih0Var.d;
            float b = ih0Var.b() + f;
            int i8 = i6 + adsVar.g;
            arrayList.add(new t5k(ih0Var, u5kVar.b, u5kVar.c, i6, i8, f, b));
            if (!adsVar.d) {
                if (i8 == this.b) {
                    i4 = i3;
                    if (i4 != u75.g((ArrayList) this.a.f)) {
                    }
                } else {
                    i4 = i3;
                }
                i5 = i4 + 1;
                i6 = i8;
                f = b;
            }
            z = true;
            i6 = i8;
            f = b;
            break;
        }
        z = false;
        this.e = f;
        this.f = i6;
        this.c = z;
        this.h = arrayList;
        this.d = ga6.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            t5k t5kVar = (t5k) arrayList.get(i9);
            ?? r7 = t5kVar.a.f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = ((Collection) r7).size();
            for (int i10 = 0; i10 < size3; i10++) {
                ynn ynnVar = (ynn) r7.get(i10);
                arrayList4.add(ynnVar != null ? t5kVar.a(ynnVar) : null);
            }
            z75.t(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.c).size()) {
            int size4 = ((List) this.a.c).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = 0; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = CollectionsKt.g0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void l(ogi ogiVar, mu3 mu3Var, long j, otp otpVar, aas aasVar, kpa kpaVar, int i) {
        if ((i & 2) != 0) {
            j = d85.n;
        }
        ogiVar.k(mu3Var, j, (i & 4) != 0 ? null : otpVar, (i & 8) != 0 ? null : aasVar, (i & 16) != 0 ? null : kpaVar, 3);
    }

    public final void a(long j, float[] fArr) {
        n(rds.e(j));
        o(rds.d(j));
        vqn vqnVar = new vqn();
        vqnVar.a = 0;
        cb0.z(this.h, j, new ad3(j, fArr, vqnVar, new uqn()));
    }

    public final ynn b(int i) {
        o(i);
        int length = ((mn0) this.a.b).b.length();
        ArrayList arrayList = this.h;
        t5k t5kVar = (t5k) arrayList.get(i == length ? u75.g(arrayList) : cb0.w(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        int d = t5kVar.d(i);
        CharSequence charSequence = (CharSequence) ih0Var.e;
        ads adsVar = (ads) ih0Var.d;
        if (d < 0 || d > charSequence.length()) {
            StringBuilder q = k5r.q(d, "offset(", ") is out of bounds [0,");
            q.append(charSequence.length());
            q.append(']');
            tme.a(q.toString());
        }
        float h = adsVar.h(d, false);
        int lineForOffset = adsVar.f.getLineForOffset(d);
        return t5kVar.a(new ynn(h, adsVar.g(lineForOffset), h, adsVar.e(lineForOffset)));
    }

    public final float c(int i) {
        p(i);
        ArrayList arrayList = this.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.x(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        return ((ads) ih0Var.d).e(i - t5kVar.d) + t5kVar.f;
    }

    public final int d(int i, boolean z) {
        int f;
        p(i);
        ArrayList arrayList = this.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.x(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        int i2 = i - t5kVar.d;
        ads adsVar = (ads) ih0Var.d;
        if (z) {
            Layout layout = adsVar.f;
            q9s q9sVar = eds.a;
            if (layout.getEllipsisCount(i2) <= 0 || adsVar.b != TextUtils.TruncateAt.END) {
                gs4 c = adsVar.c();
                Layout layout2 = (Layout) c.a;
                f = c.C(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            f = adsVar.f(i2);
        }
        return f + t5kVar.b;
    }

    public final int e(int i) {
        int length = ((mn0) this.a.b).b.length();
        ArrayList arrayList = this.h;
        t5k t5kVar = (t5k) arrayList.get(i >= length ? u75.g(arrayList) : i < 0 ? 0 : cb0.w(arrayList, i));
        return ((ads) t5kVar.a.d).f.getLineForOffset(t5kVar.d(i)) + t5kVar.d;
    }

    public final int f(float f) {
        ArrayList arrayList = this.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.y(arrayList, f));
        int i = t5kVar.c - t5kVar.b;
        int i2 = t5kVar.d;
        if (i == 0) {
            return i2;
        }
        ih0 ih0Var = t5kVar.a;
        float f2 = f - t5kVar.f;
        ads adsVar = (ads) ih0Var.d;
        return adsVar.f.getLineForVertical(((int) f2) - adsVar.h) + i2;
    }

    public final float g(int i) {
        p(i);
        ArrayList arrayList = this.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.x(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        int i2 = i - t5kVar.d;
        ads adsVar = (ads) ih0Var.d;
        return adsVar.f.getLineLeft(i2) + (i2 == adsVar.g + (-1) ? adsVar.j : 0.0f);
    }

    public final float h(int i) {
        p(i);
        ArrayList arrayList = this.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.x(arrayList, i));
        ih0 ih0Var = t5kVar.a;
        return ((ads) ih0Var.d).g(i - t5kVar.d) + t5kVar.f;
    }

    public final int i(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        t5k t5kVar = (t5k) arrayList.get(cb0.y(arrayList, intBitsToFloat));
        int i2 = t5kVar.c;
        int i3 = t5kVar.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        ih0 ih0Var = t5kVar.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - t5kVar.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        ads adsVar = (ads) ih0Var.d;
        int lineForVertical = adsVar.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - adsVar.h);
        return adsVar.f.getOffsetForHorizontal(lineForVertical, (adsVar.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final long j(ynn ynnVar, int i, e7o e7oVar) {
        long j;
        long j2;
        float f = ynnVar.b;
        ArrayList arrayList = this.h;
        int y = cb0.y(arrayList, f);
        float f2 = ((t5k) arrayList.get(y)).g;
        float f3 = ynnVar.d;
        if (f2 >= f3 || y == u75.g(arrayList)) {
            t5k t5kVar = (t5k) arrayList.get(y);
            return t5kVar.b(t5kVar.a.c(t5kVar.c(ynnVar), i, e7oVar), true);
        }
        int y2 = cb0.y(arrayList, f3);
        long j3 = rds.b;
        while (true) {
            j = rds.b;
            if (!rds.a(j3, j) || y > y2) {
                break;
            }
            t5k t5kVar2 = (t5k) arrayList.get(y);
            j3 = t5kVar2.b(t5kVar2.a.c(t5kVar2.c(ynnVar), i, e7oVar), true);
            y++;
        }
        if (rds.a(j3, j)) {
            return j;
        }
        while (true) {
            j2 = rds.b;
            if (!rds.a(j, j2) || y > y2) {
                break;
            }
            t5k t5kVar3 = (t5k) arrayList.get(y2);
            j = t5kVar3.b(t5kVar3.a.c(t5kVar3.c(ynnVar), i, e7oVar), true);
            y2--;
        }
        return rds.a(j, j2) ? j3 : y5g.P((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final void k(mu3 mu3Var, long j, otp otpVar, aas aasVar, kpa kpaVar, int i) {
        mu3Var.r();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            t5k t5kVar = (t5k) arrayList.get(i2);
            t5kVar.a.f(mu3Var, j, otpVar, aasVar, kpaVar, i);
            mu3Var.j(0.0f, t5kVar.a.b());
        }
        mu3Var.k();
    }

    public final void m(mu3 mu3Var, ai3 ai3Var, float f, otp otpVar, aas aasVar, kpa kpaVar) {
        mu3Var.r();
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 1) {
            gld.S(this, mu3Var, ai3Var, f, otpVar, aasVar, kpaVar);
        } else if (ai3Var instanceof f3r) {
            gld.S(this, mu3Var, ai3Var, f, otpVar, aasVar, kpaVar);
        } else if (ai3Var instanceof ltp) {
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                t5k t5kVar = (t5k) arrayList.get(i);
                f3 += t5kVar.a.b();
                f2 = Math.max(f2, t5kVar.a.d());
            }
            Shader b = ((ltp) ai3Var).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ih0 ih0Var = ((t5k) arrayList.get(i2)).a;
                ih0Var.g(mu3Var, new bi3(b), f, otpVar, aasVar, kpaVar);
                mu3Var.j(0.0f, ih0Var.b());
                matrix.setTranslate(0.0f, -ih0Var.b());
                b.setLocalMatrix(matrix);
            }
        }
        mu3Var.k();
    }

    public final void n(int i) {
        boolean z = false;
        dn9 dn9Var = this.a;
        if (i >= 0 && i < ((mn0) dn9Var.b).b.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder q = k5r.q(i, "offset(", ") is out of bounds [0, ");
        q.append(((mn0) dn9Var.b).b.length());
        q.append(')');
        tme.a(q.toString());
    }

    public final void o(int i) {
        boolean z = false;
        dn9 dn9Var = this.a;
        if (i >= 0 && i <= ((mn0) dn9Var.b).b.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder q = k5r.q(i, "offset(", ") is out of bounds [0, ");
        q.append(((mn0) dn9Var.b).b.length());
        q.append(']');
        tme.a(q.toString());
    }

    public final void p(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        tme.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    public ogi(mn0 mn0Var, ges gesVar, long j, jx7 jx7Var, ppc ppcVar, int i, boolean z) {
        this(new dn9(mn0Var, gesVar, c5b.a, jx7Var, ppcVar), j, i, z ? 2 : 1);
    }
}
