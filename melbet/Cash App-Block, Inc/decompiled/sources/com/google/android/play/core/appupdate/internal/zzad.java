package com.google.android.play.core.appupdate.internal;

/* loaded from: classes4.dex */
public final class zzad implements zzaf {
    public static final Object zza = new Object();
    public volatile zzaf zzb;
    public volatile Object zzc;

    public static zzaf zzb(zzaf zzafVar) {
        if (zzafVar instanceof zzad) {
            return zzafVar;
        }
        zzad zzadVar = new zzad();
        zzadVar.zzc = zza;
        zzadVar.zzb = zzafVar;
        return zzadVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        Object obj;
        Object obj2 = this.zzc;
        Object obj3 = zza;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.zzc;
                if (obj == obj3) {
                    obj = this.zzb.zza();
                    Object obj4 = this.zzc;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
