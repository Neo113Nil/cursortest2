package a4;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0437a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f4301a;

    public C0437a(int i) {
        this.f4301a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        C0437a c0437a = (C0437a) ((e) obj);
        if (this.f4301a != c0437a.f4301a) {
            return false;
        }
        Object obj2 = EnumC0440d.f4303n;
        c0437a.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f4301a) + (EnumC0440d.f4303n.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f4301a + "intEncoding=" + EnumC0440d.f4303n + ')';
    }
}
