package defpackage;

/* loaded from: classes14.dex */
public final class uaw {
    public static final uaw e = new uaw(null, "", "", "");
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public uaw(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaw)) {
            return false;
        }
        uaw uawVar = (uaw) obj;
        return jl40.l(this.a, uawVar.a) && jl40.l(this.b, uawVar.b) && this.c.equals(uawVar.c) && this.d.equals(uawVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
