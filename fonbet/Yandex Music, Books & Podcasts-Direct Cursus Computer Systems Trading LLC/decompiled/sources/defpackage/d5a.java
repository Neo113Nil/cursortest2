package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d5a implements ohb {
    public final t5a a;
    public final CancellationException b;

    public d5a(t5a t5aVar, CancellationException cancellationException) {
        this.a = t5aVar;
        this.b = cancellationException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d5a d5aVar = (d5a) obj;
        return Intrinsics.d(this.a, d5aVar.a) && this.b.equals(d5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Cancelled(query=" + this.a + ", cause=" + this.b + ")";
    }
}
