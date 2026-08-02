package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class fxd extends aa6 {
    public aa6[] u0 = new aa6[4];
    public int v0 = 0;

    public final void S(aa6 aa6Var) {
        if (aa6Var == this || aa6Var == null) {
            return;
        }
        int i = this.v0 + 1;
        aa6[] aa6VarArr = this.u0;
        if (i > aa6VarArr.length) {
            this.u0 = (aa6[]) Arrays.copyOf(aa6VarArr, aa6VarArr.length * 2);
        }
        aa6[] aa6VarArr2 = this.u0;
        int i2 = this.v0;
        aa6VarArr2[i2] = aa6Var;
        this.v0 = i2 + 1;
    }

    public final void T(int i, mmv mmvVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.v0; i2++) {
            aa6 aa6Var = this.u0[i2];
            ArrayList arrayList2 = mmvVar.a;
            if (!arrayList2.contains(aa6Var)) {
                arrayList2.add(aa6Var);
            }
        }
        for (int i3 = 0; i3 < this.v0; i3++) {
            xv7.x(this.u0[i3], i, arrayList, mmvVar);
        }
    }

    @Override // defpackage.aa6
    public void g(aa6 aa6Var, HashMap hashMap) {
        super.g(aa6Var, hashMap);
        fxd fxdVar = (fxd) aa6Var;
        this.v0 = 0;
        int i = fxdVar.v0;
        for (int i2 = 0; i2 < i; i2++) {
            S((aa6) hashMap.get(fxdVar.u0[i2]));
        }
    }

    public void U() {
    }
}
