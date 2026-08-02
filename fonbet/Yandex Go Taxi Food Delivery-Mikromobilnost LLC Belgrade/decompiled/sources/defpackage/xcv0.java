package defpackage;

import com.yandex.div.state.db.StateEntry;
import com.yandex.go.summary.analytics.SummaryAnalytics$AddressPlacement;
import com.yandex.go.summary.analytics.SummaryAnalytics$LegacySummaryCardCloseMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryAction;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.HashMap;
import java.util.List;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class xcv0 {
    public final pho a;

    public xcv0(pho phoVar) {
        this.a = phoVar;
    }

    public final void a(SummaryAnalytics$SummaryExpandingState summaryAnalytics$SummaryExpandingState, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("summary_state", summaryAnalytics$SummaryExpandingState.getEventValue());
        hashMap.put("vertical_id", str);
        this.a.a("Summary.AddDestination.Tapped", hashMap, 1, new HashMap());
    }

    public final void b(SummaryAnalytics$SummaryCollapseReasonV2 summaryAnalytics$SummaryCollapseReasonV2, String str, String str2, List list) {
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, summaryAnalytics$SummaryCollapseReasonV2.getEventValue());
        hashMap.put("vertical_id", str);
        hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        if (list != null) {
            hashMap.put("selected_tariffs", list);
        }
        this.a.a("Summary.Card.Collapsed", hashMap, 3, new HashMap());
    }

    public final void c(SummaryAnalytics$SummaryExpandingState summaryAnalytics$SummaryExpandingState, SummaryAnalytics$AddressPlacement summaryAnalytics$AddressPlacement, SummaryAnalytics$SummaryAction summaryAnalytics$SummaryAction) {
        HashMap hashMap = new HashMap();
        hashMap.put("summary_expanding_state", summaryAnalytics$SummaryExpandingState.getEventValue());
        hashMap.put("address_placement", summaryAnalytics$AddressPlacement.getEventValue());
        hashMap.put("action", summaryAnalytics$SummaryAction.getEventValue());
        this.a.a("Summary.Destination.Tapped", hashMap, 1, new HashMap());
    }

    public final void d(SummaryAnalytics$SummaryExpandingState summaryAnalytics$SummaryExpandingState) {
        HashMap hashMap = new HashMap();
        hashMap.put("summary_state", summaryAnalytics$SummaryExpandingState.getEventValue());
        this.a.a("Summary.ManageRouteStops.Tapped", hashMap, 1, new HashMap());
    }

    public final void e(SummaryAnalytics$SummaryExpandingState summaryAnalytics$SummaryExpandingState, SummaryAnalytics$AddressPlacement summaryAnalytics$AddressPlacement) {
        HashMap hashMap = new HashMap();
        hashMap.put("summary_expanding_state", summaryAnalytics$SummaryExpandingState.getEventValue());
        hashMap.put("address_placement", summaryAnalytics$AddressPlacement.getEventValue());
        this.a.a("Summary.StartingPoint.Tapped", hashMap, 1, new HashMap());
    }

    public final void f(SummaryAnalytics$LegacySummaryCardCloseMethod summaryAnalytics$LegacySummaryCardCloseMethod, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("close_method", summaryAnalytics$LegacySummaryCardCloseMethod.getEventValue());
        hashMap.put("summary_state", str);
        this.a.a("Summary.SummaryCard.Closed", hashMap, 2, new HashMap());
    }

    public final void g(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(ClidProvider.STATE, str);
        }
        if (str2 != null) {
            hashMap.put("summary_state", str2);
        }
        this.a.a("Summary.SummaryCard.NextButtonTapped", hashMap, 2, new HashMap());
    }

    public final void h(String str, String str2, String str3, String str4, Boolean bool) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("meta_type", str);
        }
        if (str2 != null) {
            hashMap.put("offer_id", str2);
        }
        if (str3 != null) {
            hashMap.put(ClidProvider.STATE, str3);
        }
        if (str4 != null) {
            hashMap.put("summary_state", str4);
        }
        if (bool != null) {
            hashMap.put("switch_enabled", bool);
        }
        this.a.a("Summary.SummaryCard.PromoShown", hashMap, 1, new HashMap());
    }

    public final void i(String str, String str2, String str3, String str4, Boolean bool) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("meta_type", str);
        }
        if (str2 != null) {
            hashMap.put("offer_id", str2);
        }
        if (str3 != null) {
            hashMap.put(ClidProvider.STATE, str3);
        }
        if (str4 != null) {
            hashMap.put("summary_state", str4);
        }
        if (bool != null) {
            hashMap.put("switch_enabled", bool);
        }
        this.a.a("Summary.SummaryCard.PromoTapped", hashMap, 1, new HashMap());
    }

    public final void j(String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap u = g8e.u("button_name", str, PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2);
        if (str3 != null) {
            u.put("button_title", str3);
        }
        if (str4 != null) {
            u.put("button_subtitle", str4);
        }
        if (str5 != null) {
            u.put(AuthSdkActivity.RESPONSE_TYPE_CODE, str5);
        }
        if (str6 != null) {
            u.put(StateEntry.COLUMN_PATH, str6);
        }
        this.a.a("Summary.SummaryCard.Tapped", u, 1, new HashMap());
    }

    public final void k(String str, String str2) {
        this.a.a("Summary.SummaryCard.TariffSwipe", g8e.u("tariff_class", str, "summary_state", str2), 1, new HashMap());
    }

    public final void l(String str) {
        this.a.a("Summary.SurgeComplaintModalCard.Closed", x4e.p("dismiss_type", str), 1, new HashMap());
    }
}
