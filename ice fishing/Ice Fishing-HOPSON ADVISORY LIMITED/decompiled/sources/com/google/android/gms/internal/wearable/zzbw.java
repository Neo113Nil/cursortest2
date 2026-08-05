package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbw {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzcs zzd;
    public int zze;

    zzbw() {
        int i = zzcs.zzb;
        int i2 = zzbv.zza;
        this.zzd = zzcs.zza;
    }

    static /* synthetic */ String zza(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    zzbw(zzcs zzcsVar) {
        zzcsVar.getClass();
        this.zzd = zzcsVar;
    }
}
