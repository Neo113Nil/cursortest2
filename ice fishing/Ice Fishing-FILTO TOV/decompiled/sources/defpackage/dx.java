package defpackage;

import com.combinations.level.experts.core.domain.model.ConduitKt;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class dx implements hv {
    public final /* synthetic */ int EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ dx(int i, int i2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = i2;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        cx cxVar = (cx) obj;
        cxVar.getClass();
        ArrayList sb9fmtV8A = rb.sb9fmtV8A(cxVar.encWxUiV2);
        int i = this.EljAMC1QTz;
        int intValue = ((Number) sb9fmtV8A.get(i)).intValue();
        int i2 = this.OOA6hdeuvCS;
        sb9fmtV8A.set(i, Integer.valueOf(intValue + i2));
        ArrayList sb9fmtV8A2 = rb.sb9fmtV8A(cxVar.mOu10nynGul);
        sb9fmtV8A2.set(i, Integer.valueOf(ConduitKt.rotateCw(((Number) cxVar.AvO7iQsrTN.get(i)).intValue(), ((Number) sb9fmtV8A.get(i)).intValue())));
        return cx.GWasM1elztuh(cxVar, null, 0, 0, null, 0, 0, null, sb9fmtV8A, sb9fmtV8A2, d5.K0ReC6MK(n4.YmKjaVtbfp5Z(cxVar.OOA6hdeuvCS, cxVar.EljAMC1QTz, sb9fmtV8A2, cxVar.rQPn8YBR)), 0, 0, cxVar.XnEVoBF0td1l + i2, 0L, 0, null, null, 0, 257151);
    }
}
