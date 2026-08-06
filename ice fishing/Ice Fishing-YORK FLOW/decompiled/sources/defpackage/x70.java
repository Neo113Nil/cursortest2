package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x70 implements defpackage.mu1 {
    public final defpackage.ku1[] ZpBGe2uQfcn8;

    public x70(defpackage.ku1... ku1VarArr) {
        this.ZpBGe2uQfcn8 = ku1VarArr;
    }

    @Override // defpackage.mu1
    public final defpackage.iu1 giKS3J6vZuNy(java.lang.Class cls, defpackage.dn0 dn0Var) {
        defpackage.iu1 iu1Var;
        defpackage.ku1 ku1Var;
        defpackage.y10 y10Var;
        defpackage.ne ZpBGe2uQfcn8 = defpackage.b41.ZpBGe2uQfcn8(cls);
        defpackage.ku1[] ku1VarArr = this.ZpBGe2uQfcn8;
        defpackage.ku1[] ku1VarArr2 = (defpackage.ku1[]) java.util.Arrays.copyOf(ku1VarArr, ku1VarArr.length);
        int length = ku1VarArr2.length;
        int i = 0;
        while (true) {
            iu1Var = null;
            if (i >= length) {
                ku1Var = null;
                break;
            }
            ku1Var = ku1VarArr2[i];
            if (ku1Var.ZpBGe2uQfcn8.equals(ZpBGe2uQfcn8)) {
                break;
            }
            i++;
        }
        if (ku1Var != null && (y10Var = ku1Var.giKS3J6vZuNy) != null) {
            iu1Var = (defpackage.iu1) y10Var.P05cfTpS5W5L(dn0Var);
        }
        if (iu1Var != null) {
            return iu1Var;
        }
        throw new java.lang.IllegalArgumentException(("No initializer set for given class " + ZpBGe2uQfcn8.giKS3J6vZuNy()).toString());
    }
}
