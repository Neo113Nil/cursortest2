package defpackage;

/* loaded from: classes6.dex */
public final class tjt {
    public final String a;
    public final String b;
    public final ujt c;

    public tjt(String str, String str2, ujt ujtVar) {
        this.a = str;
        this.b = str2;
        this.c = ujtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjt)) {
            return false;
        }
        tjt tjtVar = (tjt) obj;
        return this.a.equals(tjtVar.a) && this.b.equals(tjtVar.b) && this.c == tjtVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("UniversalEntityUrlParam(blockType=", this.a, ", blockId=", this.b, ", urlType=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
