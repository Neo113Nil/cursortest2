package com.yandex.music.shared.wave.domain.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.nyn;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/yandex/music/shared/wave/domain/commands/WaveQueueCommandsFactory$SetRepeatMode", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Basic;", "Lnyn;", "modeType", "Lnyn;", "a", "()Lnyn;", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final /* data */ class WaveQueueCommandsFactory$SetRepeatMode implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    private final nyn modeType;

    public WaveQueueCommandsFactory$SetRepeatMode(nyn nynVar) {
        nynVar.getClass();
        this.modeType = nynVar;
    }

    /* renamed from: a, reason: from getter */
    public final nyn getModeType() {
        return this.modeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WaveQueueCommandsFactory$SetRepeatMode) && this.modeType == ((WaveQueueCommandsFactory$SetRepeatMode) obj).modeType;
    }

    public final int hashCode() {
        return this.modeType.hashCode();
    }

    public final String toString() {
        return "SetRepeatMode(modeType=" + this.modeType + ")";
    }
}
