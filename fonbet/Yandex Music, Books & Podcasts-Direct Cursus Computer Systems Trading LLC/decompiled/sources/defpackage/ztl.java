package defpackage;

/* loaded from: classes6.dex */
public final class ztl extends aul {
    public final String a;
    public final String b;

    public ztl(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztl)) {
            return false;
        }
        ztl ztlVar = (ztl) obj;
        return this.a.equals(ztlVar.a) && this.b.equals(ztlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("LoginAndKind(login=", this.a, ", kind=", this.b, ")");
    }
}
