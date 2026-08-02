package com.google.android.gms.internal.mlkit_genai_prompt;

/* loaded from: classes4.dex */
public final class zzlh implements zzlm {
    public final int zza;

    public zzlh(int i) {
        this.zza = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzlm.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlm)) {
            return false;
        }
        zzlm zzlmVar = (zzlm) obj;
        return this.zza == zzlmVar.zza() && zzll.zza.equals(zzlmVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (zzll.zza.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + zzll.zza + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzlm
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzlm
    public final zzll zzb() {
        return zzll.zza;
    }
}
