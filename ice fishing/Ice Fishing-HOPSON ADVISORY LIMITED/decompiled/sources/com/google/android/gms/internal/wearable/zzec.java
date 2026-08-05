package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzec implements zzej {
    private final zzej[] zza;

    zzec(zzej... zzejVarArr) {
        this.zza = zzejVarArr;
    }

    @Override // com.google.android.gms.internal.wearable.zzej
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.wearable.zzej
    public final zzei zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzej zzejVar = this.zza[i];
            if (zzejVar.zzb(cls)) {
                return zzejVar.zzc(cls);
            }
        }
        String name = cls.getName();
        String.valueOf(name);
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(name)));
    }
}
