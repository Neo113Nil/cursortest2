package ru.yandex.video.m3.player.error_handling.factory;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlayerStrategy;
import ru.yandex.video.m3.player.error_handling.ErrorHandler;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/factory/ErrorHandlerFactory;", CA20Status.STATUS_CERTIFICATE_H, "", "create", "Lru/yandex/video/m3/player/error_handling/ErrorHandler;", "playerStrategy", "Lru/yandex/video/m3/player/PlayerStrategy;", "concurrentPlayerStateManager", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ErrorHandlerFactory<H> {
    ErrorHandler<H> create(PlayerStrategy<?> playerStrategy, ConcurrentPlayerStateManager concurrentPlayerStateManager);
}
