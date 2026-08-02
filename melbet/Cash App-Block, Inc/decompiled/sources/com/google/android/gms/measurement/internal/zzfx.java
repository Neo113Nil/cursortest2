package com.google.android.gms.measurement.internal;

import androidx.core.os.BundleKt;
import app.cash.trifle.Trifle;

/* loaded from: classes.dex */
public final class zzfx {
    public static final Object zze = new Object();
    public final String zza;
    public final zzbo zzb;
    public final Object zzc;
    public final Object zzd = new Object();
    public volatile Object zzg = null;

    public /* synthetic */ zzfx(String str, Object obj, zzbo zzboVar) {
        this.zza = str;
        this.zzc = obj;
        this.zzb = zzboVar;
    }

    public final Object zzb(Object obj) {
        synchronized (this.zzd) {
        }
        if (obj != null) {
            return obj;
        }
        if (BundleKt.zza == null) {
            return this.zzc;
        }
        synchronized (zze) {
            try {
                if (Trifle.zza()) {
                    return this.zzg == null ? this.zzc : this.zzg;
                }
                try {
                    for (zzfx zzfxVar : zzfy.zzbk) {
                        if (Trifle.zza()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object obj2 = null;
                        try {
                            zzbo zzboVar = zzfxVar.zzb;
                            if (zzboVar != null) {
                                obj2 = zzboVar.mo1425zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zze) {
                            zzfxVar.zzg = obj2;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                zzbo zzboVar2 = this.zzb;
                if (zzboVar2 != null) {
                    try {
                        return zzboVar2.mo1425zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.zzc;
            } finally {
            }
        }
    }
}
