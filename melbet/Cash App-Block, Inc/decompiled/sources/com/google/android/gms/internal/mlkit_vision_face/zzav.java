package com.google.android.gms.internal.mlkit_vision_face;

import com.google.common.collect.CompactHashMap;

/* loaded from: classes4.dex */
public final class zzav extends CompactHashMap.Itr {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzbd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzav(zzbd zzbdVar, int i) {
        super(zzbdVar);
        this.$r8$classId = i;
        this.zza = zzbdVar;
    }

    @Override // com.google.common.collect.CompactHashMap.Itr
    public final Object zza(int i) {
        int i2 = this.$r8$classId;
        zzbd zzbdVar = this.zza;
        switch (i2) {
            case 0:
                Object[] objArr = zzbdVar.zzb;
                objArr.getClass();
                return objArr[i];
            case 1:
                return new zzbb(zzbdVar, i);
            default:
                Object[] objArr2 = zzbdVar.zzc;
                objArr2.getClass();
                return objArr2[i];
        }
    }
}
