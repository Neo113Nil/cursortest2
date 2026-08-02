package defpackage;

import android.util.Base64;
import com.connectsdk.etc.helper.HttpMessage;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.drm.DrmLoadException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class jxj implements smh {
    public final DrmProxy a;
    public volatile String b;
    public volatile Integer c;

    public jxj(l48 l48Var, DrmProxy drmProxy) {
        drmProxy.getClass();
        this.a = drmProxy;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    @Override // defpackage.rmh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(l6e l6eVar, String str, byte[] bArr, UUID uuid) {
        Object t7oVar;
        DrmLoadException.ErrorDiagnostic errorDiagnostic;
        l6eVar.getClass();
        bArr.getClass();
        uuid.getClass();
        try {
            LinkedHashMap g = uah.g(new Pair("Cookie", ""), new Pair("Origin", "https://ott-kp.yandex.ru"), new Pair("Referer", "https://ott-kp.yandex.ru/mobile/android"), new Pair(HttpMessage.CONTENT_TYPE_HEADER, "application/json"));
            if (!StringsKt.U("")) {
                g.put("Authorization", StringsKt.U("") ? "" : "OAuth ");
            }
            DrmProxy drmProxy = this.a;
            JSONObject jSONObject = drmProxy instanceof DrmProxyWithFreeRequestParams ? new JSONObject(((DrmProxyWithFreeRequestParams) this.a).getFreeRequestParams()) : hag.F(drmProxy.getDrmRequestParams());
            String proxyUrl = this.a.getProxyUrl();
            String str2 = this.b;
            if (str2 != null) {
                proxyUrl = vpt.c(proxyUrl, str2);
            }
            String jSONObject2 = jSONObject.put("rawLicenseRequestBase64", Base64.encodeToString(bArr, 2)).toString();
            jSONObject2.getClass();
            byte[] bytes = jSONObject2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            return ((roj) l6eVar).a(proxyUrl, g, bytes);
        } catch (PlaybackException.DrmThrowable.ErrorDrmProxyConnection e) {
            String responseBody = e.getResponseBody();
            PlaybackException.DrmThrowable.ErrorDrmProxyConnection errorDrmProxyConnection = (responseBody == null || StringsKt.U(responseBody) || e.getResponseCode() != 418) ? null : e;
            if (errorDrmProxyConnection != null) {
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = new JSONObject(errorDrmProxyConnection.getResponseBody());
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (t7oVar instanceof t7o) {
                    t7oVar = null;
                }
                JSONObject jSONObject3 = (JSONObject) t7oVar;
                if (jSONObject3 != null) {
                    if (!jSONObject3.has("isFatal") || !jSONObject3.has("error")) {
                        jSONObject3 = null;
                    }
                    if (jSONObject3 != null) {
                        boolean z = jSONObject3.getBoolean("isFatal");
                        String string = jSONObject3.getString("error");
                        string.getClass();
                        errorDiagnostic = new DrmLoadException.ErrorDiagnostic(z, string, e);
                        if (errorDiagnostic == null) {
                            Timber.INSTANCE.d(errorDiagnostic);
                            throw errorDiagnostic;
                        }
                        PlaybackException.DrmThrowable.ErrorDrmProxyConnection errorDrmProxyConnection2 = (e.getResponseCode() == 401 || e.getResponseCode() == 403) ? e : null;
                        PlaybackException.DrmThrowable.ErrorAuthentication errorAuthentication = errorDrmProxyConnection2 != null ? new PlaybackException.DrmThrowable.ErrorAuthentication(errorDrmProxyConnection2) : null;
                        if (errorAuthentication != null) {
                            throw errorAuthentication;
                        }
                        throw e;
                    }
                }
            }
            errorDiagnostic = null;
            if (errorDiagnostic == null) {
            }
        }
    }

    @Override // defpackage.rmh
    public final void b(String str) {
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.rmh
    public final byte[] c(l6e l6eVar, String str, byte[] bArr, UUID uuid) {
        l6eVar.getClass();
        bArr.getClass();
        uuid.getClass();
        try {
            String provisioningUrl = this.a.getProvisioningUrl();
            if (provisioningUrl != null) {
                String str2 = this.b;
                if (str2 != null) {
                    provisioningUrl = vpt.c(provisioningUrl, str2);
                }
                Integer num = this.c;
                if (num != null) {
                    provisioningUrl = vpt.b(provisioningUrl, jpt.a(13).a, String.valueOf(num.intValue()));
                }
                return ((roj) l6eVar).a(provisioningUrl, tah.b(new Pair(HttpMessage.CONTENT_TYPE_HEADER, "application/octet-stream")), bArr);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("&signedRequest=");
            sb.append(new String(bArr, Charsets.UTF_8));
            String str3 = this.b;
            if (str3 != null) {
                sb.append("&vsid=".concat(str3));
            }
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return ((roj) l6eVar).a(sb.toString(), e5bVar, new byte[0]);
        } catch (PlaybackException.DrmThrowable.ErrorDrmProxyConnection e) {
            DrmLoadException.ErrorProvisionRequestException errorProvisionRequestException = (e.getResponseCode() > 0 ? e : null) != null ? new DrmLoadException.ErrorProvisionRequestException(e) : null;
            if (errorProvisionRequestException != null) {
                throw errorProvisionRequestException;
            }
            throw e;
        }
    }
}
