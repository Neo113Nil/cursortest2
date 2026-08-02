package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class tb30 extends ay4 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public tb30(int i, long j) {
        super(i, 3);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final tb30 j(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            tb30 tb30Var = (tb30) arrayList.get(i2);
            if (tb30Var.b == i) {
                return tb30Var;
            }
        }
        return null;
    }

    public final ub30 k(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ub30 ub30Var = (ub30) arrayList.get(i2);
            if (ub30Var.b == i) {
                return ub30Var;
            }
        }
        return null;
    }

    @Override // defpackage.ay4
    public final String toString() {
        return ay4.d(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
