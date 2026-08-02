package ru.yandex.video.m3.preload_manager;

import android.net.Uri;
import defpackage.cvu0;
import defpackage.g8e;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.impl.tracking.UriQueryParameters;
import ru.yandex.video.m3.player.impl.utils.UrlModifierHelper;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0080\b\u0018\u0000 72\u00020\u0001:\u00017B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0002\u0010\u0013J\t\u0010'\u001a\u00020\u0003HÂ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\t\u00100\u001a\u00020\u000fHÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000fHÆ\u0001J\u0013\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u00104\u001a\u00020\u0003J\t\u00105\u001a\u00020\u000bHÖ\u0001J\t\u00106\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010 \u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001e¨\u00068"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadRequest;", "", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/preload_manager/PreloadConfig;", "priority", "Lru/yandex/video/m3/preload_manager/PreloadPriority;", "videoSessionId", "", "sourceIndex", "", "eventIndexGenerator", "Lru/yandex/video/m3/player/IndexGenerator;", "enableHevc", "", "ignoreMinHeightWithService", "ignoreMaxHeightWithService", "omitAudio", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/preload_manager/PreloadConfig;Lru/yandex/video/m3/preload_manager/PreloadPriority;Ljava/lang/String;ILru/yandex/video/m3/player/IndexGenerator;ZZZZ)V", "getConfig", "()Lru/yandex/video/m3/preload_manager/PreloadConfig;", "getEnableHevc", "()Z", "getEventIndexGenerator", "()Lru/yandex/video/m3/player/IndexGenerator;", "getIgnoreMaxHeightWithService", "getIgnoreMinHeightWithService", "manifestUrl", "getManifestUrl", "()Ljava/lang/String;", "getOmitAudio", "preloadKey", "getPreloadKey", "getPriority", "()Lru/yandex/video/m3/preload_manager/PreloadPriority;", "getSourceIndex", "()I", "getVideoSessionId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getRawVideoDataWithIncorrectVsid", "hashCode", "toString", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PreloadRequest {
    private final PreloadConfig config;
    private final boolean enableHevc;
    private final IndexGenerator eventIndexGenerator;
    private final boolean ignoreMaxHeightWithService;
    private final boolean ignoreMinHeightWithService;
    private final String manifestUrl;
    private final boolean omitAudio;
    private final String preloadKey;
    private final PreloadPriority priority;
    private final int sourceIndex;
    private final VideoData videoData;
    private final String videoSessionId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public PreloadRequest(VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority, String str, int i, IndexGenerator indexGenerator, boolean z, boolean z2, boolean z3, boolean z4) {
        this.videoData = videoData;
        this.config = preloadConfig;
        this.priority = preloadPriority;
        this.videoSessionId = str;
        this.sourceIndex = i;
        this.eventIndexGenerator = indexGenerator;
        this.enableHevc = z;
        this.ignoreMinHeightWithService = z2;
        this.ignoreMaxHeightWithService = z3;
        this.omitAudio = z4;
        Companion companion = INSTANCE;
        this.manifestUrl = companion.buildManifestUrl(videoData, str, i, z, z2, z3);
        this.preloadKey = companion.buildPreloadKey$video_player_internalRelease(videoData);
    }

    /* renamed from: component1, reason: from getter */
    private final VideoData getVideoData() {
        return this.videoData;
    }

    public static /* synthetic */ PreloadRequest copy$default(PreloadRequest preloadRequest, VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority, String str, int i, IndexGenerator indexGenerator, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            videoData = preloadRequest.videoData;
        }
        if ((i2 & 2) != 0) {
            preloadConfig = preloadRequest.config;
        }
        if ((i2 & 4) != 0) {
            preloadPriority = preloadRequest.priority;
        }
        if ((i2 & 8) != 0) {
            str = preloadRequest.videoSessionId;
        }
        if ((i2 & 16) != 0) {
            i = preloadRequest.sourceIndex;
        }
        if ((i2 & 32) != 0) {
            indexGenerator = preloadRequest.eventIndexGenerator;
        }
        if ((i2 & 64) != 0) {
            z = preloadRequest.enableHevc;
        }
        if ((i2 & 128) != 0) {
            z2 = preloadRequest.ignoreMinHeightWithService;
        }
        if ((i2 & 256) != 0) {
            z3 = preloadRequest.ignoreMaxHeightWithService;
        }
        if ((i2 & 512) != 0) {
            z4 = preloadRequest.omitAudio;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        boolean z7 = z;
        boolean z8 = z2;
        int i3 = i;
        IndexGenerator indexGenerator2 = indexGenerator;
        return preloadRequest.copy(videoData, preloadConfig, preloadPriority, str, i3, indexGenerator2, z7, z8, z5, z6);
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getOmitAudio() {
        return this.omitAudio;
    }

    /* renamed from: component2, reason: from getter */
    public final PreloadConfig getConfig() {
        return this.config;
    }

    /* renamed from: component3, reason: from getter */
    public final PreloadPriority getPriority() {
        return this.priority;
    }

    /* renamed from: component4, reason: from getter */
    public final String getVideoSessionId() {
        return this.videoSessionId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSourceIndex() {
        return this.sourceIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final IndexGenerator getEventIndexGenerator() {
        return this.eventIndexGenerator;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getEnableHevc() {
        return this.enableHevc;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIgnoreMinHeightWithService() {
        return this.ignoreMinHeightWithService;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIgnoreMaxHeightWithService() {
        return this.ignoreMaxHeightWithService;
    }

    public final PreloadRequest copy(VideoData videoData, PreloadConfig config, PreloadPriority priority, String videoSessionId, int sourceIndex, IndexGenerator eventIndexGenerator, boolean enableHevc, boolean ignoreMinHeightWithService, boolean ignoreMaxHeightWithService, boolean omitAudio) {
        return new PreloadRequest(videoData, config, priority, videoSessionId, sourceIndex, eventIndexGenerator, enableHevc, ignoreMinHeightWithService, ignoreMaxHeightWithService, omitAudio);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreloadRequest)) {
            return false;
        }
        PreloadRequest preloadRequest = (PreloadRequest) other;
        return jl40.l(this.videoData, preloadRequest.videoData) && jl40.l(this.config, preloadRequest.config) && jl40.l(this.priority, preloadRequest.priority) && jl40.l(this.videoSessionId, preloadRequest.videoSessionId) && this.sourceIndex == preloadRequest.sourceIndex && jl40.l(this.eventIndexGenerator, preloadRequest.eventIndexGenerator) && this.enableHevc == preloadRequest.enableHevc && this.ignoreMinHeightWithService == preloadRequest.ignoreMinHeightWithService && this.ignoreMaxHeightWithService == preloadRequest.ignoreMaxHeightWithService && this.omitAudio == preloadRequest.omitAudio;
    }

    public final PreloadConfig getConfig() {
        return this.config;
    }

    public final boolean getEnableHevc() {
        return this.enableHevc;
    }

    public final IndexGenerator getEventIndexGenerator() {
        return this.eventIndexGenerator;
    }

    public final boolean getIgnoreMaxHeightWithService() {
        return this.ignoreMaxHeightWithService;
    }

    public final boolean getIgnoreMinHeightWithService() {
        return this.ignoreMinHeightWithService;
    }

    public final String getManifestUrl() {
        return this.manifestUrl;
    }

    public final boolean getOmitAudio() {
        return this.omitAudio;
    }

    public final String getPreloadKey() {
        return this.preloadKey;
    }

    public final PreloadPriority getPriority() {
        return this.priority;
    }

    public final VideoData getRawVideoDataWithIncorrectVsid() {
        return this.videoData;
    }

    public final int getSourceIndex() {
        return this.sourceIndex;
    }

    public final String getVideoSessionId() {
        return this.videoSessionId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.omitAudio) + unr0.e(unr0.e(unr0.e((this.eventIndexGenerator.hashCode() + oyr.b(this.sourceIndex, unr0.b((this.priority.hashCode() + ((this.config.hashCode() + (this.videoData.hashCode() * 31)) * 31)) * 31, 31, this.videoSessionId), 31)) * 31, 31, this.enableHevc), 31, this.ignoreMinHeightWithService), 31, this.ignoreMaxHeightWithService);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreloadRequest(videoData=");
        sb.append(this.videoData);
        sb.append(", config=");
        sb.append(this.config);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", videoSessionId=");
        sb.append(this.videoSessionId);
        sb.append(", sourceIndex=");
        sb.append(this.sourceIndex);
        sb.append(", eventIndexGenerator=");
        sb.append(this.eventIndexGenerator);
        sb.append(", enableHevc=");
        sb.append(this.enableHevc);
        sb.append(", ignoreMinHeightWithService=");
        sb.append(this.ignoreMinHeightWithService);
        sb.append(", ignoreMaxHeightWithService=");
        sb.append(this.ignoreMaxHeightWithService);
        sb.append(", omitAudio=");
        return unr0.u(sb, this.omitAudio, ')');
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/preload_manager/PreloadRequest$Companion;", "", "()V", "buildManifestUrl", "", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "videoSessionId", "sourceIndex", "", "enableHevc", "", "ignoreMinHeightWithService", "ignoreMaxHeightWithService", "buildPreloadKey", "buildPreloadKey$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String buildManifestUrl(VideoData videoData, String videoSessionId, int sourceIndex, boolean enableHevc, boolean ignoreMinHeightWithService, boolean ignoreMaxHeightWithService) {
            Uri uri;
            String addOrUpdateVsid = UrlModifierHelper.INSTANCE.addOrUpdateVsid(videoData.getManifestUrl(), videoSessionId);
            try {
                uri = Uri.parse(addOrUpdateVsid);
            } catch (Throwable th) {
                h5z0.a.f(th, g8e.o("url parsing error ", addOrUpdateVsid), new Object[0]);
                uri = null;
            }
            if (uri == null) {
                return addOrUpdateVsid;
            }
            String path = uri.getPath();
            if (path != null && cvu0.s(path, ".mpd", true)) {
                uri = UrlModifierHelper.INSTANCE.addOrUpdateQueryParameter(uri, UriQueryParameters.INSTANCE.get(2).getName(), "1");
            }
            UrlModifierHelper.Companion companion = UrlModifierHelper.INSTANCE;
            UriQueryParameters uriQueryParameters = UriQueryParameters.INSTANCE;
            Uri addOrUpdateQueryParameter = companion.addOrUpdateQueryParameter(uri, uriQueryParameters.get(13).getName(), String.valueOf(sourceIndex));
            if (enableHevc) {
                addOrUpdateQueryParameter = companion.addOrUpdateQueryParameter(addOrUpdateQueryParameter, uriQueryParameters.get(1).getName(), "1");
            }
            if (ignoreMinHeightWithService) {
                addOrUpdateQueryParameter = companion.removeQueryParameter(addOrUpdateQueryParameter, uriQueryParameters.get(7).getName());
            }
            if (ignoreMaxHeightWithService) {
                addOrUpdateQueryParameter = companion.removeQueryParameter(addOrUpdateQueryParameter, uriQueryParameters.get(6).getName());
            }
            return addOrUpdateQueryParameter.toString();
        }

        public final String buildPreloadKey$video_player_internalRelease(VideoData videoData) {
            return UrlModifierHelper.INSTANCE.removeVsid(videoData.getManifestUrl());
        }

        private Companion() {
        }
    }

    public PreloadRequest(VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority, String str, int i, IndexGenerator indexGenerator, boolean z) {
        this(videoData, preloadConfig, preloadPriority, str, i, indexGenerator, z, false, false, false, 896, null);
    }

    public PreloadRequest(VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority, String str, int i, IndexGenerator indexGenerator, boolean z, boolean z2) {
        this(videoData, preloadConfig, preloadPriority, str, i, indexGenerator, z, z2, false, false, 768, null);
    }

    public PreloadRequest(VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority, String str, int i, IndexGenerator indexGenerator, boolean z, boolean z2, boolean z3) {
        this(videoData, preloadConfig, preloadPriority, str, i, indexGenerator, z, z2, z3, false, 512, null);
    }

    public PreloadRequest(VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority, String str, int i, IndexGenerator indexGenerator) {
        this(videoData, preloadConfig, preloadPriority, str, i, indexGenerator, false, false, false, false, 960, null);
    }

    public /* synthetic */ PreloadRequest(VideoData videoData, PreloadConfig preloadConfig, PreloadPriority preloadPriority, String str, int i, IndexGenerator indexGenerator, boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoData, preloadConfig, preloadPriority, str, i, indexGenerator, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4);
    }
}
