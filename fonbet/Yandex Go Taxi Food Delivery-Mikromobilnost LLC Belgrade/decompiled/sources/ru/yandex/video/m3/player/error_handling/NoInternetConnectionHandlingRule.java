package ru.yandex.video.m3.player.error_handling;

import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingDecision;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingResult;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingRule;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0015*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006R(\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/error_handling/NoInternetConnectionHandlingRule;", "", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/error_handling/BaseErrorHandlingRule;", "Lru/yandex/video/m3/player/PlayerObserver;", "<init>", "()V", "Lzy11;", "onResumePlayback", "", "Ljava/lang/Class;", "Lru/yandex/video/m3/player/PlaybackException;", "supportedTypes", "Ljava/util/List;", "getSupportedTypes", "()Ljava/util/List;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "handlingResult", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "getHandlingResult", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoInternetConnectionHandlingRule<H> extends BaseErrorHandlingRule implements PlayerObserver<H> {
    private static final int MAX_REPLAY_COUNT_ON_NO_INTERNET_CONNECTION = 2;
    private final ErrorHandlingResult handlingResult;
    private final List<Class<? extends PlaybackException>> supportedTypes;
    public static final int $stable = 8;

    public NoInternetConnectionHandlingRule() {
        super(2);
        this.supportedTypes = Collections.singletonList(PlaybackException.ErrorNoInternetConnection.class);
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

    @Override // ru.yandex.video.m3.player.PlayerObserver
    public void onResumePlayback() {
        resetRetryCount();
    }
}
