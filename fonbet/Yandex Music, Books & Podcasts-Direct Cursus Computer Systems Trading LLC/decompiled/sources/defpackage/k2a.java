package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.control.shared.commands.DoNotLaunchCommand;
import ru.yandex.music.common.media.queue.DoNotLaunchQueueStartException;

/* loaded from: classes5.dex */
public final class k2a implements o3l {
    @Override // defpackage.o3l
    public final Object a(PlaybackCommand$QueueLaunch.Basic basic, es6 es6Var, cg6 cg6Var) {
        DoNotLaunchCommand doNotLaunchCommand = (DoNotLaunchCommand) basic;
        Function1 onError = doNotLaunchCommand.getOnError();
        if (onError != null) {
            onError.invoke(new DoNotLaunchQueueStartException(doNotLaunchCommand.getCause().a));
        }
        return Boolean.FALSE;
    }
}
