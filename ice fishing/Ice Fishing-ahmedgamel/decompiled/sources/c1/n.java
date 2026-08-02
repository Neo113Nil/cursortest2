package c1;

import android.graphics.Path;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.Wv;
import e1.C4472a;
import java.util.ArrayList;
import java.util.List;
import l1.AbstractC4668c;
import l1.AbstractC4672g;
import m1.C4739a;

/* loaded from: classes.dex */
public final class n extends AbstractC0545e {
    public final g1.k i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f5672j;

    /* renamed from: k, reason: collision with root package name */
    public Path f5673k;

    /* renamed from: l, reason: collision with root package name */
    public Path f5674l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f5675m;

    public n(List list) {
        super(list);
        this.i = new g1.k();
        this.f5672j = new Path();
    }

    @Override // c1.AbstractC0545e
    public final Object f(C4739a c4739a, float f2) {
        g1.k kVar;
        int i;
        int i4;
        ArrayList arrayList;
        PointF pointF;
        g1.k kVar2;
        g1.k kVar3;
        int i6;
        g1.k kVar4 = (g1.k) c4739a.f39341b;
        g1.k kVar5 = (g1.k) c4739a.f39342c;
        g1.k kVar6 = kVar5 == null ? kVar4 : kVar5;
        g1.k kVar7 = this.i;
        if (kVar7.f37631b == null) {
            kVar7.f37631b = new PointF();
        }
        boolean z6 = true;
        kVar7.f37632c = kVar4.f37632c || kVar6.f37632c;
        ArrayList arrayList2 = kVar4.f37630a;
        int size = arrayList2.size();
        int size2 = kVar6.f37630a.size();
        ArrayList arrayList3 = kVar6.f37630a;
        if (size != size2) {
            AbstractC4668c.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int min = Math.min(arrayList2.size(), arrayList3.size());
        ArrayList arrayList4 = kVar7.f37630a;
        if (arrayList4.size() < min) {
            for (int size3 = arrayList4.size(); size3 < min; size3++) {
                arrayList4.add(new C4472a());
            }
        } else if (arrayList4.size() > min) {
            for (int size4 = arrayList4.size() - 1; size4 >= min; size4--) {
                arrayList4.remove(arrayList4.size() - 1);
            }
        }
        PointF pointF2 = kVar4.f37631b;
        PointF pointF3 = kVar6.f37631b;
        kVar7.a(AbstractC4672g.f(pointF2.x, pointF3.x, f2), AbstractC4672g.f(pointF2.y, pointF3.y, f2));
        int size5 = arrayList4.size() - 1;
        while (size5 >= 0) {
            C4472a c4472a = (C4472a) arrayList2.get(size5);
            C4472a c4472a2 = (C4472a) arrayList3.get(size5);
            PointF pointF4 = c4472a.f37212a;
            PointF pointF5 = c4472a2.f37212a;
            boolean z9 = z6;
            g1.k kVar8 = kVar7;
            ((C4472a) arrayList4.get(size5)).f37212a.set(AbstractC4672g.f(pointF4.x, pointF5.x, f2), AbstractC4672g.f(pointF4.y, pointF5.y, f2));
            C4472a c4472a3 = (C4472a) arrayList4.get(size5);
            PointF pointF6 = c4472a.f37213b;
            float f9 = pointF6.x;
            PointF pointF7 = c4472a2.f37213b;
            c4472a3.f37213b.set(AbstractC4672g.f(f9, pointF7.x, f2), AbstractC4672g.f(pointF6.y, pointF7.y, f2));
            C4472a c4472a4 = (C4472a) arrayList4.get(size5);
            PointF pointF8 = c4472a.f37214c;
            float f10 = pointF8.x;
            PointF pointF9 = c4472a2.f37214c;
            c4472a4.f37214c.set(AbstractC4672g.f(f10, pointF9.x, f2), AbstractC4672g.f(pointF8.y, pointF9.y, f2));
            size5--;
            z6 = z9;
            kVar7 = kVar8;
        }
        g1.k kVar9 = kVar7;
        boolean z10 = z6;
        ArrayList arrayList5 = this.f5675m;
        if (arrayList5 != null) {
            int size6 = arrayList5.size() - 1;
            kVar = kVar9;
            while (size6 >= 0) {
                b1.q qVar = (b1.q) this.f5675m.get(size6);
                qVar.getClass();
                ArrayList arrayList6 = kVar.f37630a;
                if (arrayList6.size() > 2) {
                    float floatValue = ((Float) qVar.f5491b.e()).floatValue();
                    if (floatValue != 0.0f) {
                        boolean z11 = kVar.f37632c;
                        int size7 = arrayList6.size() - 1;
                        int i9 = 0;
                        while (size7 >= 0) {
                            C4472a c4472a5 = (C4472a) arrayList6.get(size7);
                            C4472a c4472a6 = (C4472a) arrayList6.get(b1.q.c(size7 - 1, arrayList6.size()));
                            PointF pointF10 = (size7 != 0 || z11) ? c4472a6.f37214c : kVar.f37631b;
                            int i10 = size6;
                            i9 = (((size7 != 0 || z11) ? c4472a6.f37213b : pointF10).equals(pointF10) && c4472a5.f37212a.equals(pointF10) && !((kVar.f37632c || (size7 != 0 && size7 != arrayList6.size() + (-1))) ? false : z10)) ? i9 + 2 : i9 + 1;
                            size7--;
                            size6 = i10;
                        }
                        i = size6;
                        g1.k kVar10 = qVar.f5492c;
                        if (kVar10 == null || kVar10.f37630a.size() != i9) {
                            ArrayList arrayList7 = new ArrayList(i9);
                            for (int i11 = 0; i11 < i9; i11++) {
                                arrayList7.add(new C4472a());
                            }
                            i4 = 0;
                            qVar.f5492c = new g1.k(new PointF(0.0f, 0.0f), false, arrayList7);
                        } else {
                            i4 = 0;
                        }
                        g1.k kVar11 = qVar.f5492c;
                        kVar11.f37632c = z11;
                        PointF pointF11 = kVar.f37631b;
                        kVar11.a(pointF11.x, pointF11.y);
                        ArrayList arrayList8 = kVar11.f37630a;
                        boolean z12 = kVar.f37632c;
                        int i12 = i4;
                        int i13 = i12;
                        while (i12 < arrayList6.size()) {
                            C4472a c4472a7 = (C4472a) arrayList6.get(i12);
                            C4472a c4472a8 = (C4472a) arrayList6.get(b1.q.c(i12 - 1, arrayList6.size()));
                            C4472a c4472a9 = (C4472a) arrayList6.get(b1.q.c(i12 - 2, arrayList6.size()));
                            PointF pointF12 = (i12 != 0 || z12) ? c4472a8.f37214c : kVar.f37631b;
                            if (i12 != 0 || z12) {
                                arrayList = arrayList6;
                                pointF = c4472a8.f37213b;
                            } else {
                                arrayList = arrayList6;
                                pointF = pointF12;
                            }
                            float f11 = floatValue;
                            PointF pointF13 = c4472a7.f37212a;
                            PointF pointF14 = c4472a9.f37214c;
                            boolean z13 = z12;
                            boolean z14 = (kVar.f37632c || !(i12 == 0 || i12 == arrayList.size() + (-1))) ? false : z10;
                            if (pointF.equals(pointF12) && pointF13.equals(pointF12) && !z14) {
                                float f12 = pointF12.x;
                                float f13 = f12 - pointF14.x;
                                float f14 = pointF12.y;
                                float f15 = f14 - pointF14.y;
                                PointF pointF15 = c4472a7.f37214c;
                                kVar3 = kVar;
                                float f16 = pointF15.x - f12;
                                float f17 = pointF15.y - f14;
                                kVar2 = kVar4;
                                float hypot = (float) Math.hypot(f13, f15);
                                float hypot2 = (float) Math.hypot(f16, f17);
                                float min2 = Math.min(f11 / hypot, 0.5f);
                                float min3 = Math.min(f11 / hypot2, 0.5f);
                                float f18 = pointF12.x;
                                float a9 = Wv.a(pointF14.x, f18, min2, f18);
                                float f19 = pointF12.y;
                                float a10 = Wv.a(pointF14.y, f19, min2, f19);
                                float a11 = Wv.a(pointF15.x, f18, min3, f18);
                                float a12 = Wv.a(pointF15.y, f19, min3, f19);
                                float f20 = a9 - ((a9 - f18) * 0.5519f);
                                float f21 = a10 - ((a10 - f19) * 0.5519f);
                                float f22 = a11 - ((a11 - f18) * 0.5519f);
                                float f23 = a12 - ((a12 - f19) * 0.5519f);
                                C4472a c4472a10 = (C4472a) arrayList8.get(b1.q.c(i13 - 1, arrayList8.size()));
                                C4472a c4472a11 = (C4472a) arrayList8.get(i13);
                                i6 = i12;
                                c4472a10.f37213b.set(a9, a10);
                                c4472a10.f37214c.set(a9, a10);
                                if (i6 == 0) {
                                    kVar11.a(a9, a10);
                                }
                                c4472a11.f37212a.set(f20, f21);
                                C4472a c4472a12 = (C4472a) arrayList8.get(i13 + 1);
                                c4472a11.f37213b.set(f22, f23);
                                c4472a11.f37214c.set(a11, a12);
                                c4472a12.f37212a.set(a11, a12);
                                i13 += 2;
                            } else {
                                kVar2 = kVar4;
                                kVar3 = kVar;
                                i6 = i12;
                                C4472a c4472a13 = (C4472a) arrayList8.get(b1.q.c(i13 - 1, arrayList8.size()));
                                C4472a c4472a14 = (C4472a) arrayList8.get(i13);
                                PointF pointF16 = c4472a8.f37213b;
                                c4472a13.f37213b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = c4472a8.f37214c;
                                c4472a13.f37214c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = c4472a7.f37212a;
                                c4472a14.f37212a.set(pointF18.x, pointF18.y);
                                i13++;
                            }
                            i12 = i6 + 1;
                            arrayList6 = arrayList;
                            floatValue = f11;
                            z12 = z13;
                            kVar = kVar3;
                            kVar4 = kVar2;
                        }
                        kVar = kVar11;
                        size6 = i - 1;
                        kVar4 = kVar4;
                    }
                }
                i = size6;
                size6 = i - 1;
                kVar4 = kVar4;
            }
        } else {
            kVar = kVar9;
        }
        g1.k kVar12 = kVar4;
        Path path = this.f5672j;
        AbstractC4672g.e(kVar, path);
        if (this.f5652e == null) {
            return path;
        }
        if (this.f5673k == null) {
            this.f5673k = new Path();
            this.f5674l = new Path();
        }
        AbstractC4672g.e(kVar12, this.f5673k);
        if (kVar5 != null) {
            AbstractC4672g.e(kVar5, this.f5674l);
        }
        LP lp = this.f5652e;
        float floatValue2 = c4739a.f39347h.floatValue();
        Path path2 = this.f5673k;
        return (Path) lp.d(c4739a.f39346g, floatValue2, path2, kVar5 == null ? path2 : this.f5674l, f2, d(), this.f5651d);
    }

    @Override // c1.AbstractC0545e
    public final boolean k() {
        ArrayList arrayList = this.f5675m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
