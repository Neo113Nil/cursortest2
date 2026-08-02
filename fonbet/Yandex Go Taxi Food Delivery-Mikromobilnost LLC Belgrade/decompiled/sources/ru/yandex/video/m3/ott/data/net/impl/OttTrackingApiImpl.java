package ru.yandex.video.m3.ott.data.net.impl;

import defpackage.d5j0;
import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.qje;
import defpackage.rvj0;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.wg10;
import defpackage.wms;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.ott.data.net.OttTrackingApi;
import ru.yandex.video.m3.player.utils.FutureExtensions;
import ru.yandex.video.m3.player.utils.JsonConverter;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u001c\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u000ej\u0002`\u000f0\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/ott/data/net/impl/OttTrackingApiImpl;", "Lru/yandex/video/m3/ott/data/net/OttTrackingApi;", "okHttpClient", "Lokhttp3/OkHttpClient;", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "userAgent", "", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;Ljava/lang/String;)V", "sendEvents", "Ljava/util/concurrent/Future;", "", "events", "", "", "Lru/yandex/video/m3/ott/data/dto/OttTrackingEvent;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttTrackingApiImpl implements OttTrackingApi {
    private static final wg10 APPLICATION_JSON;
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final String OTT_TRACKING_URL = "https://tracking.ott.yandex.net/v1/watch-batch";
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private final String userAgent;
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

    public OttTrackingApiImpl(OkHttpClient okHttpClient, JsonConverter jsonConverter, String str) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
        this.userAgent = str;
    }

    @Override // ru.yandex.video.m3.ott.data.net.OttTrackingApi
    public Future<Object> sendEvents(final List<? extends Map<String, ? extends Object>> events) {
        return FutureExtensions.future(new sls() { // from class: ru.yandex.video.m3.ott.data.net.impl.OttTrackingApiImpl$sendEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                JsonConverter jsonConverter;
                OkHttpClient okHttpClient;
                String str;
                wg10 wg10Var;
                jsonConverter = OttTrackingApiImpl.this.jsonConverter;
                String str2 = jsonConverter.to(events);
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.t("OttTrackingApiImpl");
                d5z0Var.a(str2, new Object[0]);
                okHttpClient = OttTrackingApiImpl.this.okHttpClient;
                t4j0 t4j0Var = new t4j0();
                t4j0Var.h("https://tracking.ott.yandex.net/v1/watch-batch");
                str = OttTrackingApiImpl.this.userAgent;
                t4j0Var.c.a(ExtFunctionsKt.HEADER_USER_AGENT, str);
                int i = m5j0.a;
                wg10Var = OttTrackingApiImpl.APPLICATION_JSON;
                t4j0Var.e("POST", wms.a(str2, wg10Var));
                rvj0 rvj0Var = ((nci0) okHttpClient.newCall(new d5j0(t4j0Var))).execute().z;
                if (rvj0Var == null) {
                    return null;
                }
                rvj0Var.close();
                return zy11.a;
            }
        });
    }
}
