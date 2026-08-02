package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class rhm implements ohb {
    public final CancellationException a;

    public rhm(CancellationException cancellationException) {
        this.a = cancellationException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rhm.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.a.equals(((rhm) obj).a);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Cancelled(query=null, portionParams=null, cause=" + this.a + ")";
    }
}
