package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public class i implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.o a;
    public final int b;
    public final int c;
    public final e0 d;
    public final int e;

    public long a(x xVar, long j) {
        return j;
    }

    public i(j$.time.temporal.o oVar, int i, int i2, e0 e0Var) {
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = e0Var;
        this.e = 0;
    }

    public i(j$.time.temporal.o oVar, int i, int i2, e0 e0Var, int i3) {
        this.a = oVar;
        this.b = i;
        this.c = i2;
        this.d = e0Var;
        this.e = i3;
    }

    public i d() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i e(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean u(x xVar, StringBuilder sb) {
        j$.time.temporal.o oVar = this.a;
        Long a = xVar.a(oVar);
        if (a == null) {
            return false;
        }
        long a2 = a(xVar, a.longValue());
        b0 b0Var = xVar.b.c;
        String l = a2 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(a2));
        int length = l.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.b("Field " + oVar + " cannot be printed as the value " + a2 + " exceeds the maximum print width of " + i);
        }
        b0Var.getClass();
        int i2 = this.b;
        e0 e0Var = this.d;
        if (a2 >= 0) {
            int i3 = b.a[e0Var.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && a2 >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[e0Var.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.b("Field " + oVar + " cannot be printed as the value " + a2 + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - l.length(); i5++) {
            sb.append('0');
        }
        sb.append(l);
        return true;
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == e0.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        r5 = r12;
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0174, code lost:
    
        if (r6 <= r10) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int E(v vVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        BigInteger bigInteger;
        boolean z3;
        boolean z4;
        int i3;
        long j;
        DateTimeFormatter dateTimeFormatter;
        boolean z5;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        DateTimeFormatter dateTimeFormatter2 = vVar.a;
        dateTimeFormatter2.c.getClass();
        int i4 = this.c;
        e0 e0Var = this.d;
        int i5 = this.b;
        int i6 = 0;
        boolean z6 = true;
        if (charAt == '+') {
            boolean z7 = vVar.c;
            boolean z8 = i5 == i4;
            int ordinal = e0Var.ordinal();
            if (ordinal == 0 ? z7 : !(ordinal == 1 || ordinal == 4 || (!z7 && !z8))) {
                return ~i;
            }
            i2 = i + 1;
            z = false;
            z2 = true;
        } else {
            dateTimeFormatter2.c.getClass();
            if (charAt == '-') {
                boolean z9 = vVar.c;
                boolean z10 = i5 == i4;
                int ordinal2 = e0Var.ordinal();
                if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 4 && (z9 || z10)) {
                    return ~i;
                }
                i2 = i + 1;
                z2 = false;
                z = true;
            } else {
                if (e0Var == e0.ALWAYS && vVar.c) {
                    return ~i;
                }
                i2 = i;
                z = false;
                z2 = false;
            }
        }
        int i7 = (vVar.c || b(vVar)) ? i5 : 1;
        int i8 = i2 + i7;
        if (i8 > length) {
            return ~i2;
        }
        if (!vVar.c && !b(vVar)) {
            i4 = 9;
        }
        int i9 = this.e;
        int max = Math.max(i9, 0) + i4;
        while (true) {
            bigInteger = null;
            if (i6 >= 2) {
                z3 = z;
                z4 = z2;
                i3 = i2;
                j = 0;
                break;
            }
            int min = Math.min(i2 + max, length);
            boolean z11 = z6;
            long j2 = 0;
            int i10 = i2;
            while (true) {
                if (i10 >= min) {
                    z3 = z;
                    break;
                }
                int i11 = i10 + 1;
                char charAt2 = charSequence.charAt(i10);
                dateTimeFormatter2.c.getClass();
                int i12 = charAt2 - '0';
                z3 = z;
                if (i12 < 0 || i12 > 9) {
                    i12 = -1;
                }
                if (i12 >= 0) {
                    if (i11 - i2 > 18) {
                        if (bigInteger == null) {
                            bigInteger = BigInteger.valueOf(j2);
                        }
                        dateTimeFormatter = dateTimeFormatter2;
                        z5 = z2;
                        bigInteger = bigInteger.multiply(BigInteger.TEN).add(BigInteger.valueOf(i12));
                    } else {
                        dateTimeFormatter = dateTimeFormatter2;
                        z5 = z2;
                        j2 = (j2 * 10) + i12;
                    }
                    i10 = i11;
                    z = z3;
                    dateTimeFormatter2 = dateTimeFormatter;
                    z2 = z5;
                } else if (i10 < i8) {
                    return ~i2;
                }
            }
            DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2;
            z4 = z2;
            if (i9 <= 0 || i6 != 0) {
                break;
            }
            int max2 = Math.max(i7, (i10 - i2) - i9);
            i6++;
            z6 = z11;
            z = z3;
            dateTimeFormatter2 = dateTimeFormatter3;
            z2 = z4;
            max = max2;
        }
        BigInteger bigInteger2 = bigInteger;
        if (z3) {
            if (bigInteger2 == null) {
                if (j != 0 || !vVar.c) {
                    j = -j;
                    if (bigInteger2 == null) {
                    }
                }
                return ~(i2 - 1);
            }
            if (!bigInteger2.equals(BigInteger.ZERO) || !vVar.c) {
                bigInteger2 = bigInteger2.negate();
                if (bigInteger2 == null) {
                    return c(vVar, j, i2, i3);
                }
                if (bigInteger2.bitLength() > 63) {
                    bigInteger2 = bigInteger2.divide(BigInteger.TEN);
                    i3--;
                }
                return c(vVar, bigInteger2.longValue(), i2, i3);
            }
            return ~(i2 - 1);
        }
        if (e0Var == e0.EXCEEDS_PAD && vVar.c) {
            int i13 = i3 - i2;
            if (!z4) {
                if (i13 > i5) {
                    return ~i2;
                }
            }
        }
        if (bigInteger2 == null) {
        }
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.f(this.a, j, i, i2);
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.o oVar = this.a;
        e0 e0Var = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && e0Var == e0.NORMAL) {
            return "Value(" + oVar + ")";
        }
        if (i2 == i && e0Var == e0.NOT_NEGATIVE) {
            return "Value(" + oVar + StringUtils.COMMA + i2 + ")";
        }
        return "Value(" + oVar + StringUtils.COMMA + i2 + StringUtils.COMMA + i + StringUtils.COMMA + e0Var + ")";
    }
}
