package defpackage;

import android.telephony.TelephonyManager;
import java.util.regex.Pattern;
import ru.yandex.taxi.h;

/* loaded from: classes9.dex */
public final class y810 {
    public final h a;

    public y810(h hVar) {
        this.a = hVar;
    }

    public final String a() {
        h hVar = this.a;
        TelephonyManager telephonyManager = (TelephonyManager) hVar.a.getSystemService(TelephonyManager.class);
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        if (networkOperator == null || !Pattern.matches("^\\d{3}.*", networkOperator)) {
            return "-1";
        }
        TelephonyManager telephonyManager2 = (TelephonyManager) hVar.a.getSystemService(TelephonyManager.class);
        return (telephonyManager2 != null ? telephonyManager2.getPhoneType() : 0) == 2 ? "-1" : networkOperator.substring(0, 3);
    }
}
