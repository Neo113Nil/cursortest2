package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pir {
    public final jyr a;

    public pir(yqf yqfVar) {
        this.a = btf.b(new kgk(23, yqfVar));
    }

    public static hdg a(JSONObject jSONObject, String str, int i) {
        switch (ouj.D(i)) {
            case 0:
                return new mir(str, jSONObject.getString(Constants.KEY_VALUE));
            case 1:
                return new lir(str, jSONObject.getLong(Constants.KEY_VALUE));
            case 2:
                return new hir(str, jSONObject.getBoolean(Constants.KEY_VALUE));
            case 3:
                return new kir(str, jSONObject.getDouble(Constants.KEY_VALUE));
            case 4:
                return new iir(str, bow.v(jSONObject.getString(Constants.KEY_VALUE)));
            case 5:
                String string = jSONObject.getString(Constants.KEY_VALUE);
                string.getClass();
                try {
                    new URL(string);
                    return new nir(str, string);
                } catch (MalformedURLException unused) {
                    xq0.x("Invalid url ".concat(string));
                    return null;
                }
            case 6:
                return new gir(str, jSONObject.getJSONArray(Constants.KEY_VALUE));
            case 7:
                return new jir(str, jSONObject.getJSONObject(Constants.KEY_VALUE));
            default:
                b6e.s();
                return null;
        }
    }
}
