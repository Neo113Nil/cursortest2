package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.room.Room;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics zza;
    public final zzez zzb;

    public FirebaseAnalytics(zzez zzezVar) {
        zzae.checkNotNull(zzezVar);
        this.zzb = zzezVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (zza == null) {
                        zza = new FirebaseAnalytics(zzez.zza(context, null));
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static zzlk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzez zza2 = zzez.zza(context, bundle);
        if (zza2 == null) {
            return null;
        }
        return new zzd(zza2);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = FirebaseInstallations.lockGenerateFid;
            return (String) Room.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e);
            return null;
        } catch (ExecutionException e2) {
            OptionalProvider$$ExternalSyntheticLambda0.m(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void logEvent(Bundle bundle, String str) {
        zzez zzezVar = this.zzb;
        zzezVar.getClass();
        zzezVar.zzV(new zzdz(zzezVar, (String) null, str, bundle, false));
    }

    public final void setAnalyticsCollectionEnabled() {
        Boolean bool = Boolean.TRUE;
        zzez zzezVar = this.zzb;
        zzezVar.getClass();
        zzezVar.zzV(new zzdf(zzezVar, bool));
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        zzdd zza2 = zzdd.zza(activity);
        zzez zzezVar = this.zzb;
        zzezVar.getClass();
        zzezVar.zzV(new zzdh(zzezVar, zza2, str, str2));
    }
}
