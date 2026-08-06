package C1;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f184a;

    public h(Throwable th) {
        this.f184a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (kotlin.jvm.internal.i.a(this.f184a, ((h) obj).f184a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f184a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // C1.i
    public final String toString() {
        return "Closed(" + this.f184a + ')';
    }
}
