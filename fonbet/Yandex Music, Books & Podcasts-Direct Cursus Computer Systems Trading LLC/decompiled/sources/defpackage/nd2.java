package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nd2 extends trg {
    public final long a;
    public final long b;
    public final nb2 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public nd2(long j, long j2, nb2 nb2Var, Integer num, String str, ArrayList arrayList) {
        i5n i5nVar = i5n.a;
        this.a = j;
        this.b = j2;
        this.c = nb2Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof trg)) {
            return false;
        }
        nd2 nd2Var = (nd2) ((trg) obj);
        if (this.a != nd2Var.a || this.b != nd2Var.b || !this.c.equals(nd2Var.c)) {
            return false;
        }
        Integer num = nd2Var.d;
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = nd2Var.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(nd2Var.f)) {
            return false;
        }
        Object obj2 = i5n.a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ i5n.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + i5n.a + "}";
    }
}
