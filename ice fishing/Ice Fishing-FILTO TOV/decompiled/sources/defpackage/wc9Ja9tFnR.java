package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wc9Ja9tFnR extends h50 implements nv {
    public final /* synthetic */ int AvO7iQsrTN;
    public final /* synthetic */ VJUcwvGgb9W EljAMC1QTz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc9Ja9tFnR(VJUcwvGgb9W vJUcwvGgb9W, int i) {
        super(4);
        this.EljAMC1QTz = vJUcwvGgb9W;
        this.AvO7iQsrTN = i;
    }

    @Override // defpackage.nv
    public final Object XnEVoBF0td1l(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        VJUcwvGgb9W vJUcwvGgb9W = this.EljAMC1QTz;
        j6IIN2O8eOU j6iin2o8eou = vJUcwvGgb9W.OOA6hdeuvCS;
        ((AutofillManager) j6iin2o8eou.EljAMC1QTz).notifyViewEntered(vJUcwvGgb9W.AvO7iQsrTN, this.AvO7iQsrTN, new Rect(intValue, intValue2, intValue3, intValue4));
        return kc1.GWasM1elztuh;
    }
}
