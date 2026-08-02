package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u1h implements v1h {
    public final l1h a;
    public final g1h b;

    public u1h(l1h l1hVar, g1h g1hVar) {
        l1hVar.getClass();
        g1hVar.getClass();
        this.a = l1hVar;
        this.b = g1hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1h)) {
            return false;
        }
        u1h u1hVar = (u1h) obj;
        return Intrinsics.d(this.a, u1hVar.a) && Intrinsics.d(this.b, u1hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(headerUiState=" + this.a + ", data=" + this.b + ")";
    }
}
