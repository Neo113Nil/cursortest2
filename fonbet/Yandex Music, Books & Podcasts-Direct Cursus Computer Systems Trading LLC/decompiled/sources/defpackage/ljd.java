package defpackage;

/* loaded from: classes5.dex */
public final class ljd extends mjd {
    public final String a;

    public ljd(String str) {
        this.a = str;
    }

    @Override // defpackage.mjd
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljd) && this.a.equals(((ljd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("UserError(message=", this.a, ")");
    }
}
