package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;
import ru.yandex.video.m3.player.DecoderCounter;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/MergeDecoderCounter;", "Lru/yandex/video/m3/player/DecoderCounter;", "oldDecoderCounter", "newDecoderCounter", "(Lru/yandex/video/m3/player/DecoderCounter;Lru/yandex/video/m3/player/DecoderCounter;)V", "oldDroppedFrames", "", "oldInitCount", "oldReleaseCount", "oldShownFrames", "getDroppedFrames", "getInitCount", "getReleaseCount", "getShownFrames", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MergeDecoderCounter implements DecoderCounter {
    public static final int $stable = 8;
    private final DecoderCounter newDecoderCounter;
    private final int oldDroppedFrames;
    private final int oldInitCount;
    private final int oldReleaseCount;
    private final int oldShownFrames;

    public MergeDecoderCounter(DecoderCounter decoderCounter, DecoderCounter decoderCounter2) {
        this.newDecoderCounter = decoderCounter2;
        this.oldInitCount = decoderCounter != null ? decoderCounter.getInitCount() : 0;
        this.oldReleaseCount = decoderCounter != null ? decoderCounter.getReleaseCount() : 0;
        this.oldShownFrames = decoderCounter != null ? decoderCounter.getShownFrames() : 0;
        this.oldDroppedFrames = decoderCounter != null ? decoderCounter.getDroppedFrames() : 0;
    }

    @Override // ru.yandex.video.m3.player.DecoderCounter
    public int getDroppedFrames() {
        return this.newDecoderCounter.getDroppedFrames() + this.oldDroppedFrames;
    }

    @Override // ru.yandex.video.m3.player.DecoderCounter
    public int getInitCount() {
        return this.newDecoderCounter.getInitCount() + this.oldInitCount;
    }

    @Override // ru.yandex.video.m3.player.DecoderCounter
    public int getReleaseCount() {
        return this.newDecoderCounter.getReleaseCount() + this.oldReleaseCount;
    }

    @Override // ru.yandex.video.m3.player.DecoderCounter
    public int getShownFrames() {
        return this.newDecoderCounter.getShownFrames() + this.oldShownFrames;
    }
}
