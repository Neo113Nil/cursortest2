package com.yandex.music.shared.player;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.hzk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/music/shared/player/UnexpectedPlaybackException;", "Lhzk;", "Lcom/yandex/music/shared/player/IllegalArgumentPlaybackException;", "Lcom/yandex/music/shared/player/IllegalStatePlaybackException;", "Lcom/yandex/music/shared/player/NullPointerPlaybackException;", "shared-player"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public abstract class UnexpectedPlaybackException extends hzk {
    public abstract RuntimeException b();
}
