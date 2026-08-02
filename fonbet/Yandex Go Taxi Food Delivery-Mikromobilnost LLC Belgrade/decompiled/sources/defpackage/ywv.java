package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ywv implements hs31 {
    public final cs31[] a;

    public ywv(cs31... cs31VarArr) {
        this.a = cs31VarArr;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        cs31 cs31Var;
        tls tlsVar;
        g0c a = qoi0.a(cls);
        cs31[] cs31VarArr = this.a;
        cs31[] cs31VarArr2 = (cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length);
        int length = cs31VarArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cs31Var = null;
                break;
            }
            cs31Var = cs31VarArr2[i];
            if (jl40.l(cs31Var.a, a)) {
                break;
            }
            i++;
        }
        yr31 yr31Var = (cs31Var == null || (tlsVar = cs31Var.b) == null) ? null : (yr31) tlsVar.invoke(y8fVar);
        if (yr31Var != null) {
            return yr31Var;
        }
        vg10.r(a.c(), "No initializer set for given class ");
        return null;
    }
}
