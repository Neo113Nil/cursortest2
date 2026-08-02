package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.common.collect.CompactHashMap;

/* loaded from: classes4.dex */
public final class zzbz extends CompactHashMap.Itr {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzci zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzbz(zzci zzciVar, int i) {
        super(zzciVar);
        this.$r8$classId = i;
        this.zza = zzciVar;
    }

    @Override // com.google.common.collect.CompactHashMap.Itr
    public final Object zza(int i) {
        int i2 = this.$r8$classId;
        zzci zzciVar = this.zza;
        switch (i2) {
            case 0:
                Object obj = zzci.zzd;
                return zzciVar.zzB()[i];
            case 1:
                return new zzcg(zzciVar, i);
            default:
                Object obj2 = zzci.zzd;
                return zzciVar.zzC()[i];
        }
    }
}
