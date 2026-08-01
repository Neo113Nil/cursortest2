package N1;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f735a;

    public e(Throwable th) {
        this.f735a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (D1.i.a(this.f735a, ((e) obj).f735a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f735a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // N1.f
    public final String toString() {
        return "Closed(" + this.f735a + ')';
    }
}
