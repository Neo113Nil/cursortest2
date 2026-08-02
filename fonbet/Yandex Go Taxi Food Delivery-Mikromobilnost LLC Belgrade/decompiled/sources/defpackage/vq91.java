package defpackage;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfd;

/* loaded from: classes11.dex */
public final class vq91 implements cs91 {
    public final int b;
    public final zzfd c;

    public vq91(int i, zzfd zzfdVar) {
        this.b = i;
        this.c = zzfdVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return cs91.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs91)) {
            return false;
        }
        cs91 cs91Var = (cs91) obj;
        return this.b == cs91Var.zza() && this.c.equals(cs91Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (this.c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + this.c + ')';
    }

    @Override // defpackage.cs91
    public final int zza() {
        return this.b;
    }

    @Override // defpackage.cs91
    public final zzfd zzb() {
        return this.c;
    }
}
