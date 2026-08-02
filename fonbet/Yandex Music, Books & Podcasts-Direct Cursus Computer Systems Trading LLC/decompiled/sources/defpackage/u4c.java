package defpackage;

import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.PauseOnQueueEndCommand;
import com.yandex.music.shared.wave.domain.commands.WaveQueueCommandsFactory$SetQueuePosition;

/* loaded from: classes4.dex */
public abstract class u4c {
    public static final eyk a(boolean z) {
        AwaitPlayerConvergedCommand awaitPlayerConvergedCommand = new AwaitPlayerConvergedCommand(z);
        j9q j9qVar = j9q.a;
        return new eyk(u75.h(PauseOnQueueEndCommand.INSTANCE, awaitPlayerConvergedCommand, new WaveQueueCommandsFactory$SetQueuePosition(0, z)));
    }
}
