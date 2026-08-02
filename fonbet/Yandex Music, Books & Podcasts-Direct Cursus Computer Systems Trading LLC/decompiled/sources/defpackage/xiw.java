package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xiw implements ziw {
    public final ejw a;

    public xiw(ejw ejwVar) {
        ejwVar.getClass();
        this.a = ejwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xiw) && Intrinsics.d(this.a, ((xiw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(entity=" + this.a + ")";
    }
}
