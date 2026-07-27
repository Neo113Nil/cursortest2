package t0;

import E0.i;
import java.io.Serializable;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248c implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f2989e;

    public C0248c(Throwable th) {
        i.e(th, "exception");
        this.f2989e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0248c) {
            if (i.a(this.f2989e, ((C0248c) obj).f2989e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2989e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f2989e + ')';
    }
}
