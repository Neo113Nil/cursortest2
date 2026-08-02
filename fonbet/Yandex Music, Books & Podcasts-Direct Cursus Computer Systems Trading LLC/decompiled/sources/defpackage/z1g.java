package defpackage;

/* loaded from: classes4.dex */
public final class z1g {
    public final nvl a;
    public final int b;
    public final int c;

    public z1g(nvl nvlVar, int i, int i2) {
        this.a = nvlVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1g)) {
            return false;
        }
        z1g z1gVar = (z1g) obj;
        return this.a.equals(z1gVar.a) && this.b == z1gVar.b && this.c == z1gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedPlaylistInfo(playlistId=");
        sb.append(this.a);
        sb.append(", revision=");
        sb.append(this.b);
        sb.append(", snapshot=");
        return f1d.i(sb, this.c, ")");
    }
}
