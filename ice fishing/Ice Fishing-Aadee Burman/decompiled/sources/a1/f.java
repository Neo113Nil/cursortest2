package a1;

import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;
import j1.AbstractC4603g;
import java.util.List;
import k1.C4629a;

/* loaded from: classes.dex */
public final class f extends k {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // a1.AbstractC0428e
    public final Object f(C4629a c4629a, float f3) {
        int i;
        int i6;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(c4629a, f3));
            case 1:
                Object obj2 = c4629a.f38552b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = c4629a.f38553c;
                if (obj3 == null) {
                    if (c4629a.f38560k == 784923401) {
                        c4629a.f38560k = ((Integer) obj2).intValue();
                    }
                    i = c4629a.f38560k;
                } else {
                    if (c4629a.f38561l == 784923401) {
                        c4629a.f38561l = ((Integer) obj3).intValue();
                    }
                    i = c4629a.f38561l;
                }
                int i9 = i;
                C2991bm c2991bm = this.f4257e;
                if (c2991bm != null) {
                    Integer num = (Integer) c2991bm.R(c4629a.f38557g, c4629a.f38558h.floatValue(), (Integer) obj2, Integer.valueOf(i9), f3, d(), this.f4256d);
                    if (num != null) {
                        i6 = num.intValue();
                        return Integer.valueOf(i6);
                    }
                }
                if (c4629a.f38560k == 784923401) {
                    c4629a.f38560k = ((Integer) obj2).intValue();
                }
                int i10 = c4629a.f38560k;
                PointF pointF = AbstractC4603g.f38322a;
                i6 = (int) (((i9 - i10) * f3) + i10);
                return Integer.valueOf(i6);
            default:
                C2991bm c2991bm2 = this.f4257e;
                Object obj4 = c4629a.f38552b;
                if (c2991bm2 == null) {
                    return (f3 != 1.0f || (obj = c4629a.f38553c) == null) ? (c1.b) obj4 : (c1.b) obj;
                }
                Float f9 = c4629a.f38558h;
                float floatValue = f9 == null ? Float.MAX_VALUE : f9.floatValue();
                c1.b bVar = (c1.b) obj4;
                Object obj5 = c4629a.f38553c;
                return (c1.b) c2991bm2.R(c4629a.f38557g, floatValue, bVar, obj5 == null ? bVar : (c1.b) obj5, f3, c(), this.f4256d);
        }
    }

    public int l(C4629a c4629a, float f3) {
        float f9;
        Float f10;
        if (c4629a.f38552b == null || c4629a.f38553c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C2991bm c2991bm = this.f4257e;
        Object obj = c4629a.f38552b;
        if (c2991bm == null || (f10 = c4629a.f38558h) == null) {
            f9 = f3;
        } else {
            f9 = f3;
            Integer num = (Integer) c2991bm.R(c4629a.f38557g, f10.floatValue(), (Integer) obj, (Integer) c4629a.f38553c, f9, d(), this.f4256d);
            if (num != null) {
                return num.intValue();
            }
        }
        return O3.b.l(((Integer) obj).intValue(), ((Integer) c4629a.f38553c).intValue(), AbstractC4603g.b(f9, 0.0f, 1.0f));
    }
}
