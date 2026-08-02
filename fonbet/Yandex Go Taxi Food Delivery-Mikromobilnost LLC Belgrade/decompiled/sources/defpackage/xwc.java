package defpackage;

import android.os.Looper;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class xwc {
    public final Looper a;
    public final bwu b;
    public final qf4 c;
    public final x22 d;

    public xwc(Looper looper, bwu bwuVar, qf4 qf4Var, x22 x22Var) {
        this.a = looper;
        this.b = bwuVar;
        this.c = qf4Var;
        this.d = x22Var;
    }

    public final vwc a(w920 w920Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.a;
        z83.g(null, looper, myLooper);
        String uuid = UUID.randomUUID().toString();
        z83.g(null, looper, Looper.myLooper());
        hfy hfyVar = new hfy();
        z83.g(null, looper, Looper.myLooper());
        return new vwc(this, uuid, w920Var, hfyVar);
    }
}
