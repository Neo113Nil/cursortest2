package defpackage;

import com.yandex.go.scooters.insurance.analytics.InsuranceButton;
import com.yandex.go.scooters.insurance.analytics.InsuranceCloseReason;
import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.insurance.analytics.InsuranceScreen;
import com.yandex.go.scooters.insurance.model.ScootersInsuranceControl;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes13.dex */
public final class zsn0 {
    public final co40 a;

    public zsn0(co40 co40Var) {
        this.a = co40Var;
    }

    public final void a(InsuranceCloseReason insuranceCloseReason, ScootersInsuranceControl scootersInsuranceControl, String str, InsuranceScreen insuranceScreen) {
        String analyticsName = insuranceCloseReason.getAnalyticsName();
        String analyticsName2 = scootersInsuranceControl.getAnalyticsName();
        String analyticsName3 = insuranceScreen.getAnalyticsName();
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("close_reason", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("control_type", analyticsName2);
        }
        if (str != null) {
            hashMap.put("description_key", str);
        }
        if (analyticsName3 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, analyticsName3);
        }
        co40Var.a.a("ScootersInsurance.Closed", hashMap, 1, new HashMap());
    }

    public final void b(InsuranceOpenReason insuranceOpenReason, ScootersInsuranceControl scootersInsuranceControl, String str, InsuranceScreen insuranceScreen) {
        String analyticsName = insuranceOpenReason.getAnalyticsName();
        String analyticsName2 = scootersInsuranceControl.getAnalyticsName();
        String analyticsName3 = insuranceScreen.getAnalyticsName();
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName2 != null) {
            hashMap.put("control_type", analyticsName2);
        }
        if (str != null) {
            hashMap.put("description_key", str);
        }
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        if (analyticsName3 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, analyticsName3);
        }
        co40Var.a.a("ScootersInsurance.Shown", hashMap, 1, new HashMap());
    }

    public final void c(InsuranceButton insuranceButton, ScootersInsuranceControl scootersInsuranceControl, String str, InsuranceScreen insuranceScreen) {
        String analyticsName = insuranceButton.getAnalyticsName();
        String analyticsName2 = scootersInsuranceControl.getAnalyticsName();
        String analyticsName3 = insuranceScreen.getAnalyticsName();
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("button_name", analyticsName);
        }
        if (analyticsName2 != null) {
            hashMap.put("control_type", analyticsName2);
        }
        if (str != null) {
            hashMap.put("description_key", str);
        }
        if (analyticsName3 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, analyticsName3);
        }
        co40Var.a.a("ScootersInsurance.Tapped", hashMap, 1, new HashMap());
    }
}
