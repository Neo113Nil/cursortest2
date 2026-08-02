package ru.CryptoPro.pc_0.pc_3.pc_0.pc_0.pc_0.pc_0.pc_0.pc_0;

import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.dy31;
import defpackage.g8e;
import defpackage.mf1;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tv61;
import defpackage.wr61;
import defpackage.xr61;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes4.dex */
class cl_2 extends tv61 implements Serializable {
    private static final long serialVersionUID = 1;
    public static final BigDecimal w;
    public static final wr61[] x;
    protected int a;
    protected BigInteger b;
    protected BigInteger c;
    protected BigInteger d;
    protected BigInteger e;
    protected BigInteger f;
    protected BigDecimal g;

    static {
        mf1 mf1Var = xr61.a;
        mf1 mf1Var2 = xr61.a;
        mf1 mf1Var3 = xr61.a;
        mf1 mf1Var4 = xr61.a;
        mf1 mf1Var5 = xr61.a;
        mf1 mf1Var6 = xr61.a;
        TimeZone.getTimeZone("GMT");
        w = BigDecimal.valueOf(0L);
        x = new wr61[]{new cl_6("1696-09-01T00:00:00Z"), new cl_6("1697-02-01T00:00:00Z"), new cl_6("1903-03-01T00:00:00Z"), new cl_6("1903-07-01T00:00:00Z")};
        BigDecimal.valueOf(12L);
        BigDecimal.valueOf(24L);
        BigDecimal.valueOf(60L);
        BigDecimal.valueOf(60L);
    }

    public cl_2(boolean z, int i, int i2) {
        BigInteger r = r(0);
        BigInteger r2 = r(0);
        BigInteger r3 = r(i);
        BigInteger r4 = r(0);
        BigInteger r5 = r(i2);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(0));
        this.b = r;
        this.c = r2;
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = bigDecimal;
        this.a = l(z);
        q(r, xr61.a);
        q(r2, xr61.b);
        q(r3, xr61.c);
        q(r4, xr61.d);
        q(r5, xr61.e);
        if (bigDecimal.signum() >= 0) {
            return;
        }
        ny61.g("NegativeField SECONDS");
        throw null;
    }

    public static String m(String str, int[] iArr) {
        char charAt;
        int i = iArr[0];
        while (iArr[0] < str.length() && (('0' <= (charAt = str.charAt(iArr[0])) && charAt <= '9') || charAt == '.')) {
            iArr[0] = iArr[0] + 1;
        }
        if (iArr[0] == str.length()) {
            ny61.g(str);
            return null;
        }
        int i2 = iArr[0] + 1;
        iArr[0] = i2;
        return str.substring(i, i2);
    }

    public static BigInteger n(String str) {
        if (str == null) {
            return null;
        }
        return new BigInteger(oyr.g(1, 0, str));
    }

    public static void p(String str, String[] strArr, int[] iArr, int i, String str2) {
        int length = str2.length();
        int i2 = i - 1;
        while (i2 >= 0) {
            int lastIndexOf = str2.lastIndexOf(g8e.a(1, strArr[i2]), length - 1);
            if (lastIndexOf == -1) {
                ny61.g(str);
                return;
            }
            for (int i3 = lastIndexOf + 1; i3 < length; i3++) {
                strArr[i3] = null;
            }
            strArr[lastIndexOf] = strArr[i2];
            iArr[lastIndexOf] = iArr[i2];
            i2--;
            length = lastIndexOf;
        }
        for (int i4 = length - 1; i4 >= 0; i4--) {
            strArr[i4] = null;
        }
    }

    public static void q(BigInteger bigInteger, mf1 mf1Var) {
        if (bigInteger == null || bigInteger.signum() >= 0) {
            return;
        }
        ny61.g("NegativeField ".concat(mf1Var.b));
    }

    public static BigInteger r(int i) {
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        return new BigInteger(String.valueOf(i));
    }

    private Object writeReplace() throws IOException {
        return new cl_4(toString());
    }

    @Override // defpackage.tv61
    public final Number a(mf1 mf1Var) {
        if (mf1Var == xr61.a) {
            return this.b;
        }
        if (mf1Var == xr61.b) {
            return this.c;
        }
        if (mf1Var == xr61.c) {
            return this.d;
        }
        if (mf1Var == xr61.d) {
            return this.e;
        }
        if (mf1Var == xr61.e) {
            return this.f;
        }
        if (mf1Var == xr61.f) {
            return this.g;
        }
        ny61.g("UnknownField javax.xml.datatype.Duration#getSet(DatatypeConstants.Field field) ".concat(mf1Var.b));
        return null;
    }

    @Override // defpackage.tv61
    public final int b() {
        return this.a;
    }

    @Override // defpackage.tv61
    public final int c() {
        Number a = a(xr61.a);
        if (a == null) {
            return 0;
        }
        return a.intValue();
    }

    @Override // defpackage.tv61
    public final int f(tv61 tv61Var) {
        BigInteger valueOf = BigInteger.valueOf(2147483647L);
        BigInteger.valueOf(-2147483648L);
        BigInteger bigInteger = this.b;
        if (bigInteger != null && bigInteger.compareTo(valueOf) == 1) {
            String name = getClass().getName();
            mf1 mf1Var = xr61.a;
            dy31.k(name, "#compare(Duration duration)YEARS ", this.b);
            return 0;
        }
        BigInteger bigInteger2 = this.c;
        if (bigInteger2 != null && bigInteger2.compareTo(valueOf) == 1) {
            String name2 = getClass().getName();
            mf1 mf1Var2 = xr61.a;
            dy31.k(name2, "#compare(Duration duration)MONTHS ", this.c);
            return 0;
        }
        BigInteger bigInteger3 = this.d;
        if (bigInteger3 != null && bigInteger3.compareTo(valueOf) == 1) {
            String name3 = getClass().getName();
            mf1 mf1Var3 = xr61.a;
            dy31.k(name3, "#compare(Duration duration)DAYS ", this.d);
            return 0;
        }
        BigInteger bigInteger4 = this.e;
        if (bigInteger4 != null && bigInteger4.compareTo(valueOf) == 1) {
            String name4 = getClass().getName();
            mf1 mf1Var4 = xr61.a;
            dy31.k(name4, "#compare(Duration duration)HOURS ", this.e);
            return 0;
        }
        BigInteger bigInteger5 = this.f;
        if (bigInteger5 != null && bigInteger5.compareTo(valueOf) == 1) {
            String name5 = getClass().getName();
            mf1 mf1Var5 = xr61.a;
            dy31.k(name5, "#compare(Duration duration)MINUTES ", this.f);
            return 0;
        }
        BigDecimal bigDecimal = this.g;
        if (bigDecimal != null && bigDecimal.toBigInteger().compareTo(valueOf) == 1) {
            String name6 = getClass().getName();
            mf1 mf1Var6 = xr61.a;
            throw new UnsupportedOperationException("TooLarge " + name6 + "#compare(Duration duration)SECONDS " + this.g.toString());
        }
        BigInteger bigInteger6 = (BigInteger) tv61Var.a(xr61.a);
        if (bigInteger6 != null && bigInteger6.compareTo(valueOf) == 1) {
            dy31.k(getClass().getName(), "#compare(Duration duration)YEARS ", bigInteger6);
            return 0;
        }
        BigInteger bigInteger7 = (BigInteger) tv61Var.a(xr61.b);
        if (bigInteger7 != null && bigInteger7.compareTo(valueOf) == 1) {
            dy31.k(getClass().getName(), "#compare(Duration duration)MONTHS ", bigInteger7);
            return 0;
        }
        BigInteger bigInteger8 = (BigInteger) tv61Var.a(xr61.c);
        if (bigInteger8 != null && bigInteger8.compareTo(valueOf) == 1) {
            dy31.k(getClass().getName(), "#compare(Duration duration)DAYS ", bigInteger8);
            return 0;
        }
        BigInteger bigInteger9 = (BigInteger) tv61Var.a(xr61.d);
        if (bigInteger9 != null && bigInteger9.compareTo(valueOf) == 1) {
            dy31.k(getClass().getName(), "#compare(Duration duration)HOURS ", bigInteger9);
            return 0;
        }
        BigInteger bigInteger10 = (BigInteger) tv61Var.a(xr61.e);
        if (bigInteger10 != null && bigInteger10.compareTo(valueOf) == 1) {
            dy31.k(getClass().getName(), "#compare(Duration duration)MINUTES ", bigInteger10);
            return 0;
        }
        BigDecimal bigDecimal2 = (BigDecimal) tv61Var.a(xr61.f);
        BigInteger bigInteger11 = bigDecimal2 != null ? bigDecimal2.toBigInteger() : null;
        if (bigInteger11 != null && bigInteger11.compareTo(valueOf) == 1) {
            dy31.k(getClass().getName(), "#compare(Duration duration)SECONDS ", bigInteger11);
            return 0;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(1970, 1, 1, 0, 0, 0);
        gregorianCalendar.add(1, c() * this.a);
        gregorianCalendar.add(2, g() * this.a);
        gregorianCalendar.add(6, h() * this.a);
        gregorianCalendar.add(11, i() * this.a);
        gregorianCalendar.add(12, j() * this.a);
        gregorianCalendar.add(13, k() * this.a);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar(1970, 1, 1, 0, 0, 0);
        gregorianCalendar2.add(1, tv61Var.b() * tv61Var.c());
        gregorianCalendar2.add(2, tv61Var.b() * tv61Var.g());
        gregorianCalendar2.add(6, tv61Var.b() * tv61Var.h());
        gregorianCalendar2.add(11, tv61Var.b() * tv61Var.i());
        gregorianCalendar2.add(12, tv61Var.b() * tv61Var.j());
        gregorianCalendar2.add(13, tv61Var.b() * tv61Var.k());
        if (gregorianCalendar.equals(gregorianCalendar2)) {
            return 0;
        }
        wr61[] wr61VarArr = x;
        wr61 wr61Var = (wr61) wr61VarArr[0].clone();
        wr61 wr61Var2 = (wr61) wr61VarArr[0].clone();
        wr61Var.b(this);
        wr61Var2.b(tv61Var);
        int a = wr61Var.a(wr61Var2);
        if (a != 2) {
            wr61 wr61Var3 = (wr61) wr61VarArr[1].clone();
            wr61 wr61Var4 = (wr61) wr61VarArr[1].clone();
            wr61Var3.b(this);
            wr61Var4.b(tv61Var);
            int a2 = wr61Var3.a(wr61Var4);
            if (a2 == 2 || a != a2) {
                a = 2;
            }
            if (a != 2) {
                wr61 wr61Var5 = (wr61) wr61VarArr[2].clone();
                wr61 wr61Var6 = (wr61) wr61VarArr[2].clone();
                wr61Var5.b(this);
                wr61Var6.b(tv61Var);
                int a3 = wr61Var5.a(wr61Var6);
                if (a3 == 2 || a != a3) {
                    a = 2;
                }
                if (a != 2) {
                    wr61 wr61Var7 = (wr61) wr61VarArr[3].clone();
                    wr61 wr61Var8 = (wr61) wr61VarArr[3].clone();
                    wr61Var7.b(this);
                    wr61Var8.b(tv61Var);
                    int a4 = wr61Var7.a(wr61Var8);
                    if (a4 != 2 && a == a4) {
                        return a;
                    }
                    return 2;
                }
            }
        }
        return 2;
    }

    @Override // defpackage.tv61
    public final int g() {
        Number a = a(xr61.b);
        if (a == null) {
            return 0;
        }
        return a.intValue();
    }

    @Override // defpackage.tv61
    public final int h() {
        Number a = a(xr61.c);
        if (a == null) {
            return 0;
        }
        return a.intValue();
    }

    public final int hashCode() {
        GregorianCalendar v = x[0].v();
        v.add(1, c() * this.a);
        v.add(2, g() * this.a);
        v.add(5, h() * this.a);
        v.add(10, i() * this.a);
        v.add(12, j() * this.a);
        v.add(13, k() * this.a);
        BigDecimal bigDecimal = this.g;
        if (bigDecimal != null) {
            v.add(14, bigDecimal.subtract(bigDecimal.setScale(0, 1)).movePointRight(3).intValue() * this.a);
        }
        return (int) v.getTime().getTime();
    }

    @Override // defpackage.tv61
    public final int i() {
        Number a = a(xr61.d);
        if (a == null) {
            return 0;
        }
        return a.intValue();
    }

    @Override // defpackage.tv61
    public final int j() {
        Number a = a(xr61.e);
        if (a == null) {
            return 0;
        }
        return a.intValue();
    }

    @Override // defpackage.tv61
    public final int k() {
        Number a = a(xr61.f);
        if (a == null) {
            return 0;
        }
        return a.intValue();
    }

    public final int l(boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        BigDecimal bigDecimal;
        BigInteger bigInteger5 = this.b;
        if ((bigInteger5 == null || bigInteger5.signum() == 0) && (((bigInteger = this.c) == null || bigInteger.signum() == 0) && (((bigInteger2 = this.d) == null || bigInteger2.signum() == 0) && (((bigInteger3 = this.e) == null || bigInteger3.signum() == 0) && (((bigInteger4 = this.f) == null || bigInteger4.signum() == 0) && ((bigDecimal = this.g) == null || bigDecimal.signum() == 0)))))) {
            return 0;
        }
        return z ? 1 : -1;
    }

    @Override // defpackage.tv61
    public final String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        if (this.a < 0) {
            stringBuffer2.append(LicenseUtility.SEPARATOR);
        }
        stringBuffer2.append('P');
        if (this.b != null) {
            stringBuffer2.append(this.b + "Y");
        }
        if (this.c != null) {
            stringBuffer2.append(this.c + "M");
        }
        if (this.d != null) {
            stringBuffer2.append(this.d + CA20Status.STATUS_REQUEST_D);
        }
        if (this.e != null || this.f != null || this.g != null) {
            stringBuffer2.append('T');
            if (this.e != null) {
                stringBuffer2.append(this.e + CA20Status.STATUS_CERTIFICATE_H);
            }
            if (this.f != null) {
                stringBuffer2.append(this.f + "M");
            }
            if (this.g != null) {
                StringBuilder sb = new StringBuilder();
                BigDecimal bigDecimal = this.g;
                String bigInteger = bigDecimal.unscaledValue().toString();
                int scale = bigDecimal.scale();
                if (scale != 0) {
                    int length = bigInteger.length() - scale;
                    if (length == 0) {
                        bigInteger = "0.".concat(bigInteger);
                    } else {
                        if (length > 0) {
                            stringBuffer = new StringBuffer(bigInteger);
                            stringBuffer.insert(length, '.');
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer(bigInteger.length() + (3 - length));
                            stringBuffer3.append("0.");
                            for (int i = 0; i < (-length); i++) {
                                stringBuffer3.append(MoneyInputEditView.DEFAULT_VALUE);
                            }
                            stringBuffer3.append(bigInteger);
                            stringBuffer = stringBuffer3;
                        }
                        bigInteger = stringBuffer.toString();
                    }
                }
                sb.append(bigInteger);
                sb.append("S");
                stringBuffer2.append(sb.toString());
            }
        }
        return stringBuffer2.toString();
    }
}
