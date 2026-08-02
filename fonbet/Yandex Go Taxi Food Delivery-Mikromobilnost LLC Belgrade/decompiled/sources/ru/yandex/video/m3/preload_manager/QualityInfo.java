package ru.yandex.video.m3.preload_manager;

import defpackage.jl40;
import defpackage.vfc;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B%\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/preload_manager/QualityInfo;", "", "width", "", "height", "bitrate", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getWidth", "equals", "", "other", "hashCode", "toString", "", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class QualityInfo {
    public static final int $stable = 0;

    @ysq0("bitrate")
    private final Integer bitrate;

    @ysq0("height")
    private final Integer height;

    @ysq0("width")
    private final Integer width;

    private QualityInfo(Integer num, Integer num2, Integer num3) {
        this.width = num;
        this.height = num2;
        this.bitrate = num3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!QualityInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        QualityInfo qualityInfo = (QualityInfo) other;
        return jl40.l(this.width, qualityInfo.width) && jl40.l(this.height, qualityInfo.height) && jl40.l(this.bitrate, qualityInfo.bitrate);
    }

    public final Integer getBitrate() {
        return this.bitrate;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        Integer num = this.width;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.height;
        int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.bitrate;
        return intValue2 + (num3 != null ? num3.intValue() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QualityInfo(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", bitrate=");
        return vfc.o(sb, this.bitrate, ')');
    }

    public /* synthetic */ QualityInfo(Integer num, Integer num2, Integer num3, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, num3);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B%\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\r\u0010\u0013\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\r¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/preload_manager/QualityInfo$Builder;", "", "qualityInfo", "Lru/yandex/video/m3/preload_manager/QualityInfo;", "(Lru/yandex/video/m3/preload_manager/QualityInfo;)V", "width", "", "height", "bitrate", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBitrate", "()Ljava/lang/Integer;", "setBitrate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHeight", "setHeight", "getWidth", "setWidth", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Integer bitrate;
        private Integer height;
        private Integer width;

        public Builder(QualityInfo qualityInfo) {
            this(qualityInfo.getWidth(), qualityInfo.getHeight(), qualityInfo.getBitrate());
        }

        public final QualityInfo build$video_player_internalRelease() {
            return new QualityInfo(this.width, this.height, this.bitrate, null);
        }

        public final Integer getBitrate() {
            return this.bitrate;
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public final void setBitrate(Integer num) {
            this.bitrate = num;
        }

        public final void setHeight(Integer num) {
            this.height = num;
        }

        public final void setWidth(Integer num) {
            this.width = num;
        }

        public Builder(Integer num, Integer num2, Integer num3) {
            this.width = num;
            this.height = num2;
            this.bitrate = num3;
        }
    }
}
