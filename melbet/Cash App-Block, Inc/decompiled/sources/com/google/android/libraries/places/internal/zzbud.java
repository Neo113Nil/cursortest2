package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbud implements Runnable {
    public final Runnable zza;
    public boolean zzb;
    public boolean zzc;

    public zzbud(Runnable runnable) {
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zzc = true;
        this.zza.run();
    }
}
