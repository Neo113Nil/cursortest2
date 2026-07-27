package M0;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f732a;

    public g(Throwable th) {
        this.f732a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (E0.i.a(this.f732a, ((g) obj).f732a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f732a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // M0.h
    public final String toString() {
        return "Closed(" + this.f732a + ')';
    }
}
