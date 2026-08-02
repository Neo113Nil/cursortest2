package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class csn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsn b;

    public /* synthetic */ csn(dsn dsnVar, int i) {
        this.a = i;
        this.b = dsnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SparseArray sparseArray = this.b.h;
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    ((gsn) sparseArray.valueAt(i)).getClass();
                    gsn.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                dsn dsnVar = this.b;
                jsn jsnVar = dsnVar.i;
                if (jsnVar.n == dsnVar) {
                    jsnVar.k();
                    break;
                }
                break;
        }
    }
}
