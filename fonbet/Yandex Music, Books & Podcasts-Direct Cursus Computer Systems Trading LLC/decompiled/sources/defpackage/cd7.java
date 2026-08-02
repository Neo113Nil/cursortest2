package defpackage;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.field.MillisDurationField;

/* loaded from: classes5.dex */
public final class cd7 implements qve, cve {
    public final DateTimeFieldType a;
    public final int b;
    public final int c;

    public cd7(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        this.a = dateTimeFieldType;
        i2 = i2 > 18 ? 18 : i2;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.cve
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        xc7 b = this.a.b(pd7Var.a);
        int min = Math.min(this.c, charSequence.length() - i);
        long d = b.g().d() * 10;
        long j = 0;
        int i2 = 0;
        while (i2 < min) {
            char charAt = charSequence.charAt(i + i2);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i2++;
            d /= 10;
            j += (charAt - '0') * d;
        }
        long j2 = j / 10;
        if (i2 == 0) {
            return ~i;
        }
        if (j2 > 2147483647L) {
            return ~i;
        }
        glm glmVar = new glm(DateTimeFieldType.w, MillisDurationField.a, b.g());
        nd7 c = pd7Var.c();
        c.a = glmVar;
        c.b = (int) j2;
        c.c = null;
        c.d = null;
        return i + i2;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        long j2;
        xc7 b = this.a.b(rk4Var);
        int i2 = this.b;
        try {
            long u = b.u(j);
            if (u == 0) {
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        return;
                    } else {
                        sb.append('0');
                    }
                }
            } else {
                long d = b.g().d();
                int i3 = this.c;
                while (true) {
                    switch (i3) {
                        case 1:
                            j2 = 10;
                            break;
                        case 2:
                            j2 = 100;
                            break;
                        case 3:
                            j2 = 1000;
                            break;
                        case 4:
                            j2 = 10000;
                            break;
                        case 5:
                            j2 = 100000;
                            break;
                        case 6:
                            j2 = 1000000;
                            break;
                        case 7:
                            j2 = 10000000;
                            break;
                        case 8:
                            j2 = 100000000;
                            break;
                        case 9:
                            j2 = 1000000000;
                            break;
                        case 10:
                            j2 = 10000000000L;
                            break;
                        case 11:
                            j2 = 100000000000L;
                            break;
                        case 12:
                            j2 = 1000000000000L;
                            break;
                        case 13:
                            j2 = 10000000000000L;
                            break;
                        case 14:
                            j2 = 100000000000000L;
                            break;
                        case 15:
                            j2 = 1000000000000000L;
                            break;
                        case 16:
                            j2 = 10000000000000000L;
                            break;
                        case 17:
                            j2 = 100000000000000000L;
                            break;
                        case 18:
                            j2 = 1000000000000000000L;
                            break;
                        default:
                            j2 = 1;
                            break;
                    }
                    if ((d * j2) / j2 == d) {
                        long[] jArr = {(u * j2) / d, i3};
                        long j3 = jArr[0];
                        int i4 = (int) jArr[1];
                        String num = (2147483647L & j3) == j3 ? Integer.toString((int) j3) : Long.toString(j3);
                        int length = num.length();
                        while (length < i4) {
                            sb.append('0');
                            i2--;
                            i4--;
                        }
                        if (i2 < i4) {
                            while (i2 < i4 && length > 1 && num.charAt(length - 1) == '0') {
                                i4--;
                                length--;
                            }
                            if (length < num.length()) {
                                for (int i5 = 0; i5 < length; i5++) {
                                    sb.append(num.charAt(i5));
                                }
                                return;
                            }
                        }
                        sb.append((CharSequence) num);
                        return;
                    }
                    i3--;
                }
            }
        } catch (RuntimeException unused) {
            while (true) {
                i2--;
                if (i2 < 0) {
                    return;
                } else {
                    sb.append((char) 65533);
                }
            }
        }
    }

    @Override // defpackage.qve
    public final int d() {
        return this.c;
    }
}
