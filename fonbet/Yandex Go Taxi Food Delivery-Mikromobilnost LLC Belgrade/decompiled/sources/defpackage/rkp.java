package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class rkp {
    public static final qkp Companion = new qkp();
    public final long a;
    public final String b;

    public /* synthetic */ rkp(long j, int i, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, pkp.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkp)) {
            return false;
        }
        rkp rkpVar = (rkp) obj;
        return this.a == rkpVar.a && jl40.l(this.b, rkpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureDto(end=");
        sb.append(this.a);
        sb.append(", feature=");
        return b64.p(sb, this.b, ')');
    }
}
