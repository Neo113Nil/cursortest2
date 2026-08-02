package defpackage;

import com.yandex.go.scooters.analytics.ScootersDiscoveryAnalytics$ButtonName;
import com.yandex.go.scooters.discovery.ScootersDiscoveryAnalytics$TappedButton;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class xhn0 {
    public final co40 a;
    public final pxm0 b;

    public xhn0(co40 co40Var, pxm0 pxm0Var) {
        this.a = co40Var;
        this.b = pxm0Var;
    }

    public final void a(ScootersDiscoveryAnalytics$TappedButton scootersDiscoveryAnalytics$TappedButton) {
        ScootersDiscoveryAnalytics$ButtonName evgenValue = scootersDiscoveryAnalytics$TappedButton.getEvgenValue();
        pxm0 pxm0Var = this.b;
        String str = pxm0Var != null ? pxm0Var.b : null;
        String str2 = pxm0Var != null ? pxm0Var.a : null;
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (evgenValue != null) {
            hashMap.put("button_name", evgenValue.getEventValue());
        }
        if (str2 != null) {
            hashMap.put("from_screen", str2);
        }
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        co40Var.a.a("ScootersDiscovery.Tapped", hashMap, 1, new HashMap());
    }
}
