package ru.yandex.video.m3.ott.data.net.impl;

import com.google.gson.reflect.TypeToken;
import defpackage.cvu0;
import defpackage.d5j0;
import defpackage.kvj0;
import defpackage.nci0;
import defpackage.ooc;
import defpackage.rvj0;
import defpackage.sls;
import defpackage.t4j0;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.EndpointsData;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.net.ManifestApi;
import ru.yandex.video.m3.playback.features.PlaybackFeaturesHolder;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\u001fJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010\u001fJ\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\u0006\u0010\u001c\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010*¨\u0006."}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/ManifestApiImpl;", "Lru/yandex/video/m3/ott/data/net/ManifestApi;", "Lru/yandex/video/m3/ott/data/dto/Ott$MasterPlaylist;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/config/AccountProvider;", "accountProvider", "Lru/yandex/video/m3/playback/features/PlaybackFeaturesHolder;", "playbackFeaturesHolder", "", "userAgent", "", "serviceId", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/playback/features/PlaybackFeaturesHolder;Ljava/lang/String;I)V", "Lkvj0;", "extractResult", "(Lkvj0;)Ljava/lang/String;", "Lru/yandex/video/m3/ott/data/dto/EndpointsData;", "endpointsData", "Lzy11;", "setEndpointsData", "(Lru/yandex/video/m3/ott/data/dto/EndpointsData;)V", "deviceId", "setDeviceId", "(Ljava/lang/String;)V", "contentId", "Ljava/util/concurrent/Future;", "getManifest", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/dto/Ott$StreamsResponse;", "getStreams", "Lru/yandex/video/m3/ott/data/dto/Ott$MetadataInfo;", "getMetadata", "Lru/yandex/video/m3/ott/data/dto/Ott$TimingsResponse;", "getTimings", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/config/AccountProvider;", "Lru/yandex/video/m3/playback/features/PlaybackFeaturesHolder;", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/ott/data/dto/EndpointsData;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManifestApiImpl implements ManifestApi<Ott.MasterPlaylist> {
    public static final int BLACKBOX_NOT_AVAILABLE = 503;
    public static final int FILM_NOT_FOUND = 404;
    public static final int FORBIDDEN_BY_LICENSE = 412;
    public static final String HEADER_DEVICE_ID = "X-Device-Id";
    private static final String HEADER_USER_AGENT = "User-Agent";
    public static final String HEADER_X_DEVICE_AUDIO_CODECS = "X-Device-Audio-Codecs";
    public static final String HEADER_X_DEVICE_DYNAMIC_RANGES = "X-Device-Dynamic-Ranges";
    public static final String HEADER_X_DEVICE_VIDEO_CODECS = "X-Device-Video-Codecs";
    public static final String HEADER_X_DEVICE_VIDEO_FORMATS = "X-Device-Video-Formats";
    public static final int INVALID_DEVICE_TOKEN = 401;
    public static final int PAYMENT_REQUIRED = 402;
    public static final int TOKEN_WAS_FROZEN = 403;
    public static final int USER_PROFILE_NOT_CREATED = 417;
    private final AccountProvider accountProvider;
    private String deviceId;
    private EndpointsData endpointsData = new EndpointsData(null, null, null, null, 15, null);
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private final PlaybackFeaturesHolder playbackFeaturesHolder;
    private final int serviceId;
    private final String userAgent;
    public static final int $stable = 8;

    public ManifestApiImpl(OkHttpClient okHttpClient, JsonConverter jsonConverter, AccountProvider accountProvider, PlaybackFeaturesHolder playbackFeaturesHolder, String str, int i) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.accountProvider = accountProvider;
        this.playbackFeaturesHolder = playbackFeaturesHolder;
        this.userAgent = str;
        this.serviceId = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String extractResult(kvj0 kvj0Var) {
        try {
            kvj0 kvj0Var2 = !kvj0Var.J ? kvj0Var : null;
            if (kvj0Var2 == null) {
                rvj0 rvj0Var = kvj0Var.z;
                String string = rvj0Var != null ? rvj0Var.string() : null;
                ooc.g(kvj0Var, null);
                return string;
            }
            int i = kvj0Var2.w;
            if (i == 412) {
                throw new ManifestLoadingException.ForbiddenByLicense(null, null, 3, null);
            }
            if (i == 417) {
                throw new ManifestLoadingException.UserProfileNotCreated(null, null, 3, null);
            }
            if (i == 503) {
                throw new ManifestLoadingException.CommunicationError(null, null, 3, null);
            }
            switch (i) {
                case 401:
                case 403:
                    throw new ManifestLoadingException.Forbidden(null, null, 3, null);
                case 402:
                    throw new ManifestLoadingException.PaymentRequired(null, null, 3, null);
                case 404:
                    throw new ManifestLoadingException.NotFound(null, null, 3, null);
                default:
                    throw new ManifestLoadingException.UnknownError(null, null, 3, null);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(kvj0Var, th);
                throw th2;
            }
        }
    }

    @Override // ru.yandex.video.m3.ott.data.net.ManifestApi
    public Future<Ott.MasterPlaylist> getManifest(final String contentId) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl$getManifest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Ott.MasterPlaylist invoke() {
                Ott.MasterPlaylist masterPlaylist;
                AccountProvider accountProvider;
                List<Ott.Timing> timings;
                Ott.Timing timing;
                Ott.StreamsResponse streamsResponse = ManifestApiImpl.this.getStreams(contentId).get();
                if (streamsResponse != null) {
                    ManifestApiImpl manifestApiImpl = ManifestApiImpl.this;
                    String str = contentId;
                    Ott.MetadataInfo metadataInfo = manifestApiImpl.getMetadata(str).get();
                    if (metadataInfo != null) {
                        accountProvider = manifestApiImpl.accountProvider;
                        Ott.TimingsResponse timingsResponse = accountProvider.getAuthToken().length() > 0 ? manifestApiImpl.getTimings(str).get() : null;
                        long time = (timingsResponse == null || (timings = timingsResponse.getTimings()) == null || (timing = (Ott.Timing) a.R(timings)) == null) ? 0L : timing.getTime();
                        String sessionId = streamsResponse.getSessionId();
                        if (sessionId == null) {
                            throw new ManifestLoadingException.UnknownError(new IllegalStateException("sessionId mustn't be null if WatchRejection is not obtained"), null, 2, null);
                        }
                        String parentContentId = metadataInfo.getParentContentId();
                        List<Ott.Stream> streams = streamsResponse.getStreams();
                        if (streams == null) {
                            streams = EmptyList.a;
                        }
                        List<Ott.Stream> list = streams;
                        long millis = TimeUnit.SECONDS.toMillis(time);
                        int duration = (int) ((time * 100.0d) / metadataInfo.getDuration());
                        Ott.PlayerRestrictionConfig playerRestrictionConfig = streamsResponse.getPlayerRestrictionConfig();
                        Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig = streamsResponse.getConcurrencyArbiterConfig();
                        Ott.DrmRequirement drmRequirement = streamsResponse.getDrmRequirement();
                        Integer restrictionAge = metadataInfo.getRestrictionAge();
                        Boolean multiplex = streamsResponse.getMultiplex();
                        masterPlaylist = new Ott.MasterPlaylist(parentContentId, sessionId, list, millis, duration, playerRestrictionConfig, concurrencyArbiterConfig, drmRequirement, restrictionAge, multiplex != null ? multiplex.booleanValue() : false, metadataInfo.getContentType());
                    } else {
                        masterPlaylist = null;
                    }
                    if (masterPlaylist != null) {
                        return masterPlaylist;
                    }
                }
                throw new ManifestLoadingException.NotFound(null, null, 3, null);
            }
        });
    }

    public final Future<Ott.MetadataInfo> getMetadata(final String contentId) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl$getMetadata$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Ott.MetadataInfo invoke() {
                EndpointsData endpointsData;
                EndpointsData endpointsData2;
                OkHttpClient okHttpClient;
                String extractResult;
                JsonConverter jsonConverter;
                ManifestApiImpl manifestApiImpl = ManifestApiImpl.this;
                t4j0 t4j0Var = new t4j0();
                endpointsData = ManifestApiImpl.this.endpointsData;
                String metadataUrl = endpointsData.getMetadataUrl();
                endpointsData2 = ManifestApiImpl.this.endpointsData;
                t4j0Var.h(cvu0.v(metadataUrl, endpointsData2.getContentIdTemplate(), contentId, false));
                d5j0 d5j0Var = new d5j0(t4j0Var);
                okHttpClient = ManifestApiImpl.this.okHttpClient;
                extractResult = manifestApiImpl.extractResult(((nci0) okHttpClient.newCall(d5j0Var)).execute());
                if (extractResult == null) {
                    return null;
                }
                jsonConverter = ManifestApiImpl.this.jsonConverter;
                return (Ott.MetadataInfo) jsonConverter.from(extractResult, new TypeToken<Ott.MetadataInfo>() { // from class: ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl$getMetadata$1$invoke$lambda$1$$inlined$from$1
                }.getType());
            }
        });
    }

    public final Future<Ott.StreamsResponse> getStreams(final String contentId) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl$getStreams$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Ott.StreamsResponse invoke() {
                EndpointsData endpointsData;
                EndpointsData endpointsData2;
                int i;
                String str;
                PlaybackFeaturesHolder playbackFeaturesHolder;
                PlaybackFeaturesHolder playbackFeaturesHolder2;
                PlaybackFeaturesHolder playbackFeaturesHolder3;
                PlaybackFeaturesHolder playbackFeaturesHolder4;
                String str2;
                AccountProvider accountProvider;
                OkHttpClient okHttpClient;
                String extractResult;
                JsonConverter jsonConverter;
                ManifestLoadingException manifestLoadingError;
                t4j0 t4j0Var = new t4j0();
                StringBuilder sb = new StringBuilder();
                endpointsData = ManifestApiImpl.this.endpointsData;
                String streamsUrl = endpointsData.getStreamsUrl();
                endpointsData2 = ManifestApiImpl.this.endpointsData;
                sb.append(cvu0.v(streamsUrl, String.valueOf(endpointsData2.getContentIdTemplate()), contentId, false));
                sb.append("?serviceId=");
                i = ManifestApiImpl.this.serviceId;
                sb.append(i);
                t4j0Var.h(sb.toString());
                str = ManifestApiImpl.this.userAgent;
                t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
                playbackFeaturesHolder = ManifestApiImpl.this.playbackFeaturesHolder;
                String audioCodecs = playbackFeaturesHolder.getAudioCodecs();
                if (audioCodecs != null) {
                    t4j0Var.a(ManifestApiImpl.HEADER_X_DEVICE_AUDIO_CODECS, audioCodecs);
                }
                playbackFeaturesHolder2 = ManifestApiImpl.this.playbackFeaturesHolder;
                String videoCodecs = playbackFeaturesHolder2.getVideoCodecs();
                if (videoCodecs != null) {
                    t4j0Var.a(ManifestApiImpl.HEADER_X_DEVICE_VIDEO_CODECS, videoCodecs);
                }
                playbackFeaturesHolder3 = ManifestApiImpl.this.playbackFeaturesHolder;
                String hdrModes = playbackFeaturesHolder3.getHdrModes();
                if (hdrModes != null) {
                    t4j0Var.a(ManifestApiImpl.HEADER_X_DEVICE_DYNAMIC_RANGES, hdrModes);
                }
                playbackFeaturesHolder4 = ManifestApiImpl.this.playbackFeaturesHolder;
                String videoFormats = playbackFeaturesHolder4.getVideoFormats();
                if (videoFormats != null) {
                    t4j0Var.a(ManifestApiImpl.HEADER_X_DEVICE_VIDEO_FORMATS, videoFormats);
                }
                str2 = ManifestApiImpl.this.deviceId;
                if (str2 != null) {
                    t4j0Var.a(ManifestApiImpl.HEADER_DEVICE_ID, str2);
                }
                ManifestApiImpl manifestApiImpl = ManifestApiImpl.this;
                accountProvider = manifestApiImpl.accountProvider;
                t4j0 addAuthHeader = ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider.getAuthToken());
                addAuthHeader.getClass();
                d5j0 d5j0Var = new d5j0(addAuthHeader);
                okHttpClient = ManifestApiImpl.this.okHttpClient;
                extractResult = manifestApiImpl.extractResult(((nci0) okHttpClient.newCall(d5j0Var)).execute());
                if (extractResult == null) {
                    return null;
                }
                jsonConverter = ManifestApiImpl.this.jsonConverter;
                Ott.StreamsResponse streamsResponse = (Ott.StreamsResponse) jsonConverter.from(extractResult, new TypeToken<Ott.StreamsResponse>() { // from class: ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl$getStreams$1$invoke$lambda$6$$inlined$from$1
                }.getType());
                if (streamsResponse == null) {
                    return null;
                }
                Ott.WatchRejection watchingRejection = streamsResponse.getWatchingRejection();
                if (watchingRejection == null || (manifestLoadingError = Ott.INSTANCE.toManifestLoadingError(watchingRejection)) == null) {
                    return streamsResponse;
                }
                throw manifestLoadingError;
            }
        });
    }

    public final Future<Ott.TimingsResponse> getTimings(final String contentId) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl$getTimings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Ott.TimingsResponse invoke() {
                EndpointsData endpointsData;
                AccountProvider accountProvider;
                OkHttpClient okHttpClient;
                String extractResult;
                JsonConverter jsonConverter;
                ManifestApiImpl manifestApiImpl = ManifestApiImpl.this;
                t4j0 t4j0Var = new t4j0();
                StringBuilder sb = new StringBuilder();
                endpointsData = ManifestApiImpl.this.endpointsData;
                sb.append(endpointsData.getTimingsUrl());
                sb.append("?contentId=");
                sb.append(contentId);
                t4j0Var.h(sb.toString());
                accountProvider = ManifestApiImpl.this.accountProvider;
                t4j0 addAuthHeader = ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider.getAuthToken());
                addAuthHeader.getClass();
                d5j0 d5j0Var = new d5j0(addAuthHeader);
                okHttpClient = ManifestApiImpl.this.okHttpClient;
                extractResult = manifestApiImpl.extractResult(((nci0) okHttpClient.newCall(d5j0Var)).execute());
                if (extractResult == null) {
                    return null;
                }
                jsonConverter = ManifestApiImpl.this.jsonConverter;
                return (Ott.TimingsResponse) jsonConverter.from(extractResult, new TypeToken<Ott.TimingsResponse>() { // from class: ru.yandex.video.m3.ott.data.net.impl.ManifestApiImpl$getTimings$1$invoke$lambda$1$$inlined$from$1
                }.getType());
            }
        });
    }

    public final void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public final void setEndpointsData(EndpointsData endpointsData) {
        this.endpointsData = endpointsData;
    }
}
