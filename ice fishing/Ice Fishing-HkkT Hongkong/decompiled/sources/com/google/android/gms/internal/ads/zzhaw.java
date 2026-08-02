package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzhaw implements zzhbz {
    private static final zzhbc zza = new zzhau();
    private final zzhbc zzb;

    public zzhaw() {
        zzhbc zzhbcVar;
        zzhbc[] zzhbcVarArr = new zzhbc[2];
        zzhbcVarArr[0] = zzgzo.zza();
        try {
            zzhbcVar = (zzhbc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzhbcVar = zza;
        }
        zzhbcVarArr[1] = zzhbcVar;
        zzhav zzhavVar = new zzhav(zzhbcVarArr);
        byte[] bArr = zzhae.zzd;
        this.zzb = zzhavVar;
    }

    private static boolean zzb(zzhbb zzhbbVar) {
        return zzhbbVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhbz
    public final zzhby zza(Class cls) {
        zzhca.zzr(cls);
        zzhbb zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzgzu.class.isAssignableFrom(cls) ? zzhbi.zzc(zzhca.zzn(), zzgzi.zzb(), zzb.zza()) : zzhbi.zzc(zzhca.zzm(), zzgzi.zza(), zzb.zza()) : zzgzu.class.isAssignableFrom(cls) ? zzb(zzb) ? zzhbh.zzl(cls, zzb, zzhbk.zzb(), zzhas.zze(), zzhca.zzn(), zzgzi.zzb(), zzhba.zzb()) : zzhbh.zzl(cls, zzb, zzhbk.zzb(), zzhas.zze(), zzhca.zzn(), null, zzhba.zzb()) : zzb(zzb) ? zzhbh.zzl(cls, zzb, zzhbk.zza(), zzhas.zzd(), zzhca.zzm(), zzgzi.zza(), zzhba.zza()) : zzhbh.zzl(cls, zzb, zzhbk.zza(), zzhas.zzd(), zzhca.zzm(), null, zzhba.zza());
    }
}
