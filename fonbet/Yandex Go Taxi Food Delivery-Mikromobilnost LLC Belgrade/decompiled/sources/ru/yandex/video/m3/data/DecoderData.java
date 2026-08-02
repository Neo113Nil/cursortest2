package ru.yandex.video.m3.data;

import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/data/DecoderData;", "", "videoDecoder", "Lru/yandex/video/m3/data/Decoder;", "audioDecoder", "(Lru/yandex/video/m3/data/Decoder;Lru/yandex/video/m3/data/Decoder;)V", "getAudioDecoder", "()Lru/yandex/video/m3/data/Decoder;", "getVideoDecoder", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DecoderData {
    public static final int $stable = 0;
    private final Decoder audioDecoder;
    private final Decoder videoDecoder;

    public DecoderData(Decoder decoder, Decoder decoder2) {
        this.videoDecoder = decoder;
        this.audioDecoder = decoder2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DecoderData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DecoderData decoderData = (DecoderData) other;
        return jl40.l(this.videoDecoder, decoderData.videoDecoder) && jl40.l(this.audioDecoder, decoderData.audioDecoder);
    }

    public final Decoder getAudioDecoder() {
        return this.audioDecoder;
    }

    public final Decoder getVideoDecoder() {
        return this.videoDecoder;
    }

    public int hashCode() {
        Decoder decoder = this.videoDecoder;
        int hashCode = (decoder != null ? decoder.hashCode() : 0) * 31;
        Decoder decoder2 = this.audioDecoder;
        return hashCode + (decoder2 != null ? decoder2.hashCode() : 0);
    }

    public String toString() {
        return "DecoderData(videoDecoder=" + this.videoDecoder + ", audioDecoder=" + this.audioDecoder + ')';
    }
}
