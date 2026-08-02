package com.google.android.play.core.integrity.model;

import bo.app.re$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        Integer m = re$$ExternalSyntheticOutline0.m(-2, (Integer) (-1), "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n", "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n", hashMap);
        Integer m2 = re$$ExternalSyntheticOutline0.m(-4, (Integer) (-3), "Network error: unable to obtain integrity details.\nRecommended actions:\n1) Ask the user to check and enable their network connection.\n2) For a guided user experience to help the user establish a network connection, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n", hashMap);
        Integer m3 = re$$ExternalSyntheticOutline0.m(-6, (Integer) (-5), "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n", "Google Play Services is not available or version is too old.\nRecommended actions:\n1) Ask the user to install or update Play Services.\n2) For a guided user experience that helps the user to enable, install or update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", hashMap);
        Integer m4 = re$$ExternalSyntheticOutline0.m(-8, (Integer) (-7), "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n", "The calling app has made too many requests to the API and has been throttled, or your app has exceeded its daily request quota.\nRetry with an exponential backoff. Request an increase to your daily request quota if you're at your daily request limit.\n", hashMap);
        Integer m5 = re$$ExternalSyntheticOutline0.m(-10, (Integer) (-9), "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n", "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n", hashMap);
        Integer m6 = re$$ExternalSyntheticOutline0.m(-12, (Integer) (-11), "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n", "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", hashMap);
        Integer m7 = re$$ExternalSyntheticOutline0.m(-14, (Integer) (-13), "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n", "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n", hashMap);
        Integer m8 = re$$ExternalSyntheticOutline0.m(-16, (Integer) (-15), "Play Services needs to be updated.\nRecommended actions:\n1) Ask the user to update Google Play Services.\n2) For a guided user experience that helps the user to update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n", hashMap);
        Integer m9 = re$$ExternalSyntheticOutline0.m(-17, (Integer) (-100), "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", "There is a transient error on the calling device.\nRetry with an exponential backoff.\n", hashMap);
        hashMap2.put(-1, "API_NOT_AVAILABLE");
        hashMap2.put(-3, "NETWORK_ERROR");
        hashMap2.put(m, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(m2, "PLAY_STORE_ACCOUNT_NOT_FOUND");
        hashMap2.put(m7, "PLAY_STORE_VERSION_OUTDATED");
        hashMap2.put(-5, "APP_NOT_INSTALLED");
        hashMap2.put(m3, "PLAY_SERVICES_NOT_FOUND");
        hashMap2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        hashMap2.put(-7, "APP_UID_MISMATCH");
        hashMap2.put(m4, "TOO_MANY_REQUESTS");
        hashMap2.put(-9, "CANNOT_BIND_TO_SERVICE");
        hashMap2.put(m5, "NONCE_TOO_SHORT");
        hashMap2.put(-11, "NONCE_TOO_LONG");
        hashMap2.put(-13, "NONCE_IS_NOT_BASE64");
        hashMap2.put(m8, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        hashMap2.put(m6, "GOOGLE_SERVER_UNAVAILABLE");
        hashMap2.put(-100, "INTERNAL_ERROR");
        hashMap2.put(m9, "CLIENT_TRANSIENT_ERROR");
    }
}
