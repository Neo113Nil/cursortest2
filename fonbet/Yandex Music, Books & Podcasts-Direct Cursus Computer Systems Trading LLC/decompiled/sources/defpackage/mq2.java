package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* loaded from: classes5.dex */
public abstract class mq2 extends xc7 {
    public final DateTimeFieldType a;

    public mq2(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            this.a = dateTimeFieldType;
        } else {
            xq0.x("The type must not be null");
            throw null;
        }
    }

    @Override // defpackage.xc7
    public long B(long j, String str, Locale locale) {
        return A(D(str, locale), j);
    }

    public int D(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(this.a, str);
        }
    }

    @Override // defpackage.xc7
    public long a(int i, long j) {
        return g().a(i, j);
    }

    @Override // defpackage.xc7
    public String c(int i, Locale locale) {
        return e(i, locale);
    }

    @Override // defpackage.xc7
    public String d(long j, Locale locale) {
        return c(b(j), locale);
    }

    @Override // defpackage.xc7
    public String e(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.xc7
    public String f(long j, Locale locale) {
        return e(b(j), locale);
    }

    @Override // defpackage.xc7
    public psa h() {
        return null;
    }

    @Override // defpackage.xc7
    public int i(Locale locale) {
        int j = j();
        if (j >= 0) {
            if (j < 10) {
                return 1;
            }
            if (j < 100) {
                return 2;
            }
            if (j < 1000) {
                return 3;
            }
        }
        return Integer.toString(j).length();
    }

    @Override // defpackage.xc7
    public final String o() {
        return this.a.c();
    }

    @Override // defpackage.xc7
    public final DateTimeFieldType q() {
        return this.a;
    }

    @Override // defpackage.xc7
    public boolean r(long j) {
        return false;
    }

    @Override // defpackage.xc7
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "DateTimeField[" + this.a.c() + ']';
    }

    @Override // defpackage.xc7
    public long u(long j) {
        return j - w(j);
    }

    @Override // defpackage.xc7
    public long v(long j) {
        long w = w(j);
        return w != j ? a(1, w) : j;
    }

    @Override // defpackage.xc7
    public long x(long j) {
        long w = w(j);
        long v = v(j);
        return v - j <= j - w ? v : w;
    }

    @Override // defpackage.xc7
    public long y(long j) {
        long w = w(j);
        long v = v(j);
        long j2 = j - w;
        long j3 = v - j;
        return (j2 >= j3 && (j3 < j2 || (b(v) & 1) == 0)) ? v : w;
    }

    @Override // defpackage.xc7
    public long z(long j) {
        long w = w(j);
        long v = v(j);
        return j - w <= v - j ? w : v;
    }
}
