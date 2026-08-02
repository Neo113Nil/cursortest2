package defpackage;

import com.yandex.go.loyalty.impl.analytics.LoyaltyProgramAnalytics$LoyaltyAction;
import com.yandex.go.scooters.analytics.ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName;
import java.util.HashMap;
import java.util.List;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.analytics.LiveLocationModalAnalytics$ButtonType;

/* loaded from: classes12.dex */
public final class u8w {
    public final pho a;

    public /* synthetic */ u8w(pho phoVar) {
        this.a = phoVar;
    }

    public void a(boolean z, LiveLocationModalAnalytics$ButtonType liveLocationModalAnalytics$ButtonType) {
        HashMap hashMap = new HashMap();
        hashMap.put(MetaDataField.SCREEN_FIELD, z ? "turn_on" : "turn_off");
        hashMap.put("button_type", liveLocationModalAnalytics$ButtonType.getValue());
        this.a.a("LiveLocationModal.ButtonTap", hashMap, 1, new HashMap());
    }

    public void b(String str, LoyaltyProgramAnalytics$LoyaltyAction loyaltyProgramAnalytics$LoyaltyAction, String str2) {
        HashMap p = x4e.p("loyalty_program", str);
        p.put("loyalty_action", loyaltyProgramAnalytics$LoyaltyAction.getEventValue());
        p.put("loyalty_balance", str2);
        this.a.a("LoyaltyProgram.LoyaltyScreen.Tapped", p, 1, new HashMap());
    }

    public void c(String str, String str2, List list) {
        HashMap p = x4e.p("close_reason", "button");
        if (list != null) {
            p.put("scooter_numbers", list);
        }
        if (str != null) {
            p.put(ClidProvider.STATE, str);
        }
        if (str2 != null) {
            p.put("order_id", str2);
        }
        this.a.a("ScootersBluetoothAuthDialog.Closed", p, 1, new HashMap());
    }

    public void d(ScootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName, List list, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", scootersBluetoothAuthDialogAnalytics$ScootersBluetoothAuthDialogTappedButtonName.getEventValue());
        if (list != null) {
            hashMap.put("scooter_numbers", list);
        }
        if (str != null) {
            hashMap.put(ClidProvider.STATE, str);
        }
        if (str2 != null) {
            hashMap.put("order_id", str2);
        }
        this.a.a("ScootersBluetoothAuthDialog.Tapped", hashMap, 1, new HashMap());
    }
}
