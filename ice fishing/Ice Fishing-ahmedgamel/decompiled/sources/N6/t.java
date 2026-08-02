package N6;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2097a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f2098b;

    static {
        AtomicInteger atomicInteger = j.f2063n;
        f2097a = new i();
        f2098b = new i();
    }

    public static int a(b bVar, f6.g gVar, j jVar) {
        P6.a aVar = P6.a.f2395b;
        int b9 = jVar.b();
        int d9 = aVar.d(gVar, jVar);
        int b10 = d.b(d9) + bVar.f2043c + d9;
        jVar.f2066c[b9] = d9;
        return b10;
    }

    public static int b(b bVar, Object obj, Object obj2, p pVar, j jVar) {
        int b9 = jVar.b();
        int a9 = pVar.a(obj, obj2, jVar);
        int b10 = d.b(a9) + bVar.f2043c + a9;
        jVar.f2066c[b9] = a9;
        return b10;
    }

    public static int c(b bVar, List list, q qVar, j jVar) {
        if (list.isEmpty()) {
            return 0;
        }
        int i = bVar.f2043c;
        int i4 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            Object obj = list.get(i6);
            int b9 = jVar.b();
            int d9 = qVar.d(obj, jVar);
            jVar.f2066c[b9] = d9;
            i4 += d.b(d9) + i + d9;
        }
        return i4;
    }

    public static int d(b bVar, String str, j jVar) {
        int i;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        if (!jVar.f2064a) {
            byte[] f2 = k.f(str);
            jVar.a(f2);
            int length = f2.length;
            if (length == 0) {
                return 0;
            }
            return d.b(length) + length + bVar.f2043c;
        }
        if (jVar.f2065b && w.f2104d && v.b(str, w.f2102b) == 0) {
            byte[] bArr = (byte[]) v.d(str, w.f2101a);
            int length2 = str.length();
            int i4 = 0;
            int i6 = 0;
            for (int i9 = 1; i9 <= (bArr.length / 2040) + 1; i9++) {
                int min = Math.min(i9 * 2040, bArr.length & (-8));
                long j6 = 0;
                while (i4 < min) {
                    j6 += (v.c(w.f2103c + i4, bArr) & (-9187201950435737472L)) >>> 7;
                    i4 += 8;
                }
                if (j6 != 0) {
                    for (int i10 = 0; i10 < 8; i10++) {
                        i6 += (int) (255 & j6);
                        j6 >>>= 8;
                    }
                }
            }
            while (i4 < bArr.length) {
                i6 += bArr[i4] >>> 31;
                i4++;
            }
            i = length2 + i6;
        } else {
            int length3 = str.length();
            int i11 = 0;
            while (i11 < length3 && str.charAt(i11) < 128) {
                i11++;
            }
            int i12 = length3;
            while (true) {
                if (i11 >= length3) {
                    break;
                }
                char charAt = str.charAt(i11);
                if (charAt < 2048) {
                    i12 += (127 - charAt) >>> 31;
                    i11++;
                } else {
                    int length4 = str.length();
                    int i13 = 0;
                    while (i11 < length4) {
                        char charAt2 = str.charAt(i11);
                        if (charAt2 < 2048) {
                            i13 += (127 - charAt2) >>> 31;
                        } else {
                            int i14 = i13 + 2;
                            if (Character.isSurrogate(charAt2)) {
                                if (Character.codePointAt(str, i11) != charAt2) {
                                    i11++;
                                }
                            }
                            i13 = i14;
                        }
                        i11++;
                    }
                    i12 += i13;
                }
            }
            i = i12;
            if (i < length3) {
                throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i + 4294967296L));
            }
        }
        int i15 = jVar.f2068e;
        int[] iArr = jVar.f2066c;
        if (i15 == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            jVar.f2066c = iArr2;
        }
        int[] iArr3 = jVar.f2066c;
        int i16 = jVar.f2068e;
        jVar.f2068e = i16 + 1;
        iArr3[i16] = i;
        if (i == 0) {
            return 0;
        }
        return d.b(i) + i + bVar.f2043c;
    }
}
