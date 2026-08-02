package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class xx50 {
    public static final wx50 Companion = new wx50();
    public final String a;
    public final String b;

    public /* synthetic */ xx50(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, vx50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx50)) {
            return false;
        }
        xx50 xx50Var = (xx50) obj;
        return jl40.l(this.a, xx50Var.a) && jl40.l(this.b, xx50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkPlaqueClickedRequestModel(feedbackToken=");
        sb.append(this.a);
        sb.append(", actionContext=");
        return b64.p(sb, this.b, ')');
    }

    public xx50(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
