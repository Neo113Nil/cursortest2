package defpackage;

import android.util.SparseIntArray;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class wno extends wyd {
    public final SparseIntArray b;

    public wno(long j) {
        super(j, new m78());
        this.b = new SparseIntArray();
    }

    @Override // defpackage.wyd
    public final boolean b(uno unoVar, int i) {
        unoVar.getClass();
        while (!unoVar.u()) {
            int t = unoVar.t();
            long B = unoVar.B();
            int count = unoVar.getCount();
            if (t + 1 != B) {
                return false;
            }
            SparseIntArray sparseIntArray = this.b;
            int i2 = sparseIntArray.get(t);
            if (i != 0) {
                count = -count;
            }
            sparseIntArray.put(t, i2 + count);
            unoVar.next();
        }
        return true;
    }

    @Override // defpackage.wyd
    public final int c() {
        SparseIntArray sparseIntArray = this.b;
        int i = 0;
        Iterator it = yhn.m(0, sparseIntArray.size()).iterator();
        while (it.hasNext()) {
            i += sparseIntArray.valueAt(((rpe) it).nextInt());
        }
        return i;
    }

    @Override // defpackage.wyd
    public final uno e() {
        return new j4x(this.b);
    }
}
