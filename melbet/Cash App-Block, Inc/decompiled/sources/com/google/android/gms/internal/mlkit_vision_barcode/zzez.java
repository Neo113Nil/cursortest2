package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes4.dex */
public final class zzez implements zzfe {
    public final int zza;

    public zzez(int i) {
        this.zza = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzfe.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfe)) {
            return false;
        }
        zzfe zzfeVar = (zzfe) obj;
        return this.zza == zzfeVar.zza() && zzfd.zza.equals(zzfeVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (zzfd.zza.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + zzfd.zza + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfe
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzfe
    public final zzfd zzb() {
        return zzfd.zza;
    }
}
