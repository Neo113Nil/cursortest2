package ru.yandex.video.m3.ab.api;

import android.os.Build;
import android.util.Log;
import defpackage.b64;
import defpackage.d5j0;
import defpackage.g8e;
import defpackage.jwu;
import defpackage.kvj0;
import defpackage.nci0;
import defpackage.rvj0;
import defpackage.sbx;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.unr0;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.ab.api.AbConfigApiException;
import ru.yandex.video.m3.ab.api.AbConfigApiSuccessfulResponse;
import ru.yandex.video.m3.ab.config.internal.InternalAbConfig;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.provider.internal.UuidProvider;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 42\u00020\u0001:\u00014BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010\"\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J%\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApi;", "", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/player/provider/internal/UuidProvider;", "uuidProvider", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "Lsbx;", "json", "", "appPackageName", "endpoint", "Lkotlin/Function0;", "", "currentTimeProvider", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/provider/internal/UuidProvider;Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lsbx;Ljava/lang/String;Ljava/lang/String;Lsls;)V", "uuid", AbConfigApi.VPUID_QUERY_PARAMETER, "buildRequestUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "userAgent", "etag", "requestUrl", "Lzy11;", "logUaasRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "internalAbConfig", "logUaasResponse", "(Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;Ljava/lang/String;)V", "", "throwable", "logUaasError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "logOnKeep", "()V", "Lkotlin/Result;", "Lru/yandex/video/m3/ab/api/AbConfigApiSuccessfulResponse;", "fetchConfig-IoAF18A$video_player_internalRelease", "(Ljava/lang/String;)Ljava/lang/Object;", "fetchConfig", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/provider/internal/UuidProvider;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Lsbx;", "Ljava/lang/String;", "Lsls;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbConfigApi {
    private static final String ANDROID_PLAYER_AB_SERVICE = "vdpltfrm";
    private static final String CLIENT_FEATURE_DEVICE = "cfs_android_device";
    private static final String CLIENT_FEATURE_MANUFACTURER = "cfs_android_manufacturer";
    private static final String CLIENT_FEATURE_MODEL = "cfs_android_model";
    private static final String CLIENT_FEATURE_PRODUCT = "cfs_android_product";
    private static final String CLIENT_FEATURE_SDK_VERSION = "cfn_android_sdk_int";
    private static final String HEADER_ETAG = "Etag";
    private static final String HEADER_IF_NONE_MATCH = "If-None-Match";
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final int HTTP_RESPONSE_CODE_NOT_MODIFIED = 304;
    private static final String PACKAGE_QUERY_PARAMETER = "package";
    private static final String PLAYER_AB_EXPS_INFO_TAG = "YP:ABExps";
    private static final String PLAYER_SEM_VER = "3.7.1";
    private static final String PROD_ENDPOINT = "https://frontend.vh.yandex.ru/uaas/android_player";
    private static final String SERVICE_QUERY_PARAMETER = "service";
    private static final String UUID_QUERY_PARAMETER = "uuid";
    private static final String VERSION_QUERY_PARAMETER = "version";
    private static final String VPUID_QUERY_PARAMETER = "vpuid";
    private final String appPackageName;
    private final sls currentTimeProvider;
    private final String endpoint;
    private final InfoProvider infoProvider;
    private final sbx json;
    private final OkHttpClient okHttpClient;
    private final PlayerLogger playerLogger;
    private final UuidProvider uuidProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ AbConfigApi(OkHttpClient okHttpClient, UuidProvider uuidProvider, InfoProvider infoProvider, sbx sbxVar, String str, String str2, sls slsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, uuidProvider, infoProvider, sbxVar, str, (i & 32) != 0 ? PROD_ENDPOINT : str2, (i & 64) != 0 ? new sls() { // from class: ru.yandex.video.m3.ab.api.AbConfigApi.1
            @Override // defpackage.sls
            public final Long invoke() {
                return Long.valueOf(System.currentTimeMillis());
            }
        } : slsVar);
    }

    private final String buildRequestUrl(String uuid, String vpuid) throws IllegalArgumentException {
        String str = this.endpoint;
        jwu jwuVar = new jwu();
        jwuVar.i(null, str);
        jwu g = jwuVar.e().g();
        g.d("uuid", uuid);
        g.d("service", ANDROID_PLAYER_AB_SERVICE);
        g.d(PACKAGE_QUERY_PARAMETER, this.appPackageName);
        g.d("version", "3.7.1");
        if (vpuid != null) {
            g.d(VPUID_QUERY_PARAMETER, vpuid);
        }
        String str2 = Build.MODEL;
        Locale locale = Locale.ROOT;
        g.d(CLIENT_FEATURE_MODEL, str2.toLowerCase(locale));
        g.d(CLIENT_FEATURE_DEVICE, Build.DEVICE.toLowerCase(locale));
        g.d(CLIENT_FEATURE_PRODUCT, Build.PRODUCT.toLowerCase(locale));
        g.d(CLIENT_FEATURE_MANUFACTURER, Build.MANUFACTURER.toLowerCase(locale));
        g.d(CLIENT_FEATURE_SDK_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        return g.toString();
    }

    private final void logOnKeep() {
        if (PlayerLoggerExtensionsKt.getEnabled(this.playerLogger)) {
            Log.i(PLAYER_AB_EXPS_INFO_TAG, "responseCode=304 keeping config");
        }
    }

    private final void logUaasError(String uuid, String vpuid, String userAgent, String etag, Throwable throwable) {
        if (PlayerLoggerExtensionsKt.getEnabled(this.playerLogger)) {
            Log.e(PLAYER_AB_EXPS_INFO_TAG, unr0.r(b64.v("uuid=", uuid, " vpuid=", vpuid, " userAgent="), userAgent, " etag=", etag), throwable);
        }
    }

    private final void logUaasRequest(String uuid, String vpuid, String userAgent, String etag, String requestUrl) {
        if (PlayerLoggerExtensionsKt.getEnabled(this.playerLogger)) {
            StringBuilder v = b64.v("uuid=", uuid, " vpuid=", vpuid, " userAgent=");
            g8e.D(v, userAgent, " etag=", etag, " requestUrl=");
            v.append(requestUrl);
            Log.i(PLAYER_AB_EXPS_INFO_TAG, v.toString());
        }
    }

    private final void logUaasResponse(InternalAbConfig internalAbConfig, String etag) {
        if (PlayerLoggerExtensionsKt.getEnabled(this.playerLogger)) {
            Log.i(PLAYER_AB_EXPS_INFO_TAG, "abConfig=" + internalAbConfig + " etag=" + etag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [T, kotlin.Result$Failure] */
    /* renamed from: fetchConfig-IoAF18A$video_player_internalRelease, reason: not valid java name */
    public final Object m731fetchConfigIoAF18A$video_player_internalRelease(String etag) {
        kvj0 execute;
        T failure;
        InternalAbConfig internalAbConfig;
        String string;
        String uuid = this.uuidProvider.getUuid();
        if (uuid == null) {
            return new Result.Failure(new AbConfigApiException.UuidUnavailableApiException("No UUID available"));
        }
        String vpuid = this.infoProvider.getVpuid();
        try {
            String buildRequestUrl = buildRequestUrl(uuid, vpuid);
            t4j0 t4j0Var = new t4j0();
            t4j0Var.h(buildRequestUrl);
            t4j0Var.a("User-Agent", this.infoProvider.getUserAgent());
            if (etag != null) {
                t4j0Var.a(HEADER_IF_NONE_MATCH, etag);
            }
            d5j0 d5j0Var = new d5j0(t4j0Var);
            logUaasRequest(uuid, vpuid, this.infoProvider.getUserAgent(), etag, buildRequestUrl);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            try {
                execute = ((nci0) this.okHttpClient.newCall(d5j0Var)).execute();
            } catch (IOException e) {
                ref$ObjectRef.element = new Result.Failure(new AbConfigApiException.AbConfigFetchException(e.getCause(), e.getMessage()));
            }
            try {
                boolean z = execute.J;
                String str = execute.c;
                int i = execute.w;
                if (z) {
                    try {
                        rvj0 rvj0Var = execute.z;
                        if (rvj0Var == null || (string = rvj0Var.string()) == null) {
                            internalAbConfig = null;
                        } else {
                            sbx sbxVar = this.json;
                            sbxVar.getClass();
                            internalAbConfig = (InternalAbConfig) sbxVar.b(InternalAbConfig.INSTANCE.serializer(), string);
                        }
                        String a = execute.y.a(HEADER_ETAG);
                        if (a == null) {
                            a = "";
                        }
                        if (internalAbConfig != null) {
                            logUaasResponse(internalAbConfig, a);
                            failure = new AbConfigApiSuccessfulResponse.NewConfig(internalAbConfig, a, ((Number) this.currentTimeProvider.invoke()).longValue());
                        } else {
                            failure = new Result.Failure(new AbConfigApiException.ResponseExtractionApiException(null, "Failed reading response body. Response body is null"));
                        }
                    } catch (Exception e2) {
                        failure = new Result.Failure(new AbConfigApiException.ResponseExtractionApiException(e2, "Failed to extract response body. responseCode=" + i + " message=" + str));
                    }
                } else if (i == 304) {
                    logOnKeep();
                    failure = new AbConfigApiSuccessfulResponse.KeepConfig(((Number) this.currentTimeProvider.invoke()).longValue());
                } else {
                    failure = new Result.Failure(new AbConfigApiException.ResponseIsNotSuccessful("responseCode=" + i + " message=" + str, i));
                }
                ref$ObjectRef.element = failure;
                execute.close();
                if (ref$ObjectRef.element instanceof Result.Failure) {
                    logUaasError(uuid, vpuid, this.infoProvider.getUserAgent(), etag, Result.a(ref$ObjectRef.element));
                }
                return ref$ObjectRef.element;
            } finally {
            }
        } catch (IllegalArgumentException e3) {
            StringBuilder sb = new StringBuilder();
            sb.append(e3.getMessage());
            sb.append(" endpoint=");
            g8e.D(sb, this.endpoint, ", uuid=", uuid, ", vpuid=");
            sb.append(vpuid);
            sb.append(", service=");
            sb.append(this.appPackageName);
            return new Result.Failure(new AbConfigApiException.IncorrectUrlParameters(e3, sb.toString()));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/ab/api/AbConfigApi$Companion;", "", "()V", "ANDROID_PLAYER_AB_SERVICE", "", "CLIENT_FEATURE_DEVICE", "CLIENT_FEATURE_MANUFACTURER", "CLIENT_FEATURE_MODEL", "CLIENT_FEATURE_PRODUCT", "CLIENT_FEATURE_SDK_VERSION", "HEADER_ETAG", "HEADER_IF_NONE_MATCH", "HEADER_USER_AGENT", "HTTP_RESPONSE_CODE_NOT_MODIFIED", "", "PACKAGE_QUERY_PARAMETER", "PLAYER_AB_EXPS_INFO_TAG", "PLAYER_SEM_VER", "PROD_ENDPOINT", "SERVICE_QUERY_PARAMETER", "UUID_QUERY_PARAMETER", "VERSION_QUERY_PARAMETER", "VPUID_QUERY_PARAMETER", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AbConfigApi(OkHttpClient okHttpClient, UuidProvider uuidProvider, InfoProvider infoProvider, sbx sbxVar, String str, String str2, sls slsVar) {
        this.okHttpClient = okHttpClient;
        this.uuidProvider = uuidProvider;
        this.infoProvider = infoProvider;
        this.json = sbxVar;
        this.appPackageName = str;
        this.endpoint = str2;
        this.currentTimeProvider = slsVar;
        this.playerLogger = new TimberPlayerLogger();
    }
}
