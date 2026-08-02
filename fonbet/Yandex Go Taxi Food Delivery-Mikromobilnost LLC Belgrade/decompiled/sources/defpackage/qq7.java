package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.ResultCommon;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardLimitSettingScreenLoadResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardLimitSettingScreenSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenFreezeResultProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenFreezeResultResult;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedStatus;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenLoadedType;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenUnfreezeResultProductId;
import com.ybsdk.core.analytics.generated.delegates.CardMainScreenEvents$CardMainScreenUnfreezeResultResult;
import com.ybsdk.core.analytics.generated.delegates.HomeScreenEvents$HomeScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesProvidersLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesSuccessScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesSuccessScreenShownResult;
import java.util.LinkedHashMap;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class qq7 {
    public final a a;

    public /* synthetic */ qq7(a aVar) {
        this.a = aVar;
    }

    public static void a(qq7 qq7Var, String str, String str2, CardMainScreenEvents$CardLimitSettingScreenLoadResultResult cardMainScreenEvents$CardLimitSettingScreenLoadResultResult, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        if (str != null) {
            linkedHashMap.put("selected_limit", str);
        }
        if (str2 != null) {
            linkedHashMap.put("amount", str2);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardMainScreenEvents$CardLimitSettingScreenLoadResultResult.getOriginalValue());
        if (str3 != null) {
            linkedHashMap.put("error", str3);
        }
        qq7Var.a.a("card.limit_setting_screen.load.result", linkedHashMap);
    }

    public static void b(qq7 qq7Var, String str, String str2, CardMainScreenEvents$CardLimitSettingScreenSaveResultResult cardMainScreenEvents$CardLimitSettingScreenSaveResultResult, String str3, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        if (str != null) {
            linkedHashMap.put("selected_limit", str);
        }
        if (str2 != null) {
            linkedHashMap.put("amount", str2);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardMainScreenEvents$CardLimitSettingScreenSaveResultResult.getOriginalValue());
        if (str3 != null) {
            linkedHashMap.put("error", str3);
        }
        qq7Var.a.a("card.limit_setting_screen.save.result", linkedHashMap);
    }

    public static void d(qq7 qq7Var, CardMainScreenEvents$CardMainScreenLoadedResult cardMainScreenEvents$CardMainScreenLoadedResult, String str, CardMainScreenEvents$CardMainScreenLoadedProductId cardMainScreenEvents$CardMainScreenLoadedProductId, CardMainScreenEvents$CardMainScreenLoadedStatus cardMainScreenEvents$CardMainScreenLoadedStatus, CardMainScreenEvents$CardMainScreenLoadedType cardMainScreenEvents$CardMainScreenLoadedType, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            cardMainScreenEvents$CardMainScreenLoadedProductId = null;
        }
        if ((i & 8) != 0) {
            cardMainScreenEvents$CardMainScreenLoadedStatus = null;
        }
        if ((i & 16) != 0) {
            cardMainScreenEvents$CardMainScreenLoadedType = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardMainScreenEvents$CardMainScreenLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (cardMainScreenEvents$CardMainScreenLoadedProductId != null) {
            linkedHashMap.put("product_id", cardMainScreenEvents$CardMainScreenLoadedProductId.getOriginalValue());
        }
        if (cardMainScreenEvents$CardMainScreenLoadedStatus != null) {
            linkedHashMap.put(ACSPConstants.STATUS, cardMainScreenEvents$CardMainScreenLoadedStatus.getOriginalValue());
        }
        if (cardMainScreenEvents$CardMainScreenLoadedType != null) {
            linkedHashMap.put("type", cardMainScreenEvents$CardMainScreenLoadedType.getOriginalValue());
        }
        qq7Var.a.a("card.main_screen.loaded", linkedHashMap);
    }

    public static void l(qq7 qq7Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (str2 != null) {
            linkedHashMap.put("settings", str2);
        }
        qq7Var.a.a("settings.loaded", linkedHashMap);
    }

    public void c(CardMainScreenEvents$CardMainScreenFreezeResultProductId cardMainScreenEvents$CardMainScreenFreezeResultProductId, CardMainScreenEvents$CardMainScreenFreezeResultResult cardMainScreenEvents$CardMainScreenFreezeResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("product_id", cardMainScreenEvents$CardMainScreenFreezeResultProductId.getOriginalValue());
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardMainScreenEvents$CardMainScreenFreezeResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.main_screen.freeze.result", linkedHashMap);
    }

    public void e(CardMainScreenEvents$CardMainScreenUnfreezeResultProductId cardMainScreenEvents$CardMainScreenUnfreezeResultProductId, CardMainScreenEvents$CardMainScreenUnfreezeResultResult cardMainScreenEvents$CardMainScreenUnfreezeResultResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put("product_id", cardMainScreenEvents$CardMainScreenUnfreezeResultProductId.getOriginalValue());
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cardMainScreenEvents$CardMainScreenUnfreezeResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("card.main_screen.unfreeze.result", linkedHashMap);
    }

    public void f(String str, HomeScreenEvents$HomeScreenLoadedResult homeScreenEvents$HomeScreenLoadedResult, String str2) {
        LinkedHashMap w = g8e.w(4, "load_type", str);
        w.put(TarifficatorScenarioActivity.RESULT_KEY, homeScreenEvents$HomeScreenLoadedResult.getOriginalValue());
        if (str2 != null) {
            w.put("error", str2);
        }
        this.a.a("home_screen.loaded", w);
    }

    public void g(MobileServicesEvents$PaymentMobileServicesProvidersLoadedResult mobileServicesEvents$PaymentMobileServicesProvidersLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, mobileServicesEvents$PaymentMobileServicesProvidersLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("payment.mobile_services.providers_loaded", linkedHashMap);
    }

    public void h(MobileServicesEvents$PaymentMobileServicesSuccessScreenLoadedResult mobileServicesEvents$PaymentMobileServicesSuccessScreenLoadedResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, mobileServicesEvents$PaymentMobileServicesSuccessScreenLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (str2 != null) {
            linkedHashMap.put("transfer_id", str2);
        }
        this.a.a("payment.mobile_services.success_screen_loaded", linkedHashMap);
    }

    public void i(MobileServicesEvents$PaymentMobileServicesSuccessScreenShownResult mobileServicesEvents$PaymentMobileServicesSuccessScreenShownResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, mobileServicesEvents$PaymentMobileServicesSuccessScreenShownResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("cashback", str);
        }
        if (str2 != null) {
            linkedHashMap.put("transfer_id", str2);
        }
        this.a.a("payment.mobile_services.success_screen_shown", linkedHashMap);
    }

    public void j(ResultCommon resultCommon, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, resultCommon.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("qr_resolver.load_rules.result", linkedHashMap);
    }

    public void k(String str, ResultCommon resultCommon, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        if (str != null) {
            linkedHashMap.put("details", str);
        }
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, resultCommon.getOriginalValue());
        if (str2 != null) {
            linkedHashMap.put("error", str2);
        }
        this.a.a("qr_resolver.resolve", linkedHashMap);
    }
}
