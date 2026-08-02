package defpackage;

/* loaded from: classes10.dex */
public final class wl41 {
    public final boolean a;
    public final String b;
    public final String c;
    public final vl41 d;

    public wl41(String str, String str2, boolean z, vl41 vl41Var) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            ny61.g("Path should start with a slash '/'.");
            throw null;
        }
        if (!str2.endsWith("/")) {
            ny61.g("Path should end with a slash '/'");
            throw null;
        }
        this.b = str;
        this.c = str2;
        this.a = z;
        this.d = vl41Var;
    }
}
