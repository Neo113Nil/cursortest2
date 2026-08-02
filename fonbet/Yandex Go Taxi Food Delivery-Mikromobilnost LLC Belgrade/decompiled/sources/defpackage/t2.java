package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes9.dex */
public final class t2 extends a3 {
    public static final q1 c = new q1(4, t2.class);
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public final String a;
    public byte[] b;

    public t2(byte[] bArr, boolean z) {
        boolean z2;
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z3 = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i];
            if (j <= 72057594037927808L) {
                z2 = z3;
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & DerValue.TAG_CONTEXT) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append(MoneyInputEditView.DEFAULT_VALUE);
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                    z3 = z2;
                }
            } else {
                z2 = z3;
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & DerValue.TAG_CONTEXT) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                    z3 = z2;
                }
            }
        }
        this.a = stringBuffer.toString();
        this.b = z ? ffx.v(bArr2) : bArr2;
    }

    public static t2 p(byte[] bArr, boolean z) {
        t2 t2Var = (t2) w.get(new r2(bArr));
        return t2Var == null ? new t2(bArr, z) : t2Var;
    }

    public static t2 s(z1 z1Var) {
        if (z1Var == null || (z1Var instanceof t2)) {
            return (t2) z1Var;
        }
        a3 aSN1Primitive = z1Var.toASN1Primitive();
        if (aSN1Primitive instanceof t2) {
            return (t2) aSN1Primitive;
        }
        ny61.g("illegal object in getInstance: ".concat(z1Var.getClass().getName()));
        return null;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var == this) {
            return true;
        }
        if (!(a3Var instanceof t2)) {
            return false;
        }
        return this.a.equals(((t2) a3Var).a);
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.Y(6, r(), z);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(r().length, z);
    }

    public final void q(ByteArrayOutputStream byteArrayOutputStream) {
        String substring;
        int i;
        String substring2;
        int i2;
        String str;
        String str2 = this.a;
        int indexOf = str2.indexOf(46, 0);
        if (indexOf == -1) {
            substring = str2.substring(0);
            i = -1;
        } else {
            substring = str2.substring(0, indexOf);
            i = indexOf + 1;
        }
        int parseInt = Integer.parseInt(substring) * 40;
        if (i == -1) {
            i2 = i;
            substring2 = null;
        } else {
            int indexOf2 = str2.indexOf(46, i);
            if (indexOf2 == -1) {
                substring2 = str2.substring(i);
                i2 = -1;
            } else {
                substring2 = str2.substring(i, indexOf2);
                i2 = indexOf2 + 1;
            }
        }
        if (substring2.length() <= 18) {
            c3.r(byteArrayOutputStream, Long.parseLong(substring2) + parseInt);
        } else {
            c3.s(byteArrayOutputStream, new BigInteger(substring2).add(BigInteger.valueOf(parseInt)));
        }
        while (i2 != -1) {
            if (i2 == -1) {
                str = null;
            } else {
                int indexOf3 = str2.indexOf(46, i2);
                if (indexOf3 == -1) {
                    str = str2.substring(i2);
                    i2 = -1;
                } else {
                    String substring3 = str2.substring(i2, indexOf3);
                    i2 = indexOf3 + 1;
                    str = substring3;
                }
            }
            if (str.length() <= 18) {
                c3.r(byteArrayOutputStream, Long.parseLong(str));
            } else {
                c3.s(byteArrayOutputStream, new BigInteger(str));
            }
        }
    }

    public final synchronized byte[] r() {
        try {
            if (this.b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                q(byteArrayOutputStream);
                this.b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final t2 t() {
        r2 r2Var = new r2(r());
        ConcurrentHashMap concurrentHashMap = w;
        t2 t2Var = (t2) concurrentHashMap.get(r2Var);
        if (t2Var != null) {
            return t2Var;
        }
        t2 t2Var2 = (t2) concurrentHashMap.putIfAbsent(r2Var, this);
        return t2Var2 == null ? this : t2Var2;
    }

    public final String toString() {
        return this.a;
    }

    public t2(String str) {
        char charAt;
        if (str != null) {
            boolean z = false;
            if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
                z = c3.q(2, str);
            }
            if (z) {
                this.a = str;
                return;
            } else {
                ny61.g(oyr.p("string ", str, " not an OID"));
                throw null;
            }
        }
        ny61.t("'identifier' cannot be null");
        throw null;
    }

    public t2(t2 t2Var, String str) {
        if (c3.q(0, str)) {
            this.a = unr0.r(new StringBuilder(), t2Var.a, Extension.DOT_CHAR, str);
        } else {
            ny61.g(oyr.p("string ", str, " not a valid OID branch"));
            throw null;
        }
    }
}
