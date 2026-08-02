package ru.yandex.video.m3.player.drm;

import defpackage.b87;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.tw21;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0080\b\u0018\u0000 +2\u00020\u0001:\u0001+B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*¨\u0006,"}, d2 = {"Lru/yandex/video/m3/player/drm/DefaultMediaDrmCallbackDelegate;", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "", "defaultLicenseUrl", "", "forceDefaultLicenseUrl", "", "keyRequestProperties", "<init>", "(Ljava/lang/String;ZLjava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/Map;", "Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;", "httpDataSourceDelegate", "defaultUrl", "", Constants.KEY_DATA, "Ljava/util/UUID;", "uuid", "executeProvisionRequest", "(Lru/yandex/video/m3/player/drm/HttpDataSourceDelegate;Ljava/lang/String;[BLjava/util/UUID;)[B", "executeKeyRequest", "vsid", "Lzy11;", "setVideoSessionIdQueryParam", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;ZLjava/util/Map;)Lru/yandex/video/m3/player/drm/DefaultMediaDrmCallbackDelegate;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "Z", "Ljava/util/Map;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DefaultMediaDrmCallbackDelegate implements MediaDrmCallbackDelegate {
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String HEADER_SOAP_ACTION = "SOAPAction";
    private static final String MIME_TYPE_APPLICATION_JSON = "application/json";
    private static final String MIME_TYPE_APPLICATION_OCTET_STREAM = "application/octet-stream";
    private static final String MIME_TYPE_TEXT_XML = "text/xml";
    private static final String SOAP_ACTION_VALUE = "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense";
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ DefaultMediaDrmCallbackDelegate(String str, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? b.f() : map);
    }

    /* renamed from: component1, reason: from getter */
    private final String getDefaultLicenseUrl() {
        return this.defaultLicenseUrl;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getForceDefaultLicenseUrl() {
        return this.forceDefaultLicenseUrl;
    }

    private final Map<String, String> component3() {
        return this.keyRequestProperties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultMediaDrmCallbackDelegate copy$default(DefaultMediaDrmCallbackDelegate defaultMediaDrmCallbackDelegate, String str, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defaultMediaDrmCallbackDelegate.defaultLicenseUrl;
        }
        if ((i & 2) != 0) {
            z = defaultMediaDrmCallbackDelegate.forceDefaultLicenseUrl;
        }
        if ((i & 4) != 0) {
            map = defaultMediaDrmCallbackDelegate.keyRequestProperties;
        }
        return defaultMediaDrmCallbackDelegate.copy(str, z, map);
    }

    public final DefaultMediaDrmCallbackDelegate copy(String defaultLicenseUrl, boolean forceDefaultLicenseUrl, Map<String, String> keyRequestProperties) {
        return new DefaultMediaDrmCallbackDelegate(defaultLicenseUrl, forceDefaultLicenseUrl, keyRequestProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultMediaDrmCallbackDelegate)) {
            return false;
        }
        DefaultMediaDrmCallbackDelegate defaultMediaDrmCallbackDelegate = (DefaultMediaDrmCallbackDelegate) other;
        return jl40.l(this.defaultLicenseUrl, defaultMediaDrmCallbackDelegate.defaultLicenseUrl) && this.forceDefaultLicenseUrl == defaultMediaDrmCallbackDelegate.forceDefaultLicenseUrl && jl40.l(this.keyRequestProperties, defaultMediaDrmCallbackDelegate.keyRequestProperties);
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public byte[] executeKeyRequest(HttpDataSourceDelegate httpDataSourceDelegate, String defaultUrl, byte[] data, UUID uuid) {
        String str = this.defaultLicenseUrl;
        if (defaultUrl.length() != 0 && !this.forceDefaultLicenseUrl) {
            str = null;
        }
        if (str != null) {
            defaultUrl = str;
        }
        LinkedHashMap l = b.l(new Pair(HEADER_CONTENT_TYPE, Companion.toContentType(uuid)));
        l.putAll(this.keyRequestProperties);
        if (jl40.l(b87.e, uuid)) {
            Pair pair = new Pair(HEADER_SOAP_ACTION, SOAP_ACTION_VALUE);
            l.put(pair.c(), pair.f());
        }
        return httpDataSourceDelegate.executePost(defaultUrl, data, b.n(l, this.keyRequestProperties));
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public byte[] executeProvisionRequest(HttpDataSourceDelegate httpDataSourceDelegate, String defaultUrl, byte[] data, UUID uuid) {
        StringBuilder v = oyr.v(defaultUrl, "&signedRequest=");
        v.append(tw21.p(data));
        return httpDataSourceDelegate.executePost(v.toString(), new byte[0], b.f());
    }

    public int hashCode() {
        return this.keyRequestProperties.hashCode() + unr0.e(this.defaultLicenseUrl.hashCode() * 31, 31, this.forceDefaultLicenseUrl);
    }

    @Override // ru.yandex.video.m3.player.drm.MediaDrmCallbackDelegate
    public void setVideoSessionIdQueryParam(String vsid) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DefaultMediaDrmCallbackDelegate(defaultLicenseUrl=");
        sb.append(this.defaultLicenseUrl);
        sb.append(", forceDefaultLicenseUrl=");
        sb.append(this.forceDefaultLicenseUrl);
        sb.append(", keyRequestProperties=");
        return smw0.n(sb, this.keyRequestProperties, ')');
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\u00020\u0004*\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/drm/DefaultMediaDrmCallbackDelegate$Companion;", "", "()V", "HEADER_CONTENT_TYPE", "", "HEADER_SOAP_ACTION", "MIME_TYPE_APPLICATION_JSON", "MIME_TYPE_APPLICATION_OCTET_STREAM", "MIME_TYPE_TEXT_XML", "SOAP_ACTION_VALUE", "toContentType", "Ljava/util/UUID;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String toContentType(UUID uuid) {
            return jl40.l(uuid, b87.e) ? DefaultMediaDrmCallbackDelegate.MIME_TYPE_TEXT_XML : jl40.l(uuid, b87.c) ? DefaultMediaDrmCallbackDelegate.MIME_TYPE_APPLICATION_JSON : DefaultMediaDrmCallbackDelegate.MIME_TYPE_APPLICATION_OCTET_STREAM;
        }

        private Companion() {
        }
    }

    public DefaultMediaDrmCallbackDelegate(String str, boolean z, Map<String, String> map) {
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z;
        this.keyRequestProperties = map;
    }

    public DefaultMediaDrmCallbackDelegate() {
        this(null, false, null, 7, null);
    }
}
