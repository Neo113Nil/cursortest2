package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class s85 extends bcf {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s85(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // defpackage.cs2
    public final Object f(acf acfVar, float f) {
        int i;
        int i2;
        Integer num;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(acfVar, f));
            case 1:
                Object obj2 = acfVar.b;
                if (obj2 == null) {
                    xq0.q("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = acfVar.c;
                if (obj3 == null) {
                    if (acfVar.k == 784923401) {
                        acfVar.k = ((Integer) obj2).intValue();
                    }
                    i = acfVar.k;
                } else {
                    if (acfVar.l == 784923401) {
                        acfVar.l = ((Integer) obj3).intValue();
                    }
                    i = acfVar.l;
                }
                int i3 = i;
                szg szgVar = this.e;
                if (szgVar == null || (num = (Integer) szgVar.b(acfVar.g, acfVar.h.floatValue(), (Integer) obj2, Integer.valueOf(i3), f, d(), this.d)) == null) {
                    if (acfVar.k == 784923401) {
                        acfVar.k = ((Integer) obj2).intValue();
                    }
                    int i4 = acfVar.k;
                    PointF pointF = y5i.a;
                    i2 = (int) (((i3 - i4) * f) + i4);
                } else {
                    i2 = num.intValue();
                }
                return Integer.valueOf(i2);
            default:
                Object obj4 = acfVar.b;
                szg szgVar2 = this.e;
                if (szgVar2 == null) {
                    return (f != 1.0f || (obj = acfVar.c) == null) ? (c3a) obj4 : (c3a) obj;
                }
                float f2 = acfVar.g;
                Float f3 = acfVar.h;
                float floatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
                c3a c3aVar = (c3a) obj4;
                Object obj5 = acfVar.c;
                return (c3a) szgVar2.b(f2, floatValue, c3aVar, obj5 == null ? c3aVar : (c3a) obj5, f, c(), this.d);
        }
    }

    public int l(acf acfVar, float f) {
        float f2;
        Float f3;
        Object obj = acfVar.b;
        Object obj2 = acfVar.b;
        if (obj == null || acfVar.c == null) {
            xq0.q("Missing values for keyframe.");
            return 0;
        }
        szg szgVar = this.e;
        if (szgVar == null || (f3 = acfVar.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) szgVar.b(acfVar.g, f3.floatValue(), (Integer) obj2, (Integer) acfVar.c, f2, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return u2x.D(((Integer) obj2).intValue(), y5i.b(f2, 0.0f, 1.0f), ((Integer) acfVar.c).intValue());
    }
}
