package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$OfferType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$PaymentType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class qio {
    public final uho a;
    public final EvgenDiagnostic$WebViewType b;

    public qio(uho uhoVar, EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType) {
        this.a = uhoVar;
        this.b = evgenDiagnostic$WebViewType;
    }

    public static EvgenDiagnostic$SubscriptionButtonType c(PlusPayButtonDiagnostic$ButtonType plusPayButtonDiagnostic$ButtonType) {
        int i = pio.a[plusPayButtonDiagnostic$ButtonType.ordinal()];
        if (i == 1) {
            return EvgenDiagnostic$SubscriptionButtonType.NativeSdk;
        }
        if (i == 2) {
            return EvgenDiagnostic$SubscriptionButtonType.NativeHost;
        }
        if (i == 3) {
            return EvgenDiagnostic$SubscriptionButtonType.Web;
        }
        w511.b();
        return null;
    }

    public static EvgenDiagnostic$SubscriptionPaymentType d(PlusPayButtonDiagnostic$PaymentType plusPayButtonDiagnostic$PaymentType) {
        int i = pio.b[plusPayButtonDiagnostic$PaymentType.ordinal()];
        if (i == 1) {
            return EvgenDiagnostic$SubscriptionPaymentType.Tarifficator;
        }
        if (i == 2) {
            return EvgenDiagnostic$SubscriptionPaymentType.OldPayment;
        }
        if (i == 3) {
            return EvgenDiagnostic$SubscriptionPaymentType.Host;
        }
        w511.b();
        return null;
    }

    public final void a(PlusPayButtonDiagnostic$ButtonType plusPayButtonDiagnostic$ButtonType, PlusPayButtonDiagnostic$PaymentType plusPayButtonDiagnostic$PaymentType, PlusPayButtonDiagnostic$OfferType plusPayButtonDiagnostic$OfferType, String str) {
        EvgenDiagnostic$SubscriptionOfferType evgenDiagnostic$SubscriptionOfferType;
        EvgenDiagnostic$SubscriptionButtonType c = c(plusPayButtonDiagnostic$ButtonType);
        EvgenDiagnostic$SubscriptionPaymentType d = d(plusPayButtonDiagnostic$PaymentType);
        int i = pio.c[plusPayButtonDiagnostic$OfferType.ordinal()];
        if (i == 1) {
            evgenDiagnostic$SubscriptionOfferType = EvgenDiagnostic$SubscriptionOfferType.InApp;
        } else if (i == 2) {
            evgenDiagnostic$SubscriptionOfferType = EvgenDiagnostic$SubscriptionOfferType.Native;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            evgenDiagnostic$SubscriptionOfferType = EvgenDiagnostic$SubscriptionOfferType.Unknown;
        }
        Map e = gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Reason: ".concat(str)));
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("additional_params", e);
        linkedHashMap.put("button_type", c.getEventValue());
        linkedHashMap.put("payment_type", d.getEventValue());
        linkedHashMap.put("offers_type", evgenDiagnostic$SubscriptionOfferType.getEventValue());
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.BuySubscription.Failed", linkedHashMap);
    }

    public final void b(PlusPayButtonDiagnostic$ButtonType plusPayButtonDiagnostic$ButtonType, PlusPayButtonDiagnostic$PaymentType plusPayButtonDiagnostic$PaymentType, String str) {
        EvgenDiagnostic$SubscriptionButtonType c = c(plusPayButtonDiagnostic$ButtonType);
        EvgenDiagnostic$SubscriptionPaymentType d = d(plusPayButtonDiagnostic$PaymentType);
        if (str == null) {
            str = "";
        }
        Map e = gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str));
        uho uhoVar = this.a;
        uhoVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("webview_type", this.b.getEventValue());
        linkedHashMap.put("additional_params", e);
        linkedHashMap.put("button_type", c.getEventValue());
        linkedHashMap.put("payment_type", d.getEventValue());
        linkedHashMap.put("_meta", uho.b(new HashMap()));
        uhoVar.c("Error.WebView.BuySubscription.Button.Loading.InvalidConfiguration", linkedHashMap);
    }
}
