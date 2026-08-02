package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class veb0 {
    public static final List a;
    public static final x25 b;

    static {
        List singletonList = Collections.singletonList(new y25(MoneyInputEditView.DEFAULT_VALUE, "\\d", '_'));
        a = singletonList;
        b = new x25(a(""), singletonList, false);
    }

    public static final String a(String str) {
        if (evu0.J(str)) {
            return "000000000000000";
        }
        JSONObject jSONObject = gfb0.a;
        int i = 0;
        while (true) {
            if (jSONObject.has("value")) {
                break;
            }
            String str2 = "*";
            if (i >= str.length()) {
                jSONObject = (JSONObject) jSONObject.get("*");
                break;
            }
            int i2 = i + 1;
            String valueOf = String.valueOf(str.charAt(i));
            if (jSONObject.has(valueOf)) {
                str2 = valueOf;
            }
            jSONObject = (JSONObject) jSONObject.get(str2);
            i = i2;
        }
        return jSONObject.getString("value") + "00";
    }
}
