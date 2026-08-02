package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.jl40;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.dto.PlaybackOptions;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AbrPreferences;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\nB\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/VideoConfigData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "arguments", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "(Lru/yandex/video/m3/data/dto/PlaybackOptions;)V", ConfigConstants.CONFIG, "Lru/yandex/video/m3/player/impl/tracking/event/VideoConfigData$Config;", "(Lru/yandex/video/m3/player/impl/tracking/event/VideoConfigData$Config;)V", "getConfig", "()Lru/yandex/video/m3/player/impl/tracking/event/VideoConfigData$Config;", "Config", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoConfigData extends DefaultEventData {
    public static final int $stable = 8;
    private final Config config;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010\"\u001a\u00020\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J`\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/VideoConfigData$Config;", "", "contentId", "", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "startPosition", "", "autoPlay", "", "prepareIndex", "", "abrPreferences", "Lru/yandex/video/m3/player/AbrPreferences;", "startQualityConstraint", "(Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;ZLjava/lang/Integer;Lru/yandex/video/m3/player/AbrPreferences;Ljava/lang/Integer;)V", "getAbrPreferences", "()Lru/yandex/video/m3/player/AbrPreferences;", "getAutoPlay", "()Z", "getContentId", "()Ljava/lang/String;", "getPrepareIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartPosition", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStartQualityConstraint", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;ZLjava/lang/Integer;Lru/yandex/video/m3/player/AbrPreferences;Ljava/lang/Integer;)Lru/yandex/video/m3/player/impl/tracking/event/VideoConfigData$Config;", "equals", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Config {
        public static final int $stable = 8;
        private final AbrPreferences abrPreferences;
        private final boolean autoPlay;
        private final String contentId;
        private final Integer prepareIndex;
        private final Long startPosition;
        private final Integer startQualityConstraint;
        private final VideoData videoData;

        public Config(String str, VideoData videoData, Long l, boolean z, Integer num, AbrPreferences abrPreferences, Integer num2) {
            this.contentId = str;
            this.videoData = videoData;
            this.startPosition = l;
            this.autoPlay = z;
            this.prepareIndex = num;
            this.abrPreferences = abrPreferences;
            this.startQualityConstraint = num2;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, VideoData videoData, Long l, boolean z, Integer num, AbrPreferences abrPreferences, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = config.contentId;
            }
            if ((i & 2) != 0) {
                videoData = config.videoData;
            }
            if ((i & 4) != 0) {
                l = config.startPosition;
            }
            if ((i & 8) != 0) {
                z = config.autoPlay;
            }
            if ((i & 16) != 0) {
                num = config.prepareIndex;
            }
            if ((i & 32) != 0) {
                abrPreferences = config.abrPreferences;
            }
            if ((i & 64) != 0) {
                num2 = config.startQualityConstraint;
            }
            AbrPreferences abrPreferences2 = abrPreferences;
            Integer num3 = num2;
            Integer num4 = num;
            Long l2 = l;
            return config.copy(str, videoData, l2, z, num4, abrPreferences2, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentId() {
            return this.contentId;
        }

        /* renamed from: component2, reason: from getter */
        public final VideoData getVideoData() {
            return this.videoData;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getStartPosition() {
            return this.startPosition;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAutoPlay() {
            return this.autoPlay;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getPrepareIndex() {
            return this.prepareIndex;
        }

        /* renamed from: component6, reason: from getter */
        public final AbrPreferences getAbrPreferences() {
            return this.abrPreferences;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getStartQualityConstraint() {
            return this.startQualityConstraint;
        }

        public final Config copy(String contentId, VideoData videoData, Long startPosition, boolean autoPlay, Integer prepareIndex, AbrPreferences abrPreferences, Integer startQualityConstraint) {
            return new Config(contentId, videoData, startPosition, autoPlay, prepareIndex, abrPreferences, startQualityConstraint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return jl40.l(this.contentId, config.contentId) && jl40.l(this.videoData, config.videoData) && jl40.l(this.startPosition, config.startPosition) && this.autoPlay == config.autoPlay && jl40.l(this.prepareIndex, config.prepareIndex) && jl40.l(this.abrPreferences, config.abrPreferences) && jl40.l(this.startQualityConstraint, config.startQualityConstraint);
        }

        public final AbrPreferences getAbrPreferences() {
            return this.abrPreferences;
        }

        public final boolean getAutoPlay() {
            return this.autoPlay;
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final Integer getPrepareIndex() {
            return this.prepareIndex;
        }

        public final Long getStartPosition() {
            return this.startPosition;
        }

        public final Integer getStartQualityConstraint() {
            return this.startQualityConstraint;
        }

        public final VideoData getVideoData() {
            return this.videoData;
        }

        public int hashCode() {
            String str = this.contentId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            VideoData videoData = this.videoData;
            int hashCode2 = (hashCode + (videoData == null ? 0 : videoData.hashCode())) * 31;
            Long l = this.startPosition;
            int e = unr0.e((hashCode2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.autoPlay);
            Integer num = this.prepareIndex;
            int hashCode3 = (e + (num == null ? 0 : num.hashCode())) * 31;
            AbrPreferences abrPreferences = this.abrPreferences;
            int hashCode4 = (hashCode3 + (abrPreferences == null ? 0 : abrPreferences.hashCode())) * 31;
            Integer num2 = this.startQualityConstraint;
            return hashCode4 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Config(contentId=");
            sb.append(this.contentId);
            sb.append(", videoData=");
            sb.append(this.videoData);
            sb.append(", startPosition=");
            sb.append(this.startPosition);
            sb.append(", autoPlay=");
            sb.append(this.autoPlay);
            sb.append(", prepareIndex=");
            sb.append(this.prepareIndex);
            sb.append(", abrPreferences=");
            sb.append(this.abrPreferences);
            sb.append(", startQualityConstraint=");
            return vfc.o(sb, this.startQualityConstraint, ')');
        }
    }

    public VideoConfigData(PlaybackOptions playbackOptions) {
        this(new Config(playbackOptions.getContentId(), playbackOptions.getVideoData(), playbackOptions.getStartPosition(), playbackOptions.getAutoPlay(), playbackOptions.getPrepareIndex(), playbackOptions.getAbrPreferences(), playbackOptions.getStartQualityConstraint()));
    }

    public final Config getConfig() {
        return this.config;
    }

    public VideoConfigData(Config config) {
        super(null, 1, null);
        this.config = config;
    }
}
