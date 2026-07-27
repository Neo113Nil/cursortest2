package t0;

import E0.i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Throwable f2984f;

    public c(Throwable th) {
        i.e(th, "exception");
        this.f2984f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (i.a(this.f2984f, ((c) obj).f2984f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2984f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2984f + ')';
    }
}
