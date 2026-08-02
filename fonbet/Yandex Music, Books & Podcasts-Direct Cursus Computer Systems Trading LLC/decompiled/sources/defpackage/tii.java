package defpackage;

/* loaded from: classes3.dex */
public final class tii implements zii {
    public final eul a;
    public final int b;
    public final boolean c;

    public tii(eul eulVar, int i, boolean z) {
        this.a = eulVar;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tii)) {
            return false;
        }
        tii tiiVar = (tii) obj;
        return this.a.equals(tiiVar.a) && this.b == tiiVar.b && this.c == tiiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.zii
    public final boolean r() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playlist(domainModel=");
        sb.append(this.a);
        sb.append(", countTracks=");
        sb.append(this.b);
        sb.append(", available=");
        return ouj.r(sb, this.c, ")");
    }
}
