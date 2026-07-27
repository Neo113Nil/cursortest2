package N0;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f740a;

    public g(Throwable th) {
        this.f740a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (E0.i.a(this.f740a, ((g) obj).f740a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f740a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // N0.h
    public final String toString() {
        return "Closed(" + this.f740a + ')';
    }
}
