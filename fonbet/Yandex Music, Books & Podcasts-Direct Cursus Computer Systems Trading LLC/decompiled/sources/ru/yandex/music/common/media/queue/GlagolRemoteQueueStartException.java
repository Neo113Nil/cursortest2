package ru.yandex.music.common.media.queue;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.vid;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/music/common/media/queue/GlagolRemoteQueueStartException;", "Lru/yandex/music/common/media/queue/RemoteQueueStartException;", "vid", "ogp", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class GlagolRemoteQueueStartException extends RemoteQueueStartException {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 1;
    public final vid b;

    public GlagolRemoteQueueStartException(vid vidVar, String str, Throwable th) {
        super(str, th);
        this.b = vidVar;
    }
}
