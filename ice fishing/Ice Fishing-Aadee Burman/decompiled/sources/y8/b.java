package y8;

import com.icefishing.icefishinglive2.AbstractC4404f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import v7.C5126g;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final d f41936a = new d();

    public static final boolean a(byte[] a9, int i, byte[] b9, int i6, int i9) {
        kotlin.jvm.internal.h.e(a9, "a");
        kotlin.jvm.internal.h.e(b9, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (a9[i10 + i] != b9[i10 + i6]) {
                return false;
            }
        }
        return true;
    }

    public static final r b(x xVar) {
        kotlin.jvm.internal.h.e(xVar, "<this>");
        return new r(xVar);
    }

    public static void c(long j6, e eVar, int i, ArrayList arrayList, int i6, int i9, ArrayList arrayList2) {
        int i10;
        int i11;
        ArrayList arrayList3;
        long j9;
        int i12;
        int i13 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i6 >= i9) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i14 = i6; i14 < i9; i14++) {
            if (((h) arrayList4.get(i14)).a() < i13) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        h hVar = (h) arrayList.get(i6);
        h hVar2 = (h) arrayList4.get(i9 - 1);
        if (i13 == hVar.a()) {
            int intValue = ((Number) arrayList5.get(i6)).intValue();
            int i15 = i6 + 1;
            h hVar3 = (h) arrayList4.get(i15);
            i10 = i15;
            i11 = intValue;
            hVar = hVar3;
        } else {
            i10 = i6;
            i11 = -1;
        }
        if (hVar.e(i13) == hVar2.e(i13)) {
            int min = Math.min(hVar.a(), hVar2.a());
            int i16 = 0;
            for (int i17 = i13; i17 < min && hVar.e(i17) == hVar2.e(i17); i17++) {
                i16++;
            }
            long j10 = 4;
            long j11 = (eVar.f41950u / j10) + j6 + 2 + i16 + 1;
            eVar.a0(-i16);
            eVar.a0(i11);
            int i18 = i13 + i16;
            while (i13 < i18) {
                eVar.a0(hVar.e(i13) & com.anythink.basead.exoplayer.k.p.f8473b);
                i13++;
            }
            if (i10 + 1 == i9) {
                if (i18 != ((h) arrayList4.get(i10)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                eVar.a0(((Number) arrayList5.get(i10)).intValue());
                return;
            } else {
                e eVar2 = new e();
                eVar.a0(((int) ((eVar2.f41950u / j10) + j11)) * (-1));
                c(j11, eVar2, i18, arrayList4, i10, i9, arrayList5);
                eVar.W(eVar2);
                return;
            }
        }
        int i19 = 1;
        for (int i20 = i10 + 1; i20 < i9; i20++) {
            if (((h) arrayList4.get(i20 - 1)).e(i13) != ((h) arrayList4.get(i20)).e(i13)) {
                i19++;
            }
        }
        long j12 = 4;
        long j13 = (eVar.f41950u / j12) + j6 + 2 + (i19 * 2);
        eVar.a0(i19);
        eVar.a0(i11);
        for (int i21 = i10; i21 < i9; i21++) {
            int e9 = ((h) arrayList4.get(i21)).e(i13);
            if (i21 == i10 || e9 != ((h) arrayList4.get(i21 - 1)).e(i13)) {
                eVar.a0(e9 & com.anythink.basead.exoplayer.k.p.f8473b);
            }
        }
        e eVar3 = new e();
        int i22 = i10;
        while (i22 < i9) {
            byte e10 = ((h) arrayList4.get(i22)).e(i13);
            int i23 = i22 + 1;
            int i24 = i23;
            while (true) {
                if (i24 >= i9) {
                    i24 = i9;
                    break;
                } else if (e10 != ((h) arrayList4.get(i24)).e(i13)) {
                    break;
                } else {
                    i24++;
                }
            }
            if (i23 == i24 && i13 + 1 == ((h) arrayList4.get(i22)).a()) {
                eVar.a0(((Number) arrayList5.get(i22)).intValue());
                arrayList3 = arrayList5;
                j9 = j13;
                i12 = i24;
            } else {
                eVar.a0(((int) ((eVar3.f41950u / j12) + j13)) * (-1));
                arrayList3 = arrayList5;
                j9 = j13;
                i12 = i24;
                c(j9, eVar3, i13 + 1, arrayList, i22, i12, arrayList3);
                arrayList4 = arrayList;
            }
            j13 = j9;
            i22 = i12;
            arrayList5 = arrayList3;
        }
        eVar.W(eVar3);
    }

    public static final void d(long j6, long j9, long j10) {
        if ((j9 | j10) < 0 || j9 > j6 || j6 - j9 < j10) {
            throw new ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j9 + " byteCount=" + j10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0135, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m e(h... hVarArr) {
        int i;
        if (hVarArr.length == 0) {
            return new m(new h[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C5126g(hVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            arrayList2.add(-1);
        }
        int length = hVarArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            h hVar = hVarArr[i9];
            int i11 = i10 + 1;
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            if (size2 < 0) {
                throw new IllegalArgumentException(D.y.k(size2, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size2 > size3) {
                throw new IndexOutOfBoundsException("toIndex (" + size2 + ") is greater than size (" + size3 + ").");
            }
            int i12 = size2 - 1;
            int i13 = 0;
            while (true) {
                if (i13 > i12) {
                    i = -(i13 + 1);
                    break;
                }
                i = (i13 + i12) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i);
                int compareTo = comparable == hVar ? 0 : comparable == null ? -1 : hVar == null ? 1 : comparable.compareTo(hVar);
                if (compareTo < 0) {
                    i13 = i + 1;
                } else if (compareTo > 0) {
                    i12 = i - 1;
                }
            }
            arrayList2.set(i, Integer.valueOf(i10));
            i9++;
            i10 = i11;
        }
        if (((h) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i14 = 0;
        while (i14 < arrayList.size()) {
            h prefix = (h) arrayList.get(i14);
            int i15 = i14 + 1;
            int i16 = i15;
            while (i16 < arrayList.size()) {
                h hVar2 = (h) arrayList.get(i16);
                hVar2.getClass();
                kotlin.jvm.internal.h.e(prefix, "prefix");
                if (hVar2.g(prefix, prefix.a())) {
                    if (hVar2.a() == prefix.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + hVar2).toString());
                    }
                    if (((Number) arrayList2.get(i16)).intValue() > ((Number) arrayList2.get(i14)).intValue()) {
                        arrayList.remove(i16);
                        ((Number) arrayList2.remove(i16)).intValue();
                    } else {
                        i16++;
                    }
                }
            }
            i14 = i15;
        }
        e eVar = new e();
        c(0L, eVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i17 = (int) (eVar.f41950u / 4);
        int[] iArr = new int[i17];
        for (int i18 = 0; i18 < i17; i18++) {
            iArr[i18] = eVar.D();
        }
        Object[] copyOf = Arrays.copyOf(hVarArr, hVarArr.length);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new m((h[]) copyOf, iArr);
    }

    public static final int f(int i) {
        return ((i & com.anythink.basead.exoplayer.k.p.f8473b) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static long g(String str) {
        int i;
        int length = str.length();
        kotlin.jvm.internal.h.e(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(u1.h.c(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder i6 = AbstractC4404f.i(length, "endIndex > string.length: ", " > ");
            i6.append(str.length());
            throw new IllegalArgumentException(i6.toString().toString());
        }
        long j6 = 0;
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt < 128) {
                j6++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i10 = i9 + 1;
                    char charAt2 = i10 < length ? str.charAt(i10) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j6++;
                        i9 = i10;
                    } else {
                        j6 += 4;
                        i9 += 2;
                    }
                }
                j6 += i;
            }
            i9++;
        }
        return j6;
    }

    public static final l h(InputStream inputStream) {
        kotlin.jvm.internal.h.e(inputStream, "<this>");
        return new l(inputStream, new z());
    }

    public static final String i(int i) {
        int i6 = 0;
        if (i == 0) {
            return "0";
        }
        char[] cArr = z8.b.f42274a;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i6 < 8 && cArr2[i6] == '0') {
            i6++;
        }
        com.bumptech.glide.g.b(i6, 8, 8);
        return new String(cArr2, i6, 8 - i6);
    }
}
