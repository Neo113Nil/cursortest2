package ru.yandex.video.m3.debug;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.event.DecoderFallbackData;
import ru.yandex.video.m3.player.tracks.TrackType;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/debug/DecoderUsageListener;", "", "", "engineIndex", "Lru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;", "decoderFallbackData", "Lzy11;", "onVideoDecoderFallback", "(ILru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;)V", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;", Constants.KEY_DATA, "onDecoderInitialized", "(ILru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/player/impl/tracking/data/DecoderEventData;)V", "onDecoderReused", "onDecoderDiscarded", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DecoderUsageListener {
    void onDecoderDiscarded(int engineIndex, TrackType trackType, DecoderEventData data);

    void onDecoderInitialized(int engineIndex, TrackType trackType, DecoderEventData data);

    void onDecoderReused(int engineIndex, TrackType trackType, DecoderEventData data);

    void onVideoDecoderFallback(int engineIndex, DecoderFallbackData decoderFallbackData);
}
