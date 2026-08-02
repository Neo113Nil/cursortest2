package defpackage;

import com.google.android.gms.internal.play_billing.s;
import com.google.android.gms.internal.play_billing.zzgk;
import java.math.RoundingMode;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes11.dex */
public abstract class qva1 {
    public static final uts a(ap00 ap00Var) {
        Object obj = ap00Var.d;
        if (obj instanceof uts) {
            return (uts) obj;
        }
        return null;
    }

    public static final int[] b(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = rzo.X(((ldc) list.get(i)).a);
        }
        return iArr;
    }

    public static final float[] c(List list, List list2) {
        if (list != null) {
            return a.G0(list);
        }
        return null;
    }

    public static long d(int i, long j, long j2, long j3) {
        long j4 = i;
        int i2 = tw21.a;
        return j + tw21.e0(j2 - j3, 1000000L, j4, RoundingMode.DOWN);
    }

    public static final void e(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            ny61.g("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            ny61.g("colors and colorStops arguments must have equal length.");
        }
    }

    public static int f(byte[] bArr, int i, uw91 uw91Var) {
        int l = l(bArr, i, uw91Var);
        int i2 = uw91Var.a;
        if (i2 < 0) {
            su71.d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - l) {
            su71.d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            uw91Var.c = zzgk.a;
            return l;
        }
        uw91Var.c = zzgk.i(l, i2, bArr);
        return l + i2;
    }

    public static int g(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int h(ofa1 ofa1Var, byte[] bArr, int i, int i2, int i3, uw91 uw91Var) {
        Object zze = ofa1Var.zze();
        int p = p(zze, ofa1Var, bArr, i, i2, i3, uw91Var);
        ofa1Var.b(zze);
        uw91Var.c = zze;
        return p;
    }

    public static int i(ofa1 ofa1Var, int i, byte[] bArr, int i2, int i3, i7a1 i7a1Var, uw91 uw91Var) {
        Object zze = ofa1Var.zze();
        ofa1 ofa1Var2 = ofa1Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        uw91 uw91Var2 = uw91Var;
        int q = q(zze, ofa1Var2, bArr2, i2, i4, uw91Var2);
        ofa1Var2.b(zze);
        uw91Var2.c = zze;
        i7a1Var.add(zze);
        while (q < i4) {
            uw91 uw91Var3 = uw91Var2;
            int i5 = i4;
            int l = l(bArr2, q, uw91Var3);
            if (i != uw91Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            ofa1 ofa1Var3 = ofa1Var2;
            Object zze2 = ofa1Var3.zze();
            q = q(zze2, ofa1Var3, bArr3, l, i5, uw91Var3);
            ofa1Var2 = ofa1Var3;
            bArr2 = bArr3;
            i4 = i5;
            uw91Var2 = uw91Var3;
            ofa1Var2.b(zze2);
            uw91Var2.c = zze2;
            i7a1Var.add(zze2);
        }
        return q;
    }

    public static int j(byte[] bArr, int i, i7a1 i7a1Var, uw91 uw91Var) {
        n6a1 n6a1Var = (n6a1) i7a1Var;
        int l = l(bArr, i, uw91Var);
        int i2 = uw91Var.a + l;
        while (l < i2) {
            l = l(bArr, l, uw91Var);
            n6a1Var.f(uw91Var.a);
        }
        if (l == i2) {
            return l;
        }
        su71.d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int k(int i, byte[] bArr, int i2, int i3, pia1 pia1Var, uw91 uw91Var) {
        if ((i >>> 3) == 0) {
            su71.d("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int o = o(bArr, i2, uw91Var);
            pia1Var.c(i, Long.valueOf(uw91Var.b));
            return o;
        }
        if (i4 == 1) {
            pia1Var.c(i, Long.valueOf(r(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int l = l(bArr, i2, uw91Var);
            int i5 = uw91Var.a;
            if (i5 < 0) {
                su71.d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - l) {
                su71.d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                pia1Var.c(i, zzgk.a);
            } else {
                pia1Var.c(i, zzgk.i(l, i5, bArr));
            }
            return l + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                pia1Var.c(i, Integer.valueOf(g(i2, bArr)));
                return i2 + 4;
            }
            su71.d("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        pia1 b = pia1.b();
        int i7 = uw91Var.e + 1;
        uw91Var.e = i7;
        if (i7 >= 100) {
            su71.d("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int l2 = l(bArr, i2, uw91Var);
            int i9 = uw91Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = l2;
                break;
            }
            i2 = k(i9, bArr, l2, i3, b, uw91Var);
            i8 = i9;
        }
        uw91Var.e--;
        if (i2 > i3 || i8 != i6) {
            su71.d("Failed to parse the message.");
            return 0;
        }
        pia1Var.c(i, b);
        return i2;
    }

    public static int l(byte[] bArr, int i, uw91 uw91Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m(b, bArr, i2, uw91Var);
        }
        uw91Var.a = b;
        return i2;
    }

    public static int m(int i, byte[] bArr, int i2, uw91 uw91Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & HProv.PP_VERSION_TIMESTAMP;
        if (b >= 0) {
            uw91Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            uw91Var.a = i5 | (b2 << PKIBody._CCR);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            uw91Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            uw91Var.a = i9 | (b4 << DerValue.tag_UniversalString);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                uw91Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int n(int i, byte[] bArr, int i2, int i3, i7a1 i7a1Var, uw91 uw91Var) {
        n6a1 n6a1Var = (n6a1) i7a1Var;
        int l = l(bArr, i2, uw91Var);
        n6a1Var.f(uw91Var.a);
        while (l < i3) {
            int l2 = l(bArr, l, uw91Var);
            if (i != uw91Var.a) {
                break;
            }
            l = l(bArr, l2, uw91Var);
            n6a1Var.f(uw91Var.a);
        }
        return l;
    }

    public static int o(byte[] bArr, int i, uw91 uw91Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            uw91Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        uw91Var.b = j2;
        return i3;
    }

    public static int p(Object obj, ofa1 ofa1Var, byte[] bArr, int i, int i2, int i3, uw91 uw91Var) {
        s sVar = (s) ofa1Var;
        int i4 = uw91Var.e + 1;
        uw91Var.e = i4;
        if (i4 >= 100) {
            su71.d("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int s = sVar.s(obj, bArr, i, i2, i3, uw91Var);
        uw91Var.e--;
        uw91Var.c = obj;
        return s;
    }

    public static int q(Object obj, ofa1 ofa1Var, byte[] bArr, int i, int i2, uw91 uw91Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m(i4, bArr, i3, uw91Var);
            i4 = uw91Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            su71.d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = uw91Var.e + 1;
        uw91Var.e = i6;
        if (i6 >= 100) {
            su71.d("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        ofa1Var.h(obj, bArr, i5, i7, uw91Var);
        uw91Var.e--;
        uw91Var.c = obj;
        return i7;
    }

    public static long r(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
