package defpackage;

import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.ExtendedVh;
import ru.yandex.video.m3.ott.data.dto.Vh;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

/* loaded from: classes6.dex */
public final class h1u {
    public static final List f = u75.h("DISABLED_BY_FILE_MODERATION_STATUS", "DISABLED_BY_PRIVACY_MODERATION_STATUS");
    public final OkHttpClient a;
    public final n4f b;
    public final rc c;
    public final wpt d;
    public final g8c e;

    public h1u(OkHttpClient okHttpClient, n4f n4fVar, rc rcVar, wpt wptVar, g8c g8cVar) {
        this.a = okHttpClient;
        this.b = n4fVar;
        this.c = rcVar;
        this.d = wptVar;
        this.e = g8cVar;
    }

    public static final List a(h1u h1uVar, List list) {
        if (list == null) {
            return c5b.a;
        }
        List<ExtendedVh.Stream> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (ExtendedVh.Stream stream : list2) {
            DrmParams drmParams = null;
            r4 = null;
            r4 = null;
            r4 = null;
            r4 = null;
            r4 = null;
            r4 = null;
            r4 = null;
            DrmRequestParams drmRequestParams = null;
            if (stream.getDrmConfig() != null) {
                Map<String, String> requestParams = stream.getDrmConfig().getRequestParams();
                Map<String, String> requestParams2 = stream.getDrmConfig().getRequestParams();
                if (requestParams2 != null) {
                    String str = requestParams2.get("productId");
                    Long valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                    String str2 = requestParams2.get("contentId");
                    String str3 = requestParams2.get("contentTypeId");
                    Long valueOf2 = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
                    String str4 = requestParams2.get("serviceName");
                    String str5 = requestParams2.get("version");
                    String str6 = requestParams2.get("expirationTimestamp");
                    Long valueOf3 = str6 != null ? Long.valueOf(Long.parseLong(str6)) : null;
                    String str7 = requestParams2.get("monetizationModel");
                    String str8 = requestParams2.get("verificationRequired");
                    Boolean valueOf4 = str8 != null ? Boolean.valueOf(Boolean.parseBoolean(str8)) : null;
                    String str9 = requestParams2.get("watchSessionId");
                    String str10 = requestParams2.get("signature");
                    String str11 = requestParams2.get("sessionTimestamp");
                    Integer valueOf5 = str11 != null ? Integer.valueOf(Integer.parseInt(str11)) : null;
                    String str12 = requestParams2.get("persistent");
                    Boolean valueOf6 = str12 != null ? Boolean.valueOf(Boolean.parseBoolean(str12)) : null;
                    String str13 = requestParams2.get("sessionId");
                    String str14 = requestParams2.get("puid");
                    Long valueOf7 = str14 != null ? Long.valueOf(Long.parseLong(str14)) : null;
                    String str15 = requestParams2.get("strictPlaybackTtl");
                    Long valueOf8 = str15 != null ? Long.valueOf(Long.parseLong(str15)) : null;
                    String str16 = requestParams2.get("rentalTtl");
                    Long valueOf9 = str16 != null ? Long.valueOf(Long.parseLong(str16)) : null;
                    String str17 = requestParams2.get("storageTtl");
                    Long valueOf10 = str17 != null ? Long.valueOf(Long.parseLong(str17)) : null;
                    String str18 = requestParams2.get("playbackTtl");
                    Long valueOf11 = str18 != null ? Long.valueOf(Long.parseLong(str18)) : null;
                    String str19 = requestParams2.get("uuid");
                    String str20 = requestParams2.get("uuidSignature");
                    String str21 = requestParams2.get(BuildConfig.SDK_BUILD_FLAVOR);
                    Boolean valueOf12 = str21 != null ? Boolean.valueOf(Boolean.parseBoolean(str21)) : null;
                    if (valueOf2 != null && valueOf3 != null && str7 != null && str10 != null && valueOf4 != null && str5 != null && str9 != null) {
                        drmRequestParams = new DrmRequestParams(valueOf, valueOf5, str13, str4, str2, valueOf2.longValue(), valueOf3.longValue(), str7, valueOf7, str10, valueOf4.booleanValue(), str5, str9, valueOf6, valueOf8, valueOf9, valueOf10, valueOf11, str19, str20, valueOf12, null);
                    }
                }
                drmParams = new DrmParams(requestParams, drmRequestParams, stream.getDrmConfig().getServers(), stream.getDrmConfig().getAdvanced());
            }
            StreamType streamType = stream.getStreamType();
            String url = stream.getUrl();
            if (url == null) {
                url = "";
            }
            arrayList.add(new Vh.Stream(streamType, url, drmParams));
        }
        return arrayList;
    }
}
