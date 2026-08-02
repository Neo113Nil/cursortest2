package defpackage;

import com.yandex.music.shared.fmradio.domain.commands.AwaitNetworkConnectedCommand;
import com.yandex.music.shared.generative.domain.commands.c;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class i84 implements p7q {
    public final /* synthetic */ j84 a;

    public i84(j84 j84Var) {
        this.a = j84Var;
    }

    @Override // defpackage.p7q
    public final Object m(ioc iocVar) {
        iocVar.getClass();
        k1l k1lVar = (k1l) this.a.b.getValue();
        a1q.a.getClass();
        k1lVar.b(new eyk(u75.h(PauseCommand.INSTANCE, AwaitNetworkConnectedCommand.INSTANCE, new PlayCommand(false))), a3t.a);
        return Unit.a;
    }

    @Override // defpackage.p7q
    public final Object n(szu szuVar) {
        szuVar.getClass();
        ((q7l) this.a.d.getValue()).a();
        return Unit.a;
    }

    @Override // defpackage.p7q
    public final Object q(y4d y4dVar) {
        y4dVar.getClass();
        k1l k1lVar = (k1l) this.a.a.getValue();
        b1q.b.getClass();
        k1lVar.a(c.a.b(), a3t.a);
        return Unit.a;
    }

    @Override // defpackage.p7q
    public final Object q0(maq maqVar) {
        maqVar.getClass();
        ((k1l) this.a.a.getValue()).a(new SkipCommand(0), a3t.a);
        return Unit.a;
    }

    @Override // defpackage.p7q
    public final Object t(t1q t1qVar) {
        t1qVar.getClass();
        ((k1l) this.a.a.getValue()).a(new SkipCommand(0), a3t.a);
        return Unit.a;
    }

    @Override // defpackage.p7q
    public final Object u(u7u u7uVar) {
        u7uVar.getClass();
        ((q7l) this.a.d.getValue()).a();
        return Unit.a;
    }
}
