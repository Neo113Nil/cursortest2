package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.c;
import com.ybsdk.widgets.common.d;

/* loaded from: classes3.dex */
public final class rps implements ev31 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        YbButtonView.a aVar;
        cps cpsVar = (cps) obj;
        bps bpsVar = cpsVar.c;
        aps apsVar = cpsVar.d;
        zos zosVar = cpsVar.b;
        if (zosVar != null) {
            return new pps(new d(zosVar.a, zosVar.b, true));
        }
        if (apsVar == null) {
            if (bpsVar == null) {
                return new ops(r501.a(cpsVar.a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            }
            return new lps(new c(bpsVar.a, bpsVar.b, new bks(bpsVar.c, null, 6), true, new YbButtonViewGroup.b(null, new YbButtonView.a(bpsVar.d.a, null, null, null, null, null, null, false, false, null, 4094), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 13)));
        }
        Text.Constant constant = apsVar.a;
        Text.Constant constant2 = apsVar.b;
        rr51 rr51Var = apsVar.c;
        YbButtonView.a aVar2 = new YbButtonView.a(apsVar.d.a, null, null, null, null, null, null, false, false, null, 4094);
        ms msVar = apsVar.e;
        if (msVar != null) {
            aVar = new YbButtonView.a(msVar.a, null, null, null, null, null, null, false, false, null, 4094);
        } else {
            aVar = null;
        }
        return new mps(constant, constant2, new YbButtonViewGroup.b(null, aVar2, aVar, null, 9), rr51Var, apsVar.f);
    }
}
