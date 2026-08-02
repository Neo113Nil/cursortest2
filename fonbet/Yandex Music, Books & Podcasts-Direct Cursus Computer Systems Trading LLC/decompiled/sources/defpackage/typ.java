package defpackage;

import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;

/* loaded from: classes4.dex */
public interface typ {
    Object E(StartGenerativeQueueCommand startGenerativeQueueCommand, cg6 cg6Var);

    Object c();

    Object p(StartYnisonQueueCommand startYnisonQueueCommand);

    Object v(StartFmRadioQueueCommand startFmRadioQueueCommand);

    Object x(StartWaveQueueCommand startWaveQueueCommand, cg6 cg6Var);

    Object y(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand, cg6 cg6Var);
}
