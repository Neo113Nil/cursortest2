package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class dij extends aij {
    public final ArrayList a;
    public final xh2 b;
    public final int c;

    public dij(ArrayList arrayList, xh2 xh2Var, int i) {
        this.a = arrayList;
        this.b = xh2Var;
        this.c = i;
    }

    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        hjj[] hjjVarArr = new hjj[8];
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            hjj hjjVar = (hjj) it.next();
            if (i == hjjVarArr.length) {
                hjj[] hjjVarArr2 = new hjj[(i >> 2) + i];
                System.arraycopy(hjjVarArr, 0, hjjVarArr2, 0, i);
                hjjVarArr = hjjVarArr2;
            }
            hjjVarArr[i] = hjjVar;
            i++;
        }
        if (i == 0) {
            wjjVar.b(t4b.a);
            wjjVar.onComplete();
            return;
        }
        cij cijVar = new cij(wjjVar, this.b, i, this.c);
        bij[] bijVarArr = cijVar.c;
        int length = bijVarArr.length;
        cijVar.a.b(cijVar);
        for (int i2 = 0; i2 < length && !cijVar.g && !cijVar.f; i2++) {
            hjjVarArr[i2].a(bijVarArr[i2]);
        }
    }
}
