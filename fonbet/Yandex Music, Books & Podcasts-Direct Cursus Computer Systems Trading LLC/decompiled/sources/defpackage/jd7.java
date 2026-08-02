package defpackage;

import com.connectsdk.discovery.DiscoveryProvider;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* loaded from: classes5.dex */
public final class jd7 implements qve, cve {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;

    public jd7(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        if (i < 2) {
            e7o.e();
            throw null;
        }
        this.d = 2;
        this.e = i;
    }

    public static int e(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int min = Math.min(charSequence.length() - i, i2); min > 0; min--) {
            char charAt = charSequence.charAt(i + i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // defpackage.cve
    public final int a() {
        return d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x007e, code lost:
    
        if (r9 <= '9') goto L43;
     */
    @Override // defpackage.cve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        boolean z;
        char charAt;
        boolean z2 = false;
        int length = charSequence.length() - i;
        String str = this.b;
        if (str != null) {
            if (str.length() == 0) {
                if (length <= 0 || ((charAt = charSequence.charAt(i)) != '-' && charAt != '+')) {
                    pd7Var.i = null;
                    pd7Var.e = 0;
                    return i;
                }
            } else if (md7.o(str, charSequence, i)) {
                pd7Var.i = null;
                pd7Var.e = 0;
                return str.length() + i;
            }
        }
        if (length <= 1) {
            return ~i;
        }
        char charAt2 = charSequence.charAt(i);
        if (charAt2 == '-') {
            z = true;
        } else {
            if (charAt2 != '+') {
                return ~i;
            }
            z = false;
        }
        int i2 = i + 1;
        if (e(charSequence, i2, 2) < 2) {
            return ~i2;
        }
        int b = isc.b(i2, charSequence);
        if (b > 23) {
            return ~i2;
        }
        int i3 = b * 3600000;
        int i4 = length - 3;
        int i5 = i + 3;
        if (i4 > 0) {
            char charAt3 = charSequence.charAt(i5);
            if (charAt3 == ':') {
                i4 = length - 4;
                i5 = i + 4;
                z2 = true;
            } else if (charAt3 >= '0') {
            }
            int e = e(charSequence, i5, 2);
            if (e != 0 || z2) {
                if (e < 2) {
                    return ~i5;
                }
                int b2 = isc.b(i5, charSequence);
                if (b2 > 59) {
                    return ~i5;
                }
                i3 += b2 * DiscoveryProvider.TIMEOUT;
                int i6 = i4 - 2;
                int i7 = i5 + 2;
                if (i6 > 0) {
                    if (!z2) {
                        i5 = i7;
                    } else if (charSequence.charAt(i7) == ':') {
                        i6 = i4 - 3;
                        i5 += 3;
                    }
                    int e2 = e(charSequence, i5, 2);
                    if (e2 != 0 || z2) {
                        if (e2 < 2) {
                            return ~i5;
                        }
                        int b3 = isc.b(i5, charSequence);
                        if (b3 > 59) {
                            return ~i5;
                        }
                        i3 += b3 * 1000;
                        int i8 = i5 + 2;
                        if (i6 - 2 > 0) {
                            if (!z2) {
                                i5 = i8;
                            } else if (charSequence.charAt(i8) == '.' || charSequence.charAt(i8) == ',') {
                                i5 += 3;
                            }
                            int e3 = e(charSequence, i5, 3);
                            if (e3 != 0 || z2) {
                                if (e3 < 1) {
                                    return ~i5;
                                }
                                int i9 = i5 + 1;
                                i3 += (charSequence.charAt(i5) - '0') * 100;
                                if (e3 > 1) {
                                    int i10 = i5 + 2;
                                    i3 += (charSequence.charAt(i9) - '0') * 10;
                                    if (e3 > 2) {
                                        i5 += 3;
                                        i3 += charSequence.charAt(i10) - '0';
                                    } else {
                                        i5 = i10;
                                    }
                                } else {
                                    i5 = i9;
                                }
                            }
                        }
                        i5 = i8;
                    }
                }
                i5 = i7;
            }
        }
        if (z) {
            i3 = -i3;
        }
        Integer valueOf = Integer.valueOf(i3);
        pd7Var.i = null;
        pd7Var.e = valueOf;
        return i5;
    }

    @Override // defpackage.qve
    public final void c(StringBuilder sb, long j, rk4 rk4Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        String str;
        if (dateTimeZone == null) {
            return;
        }
        if (i == 0 && (str = this.a) != null) {
            sb.append((CharSequence) str);
            return;
        }
        if (i >= 0) {
            sb.append('+');
        } else {
            sb.append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        isc.a(sb, i2, 2);
        int i3 = this.e;
        if (i3 == 1) {
            return;
        }
        int i4 = i - (i2 * 3600000);
        int i5 = this.d;
        if (i4 != 0 || i5 > 1) {
            int i6 = i4 / DiscoveryProvider.TIMEOUT;
            boolean z = this.c;
            if (z) {
                sb.append(':');
            }
            isc.a(sb, i6, 2);
            if (i3 == 2) {
                return;
            }
            int i7 = i4 - (i6 * DiscoveryProvider.TIMEOUT);
            if (i7 != 0 || i5 > 2) {
                int i8 = i7 / 1000;
                if (z) {
                    sb.append(':');
                }
                isc.a(sb, i8, 2);
                if (i3 == 3) {
                    return;
                }
                int i9 = i7 - (i8 * 1000);
                if (i9 != 0 || i5 > 3) {
                    if (z) {
                        sb.append('.');
                    }
                    isc.a(sb, i9, 3);
                }
            }
        }
    }

    @Override // defpackage.qve
    public final int d() {
        int i = this.d;
        int i2 = (i + 1) << 1;
        if (this.c) {
            i2 += i - 1;
        }
        String str = this.a;
        return (str == null || str.length() <= i2) ? i2 : str.length();
    }
}
