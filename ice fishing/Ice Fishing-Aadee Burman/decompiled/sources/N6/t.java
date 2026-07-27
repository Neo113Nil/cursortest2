package N6;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2009a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f2010b;

    static {
        AtomicInteger atomicInteger = j.f1975n;
        f2009a = new i();
        f2010b = new i();
    }

    public static int a(b bVar, f6.g gVar, j jVar) {
        P6.a aVar = P6.a.f2560b;
        int b9 = jVar.b();
        int d2 = aVar.d(gVar, jVar);
        int b10 = d.b(d2) + bVar.f1955c + d2;
        jVar.f1978c[b9] = d2;
        return b10;
    }

    public static int b(b bVar, Object obj, Object obj2, p pVar, j jVar) {
        int b9 = jVar.b();
        int a9 = pVar.a(obj, obj2, jVar);
        int b10 = d.b(a9) + bVar.f1955c + a9;
        jVar.f1978c[b9] = a9;
        return b10;
    }

    public static int c(b bVar, List list, q qVar, j jVar) {
        if (list.isEmpty()) {
            return 0;
        }
        int i = bVar.f1955c;
        int i6 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object obj = list.get(i9);
            int b9 = jVar.b();
            int d2 = qVar.d(obj, jVar);
            jVar.f1978c[b9] = d2;
            i6 += d.b(d2) + i + d2;
        }
        return i6;
    }

    public static int d(b bVar, String str, j jVar) {
        int i;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        if (!jVar.f1976a) {
            byte[] f3 = k.f(str);
            jVar.a(f3);
            int length = f3.length;
            if (length == 0) {
                return 0;
            }
            return d.b(length) + length + bVar.f1955c;
        }
        if (jVar.f1977b && w.f2016d && v.b(str, w.f2014b) == 0) {
            byte[] bArr = (byte[]) v.d(str, w.f2013a);
            int length2 = str.length();
            int i6 = 0;
            int i9 = 0;
            for (int i10 = 1; i10 <= (bArr.length / 2040) + 1; i10++) {
                int min = Math.min(i10 * 2040, bArr.length & (-8));
                long j6 = 0;
                while (i6 < min) {
                    j6 += (v.c(w.f2015c + i6, bArr) & (-9187201950435737472L)) >>> 7;
                    i6 += 8;
                }
                if (j6 != 0) {
                    for (int i11 = 0; i11 < 8; i11++) {
                        i9 += (int) (255 & j6);
                        j6 >>>= 8;
                    }
                }
            }
            while (i6 < bArr.length) {
                i9 += bArr[i6] >>> 31;
                i6++;
            }
            i = length2 + i9;
        } else {
            int length3 = str.length();
            int i12 = 0;
            while (i12 < length3 && str.charAt(i12) < 128) {
                i12++;
            }
            int i13 = length3;
            while (true) {
                if (i12 >= length3) {
                    break;
                }
                char charAt = str.charAt(i12);
                if (charAt < 2048) {
                    i13 += (127 - charAt) >>> 31;
                    i12++;
                } else {
                    int length4 = str.length();
                    int i14 = 0;
                    while (i12 < length4) {
                        char charAt2 = str.charAt(i12);
                        if (charAt2 < 2048) {
                            i14 += (127 - charAt2) >>> 31;
                        } else {
                            int i15 = i14 + 2;
                            if (Character.isSurrogate(charAt2)) {
                                if (Character.codePointAt(str, i12) != charAt2) {
                                    i12++;
                                }
                            }
                            i14 = i15;
                        }
                        i12++;
                    }
                    i13 += i14;
                }
            }
            i = i13;
            if (i < length3) {
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i + 4294967296L));
            }
        }
        int i16 = jVar.f1980e;
        int[] iArr = jVar.f1978c;
        if (i16 == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            jVar.f1978c = iArr2;
        }
        int[] iArr3 = jVar.f1978c;
        int i17 = jVar.f1980e;
        jVar.f1980e = i17 + 1;
        iArr3[i17] = i;
        if (i == 0) {
            return 0;
        }
        return d.b(i) + i + bVar.f1955c;
    }
}
