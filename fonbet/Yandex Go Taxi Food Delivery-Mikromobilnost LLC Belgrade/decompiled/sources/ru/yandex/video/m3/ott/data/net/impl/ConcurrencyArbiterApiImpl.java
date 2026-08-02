package ru.yandex.video.m3.ott.data.net.impl;

import defpackage.b64;
import defpackage.d5j0;
import defpackage.d5z0;
import defpackage.g8e;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.oyr;
import defpackage.qje;
import defpackage.rvj0;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.w511;
import defpackage.wg10;
import defpackage.wms;
import defpackage.ysq0;
import defpackage.zy11;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.exception.ConcurrencyArbiterException;
import ru.yandex.video.m3.ott.data.net.ConcurrencyArbiterApi;
import ru.yandex.video.m3.ott.data.net.ConcurrencyArbiterHeartbeat;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0016\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010!J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006)"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl;", "Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterApi;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;)V", "Lkwu;", "url", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", ConfigConstants.CONFIG, "Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response;", "send", "(Lkwu;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response;", "", "mainPath", "buildUrl", "(Ljava/lang/String;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)Lkwu;", "responseBody", "Ljava/lang/Class;", "responseType", "convertResponseBody", "(Ljava/lang/String;Ljava/lang/Class;)Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response;", "Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response$Error;", "response", "arbiterConfig", "Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException;", "createConcurrencyArbiterError", "(Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response$Error;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)Lru/yandex/video/m3/ott/data/exception/ConcurrencyArbiterException;", "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterHeartbeat;", "start", "(Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)Ljava/util/concurrent/Future;", "heartbeat", "Lzy11;", "finish", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Companion", "Response", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConcurrencyArbiterApiImpl implements ConcurrencyArbiterApi {

    @Deprecated
    public static final int RESPONSE_CODE_418 = 418;

    @Deprecated
    public static final String TOO_MANY_STREAMS = "TOO_MANY_CONCURRENT_STREAMS";

    @Deprecated
    public static final String TOO_MANY_STREAMS_SOFT = "TOO_MANY_CONCURRENT_STREAMS_SOFT";
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ConcurrencyArbiterApiImpl(OkHttpClient okHttpClient, JsonConverter jsonConverter) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kwu buildUrl(String mainPath, Ott.ConcurrencyArbiterConfig config) {
        kwu kwuVar;
        Map<String, Object> requestParams = config.getRequestParams();
        Object obj = requestParams != null ? requestParams.get("watchSessionId") : null;
        String server = config.getServer();
        try {
            jwu jwuVar = new jwu();
            jwuVar.i(null, server);
            kwuVar = jwuVar.e();
        } catch (IllegalArgumentException unused) {
            kwuVar = null;
        }
        jwu g = kwuVar.g();
        if ((obj instanceof String) && ((CharSequence) obj).length() > 0) {
            g.d("wsid", (String) obj);
        }
        if (jl40.l(mainPath, "start")) {
            Map<String, Object> requestParams2 = config.getRequestParams();
            Object obj2 = requestParams2 != null ? requestParams2.get("failOnSoftLimit") : null;
            if (obj2 instanceof Boolean) {
                g.d("failOnSoftLimit", String.valueOf(((Boolean) obj2).booleanValue()));
            }
        }
        g.b(mainPath);
        return g.e();
    }

    private final Response convertResponseBody(String responseBody, Class<? extends Response> responseType) {
        Object failure;
        int i = 1;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        if (responseBody == null) {
            h5z0.a.a("responseBody is NULL", new Object[0]);
            return new Response.Error(z2 ? 1 : 0, i, z ? 1 : 0);
        }
        h5z0.a.a("responseStr = ".concat(responseBody), new Object[0]);
        try {
            Object obj = (Response) this.jsonConverter.from(responseBody, responseType);
            failure = obj;
            if (obj == null) {
                failure = new Response.Error(str, i, z3 ? 1 : 0);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        Object obj2 = failure;
        if (a != null) {
            h5z0.a.a(g8e.s(a, new StringBuilder("responseBody is not converted. Error: ")), new Object[0]);
            obj2 = new Response.Error(a.getMessage());
        }
        return (Response) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConcurrencyArbiterException createConcurrencyArbiterError(Response.Error response, Ott.ConcurrencyArbiterConfig arbiterConfig) {
        String error = response.getError();
        return jl40.l(error, TOO_MANY_STREAMS) ? new ConcurrencyArbiterException.TooManyStreams(arbiterConfig) : jl40.l(error, TOO_MANY_STREAMS_SOFT) ? new ConcurrencyArbiterException.TooManyStreamsSoft(arbiterConfig) : new ConcurrencyArbiterException.Unknown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Response send(kwu url, Ott.ConcurrencyArbiterConfig config) {
        String str = this.jsonConverter.to(config.getRequestParams());
        d5z0 d5z0Var = h5z0.a;
        d5z0Var.a("url = " + url + " jsonvalue= " + str, new Object[0]);
        OkHttpClient okHttpClient = this.okHttpClient;
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = url;
        int i = m5j0.a;
        Regex regex = wg10.e;
        t4j0Var.e("POST", wms.a(str, qje.o("application/json")));
        kvj0 execute = ((nci0) okHttpClient.newCall(new d5j0(t4j0Var))).execute();
        rvj0 rvj0Var = execute.z;
        int i2 = execute.w;
        String str2 = null;
        Object[] objArr = 0;
        String string = rvj0Var != null ? rvj0Var.string() : null;
        if (execute.J) {
            return convertResponseBody(string, Response.Success.class);
        }
        d5z0Var.a(oyr.i(i2, "response is not successful. Response code = "), new Object[0]);
        return i2 == 418 ? convertResponseBody(string, Response.Error.class) : new Response.Error(str2, 1, objArr == true ? 1 : 0);
    }

    @Override // ru.yandex.video.m3.ott.data.net.ConcurrencyArbiterApi
    public Future<zy11> finish(final Ott.ConcurrencyArbiterConfig config) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl$finish$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m758invoke() {
                kwu buildUrl;
                ConcurrencyArbiterApiImpl concurrencyArbiterApiImpl = ConcurrencyArbiterApiImpl.this;
                buildUrl = concurrencyArbiterApiImpl.buildUrl("finish", config);
                concurrencyArbiterApiImpl.send(buildUrl, config);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m758invoke();
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.ott.data.net.ConcurrencyArbiterApi
    public Future<ConcurrencyArbiterHeartbeat> heartbeat(final Ott.ConcurrencyArbiterConfig config) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl$heartbeat$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final ConcurrencyArbiterHeartbeat invoke() {
                kwu buildUrl;
                ConcurrencyArbiterApiImpl.Response send;
                ConcurrencyArbiterApiImpl concurrencyArbiterApiImpl = ConcurrencyArbiterApiImpl.this;
                buildUrl = concurrencyArbiterApiImpl.buildUrl("heartbeat", config);
                send = concurrencyArbiterApiImpl.send(buildUrl, config);
                ConcurrencyArbiterApiImpl.Response.Success success = send instanceof ConcurrencyArbiterApiImpl.Response.Success ? (ConcurrencyArbiterApiImpl.Response.Success) send : null;
                return new ConcurrencyArbiterHeartbeat(TimeUnit.SECONDS.toMillis(success != null ? success.getHeartbeatSec() : 0L));
            }
        });
    }

    @Override // ru.yandex.video.m3.ott.data.net.ConcurrencyArbiterApi
    public Future<ConcurrencyArbiterHeartbeat> start(final Ott.ConcurrencyArbiterConfig config) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl$start$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final ConcurrencyArbiterHeartbeat invoke() {
                kwu buildUrl;
                ConcurrencyArbiterApiImpl.Response send;
                ConcurrencyArbiterException createConcurrencyArbiterError;
                ConcurrencyArbiterApiImpl concurrencyArbiterApiImpl = ConcurrencyArbiterApiImpl.this;
                buildUrl = concurrencyArbiterApiImpl.buildUrl("start", config);
                send = concurrencyArbiterApiImpl.send(buildUrl, config);
                if (send instanceof ConcurrencyArbiterApiImpl.Response.Success) {
                    return new ConcurrencyArbiterHeartbeat(TimeUnit.SECONDS.toMillis(((ConcurrencyArbiterApiImpl.Response.Success) send).getHeartbeatSec()));
                }
                if (send instanceof ConcurrencyArbiterApiImpl.Response.Error) {
                    createConcurrencyArbiterError = ConcurrencyArbiterApiImpl.this.createConcurrencyArbiterError((ConcurrencyArbiterApiImpl.Response.Error) send, config);
                    throw createConcurrencyArbiterError;
                }
                w511.b();
                return null;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Companion;", "", "()V", "RESPONSE_CODE_418", "", "TOO_MANY_STREAMS", "", "TOO_MANY_STREAMS_SOFT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response;", "", "()V", "Error", "Success", "Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response$Error;", "Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response$Success;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Response {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response$Success;", "Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response;", "heartbeatSec", "", "(J)V", "getHeartbeatSec", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Success extends Response {
            public static final int $stable = 0;

            @ysq0("heartbeat")
            private final long heartbeatSec;

            public Success(long j) {
                super(null);
                this.heartbeatSec = j;
            }

            public static /* synthetic */ Success copy$default(Success success, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = success.heartbeatSec;
                }
                return success.copy(j);
            }

            /* renamed from: component1, reason: from getter */
            public final long getHeartbeatSec() {
                return this.heartbeatSec;
            }

            public final Success copy(long heartbeatSec) {
                return new Success(heartbeatSec);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && this.heartbeatSec == ((Success) other).heartbeatSec;
            }

            public final long getHeartbeatSec() {
                return this.heartbeatSec;
            }

            public int hashCode() {
                return Long.hashCode(this.heartbeatSec);
            }

            public String toString() {
                return b64.o(new StringBuilder("Success(heartbeatSec="), this.heartbeatSec, ')');
            }
        }

        public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Response() {
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response$Error;", "Lru/yandex/video/m3/ott/data/net/impl/ConcurrencyArbiterApiImpl$Response;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class Error extends Response {
            public static final int $stable = 0;

            @ysq0("error")
            private final String error;

            public /* synthetic */ Error(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.error;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getError() {
                return this.error;
            }

            public final Error copy(String error) {
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && jl40.l(this.error, ((Error) other).error);
            }

            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                String str = this.error;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return b64.p(new StringBuilder("Error(error="), this.error, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public Error(String str) {
                super(null);
                this.error = str;
            }
        }
    }
}
