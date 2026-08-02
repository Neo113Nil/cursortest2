package ru.yandex.video.m3.player.error_handling;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingDecision;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingResult;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingRule;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/error_handling/StuckStalledHandlingRule;", "Lru/yandex/video/m3/player/error_handling/BaseErrorHandlingRule;", "()V", "handlingResult", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "getHandlingResult", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "supportedTypes", "", "Ljava/lang/Class;", "Lru/yandex/video/m3/player/PlaybackException;", "getSupportedTypes", "()Ljava/util/List;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StuckStalledHandlingRule extends BaseErrorHandlingRule {
    private static final int MAX_REPLAY_COUNT = 3;
    private final ErrorHandlingResult handlingResult;
    private final List<Class<? extends PlaybackException>> supportedTypes;
    public static final int $stable = 8;

    public StuckStalledHandlingRule() {
        super(3);
        this.supportedTypes = Collections.singletonList(PlaybackException.ErrorStalledStuck.class);
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
}
