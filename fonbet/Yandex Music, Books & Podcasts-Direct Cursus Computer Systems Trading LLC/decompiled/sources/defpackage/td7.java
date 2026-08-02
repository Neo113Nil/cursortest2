package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class td7 {
    public final char a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public td7(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            xla.e(c, "Unknown mode: ");
            throw null;
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final long a(rk4 rk4Var, long j) {
        int i = this.c;
        if (i >= 0) {
            return rk4Var.e().A(i, j);
        }
        return rk4Var.e().a(i, rk4Var.x().a(1, rk4Var.e().A(1, j)));
    }

    public final long b(rk4 rk4Var, long j) {
        try {
            return a(rk4Var, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (!rk4Var.J().r(j)) {
                j = rk4Var.J().a(1, j);
            }
            return a(rk4Var, j);
        }
    }

    public final long c(rk4 rk4Var, long j) {
        try {
            return a(rk4Var, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (!rk4Var.J().r(j)) {
                j = rk4Var.J().a(-1, j);
            }
            return a(rk4Var, j);
        }
    }

    public final long d(rk4 rk4Var, long j) {
        int b = this.d - rk4Var.f().b(j);
        if (b == 0) {
            return j;
        }
        if (this.e) {
            if (b < 0) {
                b += 7;
            }
        } else if (b > 0) {
            b -= 7;
        }
        return rk4Var.f().a(b, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof td7) {
            td7 td7Var = (td7) obj;
            if (this.a == td7Var.a && this.b == td7Var.b && this.c == td7Var.c && this.d == td7Var.d && this.e == td7Var.e && this.f == td7Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[OfYear]\nMode: ");
        sb.append(this.a);
        sb.append("\nMonthOfYear: ");
        sb.append(this.b);
        sb.append("\nDayOfMonth: ");
        sb.append(this.c);
        sb.append("\nDayOfWeek: ");
        sb.append(this.d);
        sb.append("\nAdvanceDayOfWeek: ");
        sb.append(this.e);
        sb.append("\nMillisOfDay: ");
        return vz1.r(sb, this.f, '\n');
    }
}
