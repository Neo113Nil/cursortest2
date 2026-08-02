package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ny7 {
    public final r7b a;
    public final f9f b;

    public ny7(r7b r7bVar, f9f f9fVar) {
        r7bVar.getClass();
        f9fVar.getClass();
        this.a = r7bVar;
        this.b = f9fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny7)) {
            return false;
        }
        ny7 ny7Var = (ny7) obj;
        return Intrinsics.d(this.a, ny7Var.a) && Intrinsics.d(this.b, ny7Var.b);
    }

    public final int hashCode() {
        return ((lm4) this.b).hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheKey(context=" + this.a + ", selector=" + this.b + ')';
    }
}
