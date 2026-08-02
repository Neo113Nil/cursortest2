package U7;

/* loaded from: classes2.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3381a;

    public h(Throwable th) {
        this.f3381a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.h.a(this.f3381a, ((h) obj).f3381a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f3381a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // U7.i
    public final String toString() {
        return "Closed(" + this.f3381a + ')';
    }
}
