package defpackage;

/* loaded from: classes4.dex */
public final class l65 {
    public final g5u a;
    public final g5u b;

    public l65(g5u g5uVar, g5u g5uVar2) {
        this.a = g5uVar;
        this.b = g5uVar2;
    }

    public static l65 a(l65 l65Var, g5u g5uVar, g5u g5uVar2, int i) {
        if ((i & 1) != 0) {
            g5uVar = l65Var.a;
        }
        if ((i & 2) != 0) {
            g5uVar2 = l65Var.b;
        }
        l65Var.getClass();
        return new l65(g5uVar, g5uVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l65)) {
            return false;
        }
        l65 l65Var = (l65) obj;
        return this.a.equals(l65Var.a) && this.b.equals(l65Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CollectionVideoClipsScreenState(collection=" + this.a + ", recommendations=" + this.b + ")";
    }
}
