package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j1b {
    public final int a;
    public final mqs b;
    public final po6 c;

    public j1b(int i, mqs mqsVar, po6 po6Var) {
        mqsVar.getClass();
        po6Var.getClass();
        this.a = i;
        this.b = mqsVar;
        this.c = po6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1b)) {
            return false;
        }
        j1b j1bVar = (j1b) obj;
        return this.a == j1bVar.a && Intrinsics.d(this.b, j1bVar.b) && Intrinsics.d(this.c, j1bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(Integer.hashCode(this.a) * 31, 31, this.b.a);
    }

    public final String toString() {
        return "EditPlaylistTrackBundle(uniqueKey=" + this.a + ", track=" + this.b + ", uiData=" + this.c + ")";
    }
}
