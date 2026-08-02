package ru.yandex.video.m3.ott.data.dto;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.k5r;
import defpackage.zyt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0019B\u0087\u0001\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00002\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b0\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b1\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b5\u0010&R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b\u000f\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b6\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b7\u0010&R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b8\u0010&R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0015\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b<\u00104¨\u0006="}, d2 = {"Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/ott/data/dto/b;", "", "manifestUrl", "contentId", "", "watchProgressPositionMs", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "drmConfig", "audioLanguage", "subtitleLanguage", "", "multiplex", "firstFrameUrl", "isUgcLive", "firstFrameHash", "title", "thumbnail", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "trackingData", "shouldUseOttTracking", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLru/yandex/video/m3/ott/data/dto/drm/DrmProxy;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;Z)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/dto/c;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getManifestUrl", "getContentId", "J", "getWatchProgressPositionMs", "()J", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "getAudioLanguage", "getSubtitleLanguage", "Z", "getMultiplex", "()Z", "getFirstFrameUrl", "getFirstFrameHash", "getTitle", "getThumbnail", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "getTrackingData", "()Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "getShouldUseOttTracking", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class VhVideoData implements VideoData, b {
    public static final int $stable = 8;
    private final String audioLanguage;

    @NotNull
    private final String contentId;
    private final DrmProxy drmConfig;
    private final String firstFrameHash;
    private final String firstFrameUrl;
    private final boolean isUgcLive;

    @NotNull
    private final String manifestUrl;
    private final boolean multiplex;
    private final boolean shouldUseOttTracking;
    private final String subtitleLanguage;
    private final String thumbnail;
    private final String title;

    @NotNull
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VhVideoData copy$default(VhVideoData vhVideoData, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = zyt.Y;
        }
        return vhVideoData.copy(function1);
    }

    @NotNull
    public final VhVideoData copy(@NotNull Function1<? super c, Unit> builderAction) {
        builderAction.getClass();
        c cVar = new c(getManifestUrl(), getContentId());
        cVar.c = Long.valueOf(getWatchProgressPositionMs());
        cVar.d = getDrmConfig();
        cVar.e = getAudioLanguage();
        cVar.f = getSubtitleLanguage();
        cVar.g = Boolean.valueOf(getMultiplex());
        cVar.h = getFirstFrameUrl();
        cVar.i = Boolean.valueOf(getIsUgcLive());
        cVar.j = getFirstFrameHash();
        cVar.k = getTitle();
        cVar.l = getThumbnail();
        cVar.m = getTrackingData();
        builderAction.invoke(cVar);
        return cVar.a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!VhVideoData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        VhVideoData vhVideoData = (VhVideoData) other;
        return this.watchProgressPositionMs == vhVideoData.watchProgressPositionMs && getMultiplex() == vhVideoData.getMultiplex() && this.isUgcLive == vhVideoData.isUgcLive && this.shouldUseOttTracking == vhVideoData.shouldUseOttTracking && Intrinsics.d(getManifestUrl(), vhVideoData.getManifestUrl()) && Intrinsics.d(this.contentId, vhVideoData.contentId) && Intrinsics.d(this.drmConfig, vhVideoData.drmConfig) && Intrinsics.d(getAudioLanguage(), vhVideoData.getAudioLanguage()) && Intrinsics.d(getSubtitleLanguage(), vhVideoData.getSubtitleLanguage()) && Intrinsics.d(this.firstFrameUrl, vhVideoData.firstFrameUrl) && Intrinsics.d(this.firstFrameHash, vhVideoData.firstFrameHash) && Intrinsics.d(this.title, vhVideoData.title) && Intrinsics.d(this.thumbnail, vhVideoData.thumbnail) && Intrinsics.d(getTrackingData(), vhVideoData.getTrackingData());
    }

    @Override // ru.yandex.video.m3.data.dto.VideoData
    public String getAudioLanguage() {
        return this.audioLanguage;
    }

    @NotNull
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
    @NotNull
    public String getManifestUrl() {
        return this.manifestUrl;
    }

    @Override // ru.yandex.video.m3.ott.data.dto.b
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

    @Override // ru.yandex.video.m3.ott.data.dto.b
    @NotNull
    public Ott.TrackingData getTrackingData() {
        return this.trackingData;
    }

    public final long getWatchProgressPositionMs() {
        return this.watchProgressPositionMs;
    }

    public int hashCode() {
        int c = k5r.c((getManifestUrl().hashCode() + k5r.e(k5r.e((Boolean.hashCode(getMultiplex()) + (Long.hashCode(this.watchProgressPositionMs) * 31)) * 31, 31, this.isUgcLive), 31, this.shouldUseOttTracking)) * 31, 31, this.contentId);
        DrmProxy drmProxy = this.drmConfig;
        int hashCode = (c + (drmProxy != null ? drmProxy.hashCode() : 0)) * 31;
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

    @NotNull
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
        return dfi.j(sb, this.shouldUseOttTracking, ')');
    }

    public /* synthetic */ VhVideoData(String str, String str2, long j, DrmProxy drmProxy, String str3, String str4, boolean z, String str5, boolean z2, String str6, String str7, String str8, Ott.TrackingData trackingData, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, drmProxy, str3, str4, z, str5, z2, str6, str7, str8, trackingData, z3);
    }
}
