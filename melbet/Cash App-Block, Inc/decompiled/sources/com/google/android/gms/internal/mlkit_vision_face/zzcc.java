package com.google.android.gms.internal.mlkit_vision_face;

import com.squareup.util.Strings;

/* loaded from: classes.dex */
public final class zzcc extends zzbn {
    public static final zzcc zza = new zzcc(0, new Object[0]);
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzcc(int i, Object[] objArr) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Strings.zza(i, this.zzc);
        Object obj = this.zzb[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zza(Object[] objArr) {
        Object[] objArr2 = this.zzb;
        int i = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] zze() {
        return this.zzb;
    }
}
