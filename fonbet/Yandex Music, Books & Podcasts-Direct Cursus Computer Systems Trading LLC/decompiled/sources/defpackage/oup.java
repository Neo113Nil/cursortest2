package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class oup extends cs2 {
    public final hup i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public oup(List list) {
        super(list);
        this.i = new hup();
        this.j = new Path();
    }

    @Override // defpackage.cs2
    public final Object f(acf acfVar, float f) {
        hup hupVar;
        hup hupVar2;
        int i;
        int i2;
        ArrayList arrayList;
        PointF pointF;
        hup hupVar3;
        hup hupVar4;
        hup hupVar5;
        hup hupVar6;
        hup hupVar7 = (hup) acfVar.b;
        hup hupVar8 = (hup) acfVar.c;
        hup hupVar9 = hupVar8 == null ? hupVar7 : hupVar8;
        hup hupVar10 = this.i;
        ArrayList arrayList2 = hupVar10.a;
        if (hupVar10.b == null) {
            hupVar10.b = new PointF();
        }
        boolean z = hupVar7.c;
        ArrayList arrayList3 = hupVar7.a;
        boolean z2 = true;
        hupVar10.c = z || hupVar9.c;
        int size = arrayList3.size();
        ArrayList arrayList4 = hupVar9.a;
        if (size != arrayList4.size()) {
            psg.b("Curves must have the same number of control points. Shape 1: " + arrayList3.size() + "\tShape 2: " + arrayList4.size());
        }
        int min = Math.min(arrayList3.size(), arrayList4.size());
        if (arrayList2.size() < min) {
            for (int size2 = arrayList2.size(); size2 < min; size2++) {
                arrayList2.add(new pv6());
            }
        } else if (arrayList2.size() > min) {
            for (int size3 = arrayList2.size() - 1; size3 >= min; size3--) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        PointF pointF2 = hupVar7.b;
        PointF pointF3 = hupVar9.b;
        hupVar10.a(y5i.f(pointF2.x, pointF3.x, f), y5i.f(pointF2.y, pointF3.y, f));
        int size4 = arrayList2.size() - 1;
        while (size4 >= 0) {
            pv6 pv6Var = (pv6) arrayList3.get(size4);
            pv6 pv6Var2 = (pv6) arrayList4.get(size4);
            PointF pointF4 = pv6Var.a;
            PointF pointF5 = pv6Var.b;
            PointF pointF6 = pv6Var.c;
            boolean z3 = z2;
            PointF pointF7 = pv6Var2.a;
            PointF pointF8 = pv6Var2.b;
            PointF pointF9 = pv6Var2.c;
            ((pv6) arrayList2.get(size4)).a.set(y5i.f(pointF4.x, pointF7.x, f), y5i.f(pointF4.y, pointF7.y, f));
            ((pv6) arrayList2.get(size4)).b.set(y5i.f(pointF5.x, pointF8.x, f), y5i.f(pointF5.y, pointF8.y, f));
            ((pv6) arrayList2.get(size4)).c.set(y5i.f(pointF6.x, pointF9.x, f), y5i.f(pointF6.y, pointF9.y, f));
            size4--;
            z2 = z3;
            arrayList3 = arrayList3;
            hupVar10 = hupVar10;
            arrayList4 = arrayList4;
        }
        hup hupVar11 = hupVar10;
        boolean z4 = z2;
        ArrayList arrayList5 = this.m;
        if (arrayList5 != null) {
            int size5 = arrayList5.size() - 1;
            hupVar = hupVar11;
            while (true) {
                ArrayList arrayList6 = hupVar.a;
                if (size5 < 0) {
                    break;
                }
                xgo xgoVar = (xgo) this.m.get(size5);
                xgoVar.getClass();
                if (arrayList6.size() > 2) {
                    float floatValue = ((Float) xgoVar.b.e()).floatValue();
                    if (floatValue != 0.0f) {
                        boolean z5 = hupVar.c;
                        int size6 = arrayList6.size() - 1;
                        int i3 = 0;
                        while (size6 >= 0) {
                            pv6 pv6Var3 = (pv6) arrayList6.get(size6);
                            pv6 pv6Var4 = (pv6) arrayList6.get(xgo.c(size6 - 1, arrayList6.size()));
                            PointF pointF10 = (size6 != 0 || z5) ? pv6Var4.c : hupVar.b;
                            int i4 = size5;
                            i3 = (((size6 != 0 || z5) ? pv6Var4.b : pointF10).equals(pointF10) && pv6Var3.a.equals(pointF10) && !((hupVar.c || (size6 != 0 && size6 != arrayList6.size() + (-1))) ? false : z4)) ? i3 + 2 : i3 + 1;
                            size6--;
                            size5 = i4;
                        }
                        i = size5;
                        hup hupVar12 = xgoVar.c;
                        if (hupVar12 == null || hupVar12.a.size() != i3) {
                            ArrayList arrayList7 = new ArrayList(i3);
                            for (int i5 = 0; i5 < i3; i5++) {
                                arrayList7.add(new pv6());
                            }
                            i2 = 0;
                            xgoVar.c = new hup(new PointF(0.0f, 0.0f), false, arrayList7);
                        } else {
                            i2 = 0;
                        }
                        hup hupVar13 = xgoVar.c;
                        hupVar13.c = z5;
                        PointF pointF11 = hupVar.b;
                        hupVar13.a(pointF11.x, pointF11.y);
                        ArrayList arrayList8 = hupVar13.a;
                        boolean z6 = hupVar.c;
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < arrayList6.size()) {
                            pv6 pv6Var5 = (pv6) arrayList6.get(i6);
                            pv6 pv6Var6 = (pv6) arrayList6.get(xgo.c(i6 - 1, arrayList6.size()));
                            pv6 pv6Var7 = (pv6) arrayList6.get(xgo.c(i6 - 2, arrayList6.size()));
                            PointF pointF12 = (i6 != 0 || z6) ? pv6Var6.c : hupVar.b;
                            if (i6 != 0 || z6) {
                                arrayList = arrayList6;
                                pointF = pv6Var6.b;
                            } else {
                                arrayList = arrayList6;
                                pointF = pointF12;
                            }
                            float f2 = floatValue;
                            PointF pointF13 = pv6Var5.a;
                            PointF pointF14 = pv6Var7.c;
                            boolean z7 = z6;
                            PointF pointF15 = pv6Var5.c;
                            boolean z8 = (hupVar.c || !(i6 == 0 || i6 == arrayList.size() + (-1))) ? false : z4;
                            if (pointF.equals(pointF12) && pointF13.equals(pointF12) && !z8) {
                                float f3 = pointF12.x;
                                float f4 = f3 - pointF14.x;
                                float f5 = pointF12.y;
                                float f6 = f5 - pointF14.y;
                                float f7 = pointF15.x - f3;
                                float f8 = pointF15.y - f5;
                                hupVar3 = hupVar7;
                                hupVar4 = hupVar8;
                                double d = f4;
                                hup hupVar14 = hupVar13;
                                hup hupVar15 = hupVar;
                                float hypot = (float) Math.hypot(d, f6);
                                float hypot2 = (float) Math.hypot(f7, f8);
                                float min2 = Math.min(f2 / hypot, 0.5f);
                                float min3 = Math.min(f2 / hypot2, 0.5f);
                                float f9 = pointF12.x;
                                float e = su4.e(pointF14.x, f9, min2, f9);
                                float f10 = pointF12.y;
                                float e2 = su4.e(pointF14.y, f10, min2, f10);
                                float e3 = su4.e(pointF15.x, f9, min3, f9);
                                float e4 = su4.e(pointF15.y, f10, min3, f10);
                                float f11 = e - ((e - f9) * 0.5519f);
                                float f12 = e2 - ((e2 - f10) * 0.5519f);
                                float f13 = e3 - ((e3 - f9) * 0.5519f);
                                float f14 = e4 - ((e4 - f10) * 0.5519f);
                                pv6 pv6Var8 = (pv6) arrayList8.get(xgo.c(i7 - 1, arrayList8.size()));
                                pv6 pv6Var9 = (pv6) arrayList8.get(i7);
                                hupVar6 = hupVar15;
                                pv6Var8.b.set(e, e2);
                                pv6Var8.c.set(e, e2);
                                hupVar5 = hupVar14;
                                if (i6 == 0) {
                                    hupVar5.a(e, e2);
                                }
                                pv6Var9.a.set(f11, f12);
                                pv6 pv6Var10 = (pv6) arrayList8.get(i7 + 1);
                                pv6Var9.b.set(f13, f14);
                                pv6Var9.c.set(e3, e4);
                                pv6Var10.a.set(e3, e4);
                                i7 += 2;
                            } else {
                                hupVar3 = hupVar7;
                                hupVar4 = hupVar8;
                                hupVar5 = hupVar13;
                                hupVar6 = hupVar;
                                pv6 pv6Var11 = (pv6) arrayList8.get(xgo.c(i7 - 1, arrayList8.size()));
                                pv6 pv6Var12 = (pv6) arrayList8.get(i7);
                                PointF pointF16 = pv6Var6.b;
                                pv6Var11.b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = pv6Var6.c;
                                pv6Var11.c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = pv6Var5.a;
                                pv6Var12.a.set(pointF18.x, pointF18.y);
                                i7++;
                            }
                            i6++;
                            hupVar13 = hupVar5;
                            hupVar7 = hupVar3;
                            arrayList6 = arrayList;
                            floatValue = f2;
                            z6 = z7;
                            hupVar8 = hupVar4;
                            hupVar = hupVar6;
                        }
                        hupVar = hupVar13;
                        size5 = i - 1;
                        hupVar7 = hupVar7;
                        hupVar8 = hupVar8;
                    }
                }
                i = size5;
                size5 = i - 1;
                hupVar7 = hupVar7;
                hupVar8 = hupVar8;
            }
        } else {
            hupVar = hupVar11;
        }
        hup hupVar16 = hupVar7;
        hup hupVar17 = hupVar8;
        Path path = this.j;
        y5i.e(hupVar, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        y5i.e(hupVar16, this.k);
        if (hupVar17 != null) {
            hupVar2 = hupVar17;
            y5i.e(hupVar2, this.l);
        } else {
            hupVar2 = hupVar17;
        }
        szg szgVar = this.e;
        float f15 = acfVar.g;
        float floatValue2 = acfVar.h.floatValue();
        hup hupVar18 = hupVar2;
        Path path2 = this.k;
        return (Path) szgVar.b(f15, floatValue2, path2, hupVar18 == null ? path2 : this.l, f, d(), this.d);
    }

    @Override // defpackage.cs2
    public final boolean k() {
        ArrayList arrayList = this.m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
