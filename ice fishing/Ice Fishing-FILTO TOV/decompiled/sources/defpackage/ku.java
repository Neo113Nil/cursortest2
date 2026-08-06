package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ku {
    public static final Object[] X1lG3V04pd;
    public static final float[] GWasM1elztuh = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile y41 Yi7zF1RB1 = new y41();

    static {
        Object[] objArr = new Object[0];
        X1lG3V04pd = objArr;
        synchronized (objArr) {
            Yi7zF1RB1.xqGvceK5x(115, new lu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            Yi7zF1RB1.xqGvceK5x(130, new lu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            Yi7zF1RB1.xqGvceK5x(150, new lu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            Yi7zF1RB1.xqGvceK5x(180, new lu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            Yi7zF1RB1.xqGvceK5x(200, new lu(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((Yi7zF1RB1.X1lG3V04pd(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        v10.Yi7zF1RB1("You should only apply non-linear scaling to font scales > 1");
    }

    public static ju GWasM1elztuh(float f) {
        float X1lG3V04pd2;
        ju juVar;
        float[] fArr = GWasM1elztuh;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        ju juVar2 = (ju) Yi7zF1RB1.Yi7zF1RB1(i);
        if (juVar2 != null) {
            return juVar2;
        }
        y41 y41Var = Yi7zF1RB1;
        if (y41Var.OOA6hdeuvCS) {
            o30.encWxUiV2(y41Var);
        }
        int uFEq9NpZ = fb1.uFEq9NpZ(y41Var.EljAMC1QTz, y41Var.encWxUiV2, i);
        if (uFEq9NpZ >= 0) {
            return (ju) Yi7zF1RB1.EljAMC1QTz(uFEq9NpZ);
        }
        int i2 = -(uFEq9NpZ + 1);
        int i3 = i2 - 1;
        if (i2 >= Yi7zF1RB1.OOA6hdeuvCS()) {
            lu luVar = new lu(new float[]{1.0f}, new float[]{f});
            Yi7zF1RB1(f, luVar);
            return luVar;
        }
        if (i3 < 0) {
            juVar = new lu(fArr, fArr);
            X1lG3V04pd2 = 1.0f;
        } else {
            X1lG3V04pd2 = Yi7zF1RB1.X1lG3V04pd(i3) / 100.0f;
            juVar = (ju) Yi7zF1RB1.EljAMC1QTz(i3);
        }
        float X1lG3V04pd3 = Yi7zF1RB1.X1lG3V04pd(i2) / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, X1lG3V04pd2 == X1lG3V04pd3 ? 0.0f : (f - X1lG3V04pd2) / (X1lG3V04pd3 - X1lG3V04pd2))) * 1.0f) + 0.0f;
        ju juVar3 = (ju) Yi7zF1RB1.EljAMC1QTz(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float Yi7zF1RB12 = juVar.Yi7zF1RB1(f2);
            fArr2[i4] = ((juVar3.Yi7zF1RB1(f2) - Yi7zF1RB12) * max) + Yi7zF1RB12;
        }
        lu luVar2 = new lu(fArr, fArr2);
        Yi7zF1RB1(f, luVar2);
        return luVar2;
    }

    public static void Yi7zF1RB1(float f, lu luVar) {
        synchronized (X1lG3V04pd) {
            y41 clone = Yi7zF1RB1.clone();
            clone.xqGvceK5x((int) (f * 100.0f), luVar);
            Yi7zF1RB1 = clone;
        }
    }
}
