package ru.yandex.video.m3.ott.data.dto;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001=B\u0087\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b0\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b1\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b5\u0010&R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b\u000f\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b6\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b7\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b8\u0010&R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b<\u00104¨\u0006>"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/ott/data/dto/Tracking;", "", "manifestUrl", "contentId", "", "watchProgressPositionMs", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "drmConfig", "audioLanguage", "subtitleLanguage", "", "multiplex", "firstFrameUrl", "isUgcLive", "firstFrameHash", "title", "thumbnail", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "trackingData", "shouldUseOttTracking", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLru/yandex/video/m3/ott/data/dto/drm/DrmProxy;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;Z)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getManifestUrl", "getContentId", "J", "getWatchProgressPositionMs", "()J", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "getAudioLanguage", "getSubtitleLanguage", "Z", "getMultiplex", "()Z", "getFirstFrameUrl", "getFirstFrameHash", "getTitle", "getThumbnail", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "getTrackingData", "()Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "getShouldUseOttTracking", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VhVideoData implements VideoData, Tracking {
    public static final int $stable = 8;
    private final String audioLanguage;
    private final String contentId;
    private final DrmProxy drmConfig;
    private final String firstFrameHash;
    private final String firstFrameUrl;
    private final boolean isUgcLive;
    private final String manifestUrl;
    private final boolean multiplex;
    private final boolean shouldUseOttTracking;
    private final String subtitleLanguage;
    private final String thumbnail;
    private final String title;
    private final Ott.TrackingData trackingData;
    private final long watchProgressPositionMs;

    private VhVideoData(String str, String str2, long j, DrmProxy drmProxy, String str3, String str4, boolean z, String str5, boolean z2, String str6, String str7, String str8, Ott.TrackingData trackingData, boolean z3) {
        this.manifestUrl = str;
        this.contentId = str2;
        this.watchProgressPositionMs = j;
        this.drmConfig = drmProxy;
        this.audioLanguage = str3;
        this.subtitleLanguage = str4;
        this.multiplex = z;
        this.firstFrameUrl = str5;
        this.isUgcLive = z2;
        this.firstFrameHash = str6;
        this.title = str7;
        this.thumbnail = str8;
        this.trackingData = trackingData;
        this.shouldUseOttTracking = z3;
    }

    public static /* synthetic */ VhVideoData copy$default(VhVideoData vhVideoData, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.dto.VhVideoData$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((VhVideoData.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(VhVideoData.Builder builder) {
                }
            };
        }
        return vhVideoData.copy(tlsVar);
    }

    public final VhVideoData copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!VhVideoData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        VhVideoData vhVideoData = (VhVideoData) other;
        return this.watchProgressPositionMs == vhVideoData.watchProgressPositionMs && getMultiplex() == vhVideoData.getMultiplex() && this.isUgcLive == vhVideoData.isUgcLive && this.shouldUseOttTracking == vhVideoData.shouldUseOttTracking && jl40.l(getManifestUrl(), vhVideoData.getManifestUrl()) && jl40.l(this.contentId, vhVideoData.contentId) && jl40.l(this.drmConfig, vhVideoData.drmConfig) && jl40.l(getAudioLanguage(), vhVideoData.getAudioLanguage()) && jl40.l(getSubtitleLanguage(), vhVideoData.getSubtitleLanguage()) && jl40.l(this.firstFrameUrl, vhVideoData.firstFrameUrl) && jl40.l(this.firstFrameHash, vhVideoData.firstFrameHash) && jl40.l(this.title, vhVideoData.title) && jl40.l(this.thumbnail, vhVideoData.thumbnail) && jl40.l(getTrackingData(), vhVideoData.getTrackingData());
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getAudioLanguage() {
        return this.audioLanguage;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final DrmProxy getDrmConfig() {
        return this.drmConfig;
    }

    public final String getFirstFrameHash() {
        return this.firstFrameHash;
    }

    public final String getFirstFrameUrl() {
        return this.firstFrameUrl;
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getManifestUrl() {
        return this.manifestUrl;
    }

    @Override // ru.yandex.video.m3.ott.data.dto.Tracking
    public boolean getMultiplex() {
        return this.multiplex;
    }

    public final boolean getShouldUseOttTracking() {
        return this.shouldUseOttTracking;
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // ru.yandex.video.m3.ott.data.dto.Tracking
    public Ott.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public final long getWatchProgressPositionMs() {
        return this.watchProgressPositionMs;
    }

    public int hashCode() {
        int b = unr0.b((getManifestUrl().hashCode() + unr0.e(unr0.e((Boolean.hashCode(getMultiplex()) + (Long.hashCode(this.watchProgressPositionMs) * 31)) * 31, 31, this.isUgcLive), 31, this.shouldUseOttTracking)) * 31, 31, this.contentId);
        DrmProxy drmProxy = this.drmConfig;
        int hashCode = (b + (drmProxy != null ? drmProxy.hashCode() : 0)) * 31;
        String audioLanguage = getAudioLanguage();
        int hashCode2 = (hashCode + (audioLanguage != null ? audioLanguage.hashCode() : 0)) * 31;
        String subtitleLanguage = getSubtitleLanguage();
        int hashCode3 = (hashCode2 + (subtitleLanguage != null ? subtitleLanguage.hashCode() : 0)) * 31;
        String str = this.firstFrameUrl;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.firstFrameHash;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.thumbnail;
        return getTrackingData().hashCode() + ((hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    /* renamed from: isUgcLive, reason: from getter */
    public final boolean getIsUgcLive() {
        return this.isUgcLive;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VhVideoData(manifestUrl='");
        sb.append(getManifestUrl());
        sb.append("', contentId='");
        sb.append(this.contentId);
        sb.append("', watchProgressPositionMs=");
        sb.append(this.watchProgressPositionMs);
        sb.append(", drmConfig=");
        sb.append(this.drmConfig);
        sb.append(", audioLanguage=");
        sb.append(getAudioLanguage());
        sb.append(", subtitleLanguage=");
        sb.append(getSubtitleLanguage());
        sb.append(", multiplex=");
        sb.append(getMultiplex());
        sb.append(", firstFrameUrl=");
        sb.append(this.firstFrameUrl);
        sb.append(", isUgcLive=");
        sb.append(this.isUgcLive);
        sb.append(", firstFrameHash=");
        sb.append(this.firstFrameHash);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", thumbnail=");
        sb.append(this.thumbnail);
        sb.append(", trackingData=");
        sb.append(getTrackingData());
        sb.append(", shouldUseOttTracking=");
        return unr0.u(sb, this.shouldUseOttTracking, ')');
    }

    public /* synthetic */ VhVideoData(String str, String str2, long j, DrmProxy drmProxy, String str3, String str4, boolean z, String str5, boolean z2, String str6, String str7, String str8, Ott.TrackingData trackingData, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, drmProxy, str3, str4, z, str5, z2, str6, str7, str8, trackingData, z3);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\r\u0010=\u001a\u00020\u0003H\u0000¢\u0006\u0002\b>J\b\u0010?\u001a\u000201H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\rR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u001e\u0010$\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u001c\u0010'\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001c\u0010*\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR\u001c\u0010-\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\rR\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/VhVideoData$Builder;", "", "vhVideoData", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "(Lru/yandex/video/m3/ott/data/dto/VhVideoData;)V", "manifestUrl", "", "contentId", "(Ljava/lang/String;Ljava/lang/String;)V", "audioLanguage", "getAudioLanguage", "()Ljava/lang/String;", "setAudioLanguage", "(Ljava/lang/String;)V", "getContentId", "setContentId", "drmConfig", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "setDrmConfig", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;)V", "firstFrameHash", "getFirstFrameHash", "setFirstFrameHash", "firstFrameUrl", "getFirstFrameUrl", "setFirstFrameUrl", "isUgcLive", "", "()Ljava/lang/Boolean;", "setUgcLive", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getManifestUrl", "setManifestUrl", "multiplex", "getMultiplex", "setMultiplex", "subtitleLanguage", "getSubtitleLanguage", "setSubtitleLanguage", "thumbnail", "getThumbnail", "setThumbnail", "title", "getTitle", "setTitle", "trackingData", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "getTrackingData", "()Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "setTrackingData", "(Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;)V", "watchProgressPositionMs", "", "getWatchProgressPositionMs", "()Ljava/lang/Long;", "setWatchProgressPositionMs", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "build", "build$video_player_internalRelease", "emptyTrackingData", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String audioLanguage;
        private String contentId;
        private DrmProxy drmConfig;
        private String firstFrameHash;
        private String firstFrameUrl;
        private Boolean isUgcLive;
        private String manifestUrl;
        private Boolean multiplex;
        private String subtitleLanguage;
        private String thumbnail;
        private String title;
        private Ott.TrackingData trackingData;
        private Long watchProgressPositionMs;

        public Builder(VhVideoData vhVideoData) {
            this(vhVideoData.getManifestUrl(), vhVideoData.getContentId());
            this.watchProgressPositionMs = Long.valueOf(vhVideoData.getWatchProgressPositionMs());
            this.drmConfig = vhVideoData.getDrmConfig();
            this.audioLanguage = vhVideoData.getAudioLanguage();
            this.subtitleLanguage = vhVideoData.getSubtitleLanguage();
            this.multiplex = Boolean.valueOf(vhVideoData.getMultiplex());
            this.firstFrameUrl = vhVideoData.getFirstFrameUrl();
            this.isUgcLive = Boolean.valueOf(vhVideoData.getIsUgcLive());
            this.firstFrameHash = vhVideoData.getFirstFrameHash();
            this.title = vhVideoData.getTitle();
            this.thumbnail = vhVideoData.getThumbnail();
            this.trackingData = vhVideoData.getTrackingData();
        }

        private final Ott.TrackingData emptyTrackingData() {
            return new Ott.TrackingData(b.f(), false, null, null, null, Ott.DeviceType.App);
        }

        public final VhVideoData build$video_player_internalRelease() {
            Ott.TrackingData trackingData = this.trackingData;
            if (trackingData == null) {
                trackingData = emptyTrackingData();
            }
            Ott.TrackingData trackingData2 = trackingData;
            String str = this.manifestUrl;
            String str2 = this.contentId;
            Long l = this.watchProgressPositionMs;
            long longValue = l != null ? l.longValue() : -9223372036854775807L;
            DrmProxy drmProxy = this.drmConfig;
            String str3 = this.audioLanguage;
            String str4 = this.subtitleLanguage;
            Boolean bool = this.multiplex;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            String str5 = this.firstFrameUrl;
            Boolean bool2 = this.isUgcLive;
            return new VhVideoData(str, str2, longValue, drmProxy, str3, str4, booleanValue, str5, bool2 != null ? bool2.booleanValue() : false, this.firstFrameHash, this.title, this.thumbnail, trackingData2, !trackingData2.getTrackings().isEmpty(), null);
        }

        public final String getAudioLanguage() {
            return this.audioLanguage;
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final DrmProxy getDrmConfig() {
            return this.drmConfig;
        }

        public final String getFirstFrameHash() {
            return this.firstFrameHash;
        }

        public final String getFirstFrameUrl() {
            return this.firstFrameUrl;
        }

        public final String getManifestUrl() {
            return this.manifestUrl;
        }

        public final Boolean getMultiplex() {
            return this.multiplex;
        }

        public final String getSubtitleLanguage() {
            return this.subtitleLanguage;
        }

        public final String getThumbnail() {
            return this.thumbnail;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Ott.TrackingData getTrackingData() {
            return this.trackingData;
        }

        public final Long getWatchProgressPositionMs() {
            return this.watchProgressPositionMs;
        }

        /* renamed from: isUgcLive, reason: from getter */
        public final Boolean getIsUgcLive() {
            return this.isUgcLive;
        }

        public final void setAudioLanguage(String str) {
            this.audioLanguage = str;
        }

        public final void setContentId(String str) {
            this.contentId = str;
        }

        public final void setDrmConfig(DrmProxy drmProxy) {
            this.drmConfig = drmProxy;
        }

        public final void setFirstFrameHash(String str) {
            this.firstFrameHash = str;
        }

        public final void setFirstFrameUrl(String str) {
            this.firstFrameUrl = str;
        }

        public final void setManifestUrl(String str) {
            this.manifestUrl = str;
        }

        public final void setMultiplex(Boolean bool) {
            this.multiplex = bool;
        }

        public final void setSubtitleLanguage(String str) {
            this.subtitleLanguage = str;
        }

        public final void setThumbnail(String str) {
            this.thumbnail = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setTrackingData(Ott.TrackingData trackingData) {
            this.trackingData = trackingData;
        }

        public final void setUgcLive(Boolean bool) {
            this.isUgcLive = bool;
        }

        public final void setWatchProgressPositionMs(Long l) {
            this.watchProgressPositionMs = l;
        }

        public Builder(String str, String str2) {
            this.manifestUrl = str;
            this.contentId = str2;
        }
    }
}
