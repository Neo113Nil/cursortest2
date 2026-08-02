package defpackage;

import android.net.Uri;
import com.yandex.div.state.db.StateEntry;
import com.yandex.go.deeplinks.generated.add_payment_method.AddPaymentMethodType;
import com.yandex.go.deeplinks.generated.app_settings.AppSettingsNotificationsCategory;
import com.yandex.go.deeplinks.generated.chargers.ChargersDiscountsSection;
import com.yandex.go.deeplinks.generated.chargers.ChargersDvizhSubscriptionSection;
import com.yandex.go.deeplinks.generated.chargers.ChargersPaymentMethodsSection;
import com.yandex.go.deeplinks.generated.chargers.ChargersStationSection;
import com.yandex.go.deeplinks.generated.chargers.ChargersSubscriptionSection;
import com.yandex.go.deeplinks.generated.chargers.ChargersSuperpassSection;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes.dex */
public final class ui implements h0h {
    public final /* synthetic */ int a;
    public static final ui b = new ui(0);
    public static final ui c = new ui(1);
    public static final ui d = new ui(2);
    public static final ui e = new ui(3);
    public static final ui f = new ui(4);
    public static final ui g = new ui(5);
    public static final ui h = new ui(6);
    public static final ui i = new ui(7);
    public static final ui j = new ui(8);
    public static final ui k = new ui(9);
    public static final ui l = new ui(10);
    public static final ui m = new ui(11);
    public static final ui n = new ui(12);
    public static final ui o = new ui(13);
    public static final ui p = new ui(14);
    public static final ui q = new ui(15);
    public static final ui r = new ui(16);
    public static final ui s = new ui(17);
    public static final ui t = new ui(18);
    public static final ui u = new ui(19);
    public static final ui v = new ui(20);
    public static final ui w = new ui(21);
    public static final ui x = new ui(22);
    public static final ui y = new ui(23);
    public static final ui z = new ui(24);
    public static final ui A = new ui(25);
    public static final ui B = new ui(26);
    public static final ui C = new ui(27);
    public static final ui D = new ui(28);
    public static final ui E = new ui(29);

    public /* synthetic */ ui(int i2) {
        this.a = i2;
    }

    @Override // defpackage.h0h
    public final String a() {
        switch (this.a) {
            case 0:
                return "accident";
            case 1:
                return "addcreditcard";
            case 2:
                return "add_payment_method";
            case 3:
                return "addpromocode";
            case 4:
                return "addsbptoken";
            case 5:
                return "ai_assistant";
            case 6:
                return "ai-widget";
            case 7:
                return "app_settings";
            case 8:
                return "auth";
            case 9:
                return "banner";
            case 10:
                return "bug_report";
            case 11:
                return "business_account";
            case 12:
                return "buyplus";
            case 13:
                return "cartech";
            case 14:
                return "cashback";
            case 15:
                return "change_language";
            case 16:
                return "change_tovarisch_host";
            case 17:
                return "chargers";
            case 18:
                return "chargers";
            case 19:
                return "chargers";
            case 20:
                return "chargers";
            case 21:
                return "chargers";
            case 22:
                return "chargers";
            case 23:
                return "chargers";
            case 24:
                return "charity";
            case 25:
                return "chat";
            case 26:
                return "compositepayment";
            case 27:
                return "content_complaint";
            case 28:
                return "care";
            default:
                return "delivery_container";
        }
    }

    @Override // defpackage.h0h
    public final Object d(Uri uri) {
        String queryParameter;
        String queryParameter2;
        List<String> pathSegments;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        switch (this.a) {
            case 0:
                if (b(uri)) {
                    return new ti(uri.getQueryParameter("order_id"));
                }
                return null;
            case 1:
                if (b(uri)) {
                    return new dd0();
                }
                return null;
            case 2:
                if (!b(uri) || (queryParameter = uri.getQueryParameter("type")) == null) {
                    return null;
                }
                AddPaymentMethodType.Companion.getClass();
                AddPaymentMethodType a = ri0.a(queryParameter);
                if (a != null) {
                    return new mi0(a, uri.getQueryParameter(Constants.KEY_SERVICE));
                }
                return null;
            case 3:
                if (b(uri)) {
                    return new jj0(uri, uri.getQueryParameter(AuthSdkActivity.RESPONSE_TYPE_CODE));
                }
                return null;
            case 4:
                if (b(uri)) {
                    return new lj0();
                }
                return null;
            case 5:
                if (b(uri)) {
                    return new ll1(uri.getQueryParameter(Constants.KEY_MESSAGE), uri.getQueryParameter("active_mode"));
                }
                return null;
            case 6:
                if (!b(uri)) {
                    return null;
                }
                String queryParameter6 = uri.getQueryParameter("batch_id");
                String queryParameter7 = uri.getQueryParameter("show_onboarding");
                return new ho1(queryParameter6, uri.getQueryParameter("origin"), queryParameter7 != null ? evu0.j0(queryParameter7) : null);
            case 7:
                if (!b(uri) || (queryParameter2 = uri.getQueryParameter("category")) == null) {
                    return null;
                }
                AppSettingsNotificationsCategory.Companion.getClass();
                AppSettingsNotificationsCategory a2 = xw2.a(queryParameter2);
                if (a2 != null) {
                    return new yw2(a2);
                }
                return null;
            case 8:
                if (b(uri)) {
                    return new oi3();
                }
                return null;
            case 9:
                if (b(uri)) {
                    return new ms4(uri.getQueryParameter("id"));
                }
                return null;
            case 10:
                if (b(uri)) {
                    return new dr6();
                }
                return null;
            case 11:
                if (b(uri)) {
                    return new mw6(uri);
                }
                return null;
            case 12:
                if (b(uri)) {
                    return new a67();
                }
                return null;
            case 13:
                if (b(uri)) {
                    return new u78(uri);
                }
                return null;
            case 14:
                if (b(uri)) {
                    return new i39(uri.getQueryParameter("plus_context"));
                }
                return null;
            case 15:
                if (b(uri)) {
                    return new za9();
                }
                return null;
            case 16:
                if (b(uri)) {
                    return new jh9(uri.getQueryParameter("mode"), uri.getQueryParameter("tovarisch_url"), uri.getQueryParameter("for_path"));
                }
                return null;
            case 17:
                return e(uri);
            case 18:
                return f(uri);
            case 19:
                return g(uri);
            case 20:
                return h(uri);
            case 21:
                return i(uri);
            case 22:
                return j(uri);
            case 23:
                return k(uri);
            case 24:
                if (!b(uri)) {
                    return null;
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                int d2 = gw00.d(tcc.n(queryParameterNames, 10));
                if (d2 < 16) {
                    d2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d2);
                for (Object obj : queryParameterNames) {
                    String queryParameter8 = uri.getQueryParameter((String) obj);
                    if (queryParameter8 == null) {
                        queryParameter8 = "";
                    }
                    linkedHashMap.put(obj, queryParameter8);
                }
                return new iza(linkedHashMap);
            case 25:
                if (b(uri) && (pathSegments = uri.getPathSegments()) != null) {
                    return new z1b((String) a.S(0, pathSegments), (String) a.S(1, pathSegments), uri.getQueryParameter("bot_guid"), uri.getQueryParameter("source_id"));
                }
                return null;
            case 26:
                if (b(uri)) {
                    return new xqd();
                }
                return null;
            case 27:
                if (!b(uri) || (queryParameter3 = uri.getQueryParameter("media_type")) == null || (queryParameter4 = uri.getQueryParameter("media_id")) == null || (queryParameter5 = uri.getQueryParameter("company_id")) == null) {
                    return null;
                }
                return new dfe(queryParameter3, queryParameter4, queryParameter5);
            case 28:
                if (b(uri)) {
                    return new qxh(uri.getQueryParameter(StateEntry.COLUMN_PATH));
                }
                return null;
            default:
                if (b(uri)) {
                    return new j1i(uri);
                }
                return null;
        }
    }

    public tq9 e(Uri uri) {
        if (b(uri)) {
            return new tq9(uri, uri.getQueryParameter("number"), uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR));
        }
        return null;
    }

    public iu9 f(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        mw9 mw9Var = ChargersDiscountsSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        mw9Var.getClass();
        ChargersDiscountsSection a = mw9.a(str);
        if (a == null) {
            return null;
        }
        return new iu9(a, (String) a.S(1, pathSegments), uri.getQueryParameter("promo_code"));
    }

    public ox9 g(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        tx9 tx9Var = ChargersDvizhSubscriptionSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        tx9Var.getClass();
        ChargersDvizhSubscriptionSection a = tx9.a(str);
        if (a == null) {
            return null;
        }
        return new ox9(a, uri.getQueryParameter("offer_tariff_name"));
    }

    public vla h(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        xla xlaVar = ChargersPaymentMethodsSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        xlaVar.getClass();
        ChargersPaymentMethodsSection a = xla.a(str);
        if (a == null) {
            return null;
        }
        return new vla(a);
    }

    public yqa i(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        usa usaVar = ChargersStationSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        usaVar.getClass();
        ChargersStationSection a = usa.a(str);
        if (a == null) {
            return null;
        }
        return new yqa(a, uri.getQueryParameter("number"), uri.getQueryParameter(DRMInfoProvider.MediaDRMKeys.VENDOR));
    }

    public hta j(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        bva bvaVar = ChargersSubscriptionSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        bvaVar.getClass();
        ChargersSubscriptionSection a = bva.a(str);
        if (a == null) {
            return null;
        }
        return new hta(a);
    }

    public nva k(Uri uri) {
        List<String> pathSegments;
        if (!b(uri) || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 1) {
            return null;
        }
        ova ovaVar = ChargersSuperpassSection.Companion;
        String str = (String) a.S(0, pathSegments);
        if (str == null) {
            return null;
        }
        ovaVar.getClass();
        ChargersSuperpassSection a = ova.a(str);
        if (a == null) {
            return null;
        }
        return new nva(a);
    }
}
