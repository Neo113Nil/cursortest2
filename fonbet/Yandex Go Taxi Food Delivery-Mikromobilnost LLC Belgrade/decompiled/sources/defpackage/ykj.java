package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class ykj implements Executor {
    public static final ykj b = new ykj(0);
    public static final ykj c = new ykj(1);
    public static final /* synthetic */ ykj w = new ykj(2);
    public static final /* synthetic */ ykj x = new ykj(4);
    public final /* synthetic */ int a;

    public /* synthetic */ ykj(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
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
            case 4:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
