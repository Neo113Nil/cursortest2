package ru.yandex.video.m3.telemetry.helpers;

import android.content.Context;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.jl40;
import defpackage.lse;
import defpackage.mdh;
import defpackage.p16;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.ab.YandexPlayerAbConfigManager;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.ab.util.UtilKt;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.player.PlayerIndexGenerator;
import ru.yandex.video.m3.player.SimpleIndexGenerator;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultEventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoDtoKt;
import ru.yandex.video.m3.player.impl.tracking.device.EmptyDeviceInfoProvider;
import ru.yandex.video.m3.player.impl.tracking.utils.SimpleManifestInflater;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;
import ru.yandex.video.m3.player.netperf.DefaultNetPerfApiSendUrlBuilder;
import ru.yandex.video.m3.player.netperf.NetPerfCallFactory;
import ru.yandex.video.m3.player.netperf.NetPerfManager;
import ru.yandex.video.m3.telemetry.MediaItemToContentIdMapper;
import ru.yandex.video.m3.telemetry.StandaloneStrmTelemetry;
import ru.yandex.video.m3.telemetry.StandaloneStrmTelemetryImpl;
import ru.yandex.video.m3.telemetry.datasource.impl.DataSourceErrorNotifierImpl;
import ru.yandex.video.m3.telemetry.datasource.impl.LoggingInfoHolder;
import ru.yandex.video.m3.telemetry.datasource.impl.StandaloneTelemetryReporter;
import ru.yandex.video.m3.telemetry.player.StandaloneTelemetryYandexPlayerFactory;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a{\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "mediaOkHttpClient", "", Constants.KEY_SERVICE, "from", "fromBlock", "streamBlock", "", "testIds", "Lru/yandex/video/m3/data/network/UrlParams;", "strmTelemetryUrlParams", "netPerfTelemetryUrlParams", "Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;", "mediaItemToContentIdMapper", "telemetryOkHttpClient", "Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry;", "internalBuildImpl", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/yandex/video/m3/data/network/UrlParams;Lru/yandex/video/m3/data/network/UrlParams;Lru/yandex/video/m3/telemetry/MediaItemToContentIdMapper;Lokhttp3/OkHttpClient;)Lru/yandex/video/m3/telemetry/StandaloneStrmTelemetry;", "Ltse;", "createDefaultIoScope", "()Ltse;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImplBuildHelperKt {
    private static final tse createDefaultIoScope() {
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        return bvf0.a(cvw.U(a, mdh.b).plus(new ImplBuildHelperKt$createDefaultIoScope$$inlined$CoroutineExceptionHandler$1(lse.a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final StandaloneStrmTelemetry internalBuildImpl(Context context, OkHttpClient okHttpClient, String str, String str2, String str3, String str4, List<String> list, UrlParams urlParams, UrlParams urlParams2, MediaItemToContentIdMapper mediaItemToContentIdMapper, OkHttpClient okHttpClient2) {
        String generateMusicSessionVsid = new VsidGenerator(new SystemTimeProvider()).generateMusicSessionVsid();
        Context applicationContext = context.getApplicationContext();
        NetPerfManager netPerfManager = new NetPerfManager(okHttpClient2, null, 0L, null, null, new DefaultNetPerfApiSendUrlBuilder(urlParams2), null, 94, null);
        NetPerfCallFactory netPerfCallFactory = new NetPerfCallFactory(okHttpClient, 0 == true ? 1 : 0, null, netPerfManager.getNetPerfEventTrackerFactory(), 6, 0 == true ? 1 : 0);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new p16(Executors.defaultThreadFactory(), 7));
        SimpleIndexGenerator simpleIndexGenerator = new SimpleIndexGenerator();
        AbConfig configOrDefault = UtilKt.getConfigOrDefault(YandexPlayerAbConfigManager.INSTANCE.getInstanceOrNull$video_player_internalRelease(), generateMusicSessionVsid);
        SimpleIndexGenerator simpleIndexGenerator2 = new SimpleIndexGenerator();
        StandaloneTelemetryYandexPlayerFactory standaloneTelemetryYandexPlayerFactory = new StandaloneTelemetryYandexPlayerFactory(applicationContext, okHttpClient2, newCachedThreadPool, generateMusicSessionVsid, PlayerIndexGenerator.INSTANCE.getNextIndex(), simpleIndexGenerator2, configOrDefault, urlParams, str, str2, str3, str4, list, mediaItemToContentIdMapper);
        InfoProviderImpl infoProviderImpl = new InfoProviderImpl(applicationContext);
        SimpleManifestInflater simpleManifestInflater = new SimpleManifestInflater(infoProviderImpl, new SystemTimeProvider(), false, 4, null);
        StrmTrackingApi strmTrackingApi = new StrmTrackingApi(okHttpClient2, null, JsonConverterImpl.INSTANCE, infoProviderImpl, null, urlParams, 16, null);
        String vpuid = infoProviderImpl.getVpuid();
        if (vpuid == null) {
            vpuid = "";
        }
        return new StandaloneStrmTelemetryImpl(generateMusicSessionVsid, netPerfManager, netPerfCallFactory, simpleManifestInflater, simpleIndexGenerator, standaloneTelemetryYandexPlayerFactory, newCachedThreadPool, new DataSourceErrorNotifierImpl(new StandaloneTelemetryReporter(new LoggingInfoHolder(generateMusicSessionVsid, vpuid, str, configOrDefault.getTestIds(), str2 == null ? infoProviderImpl.getAppInfo().getApplicationId() : str2, infoProviderImpl.getAppInfo(), DeviceInfoDtoKt.toDeviceInfoDto(EmptyDeviceInfoProvider.INSTANCE.getInfo())), simpleIndexGenerator2, new DefaultErrorCategoryProvider(), new DefaultEventTypeProvider(), strmTrackingApi, createDefaultIoScope())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread internalBuildImpl$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:MscStrmTlmtr");
        return newThread;
    }
}
