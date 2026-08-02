package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanCloseReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanOpenReason;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersQrScanState;
import java.util.HashMap;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes12.dex */
public final class zna {
    public final em9 a;
    public final ChargersAnalytics$ChargersQrScanOpenReason b;
    public volatile ChargersAnalytics$ChargersQrScanState c;
    public volatile ChargersAnalytics$ChargersQrScanCloseReason d;

    public zna(em9 em9Var, ChargersAnalytics$ChargersQrScanOpenReason chargersAnalytics$ChargersQrScanOpenReason) {
        this.a = em9Var;
        this.b = chargersAnalytics$ChargersQrScanOpenReason;
    }

    public final void a(ChargersAnalytics$ChargersQrScanState chargersAnalytics$ChargersQrScanState) {
        if (this.c == chargersAnalytics$ChargersQrScanState) {
            return;
        }
        this.c = chargersAnalytics$ChargersQrScanState;
        em9 em9Var = this.a;
        ChargersAnalytics$ChargersQrScanOpenReason chargersAnalytics$ChargersQrScanOpenReason = this.b;
        HashMap w = b64.w(em9Var);
        if (chargersAnalytics$ChargersQrScanState != null) {
            w.put(ClidProvider.STATE, chargersAnalytics$ChargersQrScanState.getEventValue());
        }
        w.put("open_reason", chargersAnalytics$ChargersQrScanOpenReason.getEventValue());
        em9Var.a.a("Chargers.QrScan.Shown", w, 1, new HashMap());
    }

    public final void b(ChargersAnalytics$ChargersQrScanButtonName chargersAnalytics$ChargersQrScanButtonName) {
        em9 em9Var = this.a;
        ChargersAnalytics$ChargersQrScanState chargersAnalytics$ChargersQrScanState = this.c;
        HashMap w = b64.w(em9Var);
        if (chargersAnalytics$ChargersQrScanState != null) {
            w.put(ClidProvider.STATE, chargersAnalytics$ChargersQrScanState.getEventValue());
        }
        w.put("button_name", chargersAnalytics$ChargersQrScanButtonName.getEventValue());
        em9Var.a.a("Chargers.QrScan.Tapped", w, 1, new HashMap());
    }
}
