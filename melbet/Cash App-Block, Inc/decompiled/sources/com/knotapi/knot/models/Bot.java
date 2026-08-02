package com.knotapi.knot.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.fidesmo.sec.utils.UrlParserKt;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.knotapi.knot.utilities.Constants;
import com.knotapi.knot.utilities.Helper;
import com.knotapi.knot.webview.KnotView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Bot implements Parcelable {
    public static final Parcelable.Creator<Bot> CREATOR = new Parcelable.Creator<Bot>() { // from class: com.knotapi.knot.models.Bot.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bot createFromParcel(Parcel parcel) {
            return new Bot(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Bot[] newArray(int i) {
            return new Bot[i];
        }
    };
    public static final String TAG = "Knot:Bot";
    JsonObject allSettings;
    int botId;
    String callbackPath;
    String callbackScript;
    String callbackUrl;
    String checkLoginPath;
    String checkLoginScript;
    String customLoginScript;
    String customScripts;
    Boolean disableWorkflowValidation;
    List<String> disabledWorkflowTriggers;
    JsonObject globalSettings;
    Gson gson;
    List<Interceptor> interceptorsList;
    Boolean isDetached;
    String loggedInScript;
    String loggedInUrl;
    String loginPath;
    String loginScript;
    String loginUrl;
    String logoURL;
    int merchantCount;
    int merchantId;
    String merchantName;
    String parsedCustomScripts;
    String path;
    String paymentUrl;
    String script;
    int[] selectedMerchantIds;
    String theme;

    public Bot(Parcel parcel) {
        Boolean bool = Boolean.FALSE;
        this.isDetached = bool;
        this.gson = new Gson();
        this.interceptorsList = new ArrayList();
        this.disabledWorkflowTriggers = new ArrayList();
        this.disableWorkflowValidation = bool;
        this.botId = parcel.readInt();
        this.merchantId = parcel.readInt();
        this.merchantName = parcel.readString();
        this.theme = parcel.readString();
        this.loginUrl = parcel.readString();
        this.paymentUrl = parcel.readString();
        this.loggedInUrl = parcel.readString();
        this.script = parcel.readString();
        this.loginScript = parcel.readString();
        this.loggedInScript = parcel.readString();
        this.path = parcel.readString();
        this.loginPath = parcel.readString();
        this.callbackUrl = parcel.readString();
        this.callbackScript = parcel.readString();
        this.callbackPath = parcel.readString();
        this.customLoginScript = parcel.readString();
        this.checkLoginScript = parcel.readString();
        this.customScripts = parcel.readString();
        this.parsedCustomScripts = parcel.readString();
        this.logoURL = parcel.readString();
        this.checkLoginPath = parcel.readString();
    }

    public static Bot getBotObject(String str) {
        Bot bot = new Bot();
        JSONObject jSONObject = new JSONObject(str);
        bot.setAllSettings(JsonParser.parseString(str).getAsJsonObject());
        bot.setGlobalSettings(bot.allSettings.has("globalSettings") ? bot.allSettings.getAsJsonObject("globalSettings") : new JsonObject());
        bot.setBotId(jSONObject.optInt("id"));
        bot.setMerchantId(jSONObject.optInt("merchantId"));
        bot.setMerchantName(jSONObject.optString("merchantName"));
        bot.setTheme(jSONObject.optString("theme"));
        bot.setLoginUrl(parseString(jSONObject, "loginUrl"));
        bot.setPaymentUrl(parseString(jSONObject, "paymentUrl"));
        bot.setLoggedInUrl(parseString(jSONObject, "loggedInUrl"));
        bot.setScript(parseString(jSONObject, "script"));
        bot.setLoginScript(parseString(jSONObject, "loginScript"));
        bot.setLoggedInScript(parseString(jSONObject, "loggedInScript"));
        bot.setPath(parseString(jSONObject, "path"));
        bot.setLoginPath(parseString(jSONObject, "loginPath"));
        bot.setCallbackUrl(parseString(jSONObject, UrlParserKt.masterCardCallback));
        bot.setCallbackScript(parseString(jSONObject, "callbackScript"));
        bot.setCallbackPath(parseString(jSONObject, "callbackPath"));
        bot.setCustomLoginScript(parseString(jSONObject, "customLoginScript"));
        bot.setCheckLoginScript(parseString(jSONObject, "checkLoginScript"));
        bot.setCustomScripts(parseString(jSONObject, "customScripts"));
        bot.setParsedCustomScripts(parseString(jSONObject, "parsedCustomScripts"));
        bot.setLogoURL(parseString(jSONObject, "logoURL"));
        bot.setCheckLoginPath(parseString(jSONObject, "checkLoginPath"));
        bot.setDetached(Boolean.valueOf(jSONObject.optBoolean("isDetached")));
        return bot;
    }

    public static int parseBoolean(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(jSONObject.getString(str).toLowerCase()) != 0 ? 1 : 0;
        } catch (NumberFormatException e) {
            e.getMessage();
            try {
                return Boolean.parseBoolean(jSONObject.getString(str)) ? 1 : 0;
            } catch (JSONException e2) {
                e2.getMessage();
                return 0;
            }
        } catch (JSONException e3) {
            e3.getMessage();
            return 0;
        }
    }

    public static String parseString(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }

    public static List<String> parseStringArray(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str)) {
            return new ArrayList();
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            e.getMessage();
            return new ArrayList();
        }
    }

    public boolean androidLoggedInUrlSameAs(String str) {
        if (!isAndroidLoggedInUrlRegexSet()) {
            return (str == null || getAndroidLoggedInUrl() == null || getAndroidLoggedInUrl().isEmpty() || !str.equals(getAndroidLoggedInUrl())) ? false : true;
        }
        try {
            return Pattern.compile(hasAndroidLoggedInUrlRegex() ? getAndroidLoggedInUrlRegex() : getAndroidLoggedInUrl()).matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public boolean checkEmailLinkIsValid(String str) {
        try {
            if (isLoginLinkRegexSet()) {
                return Pattern.compile(getLoginLinkRegex()).matcher(str).matches();
            }
        } catch (PatternSyntaxException | Exception unused) {
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JsonObject fetchGlobalSettings() {
        JsonObject allSettings = getAllSettings();
        if (allSettings == null || !allSettings.has("globalSettings")) {
            return null;
        }
        return allSettings.getAsJsonObject("globalSettings");
    }

    public boolean genericLoggedInUrlSameAs(String str) {
        if (!isLoggedInUrlRegexSet()) {
            return str != null && hasLoggedInUrl() && str.equals(this.loggedInUrl);
        }
        try {
            return Pattern.compile(hasLoggedInUrlRegex() ? getLoggedInUrlRegex() : this.loggedInUrl).matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public String getAccountsHost() {
        try {
            return this.allSettings.get("accountsHost").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public JsonObject getAllSettings() {
        return this.allSettings;
    }

    public boolean getAllowChromeClientWindow() {
        if (this.allSettings.has("allowChromeClientWindow")) {
            return this.allSettings.get("allowChromeClientWindow").getAsBoolean();
        }
        return false;
    }

    public String getAmazonPopUpUserAgent() {
        try {
            return this.allSettings.get("amazonPopUpUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getAmazonUserAgent() {
        try {
            return this.allSettings.get("amazonUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getAndroidChromeScriptTriggers() {
        try {
            return this.allSettings.get("androidChromeScriptTriggers").getAsJsonObject().toString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getAndroidFbSSO() {
        try {
            return this.allSettings.get("androidFbSso").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getAndroidLoggedInUrl() {
        try {
            return this.allSettings.get("androidLoggedInUrl").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getAndroidLoggedInUrlRegex() {
        try {
            return this.allSettings.get("androidLoggedInUrlRegex").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public List<PageActions> getAndroidPageActions() {
        try {
            if (getAllSettings().get("androidPageActions") == null) {
                return null;
            }
            JsonArray asJsonArray = getAllSettings().get("androidPageActions").getAsJsonArray();
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add((PageActions) this.gson.fromJson(it.next(), PageActions.class));
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getAndroidPaymentUrl() {
        try {
            return this.allSettings.get("androidPaymentUrl").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getAndroidSSOGlobal() {
        String asString;
        JsonElement parseString;
        try {
            if (!getGlobalSettings().has("android_sso") || (asString = getGlobalSettings().get("android_sso").getAsString()) == null || (parseString = JsonParser.parseString(asString)) == null || !parseString.isJsonObject()) {
                return Constants.androidSSOUserAgent;
            }
            JsonObject asJsonObject = parseString.getAsJsonObject();
            return asJsonObject.has("user_agent") ? asJsonObject.get("user_agent").toString().replace("\"", "") : Constants.androidSSOUserAgent;
        } catch (Exception e) {
            e.getMessage();
            return Constants.androidSSOUserAgent;
        }
    }

    public String getAndroidScriptTriggers() {
        try {
            return this.allSettings.get("androidScriptTriggers").getAsJsonObject().toString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getAndroidUserAgent() {
        try {
            return this.allSettings.get("androidUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public JsonElement getBlockedUrls() {
        return Helper.getJsonParam(this, "block_requests", "block_requests");
    }

    public int getBotId() {
        return this.botId;
    }

    public String getCallbackPath() {
        return this.callbackPath;
    }

    public String getCallbackScript() {
        return this.callbackScript;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public Boolean getCheckLocalStorage() {
        try {
            return Boolean.valueOf(this.allSettings.get("checkLocalStorage").getAsBoolean());
        } catch (Exception e) {
            e.getMessage();
            return Boolean.FALSE;
        }
    }

    public String getCheckLoginPath() {
        return this.checkLoginPath;
    }

    public String getCheckLoginScript() {
        return this.checkLoginScript;
    }

    public Boolean getCheckSessionStorage() {
        try {
            return Boolean.valueOf(this.allSettings.get("checkSessionStorage").getAsBoolean());
        } catch (Exception e) {
            e.getMessage();
            return Boolean.FALSE;
        }
    }

    public String getChromeDisableLinks() {
        try {
            return this.allSettings.get("ChromeDisableLinks").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getChromeRemoveElements() {
        try {
            return this.allSettings.get("ChromeRemoveElements").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean getCleanCookies() {
        try {
            return getAllSettings().get("getCleanCookies").getAsBoolean();
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public String getConfirmationErrorMessage() {
        try {
            return this.allSettings.get("confirmationErrorMessage").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getConfirmationErrorTitle() {
        try {
            return this.allSettings.get("confirmationErrorTitle").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getCookieActions() {
        try {
            return this.allSettings.get("cookiesActions").toString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean getCredentialTracking() {
        if (this.allSettings.has("credentialTracking")) {
            return this.allSettings.get("credentialTracking").getAsBoolean();
        }
        return false;
    }

    public String getCustomLoginScript() {
        return this.customLoginScript;
    }

    public String getCustomScripts() {
        return this.customScripts;
    }

    public String getCustomUserAgent() {
        try {
            return this.allSettings.get("userAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public Boolean getDetached() {
        return this.isDetached;
    }

    public String getDisableLinks() {
        try {
            return this.allSettings.get("disableLinks").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean getDisableWorkflowValidation() {
        try {
            if (this.allSettings.has("disableWorkflowValidation")) {
                return this.allSettings.get("disableWorkflowValidation").getAsBoolean();
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public List<String> getDisabledWorkflowTriggers() {
        try {
            if (this.allSettings.has("disableWorkflowTrigger")) {
                return Helper.convertJsonArrayToList(this.allSettings.get("disableWorkflowTrigger").getAsJsonArray());
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return new ArrayList();
    }

    public ErrorViewActions getErrorViewActions() {
        try {
            if (getAllSettings().get("errorViewActions") == null) {
                return null;
            }
            JsonObject asJsonObject = getAllSettings().get("errorViewActions").getAsJsonObject();
            ErrorViewActions errorViewActions = new ErrorViewActions();
            errorViewActions.setUrl(asJsonObject.get("url").getAsString());
            errorViewActions.setIsUrlRegex(asJsonObject.get("isUrlRegex").getAsBoolean());
            errorViewActions.setErrorView(asJsonObject.get("errorView").getAsJsonObject());
            return errorViewActions;
        } catch (Exception unused) {
            return null;
        }
    }

    public String getFacebookPopUpUserAgent() {
        try {
            return this.allSettings.get("PopUpUserAgentFacebook").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getFacebookUserAgent() {
        try {
            return this.allSettings.get("facebookUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public JsonObject getGlobalSettings() {
        return this.globalSettings;
    }

    public String getGooglePopUpUserAgent() {
        try {
            return this.allSettings.get("googlePopUpUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getGoogleUserAgent() {
        try {
            return this.allSettings.get("googleUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean getHasLocalStorage() {
        return (getIsUsingLocalStorage() == null || getIsUsingLocalStorage().isEmpty() || getIsUsingLocalStorage().equals("null")) ? false : true;
    }

    public boolean getHasSessionStorage() {
        return (getIsUsingSessionStorage() == null || getIsUsingSessionStorage().isEmpty() || getIsUsingSessionStorage().equals("null")) ? false : true;
    }

    public String getHiddenPagesPattern() {
        try {
            return this.allSettings.get("hiddenPagesPattern").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getHomePage() {
        try {
            return this.allSettings.get("homePage").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getIgnoreDomains() {
        try {
            return getAllSettings().has("ignoreDomains") ? getAllSettings().get("ignoreDomains").getAsString() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public String getInterceptIntentUrl() {
        try {
            return this.allSettings.get("interceptIntentUrl").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public List<Interceptor> getInterceptorRules() {
        if (!this.interceptorsList.isEmpty()) {
            return this.interceptorsList;
        }
        try {
            Iterator<JsonElement> it = getAllSettings().get("interceptor").getAsJsonArray().iterator();
            while (it.hasNext()) {
                this.interceptorsList.add((Interceptor) this.gson.fromJson(it.next(), Interceptor.class));
            }
            return this.interceptorsList;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public int getIsAndroidLoggedInUrlRegex() {
        try {
            return this.allSettings.get("isAndroidLoggedInUrlRegex").getAsInt();
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public int getIsLoggedInUrlRegex() {
        try {
            return this.allSettings.get("isLoggedInUrlRegex").getAsInt();
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public String getIsUsingLocalStorage() {
        try {
            return this.allSettings.get("isUsingLocalStorage").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getIsUsingSessionStorage() {
        try {
            return this.allSettings.get("isUsingSessionStorage").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getLocalStorageRequiredProps() {
        try {
            if (this.allSettings.has("localStorageRequiredProps")) {
                return Helper.convertJsonArrayToString(this.allSettings.getAsJsonArray("localStorageRequiredProps"));
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public String getLogInUrlRegex() {
        try {
            return this.allSettings.get("logInUrlRegex").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getLoggedInPredicate() {
        try {
            return this.allSettings.get("loggedInPredicate").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getLoggedInScript() {
        return this.loggedInScript;
    }

    public String getLoggedInUrl() {
        return this.loggedInUrl;
    }

    public String getLoggedInUrlRegex() {
        try {
            return this.allSettings.get("loggedInUrlRegex").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getLoginLinkRegex() {
        try {
            return this.allSettings.get("loginLinkRegex").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getLoginPath() {
        return this.loginPath;
    }

    public String getLoginScript() {
        return this.loginScript;
    }

    public String getLoginType() {
        try {
            return this.allSettings.get("loginType").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getLoginUrl() {
        return this.loginUrl;
    }

    public String getLoginUrlAndroid() {
        try {
            return this.allSettings.get("loginUrlAndroid").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getLogoURL() {
        return this.logoURL;
    }

    public int getMerchantCount() {
        return this.merchantCount;
    }

    public int getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getNoSubscriptionUrl() {
        try {
            return this.allSettings.get("noSubscriptionUrl").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getParsedCustomScripts() {
        return this.parsedCustomScripts;
    }

    public String getPath() {
        return this.path;
    }

    public String getPaymentUrl() {
        return this.paymentUrl;
    }

    public String getPaymentUrlAndroid() {
        try {
            return this.allSettings.get("paymentUrlAndroid").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getPaymentUrlRegex() {
        try {
            return this.allSettings.get("paymentUrlRegex").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getPaymentsRedirectUrl() {
        try {
            return this.allSettings.get("paymentsRedirect").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getReauthUrl() {
        try {
            return this.allSettings.get("reauthUrl").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getRemoveElements() {
        try {
            return this.allSettings.get("removeElements").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getScript() {
        return this.script;
    }

    public String getSessionStorageRequiredProps() {
        try {
            if (this.allSettings.has("sessionStorageRequiredProps")) {
                return Helper.convertJsonArrayToString(this.allSettings.getAsJsonArray("sessionStorageRequiredProps"));
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public String getSignUpPage() {
        try {
            return this.allSettings.get("signUpPage").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getSpotifyUserAgent() {
        try {
            return this.allSettings.get("SpotifyUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public JsonObject getStorageErrorViewJson() {
        String asString;
        JsonElement parseString;
        try {
            if (getGlobalSettings().has("error_view_json") && (asString = getGlobalSettings().get("error_view_json").getAsString()) != null && !asString.isEmpty() && (parseString = JsonParser.parseString(asString.replace("\\\"", "\""))) != null && parseString.isJsonObject()) {
                return parseString.getAsJsonObject();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return new JsonObject();
    }

    public JsonObject getTheme() {
        return JsonParser.parseString(this.theme).getAsJsonObject();
    }

    public String getTransactionsUrl() {
        try {
            return this.allSettings.get("transactionsUrl").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getUserAgent(KnotView knotView) {
        return isUseAndroidDefaultUserAgent() ? knotView.getSettings().getUserAgentString() : hasAndroidUserAgent() ? getAndroidUserAgent() : hasUserAgent() ? getCustomUserAgent() : Constants.operaUserAgent;
    }

    public String getVisiblePagesPattern() {
        try {
            return this.allSettings.get("visiblePagesPattern").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getXPopUpUserAgent() {
        try {
            return this.allSettings.get("xPopUpUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public String getXUserAgent() {
        try {
            return this.allSettings.get("xUserAgent").getAsString();
        } catch (Exception e) {
            e.getMessage();
            return "";
        }
    }

    public boolean hasAmazonPopUpUserAgent() {
        return (getAmazonPopUpUserAgent() == null || getAmazonPopUpUserAgent().isEmpty() || getAmazonPopUpUserAgent().equals("null")) ? false : true;
    }

    public boolean hasAmazonUserAgent() {
        return (getAmazonUserAgent() == null || getAmazonUserAgent().isEmpty() || getAmazonUserAgent().equals("null")) ? false : true;
    }

    public boolean hasAndroidLoggedInUrlRegex() {
        return (getAndroidLoggedInUrlRegex() == null || getAndroidLoggedInUrlRegex().isEmpty() || getAndroidLoggedInUrlRegex().equals("null")) ? false : true;
    }

    public boolean hasAndroidUserAgent() {
        return (getAndroidUserAgent() == null || getAndroidUserAgent().isEmpty() || getAndroidUserAgent().equals("null")) ? false : true;
    }

    public boolean hasCheckLoginScript() {
        String str = this.checkLoginScript;
        return (str == null || str.isEmpty() || this.checkLoginScript.equals("null")) ? false : true;
    }

    public boolean hasChromeDisableLinks() {
        return (getChromeDisableLinks() == null || getChromeDisableLinks().isEmpty() || getChromeDisableLinks().equals("null")) ? false : true;
    }

    public boolean hasChromeRemoveElements() {
        return (getChromeRemoveElements() == null || getChromeRemoveElements().isEmpty() || getChromeRemoveElements().equals("null")) ? false : true;
    }

    public boolean hasClearLocalAndWebStorage() {
        return getAllSettings().has("clearLocalAndWebStorage") && getAllSettings().get("clearLocalAndWebStorage").getAsBoolean();
    }

    public boolean hasCookieActions() {
        return (getCookieActions() == null || getCookieActions().isEmpty() || getCookieActions().equals("null")) ? false : true;
    }

    public boolean hasCustomLoginScript() {
        String str = this.customLoginScript;
        return (str == null || str.isEmpty() || this.customLoginScript.equals("null")) ? false : true;
    }

    public boolean hasDisableLinks() {
        return (getDisableLinks() == null || getDisableLinks().isEmpty() || getDisableLinks().equals("null")) ? false : true;
    }

    public boolean hasFacebookPopUpUserAgent() {
        return (getFacebookPopUpUserAgent() == null || getFacebookPopUpUserAgent().isEmpty() || getFacebookPopUpUserAgent().equals("null")) ? false : true;
    }

    public boolean hasFacebookUserAgent() {
        return (getFacebookUserAgent() == null || getFacebookUserAgent().isEmpty() || getFacebookUserAgent().equals("null")) ? false : true;
    }

    public boolean hasGetCleanCookies() {
        return getAllSettings().has("getCleanCookies");
    }

    public boolean hasGooglePopUpUserAgent() {
        return (getGooglePopUpUserAgent() == null || getGooglePopUpUserAgent().isEmpty() || getGooglePopUpUserAgent().equals("null")) ? false : true;
    }

    public boolean hasGoogleUserAgent() {
        return (getGoogleUserAgent() == null || getGoogleUserAgent().isEmpty() || getGoogleUserAgent().equals("null")) ? false : true;
    }

    public boolean hasHiddenPagesPattern() {
        return (getHiddenPagesPattern() == null || getHiddenPagesPattern().isEmpty() || getHiddenPagesPattern().equals("null")) ? false : true;
    }

    public boolean hasIgnoreDomains() {
        String ignoreDomains = getIgnoreDomains();
        return (ignoreDomains == null || ignoreDomains.isEmpty() || ignoreDomains.equals("null")) ? false : true;
    }

    public boolean hasLogInUrlRegex() {
        return (getLogInUrlRegex() == null || getLogInUrlRegex().isEmpty() || getLogInUrlRegex().equals("null")) ? false : true;
    }

    public boolean hasLoggedInPredicate() {
        return (getLoggedInPredicate() == null || getLoggedInPredicate().isEmpty() || getLoggedInPredicate().equals("null")) ? false : true;
    }

    public boolean hasLoggedInUrl() {
        String str = this.loggedInUrl;
        return (str == null || str.isEmpty() || this.loggedInUrl.equals("null")) ? false : true;
    }

    public boolean hasLoggedInUrlRegex() {
        return (getLoggedInUrlRegex() == null || getLoggedInUrlRegex().isEmpty() || getLoggedInUrlRegex().equals("null")) ? false : true;
    }

    public boolean hasLoginScript() {
        String str = this.loginScript;
        return (str == null || str.isEmpty() || this.loginScript.equals("null")) ? false : true;
    }

    public boolean hasNoSubscriptionUrl() {
        return (getNoSubscriptionUrl() == null || getNoSubscriptionUrl().isEmpty() || getNoSubscriptionUrl().equals("null")) ? false : true;
    }

    public boolean hasPaymentUrlAndroid() {
        return (getPaymentUrlAndroid() == null || getPaymentUrlAndroid().isEmpty() || getPaymentUrlAndroid().equals("null")) ? false : true;
    }

    public boolean hasPaymentsRedirectUrl() {
        return (getPaymentsRedirectUrl() == null || getPaymentsRedirectUrl().isEmpty() || getPaymentsRedirectUrl().equals("null")) ? false : true;
    }

    public boolean hasRemoveElements() {
        return (getRemoveElements() == null || getRemoveElements().isEmpty() || getRemoveElements().equals("null")) ? false : true;
    }

    public boolean hasRequiredCookies() {
        JsonObject asJsonObject = getAllSettings().getAsJsonObject("cookiesActions");
        return (!asJsonObject.has("requiredCookies") || asJsonObject.getAsJsonArray("requiredCookies") == null || asJsonObject.getAsJsonArray("requiredCookies").isJsonNull() || asJsonObject.getAsJsonArray("requiredCookies").isEmpty()) ? false : true;
    }

    public boolean hasSpotifyUserAgent() {
        return (getSpotifyUserAgent() == null || getSpotifyUserAgent().isEmpty() || getSpotifyUserAgent().equals("null")) ? false : true;
    }

    public boolean hasSupportDeepLinks() {
        return getAllSettings().has("supportDeepLinks");
    }

    public boolean hasUserAgent() {
        return (getCustomUserAgent() == null || getCustomUserAgent().isEmpty() || getCustomUserAgent().equals("null")) ? false : true;
    }

    public boolean hasVisiblePagesPattern() {
        String visiblePagesPattern = getVisiblePagesPattern();
        return (visiblePagesPattern == null || visiblePagesPattern.isEmpty() || visiblePagesPattern.equals("null")) ? false : true;
    }

    public boolean hasXPopUpUserAgent() {
        return (getXPopUpUserAgent() == null || getXPopUpUserAgent().isEmpty() || getXPopUpUserAgent().equals("null")) ? false : true;
    }

    public boolean hasXUserAgent() {
        return (getXUserAgent() == null || getXUserAgent().isEmpty() || getXUserAgent().equals("null")) ? false : true;
    }

    public boolean isAndroidChromeScriptTriggersSet() {
        return (getAndroidChromeScriptTriggers() == null || getAndroidChromeScriptTriggers().isEmpty() || getAndroidChromeScriptTriggers().equals("null")) ? false : true;
    }

    public boolean isAndroidLoggedInUrlRegexSet() {
        return getIsAndroidLoggedInUrlRegex() == 1 || hasAndroidLoggedInUrlRegex();
    }

    public boolean isAndroidScriptTriggersSet() {
        return (getAndroidScriptTriggers() == null || getAndroidScriptTriggers().isEmpty() || getAndroidScriptTriggers().equals("null")) ? false : true;
    }

    public boolean isCheckLoggedInInLoadResource() {
        try {
            return this.allSettings.get("checkLoggedInInLoadResource").getAsInt() == 1;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isCheckLoggedInWithAndroidUrlContains() {
        try {
            return this.allSettings.get("checkLoggedInWithAndroidUrlContains").getAsInt() == 1;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isCheckLoggedInWithAndroidUrlEquals() {
        try {
            return this.allSettings.get("checkLoggedInWithAndroidUrlEquals").getAsInt() == 1;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isCheckLoggedInWithLoggedInUrlContains() {
        try {
            return this.allSettings.get("checkLoggedInWithLoggedInUrlContains").getAsInt() == 1;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isClearLocalAndWebStorage() {
        try {
            return getAllSettings().get("clearLocalAndWebStorage").getAsBoolean();
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isCustomScriptsSet() {
        String str = this.customScripts;
        return (str == null || str.isEmpty() || this.customScripts.equals("null")) ? false : true;
    }

    public boolean isDetectLoginUsingCookiesAndLoggedInUrl() {
        try {
            return this.allSettings.get("detectLoginUsingCookiesAndLoggedInUrl").getAsInt() == 1;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isInterceptRedirectionIntent() {
        try {
            return this.allSettings.get("interceptRedirectionIntent").getAsBoolean();
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isLoadNoCacheMode() {
        try {
            return this.allSettings.get("loadNoCacheMode").getAsInt() == 1;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isLoggedInUrlRegexSet() {
        return getIsLoggedInUrlRegex() == 1 || hasLoggedInUrlRegex();
    }

    public boolean isLoginLinkRegexSet() {
        return (getLoginLinkRegex() == null || getLoginLinkRegex().isEmpty() || getLoginLinkRegex().equals("null")) ? false : true;
    }

    public boolean isLoginTypeAndroid() {
        try {
            return getLoginType().equals("android");
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isNoCORSMode() {
        try {
            return this.allSettings.get("noCorsMode").getAsBoolean();
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isPaymentUrlSet() {
        String str = this.paymentUrl;
        return (str == null || str.isEmpty() || this.paymentUrl.equals("null")) ? false : true;
    }

    public boolean isStorageRequired() {
        try {
            return getAllSettings().get("isStorageRequired").getAsBoolean();
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isSupportDeepLinks() {
        try {
            return getAllSettings().get("supportDeepLinks").getAsBoolean();
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isTransactionsUrlSet() {
        return (getTransactionsUrl() == null || getTransactionsUrl().isEmpty() || getTransactionsUrl().equals("null")) ? false : true;
    }

    public boolean isTriggerDisabled(String str) {
        if (str == null) {
            return false;
        }
        return getDisabledWorkflowTriggers().contains(str);
    }

    public boolean isUseAndroidDefaultUserAgent() {
        try {
            return this.allSettings.get("defaultUserAgent").getAsInt() == 1;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean isWorkflowValidationFeatureFlagEnabled() {
        String asString;
        JsonElement parseString;
        try {
            JsonObject jsonObject = this.globalSettings;
            if (jsonObject == null || !jsonObject.has("workflow_validation_feature_flag") || (asString = this.globalSettings.get("workflow_validation_feature_flag").getAsString()) == null || asString.isEmpty() || (parseString = JsonParser.parseString(asString)) == null || !parseString.isJsonObject()) {
                return false;
            }
            JsonObject asJsonObject = parseString.getAsJsonObject();
            if (!asJsonObject.has("flag")) {
                return false;
            }
            JsonElement jsonElement = asJsonObject.get("flag");
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
                return jsonElement.getAsBoolean();
            }
            if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isString()) {
                return !"false".equalsIgnoreCase(jsonElement.getAsString());
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public boolean logInUrlSameAs(String str) {
        if (!hasLogInUrlRegex()) {
            return str != null && hasLogInUrlRegex() && str.equals(this.loginUrl);
        }
        try {
            return Pattern.compile(hasLogInUrlRegex() ? getLogInUrlRegex() : this.loginUrl).matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public boolean loggedInUrlSameAs(String str) {
        try {
            return ((getAndroidLoggedInUrl() == null || getAndroidLoggedInUrl().isEmpty()) && !isAndroidLoggedInUrlRegexSet()) ? genericLoggedInUrlSameAs(str) : androidLoggedInUrlSameAs(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean noSubscriptionUrlSameAs(String str) {
        if (!hasNoSubscriptionUrl()) {
            return hasNoSubscriptionUrl() && getNoSubscriptionUrl() != null && (str.equals(getNoSubscriptionUrl()) || str.contains(getNoSubscriptionUrl()));
        }
        try {
            return Pattern.compile(getNoSubscriptionUrl()).matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public boolean paymentUrlSameAs(String str) {
        if (getPaymentUrlRegex() != null && !getPaymentUrlRegex().isEmpty()) {
            try {
                return Pattern.compile(getPaymentUrlRegex()).matcher(str).matches();
            } catch (PatternSyntaxException unused) {
                return false;
            }
        }
        if (isPaymentUrlSet()) {
            String paymentUrlAndroid = hasPaymentUrlAndroid() ? getPaymentUrlAndroid() : this.paymentUrl;
            return str.contains(paymentUrlAndroid) || str.startsWith(paymentUrlAndroid);
        }
        return false;
    }

    public void setAllSettings(JsonObject jsonObject) {
        this.allSettings = jsonObject;
    }

    public void setBotId(int i) {
        this.botId = i;
    }

    public void setCallbackPath(String str) {
        this.callbackPath = str;
    }

    public void setCallbackScript(String str) {
        this.callbackScript = str;
    }

    public void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public void setCheckLoginPath(String str) {
        this.checkLoginPath = str;
    }

    public void setCheckLoginScript(String str) {
        this.checkLoginScript = str;
    }

    public void setCustomLoginScript(String str) {
        this.customLoginScript = str;
    }

    public void setCustomScripts(String str) {
        this.customScripts = str;
    }

    public void setDetached(Boolean bool) {
        this.isDetached = bool;
    }

    public void setGlobalSettings(JsonObject jsonObject) {
        this.globalSettings = jsonObject;
    }

    public void setLoggedInScript(String str) {
        this.loggedInScript = str;
    }

    public void setLoggedInUrl(String str) {
        this.loggedInUrl = str;
    }

    public void setLoginPath(String str) {
        this.loginPath = str;
    }

    public void setLoginScript(String str) {
        this.loginScript = str;
    }

    public void setLoginUrl(String str) {
        this.loginUrl = str;
    }

    public void setLogoURL(String str) {
        this.logoURL = str;
    }

    public void setMerchantCount(int i) {
        this.merchantCount = i;
    }

    public void setMerchantId(int i) {
        this.merchantId = i;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setParsedCustomScripts(String str) {
        this.parsedCustomScripts = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPaymentUrl(String str) {
        this.paymentUrl = str;
    }

    public void setScript(String str) {
        this.script = str;
    }

    public void setTheme(String str) {
        this.theme = str;
    }

    public boolean shouldUseFullReverse() {
        try {
            if (this.allSettings.has("isFR")) {
                return this.allSettings.get("isFR").getAsBoolean();
            }
            return false;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.botId);
        parcel.writeInt(this.merchantId);
        parcel.writeString(this.merchantName);
        parcel.writeString(this.theme);
        parcel.writeString(this.loginUrl);
        parcel.writeString(this.paymentUrl);
        parcel.writeString(this.loggedInUrl);
        parcel.writeString(this.script);
        parcel.writeString(this.loginScript);
        parcel.writeString(this.loggedInScript);
        parcel.writeString(this.path);
        parcel.writeString(this.loginPath);
        parcel.writeString(this.callbackUrl);
        parcel.writeString(this.callbackScript);
        parcel.writeString(this.callbackPath);
        parcel.writeString(this.customLoginScript);
        parcel.writeString(this.checkLoginScript);
        parcel.writeString(this.customScripts);
        parcel.writeString(this.parsedCustomScripts);
        parcel.writeString(this.logoURL);
        parcel.writeString(this.checkLoginPath);
    }

    public String getFacebookUserAgent(String str) {
        return hasFacebookUserAgent() ? getFacebookUserAgent() : str;
    }

    public Bot() {
        Boolean bool = Boolean.FALSE;
        this.isDetached = bool;
        this.gson = new Gson();
        this.interceptorsList = new ArrayList();
        this.disabledWorkflowTriggers = new ArrayList();
        this.disableWorkflowValidation = bool;
    }
}
