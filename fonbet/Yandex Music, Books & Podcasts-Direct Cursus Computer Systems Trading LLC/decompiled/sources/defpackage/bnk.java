package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class bnk {
    public static final List a;
    public static final vr2 b;

    static {
        List c = t75.c(new wr2('0', '_', "\\d"));
        a = c;
        b = new vr2(a(""), c, false);
    }

    public static final String a(String str) {
        if (StringsKt.U(str)) {
            return "000000000000000";
        }
        JSONObject jSONObject = cnk.a;
        int i = 0;
        while (true) {
            if (jSONObject.has(Constants.KEY_VALUE)) {
                break;
            }
            String str2 = "*";
            if (i >= str.length()) {
                Object obj = jSONObject.get("*");
                obj.getClass();
                jSONObject = (JSONObject) obj;
                break;
            }
            int i2 = i + 1;
            String valueOf = String.valueOf(str.charAt(i));
            if (jSONObject.has(valueOf)) {
                str2 = valueOf;
            }
            Object obj2 = jSONObject.get(str2);
            obj2.getClass();
            jSONObject = (JSONObject) obj2;
            i = i2;
        }
        return jSONObject.getString(Constants.KEY_VALUE) + "00";
    }
}
