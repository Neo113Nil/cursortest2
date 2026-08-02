package ru.yandex.video.m3.player.impl.tracking;

import kotlin.Metadata;
import ru.yandex.video.m3.data.Decoder;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/DecoderProvider;", "", "audioDecoder", "Lru/yandex/video/m3/data/Decoder;", "getAudioDecoder", "()Lru/yandex/video/m3/data/Decoder;", "videoDecoder", "getVideoDecoder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DecoderProvider {
    Decoder getAudioDecoder();

    Decoder getVideoDecoder();
}
