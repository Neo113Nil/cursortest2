package com.yandex.music.shared.playback.api.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.n4q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/music/shared/playback/api/commands/SetVolumeCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Basic;", "Ln4q;", "volume", "Ln4q;", "a", "()Ln4q;", "shared-playback"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class SetVolumeCommand implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    private final n4q volume;

    public SetVolumeCommand(n4q n4qVar) {
        this.volume = n4qVar;
    }

    /* renamed from: a, reason: from getter */
    public final n4q getVolume() {
        return this.volume;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetVolumeCommand) && Intrinsics.d(this.volume, ((SetVolumeCommand) obj).volume);
    }

    public final int hashCode() {
        return Float.hashCode(this.volume.a);
    }

    public final String toString() {
        return "SetVolumeCommand(volume=" + this.volume + ")";
    }
}
