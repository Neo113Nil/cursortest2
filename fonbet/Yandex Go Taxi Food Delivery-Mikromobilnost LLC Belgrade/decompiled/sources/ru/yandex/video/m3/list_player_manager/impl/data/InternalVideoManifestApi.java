package ru.yandex.video.m3.list_player_manager.impl.data;

import com.google.gson.reflect.TypeToken;
import defpackage.d5j0;
import defpackage.jwu;
import defpackage.kvj0;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.qje;
import defpackage.rvj0;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.wg10;
import defpackage.wms;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.list_player_manager.model.InternalVideo;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestApi;", "Lru/yandex/video/m3/list_player_manager/impl/data/BatchManifestApi;", "Lru/yandex/video/m3/list_player_manager/model/InternalVideo$ManifestResponse;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/config/AccountProvider;", "accountProvider", "Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestApiConfig;", ConfigConstants.CONFIG, "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestApiConfig;)V", "", "vpuid", "getRequestUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "contentIds", "Lm5j0;", "getRequestBody", "(Ljava/lang/Iterable;)Lm5j0;", "Ljava/util/concurrent/Future;", "loadManifests", "(Ljava/lang/String;Ljava/lang/Iterable;)Ljava/util/concurrent/Future;", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/config/AccountProvider;", "Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestApiConfig;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVideoManifestApi implements BatchManifestApi<InternalVideo.ManifestResponse> {
    private static final wg10 APPLICATION_JSON;

    @Deprecated
    public static final int BLACKBOX_NOT_AVAILABLE = 503;

    @Deprecated
    public static final int FILM_NOT_FOUND = 404;

    @Deprecated
    public static final int FORBIDDEN_BY_LICENSE = 412;

    @Deprecated
    public static final int INVALID_DEVICE_TOKEN = 401;

    @Deprecated
    public static final int PAYMENT_REQUIRED = 402;

    @Deprecated
    public static final int TOKEN_WAS_FROZEN = 403;

    @Deprecated
    public static final int USER_PROFILE_NOT_CREATED = 417;
    private final AccountProvider accountProvider;
    private final InternalVideoManifestApiConfig config;
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private static final Companion Companion = new Companion(0 == true ? 1 : 0);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        wg10 wg10Var = null;
        Regex regex = wg10.e;
        try {
            wg10Var = qje.o("application/json");
        } catch (IllegalArgumentException unused) {
        }
        APPLICATION_JSON = wg10Var;
    }

    public InternalVideoManifestApi(OkHttpClient okHttpClient, JsonConverter jsonConverter, AccountProvider accountProvider, InternalVideoManifestApiConfig internalVideoManifestApiConfig) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.accountProvider = accountProvider;
        this.config = internalVideoManifestApiConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m5j0 getRequestBody(Iterable<String> contentIds) {
        InternalVideo.RequestParams requestParams = new InternalVideo.RequestParams(this.config.getFrom(), null, a.J0(contentIds), 2, null);
        int i = m5j0.a;
        return wms.a(this.jsonConverter.to(requestParams), APPLICATION_JSON);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRequestUrl(String vpuid) {
        InternalVideoManifestApiConfig internalVideoManifestApiConfig = this.config;
        String endpoint = internalVideoManifestApiConfig.getEndpoint();
        jwu jwuVar = new jwu();
        jwuVar.i(null, endpoint);
        jwu g = jwuVar.e().g();
        g.c(internalVideoManifestApiConfig.getRequestPath(), false);
        String vhBackendService = internalVideoManifestApiConfig.getVhBackendService();
        if (vhBackendService != null) {
            g.d(Constants.KEY_SERVICE, vhBackendService);
        }
        if (vpuid != null) {
            g.d("vpuid", vpuid);
        }
        return g.e().i;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.data.BatchManifestApi
    public Future<InternalVideo.ManifestResponse> loadManifests(final String vpuid, final Iterable<String> contentIds) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestApi$loadManifests$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00e7 A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:11:0x0069, B:45:0x0070, B:47:0x0074, B:49:0x007a, B:26:0x00ba, B:27:0x00bf, B:28:0x00c0, B:30:0x00c4, B:31:0x00ca, B:32:0x00ce, B:34:0x00cf, B:35:0x00d4, B:36:0x00d5, B:37:0x00da, B:38:0x00db, B:39:0x00e0, B:40:0x00e1, B:41:0x00e6, B:42:0x00e7, B:43:0x00ec, B:52:0x0091, B:53:0x00a2), top: B:10:0x0069, inners: #0 }] */
            @Override // defpackage.sls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final InternalVideo.ManifestResponse invoke() {
                String requestUrl;
                AccountProvider accountProvider;
                InternalVideoManifestApiConfig internalVideoManifestApiConfig;
                m5j0 requestBody;
                OkHttpClient okHttpClient;
                String string;
                JsonConverter jsonConverter;
                InternalVideo.ManifestResponse manifestResponse;
                InternalVideoManifestApiConfig internalVideoManifestApiConfig2;
                AccountProvider accountProvider2;
                t4j0 t4j0Var = new t4j0();
                InternalVideoManifestApi internalVideoManifestApi = InternalVideoManifestApi.this;
                String str = vpuid;
                Iterable<String> iterable = contentIds;
                requestUrl = internalVideoManifestApi.getRequestUrl(str);
                t4j0Var.h(requestUrl);
                accountProvider = internalVideoManifestApi.accountProvider;
                if (accountProvider.getAuthToken().length() > 0) {
                    accountProvider2 = internalVideoManifestApi.accountProvider;
                    ExtFunctionsKt.addAuthHeader(t4j0Var, accountProvider2.getAuthToken());
                }
                internalVideoManifestApiConfig = internalVideoManifestApi.config;
                String userAgent = internalVideoManifestApiConfig.getUserAgent();
                if (userAgent != null && userAgent.length() != 0) {
                    internalVideoManifestApiConfig2 = internalVideoManifestApi.config;
                    ExtFunctionsKt.addUserAgent(t4j0Var, internalVideoManifestApiConfig2.getUserAgent());
                }
                requestBody = internalVideoManifestApi.getRequestBody(iterable);
                t4j0Var.e("POST", requestBody);
                okHttpClient = InternalVideoManifestApi.this.okHttpClient;
                kvj0 execute = ((nci0) okHttpClient.newCall(new d5j0(t4j0Var))).execute();
                InternalVideoManifestApi internalVideoManifestApi2 = InternalVideoManifestApi.this;
                try {
                    boolean z = execute.J;
                    int i = execute.w;
                    if (z) {
                        try {
                            rvj0 rvj0Var = execute.z;
                            if (rvj0Var != null && (string = rvj0Var.string()) != null) {
                                jsonConverter = internalVideoManifestApi2.jsonConverter;
                                manifestResponse = (InternalVideo.ManifestResponse) jsonConverter.from(string, new TypeToken<InternalVideo.ManifestResponse>() { // from class: ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestApi$loadManifests$1$invoke$lambda$2$lambda$1$$inlined$from$1
                                }.getType());
                                if (i != 412) {
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
                                        throw new ManifestLoadingException.NotFound(null, manifestResponse != null ? manifestResponse.getError() : null, 1, null);
                                    default:
                                        if (manifestResponse == null) {
                                            throw new ManifestLoadingException.UnknownError(null, null, 3, null);
                                        }
                                        execute.close();
                                        return manifestResponse;
                                }
                            }
                        } catch (Exception e) {
                            throw new ManifestLoadingException.UnknownError(e, "responseCode=" + i);
                        }
                    }
                    manifestResponse = null;
                    if (i != 412) {
                    }
                } finally {
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/data/InternalVideoManifestApi$Companion;", "", "<init>", "()V", "Lwg10;", "APPLICATION_JSON", "Lwg10;", "getAPPLICATION_JSON", "()Lwg10;", "", "BLACKBOX_NOT_AVAILABLE", CA20Status.STATUS_USER_I, "FILM_NOT_FOUND", "FORBIDDEN_BY_LICENSE", "INVALID_DEVICE_TOKEN", "PAYMENT_REQUIRED", "TOKEN_WAS_FROZEN", "USER_PROFILE_NOT_CREATED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wg10 getAPPLICATION_JSON() {
            return InternalVideoManifestApi.APPLICATION_JSON;
        }

        private Companion() {
        }
    }
}
