package ru.yandex.video.m3.ott;

import android.content.Context;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.p16;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.dto.JsonConverterImpl;
import ru.yandex.video.m3.ott.data.dto.EndpointsData;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.ott.data.local.SubProfileProvider;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;
import ru.yandex.video.m3.ott.data.repository.LicenseCheckerRepository;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.ott.data.repository.ProfileRepository;
import ru.yandex.video.m3.ott.data.repository.TimingsRepository;
import ru.yandex.video.m3.ott.data.repository.WatchParamsRepository;
import ru.yandex.video.m3.ott.data.repository.impl.ManifestRepositoryImpl;
import ru.yandex.video.m3.ott.features.DelayedTrackHandlingFeatureConfig;
import ru.yandex.video.m3.ott.impl.ConcurrencyArbiterManagerImpl;
import ru.yandex.video.m3.ott.impl.TrackingManagerFactoryImpl;
import ru.yandex.video.m3.ott.ott.DefaultPictureInPictureProvider;
import ru.yandex.video.m3.ott.ott.DeviceProvider;
import ru.yandex.video.m3.ott.ott.DrmServiceConfig;
import ru.yandex.video.m3.ott.ott.LicenseCheckerManager;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactory;
import ru.yandex.video.m3.ott.ott.OttMediaDrmCallbackDelegateFactoryImpl;
import ru.yandex.video.m3.ott.ott.PictureInPictureProvider;
import ru.yandex.video.m3.ott.ott.TimingsManager;
import ru.yandex.video.m3.ott.ott.TrackSelectionManager;
import ru.yandex.video.m3.ott.ott.TrackingManager;
import ru.yandex.video.m3.ott.util.MarkedExecutorService;
import ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.TimeCounterImpl;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.utils.DefaultResourceProvider;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@jxi
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-J!\u0010.\u001a\u00020/2\n\u00100\u001a\u0006\u0012\u0002\b\u0003012\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\b4J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u00105\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0014J\u000e\u00108\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0012H\u0000¢\u0006\u0002\b9J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010:\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0006J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lru/yandex/video/m3/ott/OttStrategyBuilder;", "", "()V", "context", "Landroid/content/Context;", "delayedTrackHandlingFeatureConfig", "Lru/yandex/video/m3/ott/features/DelayedTrackHandlingFeatureConfig;", "deviceId", "", "deviceProvider", "Lru/yandex/video/m3/ott/ott/DeviceProvider;", "drmServiceConfig", "Lru/yandex/video/m3/ott/ott/DrmServiceConfig;", "endpointsData", "Lru/yandex/video/m3/ott/data/dto/EndpointsData;", "executorService", "Ljava/util/concurrent/ExecutorService;", "infoProvider", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "isDynamicDegradationLowSecurityLevel", "", "licenseCheckerRepository", "Lru/yandex/video/m3/ott/data/repository/LicenseCheckerRepository;", "manifestRepository", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "okHttpClient", "Lokhttp3/OkHttpClient;", "ottMediaDrmCallbackDelegateFactory", "Lru/yandex/video/m3/ott/ott/OttMediaDrmCallbackDelegateFactory;", "pictureInPictureProvider", "Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "profileRepository", "Lru/yandex/video/m3/ott/data/repository/ProfileRepository;", "subProfileProvider", "Lru/yandex/video/m3/ott/data/local/SubProfileProvider;", "timingsPeriodSeconds", "", "timingsRepository", "Lru/yandex/video/m3/ott/data/repository/TimingsRepository;", "watchParamsRepository", "Lru/yandex/video/m3/ott/data/repository/WatchParamsRepository;", "accountProvider", "Lru/yandex/video/m3/config/AccountProvider;", "build", "Lru/yandex/video/m3/ott/OttPlayerStrategy;", "player", "Lru/yandex/video/m3/player/YandexPlayer;", "errorNotifying", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "build$video_player_internalRelease", "provider", "experimental_DynamicDegradationLowSecurityLevel", "enable", "httpClient", "infoProvider$video_player_internalRelease", "periodSeconds", "useDelayedTrackHandling", ConfigConstants.CONFIG, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttStrategyBuilder {
    public static final int $stable = 8;
    private Context context;
    private DelayedTrackHandlingFeatureConfig delayedTrackHandlingFeatureConfig;
    private String deviceId;
    private DeviceProvider deviceProvider;
    private DrmServiceConfig drmServiceConfig;
    private ExecutorService executorService;
    private InfoProvider infoProvider;
    private boolean isDynamicDegradationLowSecurityLevel;
    private LicenseCheckerRepository licenseCheckerRepository;
    private ManifestRepository<OttVideoData> manifestRepository;
    private OkHttpClient okHttpClient;
    private OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory;
    private PictureInPictureProvider pictureInPictureProvider;
    private PlayerLogger playerLogger;
    private ProfileRepository profileRepository;
    private SubProfileProvider subProfileProvider;
    private TimingsRepository timingsRepository;
    private WatchParamsRepository watchParamsRepository;
    private EndpointsData endpointsData = new EndpointsData(null, null, null, null, 15, null);
    private long timingsPeriodSeconds = 5;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread build$lambda$31$lambda$30(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:SchOttPlayerStrategy");
        return newThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread build$lambda$36$lambda$35(ThreadFactory threadFactory, Runnable runnable) {
        Thread newThread = threadFactory.newThread(runnable);
        newThread.setName("YP:OttPlayerStrategy");
        return newThread;
    }

    public final OttStrategyBuilder accountProvider(AccountProvider accountProvider) {
        return this;
    }

    public final OttPlayerStrategy build$video_player_internalRelease(YandexPlayer<?> player, PlayerPlaybackErrorNotifying errorNotifying) {
        Context context;
        Context context2 = this.context;
        if (context2 == null) {
            ny61.r("Please specify context");
            return null;
        }
        DrmServiceConfig drmServiceConfig = this.drmServiceConfig;
        if (drmServiceConfig == null) {
            ny61.r("Please specify drm service config");
            return null;
        }
        ProfileRepository profileRepository = this.profileRepository;
        if (profileRepository == null) {
            ny61.r("Please specify OTT profile repository implementation");
            return null;
        }
        TimingsRepository timingsRepository = this.timingsRepository;
        if (timingsRepository == null) {
            ny61.r("Please specify OTT timings repository implementation");
            return null;
        }
        ManifestRepository<OttVideoData> manifestRepository = this.manifestRepository;
        if (manifestRepository == null) {
            ny61.r("Please specify manifest repository implementation");
            return null;
        }
        LicenseCheckerRepository licenseCheckerRepository = this.licenseCheckerRepository;
        if (licenseCheckerRepository == null) {
            ny61.r("Please specify OTT license checker repository implementation");
            return null;
        }
        WatchParamsRepository watchParamsRepository = this.watchParamsRepository;
        if (watchParamsRepository == null) {
            ny61.r("Please specify watch params repository implementation");
            return null;
        }
        DeviceProvider deviceProvider = this.deviceProvider;
        if (deviceProvider == null) {
            ny61.r("Please specify DeviceProvider implementation");
            return null;
        }
        DefaultResourceProvider defaultResourceProvider = new DefaultResourceProvider(context2);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new p16(Executors.defaultThreadFactory(), 8));
        ManifestRepositoryImpl manifestRepositoryImpl = manifestRepository instanceof ManifestRepositoryImpl ? (ManifestRepositoryImpl) manifestRepository : null;
        if (manifestRepositoryImpl != null) {
            manifestRepositoryImpl.setApiEndpointsData(this.endpointsData);
            manifestRepositoryImpl.setDeviceId(this.deviceId);
        }
        PlayerLogger playerLogger = this.playerLogger;
        if (playerLogger == null) {
            playerLogger = new DummyPlayerLogger();
        }
        PlayerLogger playerLogger2 = playerLogger;
        ExecutorService executorService = this.executorService;
        MarkedExecutorService markedExecutorService = executorService != null ? new MarkedExecutorService(false, executorService) : new MarkedExecutorService(true, Executors.newCachedThreadPool(new p16(Executors.defaultThreadFactory(), 9)));
        OkHttpClient okHttpClient = this.okHttpClient;
        OkHttpClient okHttpClient2 = okHttpClient == null ? new OkHttpClient(new OkHttpClient.a()) : okHttpClient;
        OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory = this.ottMediaDrmCallbackDelegateFactory;
        if (ottMediaDrmCallbackDelegateFactory == null) {
            ottMediaDrmCallbackDelegateFactory = new OttMediaDrmCallbackDelegateFactoryImpl(drmServiceConfig);
        }
        OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory2 = ottMediaDrmCallbackDelegateFactory;
        PictureInPictureProvider pictureInPictureProvider = this.pictureInPictureProvider;
        if (pictureInPictureProvider == null) {
            context = context2;
            pictureInPictureProvider = new DefaultPictureInPictureProvider(false, 1, null);
        } else {
            context = context2;
        }
        PictureInPictureProvider pictureInPictureProvider2 = pictureInPictureProvider;
        JsonConverterImpl jsonConverterImpl = new JsonConverterImpl();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        TrackingManagerFactoryImpl trackingManagerFactoryImpl = new TrackingManagerFactoryImpl(systemTimeProvider, context, deviceProvider, pictureInPictureProvider2, newSingleThreadScheduledExecutor, markedExecutorService, okHttpClient2);
        OkHttpClient okHttpClient3 = okHttpClient2;
        InfoProvider infoProvider = this.infoProvider;
        if (infoProvider != null) {
            trackingManagerFactoryImpl.setInfoProvider$video_player_internalRelease(infoProvider);
        }
        TimingsManager timingsManager = new TimingsManager(profileRepository, timingsRepository, markedExecutorService, newSingleThreadScheduledExecutor, this.timingsPeriodSeconds);
        TrackingManager create = trackingManagerFactoryImpl.create();
        LicenseCheckerManager licenseCheckerManager = new LicenseCheckerManager(licenseCheckerRepository, new TimeCounterImpl(systemTimeProvider), newSingleThreadScheduledExecutor, markedExecutorService);
        TrackSelectionManager trackSelectionManager = new TrackSelectionManager(playerLogger2, markedExecutorService, watchParamsRepository);
        DelayedTrackHandlingFeatureConfig delayedTrackHandlingFeatureConfig = this.delayedTrackHandlingFeatureConfig;
        if (delayedTrackHandlingFeatureConfig != null) {
            delayedTrackHandlingFeatureConfig.applyTo(trackSelectionManager);
        }
        return new OttPlayerStrategy(player, defaultResourceProvider, playerLogger2, errorNotifying, timingsManager, create, licenseCheckerManager, trackSelectionManager, new ConcurrencyArbiterManagerImpl(new ConcurrencyArbiterApiImpl(okHttpClient3, jsonConverterImpl), markedExecutorService, newSingleThreadScheduledExecutor), manifestRepository, ottMediaDrmCallbackDelegateFactory2, this.isDynamicDegradationLowSecurityLevel, markedExecutorService, newSingleThreadScheduledExecutor);
    }

    public final OttStrategyBuilder context(Context context) {
        this.context = context;
        return this;
    }

    public final OttStrategyBuilder deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public final OttStrategyBuilder deviceProvider(DeviceProvider provider) {
        this.deviceProvider = provider;
        return this;
    }

    public final OttStrategyBuilder drmServiceConfig(DrmServiceConfig drmServiceConfig) {
        this.drmServiceConfig = drmServiceConfig;
        return this;
    }

    public final OttStrategyBuilder endpointsData(EndpointsData endpointsData) {
        this.endpointsData = endpointsData;
        return this;
    }

    public final OttStrategyBuilder executorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public final OttStrategyBuilder experimental_DynamicDegradationLowSecurityLevel(boolean enable) {
        this.isDynamicDegradationLowSecurityLevel = enable;
        return this;
    }

    public final OttStrategyBuilder httpClient(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
        return this;
    }

    public final OttStrategyBuilder infoProvider$video_player_internalRelease(InfoProvider provider) {
        this.infoProvider = provider;
        return this;
    }

    public final OttStrategyBuilder licenseCheckerRepository(LicenseCheckerRepository licenseCheckerRepository) {
        this.licenseCheckerRepository = licenseCheckerRepository;
        return this;
    }

    public final OttStrategyBuilder manifestRepository(ManifestRepository<OttVideoData> manifestRepository) {
        this.manifestRepository = manifestRepository;
        return this;
    }

    public final OttStrategyBuilder ottMediaDrmCallbackDelegateFactory(OttMediaDrmCallbackDelegateFactory ottMediaDrmCallbackDelegateFactory) {
        this.ottMediaDrmCallbackDelegateFactory = ottMediaDrmCallbackDelegateFactory;
        return this;
    }

    public final OttStrategyBuilder pictureInPictureProvider(PictureInPictureProvider pictureInPictureProvider) {
        this.pictureInPictureProvider = pictureInPictureProvider;
        return this;
    }

    public final OttStrategyBuilder playerLogger(PlayerLogger playerLogger) {
        this.playerLogger = playerLogger;
        return this;
    }

    public final OttStrategyBuilder profileRepository(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
        return this;
    }

    public final OttStrategyBuilder subProfileProvider(SubProfileProvider subProfileProvider) {
        this.subProfileProvider = subProfileProvider;
        return this;
    }

    public final OttStrategyBuilder timingsPeriodSeconds(long periodSeconds) {
        this.timingsPeriodSeconds = periodSeconds;
        return this;
    }

    public final OttStrategyBuilder timingsRepository(TimingsRepository timingsRepository) {
        this.timingsRepository = timingsRepository;
        return this;
    }

    public final OttStrategyBuilder useDelayedTrackHandling(DelayedTrackHandlingFeatureConfig config) {
        this.delayedTrackHandlingFeatureConfig = config;
        return this;
    }

    public final OttStrategyBuilder watchParamsRepository(WatchParamsRepository watchParamsRepository) {
        this.watchParamsRepository = watchParamsRepository;
        return this;
    }
}
