package com.knotapi.knot.utilities;

import android.app.Activity;
import android.webkit.WebView;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.services.Reporter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public class RunCustomScript {
    public static final String TAG = "Knot:RunCustomScript";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runScript$0(WebView webView, JSONObject jSONObject, String str) {
        webView.evaluateJavascript(jSONObject.optString(str), null);
    }

    public static void runScript(JSONArray jSONArray, Bot bot, WebView webView, Activity activity, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject(bot.getParsedCustomScripts());
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string2 = jSONObject2.getString("src");
                if (z ? true : jSONObject2.getBoolean("mainFrameOnly")) {
                    activity.runOnUiThread(new CardEntryActivityController$$ExternalSyntheticLambda1(9, webView, jSONObject, string2));
                }
            }
        } catch (JSONException e) {
            Reporter.error(e, "Error executing runCustomScript");
        }
    }

    public static void runScriptInMerchantView(Bot bot, WebView webView, Activity activity, boolean z) {
        bot.getCustomScripts();
        bot.isCustomScriptsSet();
        bot.isAndroidScriptTriggersSet();
        if (!bot.isCustomScriptsSet() || !bot.isAndroidScriptTriggersSet()) {
            bot.getCustomScripts();
            return;
        }
        try {
            runScript(new JSONObject(bot.getAndroidScriptTriggers()).getJSONArray("webViewConfig"), bot, webView, activity, z);
            bot.getCustomScripts();
        } catch (JSONException e) {
            Reporter.error(e, "Error executing runCustomScript");
        }
    }

    public static void runScriptInPopUpView(Bot bot, WebView webView, Activity activity, boolean z) {
        if (bot.isCustomScriptsSet() && bot.isAndroidChromeScriptTriggersSet()) {
            try {
                runScript(new JSONObject(bot.getAndroidChromeScriptTriggers()).getJSONArray("webViewConfig"), bot, webView, activity, z);
            } catch (JSONException e) {
                Reporter.error(e, "Error executing runCustomScript");
            }
        }
    }
}
