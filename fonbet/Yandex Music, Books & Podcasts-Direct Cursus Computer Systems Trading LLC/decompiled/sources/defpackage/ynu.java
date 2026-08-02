package defpackage;

/* loaded from: classes4.dex */
public final class ynu implements znu {
    public final int a;

    public ynu(int i) {
        this.a = i;
    }

    @Override // defpackage.znu
    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynu) && this.a == ((ynu) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hrg.q("WithoutSeeds(phonotekaOnlyId=", v5g.T(this.a), ")");
    }
}
