package defpackage;

import com.yandex.go.scooters.analytics.ScootersAlertAnalytics$ScootersAlertTappedButtonName;
import com.yandex.go.scooters.analytics.ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogAnalyticsState;
import com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogAnalytics$TappedButton;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class rjn0 {
    public final co40 a;
    public final u8w b;

    public rjn0(co40 co40Var, u8w u8wVar) {
        this.a = co40Var;
        this.b = u8wVar;
    }

    public final void a(ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState, List list, ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton, String str) {
        if (scootersErrorDialogAnalyticsState != ScootersErrorDialogAnalyticsState.BLE_ATTEMPT_FAILURE) {
            b(scootersErrorDialogAnalyticsState != null ? scootersErrorDialogAnalyticsState.getState() : null, list, scootersErrorDialogAnalytics$TappedButton, str);
            return;
        }
        ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName bluetoothButtonName = scootersErrorDialogAnalytics$TappedButton.getBluetoothButtonName();
        if (list == null) {
            list = EmptyList.a;
        }
        this.b.d(bluetoothButtonName, list, scootersErrorDialogAnalyticsState.getState(), str);
    }

    public final void b(String str, List list, ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton, String str2) {
        ScootersAlertAnalytics$ScootersAlertTappedButtonName alertButtonName = scootersErrorDialogAnalytics$TappedButton.getAlertButtonName();
        if (list == null) {
            list = EmptyList.a;
        }
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", alertButtonName.getEventValue());
        hashMap.put("scooter_numbers", list);
        if (str != null) {
            hashMap.put(ClidProvider.STATE, str);
        }
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        co40Var.a.a("ScootersAlert.Tapped", hashMap, 1, new HashMap());
    }

    public final void c(ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState, List list, String str) {
        ScootersErrorDialogAnalyticsState scootersErrorDialogAnalyticsState2 = ScootersErrorDialogAnalyticsState.BLE_ATTEMPT_FAILURE;
        EmptyList emptyList = EmptyList.a;
        if (scootersErrorDialogAnalyticsState == scootersErrorDialogAnalyticsState2) {
            if (list == null) {
                list = emptyList;
            }
            this.b.c(scootersErrorDialogAnalyticsState.getState(), str, list);
            return;
        }
        if (list == null) {
            list = emptyList;
        }
        String state = scootersErrorDialogAnalyticsState != null ? scootersErrorDialogAnalyticsState.getState() : null;
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", "button");
        hashMap.put("scooter_numbers", list);
        if (state != null) {
            hashMap.put(ClidProvider.STATE, state);
        }
        if (str != null) {
            hashMap.put("order_id", str);
        }
        co40Var.a.a("ScootersAlert.Closed", hashMap, 1, new HashMap());
    }
}
