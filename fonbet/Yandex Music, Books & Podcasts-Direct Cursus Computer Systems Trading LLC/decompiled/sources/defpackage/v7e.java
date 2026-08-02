package defpackage;

/* loaded from: classes5.dex */
public final class v7e {
    public final String a;
    public final int b;
    public final String c;

    public v7e(t7e t7eVar) {
        String str = t7eVar.b;
        this.a = t7eVar.c;
        int i = t7eVar.d;
        this.b = i == -1 ? str.equals("http") ? 80 : str.equals("https") ? 443 : -1 : i;
        this.c = t7eVar.toString();
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v7e) && ((v7e) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
