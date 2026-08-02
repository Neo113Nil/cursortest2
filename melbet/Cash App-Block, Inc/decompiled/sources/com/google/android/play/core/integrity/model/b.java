package com.google.android.play.core.integrity.model;

import bo.app.re$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        Integer m = re$$ExternalSyntheticOutline0.m(-2, (Integer) (-1), "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n", "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n", hashMap);
        Integer m2 = re$$ExternalSyntheticOutline0.m(-5, (Integer) (-3), "Network error: unable to obtain integrity details.\nRecommended actions:\n1) Ask the user to check and enable their network connection.\n2) For a guided user experience to help the user establish a network connection, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n", hashMap);
        Integer m3 = re$$ExternalSyntheticOutline0.m(-7, (Integer) (-6), "Google Play Services is not available or version is too old.\nRecommended actions:\n1) Ask the user to install or update Play Services.\n2) For a guided user experience that helps the user to enable, install or update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n", hashMap);
        Integer m4 = re$$ExternalSyntheticOutline0.m(-9, (Integer) (-8), "The calling app has made too many requests to the API and has been throttled, or your app has exceeded its daily request quota.\nRetry with an exponential backoff. Request an increase to your daily request quota if you're at your daily request limit.\n", "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n", hashMap);
        Integer m5 = re$$ExternalSyntheticOutline0.m(-14, (Integer) (-12), "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n", hashMap);
        Integer m6 = re$$ExternalSyntheticOutline0.m(-16, (Integer) (-15), "Play Services needs to be updated.\nRecommended actions:\n1) Ask the user to update Google Play Services.\n2) For a guided user experience that helps the user to update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n", "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n", hashMap);
        Integer m7 = re$$ExternalSyntheticOutline0.m(-18, (Integer) (-17), "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.", "There is a transient error on the calling device.\nRetry with an exponential backoff.\n", hashMap);
        Integer m8 = re$$ExternalSyntheticOutline0.m(-100, (Integer) (-19), "The StandardIntegrityTokenProvider is invalid (e.g. it is outdated).\nRequest a new integrity token provider by calling StandardIntegrityManager#prepareIntegrityToken.", "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", hashMap);
        hashMap2.put(-1, "API_NOT_AVAILABLE");
        hashMap2.put(-3, "NETWORK_ERROR");
        hashMap2.put(m, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(m5, "PLAY_STORE_VERSION_OUTDATED");
        hashMap2.put(m2, "APP_NOT_INSTALLED");
        hashMap2.put(-6, "PLAY_SERVICES_NOT_FOUND");
        hashMap2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        hashMap2.put(m3, "APP_UID_MISMATCH");
        hashMap2.put(-8, "TOO_MANY_REQUESTS");
        hashMap2.put(m4, "CANNOT_BIND_TO_SERVICE");
        hashMap2.put(m6, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        hashMap2.put(-17, "REQUEST_HASH_TOO_LONG");
        hashMap2.put(-12, "GOOGLE_SERVER_UNAVAILABLE");
        hashMap2.put(m7, "CLIENT_TRANSIENT_ERROR");
        hashMap2.put(-19, "INTEGRITY_TOKEN_PROVIDER_INVALID");
        hashMap2.put(m8, "INTERNAL_ERROR");
    }
}
