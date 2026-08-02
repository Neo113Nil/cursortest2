package defpackage;

/* loaded from: classes10.dex */
public final class xjx {
    public static final xjx g = new xjx(63, null);
    public final tls a;
    public final tls b;
    public final tls c;
    public final tls d;
    public final tls e;
    public final tls f;

    public xjx(int i, tls tlsVar) {
        this.a = (i & 1) != 0 ? null : tlsVar;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjx)) {
            return false;
        }
        xjx xjxVar = (xjx) obj;
        return this.a == xjxVar.a && this.b == xjxVar.b && this.c == xjxVar.c && this.d == xjxVar.d && this.e == xjxVar.e && this.f == xjxVar.f;
    }

    public final int hashCode() {
        tls tlsVar = this.a;
        int hashCode = (tlsVar != null ? tlsVar.hashCode() : 0) * 31;
        tls tlsVar2 = this.b;
        int hashCode2 = (hashCode + (tlsVar2 != null ? tlsVar2.hashCode() : 0)) * 31;
        tls tlsVar3 = this.c;
        int hashCode3 = (hashCode2 + (tlsVar3 != null ? tlsVar3.hashCode() : 0)) * 31;
        tls tlsVar4 = this.d;
        int hashCode4 = (hashCode3 + (tlsVar4 != null ? tlsVar4.hashCode() : 0)) * 31;
        tls tlsVar5 = this.e;
        int hashCode5 = (hashCode4 + (tlsVar5 != null ? tlsVar5.hashCode() : 0)) * 31;
        tls tlsVar6 = this.f;
        return hashCode5 + (tlsVar6 != null ? tlsVar6.hashCode() : 0);
    }

    public xjx() {
        this(63, null);
    }
}
