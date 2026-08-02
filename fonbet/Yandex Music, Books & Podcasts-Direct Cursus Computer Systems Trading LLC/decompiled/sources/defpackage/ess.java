package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ess {
    public final zvs a;
    public final o5n b;
    public final thr c;

    public ess(zvs zvsVar, o5n o5nVar, thr thrVar) {
        zvsVar.getClass();
        o5nVar.getClass();
        thrVar.getClass();
        this.a = zvsVar;
        this.b = o5nVar;
        this.c = thrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ess)) {
            return false;
        }
        ess essVar = (ess) obj;
        return Intrinsics.d(this.a, essVar.a) && this.b == essVar.b && this.c == essVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RowId(trackId=" + this.a + ", quality=" + this.b + ", storage=" + this.c + ")";
    }
}
