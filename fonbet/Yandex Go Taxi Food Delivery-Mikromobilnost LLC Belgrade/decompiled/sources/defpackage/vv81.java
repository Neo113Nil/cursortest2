package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.xs2;

/* loaded from: classes7.dex */
public final class vv81 implements Runnable {
    public static final CopyOnWriteArrayList y = new CopyOnWriteArrayList();
    public final n291 a;
    public final ike b;
    public final m2v c;
    public final e971 w;
    public final Context x;

    public vv81(Context context, n291 n291Var, ike ikeVar) {
        m2v e = i4a1.e(n291Var);
        e971 e971Var = new e971();
        this.a = n291Var;
        this.b = ikeVar;
        this.c = e;
        this.w = e971Var;
        this.x = context.getApplicationContext();
    }

    @Override // java.lang.Runnable
    public final void run() {
        fh71 fh71Var = new fh71(this.x, this.a, this.b, this.w, null, null, 4194288);
        y.add(fh71Var);
        tje.N(this.b, null, null, new xs2(fh71Var, this, null), 3);
    }
}
