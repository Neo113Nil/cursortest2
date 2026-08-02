package defpackage;

/* loaded from: classes11.dex */
public class yr90 {
    public static boolean a(vr90[] vr90VarArr, vr90[] vr90VarArr2) {
        if (vr90VarArr == null || vr90VarArr2 == null || vr90VarArr.length != vr90VarArr2.length) {
            return false;
        }
        for (int i = 0; i < vr90VarArr.length; i++) {
            vr90 vr90Var = vr90VarArr[i];
            char c = vr90Var.a;
            vr90 vr90Var2 = vr90VarArr2[i];
            if (c != vr90Var2.a || vr90Var.b.length != vr90Var2.b.length) {
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
}
