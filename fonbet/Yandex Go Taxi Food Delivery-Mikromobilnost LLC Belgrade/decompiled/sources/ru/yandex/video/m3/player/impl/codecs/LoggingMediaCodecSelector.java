package ru.yandex.video.m3.player.impl.codecs;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import defpackage.xb10;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.MediaCodecSelectorLog;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/codecs/LoggingMediaCodecSelector;", "Lxb10;", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "getLastSelectorLog", "(Lru/yandex/video/m3/player/tracks/TrackType;)Lru/yandex/video/m3/data/MediaCodecSelectorLog;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LoggingMediaCodecSelector extends xb10 {
    @Override // defpackage.xb10
    /* synthetic */ List getDecoderInfos(String str, boolean z, boolean z2) throws MediaCodecUtil$DecoderQueryException;

    MediaCodecSelectorLog getLastSelectorLog(TrackType trackType);
}
