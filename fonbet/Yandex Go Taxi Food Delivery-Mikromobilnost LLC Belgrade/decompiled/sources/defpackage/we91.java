package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzct;

/* loaded from: classes11.dex */
public final class we91 implements sf91 {
    public final int b;
    public final zzct c;

    public we91(int i, zzct zzctVar) {
        this.b = i;
        this.c = zzctVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return sf91.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf91)) {
            return false;
        }
        sf91 sf91Var = (sf91) obj;
        return this.b == sf91Var.zza() && this.c.equals(sf91Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (this.c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + this.c + ')';
    }

    @Override // defpackage.sf91
    public final int zza() {
        return this.b;
    }

    @Override // defpackage.sf91
    public final zzct zzb() {
        return this.c;
    }
}
