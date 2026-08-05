package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzed {
    private static final zzej zzb = new zzeb();
    private final zzej zza;

    public zzed() {
        zzej zzejVar = zzb;
        int i = zzbv.zza;
        this.zza = new zzec(zzda.zza(), zzejVar);
    }

    public final zzey zza(Class cls) {
        int i = zzez.zza;
        if (!zzdg.class.isAssignableFrom(cls)) {
            int i2 = zzbv.zza;
        }
        zzei zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            int i3 = zzbv.zza;
            return zzep.zzh(zzez.zzA(), zzcv.zza(), zzc.zzb());
        }
        int i4 = zzbv.zza;
        return zzeo.zzm(cls, zzc, zzer.zza(), zzdz.zza(), zzez.zzA(), zzc.zzc() + (-1) != 1 ? zzcv.zza() : null, zzeh.zza());
    }
}
