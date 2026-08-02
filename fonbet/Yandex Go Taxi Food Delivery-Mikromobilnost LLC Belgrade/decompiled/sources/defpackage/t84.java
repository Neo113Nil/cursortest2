package defpackage;

/* loaded from: classes10.dex */
public final class t84 extends pnw0 {
    public final qnw0 a;

    public t84(qnw0 qnw0Var) {
        this.a = qnw0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof pnw0) && this.a.equals(((t84) ((pnw0) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }
}
