package ru.yandex.music.common.media.queue;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.music_starter.api.ValidationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/music/common/media/queue/DoNotLaunchQueueStartException;", "Lcom/yandex/music/shared/music_starter/api/ValidationException;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class DoNotLaunchQueueStartException extends ValidationException {
    public final String a;

    public DoNotLaunchQueueStartException(String str) {
        super(str);
        this.a = str;
    }
}
