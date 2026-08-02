package defpackage;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class n0 extends s0 {
    public static final y c = new y(5, n0.class);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public final String a;
    public byte[] b;

    public n0(byte[] bArr, boolean z) {
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
                if ((b & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
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
                if ((b & 128) == 0) {
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
        this.b = z ? j66.N(bArr2) : bArr2;
    }

    public static n0 B(byte[] bArr, boolean z) {
        n0 n0Var = (n0) d.get(new m0(bArr));
        return n0Var == null ? new n0(bArr, z) : n0Var;
    }

    public static n0 F(d0 d0Var) {
        if (d0Var == null || (d0Var instanceof n0)) {
            return (n0) d0Var;
        }
        s0 n = d0Var.n();
        if (n instanceof n0) {
            return (n0) n;
        }
        xq0.x("illegal object in getInstance: ".concat(d0Var.getClass().getName()));
        return null;
    }

    public final void D(ByteArrayOutputStream byteArrayOutputStream) {
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
            t0.E(byteArrayOutputStream, Long.parseLong(substring2) + parseInt);
        } else {
            t0.F(byteArrayOutputStream, new BigInteger(substring2).add(BigInteger.valueOf(parseInt)));
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
                t0.E(byteArrayOutputStream, Long.parseLong(str));
            } else {
                t0.F(byteArrayOutputStream, new BigInteger(str));
            }
        }
    }

    public final synchronized byte[] E() {
        try {
            if (this.b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                D(byteArrayOutputStream);
                this.b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public final n0 G() {
        m0 m0Var = new m0(E());
        ConcurrentHashMap concurrentHashMap = d;
        n0 n0Var = (n0) concurrentHashMap.get(m0Var);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = (n0) concurrentHashMap.putIfAbsent(m0Var, this);
        return n0Var2 == null ? this : n0Var2;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var == this) {
            return true;
        }
        if (!(s0Var instanceof n0)) {
            return false;
        }
        return this.a.equals(((n0) s0Var).a);
    }

    public final String toString() {
        return this.a;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.v(6, z, E());
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(E().length, z);
    }

    public n0(String str) {
        char charAt;
        if (str != null) {
            boolean z = false;
            if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
                z = t0.D(2, str);
            }
            if (z) {
                this.a = str;
                return;
            } else {
                xq0.x(hrg.q("string ", str, " not an OID"));
                throw null;
            }
        }
        jj4.j("'identifier' cannot be null");
        throw null;
    }

    public n0(n0 n0Var, String str) {
        if (t0.D(0, str)) {
            this.a = vz1.s(new StringBuilder(), n0Var.a, ".", str);
        } else {
            xq0.x(hrg.q("string ", str, " not a valid OID branch"));
            throw null;
        }
    }
}
