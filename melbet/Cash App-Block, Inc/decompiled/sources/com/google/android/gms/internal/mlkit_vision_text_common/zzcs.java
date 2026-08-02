package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes4.dex */
public final class zzcs implements zzcx {
    public final int zza;

    public zzcs(int i) {
        this.zza = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcx.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcx)) {
            return false;
        }
        zzcx zzcxVar = (zzcx) obj;
        return this.zza == zzcxVar.zza() && zzcw.zza.equals(zzcxVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (zzcw.zza.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + zzcw.zza + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcx
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcx
    public final zzcw zzb() {
        return zzcw.zza;
    }
}
