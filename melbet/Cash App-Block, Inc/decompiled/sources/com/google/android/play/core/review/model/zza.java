package com.google.android.play.core.review.model;

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
        Integer m = re$$ExternalSyntheticOutline0.m(-2, (Integer) (-1), "The Play Store app is either not installed or not the official version.", "Call first requestReviewFlow to get the ReviewInfo.", hashMap);
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(m, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }
}
