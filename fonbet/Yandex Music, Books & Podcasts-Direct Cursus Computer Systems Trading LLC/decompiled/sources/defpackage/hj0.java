package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
public final class hj0 extends rr4 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj0(ViewGroup viewGroup, int i) {
        super(1);
        this.c = i;
        this.d = viewGroup;
    }

    @Override // defpackage.rr4
    public final kqv h(kqv kqvVar, List list) {
        int i = this.c;
        ViewGroup viewGroup = this.d;
        switch (i) {
            case 0:
                int i2 = oj0.z;
                return ((oj0) viewGroup).l(kqvVar);
            default:
                x18 x18Var = (x18) viewGroup;
                if (x18Var.l) {
                    return kqvVar;
                }
                View childAt = x18Var.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, x18Var.getWidth() - childAt.getRight());
                int max4 = Math.max(0, x18Var.getHeight() - childAt.getBottom());
                return (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) ? kqvVar : kqvVar.a.n(max, max2, max3, max4);
        }
    }

    @Override // defpackage.rr4
    public final nur i(vpv vpvVar, nur nurVar) {
        switch (this.c) {
            case 0:
                ane aneVar = (ane) ((oj0) this.d).y.F.c;
                if (!aneVar.X.n) {
                    return nurVar;
                }
                long Q = xv.Q(aneVar.S(0L));
                int i = (int) (Q >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (Q & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long j = ltg.D(aneVar).j();
                int i3 = (int) (j >> 32);
                int i4 = (int) (j & 4294967295L);
                long j2 = aneVar.c;
                long Q2 = xv.Q(aneVar.S((Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (Q2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & Q2));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? nurVar : new nur(8, oj0.j((zne) nurVar.b, i, i2, i5, i7), oj0.j((zne) nurVar.c, i, i2, i5, i7));
            default:
                x18 x18Var = (x18) this.d;
                if (x18Var.l) {
                    return nurVar;
                }
                View childAt = x18Var.getChildAt(0);
                int max = Math.max(0, childAt.getLeft());
                int max2 = Math.max(0, childAt.getTop());
                int max3 = Math.max(0, x18Var.getWidth() - childAt.getRight());
                int max4 = Math.max(0, x18Var.getHeight() - childAt.getBottom());
                if (max == 0 && max2 == 0 && max3 == 0 && max4 == 0) {
                    return nurVar;
                }
                zne c = zne.c(max, max2, max3, max4);
                int i8 = c.a;
                zne zneVar = (zne) nurVar.b;
                int i9 = c.b;
                int i10 = c.c;
                int i11 = c.d;
                return new nur(8, kqv.e(zneVar, i8, i9, i10, i11), kqv.e((zne) nurVar.c, i8, i9, i10, i11));
        }
    }
}
