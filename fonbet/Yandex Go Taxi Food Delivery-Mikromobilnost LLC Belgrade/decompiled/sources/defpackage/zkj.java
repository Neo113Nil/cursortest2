package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class zkj implements Executor {
    public static volatile zkj b;
    public static final zkj c = new zkj(1);
    public static final zkj w = new zkj(2);
    public static final /* synthetic */ zkj x = new zkj(3);
    public static final /* synthetic */ zkj y = new zkj(6);
    public static final /* synthetic */ zkj z = new zkj(7);
    public final /* synthetic */ int a;

    public /* synthetic */ zkj(int i) {
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
                runnable.run();
                break;
            case 4:
                pw21.j().post(runnable);
                break;
            case 5:
                runnable.run();
                break;
            case 6:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
