package ru.yandex.video.m3.telemetry;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import defpackage.aw60;
import defpackage.ono;
import defpackage.tls;
import defpackage.vuu;
import defpackage.w511;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;
import ru.yandex.video.m3.telemetry.helpers.ImplBuildHelperKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0015J%\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry;", "", "Lkotlin/Function1;", "Law60;", "Lzy11;", "okHttpDataSourceFactoryAction", "Lvuu;", "createFlavouredHttpDataSourceFactory", "(Ltls;)Lvuu;", "Landroid/content/Context;", "context", "Lono;", "exoPlayerBuilderAction", "Landroidx/media3/exoplayer/ExoPlayer;", "createFlavouredExoPlayer", "(Landroid/content/Context;Ltls;)Landroidx/media3/exoplayer/ExoPlayer;", "", "getSessionId", "()Ljava/lang/String;", "release", "()V", "Builder", "Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetryImpl;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StandaloneStrmTelemetry {

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, d2 = {"Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry$Builder;", "", "context", "Landroid/content/Context;", "mediaOkHttpClient", "Lokhttp3/OkHttpClient;", "(Landroid/content/Context;Lokhttp3/OkHttpClient;)V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "fromBlock", "getFromBlock", "setFromBlock", "mediaItemToContentIdMapper", "Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;", "getMediaItemToContentIdMapper", "()Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;", "setMediaItemToContentIdMapper", "(Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;)V", "netPerfTelemetryUrlParams", "Lru/yandex/video/m3/data/network/UrlParams;", "getNetPerfTelemetryUrlParams", "()Lru/yandex/video/m3/data/network/UrlParams;", "setNetPerfTelemetryUrlParams", "(Lru/yandex/video/m3/data/network/UrlParams;)V", Constants.KEY_SERVICE, "getService", "setService", "streamBlock", "getStreamBlock", "setStreamBlock", "strmTelemetryUrlParams", "getStrmTelemetryUrlParams", "setStrmTelemetryUrlParams", "telemetryOkHttpClient", "getTelemetryOkHttpClient", "()Lokhttp3/OkHttpClient;", "setTelemetryOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "testIds", "", "getTestIds", "()Ljava/util/List;", "setTestIds", "(Ljava/util/List;)V", "build", "Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private final Context context;
        private String from;
        private String fromBlock;
        private MediaItemToContentIdMapper mediaItemToContentIdMapper;
        private final OkHttpClient mediaOkHttpClient;
        private UrlParams netPerfTelemetryUrlParams;
        private String service;
        private String streamBlock;
        private UrlParams strmTelemetryUrlParams;
        private OkHttpClient telemetryOkHttpClient;
        private List<String> testIds;

        public Builder(Context context, OkHttpClient okHttpClient) {
            this.context = context;
            this.mediaOkHttpClient = okHttpClient;
        }

        public final StandaloneStrmTelemetry build$video_player_internalRelease() {
            Context applicationContext = this.context.getApplicationContext();
            OkHttpClient okHttpClient = this.mediaOkHttpClient;
            String str = this.service;
            if (str == null) {
                str = DefaultStrmManagerConfig.ANDROID_PLAYER_TELEMETRY_SERVICE;
            }
            String str2 = str;
            String str3 = this.from;
            String str4 = this.fromBlock;
            String str5 = this.streamBlock;
            List<String> list = this.testIds;
            UrlParams urlParams = this.strmTelemetryUrlParams;
            UrlParams urlParams2 = this.netPerfTelemetryUrlParams;
            MediaItemToContentIdMapper mediaItemToContentIdMapper = this.mediaItemToContentIdMapper;
            OkHttpClient okHttpClient2 = this.telemetryOkHttpClient;
            if (okHttpClient2 == null) {
                okHttpClient2 = new OkHttpClient();
            }
            return ImplBuildHelperKt.internalBuildImpl(applicationContext, okHttpClient, str2, str3, str4, str5, list, urlParams, urlParams2, mediaItemToContentIdMapper, okHttpClient2);
        }

        public final String getFrom() {
            return this.from;
        }

        public final String getFromBlock() {
            return this.fromBlock;
        }

        public final MediaItemToContentIdMapper getMediaItemToContentIdMapper() {
            return this.mediaItemToContentIdMapper;
        }

        public final UrlParams getNetPerfTelemetryUrlParams() {
            return this.netPerfTelemetryUrlParams;
        }

        public final String getService() {
            return this.service;
        }

        public final String getStreamBlock() {
            return this.streamBlock;
        }

        public final UrlParams getStrmTelemetryUrlParams() {
            return this.strmTelemetryUrlParams;
        }

        public final OkHttpClient getTelemetryOkHttpClient() {
            return this.telemetryOkHttpClient;
        }

        public final List<String> getTestIds() {
            return this.testIds;
        }

        public final void setFrom(String str) {
            this.from = str;
        }

        public final void setFromBlock(String str) {
            this.fromBlock = str;
        }

        public final void setMediaItemToContentIdMapper(MediaItemToContentIdMapper mediaItemToContentIdMapper) {
            this.mediaItemToContentIdMapper = mediaItemToContentIdMapper;
        }

        public final void setNetPerfTelemetryUrlParams(UrlParams urlParams) {
            this.netPerfTelemetryUrlParams = urlParams;
        }

        public final void setService(String str) {
            this.service = str;
        }

        public final void setStreamBlock(String str) {
            this.streamBlock = str;
        }

        public final void setStrmTelemetryUrlParams(UrlParams urlParams) {
            this.strmTelemetryUrlParams = urlParams;
        }

        public final void setTelemetryOkHttpClient(OkHttpClient okHttpClient) {
            this.telemetryOkHttpClient = okHttpClient;
        }

        public final void setTestIds(List<String> list) {
            this.testIds = list;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ ExoPlayer createFlavouredExoPlayer$default(StandaloneStrmTelemetry standaloneStrmTelemetry, Context context, tls tlsVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: createFlavouredExoPlayer");
            return null;
        }
        if ((i & 2) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.telemetry.StandaloneStrmTelemetry$createFlavouredExoPlayer$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ono) obj2);
                    return zy11.a;
                }

                public final void invoke(ono onoVar) {
                }
            };
        }
        return standaloneStrmTelemetry.createFlavouredExoPlayer(context, tlsVar);
    }

    static /* synthetic */ vuu createFlavouredHttpDataSourceFactory$default(StandaloneStrmTelemetry standaloneStrmTelemetry, tls tlsVar, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: createFlavouredHttpDataSourceFactory");
            return null;
        }
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.telemetry.StandaloneStrmTelemetry$createFlavouredHttpDataSourceFactory$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((aw60) obj2);
                    return zy11.a;
                }

                public final void invoke(aw60 aw60Var) {
                }
            };
        }
        return standaloneStrmTelemetry.createFlavouredHttpDataSourceFactory(tlsVar);
    }

    ExoPlayer createFlavouredExoPlayer(Context context, tls exoPlayerBuilderAction);

    vuu createFlavouredHttpDataSourceFactory(tls okHttpDataSourceFactoryAction);

    String getSessionId();

    void release();
}
