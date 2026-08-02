package c1;

import a.AbstractC0426a;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.LP;
import java.util.List;
import l1.AbstractC4672g;
import m1.C4739a;

/* loaded from: classes.dex */
public final class f extends k {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // c1.AbstractC0545e
    public final Object f(C4739a c4739a, float f2) {
        int i;
        int i4;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(c4739a, f2));
            case 1:
                Object obj2 = c4739a.f39341b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = c4739a.f39342c;
                if (obj3 == null) {
                    if (c4739a.f39349k == 784923401) {
                        c4739a.f39349k = ((Integer) obj2).intValue();
                    }
                    i = c4739a.f39349k;
                } else {
                    if (c4739a.f39350l == 784923401) {
                        c4739a.f39350l = ((Integer) obj3).intValue();
                    }
                    i = c4739a.f39350l;
                }
                int i6 = i;
                LP lp = this.f5652e;
                if (lp != null) {
                    Integer num = (Integer) lp.d(c4739a.f39346g, c4739a.f39347h.floatValue(), (Integer) obj2, Integer.valueOf(i6), f2, d(), this.f5651d);
                    if (num != null) {
                        i4 = num.intValue();
                        return Integer.valueOf(i4);
                    }
                }
                if (c4739a.f39349k == 784923401) {
                    c4739a.f39349k = ((Integer) obj2).intValue();
                }
                int i9 = c4739a.f39349k;
                PointF pointF = AbstractC4672g.f38834a;
                i4 = (int) (((i6 - i9) * f2) + i9);
                return Integer.valueOf(i4);
            default:
                LP lp2 = this.f5652e;
                Object obj4 = c4739a.f39341b;
                if (lp2 == null) {
                    return (f2 != 1.0f || (obj = c4739a.f39342c) == null) ? (e1.b) obj4 : (e1.b) obj;
                }
                Float f9 = c4739a.f39347h;
                float floatValue = f9 == null ? Float.MAX_VALUE : f9.floatValue();
                e1.b bVar = (e1.b) obj4;
                Object obj5 = c4739a.f39342c;
                return (e1.b) lp2.d(c4739a.f39346g, floatValue, bVar, obj5 == null ? bVar : (e1.b) obj5, f2, c(), this.f5651d);
        }
    }

    public int l(C4739a c4739a, float f2) {
        float f9;
        Float f10;
        if (c4739a.f39341b == null || c4739a.f39342c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        LP lp = this.f5652e;
        Object obj = c4739a.f39341b;
        if (lp == null || (f10 = c4739a.f39347h) == null) {
            f9 = f2;
        } else {
            f9 = f2;
            Integer num = (Integer) lp.d(c4739a.f39346g, f10.floatValue(), (Integer) obj, (Integer) c4739a.f39342c, f9, d(), this.f5651d);
            if (num != null) {
                return num.intValue();
            }
        }
        return AbstractC0426a.e(((Integer) obj).intValue(), ((Integer) c4739a.f39342c).intValue(), AbstractC4672g.b(f9, 0.0f, 1.0f));
    }
}
