package ru.yandex.video.m3.player.impl.tracking;

import android.util.Log;
import com.adjust.sdk.Constants;
import defpackage.al7;
import defpackage.d5j0;
import defpackage.d5z0;
import defpackage.h5z0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.m5j0;
import defpackage.nci0;
import defpackage.qje;
import defpackage.rvj0;
import defpackage.sls;
import defpackage.t4j0;
import defpackage.tls;
import defpackage.tpt0;
import defpackage.wg10;
import defpackage.wms;
import defpackage.yf7;
import defpackage.zy11;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.annotation.PlayerDeprecated;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.data.network.UrlParamsKt;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001b\u0010&\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/StrmTrackingApi;", "", "Lokhttp3/OkHttpClient;", "okHttpClient", "Ljava/util/concurrent/Executor;", "executor", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/data/network/UrlParams;", "urlParams", "<init>", "(Lokhttp3/OkHttpClient;Ljava/util/concurrent/Executor;Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/data/network/UrlParams;)V", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "trackEventInternal", "(Ljava/lang/Object;)V", "trackEvent", "trackEventBlocking$video_player_internalRelease", "trackEventBlocking", "Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;", "eventDefault", "Lkwu;", "createUrl", "(Lru/yandex/video/m3/player/impl/tracking/event/EventDefault;)Lkwu;", "Lokhttp3/OkHttpClient;", "Ljava/util/concurrent/Executor;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Lru/yandex/video/m3/data/network/UrlParams;", "defaultUrl$delegate", "Li3y;", "getDefaultUrl", "()Lkwu;", "defaultUrl", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StrmTrackingApi {
    private static final String TAG = "StrmTrackingApi";

    /* renamed from: defaultUrl$delegate, reason: from kotlin metadata */
    private final i3y defaultUrl;
    private final Executor executor;
    private final InfoProvider infoProvider;
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;
    private final PlayerLogger playerLogger;
    private final UrlParams urlParams;
    public static final int $stable = 8;

    public StrmTrackingApi(OkHttpClient okHttpClient, @PlayerDeprecated(message = "No need anymore.") Executor executor, JsonConverter jsonConverter, InfoProvider infoProvider, PlayerLogger playerLogger, UrlParams urlParams) {
        this.okHttpClient = okHttpClient;
        this.executor = executor;
        this.jsonConverter = jsonConverter;
        this.infoProvider = infoProvider;
        this.playerLogger = playerLogger;
        this.urlParams = urlParams == null ? UrlParamsKt.UrlParams("log.strm.yandex.ru", new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi$urlParams$1
            public final void invoke(UrlParams.Builder builder) {
                builder.setScheme(Constants.SCHEME);
                builder.setPathSegments("log");
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UrlParams.Builder) obj);
                return zy11.a;
            }
        }) : urlParams;
        this.defaultUrl = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi$defaultUrl$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final kwu invoke() {
                UrlParams urlParams2;
                UrlParams urlParams3;
                UrlParams urlParams4;
                jwu jwuVar = new jwu();
                urlParams2 = StrmTrackingApi.this.urlParams;
                jwuVar.o(urlParams2.getScheme());
                urlParams3 = StrmTrackingApi.this.urlParams;
                jwuVar.h(urlParams3.getHost());
                urlParams4 = StrmTrackingApi.this.urlParams;
                jwuVar.c(urlParams4.getPathSegments(), false);
                return jwuVar.e();
            }
        });
    }

    private final kwu getDefaultUrl() {
        return (kwu) this.defaultUrl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackEventInternal(Object event) {
        try {
            kwu createUrl = event instanceof EventDefault ? createUrl((EventDefault) event) : getDefaultUrl();
            String str = this.jsonConverter.to(event);
            d5z0 d5z0Var = h5z0.a;
            d5z0Var.t(TAG);
            d5z0Var.a(str, new Object[0]);
            t4j0 t4j0Var = new t4j0();
            t4j0Var.a = createUrl;
            t4j0Var.c.g(ExtFunctionsKt.HEADER_USER_AGENT, this.infoProvider.getUserAgent());
            int i = m5j0.a;
            Regex regex = wg10.e;
            t4j0Var.e("POST", wms.a(str, qje.o("application/json")));
            ((nci0) this.okHttpClient.newCall(new d5j0(t4j0Var))).I(new al7() { // from class: ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi$trackEventInternal$1
                @Override // defpackage.al7
                public void onFailure(yf7 call, IOException e) {
                }

                @Override // defpackage.al7
                public void onResponse(yf7 call, kvj0 response) {
                    rvj0 rvj0Var = response.z;
                    if (rvj0Var != null) {
                        rvj0Var.close();
                    }
                }
            });
        } catch (Throwable th) {
            this.playerLogger.error(TAG, "trackEvent", event, th, new Object[0]);
            Log.e(TAG, String.valueOf(th.getMessage()));
        }
    }

    public final kwu createUrl(EventDefault eventDefault) {
        jwu jwuVar = new jwu();
        jwuVar.o(this.urlParams.getScheme());
        jwuVar.h(this.urlParams.getHost());
        jwuVar.c(this.urlParams.getPathSegments(), false);
        jwuVar.d(eventDefault.getService(), eventDefault.getLabels().getAppVersionCode());
        String eventType = eventDefault.getEventType();
        String str = DatabaseHelper.OttTrackingTable.COLUMN_EVENT;
        if (!jl40.l(eventType, DatabaseHelper.OttTrackingTable.COLUMN_EVENT)) {
            str = "error";
        }
        jwuVar.d(str, eventDefault.getEventName());
        return jwuVar.e();
    }

    public final void trackEvent(Object event) {
        Executor executor = this.executor;
        if (executor != null) {
            ExecutorsUtilKt.executeSafely(executor, new tpt0(12, this, event));
        }
    }

    public final void trackEventBlocking$video_player_internalRelease(Object event) {
        trackEventInternal(event);
    }

    public /* synthetic */ StrmTrackingApi(OkHttpClient okHttpClient, Executor executor, JsonConverter jsonConverter, InfoProvider infoProvider, PlayerLogger playerLogger, UrlParams urlParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, executor, jsonConverter, infoProvider, (i & 16) != 0 ? new DummyPlayerLogger() : playerLogger, urlParams);
    }
}
