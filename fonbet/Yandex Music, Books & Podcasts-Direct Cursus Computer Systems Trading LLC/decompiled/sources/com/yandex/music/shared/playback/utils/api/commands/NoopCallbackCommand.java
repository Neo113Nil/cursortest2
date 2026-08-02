package com.yandex.music.shared.playback.utils.api.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.jej;
import defpackage.lc4;
import defpackage.men;
import defpackage.nm6;
import defpackage.qln;
import defpackage.zi3;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/playback/utils/api/commands/NoopCallbackCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Basic;", "Llc4;", "", "_channel", "Llc4;", "Lqln;", "channel", "Lqln;", "b", "()Lqln;", "shared-playback-utils"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class NoopCallbackCommand implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    private final lc4 _channel;

    @NotNull
    private final qln channel;

    public NoopCallbackCommand() {
        zi3 g = men.g(-1, 6, null);
        this._channel = g;
        this.channel = g;
    }

    public final Object a(jej jejVar) {
        lc4 lc4Var = this._channel;
        Unit unit = Unit.a;
        Object m = lc4Var.m(unit, jejVar);
        return m == nm6.a ? m : unit;
    }

    /* renamed from: b, reason: from getter */
    public final qln getChannel() {
        return this.channel;
    }
}
