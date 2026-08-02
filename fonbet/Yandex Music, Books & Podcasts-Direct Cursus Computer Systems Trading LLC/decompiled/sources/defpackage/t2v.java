package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t2v implements x2v {
    public final oq a;

    public t2v(oq oqVar) {
        oqVar.getClass();
        this.a = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2v) && Intrinsics.d(this.a, ((t2v) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Album(album=" + this.a + ")";
    }
}
