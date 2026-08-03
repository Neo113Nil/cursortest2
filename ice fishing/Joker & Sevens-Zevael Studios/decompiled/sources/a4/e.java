package a4;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f235g;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f235g) {
            case 0:
                runnable.run();
                break;
            default:
                n.a.a0().f4973d.f4976e.execute(runnable);
                break;
        }
    }
}
