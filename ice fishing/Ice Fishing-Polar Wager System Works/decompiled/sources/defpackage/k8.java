package defpackage;

/* loaded from: classes.dex */
public final class k8 extends defpackage.eo0 {
    public final /* synthetic */ int adDC3e2L;

    public static int[] AARZUJiTa(java.lang.String str) {
        return new int[]{((java.lang.Number) defpackage.eo0.IHQe1A4L2xu.F7NU4MC0GW(str)).intValue()};
    }

    public static long[] EXtogiMhuM(java.lang.String str) {
        return new long[]{((java.lang.Number) defpackage.eo0.oh6vYeIP.F7NU4MC0GW(str)).longValue()};
    }

    public static boolean[] riuEU0zW4(java.lang.String str) {
        return new boolean[]{((java.lang.Boolean) defpackage.eo0.r1MBDhnF.F7NU4MC0GW(str)).booleanValue()};
    }

    @Override // defpackage.eo0
    public final java.lang.Object F7NU4MC0GW(java.lang.String str) {
        switch (this.adDC3e2L) {
            case 0:
                return riuEU0zW4(str);
            case 1:
                return new float[]{java.lang.Float.parseFloat(str)};
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return AARZUJiTa(str);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return EXtogiMhuM(str);
            default:
                return new java.lang.String[]{str};
        }
    }

    @Override // defpackage.eo0
    public final java.lang.Object IHQe1A4L2xu(android.os.Bundle bundle, java.lang.String str) {
        switch (this.adDC3e2L) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.s70.p4kuH6PDtgom(bundle, str)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                defpackage.c80.abhbClRa(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.s70.p4kuH6PDtgom(bundle, str)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                defpackage.c80.abhbClRa(str);
                throw null;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.s70.p4kuH6PDtgom(bundle, str)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                defpackage.c80.abhbClRa(str);
                throw null;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.s70.p4kuH6PDtgom(bundle, str)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                defpackage.c80.abhbClRa(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.s70.p4kuH6PDtgom(bundle, str)) {
                    return null;
                }
                java.lang.String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                defpackage.c80.abhbClRa(str);
                throw null;
        }
    }

    @Override // defpackage.eo0
    public final void adDC3e2L(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        switch (this.adDC3e2L) {
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
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putIntArray(str, iArr);
                    break;
                }
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
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
                java.lang.String[] strArr = (java.lang.String[]) obj;
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

    @Override // defpackage.eo0
    public final java.lang.String oh6vYeIP() {
        switch (this.adDC3e2L) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return "integer[]";
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // defpackage.eo0
    public final java.lang.Object r1MBDhnF(java.lang.Object obj, java.lang.String str) {
        switch (this.adDC3e2L) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return riuEU0zW4(str);
                }
                boolean[] riuEU0zW4 = riuEU0zW4(str);
                int length = zArr.length;
                boolean[] copyOf = java.util.Arrays.copyOf(zArr, length + 1);
                java.lang.System.arraycopy(riuEU0zW4, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{java.lang.Float.parseFloat(str)};
                }
                float[] fArr2 = {java.lang.Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] copyOf2 = java.util.Arrays.copyOf(fArr, length2 + 1);
                java.lang.System.arraycopy(fArr2, 0, copyOf2, length2, 1);
                return copyOf2;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return AARZUJiTa(str);
                }
                int[] AARZUJiTa = AARZUJiTa(str);
                int length3 = iArr.length;
                int[] copyOf3 = java.util.Arrays.copyOf(iArr, length3 + 1);
                java.lang.System.arraycopy(AARZUJiTa, 0, copyOf3, length3, 1);
                return copyOf3;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return EXtogiMhuM(str);
                }
                long[] EXtogiMhuM = EXtogiMhuM(str);
                int length4 = jArr.length;
                long[] copyOf4 = java.util.Arrays.copyOf(jArr, length4 + 1);
                java.lang.System.arraycopy(EXtogiMhuM, 0, copyOf4, length4, 1);
                return copyOf4;
            default:
                java.lang.String[] strArr = (java.lang.String[]) obj;
                if (strArr == null) {
                    return new java.lang.String[]{str};
                }
                java.lang.String[] strArr2 = {str};
                int length5 = strArr.length;
                java.lang.Object[] copyOf5 = java.util.Arrays.copyOf(strArr, length5 + 1);
                java.lang.System.arraycopy(strArr2, 0, copyOf5, length5, 1);
                return (java.lang.String[]) copyOf5;
        }
    }

    @Override // defpackage.eo0
    public final boolean xiZrDbcSW0(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean[] boolArr;
        java.lang.Float[] fArr;
        java.lang.Integer[] numArr;
        java.lang.Long[] lArr;
        java.lang.Object[] objArr = null;
        int i = 0;
        switch (this.adDC3e2L) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (zArr != null) {
                    boolArr = new java.lang.Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        boolArr[i2] = java.lang.Boolean.valueOf(zArr[i2]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    objArr = new java.lang.Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    while (i < length2) {
                        objArr[i] = java.lang.Boolean.valueOf(zArr2[i]);
                        i++;
                    }
                }
                return defpackage.t6.QPwENk36pDC(boolArr, objArr);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                if (fArr2 != null) {
                    fArr = new java.lang.Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i3 = 0; i3 < length3; i3++) {
                        fArr[i3] = java.lang.Float.valueOf(fArr2[i3]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    objArr = new java.lang.Float[fArr3.length];
                    int length4 = fArr3.length;
                    while (i < length4) {
                        objArr[i] = java.lang.Float.valueOf(fArr3[i]);
                        i++;
                    }
                }
                return defpackage.t6.QPwENk36pDC(fArr, objArr);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (iArr != null) {
                    numArr = new java.lang.Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i4 = 0; i4 < length5; i4++) {
                        numArr[i4] = java.lang.Integer.valueOf(iArr[i4]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    objArr = new java.lang.Integer[iArr2.length];
                    int length6 = iArr2.length;
                    while (i < length6) {
                        objArr[i] = java.lang.Integer.valueOf(iArr2[i]);
                        i++;
                    }
                }
                return defpackage.t6.QPwENk36pDC(numArr, objArr);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (jArr != null) {
                    lArr = new java.lang.Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i5 = 0; i5 < length7; i5++) {
                        lArr[i5] = java.lang.Long.valueOf(jArr[i5]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    objArr = new java.lang.Long[jArr2.length];
                    int length8 = jArr2.length;
                    while (i < length8) {
                        objArr[i] = java.lang.Long.valueOf(jArr2[i]);
                        i++;
                    }
                }
                return defpackage.t6.QPwENk36pDC(lArr, objArr);
            default:
                return defpackage.t6.QPwENk36pDC((java.lang.String[]) obj, (java.lang.String[]) obj2);
        }
    }
}
