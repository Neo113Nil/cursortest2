package ru.yandex.video.m3.ott.data.net.impl;

import com.google.gson.reflect.TypeToken;
import defpackage.d5j0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.kvj0;
import defpackage.nci0;
import defpackage.rvj0;
import defpackage.scc;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.ExtendedVh;
import ru.yandex.video.m3.ott.data.dto.Vh;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParamsKt;
import ru.yandex.video.m3.ott.data.net.ManifestApi;
import ru.yandex.video.m3.ott.data.net.impl.urlprovider.DefaultRequestUrlProvider;
import ru.yandex.video.m3.ott.data.net.impl.urlprovider.InternalRequestUrlProvider;
import ru.yandex.video.m3.ott.data.net.impl.urlprovider.RequestUrlProvider;
import ru.yandex.video.m3.playback.features.PlaybackFeaturesHolder;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B7\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013H\u0002J \u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001aH\u0002J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0016J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0016J\u001c\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010 \u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/VhManifestApi;", "Lru/yandex/video/m3/ott/data/net/ManifestApi;", "Lru/yandex/video/m3/ott/data/dto/Vh$VhResponse;", "okHttpClient", "Lokhttp3/OkHttpClient;", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "accountProvider", "Lru/yandex/video/m3/config/AccountProvider;", "vhManifestArguments", "Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;", "endpoint", "", "requestUrlProvider", "Lru/yandex/video/m3/ott/data/net/impl/urlprovider/InternalRequestUrlProvider;", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;Ljava/lang/String;Lru/yandex/video/m3/ott/data/net/impl/urlprovider/InternalRequestUrlProvider;)V", "playbackFeaturesHolder", "Lru/yandex/video/m3/playback/features/PlaybackFeaturesHolder;", "castExtendedStreamsToUsual", "", "Lru/yandex/video/m3/ott/data/dto/Vh$Stream;", "extendedStreams", "Lru/yandex/video/m3/ott/data/dto/ExtendedVh$Stream;", "createDeprecatedRequestParams", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "freeRequestParams", "", "getManifest", "Ljava/util/concurrent/Future;", "contentId", "vpuid", "getRequestUrl", "setPlaybackFeaturesHolder", "Builder", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VhManifestApi implements ManifestApi<Vh.VhResponse> {
    public static final String PROD_ENDPOINT = "https://frontend.vh.yandex.ru/player";
    public static final String TEST_ENDPOINT = "https://vh.test.yandex.ru/live/player";
    private final AccountProvider accountProvider;
    private final String endpoint;
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private PlaybackFeaturesHolder playbackFeaturesHolder;
    private final InternalRequestUrlProvider requestUrlProvider;
    private final VhManifestArguments vhManifestArguments;
    public static final int $stable = 8;
    private static final List<String> FORBIDDEN_BY_MODERATION_STATUSES = scc.g("DISABLED_BY_FILE_MODERATION_STATUS", "DISABLED_BY_PRIVACY_MODERATION_STATUS");

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\b)R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/VhManifestApi$Builder;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "accountProvider", "Lru/yandex/video/m3/config/AccountProvider;", "vhManifestArguments", "Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;)V", "getAccountProvider", "()Lru/yandex/video/m3/config/AccountProvider;", "setAccountProvider", "(Lru/yandex/video/m3/config/AccountProvider;)V", "endpoint", "", "getEndpoint", "()Ljava/lang/String;", "setEndpoint", "(Ljava/lang/String;)V", "getJsonConverter", "()Lru/yandex/video/m3/player/utils/JsonConverter;", "setJsonConverter", "(Lru/yandex/video/m3/player/utils/JsonConverter;)V", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "requestUrlProvider", "Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider;", "getRequestUrlProvider", "()Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider;", "setRequestUrlProvider", "(Lru/yandex/video/m3/ott/data/net/impl/urlprovider/RequestUrlProvider;)V", "getVhManifestArguments", "()Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;", "setVhManifestArguments", "(Lru/yandex/video/m3/ott/data/net/impl/VhManifestArguments;)V", "build", "Lru/yandex/video/m3/ott/data/net/impl/VhManifestApi;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AccountProvider accountProvider;
        private String endpoint;
        private JsonConverter jsonConverter;
        private OkHttpClient okHttpClient;
        private RequestUrlProvider requestUrlProvider;
        private VhManifestArguments vhManifestArguments;

        public Builder(OkHttpClient okHttpClient, JsonConverter jsonConverter, AccountProvider accountProvider, VhManifestArguments vhManifestArguments) {
            this.okHttpClient = okHttpClient;
            this.jsonConverter = jsonConverter;
            this.accountProvider = accountProvider;
            this.vhManifestArguments = vhManifestArguments;
        }

        public final VhManifestApi build$video_player_internalRelease() {
            String str = this.endpoint;
            if (str == null) {
                str = VhManifestApi.PROD_ENDPOINT;
            }
            String str2 = str;
            VhManifestArguments vhManifestArguments = this.vhManifestArguments;
            RequestUrlProvider requestUrlProvider = this.requestUrlProvider;
            if (requestUrlProvider == null) {
                requestUrlProvider = new DefaultRequestUrlProvider();
            }
            return new VhManifestApi(this.okHttpClient, this.jsonConverter, this.accountProvider, this.vhManifestArguments, str2, new InternalRequestUrlProvider(vhManifestArguments, str2, requestUrlProvider), null);
        }

        public final AccountProvider getAccountProvider() {
            return this.accountProvider;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }

        public final JsonConverter getJsonConverter() {
            return this.jsonConverter;
        }

        public final OkHttpClient getOkHttpClient() {
            return this.okHttpClient;
        }

        public final RequestUrlProvider getRequestUrlProvider() {
            return this.requestUrlProvider;
        }

        public final VhManifestArguments getVhManifestArguments() {
            return this.vhManifestArguments;
        }

        public final void setAccountProvider(AccountProvider accountProvider) {
            this.accountProvider = accountProvider;
        }

        public final void setEndpoint(String str) {
            this.endpoint = str;
        }

        public final void setJsonConverter(JsonConverter jsonConverter) {
            this.jsonConverter = jsonConverter;
        }

        public final void setOkHttpClient(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
        }

        public final void setRequestUrlProvider(RequestUrlProvider requestUrlProvider) {
            this.requestUrlProvider = requestUrlProvider;
        }

        public final void setVhManifestArguments(VhManifestArguments vhManifestArguments) {
            this.vhManifestArguments = vhManifestArguments;
        }
    }

    private VhManifestApi(OkHttpClient okHttpClient, JsonConverter jsonConverter, AccountProvider accountProvider, VhManifestArguments vhManifestArguments, String str, InternalRequestUrlProvider internalRequestUrlProvider) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.accountProvider = accountProvider;
        this.vhManifestArguments = vhManifestArguments;
        this.endpoint = str;
        this.requestUrlProvider = internalRequestUrlProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Vh.Stream> castExtendedStreamsToUsual(List<ExtendedVh.Stream> extendedStreams) {
        if (extendedStreams == null) {
            return EmptyList.a;
        }
        List<ExtendedVh.Stream> list = extendedStreams;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (ExtendedVh.Stream stream : list) {
            DrmParams drmParams = stream.getDrmConfig() != null ? new DrmParams(stream.getDrmConfig().getRequestParams(), createDeprecatedRequestParams(stream.getDrmConfig().getRequestParams()), stream.getDrmConfig().getServers(), stream.getDrmConfig().getAdvanced()) : null;
            StreamType streamType = stream.getStreamType();
            String url = stream.getUrl();
            if (url == null) {
                url = "";
            }
            arrayList.add(new Vh.Stream(streamType, url, drmParams));
        }
        return arrayList;
    }

    private final DrmRequestParams createDeprecatedRequestParams(Map<String, String> freeRequestParams) {
        if (freeRequestParams == null) {
            return null;
        }
        String str = freeRequestParams.get("productId");
        Long valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        String str2 = freeRequestParams.get("contentId");
        String str3 = freeRequestParams.get("contentTypeId");
        Long valueOf2 = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
        String str4 = freeRequestParams.get("serviceName");
        String str5 = freeRequestParams.get("version");
        String str6 = freeRequestParams.get("expirationTimestamp");
        Long valueOf3 = str6 != null ? Long.valueOf(Long.parseLong(str6)) : null;
        String str7 = freeRequestParams.get("monetizationModel");
        String str8 = freeRequestParams.get("verificationRequired");
        Boolean valueOf4 = str8 != null ? Boolean.valueOf(Boolean.parseBoolean(str8)) : null;
        String str9 = freeRequestParams.get("watchSessionId");
        String str10 = freeRequestParams.get(X509CertImpl.SIGNATURE);
        String str11 = freeRequestParams.get("sessionTimestamp");
        Integer valueOf5 = str11 != null ? Integer.valueOf(Integer.parseInt(str11)) : null;
        String str12 = freeRequestParams.get("persistent");
        Boolean valueOf6 = str12 != null ? Boolean.valueOf(Boolean.parseBoolean(str12)) : null;
        String str13 = freeRequestParams.get("sessionId");
        String str14 = freeRequestParams.get("puid");
        Long valueOf7 = str14 != null ? Long.valueOf(Long.parseLong(str14)) : null;
        String str15 = freeRequestParams.get("strictPlaybackTtl");
        Long valueOf8 = str15 != null ? Long.valueOf(Long.parseLong(str15)) : null;
        String str16 = freeRequestParams.get("rentalTtl");
        Long valueOf9 = str16 != null ? Long.valueOf(Long.parseLong(str16)) : null;
        String str17 = freeRequestParams.get("storageTtl");
        Long valueOf10 = str17 != null ? Long.valueOf(Long.parseLong(str17)) : null;
        String str18 = freeRequestParams.get("playbackTtl");
        Long valueOf11 = str18 != null ? Long.valueOf(Long.parseLong(str18)) : null;
        final String str19 = freeRequestParams.get("uuid");
        final String str20 = freeRequestParams.get("uuidSignature");
        String str21 = freeRequestParams.get("internal");
        final Boolean valueOf12 = str21 != null ? Boolean.valueOf(Boolean.parseBoolean(str21)) : null;
        if (valueOf2 == null || valueOf3 == null || str7 == null || str10 == null || valueOf4 == null || str5 == null || str9 == null) {
            return null;
        }
        return DrmRequestParamsKt.DrmRequestParams(valueOf, valueOf5, str13, str4, str2, valueOf2.longValue(), valueOf3.longValue(), str7, valueOf7, str10, valueOf4.booleanValue(), str5, str9, valueOf6, valueOf8, valueOf9, valueOf10, valueOf11, new tls() { // from class: ru.yandex.video.m3.ott.data.net.impl.VhManifestApi$createDeprecatedRequestParams$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(DrmRequestParams.Builder builder) {
                builder.setUuid(str19);
                builder.setUuidSignature(str20);
                builder.setInternalStream(valueOf12);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrmRequestParams.Builder) obj);
                return zy11.a;
            }
        });
    }

    public static /* synthetic */ String getRequestUrl$default(VhManifestApi vhManifestApi, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return vhManifestApi.getRequestUrl(str, str2);
    }

    @Override // ru.yandex.video.m3.ott.data.net.ManifestApi
    public Future<Vh.VhResponse> getManifest(final String contentId, final String vpuid) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.VhManifestApi$getManifest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0180 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #1 {all -> 0x00b5, blocks: (B:22:0x0180, B:28:0x019d, B:29:0x01a0, B:30:0x01a5, B:32:0x01a6, B:34:0x01ae, B:35:0x01b4, B:37:0x01ba, B:39:0x01be, B:40:0x01c2, B:41:0x01c5, B:42:0x01c6, B:44:0x01ca, B:45:0x01ce, B:46:0x01d1, B:48:0x01d2, B:49:0x01d7, B:50:0x01d8, B:51:0x01dd, B:52:0x01de, B:53:0x01e3, B:54:0x01e4, B:55:0x01e9, B:56:0x01ea, B:57:0x01ef, B:58:0x01f0, B:59:0x01f5, B:61:0x01f8, B:63:0x0200, B:67:0x0209, B:68:0x020f, B:70:0x0217, B:72:0x021f, B:74:0x0234, B:75:0x0238, B:76:0x023b, B:77:0x023c, B:78:0x0241, B:79:0x0242, B:80:0x0257, B:82:0x0258, B:84:0x025e, B:86:0x0264, B:87:0x026a, B:89:0x0283, B:91:0x028b, B:92:0x0291, B:94:0x0297, B:97:0x02aa, B:101:0x02b6, B:106:0x02c2, B:107:0x02d7, B:108:0x02d8, B:109:0x02ef, B:120:0x0091, B:122:0x0095, B:124:0x009b, B:126:0x00b0, B:127:0x00bd, B:130:0x00c3, B:133:0x00cc, B:136:0x00d5, B:137:0x00db, B:139:0x00e3, B:141:0x00e9, B:142:0x00ef, B:144:0x00f5, B:146:0x00fb, B:147:0x0101, B:149:0x0106, B:151:0x010f, B:153:0x011a, B:155:0x0125, B:157:0x0130, B:159:0x013b, B:161:0x0146, B:163:0x0151, B:165:0x015c, B:166:0x0165, B:168:0x016c, B:170:0x0174, B:171:0x017a, B:200:0x02f0, B:201:0x030e), top: B:119:0x0091, inners: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01f6  */
            @Override // defpackage.sls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Vh.VhResponse invoke() {
                AccountProvider accountProvider;
                VhManifestArguments vhManifestArguments;
                PlaybackFeaturesHolder playbackFeaturesHolder;
                OkHttpClient okHttpClient;
                String string;
                JsonConverter jsonConverter;
                Vh.VhResponse vhResponse;
                String str;
                String str2;
                List castExtendedStreamsToUsual;
                List castExtendedStreamsToUsual2;
                ExtendedVh.ActualEpisode actualEpisode;
                ExtendedVh.ActualEpisode actualEpisode2;
                JsonConverter jsonConverter2;
                JsonConverter jsonConverter3;
                Vh.License license;
                Object obj;
                Vh.Content content;
                List list;
                t4j0 t4j0Var = new t4j0();
                t4j0Var.h(VhManifestApi.this.getRequestUrl(contentId, vpuid));
                accountProvider = VhManifestApi.this.accountProvider;
                t4j0 addAuthHeader = ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider.getAuthToken());
                vhManifestArguments = VhManifestApi.this.vhManifestArguments;
                t4j0 addUserAgent = ExtFunctionsKt.addUserAgent(addAuthHeader, vhManifestArguments.getUserAgent());
                playbackFeaturesHolder = VhManifestApi.this.playbackFeaturesHolder;
                if (playbackFeaturesHolder != null) {
                    String audioCodecs = playbackFeaturesHolder.getAudioCodecs();
                    if (audioCodecs != null) {
                        addUserAgent.a(ManifestApiImpl.HEADER_X_DEVICE_AUDIO_CODECS, audioCodecs);
                    }
                    String videoCodecs = playbackFeaturesHolder.getVideoCodecs();
                    if (videoCodecs != null) {
                        addUserAgent.a(ManifestApiImpl.HEADER_X_DEVICE_VIDEO_CODECS, videoCodecs);
                    }
                    String hdrModes = playbackFeaturesHolder.getHdrModes();
                    if (hdrModes != null) {
                        addUserAgent.a(ManifestApiImpl.HEADER_X_DEVICE_DYNAMIC_RANGES, hdrModes);
                    }
                    String videoFormats = playbackFeaturesHolder.getVideoFormats();
                    if (videoFormats != null) {
                        addUserAgent.a(ManifestApiImpl.HEADER_X_DEVICE_VIDEO_FORMATS, videoFormats);
                    }
                }
                okHttpClient = VhManifestApi.this.okHttpClient;
                addUserAgent.getClass();
                kvj0 execute = ((nci0) okHttpClient.newCall(new d5j0(addUserAgent))).execute();
                boolean z = execute.J;
                VhManifestApi vhManifestApi = VhManifestApi.this;
                int i = execute.w;
                d5j0 d5j0Var = execute.a;
                if (z || i == 404) {
                    try {
                        try {
                            rvj0 rvj0Var = execute.z;
                            if (rvj0Var != null && (string = rvj0Var.string()) != null) {
                                jsonConverter = vhManifestApi.jsonConverter;
                                ExtendedVh.ExtendedVhResponse extendedVhResponse = (ExtendedVh.ExtendedVhResponse) jsonConverter.from(string, new TypeToken<ExtendedVh.ExtendedVhResponse>() { // from class: ru.yandex.video.m3.ott.data.net.impl.VhManifestApi$getManifest$1$invoke$lambda$8$lambda$5$$inlined$from$1
                                }.getType());
                                ExtendedVh.Content content2 = extendedVhResponse != null ? extendedVhResponse.getContent() : null;
                                if (content2 == null || (str = content2.getContentId()) == null) {
                                    str = "";
                                }
                                if (content2 == null || (str2 = content2.getContentUrl()) == null) {
                                    str2 = "";
                                }
                                castExtendedStreamsToUsual = vhManifestApi.castExtendedStreamsToUsual(content2 != null ? content2.getStreams() : null);
                                castExtendedStreamsToUsual2 = vhManifestApi.castExtendedStreamsToUsual((content2 == null || (actualEpisode2 = content2.getActualEpisode()) == null) ? null : actualEpisode2.getStreams());
                                vhResponse = new Vh.VhResponse(new Vh.Content(str, str2, castExtendedStreamsToUsual, new Vh.ActualEpisode(castExtendedStreamsToUsual2, (content2 == null || (actualEpisode = content2.getActualEpisode()) == null) ? null : actualEpisode.getStartPosition()), content2 != null ? content2.isUgcLive() : null, content2 != null ? content2.isUgcLiveStatus() : null, content2 != null ? content2.getViewers() : null, content2 != null ? content2.getXivaSubscriptionId() : null, content2 != null ? content2.getOttParams() : null, content2 != null ? content2.getFirstFrameUrl() : null, content2 != null ? content2.getFirstFrameHash() : null, content2 != null ? content2.getTitle() : null, content2 != null ? content2.getThumbnail() : null), extendedVhResponse != null ? extendedVhResponse.getError() : null, extendedVhResponse != null ? extendedVhResponse.getError_cause() : null);
                                if (z) {
                                    ManifestLoadingException.UnknownError.GenericError genericError = new ManifestLoadingException.UnknownError.GenericError(execute.w, d5j0Var.a.i, null, null, 12, null);
                                    if (i == 412) {
                                        throw new ManifestLoadingException.ForbiddenByLicense(genericError, null, 2, null);
                                    }
                                    if (i == 417) {
                                        throw new ManifestLoadingException.UserProfileNotCreated(genericError, null, 2, null);
                                    }
                                    if (i == 503) {
                                        throw new ManifestLoadingException.CommunicationError(genericError, null, 2, null);
                                    }
                                    switch (i) {
                                        case 401:
                                            throw new ManifestLoadingException.Forbidden(genericError, null, 2, null);
                                        case 402:
                                            throw new ManifestLoadingException.PaymentRequired(genericError, null, 2, null);
                                        case 403:
                                            throw new ManifestLoadingException.Forbidden(genericError, null, 2, null);
                                        case 404:
                                            list = VhManifestApi.FORBIDDEN_BY_MODERATION_STATUSES;
                                            if (a.G(list, vhResponse != null ? vhResponse.getError_cause() : null)) {
                                                throw new ManifestLoadingException.ForbiddenByModeration(vhResponse != null ? vhResponse.getError_cause() : null);
                                            }
                                            throw new ManifestLoadingException.NotFound(genericError, vhResponse != null ? vhResponse.getError_cause() : null);
                                        default:
                                            throw new ManifestLoadingException.UnknownError(genericError, null, 2, null);
                                    }
                                }
                                String error = vhResponse != null ? vhResponse.getError() : null;
                                if (error != null && !evu0.J(error)) {
                                    String error2 = vhResponse != null ? vhResponse.getError() : null;
                                    if (jl40.l(error2, "no_licenses")) {
                                        throw new ManifestLoadingException.ForbiddenByLicense(new ManifestLoadingException.UnknownError.GenericError(execute.w, d5j0Var.a.i, null, null, 12, null), null, 2, null);
                                    }
                                    if (jl40.l(error2, "invalid_region")) {
                                        throw new ManifestLoadingException.InvalidRegion();
                                    }
                                    throw new ManifestLoadingException.UnknownError(new ManifestLoadingException.UnknownError.GenericError(execute.w, d5j0Var.a.i, null, null, 12, null), vhResponse != null ? vhResponse.getError() : null);
                                }
                                jsonConverter2 = vhManifestApi.jsonConverter;
                                String str3 = jsonConverter2.to((vhResponse == null || (content = vhResponse.getContent()) == null) ? null : content.getOttParams());
                                jsonConverter3 = vhManifestApi.jsonConverter;
                                Vh.Licenses licenses = (Vh.Licenses) jsonConverter3.from(str3, new TypeToken<Vh.Licenses>() { // from class: ru.yandex.video.m3.ott.data.net.impl.VhManifestApi$getManifest$1$invoke$lambda$8$$inlined$from$1
                                }.getType());
                                List<Vh.License> licenses2 = licenses != null ? licenses.getLicenses() : null;
                                if (licenses2 != null) {
                                    Iterator<T> it = licenses2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj = null;
                                            break;
                                        }
                                        obj = it.next();
                                        Vh.License license2 = (Vh.License) obj;
                                        Boolean active = license2.getActive();
                                        Boolean bool = Boolean.TRUE;
                                        if (!jl40.l(active, bool) && jl40.l(license2.getPrimary(), bool)) {
                                            break;
                                        }
                                    }
                                    license = (Vh.License) obj;
                                } else {
                                    license = null;
                                }
                                if (license != null) {
                                    throw new ManifestLoadingException.SubscriptionNotFoundError(new ManifestLoadingException.UnknownError.GenericError(execute.w, d5j0Var.a.i, null, null, 12, null), "Primary license is not active");
                                }
                                if (vhResponse == null) {
                                    throw new ManifestLoadingException.NotFound(new ManifestLoadingException.UnknownError.GenericError(execute.w, d5j0Var.a.i, null, null, 12, null), null, 2, null);
                                }
                                execute.close();
                                return vhResponse;
                            }
                        } catch (Exception e) {
                            throw new ManifestLoadingException.UnknownError(new ManifestLoadingException.UnknownError.GenericError(i, d5j0Var.a.i, e, e.getMessage()), "responseCode=" + i);
                        }
                    } finally {
                    }
                }
                vhResponse = null;
                if (z) {
                }
            }
        });
    }

    public final String getRequestUrl(String contentId, String vpuid) {
        return this.requestUrlProvider.getRequestUrl(contentId, vpuid);
    }

    public final VhManifestApi setPlaybackFeaturesHolder(PlaybackFeaturesHolder playbackFeaturesHolder) {
        this.playbackFeaturesHolder = playbackFeaturesHolder;
        return this;
    }

    @Override // ru.yandex.video.m3.ott.data.net.ManifestApi
    public Future<Vh.VhResponse> getManifest(String contentId) {
        return getManifest(contentId, null);
    }

    public /* synthetic */ VhManifestApi(OkHttpClient okHttpClient, JsonConverter jsonConverter, AccountProvider accountProvider, VhManifestArguments vhManifestArguments, String str, InternalRequestUrlProvider internalRequestUrlProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, jsonConverter, accountProvider, vhManifestArguments, str, internalRequestUrlProvider);
    }
}
