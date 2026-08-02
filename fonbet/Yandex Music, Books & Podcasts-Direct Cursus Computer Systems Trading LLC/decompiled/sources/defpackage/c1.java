package defpackage;

/* loaded from: classes.dex */
public final class c1 {
    public final String a;
    public int b;
    public int c;

    public c1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public String a(String str) {
        String i = dfi.i(new StringBuilder("["), str.substring(this.b, (str.length() - this.c) + 1), ']');
        int i2 = this.b;
        String str2 = this.a;
        if (i2 > 0) {
            String str3 = i2 > 20 ? "..." : "";
            str2.getClass();
            i = str3.concat(str2.substring(Math.max(0, this.b - 20), this.b)).concat(i);
        }
        if (this.c <= 0) {
            return i;
        }
        str2.getClass();
        return i.concat(str2.substring((str2.length() - this.c) + 1, Math.min((str2.length() - this.c) + 21, str2.length())).concat((str2.length() - this.c) + 1 < str2.length() - 20 ? "..." : ""));
    }

    public c1(String str, String str2) {
        this.a = str;
    }

    public c1(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.a = str;
    }

    public c1(String str, int i, int i2, int i3, long j) {
        this.a = str;
        this.c = i;
        this.b = i2;
    }
}
