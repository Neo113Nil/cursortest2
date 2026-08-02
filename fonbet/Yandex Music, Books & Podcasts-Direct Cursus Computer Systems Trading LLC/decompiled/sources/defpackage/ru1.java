package defpackage;

import com.yandex.music.shared.playback.utils.api.commands.AttractivenessOperationCommand;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Next;
import com.yandex.music.shared.wave.domain.commands.d;

/* loaded from: classes4.dex */
public final class ru1 implements z7q {
    public final AttractivenessOperationCommand a;

    public ru1(AttractivenessOperationCommand attractivenessOperationCommand) {
        attractivenessOperationCommand.getClass();
        this.a = attractivenessOperationCommand;
    }

    @Override // defpackage.z7q
    public final Object D(z1q z1qVar) {
        z1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object E(k9q k9qVar) {
        k9qVar.getClass();
        int ordinal = this.a.getOperation().ordinal();
        d dVar = d.a;
        if (ordinal == 0) {
            return dVar.e();
        }
        if (ordinal == 1) {
            return dVar.o();
        }
        if (ordinal == 2) {
            return new WaveQueueCommandsFactory$Next(v5j.f, false);
        }
        if (ordinal == 3) {
            return dVar.n();
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.z7q
    public final Object G(b1q b1qVar) {
        b1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object o(a1q a1qVar) {
        a1qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object r(a8q a8qVar) {
        a8qVar.getClass();
        return null;
    }

    @Override // defpackage.z7q
    public final Object s(wpw wpwVar) {
        wpwVar.getClass();
        return null;
    }
}
