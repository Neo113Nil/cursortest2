package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class zzaag {
    public final String zza;

    public /* synthetic */ zzaag(String str) {
        this.zza = str;
    }

    public abstract boolean zzb(Level level);

    public abstract void zzc(zzxq zzxqVar);

    public void zzd(RuntimeException runtimeException, zzxq zzxqVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
