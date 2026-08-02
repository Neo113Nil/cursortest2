package defpackage;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class bod extends bcf {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bod(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new tso();
                break;
            default:
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    aod aodVar = (aod) ((acf) list.get(i3)).b;
                    if (aodVar != null) {
                        i2 = Math.max(i2, aodVar.b.length);
                    }
                }
                this.j = new aod(new float[i2], new int[i2]);
                break;
        }
    }

    @Override // defpackage.cs2
    public final Object f(acf acfVar, float f) {
        Object obj;
        float f2;
        switch (this.i) {
            case 0:
                aod aodVar = (aod) this.j;
                aod aodVar2 = (aod) acfVar.b;
                aod aodVar3 = (aod) acfVar.c;
                int[] iArr = aodVar.b;
                float[] fArr = aodVar.a;
                boolean equals = aodVar2.equals(aodVar3);
                int[] iArr2 = aodVar2.b;
                if (equals) {
                    aodVar.a(aodVar2);
                    return aodVar;
                }
                if (f <= 0.0f) {
                    aodVar.a(aodVar2);
                    return aodVar;
                }
                if (f >= 1.0f) {
                    aodVar.a(aodVar3);
                    return aodVar;
                }
                int length = iArr2.length;
                int[] iArr3 = aodVar3.b;
                if (length != iArr3.length) {
                    StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                    sb.append(iArr2.length);
                    sb.append(" vs ");
                    xq0.x(f1d.i(sb, iArr3.length, ")"));
                    return null;
                }
                for (int i = 0; i < iArr2.length; i++) {
                    fArr[i] = y5i.f(aodVar2.a[i], aodVar3.a[i], f);
                    iArr[i] = u2x.D(iArr2[i], f, iArr3[i]);
                }
                for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                    fArr[length2] = fArr[iArr2.length - 1];
                    iArr[length2] = iArr[iArr2.length - 1];
                }
                return aodVar;
            case 1:
                return l(acfVar, f, f, f);
            default:
                tso tsoVar = (tso) this.j;
                Object obj2 = acfVar.b;
                if (obj2 == null || (obj = acfVar.c) == null) {
                    xq0.q("Missing values for keyframe.");
                    return null;
                }
                tso tsoVar2 = (tso) obj2;
                tso tsoVar3 = (tso) obj;
                szg szgVar = this.e;
                if (szgVar != null) {
                    f2 = f;
                    tso tsoVar4 = (tso) szgVar.b(acfVar.g, acfVar.h.floatValue(), tsoVar2, tsoVar3, f2, d(), this.d);
                    if (tsoVar4 != null) {
                        return tsoVar4;
                    }
                } else {
                    f2 = f;
                }
                float f3 = y5i.f(tsoVar2.a, tsoVar3.a, f2);
                float f4 = y5i.f(tsoVar2.b, tsoVar3.b, f2);
                tsoVar.a = f3;
                tsoVar.b = f4;
                return tsoVar;
        }
    }

    @Override // defpackage.cs2
    public /* bridge */ /* synthetic */ Object g(acf acfVar, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return l(acfVar, f, f2, f3);
            default:
                return super.g(acfVar, f, f2, f3);
        }
    }

    public PointF l(acf acfVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = acfVar.b;
        if (obj2 == null || (obj = acfVar.c) == null) {
            xq0.q("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        szg szgVar = this.e;
        if (szgVar != null && (pointF = (PointF) szgVar.b(acfVar.g, acfVar.h.floatValue(), pointF3, pointF4, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float e = su4.e(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF2.set(e, su4.e(pointF4.y, f5, f3, f5));
        return pointF2;
    }
}
