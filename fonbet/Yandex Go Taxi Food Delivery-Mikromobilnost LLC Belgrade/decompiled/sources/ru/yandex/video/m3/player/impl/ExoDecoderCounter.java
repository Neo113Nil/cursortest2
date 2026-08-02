package ru.yandex.video.m3.player.impl;

import defpackage.kyg;
import kotlin.Metadata;
import ru.yandex.video.m3.player.DecoderCounter;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/ExoDecoderCounter;", "Lru/yandex/video/m3/player/DecoderCounter;", "Lkyg;", "decoderCounters", "<init>", "(Lkyg;)V", "", "getInitCount", "()I", "getReleaseCount", "getShownFrames", "getDroppedFrames", "Lkyg;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDecoderCounter implements DecoderCounter {
    public static final int $stable = 8;
    private final kyg decoderCounters;

    public ExoDecoderCounter(kyg kygVar) {
        this.decoderCounters = kygVar;
    }

    @Override // ru.yandex.video.m3.player.DecoderCounter
    public int getDroppedFrames() {
        return this.decoderCounters.g;
    }

    @Override // ru.yandex.video.m3.player.DecoderCounter
    public int getInitCount() {
        return this.decoderCounters.a;
    }

    @Override // ru.yandex.video.m3.player.DecoderCounter
    public int getReleaseCount() {
        return this.decoderCounters.b;
    }

    @Override // ru.yandex.video.m3.player.DecoderCounter
    public int getShownFrames() {
        return this.decoderCounters.e;
    }
}
