package defpackage;

/* loaded from: classes5.dex */
public final class k4a extends l4a {
    public final Throwable a;

    public k4a(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k4a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a.equals(((k4a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DocumentFetchError(cause=" + this.a + ")";
    }
}
