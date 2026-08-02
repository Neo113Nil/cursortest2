package ru.yandex.video.m3.player.error_handling;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingDecision;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingResult;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingRule;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/error_handling/FrameDropHandlingRule;", "Lru/yandex/video/m3/player/error_handling/BaseErrorHandlingRule;", "()V", "handlingResult", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "getHandlingResult", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "lastAttemptTimestamp", "", "supportedTypes", "", "Ljava/lang/Class;", "Lru/yandex/video/m3/player/PlaybackException;", "getSupportedTypes", "()Ljava/util/List;", "apply", "playbackException", "canErrorBeHandled", "", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FrameDropHandlingRule extends BaseErrorHandlingRule {
    private static final String ATTEMPT_COUNTER_OVERFLOW_MSG = "3 attempts were already made to recover from this error";
    public static final int MAX_RECOVER_ATTEMPTS = 3;
    public static final long MIN_DELAY_AFTER_LAST_STALLED_TO_MAKE_ATTEMPTS = 10000;
    public static final long MIN_DELAY_BETWEEN_ATTEMPTS_MS = 30000;
    private static final String MIN_DELAY_NOT_PASSED_MSG = "Specified time not passed after last recover attempt";
    private static final String SHOULD_NOT_BE_CALLED_MSG = "This code should not be called";
    private static final String TOO_LITTLE_TIME_AFTER_LAST_STALLED_MSG = "Too little time passed after last stalled to recover";
    private final ErrorHandlingResult handlingResult;
    private long lastAttemptTimestamp;
    private final List<Class<? extends PlaybackException>> supportedTypes;
    public static final int $stable = 8;

    public FrameDropHandlingRule() {
        super(3);
        this.supportedTypes = Collections.singletonList(PlaybackException.FrameDropDetected.class);
        this.handlingResult = new ErrorHandlingResult.Ignored(SHOULD_NOT_BE_CALLED_MSG);
    }

    @Override // ru.yandex.video.m3.player.error_handling.BaseErrorHandlingRule, ru.yandex.video.m3.player.error_handling.ErrorHandlingRule
    public ErrorHandlingResult apply(PlaybackException playbackException) {
        if (!canErrorBeHandled(playbackException)) {
            return ErrorHandlingResult.NotHandled.INSTANCE;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ((PlaybackException.FrameDropDetected) playbackException).getResumePlaybackTimestamp() < 10000) {
            return new ErrorHandlingResult.Ignored(TOO_LITTLE_TIME_AFTER_LAST_STALLED_MSG);
        }
        if (getReplayCount().get() >= 3) {
            return new ErrorHandlingResult.Ignored(ATTEMPT_COUNTER_OVERFLOW_MSG);
        }
        if (currentTimeMillis - this.lastAttemptTimestamp < 30000) {
            return new ErrorHandlingResult.Ignored(MIN_DELAY_NOT_PASSED_MSG);
        }
        getReplayCount().incrementAndGet();
        this.lastAttemptTimestamp = System.currentTimeMillis();
        ErrorHandlingRule.Companion companion = ErrorHandlingRule.INSTANCE;
        return new ErrorHandlingResult.Handled(new ErrorHandlingDecision.RepeatPrepare(companion.getCURRENT_START_POSITION(), companion.getAUTO_PLAY_CURRENT(), false, 4, null), this);
    }

    @Override // ru.yandex.video.m3.player.error_handling.BaseErrorHandlingRule, ru.yandex.video.m3.player.error_handling.ErrorHandlingRule
    public boolean canErrorBeHandled(PlaybackException playbackException) {
        return isTypeSupported(playbackException);
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
