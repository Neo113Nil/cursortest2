package ru.yandex.video.m3.trackselection.videoformatselector;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.ip4;
import defpackage.jxi;
import defpackage.p16;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.ab.YandexPlayerAbConfigManager;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.ab.config.AbFlags;
import ru.yandex.video.m3.ab.util.UtilKt;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.player.BandwidthMeterFactory;
import ru.yandex.video.m3.player.InternalDiUtil;
import ru.yandex.video.m3.player.abr.impl.AesthetePreferenceProviderImpl;
import ru.yandex.video.m3.player.abr.impl.UserQualityRepositoryImpl;
import ru.yandex.video.m3.player.bandwidth.CommonBandwidthMeterFactoryKt;
import ru.yandex.video.m3.player.impl.tracking.StrmTrackingApi;
import ru.yandex.video.m3.player.impl.tracking.TrackingCommonArguments;
import ru.yandex.video.m3.player.impl.utils.AppInfo;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.InfoProviderImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.VsidGenerator;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.trackselection.videoformatselector.tracking.OptimalVideoFormatSelectorEventTracker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/DefaultOptimalVideoFormatSelectorFactory;", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorFactory;", "<init>", "()V", "Lru/yandex/video/m3/ab/config/AbConfig;", "initAbConfig", "()Lru/yandex/video/m3/ab/config/AbConfig;", "Lip4;", "bandwidthMeter", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelector;", "create", "(Lip4;)Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelector;", "Landroid/content/Context;", "context", "", "from", "(Landroid/content/Context;Lip4;Ljava/lang/String;)Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelector;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultOptimalVideoFormatSelectorFactory implements OptimalVideoFormatSelectorFactory {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String VSID = new VsidGenerator(new SystemTimeProvider()).generateVideoFormatSelectorVsid$video_player_internalRelease();

    private final AbConfig initAbConfig() {
        return UtilKt.getConfigOrDefault(YandexPlayerAbConfigManager.INSTANCE.getInstanceOrNull$video_player_internalRelease(), VSID);
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorFactory
    public OptimalVideoFormatSelector create(Context context, ip4 bandwidthMeter, String from) {
        Context applicationContext = context.getApplicationContext();
        AbConfig initAbConfig = initAbConfig();
        Companion companion = INSTANCE;
        OptimalVideoFormatSelectorEventTracker createEventTracker$video_player_internalRelease = companion.createEventTracker$video_player_internalRelease(new InfoProviderImpl(applicationContext), initAbConfig.getTestIds(), from);
        SharedPreferences provideYandexPlayerSharedPreferences$video_player_internalRelease = InternalDiUtil.INSTANCE.provideYandexPlayerSharedPreferences$video_player_internalRelease(applicationContext);
        UserQualityRepositoryImpl userQualityRepositoryImpl = new UserQualityRepositoryImpl(provideYandexPlayerSharedPreferences$video_player_internalRelease);
        AesthetePreferenceProviderImpl aesthetePreferenceProviderImpl = new AesthetePreferenceProviderImpl(provideYandexPlayerSharedPreferences$video_player_internalRelease);
        AbFlags flags = initAbConfig.getFlags();
        if (flags.getUseMultiplatformBandwidthEstimator()) {
            bandwidthMeter = companion.createMultiplatformBandwidthMeter$video_player_internalRelease(applicationContext, flags.getUseMultiplatformBandwidthEstimatorWithPlatformSync());
        }
        return new OptimalVideoFormatSelectorImpl(bandwidthMeter, VSID, initAbConfig, applicationContext, from, userQualityRepositoryImpl, aesthetePreferenceProviderImpl, createEventTracker$video_player_internalRelease);
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/DefaultOptimalVideoFormatSelectorFactory$Companion;", "", "<init>", "()V", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "infoProvider", "", "", "testIds", "", "from", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "createTrackingArguments", "(Lru/yandex/video/m3/player/impl/utils/InfoProvider;Ljava/util/List;Ljava/lang/String;)Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker;", "createEventTracker$video_player_internalRelease", "(Lru/yandex/video/m3/player/impl/utils/InfoProvider;Ljava/util/List;Ljava/lang/String;)Lru/yandex/video/m3/trackselection/videoformatselector/tracking/OptimalVideoFormatSelectorEventTracker;", "createEventTracker", "Landroid/content/Context;", "context", "", "withPlatformSync", "Lip4;", "createMultiplatformBandwidthMeter$video_player_internalRelease", "(Landroid/content/Context;Z)Lip4;", "createMultiplatformBandwidthMeter", "VSID", "Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread createEventTracker$lambda$2$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
            Thread newThread = threadFactory.newThread(runnable);
            newThread.setName("YP:OptimalVideoFormatSelectorEventTracker");
            return newThread;
        }

        private final TrackingCommonArguments createTrackingArguments(InfoProvider infoProvider, List<Integer> testIds, String from) {
            AppInfo appInfo = infoProvider.getAppInfo();
            Map f = b.f();
            List<Integer> list = !testIds.isEmpty() ? testIds : null;
            return new TrackingCommonArguments(DefaultStrmManagerConfig.ANDROID_PLAYER_TELEMETRY_SERVICE, "", appInfo, f, null, list != null ? a.X(list, ";", null, null, null, 62) : null, testIds, null, from, null, -1, null, infoProvider.getVpuid());
        }

        public final OptimalVideoFormatSelectorEventTracker createEventTracker$video_player_internalRelease(InfoProvider infoProvider, List<Integer> testIds, String from) {
            return new OptimalVideoFormatSelectorEventTracker(new StrmTrackingApi(new OkHttpClient(), Executors.newSingleThreadExecutor(new p16(Executors.defaultThreadFactory(), 2)), new JsonConverterImpl(), infoProvider, new DummyPlayerLogger(), null), createTrackingArguments(infoProvider, testIds, from), null, null, 12, null);
        }

        public final ip4 createMultiplatformBandwidthMeter$video_player_internalRelease(Context context, boolean withPlatformSync) {
            return CommonBandwidthMeterFactoryKt.getCommonFactoryInstance(BandwidthMeterFactory.INSTANCE, withPlatformSync).create(context);
        }

        private Companion() {
        }
    }

    @Override // ru.yandex.video.m3.trackselection.videoformatselector.OptimalVideoFormatSelectorFactory
    @jxi
    public OptimalVideoFormatSelector create(ip4 bandwidthMeter) {
        return new OptimalVideoFormatSelectorImpl(bandwidthMeter, VSID, initAbConfig(), null, null, null, null, null, 248, null);
    }
}
