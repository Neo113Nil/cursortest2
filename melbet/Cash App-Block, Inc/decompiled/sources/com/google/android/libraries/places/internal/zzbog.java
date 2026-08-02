package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbog implements zzbok {
    public static final Object zza = new Object();
    public volatile zzboh zzb;
    public volatile Object zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public static zzbog zza(zzboh zzbohVar) {
        if (zzbohVar instanceof zzbog) {
            return (zzbog) zzbohVar;
        }
        zzbog zzbogVar = new zzbog();
        zzbogVar.zzc = zza;
        zzbogVar.zzb = zzbohVar;
        return zzbogVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.zzc;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object zzb = this.zzb.zzb();
                Object obj4 = this.zzc;
                if (obj4 != obj2 && obj4 != zzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + zzb + ". This is likely due to a circular dependency.");
                }
                this.zzc = zzb;
                this.zzb = null;
                return zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
