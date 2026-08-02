package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j0d implements l0d {
    public final o0d a;

    public j0d(o0d o0dVar) {
        o0dVar.getClass();
        this.a = o0dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0d) && Intrinsics.d(this.a, ((j0d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Photo(photo=" + this.a + ")";
    }
}
