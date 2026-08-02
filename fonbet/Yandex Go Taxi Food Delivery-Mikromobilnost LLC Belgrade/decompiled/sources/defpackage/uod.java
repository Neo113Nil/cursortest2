package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class uod implements fpd {
    public static final tod Companion = new tod();
    public final ipd a;
    public final String b;
    public final int c;

    public /* synthetic */ uod(int i, ipd ipdVar, String str, int i2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, sod.a.getDescriptor());
            throw null;
        }
        this.a = ipdVar;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uod)) {
            return false;
        }
        uod uodVar = (uod) obj;
        return jl40.l(this.a, uodVar.a) && jl40.l(this.b, uodVar.b) && this.c == uodVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Intro(price=");
        sb.append(this.a);
        sb.append(", period=");
        sb.append(this.b);
        sb.append(", repeatCount=");
        return oyr.s(sb, this.c, ')');
    }
}
