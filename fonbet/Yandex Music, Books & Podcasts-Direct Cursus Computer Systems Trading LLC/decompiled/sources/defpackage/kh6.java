package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kh6 implements lh6 {
    public final qh6 a;
    public final o3j b;
    public final c8l c;

    public kh6(qh6 qh6Var, o3j o3jVar, c8l c8lVar) {
        this.a = qh6Var;
        this.b = o3jVar;
        this.c = c8lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh6)) {
            return false;
        }
        kh6 kh6Var = (kh6) obj;
        return Intrinsics.d(this.a, kh6Var.a) && Intrinsics.d(this.b, kh6Var.b) && Intrinsics.d(this.c, kh6Var.c);
    }

    public final int hashCode() {
        qh6 qh6Var = this.a;
        int hashCode = (qh6Var == null ? 0 : qh6Var.hashCode()) * 31;
        o3j o3jVar = this.b;
        int hashCode2 = (hashCode + (o3jVar == null ? 0 : o3jVar.hashCode())) * 31;
        c8l c8lVar = this.c;
        return hashCode2 + (c8lVar != null ? c8lVar.hashCode() : 0);
    }

    public final String toString() {
        return "Success(myShelf=" + this.a + ", newEpisodes=" + this.b + ", playedItem=" + this.c + ")";
    }
}
