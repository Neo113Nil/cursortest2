package com.gamericefishpro.space.f5;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends n0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, boolean z) {
        super(z);
        this.k = i;
    }

    public static float[] g(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new float[]{((Number) n0.e.d(value)).floatValue()};
    }

    public static int[] h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new int[]{((Number) n0.a.d(value)).intValue()};
    }

    public static long[] i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new long[]{((Number) n0.c.d(value)).longValue()};
    }

    public static boolean[] j(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new boolean[]{((Boolean) n0.g.d(value)).booleanValue()};
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object a(String key, Bundle source) {
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!com.gamericefishpro.space.u6.f.n(key, source) || com.gamericefishpro.space.u6.f.G(key, source)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                boolean[] booleanArray = source.getBooleanArray(key);
                if (booleanArray != null) {
                    return booleanArray;
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
            case 1:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!com.gamericefishpro.space.u6.f.n(key, source) || com.gamericefishpro.space.u6.f.G(key, source)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                float[] floatArray = source.getFloatArray(key);
                if (floatArray != null) {
                    return floatArray;
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!com.gamericefishpro.space.u6.f.n(key, source) || com.gamericefishpro.space.u6.f.G(key, source)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                int[] intArray = source.getIntArray(key);
                if (intArray != null) {
                    return intArray;
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
            case 3:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!com.gamericefishpro.space.u6.f.n(key, source) || com.gamericefishpro.space.u6.f.G(key, source)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                long[] longArray = source.getLongArray(key);
                if (longArray != null) {
                    return longArray;
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
            default:
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (!com.gamericefishpro.space.u6.f.n(key, source) || com.gamericefishpro.space.u6.f.G(key, source)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(key, "key");
                String[] stringArray = source.getStringArray(key);
                if (stringArray != null) {
                    return stringArray;
                }
                com.gamericefishpro.space.wa.b.K(key);
                throw null;
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final String b() {
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object c(Object obj, String value) {
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean[] zArr = (boolean[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (zArr == null) {
                    return j(value);
                }
                boolean[] elements = j(value);
                Intrinsics.checkNotNullParameter(zArr, "<this>");
                Intrinsics.checkNotNullParameter(elements, "elements");
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(elements, 0, zArrCopyOf, length, 1);
                Intrinsics.b(zArrCopyOf);
                return zArrCopyOf;
            case 1:
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (fArr == null) {
                    return g(value);
                }
                float[] elements2 = g(value);
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                Intrinsics.checkNotNullParameter(elements2, "elements");
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(elements2, 0, fArrCopyOf, length2, 1);
                Intrinsics.b(fArrCopyOf);
                return fArrCopyOf;
            case 2:
                int[] iArr = (int[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (iArr == null) {
                    return h(value);
                }
                int[] elements3 = h(value);
                Intrinsics.checkNotNullParameter(iArr, "<this>");
                Intrinsics.checkNotNullParameter(elements3, "elements");
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(elements3, 0, iArrCopyOf, length3, 1);
                Intrinsics.b(iArrCopyOf);
                return iArrCopyOf;
            case 3:
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (jArr == null) {
                    return i(value);
                }
                long[] elements4 = i(value);
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                Intrinsics.checkNotNullParameter(elements4, "elements");
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(elements4, 0, jArrCopyOf, length4, 1);
                Intrinsics.b(jArrCopyOf);
                return jArrCopyOf;
            default:
                String[] strArr = (String[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(value, "value");
                if (strArr == null) {
                    return new String[]{value};
                }
                String[] elements5 = {value};
                Intrinsics.checkNotNullParameter(strArr, "<this>");
                Intrinsics.checkNotNullParameter(elements5, "elements");
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(elements5, 0, objArrCopyOf, length5, 1);
                Intrinsics.b(objArrCopyOf);
                return (String[]) objArrCopyOf;
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final Object d(String value) {
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return j(value);
            case 1:
                return g(value);
            case 2:
                return h(value);
            case 3:
                return i(value);
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                return new String[]{value};
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final void e(Bundle source, String key, Object obj) {
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean[] value = (boolean[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value == null) {
                    com.gamericefishpro.space.z5.f.a(key, source);
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value, "value");
                    source.putBooleanArray(key, value);
                }
                break;
            case 1:
                float[] value2 = (float[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value2 == null) {
                    com.gamericefishpro.space.z5.f.a(key, source);
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    source.putFloatArray(key, value2);
                }
                break;
            case 2:
                int[] value3 = (int[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value3 == null) {
                    com.gamericefishpro.space.z5.f.a(key, source);
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value3, "value");
                    source.putIntArray(key, value3);
                }
                break;
            case 3:
                long[] value4 = (long[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value4 == null) {
                    com.gamericefishpro.space.z5.f.a(key, source);
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value4, "value");
                    source.putLongArray(key, value4);
                }
                break;
            default:
                String[] value5 = (String[]) obj;
                Intrinsics.checkNotNullParameter(source, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(source, "source");
                if (value5 == null) {
                    com.gamericefishpro.space.z5.f.a(key, source);
                } else {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value5, "value");
                    source.putStringArray(key, value5);
                }
                break;
        }
    }

    @Override // com.gamericefishpro.space.f5.n0
    public final boolean f(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.k) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    Intrinsics.checkNotNullParameter(zArr, "<this>");
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i = 0; i < length; i++) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    Intrinsics.checkNotNullParameter(zArr2, "<this>");
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        boolArr2[i2] = Boolean.valueOf(zArr2[i2]);
                    }
                }
                return com.gamericefishpro.space.ph.t.a(boolArr, boolArr2);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    Intrinsics.checkNotNullParameter(fArr2, "<this>");
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    Intrinsics.checkNotNullParameter(fArr3, "<this>");
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i4 = 0; i4 < length4; i4++) {
                        fArr4[i4] = Float.valueOf(fArr3[i4]);
                    }
                }
                return com.gamericefishpro.space.ph.t.a(fArr, fArr4);
            case 2:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i5 = 0; i5 < length5; i5++) {
                        numArr[i5] = Integer.valueOf(iArr[i5]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    Intrinsics.checkNotNullParameter(iArr2, "<this>");
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i6 = 0; i6 < length6; i6++) {
                        numArr2[i6] = Integer.valueOf(iArr2[i6]);
                    }
                }
                return com.gamericefishpro.space.ph.t.a(numArr, numArr2);
            case 3:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    Intrinsics.checkNotNullParameter(jArr, "<this>");
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i7 = 0; i7 < length7; i7++) {
                        lArr[i7] = Long.valueOf(jArr[i7]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    Intrinsics.checkNotNullParameter(jArr2, "<this>");
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i8 = 0; i8 < length8; i8++) {
                        lArr2[i8] = Long.valueOf(jArr2[i8]);
                    }
                }
                return com.gamericefishpro.space.ph.t.a(lArr, lArr2);
            default:
                return com.gamericefishpro.space.ph.t.a((String[]) obj, (String[]) obj2);
        }
    }
}
