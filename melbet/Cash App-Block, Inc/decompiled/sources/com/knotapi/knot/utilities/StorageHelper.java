package com.knotapi.knot.utilities;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.models.ErrorView;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.webview.KnotView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class StorageHelper {
    private static final String TAG = "StorageHelper";

    public static boolean checkLocalStorageParams(String str, List<String> list) {
        if (str == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> it = list.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (jSONObject.optString(it.next(), "").isEmpty()) {
                    z = false;
                }
            }
            return z;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static boolean checkSessionStorageParams(String str, List<String> list) {
        if (str == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> it = list.iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (jSONObject.optString(it.next(), "").isEmpty()) {
                    z = false;
                }
            }
            return z;
        } catch (JSONException unused) {
            return false;
        }
    }

    private static List<String> getLocalParamNames(Bot bot) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<JsonElement> it = JsonParser.parseString(bot.getAllSettings().get("localStorageParams").getAsString()).getAsJsonArray().iterator();
            while (it.hasNext()) {
                String asString = it.next().getAsString();
                if (!asString.isEmpty()) {
                    arrayList.add(asString);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static List<String> getSessionParamNames(Bot bot) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<JsonElement> it = JsonParser.parseString(bot.getAllSettings().get("sessionStorageParams").getAsString()).getAsJsonArray().iterator();
            while (it.hasNext()) {
                String asString = it.next().getAsString();
                if (!asString.isEmpty()) {
                    arrayList.add(asString);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private static void proceedWithStorageDetails(String str, String str2, KnotView knotView, Bot bot) {
        if (bot.getHasLocalStorage() && !Boolean.parseBoolean(bot.getIsUsingLocalStorage())) {
            str = "{}";
        }
        if (bot.getHasSessionStorage() && !Boolean.parseBoolean(bot.getIsUsingSessionStorage())) {
            str2 = "{}";
        }
        knotView.captureManualScreenshot(knotView);
        knotView.getMerchantViewListener().sendRunningEvent(str, str2);
    }

    private static void showError(KnotView knotView, Bot bot, JsonObject jsonObject) {
        try {
            knotView.viewClient.showErrorPage(new ErrorView(bot.getMerchantName(), jsonObject.has("title") ? jsonObject.get("title").getAsString() : "Error Occurred", jsonObject.has("content") ? jsonObject.get("content").getAsString() : "An unexpected error occurred.", bot.getLogoURL(), bot.getTheme().has("background_color") ? bot.getTheme().get("background_color").getAsString() : "#FFFFFF", bot.getTheme().has("text_color") ? bot.getTheme().get("text_color").getAsString() : "#000000", "storageError"));
        } catch (Exception e) {
            Reporter.error(e, TAG);
        }
    }

    private static boolean validateRegexStorage(String str, List<String> list) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        Iterator<String> it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            Matcher matcher = Pattern.compile("(?:\\\\)*([\"'])([^\"']*" + Pattern.quote(it.next()) + "[^\"']*)\\1\\s*[:=]\\s*(?:\\\\)*([\"'])([^\"']+)\\3").matcher(str);
            while (true) {
                if (!matcher.find()) {
                    z = false;
                    break;
                }
                String group = matcher.group(4);
                if (group != null) {
                    String trim = group.trim();
                    if (!trim.isEmpty() && !trim.equalsIgnoreCase("null") && !trim.equalsIgnoreCase("undefined")) {
                        break;
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean validateStorage(String str, String str2, Bot bot) {
        boolean z;
        boolean z2;
        if (bot.getAllSettings().has("localStorageParams")) {
            List<String> localParamNames = getLocalParamNames(bot);
            if (!localParamNames.isEmpty() && ((!Helper.isValidJson(str) || !checkLocalStorageParams(str, localParamNames)) && !validateRegexStorage(str, localParamNames))) {
                z = false;
                if (bot.getAllSettings().has("sessionStorageParams")) {
                    List<String> sessionParamNames = getSessionParamNames(bot);
                    if (!sessionParamNames.isEmpty() && ((!Helper.isValidJson(str2) || !checkSessionStorageParams(str2, sessionParamNames)) && !validateRegexStorage(str2, sessionParamNames))) {
                        z2 = false;
                        return !z && z2;
                    }
                }
                z2 = true;
                if (z) {
                }
            }
        }
        z = true;
        if (bot.getAllSettings().has("sessionStorageParams")) {
        }
        z2 = true;
        if (z) {
        }
    }

    public static void validateStorages(String str, String str2, KnotView knotView, Bot bot) {
        knotView.getmExtraInfo().setLoggedInPage(knotView.getUrl());
        if (knotView.getStorageValidationStartTime() == 0) {
            knotView.setStorageValidationStartTime(System.currentTimeMillis());
        }
        JsonObject storageErrorViewJson = bot.getStorageErrorViewJson();
        if (System.currentTimeMillis() - knotView.getStorageValidationStartTime() >= (storageErrorViewJson.has("time") ? storageErrorViewJson.get("time").getAsInt() : 10000)) {
            showError(knotView, bot, storageErrorViewJson);
            return;
        }
        if (!bot.isStorageRequired() || knotView.isUserAuthed) {
            if (knotView.isUserAuthed) {
                knotView.mExtraInfo.setWorkflowTaskTrigger(true);
            }
            proceedWithStorageDetails(str, str2, knotView, bot);
        } else if (validateStorage(str, str2, bot)) {
            proceedWithStorageDetails(str, str2, knotView, bot);
        } else {
            knotView.getStorageDetails();
        }
    }
}
