package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import ru.yandex.music.common.media.control.shared.commands.StartQueueCommand;

/* loaded from: classes5.dex */
public final class ocr implements u3l {
    public final jyr a = btf.b(new nrq(24));

    @Override // defpackage.u3l
    public final Object a(PlaybackCommand$QueueLaunch.Substituting substituting, es6 es6Var, zrn zrnVar) {
        return x97.V(dm6.b(), new ncr((StartQueueCommand) substituting, this, null), zrnVar);
    }
}
