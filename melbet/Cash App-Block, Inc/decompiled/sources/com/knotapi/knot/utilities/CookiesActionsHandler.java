package com.knotapi.knot.utilities;

import android.webkit.CookieManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.webview.KnotView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class CookiesActionsHandler {
    private static final String TAG = "CookieHelper";
    private static int maxRetries = 3;

    public static class CookieUpdateRule {
        boolean appendDomainDot;
        String name;
        String newDomain;
        String refetchUrl;
        boolean secure;

        private CookieUpdateRule() {
            this.appendDomainDot = false;
            this.secure = false;
            this.refetchUrl = null;
        }
    }

    public static class FieldResult {
        String name;
        String pattern;

        private FieldResult() {
            this.name = null;
            this.pattern = null;
        }
    }

    public static class RequiredCookie {
        String cookieFetchUrl;
        String domainPattern;
        String domainPredicate;
        boolean isEncoded;
        String nestedCookieName;
        String nestedCookieNamePattern;
        boolean optionalForValidation;
        String parentCookieName;
        String parentCookieNamePattern;
        String redirectUrl;
        String valuePattern;
        String valuePredicate;

        private RequiredCookie() {
        }
    }

    public static boolean canAddCookies(String str, Bot bot) {
        try {
            JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
            if (asJsonObject == null || !asJsonObject.has("collectCookies")) {
                return true;
            }
            Iterator<JsonElement> it = asJsonObject.getAsJsonArray("collectCookies").iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                if (next.getAsString().contains(str)) {
                    return !next.getAsString().contains("!");
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean checkPredicateCookiesFound(List<Cookie> list, Bot bot) {
        try {
            JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
            List<RequiredCookie> arrayList = new ArrayList();
            if (asJsonObject.has("requiredCookies")) {
                arrayList = parseRequiredCookies(asJsonObject.getAsJsonArray("requiredCookies"));
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            boolean z = false;
            while (true) {
                boolean z2 = z;
                for (RequiredCookie requiredCookie : arrayList) {
                    boolean isCookiePresent = isCookiePresent(list, requiredCookie);
                    if (requiredCookie.optionalForValidation) {
                        z = true;
                        if (isCookiePresent) {
                            break;
                        }
                    } else if (!isCookiePresent) {
                        return false;
                    }
                }
                return !z || z2;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static String decodeCookieValue(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return str;
        }
    }

    private static boolean fetchAndValidateCookies(Bot bot, List<Cookie> list) {
        String str;
        List<Cookie> cookiesFromUrl;
        try {
            JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
            List<RequiredCookie> arrayList = new ArrayList();
            if (asJsonObject.has("requiredCookies")) {
                arrayList = parseRequiredCookies(asJsonObject.getAsJsonArray("requiredCookies"));
            }
            int i = 0;
            while (i < maxRetries) {
                i++;
                for (RequiredCookie requiredCookie : arrayList) {
                    if (!isCookiePresent(list, requiredCookie) && (str = requiredCookie.cookieFetchUrl) != null && !str.isEmpty() && (cookiesFromUrl = getCookiesFromUrl(str)) != null) {
                        list.addAll(cookiesFromUrl);
                    }
                }
                if (checkPredicateCookiesFound(list, bot)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static List<Cookie> getCookies(String str) {
        ArrayList arrayList = new ArrayList();
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie != null && !cookie.isEmpty()) {
            for (String str2 : cookie.split(";")) {
                Cookie buildCookie = Cookie.buildCookie(str2, str);
                if (buildCookie != null) {
                    arrayList.add(buildCookie);
                }
            }
        }
        return arrayList;
    }

    public static List<Cookie> getCookiesFromUrl(String str) {
        try {
            return getCookies(str);
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private static String getNestedCookieValue(String str, String str2, Pattern pattern) {
        try {
            JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
            if (pattern == null) {
                if (str2 == null || !asJsonObject.has(str2)) {
                    return null;
                }
                return asJsonObject.get(str2).getAsString();
            }
            for (String str3 : asJsonObject.keySet()) {
                if (pattern.matcher(str3).matches()) {
                    return asJsonObject.get(str3).getAsString();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isCookiePresent(List<Cookie> list, RequiredCookie requiredCookie) {
        String str = requiredCookie.parentCookieNamePattern;
        Pattern compile = str != null ? Pattern.compile(str) : null;
        String str2 = requiredCookie.domainPattern;
        Pattern compile2 = str2 != null ? Pattern.compile(str2) : null;
        String str3 = requiredCookie.valuePattern;
        Pattern compile3 = str3 != null ? Pattern.compile(str3) : null;
        String str4 = requiredCookie.nestedCookieNamePattern;
        Pattern compile4 = str4 != null ? Pattern.compile(str4) : null;
        Iterator<Cookie> it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return false;
            }
            Cookie next = it.next();
            boolean matches = compile != null ? compile.matcher(next.getName()).matches() : requiredCookie.parentCookieName == null || next.getName().equals(requiredCookie.parentCookieName);
            if (compile2 != null) {
                z = compile2.matcher(next.getDomain()).matches();
            } else if (requiredCookie.domainPredicate == null || next.getDomain().equals(requiredCookie.domainPredicate)) {
                z = true;
            }
            if (matches && z) {
                boolean z2 = requiredCookie.isEncoded;
                String value = next.getValue();
                if (z2) {
                    value = decodeCookieValue(value);
                }
                if (isValueMatches(requiredCookie, getNestedCookieValue(value, requiredCookie.nestedCookieName, compile4), compile3)) {
                    return true;
                }
            }
        }
    }

    public static boolean isUserLoggedIn(Bot bot, List<Cookie> list) {
        if (!bot.hasCookieActions()) {
            return false;
        }
        setMaxRetries(bot);
        return checkPredicateCookiesFound(list, bot) || fetchAndValidateCookies(bot, list);
    }

    private static boolean isValueMatches(RequiredCookie requiredCookie, String str, Pattern pattern) {
        String str2 = requiredCookie.valuePredicate;
        if (str2 == null && requiredCookie.valuePattern == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return pattern != null ? pattern.matcher(str).matches() : str.equals(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List<CookieUpdateRule> parseCookieUpdates(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonObject asJsonObject = it.next().getAsJsonObject();
            String str = null;
            CookieUpdateRule cookieUpdateRule = new CookieUpdateRule();
            cookieUpdateRule.name = asJsonObject.has("name") ? asJsonObject.get("name").getAsString() : null;
            cookieUpdateRule.newDomain = asJsonObject.has("newDomain") ? asJsonObject.get("newDomain").getAsString() : null;
            boolean z = false;
            cookieUpdateRule.appendDomainDot = asJsonObject.has("appendDomainDot") && asJsonObject.get("appendDomainDot").getAsBoolean();
            if (asJsonObject.has("secure") && asJsonObject.get("secure").getAsBoolean()) {
                z = true;
            }
            cookieUpdateRule.secure = z;
            if (asJsonObject.has("refetchUrl")) {
                str = asJsonObject.get("refetchUrl").getAsString();
            }
            cookieUpdateRule.refetchUrl = str;
            arrayList.add(cookieUpdateRule);
        }
        return arrayList;
    }

    private static FieldResult parseField(JsonObject jsonObject, String str) {
        FieldResult fieldResult = new FieldResult();
        if (jsonObject.has(str)) {
            JsonElement jsonElement = jsonObject.get(str);
            if (jsonElement.isJsonPrimitive()) {
                fieldResult.name = jsonElement.getAsString();
                return fieldResult;
            }
            if (jsonElement.isJsonObject()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject.has("name")) {
                    fieldResult.name = asJsonObject.get("name").getAsString();
                }
                if (asJsonObject.has("regex")) {
                    fieldResult.pattern = asJsonObject.get("regex").getAsString();
                }
            }
        }
        return fieldResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<RequiredCookie> parseRequiredCookies(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonObject asJsonObject = it.next().getAsJsonObject();
            RequiredCookie requiredCookie = new RequiredCookie();
            FieldResult parseField = parseField(asJsonObject, "domain");
            FieldResult parseField2 = parseField(asJsonObject, "parentCookieName");
            FieldResult parseField3 = parseField(asJsonObject, "nestedCookieName");
            FieldResult parseField4 = parseField(asJsonObject, "cookieFetchUrl");
            FieldResult parseField5 = parseField(asJsonObject, "value");
            String str = parseField.name;
            requiredCookie.domainPredicate = (str == null || str.isEmpty()) ? null : parseField.name;
            String str2 = parseField.pattern;
            requiredCookie.domainPattern = (str2 == null || str2.isEmpty()) ? null : parseField.pattern;
            String str3 = parseField2.name;
            requiredCookie.parentCookieName = (str3 == null || str3.isEmpty()) ? null : parseField2.name;
            String str4 = parseField2.pattern;
            requiredCookie.parentCookieNamePattern = (str4 == null || str4.isEmpty()) ? null : parseField2.pattern;
            String str5 = parseField3.name;
            requiredCookie.nestedCookieName = (str5 == null || str5.isEmpty()) ? null : parseField3.name;
            String str6 = parseField3.pattern;
            requiredCookie.nestedCookieNamePattern = (str6 == null || str6.isEmpty()) ? null : parseField3.pattern;
            String str7 = parseField5.name;
            requiredCookie.valuePredicate = (str7 == null || str7.isEmpty()) ? null : parseField5.name;
            String str8 = parseField5.pattern;
            requiredCookie.valuePattern = (str8 == null || str8.isEmpty()) ? null : parseField5.pattern;
            requiredCookie.cookieFetchUrl = parseField4.name;
            boolean z = false;
            requiredCookie.isEncoded = asJsonObject.has("isEncoded") && asJsonObject.get("isEncoded").getAsBoolean();
            requiredCookie.redirectUrl = asJsonObject.has("redirectUrl") ? asJsonObject.get("redirectUrl").getAsString() : null;
            if (asJsonObject.has("optionalForValidation") && asJsonObject.get("optionalForValidation").getAsBoolean()) {
                z = true;
            }
            requiredCookie.optionalForValidation = z;
            arrayList.add(requiredCookie);
        }
        return arrayList;
    }

    private static void setMaxRetries(Bot bot) {
        try {
            if (bot.getAllSettings().has("cookiesActions")) {
                JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
                if (asJsonObject.has("maxRetries")) {
                    maxRetries = asJsonObject.get("maxRetries").getAsInt();
                }
            }
        } catch (Exception e) {
            Reporter.error(e, "CookiesActionsHandler.setMaxRetries");
        }
    }

    public static void updateCookies(KnotView knotView, Bot bot) {
        try {
            JsonObject asJsonObject = bot.getAllSettings().getAsJsonObject("cookiesActions");
            List<Cookie> cookies = knotView.getCookies();
            if (asJsonObject.has("cookieUpdates")) {
                for (CookieUpdateRule cookieUpdateRule : parseCookieUpdates(asJsonObject.getAsJsonArray("cookieUpdates"))) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getName().equals(cookieUpdateRule.name)) {
                            String str = cookieUpdateRule.refetchUrl;
                            if (str != null && !str.isEmpty()) {
                                List<Cookie> cookiesFromUrl = getCookiesFromUrl(cookieUpdateRule.refetchUrl);
                                if (cookiesFromUrl != null) {
                                    for (Cookie cookie2 : cookiesFromUrl) {
                                        if (cookie2.getName().equals(cookieUpdateRule.name)) {
                                            cookies.add(cookie2);
                                        }
                                    }
                                }
                            }
                            String str2 = cookieUpdateRule.newDomain;
                            if (str2 != null && !str2.isEmpty()) {
                                cookie.setDomain(cookieUpdateRule.newDomain);
                            }
                            if (cookieUpdateRule.appendDomainDot) {
                                String domain = cookie.getDomain();
                                if (!domain.startsWith(".")) {
                                    cookie.setDomain("." + domain);
                                    cookie.getDomain();
                                }
                            }
                            if (cookieUpdateRule.secure) {
                                cookie.setSecure(true);
                            }
                        }
                    }
                }
                knotView.setCookies(cookies);
            }
        } catch (Exception unused) {
        }
    }
}
