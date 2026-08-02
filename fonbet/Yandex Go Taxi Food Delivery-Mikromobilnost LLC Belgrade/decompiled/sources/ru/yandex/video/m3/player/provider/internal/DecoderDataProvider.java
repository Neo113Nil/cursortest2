package ru.yandex.video.m3.player.provider.internal;

import kotlin.Metadata;
import ru.yandex.video.m3.data.Decoder;
import ru.yandex.video.m3.data.DecoderData;
import ru.yandex.video.m3.player.impl.tracking.DecoderProvider;
import ru.yandex.video.m3.player.provider.Consumer;
import ru.yandex.video.m3.player.provider.Supplier;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/DecoderDataProvider;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/data/DecoderData;", "Lru/yandex/video/m3/player/provider/Consumer;", "Lru/yandex/video/m3/player/impl/tracking/DecoderProvider;", "<init>", "()V", "value", "Lzy11;", "accept", "(Lru/yandex/video/m3/player/impl/tracking/DecoderProvider;)V", "get", "()Lru/yandex/video/m3/data/DecoderData;", "_decoderProvider", "Lru/yandex/video/m3/player/impl/tracking/DecoderProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecoderDataProvider implements Supplier<DecoderData>, Consumer<DecoderProvider> {
    public static final int $stable = 8;
    private DecoderProvider _decoderProvider = new DecoderProvider() { // from class: ru.yandex.video.m3.player.provider.internal.DecoderDataProvider$_decoderProvider$1
        @Override // ru.yandex.video.m3.player.impl.tracking.DecoderProvider
        public Decoder getAudioDecoder() {
            return null;
        }

        @Override // ru.yandex.video.m3.player.impl.tracking.DecoderProvider
        public Decoder getVideoDecoder() {
            return null;
        }
    };

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get, reason: avoid collision after fix types in other method */
    public DecoderData getValue() {
        DecoderProvider decoderProvider = this._decoderProvider;
        return new DecoderData(decoderProvider.getVideoDecoder(), decoderProvider.getAudioDecoder());
    }

    @Override // ru.yandex.video.m3.player.provider.Consumer
    public void accept(DecoderProvider value) {
        this._decoderProvider = value;
    }
}
