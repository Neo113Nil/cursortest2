package defpackage;

import android.util.SparseIntArray;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class ryl0 extends nlu {
    public final SparseIntArray b;

    public ryl0(long j) {
        super(j, new v820());
        this.b = new SparseIntArray();
    }

    @Override // defpackage.nlu
    public final boolean b(pyl0 pyl0Var, int i) {
        while (!pyl0Var.d()) {
            int c = pyl0Var.c();
            long e = pyl0Var.e();
            int count = pyl0Var.getCount();
            if (c + 1 != e) {
                return false;
            }
            SparseIntArray sparseIntArray = this.b;
            int i2 = sparseIntArray.get(c);
            if (i != 0) {
                count = -count;
            }
            sparseIntArray.put(c, i2 + count);
            pyl0Var.next();
        }
        return true;
    }

    @Override // defpackage.nlu
    public final int c() {
        SparseIntArray sparseIntArray = this.b;
        int i = 0;
        Iterator it = y6i0.n(0, sparseIntArray.size()).iterator();
        while (it.hasNext()) {
            i += sparseIntArray.valueAt(((t5w) it).nextInt());
        }
        return i;
    }

    @Override // defpackage.nlu
    public final pyl0 e() {
        ysl yslVar = new ysl();
        yslVar.b = this.b;
        yslVar.f();
        return yslVar;
    }

    public ryl0() {
        this(0L);
    }
}
