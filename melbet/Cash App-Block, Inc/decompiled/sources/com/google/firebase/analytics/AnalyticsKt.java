package com.google.firebase.analytics;

import com.google.firebase.FirebaseApp;

/* loaded from: classes4.dex */
public abstract class AnalyticsKt {
    public static volatile FirebaseAnalytics zza;
    public static final Object zzb = new Object();

    public static final FirebaseAnalytics getAnalytics() {
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    FirebaseApp firebaseApp = FirebaseApp.getInstance();
                    firebaseApp.checkNotDeleted();
                    zza = FirebaseAnalytics.getInstance(firebaseApp.applicationContext);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        firebaseAnalytics.getClass();
        return firebaseAnalytics;
    }
}
