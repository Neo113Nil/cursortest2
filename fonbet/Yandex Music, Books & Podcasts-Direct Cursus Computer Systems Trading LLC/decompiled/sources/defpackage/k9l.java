package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import ru.yandex.video.m3.player.impl.tracking.data.PlayerState;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;

/* loaded from: classes6.dex */
public final /* synthetic */ class k9l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq0 b;

    public /* synthetic */ k9l(nq0 nq0Var, int i) {
        this.a = i;
        this.b = nq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nq0 nq0Var = this.b;
                nq0Var.e = true;
                if (!nq0Var.d) {
                    nq0Var.e();
                    break;
                }
                break;
            case 1:
                nq0 nq0Var2 = this.b;
                if (nq0Var2.d && !nq0Var2.c) {
                    nq0Var2.c = true;
                    nq0Var2.d();
                }
                nq0Var2.d = false;
                nq0Var2.c().b((ScheduledExecutorService) nq0Var2.f);
                break;
            case 2:
                this.b.d();
                break;
            case 3:
                this.b.e();
                break;
            default:
                nq0 nq0Var3 = this.b;
                if (!nq0Var3.e) {
                    o9l c = nq0Var3.c();
                    l9l l9lVar = PlayerAliveState.Companion;
                    PlayerState a = ((z2t) nq0Var3.b).b.a();
                    l9lVar.getClass();
                    c.a(l9l.a(a));
                    break;
                }
                break;
        }
    }
}
