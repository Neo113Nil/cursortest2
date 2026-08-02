package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.unr0;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/LoadedChunk;", "", ClidProvider.TIMESTAMP, "", "isSuccessful", "", "(JZ)V", "()Z", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LoadedChunk {
    public static final int $stable = 0;
    private final boolean isSuccessful;
    private final long timestamp;

    public LoadedChunk(long j, boolean z) {
        this.timestamp = j;
        this.isSuccessful = z;
    }

    public static /* synthetic */ LoadedChunk copy$default(LoadedChunk loadedChunk, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = loadedChunk.timestamp;
        }
        if ((i & 2) != 0) {
            z = loadedChunk.isSuccessful;
        }
        return loadedChunk.copy(j, z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    public final LoadedChunk copy(long timestamp, boolean isSuccessful) {
        return new LoadedChunk(timestamp, isSuccessful);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadedChunk)) {
            return false;
        }
        LoadedChunk loadedChunk = (LoadedChunk) other;
        return this.timestamp == loadedChunk.timestamp && this.isSuccessful == loadedChunk.isSuccessful;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSuccessful) + (Long.hashCode(this.timestamp) * 31);
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadedChunk(timestamp=");
        sb.append(this.timestamp);
        sb.append(", isSuccessful=");
        return unr0.u(sb, this.isSuccessful, ')');
    }
}
