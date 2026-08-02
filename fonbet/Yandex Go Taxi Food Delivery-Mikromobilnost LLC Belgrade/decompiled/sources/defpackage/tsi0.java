package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public final class tsi0 implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ qir b;

    public tsi0(ExecutorService executorService, qir qirVar) {
        this.a = executorService;
        this.b = qirVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
