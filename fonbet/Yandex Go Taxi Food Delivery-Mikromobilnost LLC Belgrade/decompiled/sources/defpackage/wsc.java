package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.communications.modal.analytics.CommunicationModalAnalyticsData$CloseReason;

/* loaded from: classes5.dex */
public final class wsc {
    public final xcv0 a;
    public final g8k0 b;

    public wsc(xcv0 xcv0Var, g8k0 g8k0Var) {
        this.a = xcv0Var;
        this.b = g8k0Var;
    }

    public final void a(sob1 sob1Var, String str) {
        if (!(sob1Var instanceof vsc)) {
            if (!(sob1Var instanceof usc)) {
                w511.b();
                return;
            }
            usc uscVar = (usc) sob1Var;
            x4e.B(this.b.a.a, "Ride.Modal.ActionButton.Tap", b.h(new Pair("type", uscVar.a), new Pair("modal_type", uscVar.b.getAnalyticsName()), new Pair("order_id", uscVar.c), new Pair("open_reason", uscVar.d.getAnalyticsName()), new Pair("button_action", str)), 1);
            return;
        }
        vsc vscVar = (vsc) sob1Var;
        String str2 = vscVar.a;
        String analyticsName = vscVar.b.getAnalyticsName();
        String str3 = vscVar.c;
        String str4 = vscVar.d;
        String str5 = vscVar.f;
        String str6 = vscVar.e;
        xcv0 xcv0Var = this.a;
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("id", str2);
        hashMap.put("modal_type", analyticsName);
        hashMap.put("tariff_class", str3);
        hashMap.put("vertical_id", str4);
        if (str6 != null) {
            hashMap.put("alt_type", str6);
        }
        xcv0Var.a.a("Summary.Promo.Modal.ActionButton.Tap", hashMap, 1, x4e.q(hashMap, "offer_id", str5, "button_action", str));
    }

    public final void b(sob1 sob1Var, CommunicationModalAnalyticsData$CloseReason communicationModalAnalyticsData$CloseReason) {
        if (!(sob1Var instanceof vsc)) {
            if (!(sob1Var instanceof usc)) {
                w511.b();
                return;
            }
            usc uscVar = (usc) sob1Var;
            x4e.B(this.b.a.a, "Ride.Modal.Closed", b.h(new Pair("type", uscVar.a), new Pair("modal_type", uscVar.b.getAnalyticsName()), new Pair("order_id", uscVar.c), new Pair("open_reason", uscVar.d.getAnalyticsName()), new Pair("close_reason", communicationModalAnalyticsData$CloseReason.getAnalyticsName())), 1);
            return;
        }
        vsc vscVar = (vsc) sob1Var;
        String str = vscVar.a;
        String analyticsName = vscVar.b.getAnalyticsName();
        String str2 = vscVar.c;
        String str3 = vscVar.d;
        String str4 = vscVar.f;
        String analyticsName2 = communicationModalAnalyticsData$CloseReason.getAnalyticsName();
        String str5 = vscVar.e;
        xcv0 xcv0Var = this.a;
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        hashMap.put("modal_type", analyticsName);
        hashMap.put("tariff_class", str2);
        hashMap.put("vertical_id", str3);
        if (str5 != null) {
            hashMap.put("alt_type", str5);
        }
        xcv0Var.a.a("Summary.Promo.Modal.Closed", hashMap, 1, x4e.q(hashMap, "offer_id", str4, "close_reason", analyticsName2));
    }

    public final void c(sob1 sob1Var) {
        if (!(sob1Var instanceof vsc)) {
            if (!(sob1Var instanceof usc)) {
                w511.b();
                return;
            }
            usc uscVar = (usc) sob1Var;
            x4e.B(this.b.a.a, "Ride.Modal.Shown", b.h(new Pair("type", uscVar.a), new Pair("modal_type", uscVar.b.getAnalyticsName()), new Pair("order_id", uscVar.c), new Pair("open_reason", uscVar.d.getAnalyticsName())), 1);
            return;
        }
        vsc vscVar = (vsc) sob1Var;
        String str = vscVar.a;
        String analyticsName = vscVar.b.getAnalyticsName();
        String str2 = vscVar.c;
        String str3 = vscVar.d;
        String str4 = vscVar.f;
        String str5 = vscVar.e;
        xcv0 xcv0Var = this.a;
        xcv0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        hashMap.put("modal_type", analyticsName);
        hashMap.put("tariff_class", str2);
        hashMap.put("vertical_id", str3);
        if (str5 != null) {
            hashMap.put("alt_type", str5);
        }
        xcv0Var.a.a("Summary.Promo.Modal.Shown", hashMap, 1, tse0.r("offer_id", hashMap, str4));
    }
}
