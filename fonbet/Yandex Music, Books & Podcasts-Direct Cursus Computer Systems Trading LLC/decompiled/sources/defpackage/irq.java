package defpackage;

import com.yandex.music.shared.glagol.api.queue.SharedGlagolPlaybackCommand$Next;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$Next;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$Next;

/* loaded from: classes3.dex */
public final class irq implements z7q {
    @Override // defpackage.z7q
    public final Object D(z1q z1qVar) {
        z1qVar.getClass();
        z1qVar.k.getClass();
        return SharedGlagolPlaybackCommand$Next.INSTANCE;
    }

    @Override // defpackage.z7q
    public final Object E(k9q k9qVar) {
        k9qVar.getClass();
        i9q i9qVar = i9q.a;
        return new WaveQueueCommandsFactory$Next(v5j.e, false);
    }

    @Override // defpackage.z7q
    public final Object G(b1q b1qVar) {
        b1qVar.getClass();
        Assertions.throwOrSkip$default(new FailedAssertionException("Skip is not supported in generative queue"), null, 2, null);
        return null;
    }

    @Override // defpackage.z7q
    public final Object o(a1q a1qVar) {
        a1qVar.getClass();
        Assertions.throwOrSkip$default(new FailedAssertionException("Skip is not supported in FM queue"), null, 2, null);
        return null;
    }

    @Override // defpackage.z7q
    public final Object r(a8q a8qVar) {
        a8qVar.getClass();
        return ((s8q) a8qVar).f.d(false);
    }

    @Override // defpackage.z7q
    public final Object s(wpw wpwVar) {
        wpwVar.getClass();
        wpwVar.k.getClass();
        return YnisonNavigateCommand$Next.INSTANCE;
    }
}
