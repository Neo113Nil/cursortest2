package ru.yandex.video.m3.preload_manager;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.preload_manager.PreloadConfig;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001:\u0001=B\u008b\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bj\u0004\u0018\u0001`\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010*R+\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b2\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b\u0010\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b9\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadConfig;", "", "", "maxDownloadBytes", "", "maxDownloadSegmentCount", "maxWidth", "maxHeight", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "vsid", "sourceIndex", "", "omitAudio", "isForceRefresh", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "experimentalPreloadLiveDashConfig", "startPosition", "Lru/yandex/video/m3/player/IndexGenerator;", "eventIndexGenerator", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ZZLru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;JLru/yandex/video/m3/player/IndexGenerator;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/preload_manager/PreloadConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/preload_manager/PreloadConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "J", "getMaxDownloadBytes", "()J", "Ljava/lang/Integer;", "getMaxDownloadSegmentCount", "()Ljava/lang/Integer;", "getMaxWidth", "getMaxHeight", "Ljava/util/Map;", "getAdditionalParameters", "()Ljava/util/Map;", "Ljava/lang/String;", "getVsid", "getSourceIndex", "Z", "getOmitAudio", "()Z", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "getExperimentalPreloadLiveDashConfig", "()Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "getStartPosition", "Lru/yandex/video/m3/player/IndexGenerator;", "getEventIndexGenerator$video_player_internalRelease", "()Lru/yandex/video/m3/player/IndexGenerator;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadConfig {
    public static final int $stable = 8;
    private final Map<String, Object> additionalParameters;
    private final IndexGenerator eventIndexGenerator;
    private final PreloadLiveDashConfig experimentalPreloadLiveDashConfig;
    private final boolean isForceRefresh;
    private final long maxDownloadBytes;
    private final Integer maxDownloadSegmentCount;
    private final Integer maxHeight;
    private final Integer maxWidth;
    private final boolean omitAudio;
    private final Integer sourceIndex;
    private final long startPosition;
    private final String vsid;

    private PreloadConfig(long j, Integer num, Integer num2, Integer num3, Map<String, ? extends Object> map, String str, Integer num4, boolean z, boolean z2, PreloadLiveDashConfig preloadLiveDashConfig, long j2, IndexGenerator indexGenerator) {
        this.maxDownloadBytes = j;
        this.maxDownloadSegmentCount = num;
        this.maxWidth = num2;
        this.maxHeight = num3;
        this.additionalParameters = map;
        this.vsid = str;
        this.sourceIndex = num4;
        this.omitAudio = z;
        this.isForceRefresh = z2;
        this.experimentalPreloadLiveDashConfig = preloadLiveDashConfig;
        this.startPosition = j2;
        this.eventIndexGenerator = indexGenerator;
    }

    public static /* synthetic */ PreloadConfig copy$default(PreloadConfig preloadConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.preload_manager.PreloadConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PreloadConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PreloadConfig.Builder builder) {
                }
            };
        }
        return preloadConfig.copy(tlsVar);
    }

    public final PreloadConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PreloadConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PreloadConfig preloadConfig = (PreloadConfig) other;
        return this.maxDownloadBytes == preloadConfig.maxDownloadBytes && jl40.l(this.maxDownloadSegmentCount, preloadConfig.maxDownloadSegmentCount) && jl40.l(this.maxWidth, preloadConfig.maxWidth) && jl40.l(this.maxHeight, preloadConfig.maxHeight) && jl40.l(this.sourceIndex, preloadConfig.sourceIndex) && this.omitAudio == preloadConfig.omitAudio && this.isForceRefresh == preloadConfig.isForceRefresh && this.startPosition == preloadConfig.startPosition && jl40.l(this.additionalParameters, preloadConfig.additionalParameters) && jl40.l(this.vsid, preloadConfig.vsid) && jl40.l(this.experimentalPreloadLiveDashConfig, preloadConfig.experimentalPreloadLiveDashConfig) && jl40.l(this.eventIndexGenerator, preloadConfig.eventIndexGenerator);
    }

    public final Map<String, Object> getAdditionalParameters() {
        return this.additionalParameters;
    }

    /* renamed from: getEventIndexGenerator$video_player_internalRelease, reason: from getter */
    public final IndexGenerator getEventIndexGenerator() {
        return this.eventIndexGenerator;
    }

    public final PreloadLiveDashConfig getExperimentalPreloadLiveDashConfig() {
        return this.experimentalPreloadLiveDashConfig;
    }

    public final long getMaxDownloadBytes() {
        return this.maxDownloadBytes;
    }

    public final Integer getMaxDownloadSegmentCount() {
        return this.maxDownloadSegmentCount;
    }

    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    public final boolean getOmitAudio() {
        return this.omitAudio;
    }

    public final Integer getSourceIndex() {
        return this.sourceIndex;
    }

    public final long getStartPosition() {
        return this.startPosition;
    }

    public final String getVsid() {
        return this.vsid;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.maxDownloadBytes) * 31;
        Integer num = this.maxDownloadSegmentCount;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.maxWidth;
        int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.maxHeight;
        int intValue3 = (intValue2 + (num3 != null ? num3.intValue() : 0)) * 31;
        Integer num4 = this.sourceIndex;
        int c = qv10.c(unr0.e(unr0.e((intValue3 + (num4 != null ? num4.intValue() : 0)) * 31, 31, this.omitAudio), 31, this.isForceRefresh), 31, this.startPosition);
        Map<String, Object> map = this.additionalParameters;
        int hashCode2 = (c + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.vsid;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        PreloadLiveDashConfig preloadLiveDashConfig = this.experimentalPreloadLiveDashConfig;
        int hashCode4 = (hashCode3 + (preloadLiveDashConfig != null ? preloadLiveDashConfig.hashCode() : 0)) * 31;
        IndexGenerator indexGenerator = this.eventIndexGenerator;
        return hashCode4 + (indexGenerator != null ? indexGenerator.hashCode() : 0);
    }

    /* renamed from: isForceRefresh, reason: from getter */
    public final boolean getIsForceRefresh() {
        return this.isForceRefresh;
    }

    public String toString() {
        return "PreloadConfig(maxDownloadBytes=" + this.maxDownloadBytes + ", maxDownloadSegmentCount=" + this.maxDownloadSegmentCount + ", maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + ", additionalParameters=" + this.additionalParameters + ", vsid=" + this.vsid + ", sourceIndex=" + this.sourceIndex + ", omitAudio=" + this.omitAudio + ", isForceRefresh=" + this.isForceRefresh + ", experimentalPreloadLiveDashConfig=" + this.experimentalPreloadLiveDashConfig + ", startPosition=" + this.startPosition + ", eventIndexGenerator=" + this.eventIndexGenerator + ')';
    }

    public /* synthetic */ PreloadConfig(long j, Integer num, Integer num2, Integer num3, Map map, String str, Integer num4, boolean z, boolean z2, PreloadLiveDashConfig preloadLiveDashConfig, long j2, IndexGenerator indexGenerator, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, num, num2, num3, map, str, num4, z, z2, preloadLiveDashConfig, j2, indexGenerator);
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010C\u001a\u00020\u0003H\u0000¢\u0006\u0002\bDR.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tj\u0004\u0018\u0001`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u0007R\u001e\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010,\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001e\u0010/\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R\u001e\u00102\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\u001e\u00105\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b6\u0010(\"\u0004\b7\u0010*R\u001e\u00108\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010=\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010>\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadConfig$Builder;", "", "preloadConfig", "Lru/yandex/video/m3/preload_manager/PreloadConfig;", "(Lru/yandex/video/m3/preload_manager/PreloadConfig;)V", "maxDownloadBytes", "", "(J)V", "additionalParameters", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "getAdditionalParameters", "()Ljava/util/Map;", "setAdditionalParameters", "(Ljava/util/Map;)V", "eventIndexGenerator", "Lru/yandex/video/m3/player/IndexGenerator;", "getEventIndexGenerator$video_player_internalRelease", "()Lru/yandex/video/m3/player/IndexGenerator;", "setEventIndexGenerator$video_player_internalRelease", "(Lru/yandex/video/m3/player/IndexGenerator;)V", "experimentalPreloadLiveDashConfig", "Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "getExperimentalPreloadLiveDashConfig", "()Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;", "setExperimentalPreloadLiveDashConfig", "(Lru/yandex/video/m3/model/config/mediasource/PreloadLiveDashConfig;)V", "isForceRefresh", "", "()Ljava/lang/Boolean;", "setForceRefresh", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMaxDownloadBytes", "()J", "setMaxDownloadBytes", "maxDownloadSegmentCount", "", "getMaxDownloadSegmentCount", "()Ljava/lang/Integer;", "setMaxDownloadSegmentCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "maxHeight", "getMaxHeight", "setMaxHeight", "maxWidth", "getMaxWidth", "setMaxWidth", "omitAudio", "getOmitAudio", "setOmitAudio", "sourceIndex", "getSourceIndex", "setSourceIndex", "startPosition", "getStartPosition", "()Ljava/lang/Long;", "setStartPosition", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "vsid", "getVsid", "()Ljava/lang/String;", "setVsid", "(Ljava/lang/String;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Map<String, ? extends Object> additionalParameters;
        private IndexGenerator eventIndexGenerator;
        private PreloadLiveDashConfig experimentalPreloadLiveDashConfig;
        private Boolean isForceRefresh;
        private long maxDownloadBytes;
        private Integer maxDownloadSegmentCount;
        private Integer maxHeight;
        private Integer maxWidth;
        private Boolean omitAudio;
        private Integer sourceIndex;
        private Long startPosition;
        private String vsid;

        public Builder(PreloadConfig preloadConfig) {
            this(preloadConfig.getMaxDownloadBytes());
            this.maxDownloadSegmentCount = preloadConfig.getMaxDownloadSegmentCount();
            this.maxWidth = preloadConfig.getMaxWidth();
            this.maxHeight = preloadConfig.getMaxHeight();
            this.additionalParameters = preloadConfig.getAdditionalParameters();
            this.vsid = preloadConfig.getVsid();
            this.sourceIndex = preloadConfig.getSourceIndex();
            this.omitAudio = Boolean.valueOf(preloadConfig.getOmitAudio());
            this.isForceRefresh = Boolean.valueOf(preloadConfig.getIsForceRefresh());
            this.experimentalPreloadLiveDashConfig = preloadConfig.getExperimentalPreloadLiveDashConfig();
            this.eventIndexGenerator = preloadConfig.getEventIndexGenerator();
            this.startPosition = Long.valueOf(preloadConfig.getStartPosition());
        }

        public final PreloadConfig build$video_player_internalRelease() {
            long j = this.maxDownloadBytes;
            Integer num = this.maxDownloadSegmentCount;
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            Integer num2 = this.maxWidth;
            Integer num3 = this.maxHeight;
            Map<String, ? extends Object> map = this.additionalParameters;
            String str = this.vsid;
            Integer num4 = this.sourceIndex;
            Boolean bool = this.omitAudio;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.isForceRefresh;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            PreloadLiveDashConfig preloadLiveDashConfig = this.experimentalPreloadLiveDashConfig;
            Long l = this.startPosition;
            return new PreloadConfig(j, valueOf, num2, num3, map, str, num4, booleanValue, booleanValue2, preloadLiveDashConfig, l != null ? l.longValue() : -9223372036854775807L, this.eventIndexGenerator, null);
        }

        public final Map<String, Object> getAdditionalParameters() {
            return this.additionalParameters;
        }

        /* renamed from: getEventIndexGenerator$video_player_internalRelease, reason: from getter */
        public final IndexGenerator getEventIndexGenerator() {
            return this.eventIndexGenerator;
        }

        public final PreloadLiveDashConfig getExperimentalPreloadLiveDashConfig() {
            return this.experimentalPreloadLiveDashConfig;
        }

        public final long getMaxDownloadBytes() {
            return this.maxDownloadBytes;
        }

        public final Integer getMaxDownloadSegmentCount() {
            return this.maxDownloadSegmentCount;
        }

        public final Integer getMaxHeight() {
            return this.maxHeight;
        }

        public final Integer getMaxWidth() {
            return this.maxWidth;
        }

        public final Boolean getOmitAudio() {
            return this.omitAudio;
        }

        public final Integer getSourceIndex() {
            return this.sourceIndex;
        }

        public final Long getStartPosition() {
            return this.startPosition;
        }

        public final String getVsid() {
            return this.vsid;
        }

        /* renamed from: isForceRefresh, reason: from getter */
        public final Boolean getIsForceRefresh() {
            return this.isForceRefresh;
        }

        public final void setAdditionalParameters(Map<String, ? extends Object> map) {
            this.additionalParameters = map;
        }

        public final void setEventIndexGenerator$video_player_internalRelease(IndexGenerator indexGenerator) {
            this.eventIndexGenerator = indexGenerator;
        }

        public final void setExperimentalPreloadLiveDashConfig(PreloadLiveDashConfig preloadLiveDashConfig) {
            this.experimentalPreloadLiveDashConfig = preloadLiveDashConfig;
        }

        public final void setForceRefresh(Boolean bool) {
            this.isForceRefresh = bool;
        }

        public final void setMaxDownloadBytes(long j) {
            this.maxDownloadBytes = j;
        }

        public final void setMaxDownloadSegmentCount(Integer num) {
            this.maxDownloadSegmentCount = num;
        }

        public final void setMaxHeight(Integer num) {
            this.maxHeight = num;
        }

        public final void setMaxWidth(Integer num) {
            this.maxWidth = num;
        }

        public final void setOmitAudio(Boolean bool) {
            this.omitAudio = bool;
        }

        public final void setSourceIndex(Integer num) {
            this.sourceIndex = num;
        }

        public final void setStartPosition(Long l) {
            this.startPosition = l;
        }

        public final void setVsid(String str) {
            this.vsid = str;
        }

        public Builder(long j) {
            this.maxDownloadBytes = j;
        }
    }
}
