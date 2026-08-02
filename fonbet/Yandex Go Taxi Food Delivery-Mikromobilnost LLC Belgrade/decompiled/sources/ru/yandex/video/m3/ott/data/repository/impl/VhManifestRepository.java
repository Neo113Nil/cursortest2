package ru.yandex.video.m3.ott.data.repository.impl;

import defpackage.evu0;
import defpackage.h5z0;
import defpackage.scc;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.DrmAdvanced;
import ru.yandex.video.m3.ott.data.dto.DrmAdvancedWidevine;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.DrmServers;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.Vh;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoDataKt;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParamsKt;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ott.data.net.ManifestApi;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository;
import ru.yandex.video.m3.player.utils.FutureExtensions;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/VhManifestRepository;", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "manifestApi", "Lru/yandex/video/m3/ott/data/net/ManifestApi;", "Lru/yandex/video/m3/ott/data/dto/Vh$VhResponse;", "(Lru/yandex/video/m3/ott/data/net/ManifestApi;)V", "loadVideoData", "Ljava/util/concurrent/Future;", "contentId", "", "vpuid", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VhManifestRepository implements ManifestRepository<VhVideoData> {
    private final ManifestApi<Vh.VhResponse> manifestApi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public VhManifestRepository(ManifestApi<Vh.VhResponse> manifestApi) {
        this.manifestApi = manifestApi;
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ManifestRepository
    public Future<VhVideoData> loadVideoData(final String contentId, final String vpuid) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository$loadVideoData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final VhVideoData invoke() {
                ManifestApi manifestApi;
                try {
                    VhManifestRepository.Companion companion = VhManifestRepository.INSTANCE;
                    manifestApi = VhManifestRepository.this.manifestApi;
                    return companion.responseToVideoData((Vh.VhResponse) manifestApi.getManifest(contentId, vpuid).get());
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

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J4\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0002J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\n¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/VhManifestRepository$Companion;", "", "()V", "createDrmConfig", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;", "drmParams", "Lru/yandex/video/m3/ott/data/dto/DrmParams;", "findVideoData", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "response", "Lru/yandex/video/m3/ott/data/dto/Vh$VhResponse;", "streams", "", "Lru/yandex/video/m3/ott/data/dto/Vh$Stream;", "startPositionInMs", "", "thumbnail", "", "generateOttTracking", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "sessionId", "getSupportedStream", "isStreamSupported", "", "stream", "responseToVideoData", "vhResponse", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DrmProxyWithFreeRequestParams createDrmConfig(final DrmParams drmParams) {
            String proxyUrl;
            DrmAdvancedWidevine widevine;
            if (drmParams == null) {
                return null;
            }
            DrmServers servers = drmParams.getServers();
            if (servers == null || (proxyUrl = servers.getProxyUrl()) == null) {
                throw new ManifestLoadingException.UnknownError(new IllegalStateException("ProxyUrl mustn't be null"), null, 2, null);
            }
            Map<String, String> freeRequestParams = drmParams.getFreeRequestParams();
            if (freeRequestParams != null) {
                DrmAdvanced advanced = drmParams.getAdvanced();
                DrmProxyWithFreeRequestParams DrmProxyWithFreeRequestParams = DrmProxyWithFreeRequestParamsKt.DrmProxyWithFreeRequestParams(proxyUrl, (advanced == null || (widevine = advanced.getWidevine()) == null) ? null : widevine.getProvisioningUrl(), freeRequestParams, new tls() { // from class: ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository$Companion$createDrmConfig$1$1$1$1
                    {
                        super(1);
                    }

                    public final void invoke(DrmProxyWithFreeRequestParams.Builder builder) {
                        builder.setDrmRequestParams(DrmParams.this.getRequestParams());
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DrmProxyWithFreeRequestParams.Builder) obj);
                        return zy11.a;
                    }
                });
                if (DrmProxyWithFreeRequestParams != null) {
                    return DrmProxyWithFreeRequestParams;
                }
            }
            throw new ManifestLoadingException.UnknownError(new IllegalStateException("Drm request params mustn't be null"), null, 2, null);
        }

        private final VhVideoData findVideoData(final Vh.VhResponse response, List<Vh.Stream> streams, final long startPositionInMs, final String thumbnail) {
            final Vh.Stream supportedStream;
            if (streams == null) {
                return null;
            }
            if (streams.isEmpty()) {
                streams = null;
            }
            if (streams == null || (supportedStream = VhManifestRepository.INSTANCE.getSupportedStream(streams)) == null) {
                return null;
            }
            return VhVideoDataKt.VhVideoData(supportedStream.getUrl(), response.getContent().getContentId(), new tls() { // from class: ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository$Companion$findVideoData$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(VhVideoData.Builder builder) {
                    DrmProxyWithFreeRequestParams createDrmConfig;
                    builder.setWatchProgressPositionMs(Long.valueOf(startPositionInMs));
                    createDrmConfig = VhManifestRepository.INSTANCE.createDrmConfig(supportedStream.getDrmConfig());
                    builder.setDrmConfig(createDrmConfig);
                    builder.setFirstFrameUrl(response.getContent().getFirstFrameUrl());
                    Boolean isUgcLive = response.getContent().isUgcLive();
                    if (isUgcLive == null) {
                        isUgcLive = Boolean.FALSE;
                    }
                    builder.setUgcLive(isUgcLive);
                    builder.setFirstFrameHash(response.getContent().getFirstFrameHash());
                    builder.setThumbnail(thumbnail);
                    builder.setTitle(response.getContent().getTitle());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((VhVideoData.Builder) obj);
                    return zy11.a;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Ott.TrackingData generateOttTracking(Vh.VhResponse response, String sessionId) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(response.getContent().getOttParams());
            linkedHashMap.remove("licenses");
            Object obj = linkedHashMap.get("fromBlock");
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = linkedHashMap.get("kpId");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = linkedHashMap.get("deviceType");
            Ott.DeviceType deviceType = obj3 instanceof Ott.DeviceType ? (Ott.DeviceType) obj3 : null;
            if (deviceType == null) {
                deviceType = Ott.DeviceType.App;
            }
            return new Ott.TrackingData(linkedHashMap, false, str, sessionId, str2, deviceType);
        }

        private final boolean isStreamSupported(Vh.Stream stream) {
            DrmServers servers;
            StreamType streamType = stream.getStreamType();
            if (streamType == null) {
                streamType = FallbackStreamTypeParser.INSTANCE.parse(stream.getUrl());
            }
            if (stream.getDrmConfig() == null && (streamType == StreamType.Dash || streamType == StreamType.Hls)) {
                return true;
            }
            DrmParams drmConfig = stream.getDrmConfig();
            String proxyUrl = (drmConfig == null || (servers = drmConfig.getServers()) == null) ? null : servers.getProxyUrl();
            return (proxyUrl == null || evu0.J(proxyUrl) || streamType != StreamType.Dash) ? false : true;
        }

        public final Vh.Stream getSupportedStream(List<Vh.Stream> streams) {
            int i = 0;
            for (Object obj : streams) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                Vh.Stream stream = (Vh.Stream) obj;
                if (VhManifestRepository.INSTANCE.isStreamSupported(stream)) {
                    return stream;
                }
                h5z0.a.o("Stream by index " + i + " is not supported! Stream = " + stream, new Object[0]);
                i = i2;
            }
            return null;
        }

        public final VhVideoData responseToVideoData(final Vh.VhResponse vhResponse) {
            List<Vh.Stream> streams;
            if (vhResponse != null) {
                Companion companion = VhManifestRepository.INSTANCE;
                Vh.ActualEpisode actualEpisode = vhResponse.getContent().getActualEpisode();
                List<Vh.Stream> streams2 = actualEpisode != null ? actualEpisode.getStreams() : null;
                Vh.ActualEpisode actualEpisode2 = vhResponse.getContent().getActualEpisode();
                VhVideoData findVideoData = companion.findVideoData(vhResponse, streams2, (actualEpisode2 != null ? actualEpisode2.getStartPosition() : null) != null ? vhResponse.getContent().getActualEpisode().getStartPosition().longValue() * 1000 : -9223372036854775807L, vhResponse.getContent().getThumbnail());
                if (findVideoData == null) {
                    findVideoData = companion.findVideoData(vhResponse, vhResponse.getContent().getStreams(), -9223372036854775807L, vhResponse.getContent().getThumbnail());
                }
                List<Vh.Stream> streams3 = vhResponse.getContent().getStreams();
                int i = 0;
                int size = streams3 != null ? streams3.size() : 0;
                Vh.ActualEpisode actualEpisode3 = vhResponse.getContent().getActualEpisode();
                if (actualEpisode3 != null && (streams = actualEpisode3.getStreams()) != null) {
                    i = streams.size();
                }
                if (findVideoData == null && size + i > 0) {
                    throw new ManifestLoadingException.NotFound(new IllegalStateException("Not supported stream"), null, 2, null);
                }
                if (findVideoData == null) {
                    findVideoData = VhVideoDataKt.VhVideoData(vhResponse.getContent().getContentUrl(), vhResponse.getContent().getContentId(), new tls() { // from class: ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository$Companion$responseToVideoData$1$result$1
                        {
                            super(1);
                        }

                        public final void invoke(VhVideoData.Builder builder) {
                            builder.setFirstFrameUrl(Vh.VhResponse.this.getContent().getFirstFrameUrl());
                            Boolean isUgcLive = Vh.VhResponse.this.getContent().isUgcLive();
                            if (isUgcLive == null) {
                                isUgcLive = Boolean.FALSE;
                            }
                            builder.setUgcLive(isUgcLive);
                            builder.setTitle(Vh.VhResponse.this.getContent().getTitle());
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((VhVideoData.Builder) obj);
                            return zy11.a;
                        }
                    });
                }
                if (vhResponse.getContent().getOttParams() != null) {
                    findVideoData = findVideoData.copy(new tls() { // from class: ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository$Companion$responseToVideoData$1$1
                        {
                            super(1);
                        }

                        public final void invoke(VhVideoData.Builder builder) {
                            Ott.TrackingData generateOttTracking;
                            DrmRequestParams drmRequestParams;
                            VhManifestRepository.Companion companion2 = VhManifestRepository.INSTANCE;
                            Vh.VhResponse vhResponse2 = Vh.VhResponse.this;
                            DrmProxy drmConfig = builder.getDrmConfig();
                            generateOttTracking = companion2.generateOttTracking(vhResponse2, (drmConfig == null || (drmRequestParams = drmConfig.getDrmRequestParams()) == null) ? null : drmRequestParams.getWatchSessionId());
                            builder.setTrackingData(generateOttTracking);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((VhVideoData.Builder) obj);
                            return zy11.a;
                        }
                    });
                }
                if (findVideoData != null) {
                    return findVideoData;
                }
            }
            throw new ManifestLoadingException.NotFound(new IllegalStateException("Not supported stream"), null, 2, null);
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ManifestRepository
    public Future<VhVideoData> loadVideoData(String contentId) {
        return loadVideoData(contentId, null);
    }
}
