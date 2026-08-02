package ru.CryptoPro.pc_0.pc_3.pc_0.pc_0.pc_0.pc_0.pc_0.pc_0;

import com.adjust.sdk.Constants;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.b64;
import defpackage.czs0;
import defpackage.ny61;
import defpackage.tv61;
import defpackage.vfc;
import defpackage.wr61;
import defpackage.xr61;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.pc_0.pc_2.cl_1;

/* loaded from: classes4.dex */
public class cl_6 extends wr61 implements Serializable, Cloneable {
    public static final BigInteger A;
    public static final BigInteger B;
    public static final BigInteger C;
    public static final BigInteger D;
    public static final BigDecimal E;
    public static final BigDecimal F;
    public static final BigDecimal G;
    public static final int[] H;
    private static final long serialVersionUID = 1;
    public static final BigInteger y;
    public static final BigInteger z;
    private BigInteger b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private BigDecimal j;
    public static final BigInteger a = new BigInteger("1000000000");
    public static final Date w = new Date(Long.MIN_VALUE);
    public static final String[] x = {"Year", "Month", "Day", "Hour", "Minute", "Second", "Millisecond", "Timezone"};

    static {
        cl_6 cl_6Var = new cl_6();
        cl_6Var.b = null;
        cl_6Var.c = Integer.MIN_VALUE;
        cl_6Var.d = Integer.MIN_VALUE;
        cl_6Var.e = Integer.MIN_VALUE;
        cl_6Var.f = Integer.MIN_VALUE;
        cl_6Var.g = Integer.MIN_VALUE;
        cl_6Var.h = Integer.MIN_VALUE;
        cl_6Var.i = Integer.MIN_VALUE;
        cl_6Var.j = null;
        cl_6Var.H(Constants.MINIMAL_ERROR_STATUS_CODE);
        cl_6Var.K(1);
        cl_6Var.L(1);
        cl_6Var.D(0, 0, 0, null);
        cl_6Var.g(Integer.MIN_VALUE);
        cl_6Var.j = null;
        if (!cl_6Var.Q()) {
            ny61.g("InvalidXGCValue-milli 400 1 1 0 0 0 -2147483648 -2147483648");
            return;
        }
        y = BigInteger.valueOf(4L);
        z = BigInteger.valueOf(100L);
        A = BigInteger.valueOf(400L);
        B = BigInteger.valueOf(60L);
        C = BigInteger.valueOf(24L);
        D = BigInteger.valueOf(12L);
        E = new BigDecimal("0");
        F = new BigDecimal("1");
        G = new BigDecimal("60");
        H = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    public cl_6(String str) {
        String str2;
        int i;
        int i2;
        int i3;
        char c;
        this.b = null;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = null;
        int length = str.length();
        int indexOf = str.indexOf(84);
        int i4 = 0;
        char c2 = LicenseUtility.SEPARATOR;
        if (indexOf != -1) {
            str2 = "%Y-%M-%DT%h:%m:%s%z";
        } else if (length >= 3 && str.charAt(2) == ':') {
            str2 = "%h:%m:%s%z";
        } else if (str.startsWith("--")) {
            str2 = (length < 3 || str.charAt(2) != '-') ? (length == 4 || length == 5 || length == 10) ? "--%M%z" : "--%M-%D%z" : "---%D%z";
        } else {
            length = str.indexOf(58) != -1 ? length - 6 : length;
            int i5 = 0;
            for (int i6 = 1; i6 < length; i6++) {
                if (str.charAt(i6) == '-') {
                    i5++;
                }
            }
            str2 = i5 == 0 ? "%Y%z" : i5 == 1 ? "%Y-%M%z" : "%Y-%M-%D%z";
        }
        czs0 czs0Var = new czs0(this, str2, str);
        while (true) {
            int i7 = czs0Var.d;
            if (i7 >= czs0Var.b) {
                if (czs0Var.e != czs0Var.c) {
                    ny61.g(str);
                    throw null;
                }
                S();
                if (Q()) {
                    return;
                }
                ny61.g("InvalidXGCRepresentation ".concat(str));
                throw null;
            }
            czs0Var.d = i7 + 1;
            char charAt = str2.charAt(i7);
            if (charAt != '%') {
                czs0Var.b(charAt);
            } else {
                int i8 = czs0Var.d;
                czs0Var.d = i8 + 1;
                char charAt2 = str2.charAt(i8);
                if (charAt2 == 'D') {
                    L(czs0Var.a());
                } else if (charAt2 == 'M') {
                    K(czs0Var.a());
                } else if (charAt2 == 'Y') {
                    int i9 = czs0Var.e;
                    if (czs0Var.c() == c2) {
                        czs0Var.e++;
                        i = i4;
                        i2 = 1;
                    } else {
                        i = i4;
                        i2 = i;
                    }
                    while (true) {
                        char c3 = czs0Var.c();
                        boolean z2 = '0' <= c3 && c3 <= '9';
                        i3 = czs0Var.e;
                        if (!z2) {
                            break;
                        }
                        czs0Var.e = i3 + 1;
                        i = ((i * 10) + c3) - 48;
                    }
                    int i10 = i3 - i9;
                    if (i10 < 4) {
                        ny61.g(str);
                        throw null;
                    }
                    if (i10 < 7) {
                        this.c = i2 != 0 ? -i : i;
                        this.b = null;
                    } else {
                        F(new BigInteger(str.substring(i9, czs0Var.e)));
                    }
                } else if (charAt2 == 'h') {
                    A(czs0Var.a());
                } else if (charAt2 == 'm') {
                    M(czs0Var.a());
                } else if (charAt2 == 's') {
                    N(czs0Var.a());
                    if (czs0Var.c() == '.') {
                        int i11 = czs0Var.e;
                        if (czs0Var.c() != '.') {
                            ny61.g(str);
                            throw null;
                        }
                        do {
                            czs0Var.e++;
                            c = czs0Var.c();
                            if ('0' > c) {
                                break;
                            }
                        } while (c <= '9');
                        E(new BigDecimal(str.substring(i11, czs0Var.e)));
                    }
                } else {
                    if (charAt2 != 'z') {
                        throw new InternalError();
                    }
                    char c4 = czs0Var.c();
                    if (c4 == 'Z') {
                        czs0Var.e++;
                        g(i4);
                    } else if (c4 == '+' || c4 == c2) {
                        czs0Var.e++;
                        int a2 = czs0Var.a();
                        czs0Var.b(':');
                        g(((a2 * 60) + czs0Var.a()) * (c4 == '+' ? 1 : -1));
                    }
                }
                i4 = 0;
                c2 = LicenseUtility.SEPARATOR;
            }
        }
    }

    public static void C(int i, int i2) {
        StringBuilder t = b64.t(i2, "InvalidFieldValue ", " ");
        t.append(x[i]);
        throw new IllegalArgumentException(t.toString());
    }

    public static int J(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE) {
            return 2;
        }
        return i < i2 ? -1 : 1;
    }

    public static int w(wr61 wr61Var, wr61 wr61Var2) {
        if (wr61Var.c() == wr61Var2.c()) {
            int J = J(wr61Var.f(), wr61Var2.f());
            if (J != 0) {
                return J;
            }
        } else {
            BigInteger h = wr61Var.h();
            BigInteger h2 = wr61Var2.h();
            int i = 2;
            if (h == null) {
                if (h2 == null) {
                    i = 0;
                }
            } else if (h2 != null) {
                i = h.compareTo(h2);
            }
            if (i != 0) {
                return i;
            }
        }
        int J2 = J(wr61Var.i(), wr61Var2.i());
        if (J2 != 0) {
            return J2;
        }
        int J3 = J(wr61Var.j(), wr61Var2.j());
        if (J3 != 0) {
            return J3;
        }
        int J4 = J(wr61Var.p(), wr61Var2.p());
        if (J4 != 0) {
            return J4;
        }
        int J5 = J(wr61Var.q(), wr61Var2.q());
        if (J5 != 0) {
            return J5;
        }
        int J6 = J(wr61Var.r(), wr61Var2.r());
        if (J6 != 0) {
            return J6;
        }
        BigDecimal s = wr61Var.s();
        BigDecimal s2 = wr61Var2.s();
        if (s == s2) {
            return 0;
        }
        BigDecimal bigDecimal = E;
        if (s == null) {
            s = bigDecimal;
        }
        if (s2 == null) {
            s2 = bigDecimal;
        }
        return s.compareTo(s2);
    }

    public static int x(BigInteger bigInteger, int i) {
        int[] iArr = H;
        if (i != 2) {
            return iArr[i];
        }
        BigInteger mod = bigInteger.mod(A);
        BigInteger bigInteger2 = BigInteger.ZERO;
        if (mod.equals(bigInteger2)) {
            return 29;
        }
        if (bigInteger.mod(z).equals(bigInteger2) || !bigInteger.mod(y).equals(bigInteger2)) {
            return iArr[i];
        }
        return 29;
    }

    public static int y(char[] cArr, int i, int i2) {
        int i3 = i + 1;
        cArr[i] = (char) ((i2 / 10) + 48);
        int i4 = i + 2;
        cArr[i3] = (char) ((i2 % 10) + 48);
        return i4;
    }

    public static BigInteger z(Number number, int i) {
        if (i == 0 || number == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigInteger = (BigInteger) number;
        return i < 0 ? bigInteger.negate() : bigInteger;
    }

    public final void A(int i) {
        if ((i < 0 || i > 24) && i != Integer.MIN_VALUE) {
            C(3, i);
            throw null;
        }
        this.g = i;
    }

    public final void D(int i, int i2, int i3, BigDecimal bigDecimal) {
        A(i);
        M(i2);
        if (i3 == 60 && !((i == 23 && i2 == 59) || (i == 0 && i2 == 0))) {
            C(5, i3);
            throw null;
        }
        N(i3);
        E(bigDecimal);
        S();
    }

    public final void E(BigDecimal bigDecimal) {
        if (bigDecimal == null || (bigDecimal.compareTo(E) >= 0 && bigDecimal.compareTo(F) <= 0)) {
            this.j = bigDecimal;
        } else {
            throw new IllegalArgumentException("InvalidFractional " + bigDecimal.toString());
        }
    }

    public final void F(BigInteger bigInteger) {
        if (bigInteger == null) {
            this.b = null;
            this.c = Integer.MIN_VALUE;
            return;
        }
        BigInteger remainder = bigInteger.remainder(a);
        this.c = remainder.intValue();
        BigInteger subtract = bigInteger.subtract(remainder);
        if (subtract == null || subtract.compareTo(BigInteger.ZERO) != 0) {
            this.b = subtract;
        } else {
            this.b = null;
        }
    }

    public final void H(int i) {
        if (i == Integer.MIN_VALUE) {
            this.c = Integer.MIN_VALUE;
        } else {
            int abs = Math.abs(i);
            BigInteger bigInteger = a;
            if (abs >= bigInteger.intValue()) {
                BigInteger valueOf = BigInteger.valueOf(i);
                BigInteger remainder = valueOf.remainder(bigInteger);
                this.c = remainder.intValue();
                BigInteger subtract = valueOf.subtract(remainder);
                if (subtract == null || subtract.compareTo(BigInteger.ZERO) != 0) {
                    this.b = subtract;
                    return;
                } else {
                    this.b = null;
                    return;
                }
            }
            this.c = i;
        }
        this.b = null;
    }

    public final void K(int i) {
        if ((i < 1 || 12 < i) && i != Integer.MIN_VALUE) {
            C(1, i);
            throw null;
        }
        this.d = i;
    }

    public final void L(int i) {
        if ((i < 1 || 31 < i) && i != Integer.MIN_VALUE) {
            C(2, i);
            throw null;
        }
        this.e = i;
    }

    public final void M(int i) {
        if ((i < 0 || 59 < i) && i != Integer.MIN_VALUE) {
            C(4, i);
            throw null;
        }
        this.h = i;
    }

    public final void N(int i) {
        if ((i < 0 || 60 < i) && i != Integer.MIN_VALUE) {
            C(5, i);
            throw null;
        }
        this.i = i;
    }

    public final wr61 O(int i) {
        wr61 wr61Var = (wr61) clone();
        int i2 = -i;
        boolean z2 = i2 >= 0;
        if (i2 < 0) {
            i2 = -i2;
        }
        wr61Var.b(new cl_2(z2, 0, i2));
        wr61Var.g(0);
        return wr61Var;
    }

    public final boolean Q() {
        int i = this.d;
        if (i == 2) {
            int i2 = 29;
            if (this.b == null) {
                int i3 = this.c;
                if (i3 != Integer.MIN_VALUE) {
                    int[] iArr = H;
                    if (i != 2) {
                        i2 = iArr[i];
                    } else if (i3 % Constants.MINIMAL_ERROR_STATUS_CODE != 0 && (i3 % 100 == 0 || i3 % 4 != 0)) {
                        i2 = iArr[2];
                    }
                }
            } else if (h() != null) {
                i2 = x(h(), 2);
            }
            if (this.e > i2) {
                return false;
            }
        }
        if (this.g == 24 && (this.h != 0 || this.i != 0)) {
            return false;
        }
        if (this.b == null) {
            return this.c != 0;
        }
        BigInteger h = h();
        if (h == null) {
            return true;
        }
        BigInteger bigInteger = BigInteger.ZERO;
        return (bigInteger != null ? h.compareTo(bigInteger) : 2) != 0;
    }

    public final void S() {
        int i = this.g;
        if (i == 24) {
            if (this.h != 0 || this.i != 0) {
                C(3, i);
                throw null;
            }
            A(0);
            b(new cl_2(true, 1, 0));
        }
    }

    @Override // defpackage.wr61
    public final int a(wr61 wr61Var) {
        cl_6 cl_6Var = (cl_6) wr61Var;
        int i = this.f;
        int i2 = cl_6Var.f;
        if (i == i2) {
            return w(this, cl_6Var);
        }
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            return w((cl_6) t(), (cl_6) cl_6Var.t());
        }
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                this = (cl_6) t();
            }
            int w2 = w(this, cl_6Var.O(840));
            if (w2 == -1) {
                return w2;
            }
            int w3 = w(this, cl_6Var.O(-840));
            if (w3 == 1) {
                return w3;
            }
            return 2;
        }
        if (i2 != 0) {
            cl_6Var = (cl_6) cl_6Var.O(i2);
        }
        int w4 = w(O(-840), cl_6Var);
        if (w4 == -1) {
            return w4;
        }
        int w5 = w(O(840), cl_6Var);
        if (w5 == 1) {
            return w5;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f  */
    @Override // defpackage.wr61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(tv61 tv61Var) {
        int i;
        BigDecimal valueOf;
        BigDecimal bigDecimal;
        int i2;
        BigDecimal subtract;
        int i3;
        int i4;
        int i5;
        int x2;
        long j;
        BigInteger bigInteger;
        BigInteger add;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        BigInteger subtract2;
        int i12;
        boolean[] zArr = {false, false, false, false, false, false};
        int b = tv61Var.b();
        int i13 = this.d;
        if (i13 == Integer.MIN_VALUE) {
            zArr[1] = true;
            i13 = 1;
        }
        BigInteger add2 = BigInteger.valueOf(i13).add(z(tv61Var.a(xr61.b), b));
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger subtract3 = add2.subtract(bigInteger2);
        BigInteger bigInteger3 = D;
        K(subtract3.mod(bigInteger3).intValue() + 1);
        BigInteger bigInteger4 = new BigDecimal(add2.subtract(bigInteger2)).divide(new BigDecimal(bigInteger3), 3).toBigInteger();
        BigInteger h = h();
        if (h == null) {
            zArr[0] = true;
            h = BigInteger.ZERO;
        }
        F(h.add(z(tv61Var.a(xr61.a), b)).add(bigInteger4));
        int i14 = this.i;
        BigDecimal bigDecimal2 = E;
        if (i14 == Integer.MIN_VALUE) {
            zArr[5] = true;
            i = 4;
        } else {
            i = 4;
            if (i14 != Integer.MIN_VALUE) {
                valueOf = BigDecimal.valueOf(i14);
                BigDecimal bigDecimal3 = this.j;
                if (bigDecimal3 != null) {
                    valueOf = valueOf.add(bigDecimal3);
                }
                bigDecimal = (BigDecimal) tv61Var.a(xr61.f);
                BigDecimal bigDecimal4 = cl_2.w;
                if (b != 0 || bigDecimal == null) {
                    bigDecimal = cl_2.w;
                } else if (b <= 0) {
                    bigDecimal = bigDecimal.negate();
                }
                BigDecimal add3 = valueOf.add(bigDecimal);
                int i15 = i;
                BigDecimal bigDecimal5 = new BigDecimal(add3.toBigInteger());
                BigDecimal bigDecimal6 = G;
                BigDecimal bigDecimal7 = new BigDecimal(bigDecimal5.divide(bigDecimal6, 3).toBigInteger());
                BigDecimal subtract4 = add3.subtract(bigDecimal7.multiply(bigDecimal6));
                BigInteger bigInteger5 = bigDecimal7.toBigInteger();
                N(subtract4.intValue());
                i2 = 2;
                subtract = subtract4.subtract(new BigDecimal(BigInteger.valueOf(this.i)));
                if (subtract.compareTo(bigDecimal2) >= 0) {
                    E(F.add(subtract));
                    int i16 = this.i;
                    if (i16 == 0) {
                        N(59);
                        bigInteger5 = bigInteger5.subtract(bigInteger2);
                    } else {
                        N(i16 - 1);
                    }
                } else {
                    E(subtract);
                }
                i3 = this.h;
                if (i3 == Integer.MIN_VALUE) {
                    zArr[i15] = true;
                    i3 = 0;
                }
                BigInteger add4 = BigInteger.valueOf(i3).add(z(tv61Var.a(xr61.e), b)).add(bigInteger5);
                M(add4.mod(B).intValue());
                BigInteger bigInteger6 = new BigDecimal(add4).divide(bigDecimal6, 3).toBigInteger();
                i4 = this.g;
                if (i4 == Integer.MIN_VALUE) {
                    zArr[3] = true;
                    i4 = 0;
                }
                BigInteger add5 = BigInteger.valueOf(i4).add(z(tv61Var.a(xr61.d), b)).add(bigInteger6);
                BigInteger bigInteger7 = C;
                A(add5.mod(bigInteger7).intValue());
                BigInteger bigInteger8 = new BigDecimal(add5).divide(new BigDecimal(bigInteger7), 3).toBigInteger();
                i5 = this.e;
                if (i5 == Integer.MIN_VALUE) {
                    zArr[2] = true;
                    i5 = 1;
                }
                BigInteger z2 = z(tv61Var.a(xr61.c), b);
                x2 = x(h(), this.d);
                if (i5 <= x2) {
                    j = x2;
                } else {
                    if (i5 < 1) {
                        bigInteger = bigInteger2;
                        add = bigInteger.add(z2).add(bigInteger8);
                        while (true) {
                            if (add.compareTo(BigInteger.ONE) >= 0) {
                                if (add.compareTo(BigInteger.valueOf(x(h(), this.d))) <= 0) {
                                    break;
                                }
                                add = add.add(BigInteger.valueOf(-x(h(), this.d)));
                                i8 = 1;
                            } else {
                                if (this.d >= i2) {
                                    subtract2 = h();
                                    i12 = this.d - 1;
                                } else {
                                    subtract2 = h().subtract(BigInteger.valueOf(1L));
                                    i12 = 12;
                                }
                                add = add.add(BigInteger.valueOf(x(subtract2, i12)));
                                i8 = -1;
                            }
                            int i17 = (this.d + i8) - 1;
                            i9 = i17 % 12;
                            if (i9 < 0) {
                                i11 = i9 + 13;
                                i10 = new BigDecimal(i17).divide(new BigDecimal(bigInteger3), 0).intValue();
                            } else {
                                i10 = i17 / 12;
                                i11 = i9 + 1;
                            }
                            K(i11);
                            if (i10 != 0) {
                                F(h().add(BigInteger.valueOf(i10)));
                            }
                            i2 = 2;
                        }
                        L(add.intValue());
                        i6 = 0;
                        while (i6 <= 5) {
                            if (!zArr[i6]) {
                                i7 = i15;
                            } else if (i6 == 0) {
                                i7 = i15;
                                H(Integer.MIN_VALUE);
                            } else if (i6 != 1) {
                                i7 = i15;
                                if (i6 == 2) {
                                    L(Integer.MIN_VALUE);
                                } else if (i6 == 3) {
                                    A(Integer.MIN_VALUE);
                                } else if (i6 == i7) {
                                    M(Integer.MIN_VALUE);
                                } else if (i6 == 5) {
                                    N(Integer.MIN_VALUE);
                                    this.j = null;
                                }
                            } else {
                                i7 = i15;
                                K(Integer.MIN_VALUE);
                            }
                            i6++;
                            i15 = i7;
                        }
                    }
                    j = i5;
                }
                bigInteger = BigInteger.valueOf(j);
                add = bigInteger.add(z2).add(bigInteger8);
                while (true) {
                    if (add.compareTo(BigInteger.ONE) >= 0) {
                    }
                    int i172 = (this.d + i8) - 1;
                    i9 = i172 % 12;
                    if (i9 < 0) {
                    }
                    K(i11);
                    if (i10 != 0) {
                    }
                    i2 = 2;
                }
                L(add.intValue());
                i6 = 0;
                while (i6 <= 5) {
                }
            }
        }
        valueOf = bigDecimal2;
        bigDecimal = (BigDecimal) tv61Var.a(xr61.f);
        BigDecimal bigDecimal42 = cl_2.w;
        if (b != 0) {
        }
        bigDecimal = cl_2.w;
        BigDecimal add32 = valueOf.add(bigDecimal);
        int i152 = i;
        BigDecimal bigDecimal52 = new BigDecimal(add32.toBigInteger());
        BigDecimal bigDecimal62 = G;
        BigDecimal bigDecimal72 = new BigDecimal(bigDecimal52.divide(bigDecimal62, 3).toBigInteger());
        BigDecimal subtract42 = add32.subtract(bigDecimal72.multiply(bigDecimal62));
        BigInteger bigInteger52 = bigDecimal72.toBigInteger();
        N(subtract42.intValue());
        i2 = 2;
        subtract = subtract42.subtract(new BigDecimal(BigInteger.valueOf(this.i)));
        if (subtract.compareTo(bigDecimal2) >= 0) {
        }
        i3 = this.h;
        if (i3 == Integer.MIN_VALUE) {
        }
        BigInteger add42 = BigInteger.valueOf(i3).add(z(tv61Var.a(xr61.e), b)).add(bigInteger52);
        M(add42.mod(B).intValue());
        BigInteger bigInteger62 = new BigDecimal(add42).divide(bigDecimal62, 3).toBigInteger();
        i4 = this.g;
        if (i4 == Integer.MIN_VALUE) {
        }
        BigInteger add52 = BigInteger.valueOf(i4).add(z(tv61Var.a(xr61.d), b)).add(bigInteger62);
        BigInteger bigInteger72 = C;
        A(add52.mod(bigInteger72).intValue());
        BigInteger bigInteger82 = new BigDecimal(add52).divide(new BigDecimal(bigInteger72), 3).toBigInteger();
        i5 = this.e;
        if (i5 == Integer.MIN_VALUE) {
        }
        BigInteger z22 = z(tv61Var.a(xr61.c), b);
        x2 = x(h(), this.d);
        if (i5 <= x2) {
        }
        bigInteger = BigInteger.valueOf(j);
        add = bigInteger.add(z22).add(bigInteger82);
        while (true) {
            if (add.compareTo(BigInteger.ONE) >= 0) {
            }
            int i1722 = (this.d + i8) - 1;
            i9 = i1722 % 12;
            if (i9 < 0) {
            }
            K(i11);
            if (i10 != 0) {
            }
            i2 = 2;
        }
        L(add.intValue());
        i6 = 0;
        while (i6 <= 5) {
        }
    }

    @Override // defpackage.wr61
    public final BigInteger c() {
        return this.b;
    }

    @Override // defpackage.wr61
    public final Object clone() {
        BigInteger h = h();
        int i = this.d;
        int i2 = this.e;
        int i3 = this.g;
        int i4 = this.h;
        int i5 = this.i;
        BigDecimal bigDecimal = this.j;
        int i6 = this.f;
        cl_6 cl_6Var = new cl_6();
        cl_6Var.b = null;
        cl_6Var.c = Integer.MIN_VALUE;
        cl_6Var.d = Integer.MIN_VALUE;
        cl_6Var.e = Integer.MIN_VALUE;
        cl_6Var.f = Integer.MIN_VALUE;
        cl_6Var.g = Integer.MIN_VALUE;
        cl_6Var.h = Integer.MIN_VALUE;
        cl_6Var.i = Integer.MIN_VALUE;
        cl_6Var.j = null;
        cl_6Var.F(h);
        cl_6Var.K(i);
        cl_6Var.L(i2);
        cl_6Var.D(i3, i4, i5, bigDecimal);
        cl_6Var.g(i6);
        if (cl_6Var.Q()) {
            return cl_6Var;
        }
        StringBuilder sb = new StringBuilder("InvalidXGCValue-fractional ");
        sb.append(h);
        sb.append(" ");
        sb.append(i);
        sb.append(" ");
        vfc.u(i2, i3, " ", " ", sb);
        vfc.u(i4, i5, " ", " ", sb);
        sb.append(bigDecimal);
        sb.append(" ");
        sb.append(i6);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.wr61
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof wr61) && a((wr61) obj) == 0;
    }

    @Override // defpackage.wr61
    public final int f() {
        return this.c;
    }

    @Override // defpackage.wr61
    public final void g(int i) {
        if ((i < -840 || 840 < i) && i != Integer.MIN_VALUE) {
            C(7, i);
            throw null;
        }
        this.f = i;
    }

    @Override // defpackage.wr61
    public final BigInteger h() {
        BigInteger bigInteger;
        int i = this.c;
        if (i != Integer.MIN_VALUE && (bigInteger = this.b) != null) {
            return bigInteger.add(BigInteger.valueOf(i));
        }
        if (i == Integer.MIN_VALUE || this.b != null) {
            return null;
        }
        return BigInteger.valueOf(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ru.CryptoPro.pc_0.pc_3.pc_0.pc_0.pc_0.pc_0.pc_0.pc_0.cl_6] */
    /* JADX WARN: Type inference failed for: r2v1, types: [wr61] */
    /* JADX WARN: Type inference failed for: r2v4, types: [wr61] */
    @Override // defpackage.wr61
    public final int hashCode() {
        int i = this.f;
        if ((i == Integer.MIN_VALUE ? 0 : i) != 0) {
            this = O(i);
        }
        return this.r() + this.q() + this.p() + this.j() + this.i() + this.f();
    }

    @Override // defpackage.wr61
    public final int i() {
        return this.d;
    }

    @Override // defpackage.wr61
    public final int j() {
        return this.e;
    }

    @Override // defpackage.wr61
    public final int l() {
        return this.f;
    }

    @Override // defpackage.wr61
    public final void m() {
        this.j = null;
    }

    @Override // defpackage.wr61
    public final int p() {
        return this.g;
    }

    @Override // defpackage.wr61
    public final int q() {
        return this.h;
    }

    @Override // defpackage.wr61
    public final int r() {
        return this.i;
    }

    @Override // defpackage.wr61
    public final BigDecimal s() {
        return this.j;
    }

    @Override // defpackage.wr61
    public final wr61 t() {
        wr61 O = O(this.f);
        if (this.f == Integer.MIN_VALUE) {
            O.g(Integer.MIN_VALUE);
        }
        BigDecimal bigDecimal = this.j;
        if ((bigDecimal == null ? Integer.MIN_VALUE : bigDecimal.movePointRight(3).intValue()) == Integer.MIN_VALUE) {
            O.m();
        }
        return O;
    }

    @Override // defpackage.wr61
    public final String u() {
        cl_1 cl_1Var;
        int i;
        char[] cArr;
        int length;
        int i2 = (this.c != Integer.MIN_VALUE ? ' ' : (char) 0) | (this.d != Integer.MIN_VALUE ? (char) 16 : (char) 0) | (this.e != Integer.MIN_VALUE ? 8 : 0) | (this.g != Integer.MIN_VALUE ? 4 : 0) | (this.h != Integer.MIN_VALUE ? 2 : 0) | (this.i != Integer.MIN_VALUE ? 1 : 0);
        String str = null;
        if (i2 == 7) {
            cl_1Var = xr61.h;
        } else if (i2 == 8) {
            cl_1Var = xr61.n;
        } else if (i2 == 16) {
            cl_1Var = xr61.m;
        } else if (i2 == 24) {
            cl_1Var = xr61.k;
        } else if (i2 == 32) {
            cl_1Var = xr61.l;
        } else if (i2 == 48) {
            cl_1Var = xr61.j;
        } else if (i2 == 56) {
            cl_1Var = xr61.i;
        } else {
            if (i2 != 63) {
                ny61.r(getClass().getName().concat("#getXMLSchemaType() : InvalidXGCFields"));
                return null;
            }
            cl_1Var = xr61.g;
        }
        if (cl_1Var == xr61.g) {
            str = "%Y-%M-%DT%h:%m:%s%z";
        } else if (cl_1Var == xr61.i) {
            str = "%Y-%M-%D%z";
        } else if (cl_1Var == xr61.h) {
            str = "%h:%m:%s%z";
        } else if (cl_1Var == xr61.m) {
            str = "--%M%z";
        } else if (cl_1Var == xr61.n) {
            str = "---%D%z";
        } else if (cl_1Var == xr61.l) {
            str = "%Y%z";
        } else if (cl_1Var == xr61.j) {
            str = "%Y-%M%z";
        } else if (cl_1Var == xr61.k) {
            str = "--%M-%D%z";
        }
        char[] cArr2 = new char[32];
        int length2 = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            int i5 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                cArr2[i4] = charAt;
                i4++;
                i3 = i5;
            } else {
                i3 += 2;
                char charAt2 = str.charAt(i5);
                if (charAt2 == 'D') {
                    i = this.e;
                } else if (charAt2 == 'M') {
                    i = this.d;
                } else if (charAt2 != 'Y') {
                    if (charAt2 == 'h') {
                        i = this.g;
                    } else if (charAt2 == 'm') {
                        i = this.h;
                    } else if (charAt2 == 's') {
                        i4 = y(cArr2, i4, this.i);
                        BigDecimal bigDecimal = this.j;
                        if (bigDecimal != null) {
                            String bigDecimal2 = bigDecimal.toString();
                            int indexOf = bigDecimal2.indexOf("E-");
                            if (indexOf >= 0) {
                                String substring = bigDecimal2.substring(indexOf + 2);
                                String substring2 = bigDecimal2.substring(0, indexOf);
                                int indexOf2 = substring2.indexOf(Extension.DOT_CHAR);
                                if (indexOf2 >= 0) {
                                    substring2 = substring2.substring(0, indexOf2).concat(substring2.substring(indexOf2 + 1));
                                }
                                int parseInt = Integer.parseInt(substring);
                                if (parseInt < 40) {
                                    substring2 = "00000000000000000000000000000000000000000".substring(0, parseInt - 1).concat(substring2);
                                } else {
                                    while (parseInt > 1) {
                                        substring2 = "0".concat(substring2);
                                        parseInt--;
                                    }
                                }
                                bigDecimal2 = "0.".concat(substring2);
                            }
                            cArr = new char[bigDecimal2.length() + cArr2.length];
                            System.arraycopy(cArr2, 0, cArr, 0, i4);
                            bigDecimal2.getChars(1, bigDecimal2.length(), cArr, i4);
                            length = bigDecimal2.length() - 1;
                            i4 += length;
                            cArr2 = cArr;
                        }
                    } else {
                        if (charAt2 != 'z') {
                            throw new InternalError();
                        }
                        int i6 = this.f;
                        if (i6 == 0) {
                            cArr2[i4] = 'Z';
                            i4++;
                        } else if (i6 != Integer.MIN_VALUE) {
                            int i7 = i4 + 1;
                            if (i6 < 0) {
                                cArr2[i4] = LicenseUtility.SEPARATOR;
                                i6 *= -1;
                            } else {
                                cArr2[i4] = '+';
                            }
                            int y2 = y(cArr2, i7, i6 / 60);
                            cArr2[y2] = ':';
                            i4 = y(cArr2, y2 + 1, i6 % 60);
                        }
                    }
                } else if (this.b == null) {
                    int i8 = this.c;
                    if (i8 < 0) {
                        cArr2[i4] = LicenseUtility.SEPARATOR;
                        i8 = -i8;
                        i4++;
                    }
                    cArr2[i4 + 3] = (char) ((i8 % 10) + 48);
                    int i9 = i8 / 10;
                    cArr2[i4 + 2] = (char) ((i9 % 10) + 48);
                    int i10 = i9 / 10;
                    cArr2[i4 + 1] = (char) ((i10 % 10) + 48);
                    cArr2[i4] = (char) (((i10 / 10) % 10) + 48);
                    i4 += 4;
                } else {
                    String bigInteger = h().toString();
                    cArr = new char[bigInteger.length() + cArr2.length];
                    System.arraycopy(cArr2, 0, cArr, 0, i4);
                    int length3 = bigInteger.length();
                    while (length3 < 4) {
                        cArr[i4] = MoneyInputEditView.DEFAULT_VALUE;
                        length3++;
                        i4++;
                    }
                    bigInteger.getChars(0, bigInteger.length(), cArr, i4);
                    length = bigInteger.length();
                    i4 += length;
                    cArr2 = cArr;
                }
                i4 = y(cArr2, i4, i);
            }
        }
        return new String(cArr2, 0, i4);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.wr61
    public final java.util.GregorianCalendar v() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.CryptoPro.pc_0.pc_3.pc_0.pc_0.pc_0.pc_0.pc_0.pc_0.cl_6.v():java.util.GregorianCalendar");
    }

    public cl_6() {
        this.b = null;
        this.c = Integer.MIN_VALUE;
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = null;
    }
}
