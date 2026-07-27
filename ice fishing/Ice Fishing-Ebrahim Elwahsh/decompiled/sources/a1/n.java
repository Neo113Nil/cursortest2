package a1;

import android.graphics.Path;
import android.graphics.PointF;
import c1.C0537a;
import com.google.android.gms.internal.ads.CL;
import j1.AbstractC4591d;
import java.util.ArrayList;
import java.util.List;
import k1.C4628a;

/* loaded from: classes.dex */
public final class n extends AbstractC0421e {
    public final e1.k i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f4326j;

    /* renamed from: k, reason: collision with root package name */
    public Path f4327k;

    /* renamed from: l, reason: collision with root package name */
    public Path f4328l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4329m;

    public n(List list) {
        super(list);
        this.i = new e1.k();
        this.f4326j = new Path();
    }

    @Override // a1.AbstractC0421e
    public final Object f(C4628a c4628a, float f6) {
        e1.k kVar;
        int i;
        int i4;
        ArrayList arrayList;
        PointF pointF;
        e1.k kVar2;
        e1.k kVar3;
        int i9;
        e1.k kVar4 = (e1.k) c4628a.f38672b;
        e1.k kVar5 = (e1.k) c4628a.f38673c;
        e1.k kVar6 = kVar5 == null ? kVar4 : kVar5;
        e1.k kVar7 = this.i;
        if (kVar7.f37286b == null) {
            kVar7.f37286b = new PointF();
        }
        boolean z8 = true;
        kVar7.f37287c = kVar4.f37287c || kVar6.f37287c;
        ArrayList arrayList2 = kVar4.f37285a;
        int size = arrayList2.size();
        int size2 = kVar6.f37285a.size();
        ArrayList arrayList3 = kVar6.f37285a;
        if (size != size2) {
            AbstractC4591d.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int min = Math.min(arrayList2.size(), arrayList3.size());
        ArrayList arrayList4 = kVar7.f37285a;
        if (arrayList4.size() < min) {
            for (int size3 = arrayList4.size(); size3 < min; size3++) {
                arrayList4.add(new C0537a());
            }
        } else if (arrayList4.size() > min) {
            for (int size4 = arrayList4.size() - 1; size4 >= min; size4--) {
                arrayList4.remove(arrayList4.size() - 1);
            }
        }
        PointF pointF2 = kVar4.f37286b;
        PointF pointF3 = kVar6.f37286b;
        kVar7.a(j1.h.f(pointF2.x, pointF3.x, f6), j1.h.f(pointF2.y, pointF3.y, f6));
        int size5 = arrayList4.size() - 1;
        while (size5 >= 0) {
            C0537a c0537a = (C0537a) arrayList2.get(size5);
            C0537a c0537a2 = (C0537a) arrayList3.get(size5);
            PointF pointF4 = c0537a.f5654a;
            PointF pointF5 = c0537a2.f5654a;
            boolean z9 = z8;
            e1.k kVar8 = kVar7;
            ((C0537a) arrayList4.get(size5)).f5654a.set(j1.h.f(pointF4.x, pointF5.x, f6), j1.h.f(pointF4.y, pointF5.y, f6));
            C0537a c0537a3 = (C0537a) arrayList4.get(size5);
            PointF pointF6 = c0537a.f5655b;
            float f9 = pointF6.x;
            PointF pointF7 = c0537a2.f5655b;
            c0537a3.f5655b.set(j1.h.f(f9, pointF7.x, f6), j1.h.f(pointF6.y, pointF7.y, f6));
            C0537a c0537a4 = (C0537a) arrayList4.get(size5);
            PointF pointF8 = c0537a.f5656c;
            float f10 = pointF8.x;
            PointF pointF9 = c0537a2.f5656c;
            c0537a4.f5656c.set(j1.h.f(f10, pointF9.x, f6), j1.h.f(pointF8.y, pointF9.y, f6));
            size5--;
            z8 = z9;
            kVar7 = kVar8;
        }
        e1.k kVar9 = kVar7;
        boolean z10 = z8;
        ArrayList arrayList5 = this.f4329m;
        if (arrayList5 != null) {
            int size6 = arrayList5.size() - 1;
            kVar = kVar9;
            while (size6 >= 0) {
                Z0.q qVar = (Z0.q) this.f4329m.get(size6);
                qVar.getClass();
                ArrayList arrayList6 = kVar.f37285a;
                if (arrayList6.size() > 2) {
                    float floatValue = ((Float) qVar.f4179b.e()).floatValue();
                    if (floatValue != 0.0f) {
                        boolean z11 = kVar.f37287c;
                        int size7 = arrayList6.size() - 1;
                        int i10 = 0;
                        while (size7 >= 0) {
                            C0537a c0537a5 = (C0537a) arrayList6.get(size7);
                            C0537a c0537a6 = (C0537a) arrayList6.get(Z0.q.c(size7 - 1, arrayList6.size()));
                            PointF pointF10 = (size7 != 0 || z11) ? c0537a6.f5656c : kVar.f37286b;
                            int i11 = size6;
                            i10 = (((size7 != 0 || z11) ? c0537a6.f5655b : pointF10).equals(pointF10) && c0537a5.f5654a.equals(pointF10) && !((kVar.f37287c || (size7 != 0 && size7 != arrayList6.size() + (-1))) ? false : z10)) ? i10 + 2 : i10 + 1;
                            size7--;
                            size6 = i11;
                        }
                        i = size6;
                        e1.k kVar10 = qVar.f4180c;
                        if (kVar10 == null || kVar10.f37285a.size() != i10) {
                            ArrayList arrayList7 = new ArrayList(i10);
                            for (int i12 = 0; i12 < i10; i12++) {
                                arrayList7.add(new C0537a());
                            }
                            i4 = 0;
                            qVar.f4180c = new e1.k(new PointF(0.0f, 0.0f), false, arrayList7);
                        } else {
                            i4 = 0;
                        }
                        e1.k kVar11 = qVar.f4180c;
                        kVar11.f37287c = z11;
                        PointF pointF11 = kVar.f37286b;
                        kVar11.a(pointF11.x, pointF11.y);
                        ArrayList arrayList8 = kVar11.f37285a;
                        boolean z12 = kVar.f37287c;
                        int i13 = i4;
                        int i14 = i13;
                        while (i13 < arrayList6.size()) {
                            C0537a c0537a7 = (C0537a) arrayList6.get(i13);
                            C0537a c0537a8 = (C0537a) arrayList6.get(Z0.q.c(i13 - 1, arrayList6.size()));
                            C0537a c0537a9 = (C0537a) arrayList6.get(Z0.q.c(i13 - 2, arrayList6.size()));
                            PointF pointF12 = (i13 != 0 || z12) ? c0537a8.f5656c : kVar.f37286b;
                            if (i13 != 0 || z12) {
                                arrayList = arrayList6;
                                pointF = c0537a8.f5655b;
                            } else {
                                arrayList = arrayList6;
                                pointF = pointF12;
                            }
                            float f11 = floatValue;
                            PointF pointF13 = c0537a7.f5654a;
                            PointF pointF14 = c0537a9.f5656c;
                            boolean z13 = z12;
                            boolean z14 = (kVar.f37287c || !(i13 == 0 || i13 == arrayList.size() + (-1))) ? false : z10;
                            if (pointF.equals(pointF12) && pointF13.equals(pointF12) && !z14) {
                                float f12 = pointF12.x;
                                float f13 = f12 - pointF14.x;
                                float f14 = pointF12.y;
                                float f15 = f14 - pointF14.y;
                                PointF pointF15 = c0537a7.f5656c;
                                kVar3 = kVar;
                                float f16 = pointF15.x - f12;
                                float f17 = pointF15.y - f14;
                                kVar2 = kVar4;
                                float hypot = (float) Math.hypot(f13, f15);
                                float hypot2 = (float) Math.hypot(f16, f17);
                                float min2 = Math.min(f11 / hypot, 0.5f);
                                float min3 = Math.min(f11 / hypot2, 0.5f);
                                float f18 = pointF12.x;
                                float a9 = CL.a(pointF14.x, f18, min2, f18);
                                float f19 = pointF12.y;
                                float a10 = CL.a(pointF14.y, f19, min2, f19);
                                float a11 = CL.a(pointF15.x, f18, min3, f18);
                                float a12 = CL.a(pointF15.y, f19, min3, f19);
                                float f20 = a9 - ((a9 - f18) * 0.5519f);
                                float f21 = a10 - ((a10 - f19) * 0.5519f);
                                float f22 = a11 - ((a11 - f18) * 0.5519f);
                                float f23 = a12 - ((a12 - f19) * 0.5519f);
                                C0537a c0537a10 = (C0537a) arrayList8.get(Z0.q.c(i14 - 1, arrayList8.size()));
                                C0537a c0537a11 = (C0537a) arrayList8.get(i14);
                                i9 = i13;
                                c0537a10.f5655b.set(a9, a10);
                                c0537a10.f5656c.set(a9, a10);
                                if (i9 == 0) {
                                    kVar11.a(a9, a10);
                                }
                                c0537a11.f5654a.set(f20, f21);
                                C0537a c0537a12 = (C0537a) arrayList8.get(i14 + 1);
                                c0537a11.f5655b.set(f22, f23);
                                c0537a11.f5656c.set(a11, a12);
                                c0537a12.f5654a.set(a11, a12);
                                i14 += 2;
                            } else {
                                kVar2 = kVar4;
                                kVar3 = kVar;
                                i9 = i13;
                                C0537a c0537a13 = (C0537a) arrayList8.get(Z0.q.c(i14 - 1, arrayList8.size()));
                                C0537a c0537a14 = (C0537a) arrayList8.get(i14);
                                PointF pointF16 = c0537a8.f5655b;
                                c0537a13.f5655b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = c0537a8.f5656c;
                                c0537a13.f5656c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = c0537a7.f5654a;
                                c0537a14.f5654a.set(pointF18.x, pointF18.y);
                                i14++;
                            }
                            i13 = i9 + 1;
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
        e1.k kVar12 = kVar4;
        Path path = this.f4326j;
        j1.h.e(kVar, path);
        if (this.f4306e == null) {
            return path;
        }
        if (this.f4327k == null) {
            this.f4327k = new Path();
            this.f4328l = new Path();
        }
        j1.h.e(kVar12, this.f4327k);
        if (kVar5 != null) {
            j1.h.e(kVar5, this.f4328l);
        }
        S0.s sVar = this.f4306e;
        float floatValue2 = c4628a.f38678h.floatValue();
        Path path2 = this.f4327k;
        return (Path) sVar.h(c4628a.f38677g, floatValue2, path2, kVar5 == null ? path2 : this.f4328l, f6, d(), this.f4305d);
    }

    @Override // a1.AbstractC0421e
    public final boolean k() {
        ArrayList arrayList = this.f4329m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
