package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wll implements yll {
    public final g1h a;

    public wll(g1h g1hVar) {
        g1hVar.getClass();
        this.a = g1hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wll) && Intrinsics.d(this.a, ((wll) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(lyrics=" + this.a + ")";
    }
}
