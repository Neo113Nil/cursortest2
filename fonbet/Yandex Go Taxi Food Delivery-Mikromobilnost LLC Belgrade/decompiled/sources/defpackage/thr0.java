package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class thr0 extends i35 {
    public final lhr0 i;
    public final Path j;
    public Path k;
    public Path l;
    public ArrayList m;

    public thr0(List list) {
        super(list);
        this.i = new lhr0();
        this.j = new Path();
    }

    @Override // defpackage.i35
    public final Object g(rkx rkxVar, float f) {
        lhr0 lhr0Var;
        lhr0 lhr0Var2;
        int i;
        int i2;
        ArrayList arrayList;
        PointF pointF;
        lhr0 lhr0Var3;
        lhr0 lhr0Var4;
        lhr0 lhr0Var5;
        lhr0 lhr0Var6 = (lhr0) rkxVar.b;
        lhr0 lhr0Var7 = (lhr0) rkxVar.c;
        lhr0 lhr0Var8 = lhr0Var7 == null ? lhr0Var6 : lhr0Var7;
        lhr0 lhr0Var9 = this.i;
        ArrayList arrayList2 = lhr0Var9.a;
        if (lhr0Var9.b == null) {
            lhr0Var9.b = new PointF();
        }
        boolean z = lhr0Var6.c;
        ArrayList arrayList3 = lhr0Var6.a;
        boolean z2 = true;
        lhr0Var9.c = z || lhr0Var8.c;
        int size = arrayList3.size();
        ArrayList arrayList4 = lhr0Var8.a;
        if (size != arrayList4.size()) {
            lgz.b("Curves must have the same number of control points. Shape 1: " + arrayList3.size() + "\tShape 2: " + arrayList4.size());
        }
        int min = Math.min(arrayList3.size(), arrayList4.size());
        if (arrayList2.size() < min) {
            for (int size2 = arrayList2.size(); size2 < min; size2++) {
                arrayList2.add(new mdf());
            }
        } else if (arrayList2.size() > min) {
            for (int size3 = arrayList2.size() - 1; size3 >= min; size3--) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        PointF pointF2 = lhr0Var6.b;
        PointF pointF3 = lhr0Var8.b;
        lhr0Var9.a(ti20.f(pointF2.x, pointF3.x, f), ti20.f(pointF2.y, pointF3.y, f));
        int size4 = arrayList2.size() - 1;
        while (size4 >= 0) {
            mdf mdfVar = (mdf) arrayList3.get(size4);
            mdf mdfVar2 = (mdf) arrayList4.get(size4);
            PointF pointF4 = mdfVar.a;
            PointF pointF5 = mdfVar.b;
            PointF pointF6 = mdfVar.c;
            boolean z3 = z2;
            PointF pointF7 = mdfVar2.a;
            PointF pointF8 = mdfVar2.b;
            PointF pointF9 = mdfVar2.c;
            ((mdf) arrayList2.get(size4)).a.set(ti20.f(pointF4.x, pointF7.x, f), ti20.f(pointF4.y, pointF7.y, f));
            ((mdf) arrayList2.get(size4)).b.set(ti20.f(pointF5.x, pointF8.x, f), ti20.f(pointF5.y, pointF8.y, f));
            ((mdf) arrayList2.get(size4)).c.set(ti20.f(pointF6.x, pointF9.x, f), ti20.f(pointF6.y, pointF9.y, f));
            size4--;
            z2 = z3;
            arrayList3 = arrayList3;
            lhr0Var9 = lhr0Var9;
            arrayList4 = arrayList4;
        }
        lhr0 lhr0Var10 = lhr0Var9;
        boolean z4 = z2;
        ArrayList arrayList5 = this.m;
        if (arrayList5 != null) {
            int size5 = arrayList5.size() - 1;
            lhr0Var = lhr0Var10;
            while (true) {
                ArrayList arrayList6 = lhr0Var.a;
                if (size5 < 0) {
                    break;
                }
                fyk0 fyk0Var = (fyk0) this.m.get(size5);
                fyk0Var.getClass();
                if (arrayList6.size() > 2) {
                    float floatValue = ((Float) fyk0Var.b.f()).floatValue();
                    if (floatValue != 0.0f) {
                        boolean z5 = lhr0Var.c;
                        int size6 = arrayList6.size() - 1;
                        int i3 = 0;
                        while (size6 >= 0) {
                            mdf mdfVar3 = (mdf) arrayList6.get(size6);
                            mdf mdfVar4 = (mdf) arrayList6.get(fyk0.a(size6 - 1, arrayList6.size()));
                            PointF pointF10 = (size6 != 0 || z5) ? mdfVar4.c : lhr0Var.b;
                            int i4 = size5;
                            i3 = (((size6 != 0 || z5) ? mdfVar4.b : pointF10).equals(pointF10) && mdfVar3.a.equals(pointF10) && !((lhr0Var.c || (size6 != 0 && size6 != arrayList6.size() + (-1))) ? false : z4)) ? i3 + 2 : i3 + 1;
                            size6--;
                            size5 = i4;
                        }
                        i = size5;
                        lhr0 lhr0Var11 = fyk0Var.c;
                        if (lhr0Var11 == null || lhr0Var11.a.size() != i3) {
                            ArrayList arrayList7 = new ArrayList(i3);
                            for (int i5 = 0; i5 < i3; i5++) {
                                arrayList7.add(new mdf());
                            }
                            i2 = 0;
                            fyk0Var.c = new lhr0(new PointF(0.0f, 0.0f), false, arrayList7);
                        } else {
                            i2 = 0;
                        }
                        lhr0 lhr0Var12 = fyk0Var.c;
                        lhr0Var12.c = z5;
                        PointF pointF11 = lhr0Var.b;
                        lhr0Var12.a(pointF11.x, pointF11.y);
                        ArrayList arrayList8 = lhr0Var12.a;
                        boolean z6 = lhr0Var.c;
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < arrayList6.size()) {
                            mdf mdfVar5 = (mdf) arrayList6.get(i6);
                            mdf mdfVar6 = (mdf) arrayList6.get(fyk0.a(i6 - 1, arrayList6.size()));
                            mdf mdfVar7 = (mdf) arrayList6.get(fyk0.a(i6 - 2, arrayList6.size()));
                            PointF pointF12 = (i6 != 0 || z6) ? mdfVar6.c : lhr0Var.b;
                            if (i6 != 0 || z6) {
                                arrayList = arrayList6;
                                pointF = mdfVar6.b;
                            } else {
                                arrayList = arrayList6;
                                pointF = pointF12;
                            }
                            float f2 = floatValue;
                            PointF pointF13 = mdfVar5.a;
                            PointF pointF14 = mdfVar7.c;
                            boolean z7 = z6;
                            PointF pointF15 = mdfVar5.c;
                            boolean z8 = (lhr0Var.c || !(i6 == 0 || i6 == arrayList.size() + (-1))) ? false : z4;
                            if (pointF.equals(pointF12) && pointF13.equals(pointF12) && !z8) {
                                float f3 = pointF12.x;
                                float f4 = f3 - pointF14.x;
                                float f5 = pointF12.y;
                                float f6 = f5 - pointF14.y;
                                float f7 = pointF15.x - f3;
                                float f8 = pointF15.y - f5;
                                lhr0 lhr0Var13 = lhr0Var;
                                lhr0Var3 = lhr0Var6;
                                lhr0Var4 = lhr0Var7;
                                float hypot = (float) Math.hypot(f4, f6);
                                float hypot2 = (float) Math.hypot(f7, f8);
                                float min2 = Math.min(f2 / hypot, 0.5f);
                                float min3 = Math.min(f2 / hypot2, 0.5f);
                                float f9 = pointF12.x;
                                float b = g8e.b(pointF14.x, f9, min2, f9);
                                float f10 = pointF12.y;
                                float b2 = g8e.b(pointF14.y, f10, min2, f10);
                                float b3 = g8e.b(pointF15.x, f9, min3, f9);
                                float b4 = g8e.b(pointF15.y, f10, min3, f10);
                                float f11 = b - ((b - f9) * 0.5519f);
                                float f12 = b2 - ((b2 - f10) * 0.5519f);
                                float f13 = b3 - ((b3 - f9) * 0.5519f);
                                float f14 = b4 - ((b4 - f10) * 0.5519f);
                                mdf mdfVar8 = (mdf) arrayList8.get(fyk0.a(i7 - 1, arrayList8.size()));
                                mdf mdfVar9 = (mdf) arrayList8.get(i7);
                                lhr0Var5 = lhr0Var13;
                                mdfVar8.b.set(b, b2);
                                mdfVar8.c.set(b, b2);
                                if (i6 == 0) {
                                    lhr0Var12.a(b, b2);
                                }
                                mdfVar9.a.set(f11, f12);
                                mdf mdfVar10 = (mdf) arrayList8.get(i7 + 1);
                                mdfVar9.b.set(f13, f14);
                                mdfVar9.c.set(b3, b4);
                                mdfVar10.a.set(b3, b4);
                                i7 += 2;
                            } else {
                                lhr0Var3 = lhr0Var6;
                                lhr0Var4 = lhr0Var7;
                                lhr0Var5 = lhr0Var;
                                mdf mdfVar11 = (mdf) arrayList8.get(fyk0.a(i7 - 1, arrayList8.size()));
                                mdf mdfVar12 = (mdf) arrayList8.get(i7);
                                PointF pointF16 = mdfVar6.b;
                                mdfVar11.b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = mdfVar6.c;
                                mdfVar11.c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = mdfVar5.a;
                                mdfVar12.a.set(pointF18.x, pointF18.y);
                                i7++;
                            }
                            i6++;
                            arrayList6 = arrayList;
                            floatValue = f2;
                            z6 = z7;
                            lhr0Var6 = lhr0Var3;
                            lhr0Var7 = lhr0Var4;
                            lhr0Var = lhr0Var5;
                        }
                        lhr0Var = lhr0Var12;
                        size5 = i - 1;
                        lhr0Var6 = lhr0Var6;
                        lhr0Var7 = lhr0Var7;
                    }
                }
                i = size5;
                size5 = i - 1;
                lhr0Var6 = lhr0Var6;
                lhr0Var7 = lhr0Var7;
            }
        } else {
            lhr0Var = lhr0Var10;
        }
        lhr0 lhr0Var14 = lhr0Var6;
        lhr0 lhr0Var15 = lhr0Var7;
        Path path = this.j;
        ti20.e(lhr0Var, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.l = new Path();
        }
        ti20.e(lhr0Var14, this.k);
        if (lhr0Var15 != null) {
            lhr0Var2 = lhr0Var15;
            ti20.e(lhr0Var2, this.l);
        } else {
            lhr0Var2 = lhr0Var15;
        }
        puz puzVar = this.e;
        float f15 = rkxVar.g;
        float floatValue2 = rkxVar.h.floatValue();
        lhr0 lhr0Var16 = lhr0Var2;
        Path path2 = this.k;
        return (Path) puzVar.b(f15, floatValue2, path2, lhr0Var16 == null ? path2 : this.l, f, e(), this.d);
    }

    @Override // defpackage.i35
    public final boolean l() {
        ArrayList arrayList = this.m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
