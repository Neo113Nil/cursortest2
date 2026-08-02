package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class ce7 implements Comparable {
    public static final fs7 d = new fs7(19);
    public static final long e = -3153600000000000000L;
    public final fs7 a;
    public final long b;
    public volatile boolean c;

    public ce7(fs7 fs7Var, long j) {
        fs7Var.getClass();
        long nanoTime = System.nanoTime();
        this.a = fs7Var;
        long min = Math.min(3153600000000000000L, Math.max(e, j));
        this.b = nanoTime + min;
        this.c = min <= 0;
    }

    public final void a(ce7 ce7Var) {
        fs7 fs7Var = ce7Var.a;
        fs7 fs7Var2 = this.a;
        if (fs7Var2 == fs7Var) {
            return;
        }
        StringBuilder sb = new StringBuilder("Tickers (");
        sb.append(fs7Var2);
        fs7 fs7Var3 = ce7Var.a;
        sb.append(" and ");
        sb.append(fs7Var3);
        sb.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(sb.toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ce7 ce7Var) {
        a(ce7Var);
        long j = this.b - ce7Var.b;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public final boolean c(ce7 ce7Var) {
        a(ce7Var);
        return this.b - ce7Var.b < 0;
    }

    public final boolean d() {
        if (!this.c) {
            long j = this.b;
            this.a.getClass();
            if (j - System.nanoTime() > 0) {
                return false;
            }
            this.c = true;
        }
        return true;
    }

    public final long e() {
        this.a.getClass();
        long nanoTime = System.nanoTime();
        if (!this.c && this.b - nanoTime <= 0) {
            this.c = true;
        }
        return this.b - nanoTime;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ce7)) {
            return false;
        }
        ce7 ce7Var = (ce7) obj;
        fs7 fs7Var = ce7Var.a;
        fs7 fs7Var2 = this.a;
        if (fs7Var2 != null ? fs7Var2 == fs7Var : fs7Var == null) {
            return this.b == ce7Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.a, Long.valueOf(this.b)).hashCode();
    }

    public final String toString() {
        long e2 = e();
        long abs = Math.abs(e2) / 1000000000;
        long abs2 = Math.abs(e2) % 1000000000;
        StringBuilder sb = new StringBuilder();
        if (e2 < 0) {
            sb.append('-');
        }
        sb.append(abs);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        fs7 fs7Var = d;
        fs7 fs7Var2 = this.a;
        if (fs7Var2 != fs7Var) {
            sb.append(" (ticker=" + fs7Var2 + ")");
        }
        return sb.toString();
    }
}
