package defpackage;

/* loaded from: classes3.dex */
public final class rff implements drf {
    public final nrf a;
    public final String b;
    public final String c;
    public final String d;

    public rff(nrf nrfVar, String str, String str2, String str3) {
        this.a = nrfVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rff)) {
            return false;
        }
        rff rffVar = (rff) obj;
        return this.a.equals(rffVar.a) && this.b.equals(rffVar.b) && this.c.equals(rffVar.c) && this.d.equals(rffVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KidsTabVisibilityBlock(meta=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        return ouj.q(sb, this.c, ", imageUrl=", this.d, ")");
    }
}
