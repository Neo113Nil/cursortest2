package com.google.android.gms.internal.mlkit_vision_face;

/* loaded from: classes4.dex */
public final class zzcp implements zzcu {
    public final int zza;

    public zzcp(int i) {
        this.zza = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcu.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcu)) {
            return false;
        }
        zzcu zzcuVar = (zzcu) obj;
        return this.zza == zzcuVar.zza() && zzct.zza.equals(zzcuVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (zzct.zza.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + zzct.zza + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final zzct zzb() {
        return zzct.zza;
    }
}
