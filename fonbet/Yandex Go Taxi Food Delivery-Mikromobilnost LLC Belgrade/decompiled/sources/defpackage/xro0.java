package defpackage;

import com.yandex.go.scooters.analytics.ScootersRentContractAnalytics$ButtonName;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class xro0 {
    public final pho a;

    public xro0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(ScootersRentContractAnalytics$ButtonName scootersRentContractAnalytics$ButtonName, String str, Boolean bool) {
        HashMap hashMap = new HashMap();
        if (scootersRentContractAnalytics$ButtonName != null) {
            hashMap.put("button_name", scootersRentContractAnalytics$ButtonName.getEventValue());
        }
        if (str != null) {
            hashMap.put("onboarding_type", str);
        }
        if (bool != null) {
            hashMap.put(ClidProvider.STATE, bool);
        }
        this.a.a("ScootersRentContract.Tapped", hashMap, 1, new HashMap());
    }
}
