package c1;

import a.AbstractC0426a;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.LP;
import com.google.android.gms.internal.ads.Wv;
import java.util.List;
import l1.AbstractC4672g;
import m1.C4739a;
import m1.C4740b;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class j extends k {
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f5665j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.f5665j = new PointF();
                break;
            case 2:
                super(list);
                this.f5665j = new C4740b();
                break;
            default:
                int i4 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    g1.c cVar = (g1.c) ((C4739a) list.get(i6)).f39341b;
                    if (cVar != null) {
                        i4 = Math.max(i4, cVar.f37586b.length);
                    }
                }
                this.f5665j = new g1.c(new float[i4], new int[i4]);
                break;
        }
    }

    @Override // c1.AbstractC0545e
    public final Object f(C4739a c4739a, float f2) {
        Object obj;
        float f9;
        switch (this.i) {
            case 0:
                g1.c cVar = (g1.c) c4739a.f39341b;
                g1.c cVar2 = (g1.c) c4739a.f39342c;
                g1.c cVar3 = (g1.c) this.f5665j;
                cVar3.getClass();
                if (cVar.equals(cVar2)) {
                    cVar3.a(cVar);
                } else if (f2 <= 0.0f) {
                    cVar3.a(cVar);
                } else if (f2 >= 1.0f) {
                    cVar3.a(cVar2);
                } else {
                    int[] iArr = cVar.f37586b;
                    int length = iArr.length;
                    int[] iArr2 = cVar2.f37586b;
                    if (length != iArr2.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(AbstractC5128c.e(iArr2.length, ")", sb));
                    }
                    int i = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = cVar3.f37586b;
                        float[] fArr = cVar3.f37585a;
                        if (i < length2) {
                            fArr[i] = AbstractC4672g.f(cVar.f37585a[i], cVar2.f37585a[i], f2);
                            iArr3[i] = AbstractC0426a.e(iArr[i], iArr2[i], f2);
                            i++;
                        } else {
                            for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                fArr[length3] = fArr[iArr.length - 1];
                                iArr3[length3] = iArr3[iArr.length - 1];
                            }
                        }
                    }
                }
                return cVar3;
            case 1:
                return l(c4739a, f2, f2, f2);
            default:
                Object obj2 = c4739a.f39341b;
                if (obj2 == null || (obj = c4739a.f39342c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C4740b c4740b = (C4740b) obj2;
                C4740b c4740b2 = (C4740b) obj;
                LP lp = this.f5652e;
                if (lp != null) {
                    f9 = f2;
                    C4740b c4740b3 = (C4740b) lp.d(c4739a.f39346g, c4739a.f39347h.floatValue(), c4740b, c4740b2, f9, d(), this.f5651d);
                    if (c4740b3 != null) {
                        return c4740b3;
                    }
                } else {
                    f9 = f2;
                }
                float f10 = AbstractC4672g.f(c4740b.f39355a, c4740b2.f39355a, f9);
                float f11 = AbstractC4672g.f(c4740b.f39356b, c4740b2.f39356b, f9);
                C4740b c4740b4 = (C4740b) this.f5665j;
                c4740b4.f39355a = f10;
                c4740b4.f39356b = f11;
                return c4740b4;
        }
    }

    @Override // c1.AbstractC0545e
    public /* bridge */ /* synthetic */ Object g(C4739a c4739a, float f2, float f9, float f10) {
        switch (this.i) {
            case 1:
                return l(c4739a, f2, f9, f10);
            default:
                return super.g(c4739a, f2, f9, f10);
        }
    }

    public PointF l(C4739a c4739a, float f2, float f9, float f10) {
        Object obj;
        Object obj2 = c4739a.f39341b;
        if (obj2 == null || (obj = c4739a.f39342c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        LP lp = this.f5652e;
        if (lp != null) {
            PointF pointF3 = (PointF) lp.d(c4739a.f39346g, c4739a.f39347h.floatValue(), pointF, pointF2, f2, d(), this.f5651d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f5665j;
        float f11 = pointF.x;
        float a9 = Wv.a(pointF2.x, f11, f9, f11);
        float f12 = pointF.y;
        pointF4.set(a9, Wv.a(pointF2.y, f12, f10, f12));
        return pointF4;
    }
}
