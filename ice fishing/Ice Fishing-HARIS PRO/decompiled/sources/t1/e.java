package t1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4380a;

    public e(Throwable th) {
        this.f4380a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (D1.i.a(this.f4380a, ((e) obj).f4380a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4380a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f4380a + ')';
    }
}
