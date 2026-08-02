package ru.yandex.video.m3.ott.ott;

import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.ott.data.dto.drm.DrmConfig;
import ru.yandex.video.m3.ott.data.dto.drm.DrmModule;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;
import ru.yandex.video.m3.ott.ott.DrmServiceConfig;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.drm.PrepareDrmKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "Lorg/json/JSONObject;", "toJsonObject", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;)Lorg/json/JSONObject;", "", "origin", "referer", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/ott/DrmServiceConfig$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/ott/ott/DrmServiceConfig;", "DrmServiceConfig", "(Ljava/lang/String;Ljava/lang/String;Ltls;)Lru/yandex/video/m3/ott/ott/DrmServiceConfig;", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "mediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/data/DrmParameters;", "drmParameters", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;Lru/yandex/video/m3/data/DrmParameters;)Lru/yandex/video/m3/player/drm/PrepareDrm;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttMediaDrmCallbackDelegateKt {
    public static final /* synthetic */ DrmServiceConfig DrmServiceConfig(String str, String str2, tls tlsVar) {
        DrmServiceConfig.Builder builder = new DrmServiceConfig.Builder(str, str2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public static /* synthetic */ DrmServiceConfig DrmServiceConfig$default(String str, String str2, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateKt$DrmServiceConfig$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmServiceConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmServiceConfig.Builder builder) {
                }
            };
        }
        return DrmServiceConfig(str, str2, tlsVar);
    }

    public static final PrepareDrm prepareDrm(final OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory, final DrmParameters drmParameters) {
        DrmConfig drmConfig = drmParameters.getDrmConfig();
        if (drmConfig instanceof DrmProxy) {
            return PrepareDrmKt.PrepareDrm(new tls() { // from class: ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateKt$prepareDrm$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(PrepareDrm.Builder builder) {
                    builder.setMediaDrmCallbackDelegate(OttMediaDrmCallbackDelegateFactory.this.create((DrmProxy) drmParameters.getDrmConfig()));
                    builder.setPreferDrmSecurityLevel(drmParameters.getDrmSecurityLevel());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PrepareDrm.Builder) obj);
                    return zy11.a;
                }
            });
        }
        if (drmConfig instanceof DrmModule) {
            return PrepareDrmKt.PrepareDrm(new tls() { // from class: ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateKt$prepareDrm$2
                {
                    super(1);
                }

                public final void invoke(PrepareDrm.Builder builder) {
                    builder.setOfflineLicenseKeyId(((DrmModule) DrmParameters.this.getDrmConfig()).getLicenseKeyId());
                    builder.setPreferDrmSecurityLevel(DrmParameters.this.getDrmSecurityLevel());
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PrepareDrm.Builder) obj);
                    return zy11.a;
                }
            });
        }
        w511.b();
        return null;
    }

    public static final JSONObject toJsonObject(DrmRequestParams drmRequestParams) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("productId", drmRequestParams.getProductId());
        jSONObject.putOpt("contentId", drmRequestParams.getContentId());
        jSONObject.putOpt("contentTypeId", Long.valueOf(drmRequestParams.getContentTypeId()));
        jSONObject.putOpt("serviceName", drmRequestParams.getServiceName());
        jSONObject.putOpt("version", drmRequestParams.getVersion());
        jSONObject.putOpt("expirationTimestamp", Long.valueOf(drmRequestParams.getExpirationTimestamp()));
        jSONObject.putOpt("monetizationModel", drmRequestParams.getMonetizationModel());
        jSONObject.putOpt("verificationRequired", Boolean.valueOf(drmRequestParams.getVerificationRequired()));
        jSONObject.putOpt("watchSessionId", drmRequestParams.getWatchSessionId());
        jSONObject.putOpt(X509CertImpl.SIGNATURE, drmRequestParams.getSignature());
        jSONObject.putOpt("sessionTimestamp", drmRequestParams.getSessionTimestamp());
        jSONObject.putOpt("persistent", drmRequestParams.getPersistent());
        jSONObject.putOpt("sessionId", drmRequestParams.getSessionId());
        jSONObject.putOpt("puid", drmRequestParams.getPuid());
        jSONObject.putOpt("strictPlaybackTtl", drmRequestParams.getStrictPlaybackTtl());
        jSONObject.putOpt("rentalTtl", drmRequestParams.getRentalTtl());
        jSONObject.putOpt("storageTtl", drmRequestParams.getStorageTtl());
        jSONObject.putOpt("playbackTtl", drmRequestParams.getPlaybackTtl());
        jSONObject.putOpt("uuid", drmRequestParams.getUuid());
        jSONObject.putOpt("uuidSignature", drmRequestParams.getUuidSignature());
        jSONObject.putOpt("internal", drmRequestParams.getInternalStream());
        return jSONObject;
    }
}
