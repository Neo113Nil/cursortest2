package ru.yandex.video.m3.ott.ott;

import android.util.Base64;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.h5z0;
import defpackage.uza;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.drm.DrmLoadException;
import ru.yandex.video.m3.player.drm.HttpDataSourceDelegate;
import ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegateV2;
import ru.yandex.video.m3.player.impl.tracking.UriQueryParameters;
import ru.yandex.video.m3.player.impl.utils.UrlModifierHelper;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006$"}, d2 = {"Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegate;", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegateV2;", "Lru/yandex/video/m3/ott/ott/DrmServiceConfig;", "drmServiceConfig", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "drmConfig", "<init>", "(Lru/yandex/video/m3/ott/ott/DrmServiceConfig;Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;)V", "", "authToken", "getAuthTokenWithTypeAuthorization", "(Ljava/lang/String;)Ljava/lang/String;", "vsid", "Lzy11;", "setVideoSessionIdQueryParam", "(Ljava/lang/String;)V", "", "sourceIndex", "setSourceIndexQueryParam", "(I)V", "Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;", "httpDataSourceDelegate", "defaultUrl", "", Constants.KEY_DATA, "Ljava/util/UUID;", "uuid", "executeProvisionRequest", "(Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;Ljava/lang/String;[BLjava/util/UUID;)[B", "executeKeyRequest", "Lru/yandex/video/m3/ott/ott/DrmServiceConfig;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmProxy;", "videoSessionId", "Ljava/lang/String;", "Ljava/lang/Integer;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttMediaDrmCallbackDelegate implements MediaDrmCallbackDelegateV2 {
    private static final String DIAGNOSTIC_PROTOCOL_ERROR = "error";
    private static final String DIAGNOSTIC_PROTOCOL_IS_FATAL = "isFatal";
    private static final String HEADER_AUTH_TOKEN = "Authorization";
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String HEADER_CONTENT_TYPE_JSON = "application/json";
    private static final String HEADER_CONTENT_TYPE_OCTET_STREAM = "application/octet-stream";
    private static final String HEADER_COOKIE = "Cookie";
    private static final String HEADER_ORIGIN = "Origin";
    private static final String HEADER_REFERER = "Referer";
    private static final int HTTP_DIAGNOSTIC_PROTOCOL_ERROR = 418;
    private static final int HTTP_FORBIDDEN = 403;
    private static final int HTTP_UNAUTHORIZED = 401;
    private final DrmProxy drmConfig;
    private final DrmServiceConfig drmServiceConfig;
    private volatile Integer sourceIndex;
    private volatile String videoSessionId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public OttMediaDrmCallbackDelegate(DrmServiceConfig drmServiceConfig, DrmProxy drmProxy) {
        this.drmServiceConfig = drmServiceConfig;
        this.drmConfig = drmProxy;
    }

    private final String getAuthTokenWithTypeAuthorization(String authToken) {
        return !evu0.J(authToken) ? g8e.o("OAuth ", authToken) : "";
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public byte[] executeKeyRequest(HttpDataSourceDelegate httpDataSourceDelegate, String defaultUrl, byte[] data, UUID uuid) {
        try {
            LinkedHashMap l = b.l(new Pair(HEADER_COOKIE, this.drmServiceConfig.getAuthorizationCookie()), new Pair(HEADER_ORIGIN, this.drmServiceConfig.getOrigin()), new Pair(HEADER_REFERER, this.drmServiceConfig.getReferer()), new Pair(HEADER_CONTENT_TYPE, HEADER_CONTENT_TYPE_JSON));
            if (!evu0.J(this.drmServiceConfig.getAuthToken())) {
                l.put(HEADER_AUTH_TOKEN, getAuthTokenWithTypeAuthorization(this.drmServiceConfig.getAuthToken()));
            }
            DrmProxy drmProxy = this.drmConfig;
            return httpDataSourceDelegate.executePost(INSTANCE.addNonNullVsid(this.drmConfig.getProxyUrl(), this.videoSessionId), (drmProxy instanceof DrmProxyWithFreeRequestParams ? new JSONObject(((DrmProxyWithFreeRequestParams) this.drmConfig).getFreeRequestParams()) : OttMediaDrmCallbackDelegateKt.toJsonObject(drmProxy.getDrmRequestParams())).put("rawLicenseRequestBase64", Base64.encodeToString(data, 2)).toString().getBytes(uza.a), l);
        } catch (PlaybackException.DrmThrowable.ErrorDrmProxyConnection e) {
            Companion companion = INSTANCE;
            DrmLoadException.ErrorDiagnostic errorDiagnostic = companion.toErrorDiagnostic(e);
            if (errorDiagnostic != null) {
                h5z0.a.c(errorDiagnostic);
                throw errorDiagnostic;
            }
            PlaybackException.DrmThrowable.ErrorAuthentication errorAuthentication = companion.toErrorAuthentication(e);
            if (errorAuthentication != null) {
                throw errorAuthentication;
            }
            throw e;
        }
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public byte[] executeProvisionRequest(HttpDataSourceDelegate httpDataSourceDelegate, String defaultUrl, byte[] data, UUID uuid) {
        try {
            String provisioningUrl = this.drmConfig.getProvisioningUrl();
            if (provisioningUrl != null) {
                Companion companion = INSTANCE;
                return httpDataSourceDelegate.executePost(companion.addNonNullSourceIndex(companion.addNonNullVsid(provisioningUrl, this.videoSessionId), this.sourceIndex), data, gw00.e(new Pair(HEADER_CONTENT_TYPE, HEADER_CONTENT_TYPE_OCTET_STREAM)));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(defaultUrl);
            sb.append("&signedRequest=");
            sb.append(new String(data, uza.a));
            String str = this.videoSessionId;
            if (str != null) {
                sb.append("&vsid=".concat(str));
            }
            return httpDataSourceDelegate.executePost(sb.toString(), new byte[0], b.f());
        } catch (PlaybackException.DrmThrowable.ErrorDrmProxyConnection e) {
            DrmLoadException.ErrorProvisionRequestException errorProvisionRequest = INSTANCE.toErrorProvisionRequest(e);
            if (errorProvisionRequest != null) {
                throw errorProvisionRequest;
            }
            throw e;
        }
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegateV2
    public void setSourceIndexQueryParam(int sourceIndex) {
        this.sourceIndex = Integer.valueOf(sourceIndex);
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public void setVideoSessionIdQueryParam(String vsid) {
        this.videoSessionId = vsid;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u0018H\u0002J\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u0018H\u0002J\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u001c*\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegate$Companion;", "", "()V", "DIAGNOSTIC_PROTOCOL_ERROR", "", "DIAGNOSTIC_PROTOCOL_IS_FATAL", "HEADER_AUTH_TOKEN", "HEADER_CONTENT_TYPE", "HEADER_CONTENT_TYPE_JSON", "HEADER_CONTENT_TYPE_OCTET_STREAM", "HEADER_COOKIE", "HEADER_ORIGIN", "HEADER_REFERER", "HTTP_DIAGNOSTIC_PROTOCOL_ERROR", "", "HTTP_FORBIDDEN", "HTTP_UNAUTHORIZED", "addNonNullSourceIndex", "sourceIndex", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "addNonNullVsid", "videoSessionId", "toErrorAuthentication", "Lru/yandex/video/m3/player/PlaybackException$DrmThrowable$ErrorAuthentication;", "", "toErrorDiagnostic", "Lru/yandex/video/m3/player/drm/DrmLoadException$ErrorDiagnostic;", "toErrorProvisionRequest", "Lru/yandex/video/m3/player/drm/DrmLoadException$ErrorProvisionRequestException;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String addNonNullSourceIndex(String str, Integer num) {
            if (num != null) {
                String addOrUpdateQueryParameter = UrlModifierHelper.INSTANCE.addOrUpdateQueryParameter(str, UriQueryParameters.INSTANCE.get(13).getName(), String.valueOf(num.intValue()));
                if (addOrUpdateQueryParameter != null) {
                    return addOrUpdateQueryParameter;
                }
            }
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String addNonNullVsid(String str, String str2) {
            String addOrUpdateVsid;
            return (str2 == null || (addOrUpdateVsid = UrlModifierHelper.INSTANCE.addOrUpdateVsid(str, str2)) == null) ? str : addOrUpdateVsid;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PlaybackException.DrmThrowable.ErrorAuthentication toErrorAuthentication(Throwable th) {
            PlaybackException.DrmThrowable.ErrorDrmProxyConnection errorDrmProxyConnection = th instanceof PlaybackException.DrmThrowable.ErrorDrmProxyConnection ? (PlaybackException.DrmThrowable.ErrorDrmProxyConnection) th : null;
            if (errorDrmProxyConnection != null) {
                if (errorDrmProxyConnection.getResponseCode() != 401 && errorDrmProxyConnection.getResponseCode() != 403) {
                    errorDrmProxyConnection = null;
                }
                if (errorDrmProxyConnection != null) {
                    return new PlaybackException.DrmThrowable.ErrorAuthentication(errorDrmProxyConnection);
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DrmLoadException.ErrorDiagnostic toErrorDiagnostic(Throwable th) {
            Object failure;
            PlaybackException.DrmThrowable.ErrorDrmProxyConnection errorDrmProxyConnection = th instanceof PlaybackException.DrmThrowable.ErrorDrmProxyConnection ? (PlaybackException.DrmThrowable.ErrorDrmProxyConnection) th : null;
            if (errorDrmProxyConnection == null) {
                return null;
            }
            String responseBody = errorDrmProxyConnection.getResponseBody();
            if (responseBody == null || evu0.J(responseBody) || errorDrmProxyConnection.getResponseCode() != 418) {
                errorDrmProxyConnection = null;
            }
            if (errorDrmProxyConnection == null) {
                return null;
            }
            try {
                failure = new JSONObject(errorDrmProxyConnection.getResponseBody());
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            JSONObject jSONObject = (JSONObject) failure;
            if (jSONObject == null) {
                return null;
            }
            if (!jSONObject.has(OttMediaDrmCallbackDelegate.DIAGNOSTIC_PROTOCOL_IS_FATAL) || !jSONObject.has("error")) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                return new DrmLoadException.ErrorDiagnostic(jSONObject.getBoolean(OttMediaDrmCallbackDelegate.DIAGNOSTIC_PROTOCOL_IS_FATAL), jSONObject.getString("error"), th);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DrmLoadException.ErrorProvisionRequestException toErrorProvisionRequest(Throwable th) {
            PlaybackException.DrmThrowable.ErrorDrmProxyConnection errorDrmProxyConnection = th instanceof PlaybackException.DrmThrowable.ErrorDrmProxyConnection ? (PlaybackException.DrmThrowable.ErrorDrmProxyConnection) th : null;
            if (errorDrmProxyConnection != null) {
                if (errorDrmProxyConnection.getResponseCode() <= 0) {
                    errorDrmProxyConnection = null;
                }
                if (errorDrmProxyConnection != null) {
                    return new DrmLoadException.ErrorProvisionRequestException(th);
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
