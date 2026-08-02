package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.pulse.histogram.ComponentHistograms;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class cp2 {
    public static final byte[] f = {13, 10};
    public static final byte[] g = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] h = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Serializable e;

    /* JADX WARN: Type inference failed for: r7v6, types: [byte[], java.io.Serializable, java.lang.Object] */
    public cp2(int i, byte[] bArr) {
        int length = bArr.length;
        this.a = (i <= 0 || length <= 0) ? 0 : (i / 4) * 4;
        this.b = length;
        for (byte b : bArr) {
            if (61 == b || (b >= 0 && b < 123 && h[b] != -1)) {
                xq0.x(hrg.q("lineSeparator must not contain base64 characters: [", new String(bArr, oe4.a), "]"));
                throw null;
            }
        }
        if (i > 0) {
            this.c = bArr.length + 4;
            ?? r7 = new byte[bArr.length];
            this.e = r7;
            System.arraycopy(bArr, 0, r7, 0, bArr.length);
        } else {
            this.c = 4;
            this.e = null;
        }
        this.d = g;
    }

    public static String e(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            cp2 cp2Var = new cp2(0, f);
            long length = ((bArr.length + 2) / 3) * 4;
            int i = cp2Var.a;
            if (i > 0) {
                long j = i;
                length += (((length + j) - 1) / j) * cp2Var.b;
            }
            if (length > Integer.MAX_VALUE) {
                xq0.x(dfi.e(length, "Input array too big, the output array would be bigger (", ") than the specified maximum size of 2147483647"));
                return null;
            }
            if (bArr.length != 0) {
                us2 us2Var = new us2(0);
                cp2Var.d(bArr, bArr.length, us2Var);
                cp2Var.d(bArr, -1, us2Var);
                int i2 = us2Var.c - us2Var.d;
                byte[] bArr2 = new byte[i2];
                if (((byte[]) us2Var.h) != null) {
                    int min = Math.min(i2, i2);
                    System.arraycopy((byte[]) us2Var.h, us2Var.d, bArr2, 0, min);
                    int i3 = us2Var.d + min;
                    us2Var.d = i3;
                    if (i3 >= us2Var.c) {
                        us2Var.h = null;
                    }
                }
                bArr = bArr2;
            }
        }
        Charset charset = oe4.a;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    public static byte[] f(int i, us2 us2Var) {
        byte[] bArr = (byte[]) us2Var.h;
        if (bArr != null && bArr.length >= us2Var.c + i) {
            return bArr;
        }
        if (bArr == null) {
            us2Var.h = new byte[RemoteCameraConfig.Notification.ID];
            us2Var.c = 0;
            us2Var.d = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            us2Var.h = bArr2;
        }
        return (byte[]) us2Var.h;
    }

    public lyd a(di3 di3Var) {
        return new iyd((String) this.d, di3Var);
    }

    public lyd b(ComponentHistograms componentHistograms) {
        lyd a = componentHistograms.a((String) this.d);
        if (a == null) {
            di3 c = c();
            String str = componentHistograms.a;
            str.getClass();
            c.b();
            synchronized (efo.f) {
                try {
                    if (efo.h == null) {
                        new efo(2);
                    }
                    efo efoVar = efo.h;
                    efoVar.getClass();
                    if (!((ciq) efoVar.b).containsKey(str)) {
                        efo efoVar2 = efo.h;
                        efoVar2.getClass();
                        ((ciq) efoVar2.b).put(str, new lgr());
                    }
                    efo efoVar3 = efo.h;
                    efoVar3.getClass();
                    Object obj = ((ciq) efoVar3.b).get(str);
                    obj.getClass();
                    ciq ciqVar = ((lgr) obj).b;
                    di3 di3Var = (di3) ciqVar.get(c);
                    if (di3Var == null) {
                        ciqVar.put(c, c);
                    } else {
                        c = di3Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.c == 0) {
                int a2 = c.a();
                this.c = a2;
                int[] iArr = c.a;
                this.a = iArr[1];
                this.b = iArr[a2 - 1];
            }
            int[] iArr2 = c.a;
            int i = iArr2[1];
            int i2 = iArr2[this.c - 1];
            a = componentHistograms.e(a(c));
        }
        if (!((Class) this.e).equals(a.getClass())) {
            wb8.h(su4.o(new StringBuilder("Histogram "), (String) this.d, " has mismatched type"));
            return null;
        }
        int i3 = this.c;
        if (i3 == 0 || a.e(this.a, this.b, i3)) {
            return a;
        }
        wb8.h(su4.o(new StringBuilder("Histogram "), (String) this.d, " has mismatched construction arguments"));
        return null;
    }

    public di3 c() {
        di3 di3Var = new di3(this.c + 1);
        int i = this.a;
        double log = Math.log(this.b);
        int[] iArr = di3Var.a;
        iArr[1] = i;
        int a = di3Var.a();
        int i2 = 1;
        while (true) {
            i2++;
            if (a <= i2) {
                iArr[di3Var.a()] = Integer.MAX_VALUE;
                di3Var.b = di3Var.b();
                return di3Var;
            }
            double log2 = Math.log(i);
            int a2 = eeh.a(Math.exp(((log - log2) / (a - i2)) + log2));
            i = a2 > i ? a2 : i + 1;
            iArr[i2] = i;
        }
    }

    public void d(byte[] bArr, int i, us2 us2Var) {
        int i2 = this.c;
        byte[] bArr2 = (byte[]) this.d;
        int i3 = this.a;
        byte[] bArr3 = (byte[]) this.e;
        if (us2Var.f) {
            return;
        }
        if (i >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i) {
                byte[] f2 = f(i2, us2Var);
                int i6 = (us2Var.g + 1) % 3;
                us2Var.g = i6;
                int i7 = i5 + 1;
                int i8 = bArr[i5];
                if (i8 < 0) {
                    i8 += 256;
                }
                int i9 = (us2Var.b << 8) + i8;
                us2Var.b = i9;
                if (i6 == 0) {
                    int i10 = us2Var.c;
                    int i11 = i10 + 1;
                    us2Var.c = i11;
                    f2[i10] = bArr2[(i9 >> 18) & 63];
                    int i12 = i10 + 2;
                    us2Var.c = i12;
                    f2[i11] = bArr2[(i9 >> 12) & 63];
                    int i13 = i10 + 3;
                    us2Var.c = i13;
                    f2[i12] = bArr2[(i9 >> 6) & 63];
                    int i14 = i10 + 4;
                    us2Var.c = i14;
                    f2[i13] = bArr2[i9 & 63];
                    int i15 = us2Var.e + 4;
                    us2Var.e = i15;
                    if (i3 > 0 && i3 <= i15) {
                        System.arraycopy(bArr3, 0, f2, i14, bArr3.length);
                        us2Var.c += bArr3.length;
                        us2Var.e = 0;
                    }
                }
                i4++;
                i5 = i7;
            }
            return;
        }
        us2Var.f = true;
        if (us2Var.g == 0 && i3 == 0) {
            return;
        }
        byte[] f3 = f(i2, us2Var);
        int i16 = us2Var.c;
        int i17 = us2Var.g;
        if (i17 != 0) {
            byte[] bArr4 = g;
            if (i17 == 1) {
                int i18 = i16 + 1;
                us2Var.c = i18;
                int i19 = us2Var.b;
                f3[i16] = bArr2[(i19 >> 2) & 63];
                int i20 = i16 + 2;
                us2Var.c = i20;
                f3[i18] = bArr2[(i19 << 4) & 63];
                if (bArr2 == bArr4) {
                    int i21 = i16 + 3;
                    us2Var.c = i21;
                    f3[i20] = 61;
                    us2Var.c = i16 + 4;
                    f3[i21] = 61;
                }
            } else {
                if (i17 != 2) {
                    dlh.d(us2Var.g, "Impossible modulus ");
                    return;
                }
                int i22 = i16 + 1;
                us2Var.c = i22;
                int i23 = us2Var.b;
                f3[i16] = bArr2[(i23 >> 10) & 63];
                int i24 = i16 + 2;
                us2Var.c = i24;
                f3[i22] = bArr2[(i23 >> 4) & 63];
                int i25 = i16 + 3;
                us2Var.c = i25;
                f3[i24] = bArr2[(i23 << 2) & 63];
                if (bArr2 == bArr4) {
                    us2Var.c = i16 + 4;
                    f3[i25] = 61;
                }
            }
        }
        int i26 = us2Var.e;
        int i27 = us2Var.c;
        int i28 = (i27 - i16) + i26;
        us2Var.e = i28;
        if (i3 <= 0 || i28 <= 0) {
            return;
        }
        System.arraycopy(bArr3, 0, f3, i27, bArr3.length);
        us2Var.c += bArr3.length;
    }

    public void g() {
        int i = this.c;
        this.c = i == Integer.MIN_VALUE ? this.a : i + this.b;
        this.e = ((String) this.d) + this.c;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Serializable, java.lang.Object, vtd[]] */
    public void h(vtd vtdVar) {
        int i;
        int i2 = vtdVar.c;
        if (i2 > 4096) {
            Arrays.fill((vtd[]) this.e, (Object) null);
            this.b = ((vtd[]) this.e).length - 1;
            this.a = 0;
            this.c = 0;
            return;
        }
        int i3 = (this.c + i2) - 4096;
        if (i3 > 0) {
            int length = ((vtd[]) this.e).length - 1;
            int i4 = 0;
            while (true) {
                i = this.b;
                if (length < i || i3 <= 0) {
                    break;
                }
                int i5 = ((vtd[]) this.e)[length].c;
                i3 -= i5;
                this.c -= i5;
                this.a--;
                i4++;
                length--;
            }
            vtd[] vtdVarArr = (vtd[]) this.e;
            int i6 = i + 1;
            System.arraycopy(vtdVarArr, i6, vtdVarArr, i6 + i4, this.a);
            this.b += i4;
        }
        int i7 = this.a + 1;
        vtd[] vtdVarArr2 = (vtd[]) this.e;
        if (i7 > vtdVarArr2.length) {
            ?? r2 = new vtd[vtdVarArr2.length * 2];
            System.arraycopy(vtdVarArr2, 0, r2, vtdVarArr2.length, vtdVarArr2.length);
            this.b = ((vtd[]) this.e).length - 1;
            this.e = r2;
        }
        int i8 = this.b;
        this.b = i8 - 1;
        ((vtd[]) this.e)[i8] = vtdVar;
        this.a++;
        this.c += i2;
    }

    public void i() {
        if (this.c != Integer.MIN_VALUE) {
            return;
        }
        xq0.q("generateNewId() must be called before retrieving ids.");
    }

    public void j(pn3 pn3Var) {
        k(pn3Var.d(), 127, 0);
        ((hi3) this.d).L0(pn3Var);
    }

    public void k(int i, int i2, int i3) {
        hi3 hi3Var = (hi3) this.d;
        if (i < i2) {
            hi3Var.M0(i | i3);
            return;
        }
        hi3Var.M0(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            hi3Var.M0(128 | (i4 & 127));
            i4 >>>= 7;
        }
        hi3Var.M0(i4);
    }

    public cp2(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public cp2(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.d = str;
        this.a = i2;
        this.b = i3;
        this.c = Integer.MIN_VALUE;
        this.e = "";
    }

    public cp2(String str, Class cls, int i, int i2, int i3) {
        str.getClass();
        this.d = str;
        this.e = cls;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, vtd[]] */
    public cp2(hi3 hi3Var) {
        this.e = new vtd[8];
        this.b = 7;
        this.d = hi3Var;
    }
}
