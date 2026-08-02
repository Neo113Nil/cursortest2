package ru.yandex.video.m3.ui.debug;

import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/ui/debug/StartBitrateDataHolder;", "", "uuid", "", "bitrate", "", "(Ljava/lang/String;I)V", "getBitrate", "()I", "getUuid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StartBitrateDataHolder {
    public static final int $stable = 0;
    private final int bitrate;
    private final String uuid;

    public StartBitrateDataHolder(String str, int i) {
        this.uuid = str;
        this.bitrate = i;
    }

    public static /* synthetic */ StartBitrateDataHolder copy$default(StartBitrateDataHolder startBitrateDataHolder, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = startBitrateDataHolder.uuid;
        }
        if ((i2 & 2) != 0) {
            i = startBitrateDataHolder.bitrate;
        }
        return startBitrateDataHolder.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    public final StartBitrateDataHolder copy(String uuid, int bitrate) {
        return new StartBitrateDataHolder(uuid, bitrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartBitrateDataHolder)) {
            return false;
        }
        StartBitrateDataHolder startBitrateDataHolder = (StartBitrateDataHolder) other;
        return jl40.l(this.uuid, startBitrateDataHolder.uuid) && this.bitrate == startBitrateDataHolder.bitrate;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Integer.hashCode(this.bitrate) + (this.uuid.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartBitrateDataHolder(uuid=");
        sb.append(this.uuid);
        sb.append(", bitrate=");
        return oyr.s(sb, this.bitrate, ')');
    }
}
