package ru.yandex.video.m3.player.impl.debug;

import android.net.Uri;
import kotlin.Metadata;
import ru.yandex.video.m3.data.VideoType;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/debug/StartPositionValidator;", "", "", "mediaSourceUriString", "", "startPosition", "Lzy11;", "onPrepare", "(Ljava/lang/String;Ljava/lang/Long;)V", "Landroid/net/Uri;", "mediaIemUri", "onMediaItemTransition", "(Landroid/net/Uri;)V", "Lru/yandex/video/m3/data/VideoType;", "videoType", "onVideoTypeDetected", "(Lru/yandex/video/m3/data/VideoType;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StartPositionValidator {
    void onMediaItemTransition(Uri mediaIemUri);

    void onPrepare(String mediaSourceUriString, Long startPosition);

    void onVideoTypeDetected(VideoType videoType);
}
