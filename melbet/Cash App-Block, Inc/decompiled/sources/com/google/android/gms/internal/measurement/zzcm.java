package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzcm extends zzbm implements zzcs {
    public final AtomicReference zza;
    public boolean zzb;

    public zzcm() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.zza = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object zzf(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", CameraSelector$$ExternalSyntheticOutline0.m("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbn.zzb(parcel, Bundle.CREATOR);
        zzbn.zzf(parcel);
        zzb(bundle);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzcs
    public final void zzb(Bundle bundle) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.zzb = true;
                } finally {
                    this.zza.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzc(long j) {
        return (String) zzf(zze(j), String.class);
    }

    public final Long zzd() {
        return (Long) zzf(zze(500L), Long.class);
    }

    public final Bundle zze(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            if (!this.zzb) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.zza.get();
        }
        return bundle;
    }
}
