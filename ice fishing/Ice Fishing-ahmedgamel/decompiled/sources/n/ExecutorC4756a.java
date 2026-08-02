package n;

import java.util.concurrent.Executor;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC4756a implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39601n;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f39601n) {
            case 0:
                C4757b.z().f39604b.f39607c.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
