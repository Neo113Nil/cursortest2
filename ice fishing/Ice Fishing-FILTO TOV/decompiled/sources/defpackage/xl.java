package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xl extends mb {
    public final /* synthetic */ yl AvO7iQsrTN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(yl ylVar) {
        super(1);
        this.AvO7iQsrTN = ylVar;
    }

    @Override // defpackage.mb
    public final wg1 AvO7iQsrTN(wg1 wg1Var, List list) {
        yl ylVar = this.AvO7iQsrTN;
        if (!ylVar.YmKjaVtbfp5Z) {
            View childAt = ylVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, ylVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, ylVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return wg1Var.GWasM1elztuh.YmKjaVtbfp5Z(max, max2, max3, max4);
            }
        }
        return wg1Var;
    }

    @Override // defpackage.mb
    public final d encWxUiV2(bg1 bg1Var, d dVar) {
        yl ylVar = this.AvO7iQsrTN;
        if (!ylVar.YmKjaVtbfp5Z) {
            View childAt = ylVar.getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, ylVar.getWidth() - childAt.getRight());
            int max4 = Math.max(0, ylVar.getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                e20 Yi7zF1RB1 = e20.Yi7zF1RB1(max, max2, max3, max4);
                int i = Yi7zF1RB1.GWasM1elztuh;
                e20 e20Var = (e20) dVar.EljAMC1QTz;
                int i2 = Yi7zF1RB1.Yi7zF1RB1;
                int i3 = Yi7zF1RB1.X1lG3V04pd;
                int i4 = Yi7zF1RB1.xqGvceK5x;
                return new d(23, wg1.GWasM1elztuh(e20Var, i, i2, i3, i4), wg1.GWasM1elztuh((e20) dVar.AvO7iQsrTN, i, i2, i3, i4));
            }
        }
        return dVar;
    }
}
