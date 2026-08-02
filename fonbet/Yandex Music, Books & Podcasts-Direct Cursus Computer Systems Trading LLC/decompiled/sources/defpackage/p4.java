package defpackage;

/* loaded from: classes4.dex */
public final class p4 implements c9j {
    public final lt a;
    public final int b;
    public final String c;

    public p4(lt ltVar, int i, String str) {
        this.a = ltVar;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.c9j
    public final lt a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return this.a.equals(p4Var.a) && this.b == p4Var.b && this.c.equals(p4Var.c);
    }

    @Override // defpackage.c9j
    public final String getDescription() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AboutPodcastInfo(albumDomainItem=");
        sb.append(this.a);
        sb.append(", likesCount=");
        sb.append(this.b);
        sb.append(", description=");
        return su4.o(sb, this.c, ")");
    }
}
