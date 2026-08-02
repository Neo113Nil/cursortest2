package com.yandex.music.shared.wave.domain.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/music/shared/wave/domain/commands/WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Basic;", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final /* data */ class WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    public static final WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync INSTANCE = new WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync);
    }

    public final int hashCode() {
        return -1477303096;
    }

    public final String toString() {
        return "LaunchProlongationIfNeededAsync";
    }
}
