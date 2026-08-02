package ru.yandex.music.share;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.ugb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/yandex/music/share/ShareNetworkException;", "Lru/yandex/music/share/ShareException;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class ShareNetworkException extends ShareException {
    public ShareNetworkException(int i) {
        super(ugb.b, "Can't load cover", null);
    }
}
