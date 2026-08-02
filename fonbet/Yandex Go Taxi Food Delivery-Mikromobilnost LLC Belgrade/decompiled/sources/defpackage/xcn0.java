package defpackage;

import com.yandex.go.scooters.analytics.ScootersDebtAnalytics$CloseReason;
import com.yandex.go.scooters.analytics.ScootersDebtAnalytics$DebtState;
import com.yandex.go.scooters.analytics.ScootersDebtAnalytics$TappedButton;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class xcn0 {
    public final pho a;

    public xcn0(pho phoVar) {
        this.a = phoVar;
    }

    public static void a(xcn0 xcn0Var, ScootersDebtAnalytics$CloseReason scootersDebtAnalytics$CloseReason, ScootersDebtAnalytics$DebtState scootersDebtAnalytics$DebtState) {
        xcn0Var.getClass();
        HashMap hashMap = new HashMap();
        if (scootersDebtAnalytics$CloseReason != null) {
            hashMap.put("close_reason", scootersDebtAnalytics$CloseReason.getEventValue());
        }
        if (scootersDebtAnalytics$DebtState != null) {
            hashMap.put(ClidProvider.STATE, scootersDebtAnalytics$DebtState.getEventValue());
        }
        xcn0Var.a.a("ScootersDebt.Closed", hashMap, 1, new HashMap());
    }

    public static void b(xcn0 xcn0Var, ScootersDebtAnalytics$TappedButton scootersDebtAnalytics$TappedButton, ScootersDebtAnalytics$DebtState scootersDebtAnalytics$DebtState) {
        xcn0Var.getClass();
        HashMap hashMap = new HashMap();
        if (scootersDebtAnalytics$TappedButton != null) {
            hashMap.put("button_name", scootersDebtAnalytics$TappedButton.getEventValue());
        }
        if (scootersDebtAnalytics$DebtState != null) {
            hashMap.put(ClidProvider.STATE, scootersDebtAnalytics$DebtState.getEventValue());
        }
        xcn0Var.a.a("ScootersDebt.Tapped", hashMap, 1, new HashMap());
    }
}
