package defpackage;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import ru.yandex.taxi.logistics.sdk.address_details.impl.static_map.api.MapType;

/* loaded from: classes5.dex */
public final class u6u0 {
    public final vs2 a;

    static {
        scc.g("ru_RU", "en_US", "en_RU", "ru_UA", "uk_UA", "tr_TR");
    }

    public u6u0(vs2 vs2Var) {
        this.a = vs2Var;
    }

    public final String a(doe doeVar, t6u0 t6u0Var) {
        is00 is00Var = t6u0Var.d;
        MapType mapType = t6u0Var.e;
        vs2 vs2Var = this.a;
        if (evu0.J(vs2Var.a.a)) {
            return "";
        }
        Uri.Builder buildUpon = Uri.parse("https://static-maps.yandex.ru/v1").buildUpon();
        buildUpon.appendQueryParameter("ll", doeVar.b + "," + doeVar.a);
        buildUpon.appendQueryParameter("apikey", vs2Var.a.a);
        buildUpon.appendQueryParameter("lg", "0");
        buildUpon.appendQueryParameter("cr", "0");
        buildUpon.appendQueryParameter("l", mapType.getValue());
        buildUpon.appendQueryParameter("z", String.valueOf(t6u0Var.c));
        buildUpon.appendQueryParameter("size", t6u0Var.b + "," + t6u0Var.a);
        buildUpon.appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, is00Var.a ? "dark" : "light");
        String str = is00Var.b;
        if (mapType != MapType.HYBRID && !evu0.J(str)) {
            buildUpon.appendQueryParameter("style", str);
        }
        return buildUpon.build().toString();
    }
}
