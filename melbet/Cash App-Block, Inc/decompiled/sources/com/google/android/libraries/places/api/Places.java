package com.google.android.libraries.places.api;

import android.content.Context;
import androidx.tracing.Trace;
import com.fillr.e0;
import com.google.android.libraries.places.internal.zzfz;
import com.google.android.libraries.places.internal.zzmx;
import com.google.android.libraries.places.internal.zzmy;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zznq;
import com.google.android.libraries.places.internal.zznv;

/* loaded from: classes4.dex */
public abstract class Places {
    public static final zznj zza = new zznj();

    public static synchronized e0 createClient(Context context) {
        e0 zzb;
        synchronized (Places.class) {
            try {
                zzb = zzb(context, zznq.zzd(context).zze());
            } catch (Error | RuntimeException e) {
                zznv.zzb(e);
                throw e;
            }
        }
        return zzb;
    }

    public static synchronized boolean isInitialized() {
        boolean zzb;
        synchronized (Places.class) {
            try {
                zzb = zza.zzb();
            } catch (Error | RuntimeException e) {
                zznv.zzb(e);
                throw e;
            }
        }
        return zzb;
    }

    public static synchronized void zza(Context context, String str, boolean z) {
        synchronized (Places.class) {
            try {
                Trace.checkArgument("API Key must not be empty.", !str.isEmpty());
                zznv.zza(context.getApplicationContext());
                zza.zza(str, z);
            } catch (Error | RuntimeException e) {
                zznv.zzb(e);
                throw e;
            }
        }
    }

    public static synchronized e0 zzb(Context context, zznq zznqVar) {
        e0 zzc;
        synchronized (Places.class) {
            try {
                Trace.checkState("Places must be initialized first.", isInitialized());
                zzfz zzfzVar = zzmy.zza;
                zzc = new zzmx(context, zznqVar).zzc();
            } catch (Error | RuntimeException e) {
                zznv.zzb(e);
                throw e;
            }
        }
        return zzc;
    }
}
