package defpackage;

import com.yandex.go.scooters.analytics.ScootersDepositCardAnalytics$CloseReason;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class sdn0 {
    public final pho a;

    public sdn0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(ScootersDepositCardAnalytics$CloseReason scootersDepositCardAnalytics$CloseReason) {
        HashMap hashMap = new HashMap();
        if (scootersDepositCardAnalytics$CloseReason != null) {
            hashMap.put("close_reason", scootersDepositCardAnalytics$CloseReason.getEventValue());
        }
        this.a.a("ScootersDepositCard.Closed", hashMap, 1, new HashMap());
    }
}
