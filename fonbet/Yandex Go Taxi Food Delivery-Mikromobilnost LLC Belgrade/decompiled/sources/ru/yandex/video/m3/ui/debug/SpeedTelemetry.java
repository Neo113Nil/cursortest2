package ru.yandex.video.m3.ui.debug;

import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lru/yandex/video/m3/ui/debug/SpeedTelemetry;", "", "uuid", "", "blurShown", "", "imageShown", "firstFrameShown", "totalTime", "eventReason", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getBlurShown", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEventReason", "()Ljava/lang/String;", "getFirstFrameShown", "getImageShown", "getTotalTime", "getUuid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lru/yandex/video/m3/ui/debug/SpeedTelemetry;", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SpeedTelemetry {
    public static final int $stable = 0;
    private final Long blurShown;
    private final String eventReason;
    private final Long firstFrameShown;
    private final Long imageShown;
    private final Long totalTime;
    private final String uuid;

    public /* synthetic */ SpeedTelemetry(String str, Long l, Long l2, Long l3, Long l4, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : l4, (i & 32) != 0 ? null : str2);
    }

    public static /* synthetic */ SpeedTelemetry copy$default(SpeedTelemetry speedTelemetry, String str, Long l, Long l2, Long l3, Long l4, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = speedTelemetry.uuid;
        }
        if ((i & 2) != 0) {
            l = speedTelemetry.blurShown;
        }
        if ((i & 4) != 0) {
            l2 = speedTelemetry.imageShown;
        }
        if ((i & 8) != 0) {
            l3 = speedTelemetry.firstFrameShown;
        }
        if ((i & 16) != 0) {
            l4 = speedTelemetry.totalTime;
        }
        if ((i & 32) != 0) {
            str2 = speedTelemetry.eventReason;
        }
        Long l5 = l4;
        String str3 = str2;
        return speedTelemetry.copy(str, l, l2, l3, l5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getBlurShown() {
        return this.blurShown;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getImageShown() {
        return this.imageShown;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getFirstFrameShown() {
        return this.firstFrameShown;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getTotalTime() {
        return this.totalTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEventReason() {
        return this.eventReason;
    }

    public final SpeedTelemetry copy(String uuid, Long blurShown, Long imageShown, Long firstFrameShown, Long totalTime, String eventReason) {
        return new SpeedTelemetry(uuid, blurShown, imageShown, firstFrameShown, totalTime, eventReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedTelemetry)) {
            return false;
        }
        SpeedTelemetry speedTelemetry = (SpeedTelemetry) other;
        return jl40.l(this.uuid, speedTelemetry.uuid) && jl40.l(this.blurShown, speedTelemetry.blurShown) && jl40.l(this.imageShown, speedTelemetry.imageShown) && jl40.l(this.firstFrameShown, speedTelemetry.firstFrameShown) && jl40.l(this.totalTime, speedTelemetry.totalTime) && jl40.l(this.eventReason, speedTelemetry.eventReason);
    }

    public final Long getBlurShown() {
        return this.blurShown;
    }

    public final String getEventReason() {
        return this.eventReason;
    }

    public final Long getFirstFrameShown() {
        return this.firstFrameShown;
    }

    public final Long getImageShown() {
        return this.imageShown;
    }

    public final Long getTotalTime() {
        return this.totalTime;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.uuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.blurShown;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.imageShown;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.firstFrameShown;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.totalTime;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.eventReason;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SpeedTelemetry(uuid=");
        sb.append(this.uuid);
        sb.append(", blurShown=");
        sb.append(this.blurShown);
        sb.append(", imageShown=");
        sb.append(this.imageShown);
        sb.append(", firstFrameShown=");
        sb.append(this.firstFrameShown);
        sb.append(", totalTime=");
        sb.append(this.totalTime);
        sb.append(", eventReason=");
        return b64.p(sb, this.eventReason, ')');
    }

    public SpeedTelemetry(String str, Long l, Long l2, Long l3, Long l4, String str2) {
        this.uuid = str;
        this.blurShown = l;
        this.imageShown = l2;
        this.firstFrameShown = l3;
        this.totalTime = l4;
        this.eventReason = str2;
    }

    public SpeedTelemetry() {
        this(null, null, null, null, null, null, 63, null);
    }
}
