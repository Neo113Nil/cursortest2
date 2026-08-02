package com.google.android.gms.internal.mlkit_vision_face;

import com.squareup.util.Strings;
import java.util.AbstractMap;

/* loaded from: classes4.dex */
public final class zzcd extends zzbn {
    public final /* synthetic */ zzce zza;

    public zzcd(zzce zzceVar) {
        this.zza = zzceVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzce zzceVar = this.zza;
        Strings.zza(i, zzceVar.zzc);
        int i2 = i + i;
        Object[] objArr = zzceVar.zzb;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
