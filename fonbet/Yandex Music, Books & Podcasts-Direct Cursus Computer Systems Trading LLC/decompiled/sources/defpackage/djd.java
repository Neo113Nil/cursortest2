package defpackage;

/* loaded from: classes5.dex */
public final class djd extends fjd {
    public final String a;

    public djd(String str) {
        this.a = str;
    }

    @Override // defpackage.fjd
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djd) && this.a.equals(((djd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("UserError(message=", this.a, ")");
    }
}
