package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class t951 implements btx0 {
    public final dsq0 a;
    public final jse b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final dpl0 d = new dpl0(1, this);

    public t951(ExecutorService executorService) {
        dsq0 dsq0Var = new dsq0(executorService, 0);
        this.a = dsq0Var;
        this.b = ooc.o(dsq0Var);
    }
}
