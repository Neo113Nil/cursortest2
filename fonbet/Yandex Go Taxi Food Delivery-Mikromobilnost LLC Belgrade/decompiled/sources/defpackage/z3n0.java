package defpackage;

import com.yandex.go.scooters.analytics.ScootersCancelRideDialogAnalytics$ButtonName;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class z3n0 {
    public final pho a;

    public z3n0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(ScootersCancelRideDialogAnalytics$ButtonName scootersCancelRideDialogAnalytics$ButtonName, String str, String str2) {
        HashMap hashMap = new HashMap();
        if (scootersCancelRideDialogAnalytics$ButtonName != null) {
            hashMap.put("button_name", scootersCancelRideDialogAnalytics$ButtonName.getEventValue());
        }
        if (str != null) {
            hashMap.put("order_id", str);
        }
        if (str2 != null) {
            hashMap.put("scooter_number", str2);
        }
        this.a.a("ScootersCancelRideDialog.Tapped", hashMap, 1, new HashMap());
    }
}
