package ru.yandex.video.m3.player.error_handling;

import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackParametersKt;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PlayerStrategy;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingDecision;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingResult;
import ru.yandex.video.m3.player.error_handling.ErrorSource;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManager;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00010B?\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0019\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u001f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlerImpl;", "", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/error_handling/ErrorHandler;", "Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;", "Lru/yandex/video/m3/player/PlayerObserver;", "rules", "Lru/yandex/video/m3/player/PlayerStrategy;", "playerStrategy", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "concurrentPlayerStateManager", "Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;", "externalErrorHandler", "", "useNewLogicForAutoPlayDecision", "<init>", "(Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;Lru/yandex/video/m3/player/PlayerStrategy;Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;Z)V", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision;", "decision", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "Lru/yandex/video/m3/player/error_handling/ErrorSource;", "errorSource", "executeDecision", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/error_handling/ErrorHandlingDecision;Lru/yandex/video/m3/player/PreparingParams;Lru/yandex/video/m3/player/error_handling/ErrorSource;)Z", "resolveAutoplay", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/PreparingParams;Lru/yandex/video/m3/player/error_handling/ErrorSource;)Z", "newResolveAutoplay", "(Lru/yandex/video/m3/player/PreparingParams;Lru/yandex/video/m3/player/error_handling/ErrorSource;)Z", "Lzy11;", "attachTo", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "detachFromPlayer", "()V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "handleException", "(Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/player/PreparingParams;Lru/yandex/video/m3/player/error_handling/ErrorSource;)Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "Lru/yandex/video/m3/player/error_handling/CompositeErrorHandlingRule;", "Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/player/impl/concurrent/ConcurrentPlayerStateManager;", "Lru/yandex/video/m3/player/error_handling/ExternalErrorHandler;", "Z", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorHandlerImpl<H> implements ErrorHandler<H> {
    private static final boolean DEFAULT_AUTOPLAY = false;

    @Deprecated
    public static final String PLAYER_NOT_ATTACHED_MSG = "Player is not attached to error handler! Cannot recover from error";

    @Deprecated
    public static final String PLAYER_STOPPED_MSG = "Player has already been stopped at the time when error occurred";

    @Deprecated
    public static final String PLAYER_SURFACE_DETACHED_MSG = "Surface has been detached from player at the time when error occurred ";
    private final ConcurrentPlayerStateManager concurrentPlayerStateManager;
    private final ExternalErrorHandler externalErrorHandler;
    private YandexPlayer<H> player;
    private final PlayerStrategy<?> playerStrategy;
    private final CompositeErrorHandlingRule<PlayerObserver<H>> rules;
    private final boolean useNewLogicForAutoPlayDecision;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ErrorHandlingDecision.RepeatPrepare.StartPosition.values().length];
            try {
                iArr[ErrorHandlingDecision.RepeatPrepare.StartPosition.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorHandlingDecision.RepeatPrepare.StartPosition.CURRENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ErrorHandlingDecision.RepeatPrepare.AutoPlay.values().length];
            try {
                iArr2[ErrorHandlingDecision.RepeatPrepare.AutoPlay.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ErrorHandlingDecision.RepeatPrepare.AutoPlay.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ErrorHandlingDecision.RepeatPrepare.AutoPlay.CURRENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ErrorHandlerImpl(CompositeErrorHandlingRule<PlayerObserver<H>> compositeErrorHandlingRule, PlayerStrategy<?> playerStrategy, ConcurrentPlayerStateManager concurrentPlayerStateManager, ExternalErrorHandler externalErrorHandler, boolean z) {
        this.rules = compositeErrorHandlingRule;
        this.playerStrategy = playerStrategy;
        this.concurrentPlayerStateManager = concurrentPlayerStateManager;
        this.externalErrorHandler = externalErrorHandler;
        this.useNewLogicForAutoPlayDecision = z;
    }

    private final boolean executeDecision(YandexPlayer<?> yandexPlayer, final ErrorHandlingDecision decision, final PreparingParams preparingParams, ErrorSource errorSource) {
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.t("PlayerErrorHandling");
        boolean z = false;
        d5z0Var.a("decision = " + decision, new Object[0]);
        if (jl40.l(decision, ErrorHandlingDecision.PlayFromLive.INSTANCE)) {
            yandexPlayer.seekTo(-9223372036854775807L);
            yandexPlayer.play();
            return true;
        }
        if (!(decision instanceof ErrorHandlingDecision.RepeatPrepare)) {
            w511.b();
            return false;
        }
        VideoData videoDataInternal = yandexPlayer.getVideoDataInternal();
        if (videoDataInternal == null) {
            return false;
        }
        ErrorHandlingDecision.RepeatPrepare repeatPrepare = (ErrorHandlingDecision.RepeatPrepare) decision;
        int i = WhenMappings.$EnumSwitchMapping$0[repeatPrepare.getStartPosition().ordinal()];
        final Long l = null;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return false;
            }
            long position = yandexPlayer.getPosition();
            Long valueOf = Long.valueOf(position);
            if (position < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                l = valueOf;
            } else if (preparingParams != null) {
                l = preparingParams.getStartPosition();
            }
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[repeatPrepare.getAutoPlay().ordinal()];
        if (i2 == 1) {
            z = true;
        } else if (i2 != 2) {
            if (i2 != 3) {
                w511.b();
                return false;
            }
            z = this.useNewLogicForAutoPlayDecision ? newResolveAutoplay(preparingParams, errorSource) : resolveAutoplay(yandexPlayer, preparingParams, errorSource);
        }
        yandexPlayer.prepare(videoDataInternal, PlaybackParametersKt.PlaybackParameters(z, new tls() { // from class: ru.yandex.video.m3.player.error_handling.ErrorHandlerImpl$executeDecision$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(PlaybackParameters.Builder builder) {
                builder.setStartPosition(l);
                builder.setPreferredH264(Boolean.valueOf(((ErrorHandlingDecision.RepeatPrepare) decision).getPreferredH264()));
                PreparingParams preparingParams2 = preparingParams;
                builder.setOffline(preparingParams2 != null ? Boolean.valueOf(preparingParams2.getIsOffline()) : null);
                PreparingParams preparingParams3 = preparingParams;
                builder.setManifestDataSourceParameters(preparingParams3 != null ? preparingParams3.getManifestDataSourceParameters() : null);
                PreparingParams preparingParams4 = preparingParams;
                builder.setChunkDataSourceParameters(preparingParams4 != null ? preparingParams4.getChunkDataSourceParameters() : null);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PlaybackParameters.Builder) obj);
                return zy11.a;
            }
        }));
        return true;
    }

    private final boolean newResolveAutoplay(PreparingParams preparingParams, ErrorSource errorSource) {
        Boolean bool;
        if (errorSource instanceof ErrorSource.Prepare) {
            bool = preparingParams != null ? Boolean.valueOf(preparingParams.getAutoPlay()) : null;
        } else if (errorSource instanceof ErrorSource.PlayerDelegate) {
            bool = Boolean.valueOf(((ErrorSource.PlayerDelegate) errorSource).getPlayerWasPlayWhenReadyBeforeError());
        } else if (errorSource instanceof ErrorSource.Strategy) {
            bool = Boolean.valueOf(((ErrorSource.Strategy) errorSource).getPlayerWasPlayWhenReadyBeforeError());
        } else {
            if (!(errorSource instanceof ErrorSource.Player)) {
                w511.b();
                return false;
            }
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean resolveAutoplay(YandexPlayer<?> yandexPlayer, PreparingParams preparingParams, ErrorSource errorSource) {
        Boolean bool = null;
        if (errorSource instanceof ErrorSource.Prepare) {
            if (preparingParams != null) {
                bool = Boolean.valueOf(preparingParams.getAutoPlay());
            }
        } else if (errorSource instanceof ErrorSource.PlayerDelegate) {
            if (((ErrorSource.PlayerDelegate) errorSource).getPlayerWasReadyForFirstPlayback()) {
                PlaybackStats playbackStats = yandexPlayer.getPlaybackStats();
                if (playbackStats != null) {
                    bool = Boolean.valueOf(playbackStats.getWillPlayWhenReady());
                }
            } else if (preparingParams != null) {
                bool = Boolean.valueOf(preparingParams.getAutoPlay());
            }
        } else if (errorSource instanceof ErrorSource.Strategy) {
            PlaybackStats playbackStats2 = yandexPlayer.getPlaybackStats();
            if (playbackStats2 != null) {
                bool = Boolean.valueOf(playbackStats2.getWillPlayWhenReady());
            }
        } else {
            if (!(errorSource instanceof ErrorSource.Player)) {
                w511.b();
                return false;
            }
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // ru.yandex.video.m3.player.error_handling.ErrorHandler
    public void attachTo(YandexPlayer<H> yandexPlayer) {
        this.player = yandexPlayer;
        Iterator<T> it = this.rules.getRequiredObservers().iterator();
        while (it.hasNext()) {
            yandexPlayer.addObserver((PlayerObserver) it.next());
        }
    }

    @Override // ru.yandex.video.m3.player.error_handling.ErrorHandler
    public void detachFromPlayer() {
        Iterator<T> it = this.rules.getRequiredObservers().iterator();
        while (it.hasNext()) {
            PlayerObserver<? super H> playerObserver = (PlayerObserver) it.next();
            YandexPlayer<H> yandexPlayer = this.player;
            if (yandexPlayer != null) {
                yandexPlayer.removeObserver(playerObserver);
            }
        }
        this.player = null;
    }

    @Override // ru.yandex.video.m3.player.error_handling.ErrorHandler
    public ErrorHandlingResult handleException(PlaybackException playbackException, PreparingParams preparingParams, ErrorSource errorSource) {
        YandexPlayer<H> yandexPlayer = this.player;
        if (yandexPlayer == null) {
            return new ErrorHandlingResult.Ignored(PLAYER_NOT_ATTACHED_MSG);
        }
        if (this.concurrentPlayerStateManager.isNotActive()) {
            return new ErrorHandlingResult.Ignored(PLAYER_STOPPED_MSG);
        }
        ErrorHandlingResult apply = this.rules.canErrorBeHandled(playbackException) ? this.rules.apply(playbackException) : this.playerStrategy.onPlaybackError(playbackException) ? this.externalErrorHandler.onPlaybackError(playbackException) ? ErrorHandlingResult.HandledByExternalErrorHandler.INSTANCE : ErrorHandlingResult.NotHandled.INSTANCE : ErrorHandlingResult.HandledByStrategy.INSTANCE;
        return (!(apply instanceof ErrorHandlingResult.Handled) || executeDecision(yandexPlayer, ((ErrorHandlingResult.Handled) apply).getDecision(), preparingParams, errorSource)) ? apply : ErrorHandlingResult.NotHandled.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandlerImpl$Companion;", "", "()V", "DEFAULT_AUTOPLAY", "", "PLAYER_NOT_ATTACHED_MSG", "", "PLAYER_STOPPED_MSG", "PLAYER_SURFACE_DETACHED_MSG", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
