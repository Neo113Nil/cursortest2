package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* loaded from: classes15.dex */
public final class rj21 {
    public final Looper b;
    public final SparseArray a = new SparseArray();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final Handler c = new Handler(Looper.getMainLooper());

    public rj21(Looper looper) {
        this.b = looper;
    }

    public final void a(int i) {
        z83.g(null, this.b, Looper.myLooper());
        this.c.post(new xm2(this, i, 24));
    }

    public final qj21 b(pj21 pj21Var, int i) {
        tje.e();
        return new qj21(this, pj21Var, i);
    }
}
