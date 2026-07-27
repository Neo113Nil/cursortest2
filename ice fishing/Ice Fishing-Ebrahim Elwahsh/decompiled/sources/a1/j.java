package a1;

import android.graphics.PointF;
import com.google.android.gms.internal.ads.CL;
import java.util.List;
import k1.C4628a;
import k1.C4629b;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class j extends k {
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4319j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.f4319j = new PointF();
                break;
            case 2:
                super(list);
                this.f4319j = new C4629b();
                break;
            default:
                int i4 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    e1.c cVar = (e1.c) ((C4628a) list.get(i9)).f38672b;
                    if (cVar != null) {
                        i4 = Math.max(i4, cVar.f37241b.length);
                    }
                }
                this.f4319j = new e1.c(new float[i4], new int[i4]);
                break;
        }
    }

    @Override // a1.AbstractC0421e
    public final Object f(C4628a c4628a, float f6) {
        Object obj;
        float f9;
        switch (this.i) {
            case 0:
                e1.c cVar = (e1.c) c4628a.f38672b;
                e1.c cVar2 = (e1.c) c4628a.f38673c;
                e1.c cVar3 = (e1.c) this.f4319j;
                cVar3.getClass();
                if (cVar.equals(cVar2)) {
                    cVar3.a(cVar);
                } else if (f6 <= 0.0f) {
                    cVar3.a(cVar);
                } else if (f6 >= 1.0f) {
                    cVar3.a(cVar2);
                } else {
                    int[] iArr = cVar.f37241b;
                    int length = iArr.length;
                    int[] iArr2 = cVar2.f37241b;
                    if (length != iArr2.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(AbstractC5051n.e(iArr2.length, ")", sb));
                    }
                    int i = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = cVar3.f37241b;
                        float[] fArr = cVar3.f37240a;
                        if (i < length2) {
                            fArr[i] = j1.h.f(cVar.f37240a[i], cVar2.f37240a[i], f6);
                            iArr3[i] = com.bumptech.glide.g.L(iArr[i], iArr2[i], f6);
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
                return l(c4628a, f6, f6, f6);
            default:
                Object obj2 = c4628a.f38672b;
                if (obj2 == null || (obj = c4628a.f38673c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C4629b c4629b = (C4629b) obj2;
                C4629b c4629b2 = (C4629b) obj;
                S0.s sVar = this.f4306e;
                if (sVar != null) {
                    f9 = f6;
                    C4629b c4629b3 = (C4629b) sVar.h(c4628a.f38677g, c4628a.f38678h.floatValue(), c4629b, c4629b2, f9, d(), this.f4305d);
                    if (c4629b3 != null) {
                        return c4629b3;
                    }
                } else {
                    f9 = f6;
                }
                float f10 = j1.h.f(c4629b.f38686a, c4629b2.f38686a, f9);
                float f11 = j1.h.f(c4629b.f38687b, c4629b2.f38687b, f9);
                C4629b c4629b4 = (C4629b) this.f4319j;
                c4629b4.f38686a = f10;
                c4629b4.f38687b = f11;
                return c4629b4;
        }
    }

    @Override // a1.AbstractC0421e
    public /* bridge */ /* synthetic */ Object g(C4628a c4628a, float f6, float f9, float f10) {
        switch (this.i) {
            case 1:
                return l(c4628a, f6, f9, f10);
            default:
                return super.g(c4628a, f6, f9, f10);
        }
    }

    public PointF l(C4628a c4628a, float f6, float f9, float f10) {
        Object obj;
        Object obj2 = c4628a.f38672b;
        if (obj2 == null || (obj = c4628a.f38673c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        S0.s sVar = this.f4306e;
        if (sVar != null) {
            PointF pointF3 = (PointF) sVar.h(c4628a.f38677g, c4628a.f38678h.floatValue(), pointF, pointF2, f6, d(), this.f4305d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f4319j;
        float f11 = pointF.x;
        float a9 = CL.a(pointF2.x, f11, f9, f11);
        float f12 = pointF.y;
        pointF4.set(a9, CL.a(pointF2.y, f12, f10, f12));
        return pointF4;
    }
}
