package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzaii implements zzhp {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzajh zza;

    public /* synthetic */ zzaii(zzajh zzajhVar, int i) {
        this.$r8$classId = i;
        this.zza = zzajhVar;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzhp
    public final Object zza(Object obj) {
        int i = this.$r8$classId;
        zzajh zzajhVar = this.zza;
        zzct zzctVar = (zzct) obj;
        switch (i) {
            case 0:
                zzer zzb = zzajhVar.zzb(zzajhVar.zza, zzctVar);
                zzajhVar.zze = zzb;
                return zzb;
            default:
                zzajhVar.zzd = zzctVar;
                return zzctVar;
        }
    }
}
