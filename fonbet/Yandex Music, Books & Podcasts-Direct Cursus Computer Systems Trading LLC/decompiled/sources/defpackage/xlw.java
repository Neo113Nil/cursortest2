package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xlw {
    public final g4q a;
    public final n7q b;
    public final yk3 c;

    public xlw(g4q g4qVar, n7q n7qVar, yk3 yk3Var) {
        this.a = g4qVar;
        this.b = n7qVar;
        this.c = yk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlw)) {
            return false;
        }
        xlw xlwVar = (xlw) obj;
        return Intrinsics.d(this.a, xlwVar.a) && Intrinsics.d(this.b, xlwVar.b) && this.c.equals(xlwVar.c);
    }

    public final int hashCode() {
        g4q g4qVar = this.a;
        int hashCode = (g4qVar == null ? 0 : g4qVar.hashCode()) * 31;
        n7q n7qVar = this.b;
        return this.c.hashCode() + ((hashCode + (n7qVar != null ? n7qVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "PlaybackSnapshot(queue=" + this.a + ", queueState=" + this.b + ", playerState=" + this.c + ")";
    }
}
