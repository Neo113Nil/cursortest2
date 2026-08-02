package defpackage;

import java.util.ArrayList;

/* loaded from: classes11.dex */
public class xr90 {
    public static boolean a(ur90[] ur90VarArr, ur90[] ur90VarArr2) {
        if (ur90VarArr == null || ur90VarArr2 == null || ur90VarArr.length != ur90VarArr2.length) {
            return false;
        }
        for (int i = 0; i < ur90VarArr.length; i++) {
            ur90 ur90Var = ur90VarArr[i];
            char c = ur90Var.a;
            ur90 ur90Var2 = ur90VarArr2[i];
            if (c != ur90Var2.a || ur90Var.b.length != ur90Var2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i) {
        if (i < 0) {
            w511.q();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[Catch: NumberFormatException -> 0x00b4, LOOP:3: B:30:0x0071->B:41:0x00a1, LOOP_END, TryCatch #1 {NumberFormatException -> 0x00b4, blocks: (B:31:0x0071, B:33:0x0077, B:37:0x0083, B:41:0x00a1, B:45:0x00a6, B:50:0x00bc, B:67:0x00bf), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6 A[Catch: NumberFormatException -> 0x00b4, TryCatch #1 {NumberFormatException -> 0x00b4, blocks: (B:31:0x0071, B:33:0x0077, B:37:0x0083, B:41:0x00a1, B:45:0x00a6, B:50:0x00bc, B:67:0x00bf), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc A[Catch: NumberFormatException -> 0x00b4, TryCatch #1 {NumberFormatException -> 0x00b4, blocks: (B:31:0x0071, B:33:0x0077, B:37:0x0083, B:41:0x00a1, B:45:0x00a6, B:50:0x00bc, B:67:0x00bf), top: B:30:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ur90[] c(String str) {
        String trim;
        ur90[] ur90VarArr;
        float[] fArr;
        ur90[] ur90VarArr2;
        ur90[] ur90VarArr3 = null;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i2++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i, i2).trim();
                    if (trim.length() <= 0) {
                        if (trim.charAt(0) == 'z' || trim.charAt(0) == 'Z') {
                            ur90VarArr = ur90VarArr3;
                            fArr = new float[0];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i3 = 0;
                                int i4 = 1;
                                while (i4 < length) {
                                    ur90VarArr2 = ur90VarArr3;
                                    boolean z = false;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    boolean z4 = false;
                                    for (int i5 = i4; i5 < trim.length(); i5++) {
                                        try {
                                            char charAt2 = trim.charAt(i5);
                                            if (charAt2 != ' ') {
                                                if (charAt2 != 'E' && charAt2 != 'e') {
                                                    switch (charAt2) {
                                                        case ',':
                                                            break;
                                                        case '-':
                                                            if (i5 != i4 && !z) {
                                                                z = false;
                                                                z3 = true;
                                                                z4 = true;
                                                                break;
                                                            }
                                                            z = false;
                                                            break;
                                                        case '.':
                                                            if (!z2) {
                                                                z = false;
                                                                z2 = true;
                                                                break;
                                                            }
                                                            z = false;
                                                            z3 = true;
                                                            z4 = true;
                                                            break;
                                                        default:
                                                            z = false;
                                                            break;
                                                    }
                                                } else {
                                                    z = true;
                                                }
                                                if (!z3) {
                                                    if (i4 < i5) {
                                                        fArr2[i3] = Float.parseFloat(trim.substring(i4, i5));
                                                        i3++;
                                                    }
                                                    i4 = !z4 ? i5 : i5 + 1;
                                                    ur90VarArr3 = ur90VarArr2;
                                                }
                                            }
                                            z = false;
                                            z3 = true;
                                            if (!z3) {
                                            }
                                        } catch (NumberFormatException e) {
                                            e = e;
                                            ny61.n(oyr.p("error in parsing \"", trim, "\""), e);
                                            return ur90VarArr2;
                                        }
                                    }
                                    if (i4 < i5) {
                                    }
                                    if (!z4) {
                                    }
                                    ur90VarArr3 = ur90VarArr2;
                                }
                                ur90VarArr = ur90VarArr3;
                                fArr = b(fArr2, i3);
                            } catch (NumberFormatException e2) {
                                e = e2;
                                ur90VarArr2 = ur90VarArr3;
                            }
                        }
                        char charAt3 = trim.charAt(0);
                        ur90 ur90Var = new ur90();
                        ur90Var.a = charAt3;
                        ur90Var.b = fArr;
                        arrayList.add(ur90Var);
                    } else {
                        ur90VarArr = ur90VarArr3;
                    }
                    i = i2;
                    i2++;
                    ur90VarArr3 = ur90VarArr;
                }
                i2++;
            }
            trim = str.substring(i, i2).trim();
            if (trim.length() <= 0) {
            }
            i = i2;
            i2++;
            ur90VarArr3 = ur90VarArr;
        }
        if (i2 - i == 1 && i < str.length()) {
            char charAt4 = str.charAt(i);
            ur90 ur90Var2 = new ur90();
            ur90Var2.a = charAt4;
            ur90Var2.b = new float[0];
            arrayList.add(ur90Var2);
        }
        return (ur90[]) arrayList.toArray(new ur90[arrayList.size()]);
    }
}
