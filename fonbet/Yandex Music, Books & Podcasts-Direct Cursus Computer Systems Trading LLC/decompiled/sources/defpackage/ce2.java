package defpackage;

/* loaded from: classes3.dex */
public final class ce2 {
    public final String a;
    public final long b;
    public final int c;

    public ce2(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public static x0 a() {
        x0 x0Var = new x0((char) 0, 1);
        x0Var.d = 0L;
        return x0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ce2)) {
            return false;
        }
        ce2 ce2Var = (ce2) obj;
        String str = ce2Var.a;
        String str2 = this.a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.b != ce2Var.b) {
            return false;
        }
        int i = ce2Var.c;
        int i2 = this.c;
        return i2 == 0 ? i == 0 : ouj.a(i2, i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.c;
        return (i2 != 0 ? ouj.D(i2) : 0) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", responseCode=");
        int i = this.c;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
