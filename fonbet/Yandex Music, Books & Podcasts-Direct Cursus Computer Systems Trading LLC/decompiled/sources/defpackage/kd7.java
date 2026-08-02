package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class kd7 implements qve, cve {
    public final DateTimeFieldType a;
    public final int b;
    public final boolean c;

    public kd7(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
        this.a = dateTimeFieldType;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.cve
    public final int a() {
        return this.c ? 4 : 2;
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = i;
        rk4 rk4Var = pd7Var.a;
        int length = charSequence.length() - i4;
        boolean z = this.c;
        DateTimeFieldType dateTimeFieldType = this.a;
        if (z) {
            int i5 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i5 < length) {
                char charAt = charSequence.charAt(i4 + i5);
                if (i5 != 0 || (charAt != '-' && charAt != '+')) {
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    i5++;
                } else {
                    z3 = charAt == '-';
                    if (z3) {
                        i5++;
                    } else {
                        i4++;
                        length--;
                    }
                    z2 = true;
                }
            }
            if (i5 == 0) {
                return ~i4;
            }
            if (z2 || i5 != 2) {
                if (i5 >= 9) {
                    i2 = i5 + i4;
                    i3 = Integer.parseInt(charSequence.subSequence(i4, i2).toString());
                } else {
                    int i6 = z3 ? i4 + 1 : i4;
                    int i7 = i6 + 1;
                    try {
                        int charAt2 = charSequence.charAt(i6) - '0';
                        i2 = i5 + i4;
                        while (i7 < i2) {
                            int charAt3 = (charSequence.charAt(i7) + ((charAt2 << 3) + (charAt2 << 1))) - 48;
                            i7++;
                            charAt2 = charAt3;
                        }
                        i3 = z3 ? -charAt2 : charAt2;
                    } catch (StringIndexOutOfBoundsException unused) {
                        return ~i4;
                    }
                }
                nd7 c = pd7Var.c();
                c.a = dateTimeFieldType.b(rk4Var);
                c.b = i3;
                c.c = null;
                c.d = null;
                return i2;
            }
        } else if (Math.min(2, length) < 2) {
            return ~i4;
        }
        char charAt4 = charSequence.charAt(i4);
        if (charAt4 < '0' || charAt4 > '9') {
            return ~i4;
        }
        int i8 = charAt4 - '0';
        char charAt5 = charSequence.charAt(i4 + 1);
        if (charAt5 < '0' || charAt5 > '9') {
            return ~i4;
        }
        int i9 = (((i8 << 3) + (i8 << 1)) + charAt5) - 48;
        int i10 = this.b;
        int i11 = i10 - 50;
        int i12 = i11 >= 0 ? i11 % 100 : ((i10 - 49) % 100) + 99;
        int i13 = ((i11 + (i9 < i12 ? 100 : 0)) - i12) + i9;
        nd7 c2 = pd7Var.c();
        c2.a = dateTimeFieldType.b(rk4Var);
        c2.b = i13;
        c2.c = null;
        c2.d = null;
        return i4 + 2;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        int i2;
        try {
            int b = this.a.b(rk4Var).b(j);
            if (b < 0) {
                b = -b;
            }
            i2 = b % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 >= 0) {
            isc.a(sb, i2, 2);
        } else {
            sb.append((char) 65533);
            sb.append((char) 65533);
        }
    }

    @Override // defpackage.qve
    public final int d() {
        return 2;
    }
}
