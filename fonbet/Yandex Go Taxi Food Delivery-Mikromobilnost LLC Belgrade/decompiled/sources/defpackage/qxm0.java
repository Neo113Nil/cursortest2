package defpackage;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScooterPassesTappedButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersActivePassesOpenedFromScreen;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersActivePassesOpenedType;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersIgnitionButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersIgnitionControlPanelButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersLiveActivityTappedButtonName;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesOpenedFromScreen;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesOpenedType;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesTappedFromScreen;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersPassesTappedType;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final class qxm0 {
    public final pho a;

    public qxm0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(ScootersAnalytics$ScootersActivePassesOpenedType scootersAnalytics$ScootersActivePassesOpenedType, ScootersAnalytics$ScootersActivePassesOpenedFromScreen scootersAnalytics$ScootersActivePassesOpenedFromScreen, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", scootersAnalytics$ScootersActivePassesOpenedType.getEventValue());
        hashMap.put("from_screen", scootersAnalytics$ScootersActivePassesOpenedFromScreen.getEventValue());
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        this.a.a("Scooters.ActivePasses.Opened", hashMap, 2, new HashMap());
    }

    public final void b(ScootersAnalytics$ScootersIgnitionControlPanelButtonName scootersAnalytics$ScootersIgnitionControlPanelButtonName, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", scootersAnalytics$ScootersIgnitionControlPanelButtonName.getEventValue());
        if (str != null) {
            hashMap.put("banner_id", str);
        }
        this.a.a("Scooters.IgnitionControlPanel.Tapped", hashMap, 1, new HashMap());
    }

    public final void c(ScootersAnalytics$ScootersIgnitionButtonName scootersAnalytics$ScootersIgnitionButtonName) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", scootersAnalytics$ScootersIgnitionButtonName.getEventValue());
        this.a.a("Scooters.Ignition.Tapped", hashMap, 1, new HashMap());
    }

    public final void d(ScootersAnalytics$ScootersLiveActivityTappedButtonName scootersAnalytics$ScootersLiveActivityTappedButtonName) {
        HashMap hashMap = new HashMap();
        if (scootersAnalytics$ScootersLiveActivityTappedButtonName != null) {
            hashMap.put("button_name", scootersAnalytics$ScootersLiveActivityTappedButtonName.getEventValue());
        }
        this.a.a("Scooters.LiveActivity.Tapped", hashMap, 1, new HashMap());
    }

    public final void e(ScootersAnalytics$ScootersPassesOpenedType scootersAnalytics$ScootersPassesOpenedType, ScootersAnalytics$ScootersPassesOpenedFromScreen scootersAnalytics$ScootersPassesOpenedFromScreen, ArrayList arrayList, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", scootersAnalytics$ScootersPassesOpenedType.getEventValue());
        hashMap.put("from_screen", scootersAnalytics$ScootersPassesOpenedFromScreen.getEventValue());
        hashMap.put("passes", arrayList);
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        this.a.a("Scooters.Passes.Opened", hashMap, 2, new HashMap());
    }

    public final void f(ScootersAnalytics$ScootersPassesTappedType scootersAnalytics$ScootersPassesTappedType, ScootersAnalytics$ScootersPassesTappedFromScreen scootersAnalytics$ScootersPassesTappedFromScreen, ScootersAnalytics$ScooterPassesTappedButtonName scootersAnalytics$ScooterPassesTappedButtonName, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", scootersAnalytics$ScootersPassesTappedType.getEventValue());
        hashMap.put("from_screen", scootersAnalytics$ScootersPassesTappedFromScreen.getEventValue());
        hashMap.put("button_name", scootersAnalytics$ScooterPassesTappedButtonName.getEventValue());
        if (str != null) {
            hashMap.put("pass_id", str);
        }
        if (str2 != null) {
            hashMap.put("open_reason", str2);
        }
        this.a.a("Scooters.Passes.Tapped", hashMap, 2, new HashMap());
    }
}
