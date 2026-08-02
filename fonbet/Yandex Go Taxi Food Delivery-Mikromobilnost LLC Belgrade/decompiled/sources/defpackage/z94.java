package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.a;
import com.ybsdk.core.analytics.generated.AutoTopupSettingsResultTypeAutotopup;
import com.ybsdk.core.analytics.generated.TemplatePaymentTypeTransfers;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsBackSaveVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedUserType;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsResultScreenActionResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsResultScreenShownResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveInitiatedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveLoadedVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveResultResult;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsSaveResultVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsShortCutLimitsChangeVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion;
import com.ybsdk.core.analytics.generated.delegates.AutotopupEvents$AutoTopupSettingsValidationErrorVersion;
import com.ybsdk.core.analytics.generated.delegates.CashbackEvents$CashbackCategoriesSubmittedResult;
import com.ybsdk.core.analytics.generated.delegates.CashbackEvents$CashbackGetPromoResultResult;
import com.ybsdk.core.analytics.generated.delegates.CreditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.DeeplinkEvents$DeeplinkNetworkRequestMarkEventReadResult;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenBankSearchResult;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme;
import com.ybsdk.core.analytics.generated.delegates.LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationPhoneCheckLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationPhoneConfirmationCodeCheckResult;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationResultResult;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsLoadedStateRounding;
import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsSureDeactivateButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.TemplateTransferEvents$TemplateTransferLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupPaymentResultError;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupPaymentResultResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes8.dex */
public final class z94 {
    public final a a;

    public /* synthetic */ z94(a aVar) {
        this.a = aVar;
    }

    public static void b(z94 z94Var, AutotopupEvents$AutoTopupSettingsLoadedResult autotopupEvents$AutoTopupSettingsLoadedResult, String str, String str2, String str3, Map map, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AutotopupEvents$AutoTopupSettingsLoadedUserType autotopupEvents$AutoTopupSettingsLoadedUserType, AutotopupEvents$AutoTopupSettingsLoadedVersion autotopupEvents$AutoTopupSettingsLoadedVersion, int i) {
        String str11 = (i & 4) != 0 ? null : str2;
        String str12 = (i & 8) != 0 ? null : str3;
        Map map2 = (i & 16) != 0 ? null : map;
        Integer num2 = (i & 32) != 0 ? null : num;
        String str13 = (i & 64) != 0 ? null : str4;
        String str14 = (i & 256) != 0 ? null : str6;
        String str15 = (i & 512) != 0 ? null : str7;
        String str16 = (i & 1024) != 0 ? null : str8;
        String str17 = (i & 2048) != 0 ? null : str9;
        String str18 = (i & 4096) != 0 ? null : str10;
        AutotopupEvents$AutoTopupSettingsLoadedUserType autotopupEvents$AutoTopupSettingsLoadedUserType2 = (i & 8192) == 0 ? autotopupEvents$AutoTopupSettingsLoadedUserType : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(15);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, autotopupEvents$AutoTopupSettingsLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (str11 != null) {
            linkedHashMap.put("amount", str11);
        }
        if (str12 != null) {
            linkedHashMap.put("threshold", str12);
        }
        if (map2 != null) {
            linkedHashMap.put("payment_method", map2);
        }
        if (num2 != null) {
            linkedHashMap.put("autotopup_type", num2);
        }
        if (str13 != null) {
            linkedHashMap.put("moment_of_payment", str13);
        }
        if (str5 != null) {
            linkedHashMap.put("source", str5);
        }
        if (str14 != null) {
            linkedHashMap.put("amount_moment_of_payment", str14);
        }
        if (str15 != null) {
            linkedHashMap.put("amount_topup", str15);
        }
        if (str16 != null) {
            linkedHashMap.put("threshold_topup", str16);
        }
        if (str17 != null) {
            linkedHashMap.put("autofund", str17);
        }
        if (str18 != null) {
            linkedHashMap.put("autotopup", str18);
        }
        if (autotopupEvents$AutoTopupSettingsLoadedUserType2 != null) {
            linkedHashMap.put("user_type", autotopupEvents$AutoTopupSettingsLoadedUserType2.getOriginalValue());
        }
        linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsLoadedVersion.getOriginalValue());
        z94Var.a.a("auto_topup.settings.loaded", linkedHashMap);
    }

    public static void e(z94 z94Var, String str, String str2, Map map, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, AutotopupEvents$AutoTopupSettingsSaveInitiatedVersion autotopupEvents$AutoTopupSettingsSaveInitiatedVersion, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        if ((i & 256) != 0) {
            str7 = null;
        }
        if ((i & 512) != 0) {
            str8 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(11);
        if (str != null) {
            linkedHashMap.put("amount", str);
        }
        if (str2 != null) {
            linkedHashMap.put("threshold", str2);
        }
        linkedHashMap.put("payment_method", map);
        if (num != null) {
            linkedHashMap.put("autotopup_type", num);
        }
        if (str3 != null) {
            linkedHashMap.put("moment_of_payment", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("amount_moment_of_payment", str4);
        }
        if (str5 != null) {
            linkedHashMap.put("amount_topup", str5);
        }
        if (str6 != null) {
            linkedHashMap.put("threshold_topup", str6);
        }
        if (str7 != null) {
            linkedHashMap.put("autofund", str7);
        }
        if (str8 != null) {
            linkedHashMap.put("autotopup", str8);
        }
        linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsSaveInitiatedVersion.getOriginalValue());
        z94Var.a.a("auto_topup.settings.save.initiated", linkedHashMap);
    }

    public static void f(z94 z94Var, AutotopupEvents$AutoTopupSettingsSaveLoadedResult autotopupEvents$AutoTopupSettingsSaveLoadedResult, String str, String str2, String str3, Map map, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, AutotopupEvents$AutoTopupSettingsSaveLoadedVersion autotopupEvents$AutoTopupSettingsSaveLoadedVersion, int i) {
        String str10 = (i & 2) != 0 ? null : str;
        String str11 = (i & 4) != 0 ? null : str2;
        String str12 = (i & 8) != 0 ? null : str3;
        Map map2 = (i & 16) != 0 ? null : map;
        Integer num2 = (i & 32) != 0 ? null : num;
        String str13 = (i & 64) != 0 ? null : str4;
        String str14 = (i & 128) != 0 ? null : str5;
        String str15 = (i & 256) != 0 ? null : str6;
        String str16 = (i & 512) != 0 ? null : str7;
        String str17 = (i & 1024) != 0 ? null : str8;
        String str18 = (i & 2048) == 0 ? str9 : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(13);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, autotopupEvents$AutoTopupSettingsSaveLoadedResult.getOriginalValue());
        if (str10 != null) {
            linkedHashMap.put("error", str10);
        }
        if (str11 != null) {
            linkedHashMap.put("amount", str11);
        }
        if (str12 != null) {
            linkedHashMap.put("threshold", str12);
        }
        if (map2 != null) {
            linkedHashMap.put("payment_method", map2);
        }
        if (num2 != null) {
            linkedHashMap.put("autotopup_type", num2);
        }
        if (str13 != null) {
            linkedHashMap.put("moment_of_payment", str13);
        }
        if (str14 != null) {
            linkedHashMap.put("amount_moment_of_payment", str14);
        }
        if (str15 != null) {
            linkedHashMap.put("amount_topup", str15);
        }
        if (str16 != null) {
            linkedHashMap.put("threshold_topup", str16);
        }
        if (str17 != null) {
            linkedHashMap.put("autofund", str17);
        }
        if (str18 != null) {
            linkedHashMap.put("autotopup", str18);
        }
        linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsSaveLoadedVersion.getOriginalValue());
        z94Var.a.a("auto_topup.settings.save.loaded", linkedHashMap);
    }

    public static void g(z94 z94Var, AutotopupEvents$AutoTopupSettingsSaveResultResult autotopupEvents$AutoTopupSettingsSaveResultResult, String str, String str2, String str3, Map map, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, AutotopupEvents$AutoTopupSettingsSaveResultVersion autotopupEvents$AutoTopupSettingsSaveResultVersion, int i) {
        String str11 = (i & 2) != 0 ? null : str;
        String str12 = (i & 4) != 0 ? null : str2;
        String str13 = (i & 8) != 0 ? null : str3;
        Integer num2 = (i & 32) != 0 ? null : num;
        String str14 = (i & 64) != 0 ? null : str4;
        String str15 = (i & 128) != 0 ? null : str5;
        String str16 = (i & 256) != 0 ? null : str6;
        String str17 = (i & 512) != 0 ? null : str7;
        String str18 = (i & 1024) != 0 ? null : str8;
        String str19 = (i & 2048) == 0 ? str9 : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(14);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, autotopupEvents$AutoTopupSettingsSaveResultResult.getOriginalValue());
        if (str11 != null) {
            linkedHashMap.put("error", str11);
        }
        if (str12 != null) {
            linkedHashMap.put("amount", str12);
        }
        if (str13 != null) {
            linkedHashMap.put("threshold", str13);
        }
        linkedHashMap.put("payment_method", map);
        if (num2 != null) {
            linkedHashMap.put("autotopup_type", num2);
        }
        if (str14 != null) {
            linkedHashMap.put("moment_of_payment", str14);
        }
        if (str15 != null) {
            linkedHashMap.put("amount_moment_of_payment", str15);
        }
        if (str16 != null) {
            linkedHashMap.put("amount_topup", str16);
        }
        if (str17 != null) {
            linkedHashMap.put("threshold_topup", str17);
        }
        if (str18 != null) {
            linkedHashMap.put("autofund", str18);
        }
        if (str19 != null) {
            linkedHashMap.put("autotopup", str19);
        }
        if (str10 != null) {
            linkedHashMap.put("request_id", str10);
        }
        linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsSaveResultVersion.getOriginalValue());
        z94Var.a.a("auto_topup.settings.save.result", linkedHashMap);
    }

    public static /* synthetic */ void j(z94 z94Var, String str, String str2, String str3, AutotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion autotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        z94Var.i(str, str2, null, str3, autotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion);
    }

    public static void k(z94 z94Var, String str, String str2, String str3, Integer num, AutotopupEvents$AutoTopupSettingsValidationErrorVersion autotopupEvents$AutoTopupSettingsValidationErrorVersion, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        if (str != null) {
            linkedHashMap.put("autofund_error", str);
        }
        if (str2 != null) {
            linkedHashMap.put("amount_error", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("threshold_error", str3);
        }
        if (num != null) {
            linkedHashMap.put("autotopup_type", num);
        }
        linkedHashMap.put("version", autotopupEvents$AutoTopupSettingsValidationErrorVersion.getOriginalValue());
        z94Var.a.a("auto_topup.settings.validation_error", linkedHashMap);
    }

    public static void l(z94 z94Var, CashbackEvents$CashbackCategoriesSubmittedResult cashbackEvents$CashbackCategoriesSubmittedResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cashbackEvents$CashbackCategoriesSubmittedResult.getOriginalValue());
        z94Var.a.a("cashback.categories_submitted", linkedHashMap);
    }

    public static void m(z94 z94Var, CashbackEvents$CashbackGetPromoResultResult cashbackEvents$CashbackGetPromoResultResult) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, cashbackEvents$CashbackGetPromoResultResult.getOriginalValue());
        z94Var.a.a("cashback.get_promo_result", linkedHashMap);
    }

    public static void p(z94 z94Var, String str, LinkingAccountEvents$LinkingAccountListOfBanksScreenBankSearchResult linkingAccountEvents$LinkingAccountListOfBanksScreenBankSearchResult) {
        LinkedHashMap w = g8e.w(3, "text", str);
        w.put(TarifficatorScenarioActivity.RESULT_KEY, linkingAccountEvents$LinkingAccountListOfBanksScreenBankSearchResult.getOriginalValue());
        a aVar = z94Var.a;
        byte[] bArr = y5e.o;
        byte[] bArr2 = new byte[48];
        for (int i = 0; i < 48; i++) {
            bArr2[i] = (byte) (bArr[i] ^ y5e.c[i % 8]);
        }
        aVar.a(new String(bArr2, uza.a), w);
    }

    public static void u(z94 z94Var, RegistrationEvents$RegistrationResultResult registrationEvents$RegistrationResultResult, String str, String str2) {
        z94Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, registrationEvents$RegistrationResultResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (str2 != null) {
            linkedHashMap.put("application_id", str2);
        }
        z94Var.a.a("registration.result", linkedHashMap);
    }

    public static void x(z94 z94Var, String str, String str2, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        if (str != null) {
            linkedHashMap.put("title", str);
        }
        if (str2 != null) {
            linkedHashMap.put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str2);
        }
        if (str3 != null) {
            linkedHashMap.put("action", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("error", str4);
        }
        z94Var.a.a("small_screen_topup.loaded", linkedHashMap);
    }

    public static void y(z94 z94Var, TemplatePaymentTypeTransfers templatePaymentTypeTransfers, TemplateTransferEvents$TemplateTransferLoadedResult templateTransferEvents$TemplateTransferLoadedResult, String str, String str2, String str3, String str4, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(6);
        linkedHashMap.put("type", templatePaymentTypeTransfers.getOriginalValue());
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, templateTransferEvents$TemplateTransferLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("item_type", str2);
        linkedHashMap.put("scenario_hash", str3);
        if (str4 != null) {
            linkedHashMap.put("amount", str4);
        }
        z94Var.a.a("template_transfer.loaded", linkedHashMap);
    }

    public static void z(z94 z94Var, TopupEvents$TopupPaymentResultResult topupEvents$TopupPaymentResultResult, TopupEvents$TopupPaymentResultError topupEvents$TopupPaymentResultError, int i) {
        if ((i & 2) != 0) {
            topupEvents$TopupPaymentResultError = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, topupEvents$TopupPaymentResultResult.getOriginalValue());
        if (topupEvents$TopupPaymentResultError != null) {
            linkedHashMap.put("error", topupEvents$TopupPaymentResultError.getOriginalValue());
        }
        z94Var.a.a("topup.payment.result", linkedHashMap);
    }

    public void a(String str, AutotopupEvents$AutoTopupSettingsBackSaveVersion autotopupEvents$AutoTopupSettingsBackSaveVersion) {
        LinkedHashMap w = g8e.w(2, "action", str);
        w.put("version", autotopupEvents$AutoTopupSettingsBackSaveVersion.getOriginalValue());
        this.a.a("auto_topup.settings.back.save", w);
    }

    public void c(AutotopupEvents$AutoTopupSettingsResultScreenActionResult autotopupEvents$AutoTopupSettingsResultScreenActionResult, String str, String str2, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, autotopupEvents$AutoTopupSettingsResultScreenActionResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("action", str2);
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AutoTopupSettingsResultTypeAutotopup) it.next()).getOriginalValue());
            }
            linkedHashMap.put("types", arrayList);
        }
        this.a.a("auto_topup.settings.result_screen.action", linkedHashMap);
    }

    public void d(AutotopupEvents$AutoTopupSettingsResultScreenShownResult autotopupEvents$AutoTopupSettingsResultScreenShownResult, String str, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, autotopupEvents$AutoTopupSettingsResultScreenShownResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AutoTopupSettingsResultTypeAutotopup) it.next()).getOriginalValue());
            }
            linkedHashMap.put("types", arrayList);
        }
        this.a.a("auto_topup.settings.result_screen.shown", linkedHashMap);
    }

    public void h(String str, String str2, String str3, AutotopupEvents$AutoTopupSettingsShortCutLimitsChangeVersion autotopupEvents$AutoTopupSettingsShortCutLimitsChangeVersion) {
        LinkedHashMap w = g8e.w(4, "tapped", str);
        if (str2 != null) {
            w.put("amount_threshold", str2);
        }
        if (str3 != null) {
            w.put("topup_balance", str3);
        }
        w.put("version", autotopupEvents$AutoTopupSettingsShortCutLimitsChangeVersion.getOriginalValue());
        this.a.a("auto_topup.settings.short_cut_limits.change", w);
    }

    public void i(String str, String str2, String str3, String str4, AutotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion autotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion) {
        LinkedHashMap w = g8e.w(5, "tapped", str);
        if (str2 != null) {
            w.put("amount_threshold", str2);
        }
        if (str3 != null) {
            w.put("topup_balance", str3);
        }
        w.put("action", str4);
        w.put("version", autotopupEvents$AutoTopupSettingsShortCutLimitsClickVersion.getOriginalValue());
        this.a.a("auto_topup.settings.short_cut_limits.click", w);
    }

    public void n(CreditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult creditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult, String str, Integer num, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(5);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, creditLimitEvents$CreditLimitSetPurchaseSettingsLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        if (num != null) {
            linkedHashMap.put("error_code", num);
        }
        if (str2 != null) {
            linkedHashMap.put("stacktrace", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("trace_id", str3);
        }
        this.a.a("credit_limit.set_purchase_settings.loaded", linkedHashMap);
    }

    public void o(DeeplinkEvents$DeeplinkNetworkRequestMarkEventReadResult deeplinkEvents$DeeplinkNetworkRequestMarkEventReadResult, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, deeplinkEvents$DeeplinkNetworkRequestMarkEventReadResult.getOriginalValue());
        linkedHashMap.put("action_id", str);
        linkedHashMap.put("event_id", str2);
        this.a.a("deeplink.network.request.mark_event_read", linkedHashMap);
    }

    public void q(String str, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme linkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(y5e.o(y5e.W), str);
        linkedHashMap.put(DivkitThemeChangeListener.THEME_VARIABLE_NAME, linkingAccountEvents$LinkingAccountListOfBanksScreenSheetClickTheme.getOriginalValue());
        this.a.a(y5e.o(y5e.r), linkedHashMap);
    }

    public void r(String str, LinkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme linkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(y5e.o(y5e.W), str);
        linkedHashMap.put(DivkitThemeChangeListener.THEME_VARIABLE_NAME, linkingAccountEvents$LinkingAccountListOfBanksScreenSheetShownTheme.getOriginalValue());
        this.a.a(y5e.o(y5e.C), linkedHashMap);
    }

    public void s(RegistrationEvents$RegistrationPhoneCheckLoadedResult registrationEvents$RegistrationPhoneCheckLoadedResult, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, registrationEvents$RegistrationPhoneCheckLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        this.a.a("registration.phone.check.loaded", linkedHashMap);
    }

    public void t(RegistrationEvents$RegistrationPhoneConfirmationCodeCheckResult registrationEvents$RegistrationPhoneConfirmationCodeCheckResult, String str, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(3);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, registrationEvents$RegistrationPhoneConfirmationCodeCheckResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        linkedHashMap.put("attempt", Integer.valueOf(i));
        this.a.a("registration.phone.confirmation_code.check", linkedHashMap);
    }

    public void v(String str, RoundingEvents$RoundingSettingsLoadedResult roundingEvents$RoundingSettingsLoadedResult, RoundingEvents$RoundingSettingsLoadedStateRounding roundingEvents$RoundingSettingsLoadedStateRounding) {
        LinkedHashMap w = g8e.w(3, "agreement_id", str);
        w.put(TarifficatorScenarioActivity.RESULT_KEY, roundingEvents$RoundingSettingsLoadedResult.getOriginalValue());
        if (roundingEvents$RoundingSettingsLoadedStateRounding != null) {
            w.put("state_rounding", roundingEvents$RoundingSettingsLoadedStateRounding.getOriginalValue());
        }
        this.a.a("rounding.settings.loaded", w);
    }

    public void w(String str, RoundingEvents$RoundingSettingsSureDeactivateButtonClickButton roundingEvents$RoundingSettingsSureDeactivateButtonClickButton) {
        LinkedHashMap w = g8e.w(2, "agreement_id", str);
        w.put("button", roundingEvents$RoundingSettingsSureDeactivateButtonClickButton.getOriginalValue());
        this.a.a("rounding.settings.sure_deactivate.button.click", w);
    }
}
