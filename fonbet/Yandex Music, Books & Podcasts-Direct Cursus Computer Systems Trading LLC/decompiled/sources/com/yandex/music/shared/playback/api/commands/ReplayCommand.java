package com.yandex.music.shared.playback.api.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.yyn;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/music/shared/playback/api/commands/ReplayCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Basic;", "Lyyn;", "reason", "Lyyn;", "a", "()Lyyn;", "shared-playback"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class ReplayCommand implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    private final yyn reason;

    public ReplayCommand(yyn yynVar) {
        this.reason = yynVar;
    }

    /* renamed from: a, reason: from getter */
    public final yyn getReason() {
        return this.reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReplayCommand) && this.reason == ((ReplayCommand) obj).reason;
    }

    public final int hashCode() {
        return this.reason.hashCode();
    }

    public final String toString() {
        return "ReplayCommand(reason=" + this.reason + ")";
    }

    public /* synthetic */ ReplayCommand() {
        this(yyn.b);
    }
}
