package ru.yandex.video.m3.player.ugc_live.backoff;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/backoff/ExponentialBackoff;", "Lru/yandex/video/m3/player/ugc_live/backoff/Backoff;", "", "delayMinMs", "delayMaxMs", "", "factor", "jitter", "", "maxAttempts", "<init>", "(JJFLjava/lang/Float;I)V", "getDelayMs", "()J", "", "shouldRetry", "()Z", "Lzy11;", "reset", "()V", "J", "F", "Ljava/lang/Float;", CA20Status.STATUS_USER_I, "attemptsCount", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExponentialBackoff implements Backoff {
    public static final int $stable = 8;
    private int attemptsCount;
    private final long delayMaxMs;
    private final long delayMinMs;
    private final float factor;
    private final Float jitter;
    private final int maxAttempts;

    public ExponentialBackoff(long j, long j2, float f, Float f2, int i) {
        this.delayMinMs = j;
        this.delayMaxMs = j2;
        this.factor = f;
        this.jitter = f2;
        this.maxAttempts = i;
    }

    @Override // ru.yandex.video.m3.player.ugc_live.backoff.Backoff
    public long getDelayMs() {
        float pow = this.delayMinMs * ((float) Math.pow(this.factor, this.attemptsCount));
        this.attemptsCount++;
        Float f = this.jitter;
        if (f != null) {
            float floatValue = f.floatValue();
            double random = Math.random();
            float floor = (float) Math.floor(floatValue * random * pow);
            pow = random > 0.0d ? pow - floor : pow + floor;
        }
        return Math.abs(Math.min((long) pow, this.delayMaxMs));
    }

    @Override // ru.yandex.video.m3.player.ugc_live.backoff.Backoff
    public void reset() {
        this.attemptsCount = 0;
    }

    @Override // ru.yandex.video.m3.player.ugc_live.backoff.Backoff
    public boolean shouldRetry() {
        return this.attemptsCount < this.maxAttempts;
    }
}
