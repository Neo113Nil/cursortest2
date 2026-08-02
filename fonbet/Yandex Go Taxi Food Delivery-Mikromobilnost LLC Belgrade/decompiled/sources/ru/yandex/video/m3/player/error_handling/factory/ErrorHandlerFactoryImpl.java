package ru.yandex.video.m3.player.error_handling.factory;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PlayerStrategy;
import ru.yandex.video.m3.player.error_handling.CompositeErrorHandlingRule;
import ru.yandex.video.m3.player.error_handling.ErrorHandler;
import ru.yandex.video.m3.player.error_handling.ErrorHandlerImpl;
import ru.yandex.video.m3.player.error_handling.ExternalErrorHandler;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B)\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/error_handling/factory/ErrorHandlerFactoryImpl;", CA20Status.STATUS_CERTIFICATE_H, "", "Lru/yandex/video/m3/player/error_handling/factory/ErrorHandlerFactory;", "rules", "Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;", "Lru/yandex/video/m3/player/PlayerObserver;", "externalErrorHandler", "Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;", "useNewLogicForAutoPlayDecision", "", "(Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;Z)V", "create", "Lru/yandex/video/m3/player/error_handling/ErrorHandler;", "playerStrategy", "Lru/yandex/video/m3/player/PlayerStrategy;", "concurrentPlayerStateManager", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorHandlerFactoryImpl<H> implements ErrorHandlerFactory<H> {
    public static final int $stable = 8;
    private final ExternalErrorHandler externalErrorHandler;
    private final CompositeErrorHandlingRule<PlayerObserver<H>> rules;
    private final boolean useNewLogicForAutoPlayDecision;

    public ErrorHandlerFactoryImpl(CompositeErrorHandlingRule<PlayerObserver<H>> compositeErrorHandlingRule, ExternalErrorHandler externalErrorHandler, boolean z) {
        this.rules = compositeErrorHandlingRule;
        this.externalErrorHandler = externalErrorHandler;
        this.useNewLogicForAutoPlayDecision = z;
    }

    @Override // ru.yandex.video.m3.player.error_handling.factory.ErrorHandlerFactory
    public ErrorHandler<H> create(PlayerStrategy<?> playerStrategy, ConcurrentPlayerStateManager concurrentPlayerStateManager) {
        return new ErrorHandlerImpl(this.rules, playerStrategy, concurrentPlayerStateManager, this.externalErrorHandler, this.useNewLogicForAutoPlayDecision);
    }
}
