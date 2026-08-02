package ru.yandex.video.m3.model.config.download;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.model.config.download.DownloaderConfig;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001!B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/yandex/video/m3/model/config/download/DownloaderConfig;", "", "", "maxSegmentsCount", "sourceIndex", "", "vsid", "", "startPositionMs", "<init>", "(IILjava/lang/String;J)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/download/DownloaderConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/download/DownloaderConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", CA20Status.STATUS_USER_I, "getMaxSegmentsCount", "getSourceIndex", "Ljava/lang/String;", "getVsid", "J", "getStartPositionMs", "()J", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DownloaderConfig {
    public static final int $stable = 0;
    private final int maxSegmentsCount;
    private final int sourceIndex;
    private final long startPositionMs;
    private final String vsid;

    private DownloaderConfig(int i, int i2, String str, long j) {
        this.maxSegmentsCount = i;
        this.sourceIndex = i2;
        this.vsid = str;
        this.startPositionMs = j;
    }

    public static /* synthetic */ DownloaderConfig copy$default(DownloaderConfig downloaderConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.download.DownloaderConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DownloaderConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DownloaderConfig.Builder builder) {
                }
            };
        }
        return downloaderConfig.copy(tlsVar);
    }

    public final DownloaderConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DownloaderConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        DownloaderConfig downloaderConfig = (DownloaderConfig) other;
        return this.maxSegmentsCount == downloaderConfig.maxSegmentsCount && this.sourceIndex == downloaderConfig.sourceIndex && jl40.l(this.vsid, downloaderConfig.vsid) && this.startPositionMs == downloaderConfig.startPositionMs;
    }

    public final int getMaxSegmentsCount() {
        return this.maxSegmentsCount;
    }

    public final int getSourceIndex() {
        return this.sourceIndex;
    }

    public final long getStartPositionMs() {
        return this.startPositionMs;
    }

    public final String getVsid() {
        return this.vsid;
    }

    public int hashCode() {
        int b = oyr.b(this.sourceIndex, this.maxSegmentsCount * 31, 31);
        String str = this.vsid;
        return Long.hashCode(this.startPositionMs) + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloaderConfig(maxSegmentsCount=");
        sb.append(this.maxSegmentsCount);
        sb.append(", sourceIndex=");
        sb.append(this.sourceIndex);
        sb.append(", vsid=");
        sb.append(this.vsid);
        sb.append(", startPosition=");
        return b64.o(sb, this.startPositionMs, ')');
    }

    public /* synthetic */ DownloaderConfig(int i, int i2, String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, j);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/model/config/download/DownloaderConfig$Builder;", "", "downloaderConfig", "Lru/yandex/video/m3/model/config/download/DownloaderConfig;", "(Lru/yandex/video/m3/model/config/download/DownloaderConfig;)V", "()V", "maxSegmentsCount", "", "getMaxSegmentsCount", "()Ljava/lang/Integer;", "setMaxSegmentsCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sourceIndex", "getSourceIndex", "setSourceIndex", "startPositionMs", "", "getStartPositionMs", "()Ljava/lang/Long;", "setStartPositionMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "vsid", "", "getVsid", "()Ljava/lang/String;", "setVsid", "(Ljava/lang/String;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Integer maxSegmentsCount;
        private Integer sourceIndex;
        private Long startPositionMs;
        private String vsid;

        public Builder(DownloaderConfig downloaderConfig) {
            this();
            this.maxSegmentsCount = Integer.valueOf(downloaderConfig.getMaxSegmentsCount());
            this.sourceIndex = Integer.valueOf(downloaderConfig.getSourceIndex());
            this.vsid = downloaderConfig.getVsid();
            this.startPositionMs = Long.valueOf(downloaderConfig.getStartPositionMs());
        }

        public final DownloaderConfig build$video_player_internalRelease() {
            Integer num = this.maxSegmentsCount;
            int intValue = num != null ? num.intValue() : -1;
            Integer num2 = this.sourceIndex;
            int intValue2 = num2 != null ? num2.intValue() : -1;
            String str = this.vsid;
            Long l = this.startPositionMs;
            return new DownloaderConfig(intValue, intValue2, str, l != null ? l.longValue() : -9223372036854775807L, null);
        }

        public final Integer getMaxSegmentsCount() {
            return this.maxSegmentsCount;
        }

        public final Integer getSourceIndex() {
            return this.sourceIndex;
        }

        public final Long getStartPositionMs() {
            return this.startPositionMs;
        }

        public final String getVsid() {
            return this.vsid;
        }

        public final void setMaxSegmentsCount(Integer num) {
            this.maxSegmentsCount = num;
        }

        public final void setSourceIndex(Integer num) {
            this.sourceIndex = num;
        }

        public final void setStartPositionMs(Long l) {
            this.startPositionMs = l;
        }

        public final void setVsid(String str) {
            this.vsid = str;
        }

        public Builder() {
        }
    }
}
