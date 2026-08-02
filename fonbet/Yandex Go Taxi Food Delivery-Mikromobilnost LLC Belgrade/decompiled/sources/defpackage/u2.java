package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public final class u2 extends b3 {
    public static final p1 c = new p1(13, u2.class);
    public static final ConcurrentHashMap w = new ConcurrentHashMap();
    public final String a;
    public byte[] b;

    public u2(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        if (bArr2.length == 0) {
            ny61.g("empty OBJECT IDENTIFIER with no sub-identifiers");
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & DerValue.TAG_CONTEXT) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            sb.append(MoneyInputEditView.DEFAULT_VALUE);
                        } else if (j2 < 80) {
                            sb.append('1');
                            j2 -= 40;
                        } else {
                            sb.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    sb.append('.');
                    sb.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & DerValue.TAG_CONTEXT) == 0) {
                    if (z2) {
                        sb.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z2 = false;
                    }
                    sb.append('.');
                    sb.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.a = sb.toString();
        this.b = z ? rza1.b(bArr2) : bArr2;
    }

    public static u2 A(Object obj) {
        String d;
        if (obj == null || (obj instanceof u2)) {
            return (u2) obj;
        }
        if (obj instanceof a2) {
            b3 aSN1Primitive = ((a2) obj).toASN1Primitive();
            if (aSN1Primitive instanceof u2) {
                return (u2) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (u2) c.Eg((byte[]) obj);
            } catch (IOException e) {
                d = x4e.d(e, new StringBuilder("failed to construct object identifier from byte[]: "));
            }
        }
        d = qv10.n(obj, "illegal object in getInstance: ");
        ny61.g(d);
        return null;
    }

    public static u2 x(byte[] bArr, boolean z) {
        u2 u2Var = (u2) w.get(new s2(bArr));
        return u2Var == null ? new u2(bArr, z) : u2Var;
    }

    public final u2 B() {
        s2 s2Var = new s2(z());
        ConcurrentHashMap concurrentHashMap = w;
        u2 u2Var = (u2) concurrentHashMap.get(s2Var);
        if (u2Var != null) {
            return u2Var;
        }
        synchronized (concurrentHashMap) {
            try {
                if (concurrentHashMap.containsKey(s2Var)) {
                    this = (u2) concurrentHashMap.get(s2Var);
                } else {
                    concurrentHashMap.put(s2Var, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        if (b3Var == this) {
            return true;
        }
        if (!(b3Var instanceof u2)) {
            return false;
        }
        return this.a.equals(((u2) b3Var).a);
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.I(6, z(), z);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(z().length, z);
    }

    public final String toString() {
        return this.a;
    }

    public final void u(String str) {
        new u2(this, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0079 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(ByteArrayOutputStream byteArrayOutputStream) {
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
        if (substring2.length() > 18) {
            d3.z(byteArrayOutputStream, new BigInteger(substring2).add(BigInteger.valueOf(parseInt)));
            while (i2 != -1) {
            }
        }
        long parseLong = Long.parseLong(substring2) + parseInt;
        d3.y(byteArrayOutputStream, parseLong);
        while (i2 != -1) {
            if (i2 != -1) {
                int indexOf3 = str2.indexOf(46, i2);
                if (indexOf3 == -1) {
                    str = str2.substring(i2);
                    i2 = -1;
                } else {
                    String substring3 = str2.substring(i2, indexOf3);
                    i2 = indexOf3 + 1;
                    str = substring3;
                }
            } else {
                str = null;
            }
            if (str.length() <= 18) {
                parseLong = Long.parseLong(str);
                d3.y(byteArrayOutputStream, parseLong);
                while (i2 != -1) {
                }
            } else {
                d3.z(byteArrayOutputStream, new BigInteger(str));
            }
        }
    }

    public final synchronized byte[] z() {
        try {
            if (this.b == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                y(byteArrayOutputStream);
                this.b = byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public u2(String str) {
        char charAt;
        if (str == null) {
            ny61.t("'identifier' cannot be null");
            throw null;
        }
        boolean z = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
            z = d3.x(2, str);
        }
        if (z) {
            this.a = str;
        } else {
            ny61.g(oyr.p("string ", str, " not an OID"));
            throw null;
        }
    }

    public u2(u2 u2Var, String str) {
        if (d3.x(0, str)) {
            this.a = unr0.r(new StringBuilder(), u2Var.a, Extension.DOT_CHAR, str);
        } else {
            ny61.g(oyr.p("string ", str, " not a valid OID branch"));
            throw null;
        }
    }
}
