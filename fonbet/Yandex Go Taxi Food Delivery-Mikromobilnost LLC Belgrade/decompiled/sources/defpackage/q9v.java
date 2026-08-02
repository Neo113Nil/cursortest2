package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class q9v {
    public static final n9v Companion = new n9v();
    public final String a;
    public final String b;

    public /* synthetic */ q9v(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, m9v.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9v)) {
            return false;
        }
        q9v q9vVar = (q9v) obj;
        return jl40.l(this.a, q9vVar.a) && jl40.l(this.b, q9vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDto(light=");
        sb.append(this.a);
        sb.append(", dark=");
        return b64.p(sb, this.b, ')');
    }
}
