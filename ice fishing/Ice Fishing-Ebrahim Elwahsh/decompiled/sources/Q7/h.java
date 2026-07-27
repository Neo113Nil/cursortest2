package Q7;

/* loaded from: classes2.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2770a;

    public h(Throwable th) {
        this.f2770a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return kotlin.jvm.internal.h.a(this.f2770a, ((h) obj).f2770a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f2770a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // Q7.i
    public final String toString() {
        return "Closed(" + this.f2770a + ')';
    }
}
