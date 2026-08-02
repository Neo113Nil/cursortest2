package defpackage;

/* loaded from: classes4.dex */
public final class x14 implements c24 {
    public final v1g a;
    public final int b;
    public final boolean c;
    public final eul d;

    public x14(v1g v1gVar, int i, boolean z, eul eulVar) {
        this.a = v1gVar;
        this.b = i;
        this.c = z;
        this.d = eulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x14)) {
            return false;
        }
        x14 x14Var = (x14) obj;
        return this.a.equals(x14Var.a) && this.b == x14Var.b && this.c == x14Var.c && this.d.equals(x14Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.e(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "LikedPlaylist(uiData=" + this.a + ", likesCount=" + this.b + ", hasTrailer=" + this.c + ", playlist=" + this.d + ")";
    }
}
