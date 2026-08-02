package defpackage;

/* loaded from: classes3.dex */
public final class xt1 implements xym {
    public final int a;

    public xt1(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return xym.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xym)) {
            return false;
        }
        xym xymVar = (xym) obj;
        return this.a == xymVar.tag() && vym.a.equals(xymVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.a) + (vym.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.xym
    public final vym intEncoding() {
        return vym.a;
    }

    @Override // defpackage.xym
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + vym.a + ')';
    }
}
