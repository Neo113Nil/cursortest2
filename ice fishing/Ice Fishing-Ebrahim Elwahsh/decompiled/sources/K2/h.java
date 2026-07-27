package K2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ h f1582u = new h(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ h f1583v = new h(1);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1584n;

    public /* synthetic */ h(int i) {
        this.f1584n = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1584n) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
