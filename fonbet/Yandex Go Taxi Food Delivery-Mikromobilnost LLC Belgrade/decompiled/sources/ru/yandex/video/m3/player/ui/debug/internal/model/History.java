package ru.yandex.video.m3.player.ui.debug.internal.model;

import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.ui.debug.model.BandwidthEstimation;
import ru.yandex.video.m3.player.ui.debug.model.BufferSize;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;
import ru.yandex.video.m3.player.ui.debug.model.LoadedChunk;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/model/History;", "", "lastBandwidthEstimation", "Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "lastLoadedChunk", "Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "bytesLoaded", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "currentBufferSize", "Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "(Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;Lru/yandex/video/m3/player/ui/debug/model/BufferSize;)V", "getBytesLoaded", "()Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "getCurrentBufferSize", "()Lru/yandex/video/m3/player/ui/debug/model/BufferSize;", "getLastBandwidthEstimation", "()Lru/yandex/video/m3/player/ui/debug/model/BandwidthEstimation;", "getLastLoadedChunk", "()Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class History {
    public static final int $stable = 0;
    private final BytesLoaded bytesLoaded;
    private final BufferSize currentBufferSize;
    private final BandwidthEstimation lastBandwidthEstimation;
    private final LoadedChunk lastLoadedChunk;

    public /* synthetic */ History(BandwidthEstimation bandwidthEstimation, LoadedChunk loadedChunk, BytesLoaded bytesLoaded, BufferSize bufferSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bandwidthEstimation, (i & 2) != 0 ? null : loadedChunk, (i & 4) != 0 ? null : bytesLoaded, (i & 8) != 0 ? null : bufferSize);
    }

    public static /* synthetic */ History copy$default(History history, BandwidthEstimation bandwidthEstimation, LoadedChunk loadedChunk, BytesLoaded bytesLoaded, BufferSize bufferSize, int i, Object obj) {
        if ((i & 1) != 0) {
            bandwidthEstimation = history.lastBandwidthEstimation;
        }
        if ((i & 2) != 0) {
            loadedChunk = history.lastLoadedChunk;
        }
        if ((i & 4) != 0) {
            bytesLoaded = history.bytesLoaded;
        }
        if ((i & 8) != 0) {
            bufferSize = history.currentBufferSize;
        }
        return history.copy(bandwidthEstimation, loadedChunk, bytesLoaded, bufferSize);
    }

    /* renamed from: component1, reason: from getter */
    public final BandwidthEstimation getLastBandwidthEstimation() {
        return this.lastBandwidthEstimation;
    }

    /* renamed from: component2, reason: from getter */
    public final LoadedChunk getLastLoadedChunk() {
        return this.lastLoadedChunk;
    }

    /* renamed from: component3, reason: from getter */
    public final BytesLoaded getBytesLoaded() {
        return this.bytesLoaded;
    }

    /* renamed from: component4, reason: from getter */
    public final BufferSize getCurrentBufferSize() {
        return this.currentBufferSize;
    }

    public final History copy(BandwidthEstimation lastBandwidthEstimation, LoadedChunk lastLoadedChunk, BytesLoaded bytesLoaded, BufferSize currentBufferSize) {
        return new History(lastBandwidthEstimation, lastLoadedChunk, bytesLoaded, currentBufferSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof History)) {
            return false;
        }
        History history = (History) other;
        return jl40.l(this.lastBandwidthEstimation, history.lastBandwidthEstimation) && jl40.l(this.lastLoadedChunk, history.lastLoadedChunk) && jl40.l(this.bytesLoaded, history.bytesLoaded) && jl40.l(this.currentBufferSize, history.currentBufferSize);
    }

    public final BytesLoaded getBytesLoaded() {
        return this.bytesLoaded;
    }

    public final BufferSize getCurrentBufferSize() {
        return this.currentBufferSize;
    }

    public final BandwidthEstimation getLastBandwidthEstimation() {
        return this.lastBandwidthEstimation;
    }

    public final LoadedChunk getLastLoadedChunk() {
        return this.lastLoadedChunk;
    }

    public int hashCode() {
        BandwidthEstimation bandwidthEstimation = this.lastBandwidthEstimation;
        int hashCode = (bandwidthEstimation == null ? 0 : bandwidthEstimation.hashCode()) * 31;
        LoadedChunk loadedChunk = this.lastLoadedChunk;
        int hashCode2 = (hashCode + (loadedChunk == null ? 0 : loadedChunk.hashCode())) * 31;
        BytesLoaded bytesLoaded = this.bytesLoaded;
        int hashCode3 = (hashCode2 + (bytesLoaded == null ? 0 : bytesLoaded.hashCode())) * 31;
        BufferSize bufferSize = this.currentBufferSize;
        return hashCode3 + (bufferSize != null ? bufferSize.hashCode() : 0);
    }

    public String toString() {
        return "History(lastBandwidthEstimation=" + this.lastBandwidthEstimation + ", lastLoadedChunk=" + this.lastLoadedChunk + ", bytesLoaded=" + this.bytesLoaded + ", currentBufferSize=" + this.currentBufferSize + ')';
    }

    public History(BandwidthEstimation bandwidthEstimation, LoadedChunk loadedChunk, BytesLoaded bytesLoaded, BufferSize bufferSize) {
        this.lastBandwidthEstimation = bandwidthEstimation;
        this.lastLoadedChunk = loadedChunk;
        this.bytesLoaded = bytesLoaded;
        this.currentBufferSize = bufferSize;
    }

    public History() {
        this(null, null, null, null, 15, null);
    }
}
