package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class f48 implements Executor {
    public static final f48 b = new f48(0);
    public static final /* synthetic */ f48 c = new f48(1);
    public static final /* synthetic */ f48 d = new f48(2);
    public final /* synthetic */ int a;

    public /* synthetic */ f48(int i) {
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
                xut.f().post(runnable);
                break;
            case 5:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
