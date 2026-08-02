package defpackage;

import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;

/* loaded from: classes4.dex */
public abstract class vyp {
    public static final Object a(PlaybackCommand$QueueLaunch.Basic basic, typ typVar, cg6 cg6Var) {
        if (basic instanceof StartWaveQueueCommand) {
            return typVar.x((StartWaveQueueCommand) basic, cg6Var);
        }
        if (basic instanceof StartVideoClipRadioQueueCommand) {
            return typVar.y((StartVideoClipRadioQueueCommand) basic, cg6Var);
        }
        if (basic instanceof StartFmRadioQueueCommand) {
            return typVar.v((StartFmRadioQueueCommand) basic);
        }
        if (basic instanceof StartGenerativeQueueCommand) {
            return typVar.E((StartGenerativeQueueCommand) basic, cg6Var);
        }
        if (basic instanceof StartYnisonQueueCommand) {
            return typVar.p((StartYnisonQueueCommand) basic);
        }
        if (basic instanceof StartRelayQueueCommand) {
            typVar.c();
            throw null;
        }
        kac.j(basic, "Developer Error. Unexpected class for visit ");
        return null;
    }

    public static final Object b(PlaybackCommand$QueueLaunch.Basic basic, uyp uypVar) {
        basic.getClass();
        if (basic instanceof StartWaveQueueCommand) {
            return uypVar.x((StartWaveQueueCommand) basic);
        }
        if (basic instanceof StartVideoClipRadioQueueCommand) {
            return uypVar.I((StartVideoClipRadioQueueCommand) basic);
        }
        if (basic instanceof StartFmRadioQueueCommand) {
            return uypVar.v((StartFmRadioQueueCommand) basic);
        }
        if (basic instanceof StartGenerativeQueueCommand) {
            return uypVar.C((StartGenerativeQueueCommand) basic);
        }
        if (basic instanceof StartYnisonQueueCommand) {
            return uypVar.p((StartYnisonQueueCommand) basic);
        }
        if (basic instanceof StartRelayQueueCommand) {
            uypVar.A((StartRelayQueueCommand) basic);
            throw null;
        }
        kac.j(basic, "Developer Error. Unexpected class for visit ");
        return null;
    }
}
