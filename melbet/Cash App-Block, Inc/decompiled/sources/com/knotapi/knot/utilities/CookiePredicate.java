package com.knotapi.knot.utilities;

import com.knotapi.knot.models.Bot;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class CookiePredicate {
    public static final String TAG = "Knot:CookiePredicate";

    public static boolean checkPredicateCookiesFound(List<Cookie> list, String str) {
        int i;
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (0; i < jSONArray.length(); i + 1) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("name");
                String optString2 = jSONObject.optString("domain");
                String optString3 = jSONObject.optString("value", "");
                Pattern compile = Pattern.compile(optString);
                Pattern compile2 = Pattern.compile(optString2);
                Pattern compile3 = !optString3.isEmpty() ? Pattern.compile(optString3) : null;
                for (Cookie cookie : list) {
                    i = (compile.matcher(cookie.getName()).matches() && compile2.matcher(cookie.getDomain()).matches() && (compile3 == null || compile3.matcher(cookie.getValue()).matches())) ? i + 1 : 0;
                }
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Boolean isUserLoggedIn(Bot bot, List<Cookie> list) {
        return Boolean.valueOf(checkPredicateCookiesFound(list, bot.getLoggedInPredicate()));
    }
}
