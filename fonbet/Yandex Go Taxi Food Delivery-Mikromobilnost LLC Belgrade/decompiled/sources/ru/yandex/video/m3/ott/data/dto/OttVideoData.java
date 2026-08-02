package ru.yandex.video.m3.ott.data.dto;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.drm.DrmConfig;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010(J\t\u00103\u001a\u00020\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003Jª\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00102\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\u0015HÖ\u0001J\t\u0010C\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/ott/data/dto/Tracking;", "manifestUrl", "", "contentId", "parentContentId", "audioLanguage", "subtitleLanguage", "watchProgressPosition", "", "drmConfig", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "trackingData", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "isForbiddenToDisableSubtitleWithOriginalAudio", "", "concurrencyArbiterConfig", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "fallbackVideoData", "restrictionAge", "", "multiplex", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLru/yandex/video/m3/ott/data/dto/drm/DrmConfig;Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;ZLru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;Lru/yandex/video/m3/ott/data/dto/OttVideoData;Ljava/lang/Integer;ZLjava/lang/String;)V", "getAudioLanguage", "()Ljava/lang/String;", "getConcurrencyArbiterConfig", "()Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "getContentId", "getContentType", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "getFallbackVideoData", "()Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "()Z", "getManifestUrl", "getMultiplex", "getParentContentId", "getRestrictionAge", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubtitleLanguage", "getTrackingData", "()Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "getWatchProgressPosition", "()J", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLru/yandex/video/m3/ott/data/dto/drm/DrmConfig;Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;ZLru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;Lru/yandex/video/m3/ott/data/dto/OttVideoData;Ljava/lang/Integer;ZLjava/lang/String;)Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "equals", "other", "", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OttVideoData implements VideoData, Tracking {
    public static final int $stable = 8;
    private final String audioLanguage;
    private final Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig;
    private final String contentId;
    private final String contentType;
    private final DrmConfig drmConfig;
    private final OttVideoData fallbackVideoData;
    private final boolean isForbiddenToDisableSubtitleWithOriginalAudio;
    private final String manifestUrl;
    private final boolean multiplex;
    private final String parentContentId;
    private final Integer restrictionAge;
    private final String subtitleLanguage;
    private final Ott.TrackingData trackingData;
    private final long watchProgressPosition;

    public /* synthetic */ OttVideoData(String str, String str2, String str3, String str4, String str5, long j, DrmConfig drmConfig, Ott.TrackingData trackingData, boolean z, Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig, OttVideoData ottVideoData, Integer num, boolean z2, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, j, drmConfig, trackingData, z, concurrencyArbiterConfig, ottVideoData, num, z2, (i & 8192) != 0 ? null : str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getManifestUrl() {
        return this.manifestUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final Ott.ConcurrencyArbiterConfig getConcurrencyArbiterConfig() {
        return this.concurrencyArbiterConfig;
    }

    /* renamed from: component11, reason: from getter */
    public final OttVideoData getFallbackVideoData() {
        return this.fallbackVideoData;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getRestrictionAge() {
        return this.restrictionAge;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getMultiplex() {
        return this.multiplex;
    }

    /* renamed from: component14, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParentContentId() {
        return this.parentContentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAudioLanguage() {
        return this.audioLanguage;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    /* renamed from: component6, reason: from getter */
    public final long getWatchProgressPosition() {
        return this.watchProgressPosition;
    }

    /* renamed from: component7, reason: from getter */
    public final DrmConfig getDrmConfig() {
        return this.drmConfig;
    }

    /* renamed from: component8, reason: from getter */
    public final Ott.TrackingData getTrackingData() {
        return this.trackingData;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsForbiddenToDisableSubtitleWithOriginalAudio() {
        return this.isForbiddenToDisableSubtitleWithOriginalAudio;
    }

    public final OttVideoData copy(String manifestUrl, String contentId, String parentContentId, String audioLanguage, String subtitleLanguage, long watchProgressPosition, DrmConfig drmConfig, Ott.TrackingData trackingData, boolean isForbiddenToDisableSubtitleWithOriginalAudio, Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig, OttVideoData fallbackVideoData, Integer restrictionAge, boolean multiplex, String contentType) {
        return new OttVideoData(manifestUrl, contentId, parentContentId, audioLanguage, subtitleLanguage, watchProgressPosition, drmConfig, trackingData, isForbiddenToDisableSubtitleWithOriginalAudio, concurrencyArbiterConfig, fallbackVideoData, restrictionAge, multiplex, contentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OttVideoData)) {
            return false;
        }
        OttVideoData ottVideoData = (OttVideoData) other;
        return jl40.l(this.manifestUrl, ottVideoData.manifestUrl) && jl40.l(this.contentId, ottVideoData.contentId) && jl40.l(this.parentContentId, ottVideoData.parentContentId) && jl40.l(this.audioLanguage, ottVideoData.audioLanguage) && jl40.l(this.subtitleLanguage, ottVideoData.subtitleLanguage) && this.watchProgressPosition == ottVideoData.watchProgressPosition && jl40.l(this.drmConfig, ottVideoData.drmConfig) && jl40.l(this.trackingData, ottVideoData.trackingData) && this.isForbiddenToDisableSubtitleWithOriginalAudio == ottVideoData.isForbiddenToDisableSubtitleWithOriginalAudio && jl40.l(this.concurrencyArbiterConfig, ottVideoData.concurrencyArbiterConfig) && jl40.l(this.fallbackVideoData, ottVideoData.fallbackVideoData) && jl40.l(this.restrictionAge, ottVideoData.restrictionAge) && this.multiplex == ottVideoData.multiplex && jl40.l(this.contentType, ottVideoData.contentType);
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getAudioLanguage() {
        return this.audioLanguage;
    }

    public final Ott.ConcurrencyArbiterConfig getConcurrencyArbiterConfig() {
        return this.concurrencyArbiterConfig;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final DrmConfig getDrmConfig() {
        return this.drmConfig;
    }

    public final OttVideoData getFallbackVideoData() {
        return this.fallbackVideoData;
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getManifestUrl() {
        return this.manifestUrl;
    }

    @Override // ru.yandex.video.m3.ott.data.dto.Tracking
    public boolean getMultiplex() {
        return this.multiplex;
    }

    public final String getParentContentId() {
        return this.parentContentId;
    }

    public final Integer getRestrictionAge() {
        return this.restrictionAge;
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getSubtitleLanguage() {
        return this.subtitleLanguage;
    }

    @Override // ru.yandex.video.m3.ott.data.dto.Tracking
    public Ott.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public final long getWatchProgressPosition() {
        return this.watchProgressPosition;
    }

    public int hashCode() {
        int b = unr0.b(this.manifestUrl.hashCode() * 31, 31, this.contentId);
        String str = this.parentContentId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audioLanguage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitleLanguage;
        int c = qv10.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.watchProgressPosition);
        DrmConfig drmConfig = this.drmConfig;
        int e = unr0.e((this.trackingData.hashCode() + ((c + (drmConfig == null ? 0 : drmConfig.hashCode())) * 31)) * 31, 31, this.isForbiddenToDisableSubtitleWithOriginalAudio);
        Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig = this.concurrencyArbiterConfig;
        int hashCode3 = (e + (concurrencyArbiterConfig == null ? 0 : concurrencyArbiterConfig.hashCode())) * 31;
        OttVideoData ottVideoData = this.fallbackVideoData;
        int hashCode4 = (hashCode3 + (ottVideoData == null ? 0 : ottVideoData.hashCode())) * 31;
        Integer num = this.restrictionAge;
        int e2 = unr0.e((hashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.multiplex);
        String str4 = this.contentType;
        return e2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isForbiddenToDisableSubtitleWithOriginalAudio() {
        return this.isForbiddenToDisableSubtitleWithOriginalAudio;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OttVideoData(manifestUrl=");
        sb.append(this.manifestUrl);
        sb.append(", contentId=");
        sb.append(this.contentId);
        sb.append(", parentContentId=");
        sb.append(this.parentContentId);
        sb.append(", audioLanguage=");
        sb.append(this.audioLanguage);
        sb.append(", subtitleLanguage=");
        sb.append(this.subtitleLanguage);
        sb.append(", watchProgressPosition=");
        sb.append(this.watchProgressPosition);
        sb.append(", drmConfig=");
        sb.append(this.drmConfig);
        sb.append(", trackingData=");
        sb.append(this.trackingData);
        sb.append(", isForbiddenToDisableSubtitleWithOriginalAudio=");
        sb.append(this.isForbiddenToDisableSubtitleWithOriginalAudio);
        sb.append(", concurrencyArbiterConfig=");
        sb.append(this.concurrencyArbiterConfig);
        sb.append(", fallbackVideoData=");
        sb.append(this.fallbackVideoData);
        sb.append(", restrictionAge=");
        sb.append(this.restrictionAge);
        sb.append(", multiplex=");
        sb.append(this.multiplex);
        sb.append(", contentType=");
        return b64.p(sb, this.contentType, ')');
    }

    public OttVideoData(String str, String str2, String str3, String str4, String str5, long j, DrmConfig drmConfig, Ott.TrackingData trackingData, boolean z, Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig, OttVideoData ottVideoData, Integer num, boolean z2, String str6) {
        this.manifestUrl = str;
        this.contentId = str2;
        this.parentContentId = str3;
        this.audioLanguage = str4;
        this.subtitleLanguage = str5;
        this.watchProgressPosition = j;
        this.drmConfig = drmConfig;
        this.trackingData = trackingData;
        this.isForbiddenToDisableSubtitleWithOriginalAudio = z;
        this.concurrencyArbiterConfig = concurrencyArbiterConfig;
        this.fallbackVideoData = ottVideoData;
        this.restrictionAge = num;
        this.multiplex = z2;
        this.contentType = str6;
    }
}
