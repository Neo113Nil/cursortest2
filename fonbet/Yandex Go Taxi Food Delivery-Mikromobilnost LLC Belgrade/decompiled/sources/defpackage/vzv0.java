package defpackage;

import android.net.Uri;
import com.yandex.div.state.db.StateEntry;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class vzv0 implements h0h {
    public static final vzv0 b = new vzv0(0);
    public static final vzv0 c = new vzv0(1);
    public static final vzv0 d = new vzv0(2);
    public static final vzv0 e = new vzv0(3);
    public static final vzv0 f = new vzv0(4);
    public static final vzv0 g = new vzv0(5);
    public static final vzv0 h = new vzv0(6);
    public static final vzv0 i = new vzv0(7);
    public static final vzv0 j = new vzv0(8);
    public static final vzv0 k = new vzv0(9);
    public static final vzv0 l = new vzv0(10);
    public static final vzv0 m = new vzv0(11);
    public static final vzv0 n = new vzv0(12);
    public static final vzv0 o = new vzv0(13);
    public static final vzv0 p = new vzv0(14);
    public static final vzv0 q = new vzv0(15);
    public static final vzv0 r = new vzv0(16);
    public static final vzv0 s = new vzv0(17);
    public static final vzv0 t = new vzv0(18);
    public static final vzv0 u = new vzv0(19);
    public static final vzv0 v = new vzv0(20);
    public static final vzv0 w = new vzv0(21);
    public static final vzv0 x = new vzv0(22);
    public static final vzv0 y = new vzv0(23);
    public final /* synthetic */ int a;

    public /* synthetic */ vzv0(int i2) {
        this.a = i2;
    }

    @Override // defpackage.h0h
    public final String a() {
        switch (this.a) {
            case 0:
                return "superapp_favorites";
            case 1:
                return "superapp_search";
            case 2:
                return "tariffs";
            case 3:
                return "taxi_main";
            case 4:
                return "taxi_order_details";
            case 5:
                return "testing";
            case 6:
                return "tips";
            case 7:
                return "transport_routes";
            case 8:
                return "trustedcontacts";
            case 9:
                return "ugc";
            case 10:
                return "upgradeplus";
            case 11:
                return "uploaduserphoto";
            case 12:
                return "user_profile";
            case 13:
                return "user_rating";
            case 14:
                return "user_statistics";
            case 15:
                return "vault";
            case 16:
                return "walking_navigation";
            case 17:
                return "wallet";
            case 18:
                return "yandex_bank";
            case 19:
                return "yandexlogin";
            case 20:
                return "yandexplus";
            case 21:
                return "yango-business";
            case 22:
                return "yango-pay-sdk";
            default:
                return "yandex_pay_auth";
        }
    }

    @Override // defpackage.h0h
    public final Object d(Uri uri) {
        List<String> pathSegments;
        String str;
        String queryParameter;
        switch (this.a) {
            case 0:
                if (b(uri)) {
                    return new uzv0(uri.getQueryParameter(Constants.KEY_SERVICE));
                }
                return null;
            case 1:
                if (b(uri)) {
                    return new q6w0(uri);
                }
                return null;
            case 2:
                if (b(uri)) {
                    return new irx0(uri.getQueryParameter("zone"));
                }
                return null;
            case 3:
                if (b(uri)) {
                    return new yvx0();
                }
                return null;
            case 4:
                if (b(uri)) {
                    return new r0y0(uri);
                }
                return null;
            case 5:
                if (b(uri) && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() >= 1 && (str = (String) a.S(0, pathSegments)) != null) {
                    return new fiy0(str);
                }
                return null;
            case 6:
                if (b(uri)) {
                    return new qfz0();
                }
                return null;
            case 7:
                return e(uri);
            case 8:
                if (b(uri)) {
                    return new pg11(uri.getQueryParameter("order_id"));
                }
                return null;
            case 9:
                if (b(uri)) {
                    return new xr11(uri);
                }
                return null;
            case 10:
                if (b(uri)) {
                    return new ab21();
                }
                return null;
            case 11:
                if (!b(uri)) {
                    return null;
                }
                String queryParameter2 = uri.getQueryParameter("request_routestats");
                return new hd21(queryParameter2 != null ? evu0.j0(queryParameter2) : null);
            case 12:
                if (b(uri)) {
                    return new cs21();
                }
                return null;
            case 13:
                if (b(uri)) {
                    return new qs21();
                }
                return null;
            case 14:
                if (b(uri)) {
                    return new ft21();
                }
                return null;
            case 15:
                if (b(uri)) {
                    return new b331(uri.getQueryParameter("origin"), uri.getQueryParameter("redirect"));
                }
                return null;
            case 16:
                if (b(uri)) {
                    return new c741(uri.getQueryParameter(StateEntry.COLUMN_PATH));
                }
                return null;
            case 17:
                if (b(uri)) {
                    return new z741();
                }
                return null;
            case 18:
                if (b(uri)) {
                    return new xk51();
                }
                return null;
            case 19:
                if (b(uri)) {
                    return new bm51();
                }
                return null;
            case 20:
                if (b(uri)) {
                    return new km51();
                }
                return null;
            case 21:
                if (b(uri) && (queryParameter = uri.getQueryParameter("id")) != null) {
                    return new kn51(queryParameter);
                }
                return null;
            case 22:
                if (!b(uri)) {
                    return null;
                }
                String queryParameter3 = uri.getQueryParameter("onboarding");
                return new do51(uri, queryParameter3 != null ? evu0.j0(queryParameter3) : null);
            default:
                if (b(uri)) {
                    return new xs51();
                }
                return null;
        }
    }

    public s811 e(Uri uri) {
        if (!b(uri)) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("start-lat");
        Double i2 = queryParameter != null ? avu0.i(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("start-lon");
        Double i3 = queryParameter2 != null ? avu0.i(queryParameter2) : null;
        String queryParameter3 = uri.getQueryParameter("end-lat");
        Double i4 = queryParameter3 != null ? avu0.i(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("end-lon");
        return new s811(uri, i2, i3, i4, queryParameter4 != null ? avu0.i(queryParameter4) : null);
    }
}
