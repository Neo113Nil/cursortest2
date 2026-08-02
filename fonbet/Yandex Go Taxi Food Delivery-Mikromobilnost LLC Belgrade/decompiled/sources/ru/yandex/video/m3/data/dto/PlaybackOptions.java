package ru.yandex.video.m3.data.dto;

import defpackage.jl40;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.AbrPreferences;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\"#B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u0014X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!\u0082\u0001\u0002$%¨\u0006&"}, d2 = {"Lru/yandex/video/m3/data/dto/PlaybackOptions;", "", "()V", "abrPreferences", "Lru/yandex/video/m3/player/AbrPreferences;", "getAbrPreferences", "()Lru/yandex/video/m3/player/AbrPreferences;", "adContentId", "", "getAdContentId", "()Ljava/lang/String;", "autoPlay", "", "getAutoPlay", "()Z", "contentId", "getContentId", "expandedManifestUrl", "getExpandedManifestUrl", "prepareIndex", "", "getPrepareIndex", "()Ljava/lang/Integer;", "startPosition", "", "getStartPosition", "()Ljava/lang/Long;", "startQualityConstraint", "getStartQualityConstraint", "Ljava/lang/Integer;", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "ContentIdPlaybackOptions", "DirectSourcePlaybackOptions", "Lru/yandex/video/m3/data/dto/PlaybackOptions$ContentIdPlaybackOptions;", "Lru/yandex/video/m3/data/dto/PlaybackOptions$DirectSourcePlaybackOptions;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PlaybackOptions {
    public static final int $stable = 8;
    private final AbrPreferences abrPreferences;
    private final String adContentId;
    private final String contentId;
    private final String expandedManifestUrl;
    private final Integer startQualityConstraint;
    private final VideoData videoData;

    public /* synthetic */ PlaybackOptions(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbrPreferences getAbrPreferences() {
        return this.abrPreferences;
    }

    public String getAdContentId() {
        return this.adContentId;
    }

    public abstract boolean getAutoPlay();

    public String getContentId() {
        return this.contentId;
    }

    public String getExpandedManifestUrl() {
        return this.expandedManifestUrl;
    }

    public abstract Integer getPrepareIndex();

    public abstract Long getStartPosition();

    public Integer getStartQualityConstraint() {
        return this.startQualityConstraint;
    }

    public VideoData getVideoData() {
        return this.videoData;
    }

    private PlaybackOptions() {
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJv\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\tHÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/yandex/video/m3/data/dto/PlaybackOptions$DirectSourcePlaybackOptions;", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "contentId", "", "startPosition", "", "prepareIndex", "", "autoPlay", "", "adContentId", "expandedManifestUrl", "abrPreferences", "Lru/yandex/video/m3/player/AbrPreferences;", "startQualityConstraint", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/AbrPreferences;Ljava/lang/Integer;)V", "getAbrPreferences", "()Lru/yandex/video/m3/player/AbrPreferences;", "getAdContentId", "()Ljava/lang/String;", "getAutoPlay", "()Z", "getContentId", "getExpandedManifestUrl", "getPrepareIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartPosition", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStartQualityConstraint", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/AbrPreferences;Ljava/lang/Integer;)Lru/yandex/video/m3/data/dto/PlaybackOptions$DirectSourcePlaybackOptions;", "equals", "other", "", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DirectSourcePlaybackOptions extends PlaybackOptions {
        public static final int $stable = 8;
        private final AbrPreferences abrPreferences;
        private final String adContentId;
        private final boolean autoPlay;
        private final String contentId;
        private final String expandedManifestUrl;
        private final Integer prepareIndex;
        private final Long startPosition;
        private final Integer startQualityConstraint;
        private final VideoData videoData;

        public /* synthetic */ DirectSourcePlaybackOptions(VideoData videoData, String str, Long l, Integer num, boolean z, String str2, String str3, AbrPreferences abrPreferences, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(videoData, str, l, num, z, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : abrPreferences, (i & 256) != 0 ? null : num2);
        }

        public static /* synthetic */ DirectSourcePlaybackOptions copy$default(DirectSourcePlaybackOptions directSourcePlaybackOptions, VideoData videoData, String str, Long l, Integer num, boolean z, String str2, String str3, AbrPreferences abrPreferences, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                videoData = directSourcePlaybackOptions.videoData;
            }
            if ((i & 2) != 0) {
                str = directSourcePlaybackOptions.contentId;
            }
            if ((i & 4) != 0) {
                l = directSourcePlaybackOptions.startPosition;
            }
            if ((i & 8) != 0) {
                num = directSourcePlaybackOptions.prepareIndex;
            }
            if ((i & 16) != 0) {
                z = directSourcePlaybackOptions.autoPlay;
            }
            if ((i & 32) != 0) {
                str2 = directSourcePlaybackOptions.adContentId;
            }
            if ((i & 64) != 0) {
                str3 = directSourcePlaybackOptions.expandedManifestUrl;
            }
            if ((i & 128) != 0) {
                abrPreferences = directSourcePlaybackOptions.abrPreferences;
            }
            if ((i & 256) != 0) {
                num2 = directSourcePlaybackOptions.startQualityConstraint;
            }
            AbrPreferences abrPreferences2 = abrPreferences;
            Integer num3 = num2;
            String str4 = str2;
            String str5 = str3;
            boolean z2 = z;
            Long l2 = l;
            return directSourcePlaybackOptions.copy(videoData, str, l2, num, z2, str4, str5, abrPreferences2, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final VideoData getVideoData() {
            return this.videoData;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContentId() {
            return this.contentId;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getStartPosition() {
            return this.startPosition;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getPrepareIndex() {
            return this.prepareIndex;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getAutoPlay() {
            return this.autoPlay;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAdContentId() {
            return this.adContentId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getExpandedManifestUrl() {
            return this.expandedManifestUrl;
        }

        /* renamed from: component8, reason: from getter */
        public final AbrPreferences getAbrPreferences() {
            return this.abrPreferences;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getStartQualityConstraint() {
            return this.startQualityConstraint;
        }

        public final DirectSourcePlaybackOptions copy(VideoData videoData, String contentId, Long startPosition, Integer prepareIndex, boolean autoPlay, String adContentId, String expandedManifestUrl, AbrPreferences abrPreferences, Integer startQualityConstraint) {
            return new DirectSourcePlaybackOptions(videoData, contentId, startPosition, prepareIndex, autoPlay, adContentId, expandedManifestUrl, abrPreferences, startQualityConstraint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DirectSourcePlaybackOptions)) {
                return false;
            }
            DirectSourcePlaybackOptions directSourcePlaybackOptions = (DirectSourcePlaybackOptions) other;
            return jl40.l(this.videoData, directSourcePlaybackOptions.videoData) && jl40.l(this.contentId, directSourcePlaybackOptions.contentId) && jl40.l(this.startPosition, directSourcePlaybackOptions.startPosition) && jl40.l(this.prepareIndex, directSourcePlaybackOptions.prepareIndex) && this.autoPlay == directSourcePlaybackOptions.autoPlay && jl40.l(this.adContentId, directSourcePlaybackOptions.adContentId) && jl40.l(this.expandedManifestUrl, directSourcePlaybackOptions.expandedManifestUrl) && jl40.l(this.abrPreferences, directSourcePlaybackOptions.abrPreferences) && jl40.l(this.startQualityConstraint, directSourcePlaybackOptions.startQualityConstraint);
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public AbrPreferences getAbrPreferences() {
            return this.abrPreferences;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public String getAdContentId() {
            return this.adContentId;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public boolean getAutoPlay() {
            return this.autoPlay;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public String getContentId() {
            return this.contentId;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public String getExpandedManifestUrl() {
            return this.expandedManifestUrl;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public Integer getPrepareIndex() {
            return this.prepareIndex;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public Long getStartPosition() {
            return this.startPosition;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public Integer getStartQualityConstraint() {
            return this.startQualityConstraint;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public VideoData getVideoData() {
            return this.videoData;
        }

        public int hashCode() {
            int hashCode = this.videoData.hashCode() * 31;
            String str = this.contentId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.startPosition;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.prepareIndex;
            int e = unr0.e((hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.autoPlay);
            String str2 = this.adContentId;
            int hashCode4 = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.expandedManifestUrl;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AbrPreferences abrPreferences = this.abrPreferences;
            int hashCode6 = (hashCode5 + (abrPreferences == null ? 0 : abrPreferences.hashCode())) * 31;
            Integer num2 = this.startQualityConstraint;
            return hashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DirectSourcePlaybackOptions(videoData=");
            sb.append(this.videoData);
            sb.append(", contentId=");
            sb.append(this.contentId);
            sb.append(", startPosition=");
            sb.append(this.startPosition);
            sb.append(", prepareIndex=");
            sb.append(this.prepareIndex);
            sb.append(", autoPlay=");
            sb.append(this.autoPlay);
            sb.append(", adContentId=");
            sb.append(this.adContentId);
            sb.append(", expandedManifestUrl=");
            sb.append(this.expandedManifestUrl);
            sb.append(", abrPreferences=");
            sb.append(this.abrPreferences);
            sb.append(", startQualityConstraint=");
            return vfc.o(sb, this.startQualityConstraint, ')');
        }

        public DirectSourcePlaybackOptions(VideoData videoData, String str, Long l, Integer num, boolean z, String str2, String str3, AbrPreferences abrPreferences, Integer num2) {
            super(null);
            this.videoData = videoData;
            this.contentId = str;
            this.startPosition = l;
            this.prepareIndex = num;
            this.autoPlay = z;
            this.adContentId = str2;
            this.expandedManifestUrl = str3;
            this.abrPreferences = abrPreferences;
            this.startQualityConstraint = num2;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010&\u001a\u00020\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001bJv\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0007HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lru/yandex/video/m3/data/dto/PlaybackOptions$ContentIdPlaybackOptions;", "Lru/yandex/video/m3/data/dto/PlaybackOptions;", "contentId", "", "startPosition", "", "prepareIndex", "", "autoPlay", "", "adContentId", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "expandedManifestUrl", "abrPreferences", "Lru/yandex/video/m3/player/AbrPreferences;", "startQualityConstraint", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;Lru/yandex/video/m3/player/AbrPreferences;Ljava/lang/Integer;)V", "getAbrPreferences", "()Lru/yandex/video/m3/player/AbrPreferences;", "getAdContentId", "()Ljava/lang/String;", "getAutoPlay", "()Z", "getContentId", "getExpandedManifestUrl", "getPrepareIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartPosition", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStartQualityConstraint", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;Lru/yandex/video/m3/player/AbrPreferences;Ljava/lang/Integer;)Lru/yandex/video/m3/data/dto/PlaybackOptions$ContentIdPlaybackOptions;", "equals", "other", "", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ContentIdPlaybackOptions extends PlaybackOptions {
        public static final int $stable = 8;
        private final AbrPreferences abrPreferences;
        private final String adContentId;
        private final boolean autoPlay;
        private final String contentId;
        private final String expandedManifestUrl;
        private final Integer prepareIndex;
        private final Long startPosition;
        private final Integer startQualityConstraint;
        private final VideoData videoData;

        public /* synthetic */ ContentIdPlaybackOptions(String str, Long l, Integer num, boolean z, String str2, VideoData videoData, String str3, AbrPreferences abrPreferences, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, l, num, z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : videoData, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : abrPreferences, (i & 256) != 0 ? null : num2);
        }

        public static /* synthetic */ ContentIdPlaybackOptions copy$default(ContentIdPlaybackOptions contentIdPlaybackOptions, String str, Long l, Integer num, boolean z, String str2, VideoData videoData, String str3, AbrPreferences abrPreferences, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentIdPlaybackOptions.contentId;
            }
            if ((i & 2) != 0) {
                l = contentIdPlaybackOptions.startPosition;
            }
            if ((i & 4) != 0) {
                num = contentIdPlaybackOptions.prepareIndex;
            }
            if ((i & 8) != 0) {
                z = contentIdPlaybackOptions.autoPlay;
            }
            if ((i & 16) != 0) {
                str2 = contentIdPlaybackOptions.adContentId;
            }
            if ((i & 32) != 0) {
                videoData = contentIdPlaybackOptions.videoData;
            }
            if ((i & 64) != 0) {
                str3 = contentIdPlaybackOptions.expandedManifestUrl;
            }
            if ((i & 128) != 0) {
                abrPreferences = contentIdPlaybackOptions.abrPreferences;
            }
            if ((i & 256) != 0) {
                num2 = contentIdPlaybackOptions.startQualityConstraint;
            }
            AbrPreferences abrPreferences2 = abrPreferences;
            Integer num3 = num2;
            VideoData videoData2 = videoData;
            String str4 = str3;
            String str5 = str2;
            Integer num4 = num;
            return contentIdPlaybackOptions.copy(str, l, num4, z, str5, videoData2, str4, abrPreferences2, num3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentId() {
            return this.contentId;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getStartPosition() {
            return this.startPosition;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getPrepareIndex() {
            return this.prepareIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getAutoPlay() {
            return this.autoPlay;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAdContentId() {
            return this.adContentId;
        }

        /* renamed from: component6, reason: from getter */
        public final VideoData getVideoData() {
            return this.videoData;
        }

        /* renamed from: component7, reason: from getter */
        public final String getExpandedManifestUrl() {
            return this.expandedManifestUrl;
        }

        /* renamed from: component8, reason: from getter */
        public final AbrPreferences getAbrPreferences() {
            return this.abrPreferences;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getStartQualityConstraint() {
            return this.startQualityConstraint;
        }

        public final ContentIdPlaybackOptions copy(String contentId, Long startPosition, Integer prepareIndex, boolean autoPlay, String adContentId, VideoData videoData, String expandedManifestUrl, AbrPreferences abrPreferences, Integer startQualityConstraint) {
            return new ContentIdPlaybackOptions(contentId, startPosition, prepareIndex, autoPlay, adContentId, videoData, expandedManifestUrl, abrPreferences, startQualityConstraint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentIdPlaybackOptions)) {
                return false;
            }
            ContentIdPlaybackOptions contentIdPlaybackOptions = (ContentIdPlaybackOptions) other;
            return jl40.l(this.contentId, contentIdPlaybackOptions.contentId) && jl40.l(this.startPosition, contentIdPlaybackOptions.startPosition) && jl40.l(this.prepareIndex, contentIdPlaybackOptions.prepareIndex) && this.autoPlay == contentIdPlaybackOptions.autoPlay && jl40.l(this.adContentId, contentIdPlaybackOptions.adContentId) && jl40.l(this.videoData, contentIdPlaybackOptions.videoData) && jl40.l(this.expandedManifestUrl, contentIdPlaybackOptions.expandedManifestUrl) && jl40.l(this.abrPreferences, contentIdPlaybackOptions.abrPreferences) && jl40.l(this.startQualityConstraint, contentIdPlaybackOptions.startQualityConstraint);
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public AbrPreferences getAbrPreferences() {
            return this.abrPreferences;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public String getAdContentId() {
            return this.adContentId;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public boolean getAutoPlay() {
            return this.autoPlay;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public String getContentId() {
            return this.contentId;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public String getExpandedManifestUrl() {
            return this.expandedManifestUrl;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public Integer getPrepareIndex() {
            return this.prepareIndex;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public Long getStartPosition() {
            return this.startPosition;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public Integer getStartQualityConstraint() {
            return this.startQualityConstraint;
        }

        @Override // ru.yandex.video.m3.data.dto.PlaybackOptions
        public VideoData getVideoData() {
            return this.videoData;
        }

        public int hashCode() {
            int hashCode = this.contentId.hashCode() * 31;
            Long l = this.startPosition;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.prepareIndex;
            int e = unr0.e((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.autoPlay);
            String str = this.adContentId;
            int hashCode3 = (e + (str == null ? 0 : str.hashCode())) * 31;
            VideoData videoData = this.videoData;
            int hashCode4 = (hashCode3 + (videoData == null ? 0 : videoData.hashCode())) * 31;
            String str2 = this.expandedManifestUrl;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AbrPreferences abrPreferences = this.abrPreferences;
            int hashCode6 = (hashCode5 + (abrPreferences == null ? 0 : abrPreferences.hashCode())) * 31;
            Integer num2 = this.startQualityConstraint;
            return hashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ContentIdPlaybackOptions(contentId=");
            sb.append(this.contentId);
            sb.append(", startPosition=");
            sb.append(this.startPosition);
            sb.append(", prepareIndex=");
            sb.append(this.prepareIndex);
            sb.append(", autoPlay=");
            sb.append(this.autoPlay);
            sb.append(", adContentId=");
            sb.append(this.adContentId);
            sb.append(", videoData=");
            sb.append(this.videoData);
            sb.append(", expandedManifestUrl=");
            sb.append(this.expandedManifestUrl);
            sb.append(", abrPreferences=");
            sb.append(this.abrPreferences);
            sb.append(", startQualityConstraint=");
            return vfc.o(sb, this.startQualityConstraint, ')');
        }

        public ContentIdPlaybackOptions(String str, Long l, Integer num, boolean z, String str2, VideoData videoData, String str3, AbrPreferences abrPreferences, Integer num2) {
            super(null);
            this.contentId = str;
            this.startPosition = l;
            this.prepareIndex = num;
            this.autoPlay = z;
            this.adContentId = str2;
            this.videoData = videoData;
            this.expandedManifestUrl = str3;
            this.abrPreferences = abrPreferences;
            this.startQualityConstraint = num2;
        }
    }
}
