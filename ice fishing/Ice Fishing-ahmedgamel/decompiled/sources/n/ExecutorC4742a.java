package n;

import java.util.concurrent.Executor;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4742a implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39444n;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f39444n) {
            case 0:
                C4743b.T().f39446h.i.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
