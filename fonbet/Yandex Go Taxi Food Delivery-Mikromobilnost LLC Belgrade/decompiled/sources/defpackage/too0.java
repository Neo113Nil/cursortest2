package defpackage;

import com.yandex.go.scooters.analytics.ScootersQrCardAnalytics$ButtonName;
import com.yandex.go.scooters.analytics.ScootersQrCardAnalytics$QrState;
import com.yandex.go.scooters.qr.analytics.ScootersQrAnalytics$Button;
import com.yandex.go.scooters.qr.analytics.ScootersQrAnalytics$CloseReason;
import com.yandex.go.scooters.qr.analytics.ScootersQrAnalytics$State;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes13.dex */
public final class too0 {
    public final x770 a;
    public volatile ScootersQrAnalytics$State b;
    public volatile String c;
    public volatile ScootersQrAnalytics$CloseReason d;

    public too0(x770 x770Var) {
        this.a = x770Var;
    }

    public final void a(ScootersQrAnalytics$State scootersQrAnalytics$State, String str) {
        if (this.b == scootersQrAnalytics$State && jl40.l(this.c, str)) {
            return;
        }
        this.b = scootersQrAnalytics$State;
        this.c = str;
        x770 x770Var = this.a;
        ScootersQrCardAnalytics$QrState evgenValue = scootersQrAnalytics$State.getEvgenValue();
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        if (evgenValue != null) {
            hashMap.put(ClidProvider.STATE, evgenValue.getEventValue());
        }
        x770Var.a.a("ScootersQrCard.Shown", hashMap, 1, new HashMap());
    }

    public final void b(ScootersQrAnalytics$Button scootersQrAnalytics$Button) {
        x770 x770Var = this.a;
        ScootersQrCardAnalytics$ButtonName evgenValue = scootersQrAnalytics$Button.getEvgenValue();
        ScootersQrAnalytics$State scootersQrAnalytics$State = this.b;
        ScootersQrCardAnalytics$QrState evgenValue2 = scootersQrAnalytics$State != null ? scootersQrAnalytics$State.getEvgenValue() : null;
        String str = this.c;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        if (evgenValue != null) {
            hashMap.put("button_name", evgenValue.getEventValue());
        }
        if (str != null) {
            hashMap.put("open_reason", str);
        }
        if (evgenValue2 != null) {
            hashMap.put(ClidProvider.STATE, evgenValue2.getEventValue());
        }
        x770Var.a.a("ScootersQrCard.Tapped", hashMap, 1, new HashMap());
    }
}
