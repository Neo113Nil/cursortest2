package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lno implements Executor {
    public final /* synthetic */ int a;
    public final Object b;

    public lno() {
        this.a = 2;
        fsn fsnVar = new fsn(Looper.getMainLooper());
        Looper.getMainLooper();
        this.b = fsnVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Executor) this.b).execute(new hh(runnable, 1));
                break;
            case 1:
                ((j4w) this.b).c.post(runnable);
                break;
            default:
                ((fsn) this.b).post(runnable);
                break;
        }
    }

    public /* synthetic */ lno(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
