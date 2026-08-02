package ru.yandex.video.m3.player.error_handling;

import java.lang.Class;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingDecision;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingResult;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingRule;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0010*\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0010B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorInRendererHandlingRule;", "T", "Ljava/lang/Class;", "Lru/yandex/video/m3/player/PlaybackException$ErrorInRenderer;", "Lru/yandex/video/m3/player/error_handling/BaseErrorHandlingRule;", "playbackExceptionClass", "(Ljava/lang/Class;)V", "handlingResult", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "getHandlingResult", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "supportedTypes", "", "Lru/yandex/video/m3/player/PlaybackException;", "getSupportedTypes", "()Ljava/util/List;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorInRendererHandlingRule<T extends Class<? extends PlaybackException.ErrorInRenderer>> extends BaseErrorHandlingRule {

    @Deprecated
    public static final int MAX_REPLAY_COUNT = 3;
    private final ErrorHandlingResult handlingResult;
    private final List<Class<? extends PlaybackException>> supportedTypes;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ErrorInRendererHandlingRule(T t) {
        super(3);
        this.supportedTypes = Collections.singletonList(t);
        ErrorHandlingRule.Companion companion = ErrorHandlingRule.INSTANCE;
        this.handlingResult = new ErrorHandlingResult.Handled(new ErrorHandlingDecision.RepeatPrepare(companion.getCURRENT_START_POSITION(), companion.getAUTO_PLAY_CURRENT(), false, 4, null), this);
    }

    @Override // ru.yandex.video.m3.player.error_handling.BaseErrorHandlingRule
    public ErrorHandlingResult getHandlingResult() {
        return this.handlingResult;
    }

    @Override // ru.yandex.video.m3.player.error_handling.BaseErrorHandlingRule
    public List<Class<? extends PlaybackException>> getSupportedTypes() {
        return this.supportedTypes;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorInRendererHandlingRule$Companion;", "", "()V", "MAX_REPLAY_COUNT", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
