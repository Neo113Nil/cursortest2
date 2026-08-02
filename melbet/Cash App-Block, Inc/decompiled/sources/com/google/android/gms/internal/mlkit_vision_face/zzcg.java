package com.google.android.gms.internal.mlkit_vision_face;

import com.squareup.util.Strings;

/* loaded from: classes4.dex */
public final class zzcg extends zzbn {
    public final transient Object[] zza;
    public final transient int zzb;
    public final transient int zzc = 1;

    public zzcg(int i, Object[] objArr) {
        this.zza = objArr;
        this.zzb = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Strings.zza(i, this.zzc);
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
