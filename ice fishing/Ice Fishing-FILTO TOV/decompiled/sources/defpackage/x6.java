package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class x6 extends ui0 {
    public final /* synthetic */ int xqGvceK5x;

    public static int[] AvO7iQsrTN(String str) {
        return new int[]{((Number) ui0.GWasM1elztuh.xqGvceK5x(str)).intValue()};
    }

    public static long[] encWxUiV2(String str) {
        return new long[]{((Number) ui0.Yi7zF1RB1.xqGvceK5x(str)).longValue()};
    }

    public static boolean[] mOu10nynGul(String str) {
        return new boolean[]{((Boolean) ui0.X1lG3V04pd.xqGvceK5x(str)).booleanValue()};
    }

    @Override // defpackage.ui0
    public final boolean EljAMC1QTz(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        Object[] objArr = null;
        int i = 0;
        switch (this.xqGvceK5x) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        boolArr[i2] = Boolean.valueOf(zArr[i2]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    objArr = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    while (i < length2) {
                        objArr[i] = Boolean.valueOf(zArr2[i]);
                        i++;
                    }
                }
                return d5.MItybXapHX(boolArr, objArr);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    objArr = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    while (i < length4) {
                        objArr[i] = Float.valueOf(fArr3[i]);
                        i++;
                    }
                }
                return d5.MItybXapHX(fArr, objArr);
            case 2:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i4 = 0; i4 < length5; i4++) {
                        numArr[i4] = Integer.valueOf(iArr[i4]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    objArr = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    while (i < length6) {
                        objArr[i] = Integer.valueOf(iArr2[i]);
                        i++;
                    }
                }
                return d5.MItybXapHX(numArr, objArr);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i5 = 0; i5 < length7; i5++) {
                        lArr[i5] = Long.valueOf(jArr[i5]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    objArr = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    while (i < length8) {
                        objArr[i] = Long.valueOf(jArr2[i]);
                        i++;
                    }
                }
                return d5.MItybXapHX(lArr, objArr);
            default:
                return d5.MItybXapHX((String[]) obj, (String[]) obj2);
        }
    }

    @Override // defpackage.ui0
    public final Object GWasM1elztuh(Bundle bundle, String str) {
        switch (this.xqGvceK5x) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || o50.M3K9sHhK(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                z50.cilMamHF(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || o50.M3K9sHhK(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                z50.cilMamHF(str);
                throw null;
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || o50.M3K9sHhK(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                z50.cilMamHF(str);
                throw null;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                bundle.getClass();
                if (!bundle.containsKey(str) || o50.M3K9sHhK(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                z50.cilMamHF(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || o50.M3K9sHhK(bundle, str)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                z50.cilMamHF(str);
                throw null;
        }
    }

    @Override // defpackage.ui0
    public final void OOA6hdeuvCS(Bundle bundle, String str, Object obj) {
        switch (this.xqGvceK5x) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putBooleanArray(str, zArr);
                    break;
                }
            case 1:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putFloatArray(str, fArr);
                    break;
                }
            case 2:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putIntArray(str, iArr);
                    break;
                }
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putLongArray(str, jArr);
                    break;
                }
            default:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putStringArray(str, strArr);
                    break;
                }
        }
    }

    @Override // defpackage.ui0
    public final Object X1lG3V04pd(Object obj, String str) {
        switch (this.xqGvceK5x) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return mOu10nynGul(str);
                }
                boolean[] mOu10nynGul = mOu10nynGul(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(mOu10nynGul, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, copyOf2, length2, 1);
                return copyOf2;
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return AvO7iQsrTN(str);
                }
                int[] AvO7iQsrTN = AvO7iQsrTN(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(AvO7iQsrTN, 0, copyOf3, length3, 1);
                return copyOf3;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return encWxUiV2(str);
                }
                long[] encWxUiV2 = encWxUiV2(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(encWxUiV2, 0, copyOf4, length4, 1);
                return copyOf4;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, copyOf5, length5, 1);
                return (String[]) copyOf5;
        }
    }

    @Override // defpackage.ui0
    public final String Yi7zF1RB1() {
        switch (this.xqGvceK5x) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // defpackage.ui0
    public final Object xqGvceK5x(String str) {
        switch (this.xqGvceK5x) {
            case 0:
                return mOu10nynGul(str);
            case 1:
                return new float[]{Float.parseFloat(str)};
            case 2:
                return AvO7iQsrTN(str);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return encWxUiV2(str);
            default:
                return new String[]{str};
        }
    }
}
