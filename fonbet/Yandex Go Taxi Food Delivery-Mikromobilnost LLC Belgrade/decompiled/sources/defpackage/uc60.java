package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.network.api.annotation.ObserveStrategy;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;

/* loaded from: classes10.dex */
public final class uc60 implements tc60, hhf {
    public final spt a;
    public final AtomicReference b = new AtomicReference();
    public final r0 c = bvf0.c(z060.a);

    public uc60(c cVar, spt sptVar) {
        this.a = sptVar;
        cVar.a(this);
    }

    @Override // defpackage.hhf
    public final void a(Screen screen) {
        this.b.set(screen);
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.m(null, z060.a);
    }

    @Override // defpackage.tc60
    public final void b(cma1 cma1Var, ObserveStrategy observeStrategy) {
        if (((Screen) this.b.get()) == null) {
            return;
        }
        boolean z = cma1Var instanceof s060;
        r0 r0Var = this.c;
        if (z) {
            y060 y060Var = new y060(this.a.a(observeStrategy).b(), new v060(((s060) cma1Var).g, NotificatorReporter$MessageType.NETWORK_ERROR));
            r0Var.getClass();
            r0Var.m(null, y060Var);
        } else if (!cma1Var.equals(t060.g)) {
            w511.b();
        } else {
            r0Var.getClass();
            r0Var.m(null, z060.a);
        }
    }
}
