package defpackage;

import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;

/* loaded from: classes4.dex */
public interface uyp {
    Object A(StartRelayQueueCommand startRelayQueueCommand);

    Object C(StartGenerativeQueueCommand startGenerativeQueueCommand);

    Object I(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand);

    Object p(StartYnisonQueueCommand startYnisonQueueCommand);

    Object v(StartFmRadioQueueCommand startFmRadioQueueCommand);

    Object x(StartWaveQueueCommand startWaveQueueCommand);
}
