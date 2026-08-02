package defpackage;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class u310 {
    public final n310 a;

    public u310(n310 n310Var) {
        this.a = n310Var;
    }

    public final void a(String str) {
        n310 n310Var = this.a;
        n310Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("request_id", str);
        }
        n310Var.a.a("MasstransitPayment.BleVehicles.UUIDsRequestFailed", hashMap, 1, new HashMap());
    }
}
