package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wg6 {
    public final ph6 a;
    public final n3j b;
    public final x63 c;

    public wg6(ph6 ph6Var, n3j n3jVar, x63 x63Var) {
        this.a = ph6Var;
        this.b = n3jVar;
        this.c = x63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg6)) {
            return false;
        }
        wg6 wg6Var = (wg6) obj;
        return Intrinsics.d(this.a, wg6Var.a) && Intrinsics.d(this.b, wg6Var.b) && Intrinsics.d(this.c, wg6Var.c);
    }

    public final int hashCode() {
        ph6 ph6Var = this.a;
        int hashCode = (ph6Var == null ? 0 : ph6Var.hashCode()) * 31;
        n3j n3jVar = this.b;
        int hashCode2 = (hashCode + (n3jVar == null ? 0 : n3jVar.hashCode())) * 31;
        x63 x63Var = this.c;
        return hashCode2 + (x63Var != null ? x63Var.hashCode() : 0);
    }

    public final String toString() {
        return "ContinueListenBlockEntities(myShelfEntity=" + this.a + ", newEpisodesEntity=" + this.b + ", playedItem=" + this.c + ")";
    }
}
