package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class xlv implements gov {
    public static final wlv Companion = new wlv();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ xlv(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, vlv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlv)) {
            return false;
        }
        xlv xlvVar = (xlv) obj;
        return jl40.l(this.a, xlvVar.a) && jl40.l(this.b, xlvVar.b) && jl40.l(this.c, xlvVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BroadcastEvent(trackId=");
        sb.append(this.a);
        sb.append(", event=");
        sb.append(this.b);
        sb.append(", params=");
        return b64.p(sb, this.c, ')');
    }

    public xlv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
