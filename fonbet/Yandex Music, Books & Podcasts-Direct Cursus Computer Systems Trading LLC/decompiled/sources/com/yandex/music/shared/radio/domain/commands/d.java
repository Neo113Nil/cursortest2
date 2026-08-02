package com.yandex.music.shared.radio.domain.commands;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import defpackage.ern;
import defpackage.ftr;
import defpackage.hft;
import defpackage.iyk;
import defpackage.jyk;
import defpackage.jyr;
import defpackage.uoh;

/* loaded from: classes4.dex */
public final class d {
    public static final d a = new d();

    public static void b(jyk jykVar, jyr jyrVar, jyr jyrVar2, uoh uohVar) {
        iyk.c(jykVar, ern.a(StartVideoClipRadioQueueCommand.class), new ftr(4, jyrVar, jyrVar2, uohVar));
        iyk.a(jykVar, ern.a(VideoClipRadioQueueCommandsFactory$Skip.class), new hft(15));
        iyk.a(jykVar, ern.a(VideoClipRadioQueueCommandsFactory$Prev.class), new hft(16));
        iyk.a(jykVar, ern.a(VideoClipRadioQueueCommandsFactory$SetPosition.class), new hft(17));
    }

    public final PlaybackCommand$QueueBound.Basic a() {
        return VideoClipRadioQueueCommandsFactory$Prev.INSTANCE;
    }

    public final PlaybackCommand$QueueBound.Basic c(int i) {
        return new VideoClipRadioQueueCommandsFactory$SetPosition(i);
    }

    public final PlaybackCommand$QueueBound.Basic d(boolean z) {
        return new VideoClipRadioQueueCommandsFactory$Skip(z);
    }
}
