package a1;

import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import j1.AbstractC4603g;
import java.util.List;
import k1.C4629a;
import k1.C4630b;

/* loaded from: classes.dex */
public final class j extends k {
    public final /* synthetic */ int i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4270j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.f4270j = new PointF();
                break;
            case 2:
                super(list);
                this.f4270j = new C4630b();
                break;
            default:
                int i6 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    e1.c cVar = (e1.c) ((C4629a) list.get(i9)).f38552b;
                    if (cVar != null) {
                        i6 = Math.max(i6, cVar.f37110b.length);
                    }
                }
                this.f4270j = new e1.c(new float[i6], new int[i6]);
                break;
        }
    }

    @Override // a1.AbstractC0428e
    public final Object f(C4629a c4629a, float f3) {
        Object obj;
        float f9;
        switch (this.i) {
            case 0:
                e1.c cVar = (e1.c) c4629a.f38552b;
                e1.c cVar2 = (e1.c) c4629a.f38553c;
                e1.c cVar3 = (e1.c) this.f4270j;
                cVar3.getClass();
                if (cVar.equals(cVar2)) {
                    cVar3.a(cVar);
                } else if (f3 <= 0.0f) {
                    cVar3.a(cVar);
                } else if (f3 >= 1.0f) {
                    cVar3.a(cVar2);
                } else {
                    int[] iArr = cVar.f37110b;
                    int length = iArr.length;
                    int[] iArr2 = cVar2.f37110b;
                    if (length != iArr2.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(u1.h.e(iArr2.length, ")", sb));
                    }
                    int i = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = cVar3.f37110b;
                        float[] fArr = cVar3.f37109a;
                        if (i < length2) {
                            fArr[i] = AbstractC4603g.f(cVar.f37109a[i], cVar2.f37109a[i], f3);
                            iArr3[i] = O3.b.l(iArr[i], iArr2[i], f3);
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
                return l(c4629a, f3, f3, f3);
            default:
                Object obj2 = c4629a.f38552b;
                if (obj2 == null || (obj = c4629a.f38553c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C4630b c4630b = (C4630b) obj2;
                C4630b c4630b2 = (C4630b) obj;
                C2991bm c2991bm = this.f4257e;
                if (c2991bm != null) {
                    f9 = f3;
                    C4630b c4630b3 = (C4630b) c2991bm.R(c4629a.f38557g, c4629a.f38558h.floatValue(), c4630b, c4630b2, f9, d(), this.f4256d);
                    if (c4630b3 != null) {
                        return c4630b3;
                    }
                } else {
                    f9 = f3;
                }
                float f10 = AbstractC4603g.f(c4630b.f38566a, c4630b2.f38566a, f9);
                float f11 = AbstractC4603g.f(c4630b.f38567b, c4630b2.f38567b, f9);
                C4630b c4630b4 = (C4630b) this.f4270j;
                c4630b4.f38566a = f10;
                c4630b4.f38567b = f11;
                return c4630b4;
        }
    }

    @Override // a1.AbstractC0428e
    public /* bridge */ /* synthetic */ Object g(C4629a c4629a, float f3, float f9, float f10) {
        switch (this.i) {
            case 1:
                return l(c4629a, f3, f9, f10);
            default:
                return super.g(c4629a, f3, f9, f10);
        }
    }

    public PointF l(C4629a c4629a, float f3, float f9, float f10) {
        Object obj;
        Object obj2 = c4629a.f38552b;
        if (obj2 == null || (obj = c4629a.f38553c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        C2991bm c2991bm = this.f4257e;
        if (c2991bm != null) {
            PointF pointF3 = (PointF) c2991bm.R(c4629a.f38557g, c4629a.f38558h.floatValue(), pointF, pointF2, f3, d(), this.f4256d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f4270j;
        float f11 = pointF.x;
        float a9 = AbstractC4404f.a(pointF2.x, f11, f9, f11);
        float f12 = pointF.y;
        pointF4.set(a9, AbstractC4404f.a(pointF2.y, f12, f10, f12));
        return pointF4;
    }
}
