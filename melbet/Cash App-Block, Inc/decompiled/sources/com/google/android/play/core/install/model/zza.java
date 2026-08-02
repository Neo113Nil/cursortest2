package com.google.android.play.core.install.model;

import bo.app.re$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class zza {
    public static final HashMap zza;
    public static final HashMap zzb;

    static {
        HashMap hashMap = new HashMap();
        zza = hashMap;
        HashMap hashMap2 = new HashMap();
        zzb = hashMap2;
        Integer m = re$$ExternalSyntheticOutline0.m(-3, (Integer) (-2), "An unknown error occurred.", "The API is not available on this device.", hashMap);
        Integer m2 = re$$ExternalSyntheticOutline0.m(-5, (Integer) (-4), "The request that was sent by the app is malformed.", "The install is unavailable to this user or device.", hashMap);
        Integer m3 = re$$ExternalSyntheticOutline0.m(-7, (Integer) (-6), "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", "The install/update has not been (fully) downloaded yet.", hashMap);
        Integer m4 = re$$ExternalSyntheticOutline0.m(-9, (Integer) (-8), "The install is already in progress and there is no UI flow to resume.", "The Play Store app is either not installed or not the official version.", hashMap);
        Integer m5 = re$$ExternalSyntheticOutline0.m(-100, (Integer) (-10), "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "An internal error happened in the Play Store.", hashMap);
        hashMap2.put(-2, "ERROR_UNKNOWN");
        hashMap2.put(m, "ERROR_API_NOT_AVAILABLE");
        hashMap2.put(-4, "ERROR_INVALID_REQUEST");
        hashMap2.put(m2, "ERROR_INSTALL_UNAVAILABLE");
        hashMap2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        hashMap2.put(m3, "ERROR_DOWNLOAD_NOT_PRESENT");
        hashMap2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        hashMap2.put(m5, "ERROR_INTERNAL_ERROR");
        hashMap2.put(m4, "ERROR_PLAY_STORE_NOT_FOUND");
        hashMap2.put(-10, "ERROR_APP_NOT_OWNED");
        hashMap2.put(m5, "ERROR_INTERNAL_ERROR");
    }
}
