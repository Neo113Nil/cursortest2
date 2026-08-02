package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class j4w {
    public final qhp a;
    public final a b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final lno d = new lno(1, this);

    public j4w(ExecutorService executorService) {
        qhp qhpVar = new qhp(executorService, 0);
        this.a = qhpVar;
        this.b = u2x.E(qhpVar);
    }
}
