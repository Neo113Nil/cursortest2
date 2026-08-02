package defpackage;

/* loaded from: classes12.dex */
public final class tsa {
    public final String a;
    public final String b;
    public final String c;

    public tsa(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsa)) {
            return false;
        }
        tsa tsaVar = (tsa) obj;
        return jl40.l(this.a, tsaVar.a) && jl40.l(this.b, tsaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ tsa(String str, String str2) {
        this(str, str2, null);
    }
}
