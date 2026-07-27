package a1;

import android.graphics.PointF;
import java.util.List;
import k1.C4628a;

/* loaded from: classes.dex */
public final class f extends k {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // a1.AbstractC0421e
    public final Object f(C4628a c4628a, float f6) {
        int i;
        int i4;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(c4628a, f6));
            case 1:
                Object obj2 = c4628a.f38672b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = c4628a.f38673c;
                if (obj3 == null) {
                    if (c4628a.f38680k == 784923401) {
                        c4628a.f38680k = ((Integer) obj2).intValue();
                    }
                    i = c4628a.f38680k;
                } else {
                    if (c4628a.f38681l == 784923401) {
                        c4628a.f38681l = ((Integer) obj3).intValue();
                    }
                    i = c4628a.f38681l;
                }
                int i9 = i;
                S0.s sVar = this.f4306e;
                if (sVar != null) {
                    Integer num = (Integer) sVar.h(c4628a.f38677g, c4628a.f38678h.floatValue(), (Integer) obj2, Integer.valueOf(i9), f6, d(), this.f4305d);
                    if (num != null) {
                        i4 = num.intValue();
                        return Integer.valueOf(i4);
                    }
                }
                if (c4628a.f38680k == 784923401) {
                    c4628a.f38680k = ((Integer) obj2).intValue();
                }
                int i10 = c4628a.f38680k;
                PointF pointF = j1.h.f38505a;
                i4 = (int) (((i9 - i10) * f6) + i10);
                return Integer.valueOf(i4);
            default:
                S0.s sVar2 = this.f4306e;
                Object obj4 = c4628a.f38672b;
                if (sVar2 == null) {
                    return (f6 != 1.0f || (obj = c4628a.f38673c) == null) ? (c1.b) obj4 : (c1.b) obj;
                }
                Float f9 = c4628a.f38678h;
                float floatValue = f9 == null ? Float.MAX_VALUE : f9.floatValue();
                c1.b bVar = (c1.b) obj4;
                Object obj5 = c4628a.f38673c;
                return (c1.b) sVar2.h(c4628a.f38677g, floatValue, bVar, obj5 == null ? bVar : (c1.b) obj5, f6, c(), this.f4305d);
        }
    }

    public int l(C4628a c4628a, float f6) {
        float f9;
        Float f10;
        if (c4628a.f38672b == null || c4628a.f38673c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        S0.s sVar = this.f4306e;
        Object obj = c4628a.f38672b;
        if (sVar == null || (f10 = c4628a.f38678h) == null) {
            f9 = f6;
        } else {
            f9 = f6;
            Integer num = (Integer) sVar.h(c4628a.f38677g, f10.floatValue(), (Integer) obj, (Integer) c4628a.f38673c, f9, d(), this.f4305d);
            if (num != null) {
                return num.intValue();
            }
        }
        return com.bumptech.glide.g.L(((Integer) obj).intValue(), ((Integer) c4628a.f38673c).intValue(), j1.h.b(f9, 0.0f, 1.0f));
    }
}
