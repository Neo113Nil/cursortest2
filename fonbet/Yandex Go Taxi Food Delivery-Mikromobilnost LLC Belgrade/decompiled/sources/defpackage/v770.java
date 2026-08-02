package defpackage;

import com.adjust.sdk.Constants;

/* loaded from: classes9.dex */
public final class v770 {
    public final String a;
    public static final v770 b = new v770("");
    public static final v770 c = new v770(Constants.DEEPLINK);
    public static final v770 d = new v770("ride");
    public static final v770 e = new v770("web_view");
    public static final v770 f = new v770("full_screen");
    public static final v770 g = new v770("card_banner");
    public static final v770 h = new v770("stories");
    public static final v770 i = new v770("notification_banner");
    public static final v770 j = new v770("superapp_shortcut");
    public static final v770 k = new v770("shortcut");
    public static final v770 l = new v770("feed");
    public static final v770 m = new v770("promo_object");
    public static final v770 n = new v770("coupon_list");
    public static final v770 o = new v770("business_account");
    public static final v770 p = new v770("menu");
    public static final v770 q = new v770("menu_item");
    public static final v770 r = new v770("layers");
    public static final v770 s = new v770(Constants.PUSH);
    public static final v770 t = new v770("plus_home");
    public static final v770 u = new v770("totw_banner");
    public static final v770 v = new v770("tariff_unavailability_action");
    public static final v770 w = new v770("tariff_redirect");
    public static final v770 x = new v770("scooters");
    public static final v770 y = new v770("chargers");
    public static final v770 z = new v770("user_profile");
    public static final v770 A = new v770("information");
    public static final v770 B = new v770("payment_methods");
    public static final v770 C = new v770("tariff_unavailability_notification");

    public v770(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !v770.class.equals(obj.getClass())) {
            return false;
        }
        return jl40.l(this.a, ((v770) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
