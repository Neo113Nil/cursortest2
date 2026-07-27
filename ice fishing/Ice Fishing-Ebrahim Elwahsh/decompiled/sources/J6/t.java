package J6;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1456a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f1457b;

    static {
        AtomicInteger atomicInteger = j.f1422n;
        f1456a = new i();
        f1457b = new i();
    }

    public static int a(b bVar, b6.g gVar, j jVar) {
        L6.a aVar = L6.a.f1748b;
        int b9 = jVar.b();
        int c4 = aVar.c(gVar, jVar);
        int b10 = d.b(c4) + bVar.f1402c + c4;
        jVar.f1425c[b9] = c4;
        return b10;
    }

    public static int b(b bVar, Object obj, Object obj2, p pVar, j jVar) {
        int b9 = jVar.b();
        int a9 = pVar.a(obj, obj2, jVar);
        int b10 = d.b(a9) + bVar.f1402c + a9;
        jVar.f1425c[b9] = a9;
        return b10;
    }

    public static int c(b bVar, List list, q qVar, j jVar) {
        if (list.isEmpty()) {
            return 0;
        }
        int i = bVar.f1402c;
        int i4 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object obj = list.get(i9);
            int b9 = jVar.b();
            int c4 = qVar.c(obj, jVar);
            jVar.f1425c[b9] = c4;
            i4 += d.b(c4) + i + c4;
        }
        return i4;
    }

    public static int d(b bVar, String str, j jVar) {
        int i;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        if (!jVar.f1423a) {
            byte[] f6 = k.f(str);
            jVar.a(f6);
            int length = f6.length;
            if (length == 0) {
                return 0;
            }
            return d.b(length) + length + bVar.f1402c;
        }
        if (jVar.f1424b && w.f1463d && v.b(str, w.f1461b) == 0) {
            byte[] bArr = (byte[]) v.d(str, w.f1460a);
            int length2 = str.length();
            int i4 = 0;
            int i9 = 0;
            for (int i10 = 1; i10 <= (bArr.length / 2040) + 1; i10++) {
                int min = Math.min(i10 * 2040, bArr.length & (-8));
                long j9 = 0;
                while (i4 < min) {
                    j9 += (v.c(w.f1462c + i4, bArr) & (-9187201950435737472L)) >>> 7;
                    i4 += 8;
                }
                if (j9 != 0) {
                    for (int i11 = 0; i11 < 8; i11++) {
                        i9 += (int) (255 & j9);
                        j9 >>>= 8;
                    }
                }
            }
            while (i4 < bArr.length) {
                i9 += bArr[i4] >>> 31;
                i4++;
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
        int i16 = jVar.f1427e;
        int[] iArr = jVar.f1425c;
        if (i16 == iArr.length) {
            int[] iArr2 = new int[iArr.length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            jVar.f1425c = iArr2;
        }
        int[] iArr3 = jVar.f1425c;
        int i17 = jVar.f1427e;
        jVar.f1427e = i17 + 1;
        iArr3[i17] = i;
        if (i == 0) {
            return 0;
        }
        return d.b(i) + i + bVar.f1402c;
    }
}
