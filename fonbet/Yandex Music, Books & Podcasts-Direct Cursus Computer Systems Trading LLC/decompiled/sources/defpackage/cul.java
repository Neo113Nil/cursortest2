package defpackage;

/* loaded from: classes6.dex */
public final class cul extends aul {
    public final String a;
    public final String b;

    public cul(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cul)) {
            return false;
        }
        cul culVar = (cul) obj;
        return this.a.equals(culVar.a) && this.b.equals(culVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("UserIdAndKind(userId=", this.a, ", kind=", this.b, ")");
    }
}
