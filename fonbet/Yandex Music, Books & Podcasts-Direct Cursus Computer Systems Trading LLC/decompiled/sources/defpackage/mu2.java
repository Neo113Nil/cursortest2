package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class mu2 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public mu2(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu2)) {
            return false;
        }
        mu2 mu2Var = (mu2) obj;
        return this.c == mu2Var.c && this.d == mu2Var.d && Objects.equals(this.a, mu2Var.a) && Objects.equals(this.b, mu2Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
