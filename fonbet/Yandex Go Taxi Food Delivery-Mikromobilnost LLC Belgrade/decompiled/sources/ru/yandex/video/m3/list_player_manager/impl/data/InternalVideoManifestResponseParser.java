package ru.yandex.video.m3.list_player_manager.impl.data;

import defpackage.evu0;
import defpackage.gw00;
import defpackage.h5z0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.list_player_manager.model.InternalVideo;
import ru.yandex.video.m3.ott.data.dto.DrmAdvanced;
import ru.yandex.video.m3.ott.data.dto.DrmAdvancedWidevine;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.DrmServers;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoDataKt;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParamsKt;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ott.data.repository.impl.FallbackStreamTypeParser;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J*\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\rH\u0002J \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestResponseParser;", "", "()V", "createDrmConfig", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxyWithFreeRequestParams;", "drmParams", "Lru/yandex/video/m3/ott/data/dto/DrmParams;", "findVideoData", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "content", "Lru/yandex/video/m3/list_player_manager/model/InternalVideo$Content;", "streams", "", "Lru/yandex/video/m3/list_player_manager/model/InternalVideo$Stream;", "startPositionInMs", "", "generateOttTracking", "Lru/yandex/video/m3/ott/data/dto/Ott$TrackingData;", "sessionId", "", "getSupportedStream", "isStreamSupported", "", "stream", "parseManifestResponse", "", "Lkotlin/Result;", "response", "Lru/yandex/video/m3/list_player_manager/model/InternalVideo$ManifestResponse;", "responseContentToVideoData", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVideoManifestResponseParser {
    public static final int $stable = 0;
    public static final InternalVideoManifestResponseParser INSTANCE = new InternalVideoManifestResponseParser();

    private InternalVideoManifestResponseParser() {
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
            DrmProxyWithFreeRequestParams DrmProxyWithFreeRequestParams = DrmProxyWithFreeRequestParamsKt.DrmProxyWithFreeRequestParams(proxyUrl, (advanced == null || (widevine = advanced.getWidevine()) == null) ? null : widevine.getProvisioningUrl(), freeRequestParams, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestResponseParser$createDrmConfig$1$1$1$1
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

    private final VhVideoData findVideoData(final InternalVideo.Content content, List<InternalVideo.Stream> streams, final long startPositionInMs) {
        final InternalVideo.Stream supportedStream;
        if (streams == null) {
            return null;
        }
        if (streams.isEmpty()) {
            streams = null;
        }
        if (streams == null || (supportedStream = INSTANCE.getSupportedStream(streams)) == null) {
            return null;
        }
        return VhVideoDataKt.VhVideoData(supportedStream.getUrl(), content.getContentId(), new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestResponseParser$findVideoData$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(VhVideoData.Builder builder) {
                DrmProxyWithFreeRequestParams createDrmConfig;
                builder.setWatchProgressPositionMs(Long.valueOf(startPositionInMs));
                createDrmConfig = InternalVideoManifestResponseParser.INSTANCE.createDrmConfig(supportedStream.getDrmConfig());
                builder.setDrmConfig(createDrmConfig);
                builder.setFirstFrameUrl(content.getFirstFrameUrl());
                Boolean isUgcLive = content.isUgcLive();
                if (isUgcLive == null) {
                    isUgcLive = Boolean.FALSE;
                }
                builder.setUgcLive(isUgcLive);
                builder.setFirstFrameHash(content.getFirstFrameHash());
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VhVideoData.Builder) obj);
                return zy11.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ott.TrackingData generateOttTracking(InternalVideo.Content content, String sessionId) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(content.getOttParams());
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

    private final InternalVideo.Stream getSupportedStream(List<InternalVideo.Stream> streams) {
        int i = 0;
        for (Object obj : streams) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            InternalVideo.Stream stream = (InternalVideo.Stream) obj;
            if (INSTANCE.isStreamSupported(stream)) {
                return stream;
            }
            h5z0.a.o("Stream by index " + i + " is not supported! Stream = " + stream, new Object[0]);
            i = i2;
        }
        return null;
    }

    private final boolean isStreamSupported(InternalVideo.Stream stream) {
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

    private final VhVideoData responseContentToVideoData(final InternalVideo.Content content) {
        List<InternalVideo.Stream> streams;
        InternalVideo.ActualEpisode actualEpisode = content.getActualEpisode();
        List<InternalVideo.Stream> streams2 = actualEpisode != null ? actualEpisode.getStreams() : null;
        InternalVideo.ActualEpisode actualEpisode2 = content.getActualEpisode();
        VhVideoData findVideoData = findVideoData(content, streams2, (actualEpisode2 != null ? actualEpisode2.getStartPosition() : null) != null ? content.getActualEpisode().getStartPosition().longValue() * 1000 : -9223372036854775807L);
        if (findVideoData == null) {
            findVideoData = findVideoData(content, content.getStreams(), -9223372036854775807L);
        }
        List<InternalVideo.Stream> streams3 = content.getStreams();
        int i = 0;
        int size = streams3 != null ? streams3.size() : 0;
        InternalVideo.ActualEpisode actualEpisode3 = content.getActualEpisode();
        if (actualEpisode3 != null && (streams = actualEpisode3.getStreams()) != null) {
            i = streams.size();
        }
        if (findVideoData != null || size + i <= 0) {
            return findVideoData == null ? VhVideoDataKt.VhVideoData(content.getContentUrl(), content.getContentId(), new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestResponseParser$responseContentToVideoData$result$1
                {
                    super(1);
                }

                public final void invoke(VhVideoData.Builder builder) {
                    Ott.TrackingData generateOttTracking;
                    DrmRequestParams drmRequestParams;
                    builder.setFirstFrameUrl(InternalVideo.Content.this.getFirstFrameUrl());
                    builder.setFirstFrameHash(InternalVideo.Content.this.getFirstFrameHash());
                    Boolean isUgcLive = InternalVideo.Content.this.isUgcLive();
                    if (isUgcLive == null) {
                        isUgcLive = Boolean.FALSE;
                    }
                    builder.setUgcLive(isUgcLive);
                    if (InternalVideo.Content.this.getOttParams() != null) {
                        InternalVideoManifestResponseParser internalVideoManifestResponseParser = InternalVideoManifestResponseParser.INSTANCE;
                        InternalVideo.Content content2 = InternalVideo.Content.this;
                        DrmProxy drmConfig = builder.getDrmConfig();
                        generateOttTracking = internalVideoManifestResponseParser.generateOttTracking(content2, (drmConfig == null || (drmRequestParams = drmConfig.getDrmRequestParams()) == null) ? null : drmRequestParams.getWatchSessionId());
                        builder.setTrackingData(generateOttTracking);
                    }
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((VhVideoData.Builder) obj);
                    return zy11.a;
                }
            }) : findVideoData;
        }
        throw new ManifestLoadingException.NotFound(new IllegalStateException("Not supported stream"), null, 2, null);
    }

    public final Map<String, Result<VhVideoData>> parseManifestResponse(InternalVideo.ManifestResponse response) {
        Object failure;
        List<InternalVideo.ContentWrapper> contentList = response.getContentList();
        ArrayList<InternalVideo.Content> arrayList = new ArrayList();
        Iterator<T> it = contentList.iterator();
        while (it.hasNext()) {
            InternalVideo.Content content = ((InternalVideo.ContentWrapper) it.next()).getContent();
            if (content != null) {
                arrayList.add(content);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (InternalVideo.Content content2 : arrayList) {
            String contentId = content2.getContentId();
            try {
                failure = INSTANCE.responseContentToVideoData(content2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Pair pair = new Pair(contentId, new Result(failure));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }
}
