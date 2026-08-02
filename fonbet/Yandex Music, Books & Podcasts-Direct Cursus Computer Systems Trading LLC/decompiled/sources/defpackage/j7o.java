package defpackage;

/* loaded from: classes5.dex */
public final class j7o {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public j7o(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7o)) {
            return false;
        }
        j7o j7oVar = (j7o) obj;
        return this.a.equals(j7oVar.a) && this.b.equals(j7oVar.b) && this.c.equals(j7oVar.c) && this.d == j7oVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("RestrictionValue(name=", this.a, ", value=", this.b, ", serializedSeed=");
        m.append(this.c);
        m.append(", isUnspecified=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
