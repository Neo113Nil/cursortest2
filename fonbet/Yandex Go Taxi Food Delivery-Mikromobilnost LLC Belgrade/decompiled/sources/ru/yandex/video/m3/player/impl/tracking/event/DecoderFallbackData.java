package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.CodecInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/DecoderFallbackData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "failedDecoders", "", "Lru/yandex/video/m3/data/CodecInfo;", "usedDecoder", "(Ljava/util/List;Lru/yandex/video/m3/data/CodecInfo;)V", "getFailedDecoders", "()Ljava/util/List;", "getUsedDecoder", "()Lru/yandex/video/m3/data/CodecInfo;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DecoderFallbackData extends DefaultEventData {
    public static final int $stable = 8;
    private final List<CodecInfo> failedDecoders;
    private final CodecInfo usedDecoder;

    public DecoderFallbackData(List<CodecInfo> list, CodecInfo codecInfo) {
        super(null, 1, null);
        this.failedDecoders = list;
        this.usedDecoder = codecInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DecoderFallbackData copy$default(DecoderFallbackData decoderFallbackData, List list, CodecInfo codecInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = decoderFallbackData.failedDecoders;
        }
        if ((i & 2) != 0) {
            codecInfo = decoderFallbackData.usedDecoder;
        }
        return decoderFallbackData.copy(list, codecInfo);
    }

    public final List<CodecInfo> component1() {
        return this.failedDecoders;
    }

    /* renamed from: component2, reason: from getter */
    public final CodecInfo getUsedDecoder() {
        return this.usedDecoder;
    }

    public final DecoderFallbackData copy(List<CodecInfo> failedDecoders, CodecInfo usedDecoder) {
        return new DecoderFallbackData(failedDecoders, usedDecoder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DecoderFallbackData)) {
            return false;
        }
        DecoderFallbackData decoderFallbackData = (DecoderFallbackData) other;
        return jl40.l(this.failedDecoders, decoderFallbackData.failedDecoders) && jl40.l(this.usedDecoder, decoderFallbackData.usedDecoder);
    }

    public final List<CodecInfo> getFailedDecoders() {
        return this.failedDecoders;
    }

    public final CodecInfo getUsedDecoder() {
        return this.usedDecoder;
    }

    public int hashCode() {
        return this.usedDecoder.hashCode() + (this.failedDecoders.hashCode() * 31);
    }

    public String toString() {
        return "DecoderFallbackData(failedDecoders=" + this.failedDecoders + ", usedDecoder=" + this.usedDecoder + ')';
    }
}
