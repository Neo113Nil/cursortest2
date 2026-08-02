package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzboo implements zzbok {
    public static final Object zza = new Object();
    public volatile zzez zzb;
    public volatile Object zzc;

    @Override // com.google.android.libraries.places.internal.zzcli
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        if (this.zzb == null) {
            return this.zzc;
        }
        zzfa zzfaVar = new zzfa();
        this.zzc = zzfaVar;
        this.zzb = null;
        return zzfaVar;
    }
}
