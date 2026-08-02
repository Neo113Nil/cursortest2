package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class y6 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    public y6() {
        x0 x0Var = new x0((char) 0, 15);
        x0Var.c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        x0Var.d = iArr;
        x0Var.b = -1;
        this.c = x0Var;
        this.e = new StringBuilder();
    }

    public static int A(s2c s2cVar, long j, ci0 ci0Var) {
        if (j == s2cVar.getPosition()) {
            return 0;
        }
        ci0Var.a = j;
        return 1;
    }

    public static /* synthetic */ void q(y6 y6Var, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = y6Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        y6Var.p(i, str, str2);
        throw null;
    }

    public static boolean u(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    public void B(long j) {
        bq0 bq0Var = (bq0) this.e;
        if (bq0Var == null || bq0Var.a != j) {
            o03 o03Var = (o03) this.c;
            this.e = new bq0(j, o03Var.a.c(j), o03Var.c, o03Var.d, o03Var.e, o03Var.f);
        }
    }

    public abstract int C();

    public String D(int i, int i2) {
        return s().subSequence(i, i2).toString();
    }

    public boolean E() {
        int C = C();
        CharSequence s = s();
        if (C >= s.length() || C == -1 || s.charAt(C) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean F(boolean z) {
        int z2 = z(C());
        int length = s().length() - z2;
        if (length >= 4 && z2 != -1) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("null".charAt(i) != s().charAt(z2 + i)) {
                        break;
                    }
                    i++;
                } else if (length <= 4 || wct.r(s().charAt(z2 + 4)) != 0) {
                    if (z) {
                        this.b = z2 + 4;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void G(char c) {
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String l = l();
                this.b = i;
                if (Intrinsics.d(l, "null")) {
                    p(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String M = wct.M(wct.r(c));
        int i2 = this.b;
        int i3 = i2 - 1;
        q(this, hrg.s("Expected ", M, ", but had '", (i2 == s().length() || i3 < 0) ? "EOF" : String.valueOf(s().charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public int a(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.e).append((char) (r(i + 3, charSequence) + (r(i, charSequence) << 12) + (r(i + 1, charSequence) << 8) + (r(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        n();
        if (this.b + 4 < charSequence.length()) {
            return a(this.b, charSequence);
        }
        q(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i, int i2) {
        ((StringBuilder) this.e).append(s(), i, i2);
    }

    public abstract boolean c();

    public void d(int i, String str) {
        if (s().length() - i < str.length()) {
            q(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (s().charAt(i + i2) | ' ')) {
                q(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public abstract String e();

    public abstract byte f();

    public byte g(byte b) {
        byte f = f();
        if (f == b) {
            return f;
        }
        String M = wct.M(b);
        int i = this.b;
        int i2 = i - 1;
        q(this, hrg.s("Expected ", M, ", but had '", (i == s().length() || i2 < 0) ? "EOF" : String.valueOf(s().charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public abstract void h(char c);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        q(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ab, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b2, code lost:
    
        defpackage.b6e.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c3, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ca, code lost:
    
        q(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010e, code lost:
    
        q(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:
    
        if (s().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        q(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        q(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0162, code lost:
    
        r21.b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long i() {
        boolean z;
        boolean z2;
        boolean z3;
        int z4 = z(C());
        int i = 0;
        if (z4 < s().length() && z4 != -1) {
            if (s().charAt(z4) == '\"') {
                z4++;
                if (z4 == s().length()) {
                    q(this, "EOF", 0, null, 6);
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            int i2 = z4;
            int i3 = 0;
            boolean z5 = false;
            boolean z6 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i2 == s().length()) {
                    z2 = z;
                    z3 = z5;
                    break;
                }
                char charAt = s().charAt(i2);
                if ((charAt != 'e' && charAt != 'E') || z5) {
                    z2 = z;
                    if (charAt == '-' && z5) {
                        if (i2 == z4) {
                            q(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                            throw null;
                        }
                        i2++;
                        i3 = i;
                        z = z2;
                    } else if (charAt != '+' || !z5) {
                        z3 = z5;
                        if (charAt != '-') {
                            if (wct.r(charAt) != 0) {
                                break;
                            }
                            i2++;
                            int i4 = charAt - '0';
                            if (i4 < 0 || i4 >= 10) {
                                break;
                            }
                            if (z3) {
                                j = (j * 10) + i4;
                                z = z2;
                                z5 = z3;
                            } else {
                                j2 = (j2 * 10) - i4;
                                if (j2 > 0) {
                                    q(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                                z = z2;
                                z5 = z3;
                                i = 0;
                            }
                        } else {
                            if (i2 != z4) {
                                q(this, "Unexpected symbol '-' in numeric literal", i, null, 6);
                                throw null;
                            }
                            i2++;
                            z = z2;
                            z5 = z3;
                            z6 = true;
                        }
                    } else {
                        if (i2 == z4) {
                            q(this, "Unexpected symbol '+' in numeric literal", i, null, 6);
                            throw null;
                        }
                        i2++;
                        z = z2;
                        i3 = 1;
                    }
                } else {
                    if (i2 == z4) {
                        q(this, "Unexpected symbol " + charAt + " in numeric literal", i, null, 6);
                        throw null;
                    }
                    i2++;
                    i3 = 1;
                    z5 = true;
                }
            }
        } else {
            q(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public String j() {
        String str = (String) this.d;
        if (str == null) {
            return e();
        }
        str.getClass();
        this.d = null;
        return str;
    }

    public String k(CharSequence charSequence, int i, int i2) {
        String sb;
        StringBuilder sb2 = (StringBuilder) this.e;
        charSequence.getClass();
        char charAt = charSequence.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                b(i, i2);
                int z2 = z(i2 + 1);
                if (z2 == -1) {
                    q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int i3 = z2 + 1;
                char charAt2 = s().charAt(z2);
                if (charAt2 == 'u') {
                    i3 = a(i3, s());
                } else {
                    char c = charAt2 < 'u' ? wd4.a[charAt2] : (char) 0;
                    if (c == 0) {
                        q(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    sb2.append(c);
                }
                i = z(i3);
                if (i == -1) {
                    q(this, "Unexpected EOF", i, null, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    b(i, i2);
                    i = z(i2);
                    if (i == -1) {
                        q(this, "Unexpected EOF", i, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    charAt = charSequence.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = charSequence.charAt(i2);
        }
        if (z) {
            b(i, i2);
            sb = sb2.toString();
            sb2.setLength(0);
        } else {
            sb = D(i, i2);
        }
        this.b = i2 + 1;
        return sb;
    }

    public String l() {
        String str;
        StringBuilder sb = (StringBuilder) this.e;
        String str2 = (String) this.d;
        if (str2 != null) {
            str2.getClass();
            this.d = null;
            return str2;
        }
        int C = C();
        if (C >= s().length() || C == -1) {
            q(this, "EOF", C, null, 4);
            throw null;
        }
        byte r = wct.r(s().charAt(C));
        if (r == 1) {
            return j();
        }
        if (r != 0) {
            q(this, "Expected beginning of the string, but got " + s().charAt(C), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (wct.r(s().charAt(C)) == 0) {
            C++;
            if (C >= s().length()) {
                b(this.b, C);
                int z2 = z(C);
                if (z2 == -1) {
                    this.b = C;
                    b(0, 0);
                    String sb2 = sb.toString();
                    sb.setLength(0);
                    return sb2;
                }
                C = z2;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            b(i, C);
            String sb3 = sb.toString();
            sb.setLength(0);
            str = sb3;
        } else {
            str = D(i, C);
        }
        this.b = C;
        return str;
    }

    public String m() {
        String l = l();
        if (!Intrinsics.d(l, "null") || s().charAt(this.b - 1) == '\"') {
            return l;
        }
        q(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void o() {
        if (f() == 10) {
            return;
        }
        q(this, "Expected EOF after parsing, but had " + s().charAt(this.b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void p(int i, String str, String str2) {
        str2.getClass();
        String concat = str2.length() == 0 ? "" : StringUtil.LF.concat(str2);
        StringBuilder m = tlm.m(str, " at path: ");
        m.append(((x0) this.c).E());
        m.append(concat);
        throw ghh.j(m.toString(), s(), i);
    }

    public int r(int i, CharSequence charSequence) {
        char charAt = charSequence.charAt(i);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        q(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence s();

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        return A(r29, r9, r30);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int t(s2c s2cVar, ci0 ci0Var) {
        r03 r03Var = (r03) this.d;
        while (true) {
            bq0 bq0Var = (bq0) this.e;
            vq1.B(bq0Var);
            long j = bq0Var.f;
            long j2 = bq0Var.g;
            long j3 = bq0Var.h;
            if (j2 - j <= this.b) {
                this.e = null;
                r03Var.d();
                v(j, false);
                return A(s2cVar, j, ci0Var);
            }
            long position = j3 - s2cVar.getPosition();
            if (position < 0 || position > 262144) {
                break;
            }
            s2cVar.y((int) position);
            s2cVar.n();
            q03 b = r03Var.b(s2cVar, bq0Var.b);
            int i = b.c;
            long j4 = b.a;
            long j5 = b.b;
            if (i == -3) {
                this.e = null;
                r03Var.d();
                v(j3, false);
                return A(s2cVar, j3, ci0Var);
            }
            if (i == -2) {
                bq0Var.d = j4;
                bq0Var.f = j5;
                bq0Var.h = bq0.a(bq0Var.b, j4, bq0Var.e, j5, bq0Var.g, bq0Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        xq0.q("Invalid case");
                        return 0;
                    }
                    long position2 = j5 - s2cVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        s2cVar.y((int) position2);
                    }
                    this.e = null;
                    r03Var.d();
                    v(j5, true);
                    return A(s2cVar, j5, ci0Var);
                }
                bq0Var.e = j4;
                bq0Var.g = j5;
                bq0Var.h = bq0.a(bq0Var.b, bq0Var.d, j4, bq0Var.f, j5, bq0Var.c);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) s());
                sb.append("', currentPosition=");
                return vz1.r(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public abstract String w(String str, boolean z);

    public byte x() {
        CharSequence s = s();
        int i = this.b;
        while (true) {
            int z = z(i);
            if (z == -1) {
                this.b = z;
                return (byte) 10;
            }
            char charAt = s.charAt(z);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.b = z;
                return wct.r(charAt);
            }
            i = z + 1;
        }
    }

    public String y(boolean z) {
        String j;
        byte x = x();
        if (z) {
            if (x != 1 && x != 0) {
                return null;
            }
            j = l();
        } else {
            if (x != 1) {
                return null;
            }
            j = j();
        }
        this.d = j;
        return j;
    }

    public abstract int z(int i);

    public void n() {
    }

    public y6(p03 p03Var, r03 r03Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.d = r03Var;
        this.b = i;
        this.c = new o03(p03Var, j, j2, j3, j4, j5);
    }

    public void v(long j, boolean z) {
    }
}
