package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class eed extends hed {
    public final ced a;

    public eed(ced cedVar) {
        cedVar.getClass();
        this.a = cedVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eed) && Intrinsics.d(this.a, ((eed) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Connected(connection=" + this.a + ")";
    }
}
