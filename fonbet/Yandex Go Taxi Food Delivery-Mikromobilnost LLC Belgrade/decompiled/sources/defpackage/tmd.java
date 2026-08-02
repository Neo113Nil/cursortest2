package defpackage;

/* loaded from: classes2.dex */
public final class tmd {
    public final imd a;

    public tmd(imd imdVar) {
        this.a = imdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tmd) && this.a.equals(((tmd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PromoLegalInfo(legalText=" + this.a + ')';
    }
}
