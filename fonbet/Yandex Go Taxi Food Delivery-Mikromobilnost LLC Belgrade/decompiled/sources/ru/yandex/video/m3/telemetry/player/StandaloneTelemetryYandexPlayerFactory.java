package ru.yandex.video.m3.telemetry.player;

import android.content.Context;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.config.EmptyAccountProvider;
import ru.yandex.video.m3.data.dto.ExternalStalled;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.player.IndexGenerator;
import ru.yandex.video.m3.player.impl.concurrent.ConcurrentPlayerStateManagerImpl;
import ru.yandex.video.m3.player.impl.tracking.device.EmptyDeviceInfoProvider;
import ru.yandex.video.m3.player.tracking.StrmManagerFactory;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfigKt;
import ru.yandex.video.m3.telemetry.MediaItemToContentIdMapper;
import ru.yandex.video.m3.telemetry.helpers.PlaybackStatsProvider;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayerFactory;", "", "context", "Landroid/content/Context;", "telemetryOkHttpClient", "Lokhttp3/OkHttpClient;", "cachedThreadPool", "Ljava/util/concurrent/ExecutorService;", "sessionId", "", "playerIndex", "", "eventIndexGenerator", "Lru/yandex/video/m3/player/IndexGenerator;", "abConfig", "Lru/yandex/video/m3/ab/config/AbConfig;", "strmTelemetryUrlParams", "Lru/yandex/video/m3/data/network/UrlParams;", Constants.KEY_SERVICE, "from", "fromBlock", "streamBlock", "testIds", "", "mediaItemToContentIdMapper", "Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/util/concurrent/ExecutorService;Ljava/lang/String;ILru/yandex/video/m3/player/IndexGenerator;Lru/yandex/video/m3/ab/config/AbConfig;Lru/yandex/video/m3/data/network/UrlParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;)V", "create", "Lru/yandex/video/m3/telemetry/player/StandaloneTelemetryYandexPlayer;", "playbackStatsProvider", "Lru/yandex/video/m3/telemetry/helpers/PlaybackStatsProvider;", "sourceIndexGenerator", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StandaloneTelemetryYandexPlayerFactory {
    public static final int $stable = 8;
    private final AbConfig abConfig;
    private final ExecutorService cachedThreadPool;
    private final Context context;
    private final IndexGenerator eventIndexGenerator;
    private final String from;
    private final String fromBlock;
    private final MediaItemToContentIdMapper mediaItemToContentIdMapper;
    private final int playerIndex;
    private final String service;
    private final String sessionId;
    private final String streamBlock;
    private final UrlParams strmTelemetryUrlParams;
    private final OkHttpClient telemetryOkHttpClient;
    private final List<String> testIds;

    public StandaloneTelemetryYandexPlayerFactory(Context context, OkHttpClient okHttpClient, ExecutorService executorService, String str, int i, IndexGenerator indexGenerator, AbConfig abConfig, UrlParams urlParams, String str2, String str3, String str4, String str5, List<String> list, MediaItemToContentIdMapper mediaItemToContentIdMapper) {
        this.context = context;
        this.telemetryOkHttpClient = okHttpClient;
        this.cachedThreadPool = executorService;
        this.sessionId = str;
        this.playerIndex = i;
        this.eventIndexGenerator = indexGenerator;
        this.abConfig = abConfig;
        this.strmTelemetryUrlParams = urlParams;
        this.service = str2;
        this.from = str3;
        this.fromBlock = str4;
        this.streamBlock = str5;
        this.testIds = list;
        this.mediaItemToContentIdMapper = mediaItemToContentIdMapper;
    }

    public final StandaloneTelemetryYandexPlayer create(PlaybackStatsProvider playbackStatsProvider, IndexGenerator sourceIndexGenerator) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        List<Integer> testIds = this.abConfig.getTestIds();
        ArrayList arrayList = new ArrayList(tcc.n(testIds, 10));
        Iterator<T> it = testIds.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        List<String> list = this.testIds;
        if (list != null) {
            arrayList = a.m0(list, arrayList);
        }
        List I = a.I(arrayList);
        return new StandaloneTelemetryYandexPlayer(this.sessionId, this.playerIndex, sourceIndexGenerator, new StrmManagerFactory().create$video_player_internalRelease(DefaultStrmManagerConfigKt.DefaultStrmManagerConfig(this.context, this.telemetryOkHttpClient, this.cachedThreadPool, newSingleThreadScheduledExecutor, DefaultStrmManagerConfig.Companion.InfoProviders$default(DefaultStrmManagerConfig.INSTANCE, EmptyAccountProvider.INSTANCE, EmptyDeviceInfoProvider.INSTANCE, null, 4, null), I, new tls() { // from class: ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayerFactory$create$strmManagerConfig$1
            {
                super(1);
            }

            public final void invoke(DefaultStrmManagerConfig.Builder builder) {
                String str;
                String str2;
                String str3;
                str = StandaloneTelemetryYandexPlayerFactory.this.from;
                builder.setFrom(str);
                DefaultStrmManagerConfig.Companion companion = DefaultStrmManagerConfig.INSTANCE;
                final StandaloneTelemetryYandexPlayerFactory standaloneTelemetryYandexPlayerFactory = StandaloneTelemetryYandexPlayerFactory.this;
                builder.setAdditionalFeatures(companion.AdditionalFeatures(new tls() { // from class: ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayerFactory$create$strmManagerConfig$1.1
                    {
                        super(1);
                    }

                    public final void invoke(DefaultStrmManagerConfig.AdditionalFeatures.Builder builder2) {
                        String str4;
                        UrlParams urlParams;
                        str4 = StandaloneTelemetryYandexPlayerFactory.this.service;
                        builder2.setService(str4);
                        urlParams = StandaloneTelemetryYandexPlayerFactory.this.strmTelemetryUrlParams;
                        builder2.setStrmTrackingUrlParams(urlParams);
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DefaultStrmManagerConfig.AdditionalFeatures.Builder) obj);
                        return zy11.a;
                    }
                }));
                StandaloneTelemetryYandexPlayerFactory standaloneTelemetryYandexPlayerFactory2 = StandaloneTelemetryYandexPlayerFactory.this;
                MapBuilder mapBuilder = new MapBuilder();
                str2 = standaloneTelemetryYandexPlayerFactory2.fromBlock;
                if (str2 != null) {
                    mapBuilder.put("from_block", str2);
                }
                str3 = standaloneTelemetryYandexPlayerFactory2.streamBlock;
                if (str3 != null) {
                    mapBuilder.put(ExternalStalled.streamBlockKey, str3);
                }
                builder.setAdditionalParameters(mapBuilder.j());
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DefaultStrmManagerConfig.Builder) obj);
                return zy11.a;
            }
        }), new StrmManagerFactory.Parameters(null, null, null, this.abConfig, this.playerIndex, this.eventIndexGenerator, true, true)), playbackStatsProvider, new ConcurrentPlayerStateManagerImpl(sourceIndexGenerator), this.mediaItemToContentIdMapper);
    }
}
