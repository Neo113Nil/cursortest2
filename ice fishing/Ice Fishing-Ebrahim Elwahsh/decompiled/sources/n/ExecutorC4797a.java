package n;

import java.util.concurrent.Executor;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4797a implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39611n;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f39611n) {
            case 0:
                C4798b.J().f39614n.f39617u.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
