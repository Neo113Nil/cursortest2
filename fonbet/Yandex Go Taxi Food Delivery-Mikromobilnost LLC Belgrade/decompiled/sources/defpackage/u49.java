package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public final class u49 implements t49 {
    public final hh5 a;

    public u49(hh5 hh5Var) {
        this.a = hh5Var;
    }

    public final qvz0 a(List list) {
        ServiceLevel.Branding branding;
        ServiceLevel.Branding.Tooltip tooltip;
        Object obj;
        ServiceLevel.Branding.Type type = ServiceLevel.Branding.Type.WALLET_PAYMENT;
        String str = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((ServiceLevel.Branding) obj).c == type) {
                    break;
                }
            }
            branding = (ServiceLevel.Branding) obj;
        } else {
            branding = null;
        }
        if (branding != null && (tooltip = branding.a) != null) {
            str = tooltip.a;
        }
        if (str == null) {
            str = "";
        }
        cne0 cne0Var = (cne0) this.a.b;
        boolean z = false;
        if (!cne0Var.g("ru.yandex.taxi.cashback.onboarding.CASHBACK_PAYMENT_AVAILABLE_SHOWED", false) && cne0Var.g("ru.yandex.taxi.cashback.onboarding.CASHBACK_FOR_TRIP_SHOWED", false) && str.length() > 0) {
            z = true;
        }
        return new qvz0(z, str);
    }
}
