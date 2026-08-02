package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class wd2 {
    public final long a;
    public final long b;
    public final Set c;

    public wd2(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wd2) {
            wd2 wd2Var = (wd2) obj;
            if (this.a == wd2Var.a && this.b == wd2Var.b && this.c.equals(wd2Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
