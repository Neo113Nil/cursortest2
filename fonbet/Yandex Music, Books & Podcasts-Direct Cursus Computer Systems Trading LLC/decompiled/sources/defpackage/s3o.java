package defpackage;

/* loaded from: classes5.dex */
public final class s3o implements oun {
    public final Throwable a;

    public s3o(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s3o.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a.equals(((s3o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResponseFailure(cause=" + this.a + ")";
    }
}
