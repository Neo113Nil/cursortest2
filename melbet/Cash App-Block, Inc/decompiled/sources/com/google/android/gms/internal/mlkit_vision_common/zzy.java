package com.google.android.gms.internal.mlkit_vision_common;

import androidx.room.util.DBUtil;

/* loaded from: classes4.dex */
public final class zzy extends zzp {
    public final transient Object[] zza;
    public final transient int zzb;
    public final transient int zzc = 1;

    public zzy(int i, Object[] objArr) {
        this.zza = objArr;
        this.zzb = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        DBUtil.zza(i, this.zzc);
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
