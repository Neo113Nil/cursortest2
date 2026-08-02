package com.yandex.music.shared.glagol.api.queue;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/music/shared/glagol/api/queue/SharedGlagolPlaybackCommand$Back", "", "shared-glagol-queue"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class SharedGlagolPlaybackCommand$Back implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    public static final SharedGlagolPlaybackCommand$Back INSTANCE = new SharedGlagolPlaybackCommand$Back();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SharedGlagolPlaybackCommand$Back);
    }

    public final int hashCode() {
        return -1543014759;
    }

    public final String toString() {
        return "Back";
    }
}
