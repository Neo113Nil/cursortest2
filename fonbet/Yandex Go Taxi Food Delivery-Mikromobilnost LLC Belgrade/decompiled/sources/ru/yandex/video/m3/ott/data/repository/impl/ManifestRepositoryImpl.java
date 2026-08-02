package ru.yandex.video.m3.ott.data.repository.impl;

import defpackage.sls;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.DrmAdvanced;
import ru.yandex.video.m3.ott.data.dto.DrmAdvancedWidevine;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.DrmServers;
import ru.yandex.video.m3.ott.data.dto.DrmType;
import ru.yandex.video.m3.ott.data.dto.EndpointsData;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.ott.data.dto.WatchParams;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyKt;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ott.data.net.ManifestApi;
import ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.ott.data.repository.WatchParamsRepository;
import ru.yandex.video.m3.player.utils.FutureExtensions;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010,J'\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b+\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102¨\u00063"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/ManifestRepositoryImpl;", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "Lru/yandex/video/m3/ott/data/repository/impl/ManifestData;", "manifestData", "Lru/yandex/video/m3/ott/data/net/ManifestApi;", "Lru/yandex/video/m3/ott/data/dto/Ott$MasterPlaylist;", "manifestApi", "Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", "watchParamsRepository", "", "watchedStatusPercentage", "<init>", "(Lru/yandex/video/m3/ott/data/repository/impl/ManifestData;Lru/yandex/video/m3/ott/data/net/ManifestApi;Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;I)V", "", "contentId", "Lru/yandex/video/m3/ott/data/dto/WatchParams;", "tryGetWatchParams", "(Ljava/lang/String;)Lru/yandex/video/m3/ott/data/dto/WatchParams;", "", "Lru/yandex/video/m3/ott/data/dto/Ott$Stream;", "getSupportedStream", "(Lru/yandex/video/m3/ott/data/dto/Ott$MasterPlaylist;)Ljava/util/List;", "stream", "", "isStreamSupported", "(Lru/yandex/video/m3/ott/data/dto/Ott$Stream;)Z", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "createDrmConfig", "(Lru/yandex/video/m3/ott/data/dto/Ott$Stream;)Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "masterPlaylist", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "createTrackingData", "(Lru/yandex/video/m3/ott/data/dto/Ott$MasterPlaylist;Lru/yandex/video/m3/ott/data/dto/Ott$Stream;)Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "Lru/yandex/video/m3/ott/data/dto/EndpointsData;", "endpointsData", "Lzy11;", "setApiEndpointsData", "(Lru/yandex/video/m3/ott/data/dto/EndpointsData;)V", "deviceId", "setDeviceId", "(Ljava/lang/String;)V", "Ljava/util/concurrent/Future;", "loadVideoData", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "vpuid", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/repository/impl/ManifestData;", "Lru/yandex/video/m3/ott/data/net/ManifestApi;", "Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", CA20Status.STATUS_USER_I, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManifestRepositoryImpl implements ManifestRepository<OttVideoData> {
    public static final int $stable = 0;
    private final ManifestApi<Ott.MasterPlaylist> manifestApi;
    private final ManifestData manifestData;
    private final WatchParamsRepository watchParamsRepository;
    private final int watchedStatusPercentage;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DrmType.values().length];
            try {
                iArr[DrmType.Widevine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ManifestRepositoryImpl(ManifestData manifestData, ManifestApi<Ott.MasterPlaylist> manifestApi, WatchParamsRepository watchParamsRepository, int i) {
        this.manifestData = manifestData;
        this.manifestApi = manifestApi;
        this.watchParamsRepository = watchParamsRepository;
        this.watchedStatusPercentage = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DrmProxy createDrmConfig(Ott.Stream stream) {
        String proxyUrl;
        DrmAdvancedWidevine widevine;
        DrmType drmType = stream.getDrmType();
        if ((drmType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[drmType.ordinal()]) != 1) {
            return null;
        }
        DrmParams drmConfig = stream.getDrmConfig();
        if (drmConfig == null) {
            throw new ManifestLoadingException.UnknownError(new IllegalStateException("DrmConfig mustn't be null"), null, 2, null);
        }
        DrmServers servers = drmConfig.getServers();
        if (servers == null || (proxyUrl = servers.getProxyUrl()) == null) {
            throw new ManifestLoadingException.UnknownError(new IllegalStateException("ProxyUrl mustn't be null"), null, 2, null);
        }
        DrmRequestParams requestParams = drmConfig.getRequestParams();
        if (requestParams != null) {
            DrmAdvanced advanced = drmConfig.getAdvanced();
            DrmProxy DrmProxy$default = DrmProxyKt.DrmProxy$default(proxyUrl, (advanced == null || (widevine = advanced.getWidevine()) == null) ? null : widevine.getProvisioningUrl(), requestParams, null, 8, null);
            if (DrmProxy$default != null) {
                return DrmProxy$default;
            }
        }
        throw new ManifestLoadingException.UnknownError(new IllegalStateException("Drm request params mustn't be null"), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ott.TrackingData createTrackingData(Ott.MasterPlaylist masterPlaylist, Ott.Stream stream) {
        Map<String, Object> trackings = stream.getTrackings();
        if (trackings == null) {
            trackings = b.f();
        }
        return new Ott.TrackingData(trackings, false, this.manifestData.getFromBlock(), masterPlaylist.getSessionId(), this.manifestData.getKpId(), this.manifestData.getDeviceType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Ott.Stream> getSupportedStream(Ott.MasterPlaylist masterPlaylist) {
        List<Ott.Stream> streams = masterPlaylist.getStreams();
        ArrayList arrayList = new ArrayList();
        for (Object obj : streams) {
            if (isStreamSupported((Ott.Stream) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean isStreamSupported(Ott.Stream stream) {
        StreamType streamType = stream.getStreamType();
        if (streamType == null) {
            streamType = FallbackStreamTypeParser.INSTANCE.parse(stream.getUri());
        }
        if (stream.getDrmType() == null && (streamType == StreamType.Dash || streamType == StreamType.Hls)) {
            return true;
        }
        return stream.getDrmType() == DrmType.Widevine && stream.getDrmConfig() != null && streamType == StreamType.Dash;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchParams tryGetWatchParams(String contentId) {
        Object failure;
        try {
            failure = (WatchParams) this.watchParamsRepository.getWatchParams(contentId).get();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (WatchParams) failure;
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ManifestRepository
    public Future<OttVideoData> loadVideoData(final String contentId, final String vpuid) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.repository.impl.ManifestRepositoryImpl$loadVideoData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final OttVideoData invoke() {
                ManifestApi manifestApi;
                List supportedStream;
                WatchParams tryGetWatchParams;
                int i;
                DrmProxy createDrmConfig;
                Ott.TrackingData createTrackingData;
                try {
                    manifestApi = ManifestRepositoryImpl.this.manifestApi;
                    Ott.MasterPlaylist masterPlaylist = (Ott.MasterPlaylist) manifestApi.getManifest(contentId, vpuid).get();
                    if (masterPlaylist != null) {
                        ManifestRepositoryImpl manifestRepositoryImpl = ManifestRepositoryImpl.this;
                        String str = contentId;
                        supportedStream = manifestRepositoryImpl.getSupportedStream(masterPlaylist);
                        if (supportedStream.isEmpty()) {
                            throw new ManifestLoadingException.NotFound(new IllegalStateException("Not supported stream"), null, 2, null);
                        }
                        String parentContentId = masterPlaylist.getParentContentId();
                        if (parentContentId == null) {
                            parentContentId = str;
                        }
                        tryGetWatchParams = manifestRepositoryImpl.tryGetWatchParams(parentContentId);
                        int watchProgressPercent = masterPlaylist.getWatchProgressPercent();
                        i = manifestRepositoryImpl.watchedStatusPercentage;
                        Ott.MasterPlaylist masterPlaylist2 = watchProgressPercent < i ? masterPlaylist : null;
                        long watchProgressPosition = masterPlaylist2 != null ? masterPlaylist2.getWatchProgressPosition() : 0L;
                        OttVideoData ottVideoData = null;
                        for (Ott.Stream stream : a.q0(supportedStream)) {
                            String uri = stream.getUri();
                            String parentContentId2 = masterPlaylist.getParentContentId();
                            String audioLanguage = tryGetWatchParams != null ? tryGetWatchParams.getAudioLanguage() : null;
                            String subtitleLanguage = tryGetWatchParams != null ? tryGetWatchParams.getSubtitleLanguage() : null;
                            createDrmConfig = manifestRepositoryImpl.createDrmConfig(stream);
                            createTrackingData = manifestRepositoryImpl.createTrackingData(masterPlaylist, stream);
                            ottVideoData = new OttVideoData(uri, str, parentContentId2, audioLanguage, subtitleLanguage, watchProgressPosition, createDrmConfig, createTrackingData, !(masterPlaylist.getPlayerRestrictionConfig() != null ? r15.getSubtitlesButtonEnable() : true), masterPlaylist.getConcurrencyArbiterConfig(), ottVideoData, masterPlaylist.getRestrictionAge(), masterPlaylist.getMultiplex(), masterPlaylist.getContentType());
                        }
                        if (ottVideoData != null) {
                            return ottVideoData;
                        }
                    }
                    throw new ManifestLoadingException.NotFound(new IllegalStateException("MasterPlaylist mustn't be null"), null, 2, null);
                } catch (IOException e) {
                    throw new ManifestLoadingException.ConnectionError(e, null, 2, null);
                } catch (ExecutionException e2) {
                    if (e2.getCause() instanceof IOException) {
                        throw new ManifestLoadingException.ConnectionError(e2.getCause(), null, 2, null);
                    }
                    throw e2;
                }
            }
        });
    }

    public final void setApiEndpointsData(EndpointsData endpointsData) {
        ManifestApi<Ott.MasterPlaylist> manifestApi = this.manifestApi;
        ManifestApiImpl manifestApiImpl = manifestApi instanceof ManifestApiImpl ? (ManifestApiImpl) manifestApi : null;
        if (manifestApiImpl != null) {
            manifestApiImpl.setEndpointsData(endpointsData);
        }
    }

    public final void setDeviceId(String deviceId) {
        ManifestApi<Ott.MasterPlaylist> manifestApi = this.manifestApi;
        ManifestApiImpl manifestApiImpl = manifestApi instanceof ManifestApiImpl ? (ManifestApiImpl) manifestApi : null;
        if (manifestApiImpl != null) {
            manifestApiImpl.setDeviceId(deviceId);
        }
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ManifestRepository
    public Future<OttVideoData> loadVideoData(String contentId) {
        return loadVideoData(contentId, null);
    }

    public /* synthetic */ ManifestRepositoryImpl(ManifestData manifestData, ManifestApi manifestApi, WatchParamsRepository watchParamsRepository, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(manifestData, manifestApi, watchParamsRepository, (i2 & 8) != 0 ? 95 : i);
    }
}
