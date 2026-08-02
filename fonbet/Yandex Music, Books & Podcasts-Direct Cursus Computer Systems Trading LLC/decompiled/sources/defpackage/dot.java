package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dot extends fot {
    public final IOException a;

    public dot(IOException iOException) {
        iOException.getClass();
        this.a = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dot) && Intrinsics.d(this.a, ((dot) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Parse(exception=" + this.a + ")";
    }
}
