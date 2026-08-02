package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class yt80 implements pw80 {
    public static final xt80 Companion = new xt80();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ yt80(int i, String str, String str2, String str3, String str4) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, wt80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt80)) {
            return false;
        }
        yt80 yt80Var = (yt80) obj;
        return jl40.l(this.a, yt80Var.a) && jl40.l(this.b, yt80Var.b) && jl40.l(this.c, yt80Var.c) && jl40.l(this.d, yt80Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenStories(trackId=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", storyId=");
        sb.append(this.c);
        sb.append(", data=");
        return b64.p(sb, this.d, ')');
    }
}
