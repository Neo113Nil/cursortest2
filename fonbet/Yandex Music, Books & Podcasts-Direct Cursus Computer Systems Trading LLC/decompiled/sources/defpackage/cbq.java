package defpackage;

/* loaded from: classes4.dex */
public final class cbq implements hbq {
    public final int a;

    public cbq(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbq) && this.a == ((cbq) obj).a;
    }

    @Override // defpackage.aaq
    public final String getId() {
        return "phonotekaOnlyId";
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hrg.q("PhonotekaOnly(phonotekaOnlyId=", v5g.T(this.a), ")");
    }
}
