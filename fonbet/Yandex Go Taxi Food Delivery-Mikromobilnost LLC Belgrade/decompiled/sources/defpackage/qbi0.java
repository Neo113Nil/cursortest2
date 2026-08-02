package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;

/* loaded from: classes15.dex */
public final class qbi0 {
    public final String a;
    public final Handler b = new Handler();
    public final LongSparseArray c = new LongSparseArray();
    public Runnable d;
    public x08 e;
    public final /* synthetic */ rbi0 f;

    public qbi0(rbi0 rbi0Var, String str) {
        this.f = rbi0Var;
        this.a = str;
    }

    public final void a() {
        z83.g(null, this.b.getLooper(), Looper.myLooper());
        z83.d(this.d, null);
        z83.f(this.e, null);
        this.d = null;
        rbi0 rbi0Var = this.f;
        this.e = rbi0Var.a.f(new j0b(this, rbi0Var));
    }
}
