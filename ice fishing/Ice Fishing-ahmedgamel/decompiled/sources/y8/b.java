package y8;

import com.google.android.gms.internal.ads.Wv;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import v7.C5116g;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final d f41910a = new d();

    public static final boolean a(byte[] a9, int i, byte[] b9, int i4, int i6) {
        kotlin.jvm.internal.h.e(a9, "a");
        kotlin.jvm.internal.h.e(b9, "b");
        for (int i9 = 0; i9 < i6; i9++) {
            if (a9[i9 + i] != b9[i9 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final r b(x xVar) {
        kotlin.jvm.internal.h.e(xVar, "<this>");
        return new r(xVar);
    }

    public static void c(long j6, e eVar, int i, ArrayList arrayList, int i4, int i6, ArrayList arrayList2) {
        int i9;
        int i10;
        ArrayList arrayList3;
        long j9;
        int i11;
        int i12 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i4 >= i6) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i13 = i4; i13 < i6; i13++) {
            if (((h) arrayList4.get(i13)).a() < i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        h hVar = (h) arrayList.get(i4);
        h hVar2 = (h) arrayList4.get(i6 - 1);
        if (i12 == hVar.a()) {
            int intValue = ((Number) arrayList5.get(i4)).intValue();
            int i14 = i4 + 1;
            h hVar3 = (h) arrayList4.get(i14);
            i9 = i14;
            i10 = intValue;
            hVar = hVar3;
        } else {
            i9 = i4;
            i10 = -1;
        }
        if (hVar.e(i12) == hVar2.e(i12)) {
            int min = Math.min(hVar.a(), hVar2.a());
            int i15 = 0;
            for (int i16 = i12; i16 < min && hVar.e(i16) == hVar2.e(i16); i16++) {
                i15++;
            }
            long j10 = 4;
            long j11 = (eVar.f41924u / j10) + j6 + 2 + i15 + 1;
            eVar.a0(-i15);
            eVar.a0(i10);
            int i17 = i12 + i15;
            while (i12 < i17) {
                eVar.a0(hVar.e(i12) & com.anythink.basead.exoplayer.k.p.f9259b);
                i12++;
            }
            if (i9 + 1 == i6) {
                if (i17 != ((h) arrayList4.get(i9)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                eVar.a0(((Number) arrayList5.get(i9)).intValue());
                return;
            } else {
                e eVar2 = new e();
                eVar.a0(((int) ((eVar2.f41924u / j10) + j11)) * (-1));
                c(j11, eVar2, i17, arrayList4, i9, i6, arrayList5);
                eVar.W(eVar2);
                return;
            }
        }
        int i18 = 1;
        for (int i19 = i9 + 1; i19 < i6; i19++) {
            if (((h) arrayList4.get(i19 - 1)).e(i12) != ((h) arrayList4.get(i19)).e(i12)) {
                i18++;
            }
        }
        long j12 = 4;
        long j13 = (eVar.f41924u / j12) + j6 + 2 + (i18 * 2);
        eVar.a0(i18);
        eVar.a0(i10);
        for (int i20 = i9; i20 < i6; i20++) {
            int e9 = ((h) arrayList4.get(i20)).e(i12);
            if (i20 == i9 || e9 != ((h) arrayList4.get(i20 - 1)).e(i12)) {
                eVar.a0(e9 & com.anythink.basead.exoplayer.k.p.f9259b);
            }
        }
        e eVar3 = new e();
        int i21 = i9;
        while (i21 < i6) {
            byte e10 = ((h) arrayList4.get(i21)).e(i12);
            int i22 = i21 + 1;
            int i23 = i22;
            while (true) {
                if (i23 >= i6) {
                    i23 = i6;
                    break;
                } else if (e10 != ((h) arrayList4.get(i23)).e(i12)) {
                    break;
                } else {
                    i23++;
                }
            }
            if (i22 == i23 && i12 + 1 == ((h) arrayList4.get(i21)).a()) {
                eVar.a0(((Number) arrayList5.get(i21)).intValue());
                arrayList3 = arrayList5;
                j9 = j13;
                i11 = i23;
            } else {
                eVar.a0(((int) ((eVar3.f41924u / j12) + j13)) * (-1));
                arrayList3 = arrayList5;
                j9 = j13;
                i11 = i23;
                c(j9, eVar3, i12 + 1, arrayList, i21, i11, arrayList3);
                arrayList4 = arrayList;
            }
            j13 = j9;
            i21 = i11;
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
        ArrayList arrayList = new ArrayList(new C5116g(hVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(-1);
        }
        int length = hVarArr.length;
        int i6 = 0;
        int i9 = 0;
        while (i6 < length) {
            h hVar = hVarArr[i6];
            int i10 = i9 + 1;
            int size2 = arrayList.size();
            int size3 = arrayList.size();
            if (size2 < 0) {
                throw new IllegalArgumentException(D.x.j(size2, "fromIndex (0) is greater than toIndex (", ")."));
            }
            if (size2 > size3) {
                throw new IndexOutOfBoundsException("toIndex (" + size2 + ") is greater than size (" + size3 + ").");
            }
            int i11 = size2 - 1;
            int i12 = 0;
            while (true) {
                if (i12 > i11) {
                    i = -(i12 + 1);
                    break;
                }
                i = (i12 + i11) >>> 1;
                Comparable comparable = (Comparable) arrayList.get(i);
                int compareTo = comparable == hVar ? 0 : comparable == null ? -1 : hVar == null ? 1 : comparable.compareTo(hVar);
                if (compareTo < 0) {
                    i12 = i + 1;
                } else if (compareTo > 0) {
                    i11 = i - 1;
                }
            }
            arrayList2.set(i, Integer.valueOf(i9));
            i6++;
            i9 = i10;
        }
        if (((h) arrayList.get(0)).a() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            h prefix = (h) arrayList.get(i13);
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 < arrayList.size()) {
                h hVar2 = (h) arrayList.get(i15);
                hVar2.getClass();
                kotlin.jvm.internal.h.e(prefix, "prefix");
                if (hVar2.g(prefix, prefix.a())) {
                    if (hVar2.a() == prefix.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + hVar2).toString());
                    }
                    if (((Number) arrayList2.get(i15)).intValue() > ((Number) arrayList2.get(i13)).intValue()) {
                        arrayList.remove(i15);
                        ((Number) arrayList2.remove(i15)).intValue();
                    } else {
                        i15++;
                    }
                }
            }
            i13 = i14;
        }
        e eVar = new e();
        c(0L, eVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i16 = (int) (eVar.f41924u / 4);
        int[] iArr = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr[i17] = eVar.D();
        }
        Object[] copyOf = Arrays.copyOf(hVarArr, hVarArr.length);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return new m((h[]) copyOf, iArr);
    }

    public static final int f(int i) {
        return ((i & com.anythink.basead.exoplayer.k.p.f9259b) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static long g(String str) {
        int i;
        int length = str.length();
        kotlin.jvm.internal.h.e(str, "<this>");
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC5128c.c(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder k9 = Wv.k(length, "endIndex > string.length: ", " > ");
            k9.append(str.length());
            throw new IllegalArgumentException(k9.toString().toString());
        }
        long j6 = 0;
        int i4 = 0;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                j6++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i6 = i4 + 1;
                    char charAt2 = i6 < length ? str.charAt(i6) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j6++;
                        i4 = i6;
                    } else {
                        j6 += 4;
                        i4 += 2;
                    }
                }
                j6 += i;
            }
            i4++;
        }
        return j6;
    }

    public static final l h(InputStream inputStream) {
        kotlin.jvm.internal.h.e(inputStream, "<this>");
        return new l(inputStream, new z());
    }

    public static final String i(int i) {
        int i4 = 0;
        if (i == 0) {
            return "0";
        }
        char[] cArr = z8.b.f42246a;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i4 < 8 && cArr2[i4] == '0') {
            i4++;
        }
        S0.f.b(i4, 8, 8);
        return new String(cArr2, i4, 8 - i4);
    }
}
