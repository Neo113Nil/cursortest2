package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.command.ServiceCommand;
import java.lang.reflect.Type;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;
import ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestApi$loadManifests$1$invoke$lambda$2$lambda$1$$inlined$from$1;
import ru.yandex.video.m3.list_player_manager.impl.data.InternalVideoManifestApiConfig;
import ru.yandex.video.m3.list_player_manager.model.InternalVideo;

/* loaded from: classes6.dex */
public final class rwe extends uif implements Function0 {
    public final /* synthetic */ swe r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Iterable t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwe(swe sweVar, String str, Iterable iterable) {
        super(0);
        this.r = sweVar;
        this.s = str;
        this.t = iterable;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116 A[Catch: all -> 0x00bc, TryCatch #1 {all -> 0x00bc, blocks: (B:14:0x0099, B:48:0x00a1, B:50:0x00a5, B:29:0x00e9, B:30:0x00ee, B:31:0x00ef, B:33:0x00f3, B:34:0x00f9, B:35:0x00fd, B:37:0x00fe, B:38:0x0103, B:39:0x0104, B:40:0x0109, B:41:0x010a, B:42:0x010f, B:43:0x0110, B:44:0x0115, B:45:0x0116, B:46:0x011b, B:53:0x00c0, B:54:0x00d1), top: B:13:0x0099, inners: #0 }] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        InternalVideo.ManifestResponse manifestResponse;
        b0o b0oVar = new b0o();
        swe sweVar = this.r;
        InternalVideoManifestApiConfig internalVideoManifestApiConfig = sweVar.c;
        n4f n4fVar = sweVar.b;
        String endpoint = internalVideoManifestApiConfig.getEndpoint();
        endpoint.getClass();
        s7e s7eVar = new s7e();
        s7eVar.h(null, endpoint);
        s7e f = s7eVar.e().f();
        String requestPath = internalVideoManifestApiConfig.getRequestPath();
        requestPath.getClass();
        f.c(requestPath, false);
        String vhBackendService = internalVideoManifestApiConfig.getVhBackendService();
        if (vhBackendService != null) {
            f.d("service", vhBackendService);
        }
        String str = this.s;
        if (str != null) {
            f.d("vpuid", str);
        }
        b0oVar.g(f.e().i);
        String userAgent = internalVideoManifestApiConfig.getUserAgent();
        if (userAgent != null && userAgent.length() != 0) {
            String userAgent2 = internalVideoManifestApiConfig.getUserAgent();
            userAgent2.getClass();
            b0oVar.a(HttpMessage.USER_AGENT, userAgent2);
        }
        b0oVar.e(ServiceCommand.TYPE_POST, ybl.b(n4fVar.to(new InternalVideo.RequestParams(internalVideoManifestApiConfig.getFrom(), null, CollectionsKt.w0(this.t), 2, null)), swe.d));
        OkHttpClient okHttpClient = sweVar.a;
        d0o b = b0oVar.b();
        okHttpClient.getClass();
        l3o execute = new mkn(okHttpClient, b, false).execute();
        try {
            boolean b2 = execute.b();
            int i = execute.d;
            if (b2) {
                try {
                    o3o o3oVar = execute.g;
                    if (o3oVar != null) {
                        String D = o3oVar.D();
                        Type type = new InternalVideoManifestApi$loadManifests$1$invoke$lambda$2$lambda$1$$inlined$from$1().getType();
                        type.getClass();
                        manifestResponse = (InternalVideo.ManifestResponse) n4fVar.a(D, type);
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
                            case NetworkRequestException.EXPIRED_SIGNATURE /* 401 */:
                            case NetworkRequestException.INVALID_SIGNATURE /* 403 */:
                                throw new ManifestLoadingException.Forbidden(null, null, 3, null);
                            case 402:
                                throw new ManifestLoadingException.PaymentRequired(null, null, 3, null);
                            case NetworkRequestException.RESOURCE_NOT_FOUND /* 404 */:
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
}
