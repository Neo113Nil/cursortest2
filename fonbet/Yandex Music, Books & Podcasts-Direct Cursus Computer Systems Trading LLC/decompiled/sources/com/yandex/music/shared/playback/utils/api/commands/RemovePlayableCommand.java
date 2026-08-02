package com.yandex.music.shared.playback.utils.api.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.hrg;
import defpackage.ran;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/music/shared/playback/utils/api/commands/RemovePlayableCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Substituting;", "Lran;", "position", "I", "a", "()I", "shared-playback-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class RemovePlayableCommand implements PlaybackCommand$QueueBound.Substituting {
    private final int position;

    public RemovePlayableCommand(int i) {
        this.position = i;
    }

    /* renamed from: a, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemovePlayableCommand) && this.position == ((RemovePlayableCommand) obj).position;
    }

    public final int hashCode() {
        return Integer.hashCode(this.position);
    }

    public final String toString() {
        return hrg.q("RemovePlayableCommand(position=", ran.a(this.position), ")");
    }
}
