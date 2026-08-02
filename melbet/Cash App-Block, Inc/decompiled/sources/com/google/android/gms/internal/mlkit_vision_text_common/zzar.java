package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.common.collect.CompactHashMap;

/* loaded from: classes4.dex */
public final class zzar extends CompactHashMap.Itr {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzba zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzar(zzba zzbaVar, int i) {
        super(zzbaVar);
        this.$r8$classId = i;
        this.zza = zzbaVar;
    }

    @Override // com.google.common.collect.CompactHashMap.Itr
    public final Object zza(int i) {
        int i2 = this.$r8$classId;
        zzba zzbaVar = this.zza;
        switch (i2) {
            case 0:
                Object obj = zzba.zzd;
                return zzbaVar.zzB()[i];
            case 1:
                return new zzay(zzbaVar, i);
            default:
                Object obj2 = zzba.zzd;
                return zzbaVar.zzC()[i];
        }
    }
}
