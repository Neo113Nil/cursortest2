package com.knotapi.knot.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Base64;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import coil3.memory.MemoryCacheService;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.services.Reporter;
import com.squareup.util.Strings;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Helper {
    public static final String TAG = "Knot:Helper";
    private static volatile boolean testMode = isRunningTests();

    public static String compressJson(String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
            gZIPOutputStream.close();
            return "gzip:" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void configureSystemBars(Context context, Window window, View view) {
        if (context == null || window == null) {
            return;
        }
        try {
            boolean isSystemInDarkMode = isSystemInDarkMode(context);
            MemoryCacheService memoryCacheService = new MemoryCacheService(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            Strings impl35 = i >= 35 ? new WindowInsetsControllerCompat.Impl35(window, memoryCacheService) : i >= 30 ? new WindowInsetsControllerCompat.Impl30(window, memoryCacheService) : new WindowInsetsControllerCompat.Impl26(window, memoryCacheService);
            int i2 = isSystemInDarkMode ? -15592942 : -1;
            boolean z = !isSystemInDarkMode;
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(i2);
                window.setNavigationBarColor(i2);
            } else if (view != null) {
                view.setBackgroundColor(i2);
            }
            impl35.setAppearanceLightStatusBars(z);
            impl35.setAppearanceLightNavigationBars(z);
        } catch (Exception e) {
            Reporter.error(e, "Helper- error configuring system bars");
        }
    }

    public static List<String> convertJsonArrayToList(JsonArray jsonArray) {
        if (jsonArray == null || jsonArray.isEmpty()) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                if (next.isJsonPrimitive()) {
                    arrayList.add(next.getAsString());
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.getMessage();
            return new ArrayList();
        }
    }

    public static String convertJsonArrayToString(JsonArray jsonArray) {
        if (jsonArray != null && !jsonArray.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<JsonElement> it = jsonArray.iterator();
                while (it.hasNext()) {
                    JsonElement next = it.next();
                    if (next.isJsonPrimitive()) {
                        jSONArray.put(next.getAsString());
                    }
                }
                return jSONArray.toString();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    public static String encodeImage(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static String escapeJs(String str) {
        return str == null ? "" : str.replace("'", "\\'");
    }

    public static String formatCookiesForPuppeteer(List<Cookie> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<Cookie> it = list.iterator();
        while (it.hasNext()) {
            JSONObject json = it.next().toJson();
            if (json != null) {
                jSONArray.put(json);
            }
        }
        return jSONArray.toString();
    }

    public static String getDomain(String str) {
        try {
            String str2 = str.replaceFirst("^(https?://)?", "").split("/")[0].split(":")[0];
            return str2.startsWith("www.") ? str2.substring(4) : str2;
        } catch (Exception unused) {
            return "";
        }
    }

    public static JsonElement getJsonParam(Bot bot, String str, String str2) {
        JsonElement parseString;
        if (bot == null || !bot.getGlobalSettings().has(str)) {
            return null;
        }
        String asString = bot.getGlobalSettings().get(str).getAsString();
        if (!isValidJson(asString) || (parseString = JsonParser.parseString(asString)) == null || !parseString.isJsonObject()) {
            return null;
        }
        JsonObject asJsonObject = parseString.getAsJsonObject();
        if (asJsonObject.has(str2)) {
            return asJsonObject.get(str2);
        }
        return null;
    }

    public static boolean isElementInArray(JsonElement jsonElement, JsonArray jsonArray) {
        if (jsonElement == null || jsonArray == null) {
            return false;
        }
        if (!jsonElement.isJsonArray()) {
            return isSingleElementInArray(jsonElement, jsonArray);
        }
        Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
        while (it.hasNext()) {
            if (isSingleElementInArray(it.next(), jsonArray)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRunningTests() {
        try {
            try {
                Class.forName("org.robolectric.Robolectric");
                return true;
            } catch (ClassNotFoundException unused) {
                Class.forName("org.junit.runner.JUnitCore");
                String property = System.getProperty("java.class.path");
                if (property != null) {
                    return property.contains("test");
                }
                return false;
            }
        } catch (ClassNotFoundException unused2) {
            return false;
        }
    }

    private static boolean isSingleElementInArray(JsonElement jsonElement, JsonArray jsonArray) {
        if (jsonElement != null && jsonElement.isJsonPrimitive()) {
            String trim = jsonElement.getAsString().trim();
            if (trim.isEmpty()) {
                return false;
            }
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                if (next != null && next.isJsonPrimitive()) {
                    String trim2 = next.getAsString().trim();
                    if (!trim2.isEmpty() && trim.contains(trim2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSystemInDarkMode(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean isTestMode() {
        return testMode;
    }

    public static boolean isUrlMatch(String str, String str2, boolean z) {
        try {
            if (!z) {
                return str.equals(str2);
            }
            try {
                return Pattern.compile(str2).matcher(str).matches();
            } catch (PatternSyntaxException unused) {
                return false;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean isValidJson(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                try {
                    new JSONObject(str);
                    return true;
                } catch (JSONException unused) {
                    new JSONArray(str);
                    return true;
                }
            } catch (JSONException unused2) {
            }
        }
        return false;
    }

    public static boolean isValidURL(String str) {
        return str != null && Patterns.WEB_URL.matcher(str).matches();
    }

    private static boolean isValidUUID(String str) {
        try {
            UUID.fromString(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean matchesAnyCondition(JsonElement jsonElement, String str) {
        if (str == null || str.isEmpty() || jsonElement == null) {
            return false;
        }
        if (!jsonElement.isJsonArray()) {
            return isElementInArray(jsonElement, null);
        }
        return isElementInArray(new JsonPrimitive(str), jsonElement.getAsJsonArray());
    }

    public static Map<String, String> parseCookies(String str) {
        HashMap hashMap = new HashMap();
        if (str != null && !str.isEmpty()) {
            for (String str2 : str.split("(?<=; )|(?<=;)|(?=;)|(?<=;)(?=\\s*)")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    hashMap.put(split[0].trim(), split[1].trim());
                }
            }
        }
        return hashMap;
    }

    public static void resetCookies(String str) {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("domainUrls");
                String domain = getDomain(string2);
                for (Map.Entry<String, String> entry : parseCookies(jSONObject.getString("cookies")).entrySet()) {
                    cookieManager.setCookie(string2, entry.getKey() + "=" + entry.getValue() + "; domain=" + domain + "; path=/;");
                }
            }
            cookieManager.flush();
        } catch (JSONException unused) {
        }
    }

    public static String safe(String str) {
        return str == null ? "" : str;
    }

    public static String safeGetString(int i, String str, Fragment fragment) {
        try {
            return fragment.isAdded() ? fragment.getString(i) : str;
        } catch (Exception e) {
            Reporter.error(e, "MerchantWebViewFragment.safeGetString");
            return str;
        }
    }

    public static String sanitizeInput(String str, String str2) {
        if (str == null) {
            return "";
        }
        String replace = str.replace("%2D", "-");
        if ("sessionId".equals(str2) || "clientId".equals(str2)) {
            if (!isValidUUID(replace)) {
                return "";
            }
        } else if ("entryPoint".equals(str2)) {
            return replace.replaceAll("[^a-zA-Z0-9 &.-]", "");
        }
        return replace;
    }

    public static void setTestMode(boolean z) {
        testMode = z;
    }
}
