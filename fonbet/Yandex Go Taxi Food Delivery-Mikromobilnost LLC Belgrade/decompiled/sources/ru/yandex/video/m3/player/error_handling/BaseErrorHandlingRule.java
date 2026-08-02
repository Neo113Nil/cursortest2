package ru.yandex.video.m3.player.error_handling;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.error_handling.ErrorHandlingResult;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u001c0\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/error_handling/BaseErrorHandlingRule;", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingRule;", "", "maxRetries", "<init>", "(I)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "", "canErrorBeHandled", "(Lru/yandex/video/m3/player/PlaybackException;)Z", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "apply", "(Lru/yandex/video/m3/player/PlaybackException;)Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "isTypeSupported", "Lzy11;", "resetRetryCount", "()V", CA20Status.STATUS_USER_I, "Ljava/util/concurrent/atomic/AtomicInteger;", "replayCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "getReplayCount", "()Ljava/util/concurrent/atomic/AtomicInteger;", "getHandlingResult", "()Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "handlingResult", "", "Ljava/lang/Class;", "getSupportedTypes", "()Ljava/util/List;", "supportedTypes", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseErrorHandlingRule implements ErrorHandlingRule {
    public static final int $stable = 8;
    private final int maxRetries;
    private final AtomicInteger replayCount = new AtomicInteger(0);

    public BaseErrorHandlingRule(int i) {
        this.maxRetries = i;
    }

    @Override // ru.yandex.video.m3.player.error_handling.ErrorHandlingRule
    public ErrorHandlingResult apply(PlaybackException playbackException) {
        if (!canErrorBeHandled(playbackException)) {
            return ErrorHandlingResult.NotHandled.INSTANCE;
        }
        getReplayCount().incrementAndGet();
        return getHandlingResult();
    }

    @Override // ru.yandex.video.m3.player.error_handling.ErrorHandlingRule
    public boolean canErrorBeHandled(PlaybackException playbackException) {
        return isTypeSupported(playbackException) && getReplayCount().get() < this.maxRetries;
    }

    public abstract ErrorHandlingResult getHandlingResult();

    public AtomicInteger getReplayCount() {
        return this.replayCount;
    }

    public abstract List<Class<? extends PlaybackException>> getSupportedTypes();

    public final boolean isTypeSupported(PlaybackException playbackException) {
        List<Class<? extends PlaybackException>> supportedTypes = getSupportedTypes();
        if ((supportedTypes instanceof Collection) && supportedTypes.isEmpty()) {
            return false;
        }
        Iterator<T> it = supportedTypes.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isInstance(playbackException)) {
                return true;
            }
        }
        return false;
    }

    public final void resetRetryCount() {
        getReplayCount().set(0);
    }
}
