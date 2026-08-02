package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mkw implements okw {
    public final ejw a;

    public mkw(ejw ejwVar) {
        ejwVar.getClass();
        this.a = ejwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkw) && Intrinsics.d(this.a, ((mkw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Cached(entity=" + this.a + ")";
    }
}
