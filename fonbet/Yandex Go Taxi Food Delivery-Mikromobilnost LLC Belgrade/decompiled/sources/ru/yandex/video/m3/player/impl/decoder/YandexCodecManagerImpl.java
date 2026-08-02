package ru.yandex.video.m3.player.impl.decoder;

import kotlin.Metadata;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.decoder.YandexCodecManager;
import ru.yandex.video.m3.player.provider.Supplier;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/decoder/YandexCodecManagerImpl;", "Lru/yandex/video/m3/player/decoder/YandexCodecManager;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/PlayerDelegate;", "playerDelegate", "<init>", "(Lru/yandex/video/m3/player/provider/Supplier;)V", "Lzy11;", "allowInitCodec", "()V", "Lru/yandex/video/m3/player/provider/Supplier;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexCodecManagerImpl implements YandexCodecManager {
    public static final int $stable = 8;
    private final Supplier<PlayerDelegate<?>> playerDelegate;

    public YandexCodecManagerImpl(Supplier<PlayerDelegate<?>> supplier) {
        this.playerDelegate = supplier;
    }

    @Override // ru.yandex.video.m3.player.decoder.YandexCodecManager
    public void allowInitCodec() {
        this.playerDelegate.getValue().allowInitCodec();
    }
}
