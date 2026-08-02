package ru.yandex.music.common.media.queue;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.mwk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/music/common/media/queue/ChromeRemoteQueueStartException;", "Lru/yandex/music/common/media/queue/RemoteQueueStartException;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class ChromeRemoteQueueStartException extends RemoteQueueStartException {
    private static final long serialVersionUID = 1;
    public final mwk b;

    public ChromeRemoteQueueStartException(mwk mwkVar, String str) {
        super(str, null);
        this.b = mwkVar;
    }
}
