package com.yandex.music.shared.wave.domain.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.jzs;
import defpackage.v3w;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/yandex/music/shared/wave/domain/commands/WaveQueueCommandsFactory$AddPlayablesAsLast", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Basic;", "", "Ljzs;", "playables", "Ljava/util/List;", "a", "()Ljava/util/List;", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final /* data */ class WaveQueueCommandsFactory$AddPlayablesAsLast implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    private final List<jzs> playables;

    public WaveQueueCommandsFactory$AddPlayablesAsLast(List list) {
        list.getClass();
        this.playables = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getPlayables() {
        return this.playables;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WaveQueueCommandsFactory$AddPlayablesAsLast) && Intrinsics.d(this.playables, ((WaveQueueCommandsFactory$AddPlayablesAsLast) obj).playables);
    }

    public final int hashCode() {
        return this.playables.hashCode();
    }

    public final String toString() {
        return v3w.f("AddPlayablesAsLast(playables=", ")", this.playables);
    }
}
