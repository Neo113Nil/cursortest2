package defpackage;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class sh81 {
    public static String a(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString == null || optString.length() == 0 || optString.equals("null")) {
            yx61.e("Native Ad json has not required attributes");
            return null;
        }
        if (optString.length() != 0) {
            return optString;
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }
}
