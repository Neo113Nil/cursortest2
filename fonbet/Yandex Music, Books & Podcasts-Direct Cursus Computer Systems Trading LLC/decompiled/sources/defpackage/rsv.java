package defpackage;

/* loaded from: classes4.dex */
public final class rsv implements ssv {
    public final boolean a;
    public final String b;
    public final osv c;

    public rsv(boolean z, String str, osv osvVar) {
        this.a = z;
        this.b = str;
        this.c = osvVar;
    }

    @Override // defpackage.ssv
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ssv
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsv)) {
            return false;
        }
        rsv rsvVar = (rsv) obj;
        return this.a == rsvVar.a && this.b.equals(rsvVar.b) && this.c.equals(rsvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "OneToOne(isLiked=" + this.a + ", artistName=" + this.b + ", playerState=" + this.c + ")";
    }
}
