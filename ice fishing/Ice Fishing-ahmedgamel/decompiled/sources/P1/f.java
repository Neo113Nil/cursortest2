package P1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2359n;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2359n) {
            case 0:
                p.f().post(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
