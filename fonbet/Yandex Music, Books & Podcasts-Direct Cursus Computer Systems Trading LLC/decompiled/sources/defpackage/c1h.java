package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1h {
    public final boolean a;
    public final y0h b;

    public c1h(boolean z, y0h y0hVar) {
        this.a = z;
        this.b = y0hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1h)) {
            return false;
        }
        c1h c1hVar = (c1h) obj;
        return this.a == c1hVar.a && Intrinsics.d(this.b, c1hVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        y0h y0hVar = this.b;
        return hashCode + (y0hVar == null ? 0 : y0hVar.hashCode());
    }

    public final String toString() {
        return "LumenState(born=" + this.a + ", image=" + this.b + ")";
    }
}
