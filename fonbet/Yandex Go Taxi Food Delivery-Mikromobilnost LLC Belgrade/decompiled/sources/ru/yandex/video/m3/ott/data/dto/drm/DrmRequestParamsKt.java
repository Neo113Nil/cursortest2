package ru.yandex.video.m3.ott.data.dto.drm;

import defpackage.tls;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

@Metadata(d1 = {"\u00002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÉ\u0001\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"", "productId", "", "sessionTimestamp", "", "sessionId", "serviceName", "contentId", "contentTypeId", "expirationTimestamp", "monetizationModel", "puid", X509CertImpl.SIGNATURE, "", "verificationRequired", "version", "watchSessionId", "persistent", "strictPlaybackTtl", "rentalTtl", "storageTtl", "playbackTtl", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "DrmRequestParams", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ltls;)Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmRequestParamsKt {
    public static final /* synthetic */ DrmRequestParams DrmRequestParams(Long l, Integer num, String str, String str2, String str3, long j, long j2, String str4, Long l2, String str5, boolean z, String str6, String str7, Boolean bool, Long l3, Long l4, Long l5, Long l6, tls tlsVar) {
        DrmRequestParams.Builder builder = new DrmRequestParams.Builder(l, num, str, str2, str3, j, j2, str4, l2, str5, z, str6, str7, bool, l3, l4, l5, l6);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
