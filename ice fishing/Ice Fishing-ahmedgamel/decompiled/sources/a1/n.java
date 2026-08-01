package a1;

import android.graphics.Path;
import android.graphics.PointF;
import c1.C0533a;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import j1.AbstractC4599c;
import j1.AbstractC4603g;
import java.util.ArrayList;
import java.util.List;
import k1.C4629a;

/* loaded from: classes.dex */
public final class n extends AbstractC0428e {
    public final e1.k i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f4277j;

    /* renamed from: k, reason: collision with root package name */
    public Path f4278k;

    /* renamed from: l, reason: collision with root package name */
    public Path f4279l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4280m;

    public n(List list) {
        super(list);
        this.i = new e1.k();
        this.f4277j = new Path();
    }

    @Override // a1.AbstractC0428e
    public final Object f(C4629a c4629a, float f3) {
        e1.k kVar;
        int i;
        int i6;
        ArrayList arrayList;
        PointF pointF;
        e1.k kVar2;
        e1.k kVar3;
        int i9;
        e1.k kVar4 = (e1.k) c4629a.f38552b;
        e1.k kVar5 = (e1.k) c4629a.f38553c;
        e1.k kVar6 = kVar5 == null ? kVar4 : kVar5;
        e1.k kVar7 = this.i;
        if (kVar7.f37155b == null) {
            kVar7.f37155b = new PointF();
        }
        boolean z3 = true;
        kVar7.f37156c = kVar4.f37156c || kVar6.f37156c;
        ArrayList arrayList2 = kVar4.f37154a;
        int size = arrayList2.size();
        int size2 = kVar6.f37154a.size();
        ArrayList arrayList3 = kVar6.f37154a;
        if (size != size2) {
            AbstractC4599c.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int min = Math.min(arrayList2.size(), arrayList3.size());
        ArrayList arrayList4 = kVar7.f37154a;
        if (arrayList4.size() < min) {
            for (int size3 = arrayList4.size(); size3 < min; size3++) {
                arrayList4.add(new C0533a());
            }
        } else if (arrayList4.size() > min) {
            for (int size4 = arrayList4.size() - 1; size4 >= min; size4--) {
                arrayList4.remove(arrayList4.size() - 1);
            }
        }
        PointF pointF2 = kVar4.f37155b;
        PointF pointF3 = kVar6.f37155b;
        kVar7.a(AbstractC4603g.f(pointF2.x, pointF3.x, f3), AbstractC4603g.f(pointF2.y, pointF3.y, f3));
        int size5 = arrayList4.size() - 1;
        while (size5 >= 0) {
            C0533a c0533a = (C0533a) arrayList2.get(size5);
            C0533a c0533a2 = (C0533a) arrayList3.get(size5);
            PointF pointF4 = c0533a.f5494a;
            PointF pointF5 = c0533a2.f5494a;
            boolean z6 = z3;
            e1.k kVar8 = kVar7;
            ((C0533a) arrayList4.get(size5)).f5494a.set(AbstractC4603g.f(pointF4.x, pointF5.x, f3), AbstractC4603g.f(pointF4.y, pointF5.y, f3));
            C0533a c0533a3 = (C0533a) arrayList4.get(size5);
            PointF pointF6 = c0533a.f5495b;
            float f9 = pointF6.x;
            PointF pointF7 = c0533a2.f5495b;
            c0533a3.f5495b.set(AbstractC4603g.f(f9, pointF7.x, f3), AbstractC4603g.f(pointF6.y, pointF7.y, f3));
            C0533a c0533a4 = (C0533a) arrayList4.get(size5);
            PointF pointF8 = c0533a.f5496c;
            float f10 = pointF8.x;
            PointF pointF9 = c0533a2.f5496c;
            c0533a4.f5496c.set(AbstractC4603g.f(f10, pointF9.x, f3), AbstractC4603g.f(pointF8.y, pointF9.y, f3));
            size5--;
            z3 = z6;
            kVar7 = kVar8;
        }
        e1.k kVar9 = kVar7;
        boolean z9 = z3;
        ArrayList arrayList5 = this.f4280m;
        if (arrayList5 != null) {
            int size6 = arrayList5.size() - 1;
            kVar = kVar9;
            while (size6 >= 0) {
                Z0.q qVar = (Z0.q) this.f4280m.get(size6);
                qVar.getClass();
                ArrayList arrayList6 = kVar.f37154a;
                if (arrayList6.size() > 2) {
                    float floatValue = ((Float) qVar.f4102b.e()).floatValue();
                    if (floatValue != 0.0f) {
                        boolean z10 = kVar.f37156c;
                        int size7 = arrayList6.size() - 1;
                        int i10 = 0;
                        while (size7 >= 0) {
                            C0533a c0533a5 = (C0533a) arrayList6.get(size7);
                            C0533a c0533a6 = (C0533a) arrayList6.get(Z0.q.d(size7 - 1, arrayList6.size()));
                            PointF pointF10 = (size7 != 0 || z10) ? c0533a6.f5496c : kVar.f37155b;
                            int i11 = size6;
                            i10 = (((size7 != 0 || z10) ? c0533a6.f5495b : pointF10).equals(pointF10) && c0533a5.f5494a.equals(pointF10) && !((kVar.f37156c || (size7 != 0 && size7 != arrayList6.size() + (-1))) ? false : z9)) ? i10 + 2 : i10 + 1;
                            size7--;
                            size6 = i11;
                        }
                        i = size6;
                        e1.k kVar10 = qVar.f4103c;
                        if (kVar10 == null || kVar10.f37154a.size() != i10) {
                            ArrayList arrayList7 = new ArrayList(i10);
                            for (int i12 = 0; i12 < i10; i12++) {
                                arrayList7.add(new C0533a());
                            }
                            i6 = 0;
                            qVar.f4103c = new e1.k(new PointF(0.0f, 0.0f), false, arrayList7);
                        } else {
                            i6 = 0;
                        }
                        e1.k kVar11 = qVar.f4103c;
                        kVar11.f37156c = z10;
                        PointF pointF11 = kVar.f37155b;
                        kVar11.a(pointF11.x, pointF11.y);
                        ArrayList arrayList8 = kVar11.f37154a;
                        boolean z11 = kVar.f37156c;
                        int i13 = i6;
                        int i14 = i13;
                        while (i13 < arrayList6.size()) {
                            C0533a c0533a7 = (C0533a) arrayList6.get(i13);
                            C0533a c0533a8 = (C0533a) arrayList6.get(Z0.q.d(i13 - 1, arrayList6.size()));
                            C0533a c0533a9 = (C0533a) arrayList6.get(Z0.q.d(i13 - 2, arrayList6.size()));
                            PointF pointF12 = (i13 != 0 || z11) ? c0533a8.f5496c : kVar.f37155b;
                            if (i13 != 0 || z11) {
                                arrayList = arrayList6;
                                pointF = c0533a8.f5495b;
                            } else {
                                arrayList = arrayList6;
                                pointF = pointF12;
                            }
                            float f11 = floatValue;
                            PointF pointF13 = c0533a7.f5494a;
                            PointF pointF14 = c0533a9.f5496c;
                            boolean z12 = z11;
                            boolean z13 = (kVar.f37156c || !(i13 == 0 || i13 == arrayList.size() + (-1))) ? false : z9;
                            if (pointF.equals(pointF12) && pointF13.equals(pointF12) && !z13) {
                                float f12 = pointF12.x;
                                float f13 = f12 - pointF14.x;
                                float f14 = pointF12.y;
                                float f15 = f14 - pointF14.y;
                                PointF pointF15 = c0533a7.f5496c;
                                kVar3 = kVar;
                                float f16 = pointF15.x - f12;
                                float f17 = pointF15.y - f14;
                                kVar2 = kVar4;
                                float hypot = (float) Math.hypot(f13, f15);
                                float hypot2 = (float) Math.hypot(f16, f17);
                                float min2 = Math.min(f11 / hypot, 0.5f);
                                float min3 = Math.min(f11 / hypot2, 0.5f);
                                float f18 = pointF12.x;
                                float a9 = AbstractC4404f.a(pointF14.x, f18, min2, f18);
                                float f19 = pointF12.y;
                                float a10 = AbstractC4404f.a(pointF14.y, f19, min2, f19);
                                float a11 = AbstractC4404f.a(pointF15.x, f18, min3, f18);
                                float a12 = AbstractC4404f.a(pointF15.y, f19, min3, f19);
                                float f20 = a9 - ((a9 - f18) * 0.5519f);
                                float f21 = a10 - ((a10 - f19) * 0.5519f);
                                float f22 = a11 - ((a11 - f18) * 0.5519f);
                                float f23 = a12 - ((a12 - f19) * 0.5519f);
                                C0533a c0533a10 = (C0533a) arrayList8.get(Z0.q.d(i14 - 1, arrayList8.size()));
                                C0533a c0533a11 = (C0533a) arrayList8.get(i14);
                                i9 = i13;
                                c0533a10.f5495b.set(a9, a10);
                                c0533a10.f5496c.set(a9, a10);
                                if (i9 == 0) {
                                    kVar11.a(a9, a10);
                                }
                                c0533a11.f5494a.set(f20, f21);
                                C0533a c0533a12 = (C0533a) arrayList8.get(i14 + 1);
                                c0533a11.f5495b.set(f22, f23);
                                c0533a11.f5496c.set(a11, a12);
                                c0533a12.f5494a.set(a11, a12);
                                i14 += 2;
                            } else {
                                kVar2 = kVar4;
                                kVar3 = kVar;
                                i9 = i13;
                                C0533a c0533a13 = (C0533a) arrayList8.get(Z0.q.d(i14 - 1, arrayList8.size()));
                                C0533a c0533a14 = (C0533a) arrayList8.get(i14);
                                PointF pointF16 = c0533a8.f5495b;
                                c0533a13.f5495b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = c0533a8.f5496c;
                                c0533a13.f5496c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = c0533a7.f5494a;
                                c0533a14.f5494a.set(pointF18.x, pointF18.y);
                                i14++;
                            }
                            i13 = i9 + 1;
                            arrayList6 = arrayList;
                            floatValue = f11;
                            z11 = z12;
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
        Path path = this.f4277j;
        AbstractC4603g.e(kVar, path);
        if (this.f4257e == null) {
            return path;
        }
        if (this.f4278k == null) {
            this.f4278k = new Path();
            this.f4279l = new Path();
        }
        AbstractC4603g.e(kVar12, this.f4278k);
        if (kVar5 != null) {
            AbstractC4603g.e(kVar5, this.f4279l);
        }
        C2991bm c2991bm = this.f4257e;
        float floatValue2 = c4629a.f38558h.floatValue();
        Path path2 = this.f4278k;
        return (Path) c2991bm.R(c4629a.f38557g, floatValue2, path2, kVar5 == null ? path2 : this.f4279l, f3, d(), this.f4256d);
    }

    @Override // a1.AbstractC0428e
    public final boolean k() {
        ArrayList arrayList = this.f4280m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
