package ru.yandex.video.m3.list_player_manager.impl.ypfactories;

import android.content.Context;
import androidx.media3.common.PriorityTaskManager;
import defpackage.nmh;
import defpackage.omh;
import defpackage.p16;
import defpackage.tls;
import defpackage.zxc0;
import defpackage.zy11;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.cache.CacheProvider;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfig;
import ru.yandex.video.m3.model.config.datasource.CachedDataSourceConfigKt;
import ru.yandex.video.m3.model.config.datasource.DefaultDataSourceFactoryCreatorConfig;
import ru.yandex.video.m3.model.config.datasource.DefaultDataSourceFactoryCreatorConfigKt;
import ru.yandex.video.m3.model.config.delegate.AudioDelegateConfig;
import ru.yandex.video.m3.model.config.delegate.AudioDelegateConfigKt;
import ru.yandex.video.m3.model.config.delegate.ExoPlayerDelegateConfig;
import ru.yandex.video.m3.model.config.delegate.ExoPlayerDelegateConfigKt;
import ru.yandex.video.m3.model.config.delegate.SupplementalDelegateProperties;
import ru.yandex.video.m3.model.config.delegate.SupplementalDelegatePropertiesKt;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfig;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.ExoPlayerDelegateFactory;
import ru.yandex.video.m3.player.ExoPlayerDelegateFactoryKt;
import ru.yandex.video.m3.player.PlayerDelegateFactory;
import ru.yandex.video.m3.player.impl.load_control.MemoryDependsLoadControlFactory;
import ru.yandex.video.m3.player.impl.load_control.MemoryDependsLoadControlFactoryKt;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactoryKt;
import ru.yandex.video.m3.player.impl.trackselection.DisplaySizeTargetFormatProvider;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectorFactory;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectorFactoryKt;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.preload.PreloadPrioritySettingsKt;
import ru.yandex.video.m3.preload_manager.cache.PreloadCacheProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultPlayerDelegateFactory;", "", "()V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPlayerDelegateFactory {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "DefaultPlayerDelegateFactory";

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/ypfactories/DefaultPlayerDelegateFactory$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", "preloadCacheProvider", "Landroidx/media3/common/PriorityTaskManager;", "preloadPriorityTaskManager", "Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;", "targetFormatProvider", "", "automaticallyHandleAudioFocus", "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "loadControlConfig", "Lru/yandex/video/m3/data/network/UrlParams;", "perfTrackingUrl", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "useDataSourceFactoryCreator", "failFast", "Lru/yandex/video/m3/player/PlayerDelegateFactory;", "Lzxc0;", "create$video_player_internalRelease", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;Landroidx/media3/common/PriorityTaskManager;Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;ZLru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;Lru/yandex/video/m3/data/network/UrlParams;Lru/yandex/video/m3/player/utils/PlayerLogger;ZZ)Lru/yandex/video/m3/player/PlayerDelegateFactory;", "create", "", "TAG", "Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread create$lambda$2$lambda$1(ThreadFactory threadFactory, Runnable runnable) {
            Thread newThread = threadFactory.newThread(runnable);
            newThread.setName("YP:EPD");
            return newThread;
        }

        public final PlayerDelegateFactory<zxc0> create$video_player_internalRelease(Context context, final OkHttpClient okHttpClient, final PreloadCacheProvider preloadCacheProvider, final PriorityTaskManager preloadPriorityTaskManager, DisplaySizeTargetFormatProvider targetFormatProvider, final boolean automaticallyHandleAudioFocus, final LoadControlConfig loadControlConfig, final UrlParams perfTrackingUrl, final PlayerLogger playerLogger, final boolean useDataSourceFactoryCreator, final boolean failFast) {
            final DefaultMediaSourceFactory DefaultMediaSourceFactory = DefaultMediaSourceFactoryKt.DefaultMediaSourceFactory(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory$Companion$create$mediaSourceFactory$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(DefaultMediaSourceFactory.Builder builder) {
                    builder.setPerfTrackingUrl$video_player_internalRelease(UrlParams.this);
                    if (!useDataSourceFactoryCreator) {
                        PreloadCacheProvider preloadCacheProvider2 = preloadCacheProvider;
                        SafeCachedDataSourceFactory safeCachedDataSourceFactory = new SafeCachedDataSourceFactory(preloadCacheProvider2, okHttpClient, CacheProvider.getCacheKeyFactory$default(preloadCacheProvider2, null, 1, null), CachedDataSourceConfigKt.CachedDataSourceConfig(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory$Companion$create$mediaSourceFactory$1$cachedDataSourceFactory$1
                            @Override // defpackage.tls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((CachedDataSourceConfig.Builder) obj);
                                return zy11.a;
                            }

                            public final void invoke(CachedDataSourceConfig.Builder builder2) {
                                builder2.setEnableDebugCacheMiss(Boolean.TRUE);
                            }
                        }));
                        builder.setManifestDataSourceFactory(safeCachedDataSourceFactory);
                        builder.setChunkDataSourceFactory(safeCachedDataSourceFactory);
                        return;
                    }
                    playerLogger.debug("DefaultPlayerDelegateFactory", "create", "using DataSourceFactoryCreator", new Object[0]);
                    final PlayerLogger playerLogger2 = playerLogger;
                    final PreloadCacheProvider preloadCacheProvider3 = preloadCacheProvider;
                    final OkHttpClient okHttpClient2 = okHttpClient;
                    final boolean z = failFast;
                    DefaultDataSourceFactoryCreatorConfig DefaultDataSourceFactoryCreatorConfig = DefaultDataSourceFactoryCreatorConfigKt.DefaultDataSourceFactoryCreatorConfig(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory$Companion$create$mediaSourceFactory$1$creatorConfig$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void invoke(DefaultDataSourceFactoryCreatorConfig.Builder builder2) {
                            builder2.m754setPlayerLogger(PlayerLogger.this);
                            builder2.m748setCacheProvider((CacheProvider) preloadCacheProvider3);
                            builder2.m753setOkHttpClient(okHttpClient2);
                            builder2.m749setEnableDebugCacheMiss(Boolean.FALSE);
                            builder2.m750setEnableFallbackToUpstream(Boolean.TRUE);
                            builder2.m751setExperimentalPreloadLiveDashConfig((PreloadLiveDashConfig) null);
                            builder2.m752setFailFast(Boolean.valueOf(z));
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((DefaultDataSourceFactoryCreatorConfig.Builder) obj);
                            return zy11.a;
                        }
                    });
                    builder.setManifestDataSourceFactoryCreatorConfig(DefaultDataSourceFactoryCreatorConfig);
                    builder.setChunkDataSourceFactoryCreatorConfig(DefaultDataSourceFactoryCreatorConfig);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DefaultMediaSourceFactory.Builder) obj);
                    return zy11.a;
                }
            });
            final MemoryDependsLoadControlFactory MemoryDependsLoadControlFactory = MemoryDependsLoadControlFactoryKt.MemoryDependsLoadControlFactory(context, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory$Companion$create$loadControlFactory$1
                {
                    super(1);
                }

                public final void invoke(MemoryDependsLoadControlFactory.Builder builder) {
                    builder.setPriorityTaskManager(null);
                    builder.setConfig(LoadControlConfig.this);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((MemoryDependsLoadControlFactory.Builder) obj);
                    return zy11.a;
                }
            });
            final ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new p16(Executors.defaultThreadFactory(), 3));
            final TargetFormatTrackSelectorFactory TargetFormatTrackSelectorFactory$default = TargetFormatTrackSelectorFactoryKt.TargetFormatTrackSelectorFactory$default(context, targetFormatProvider, new omh(new nmh()), null, 8, null);
            final ExoPlayerDelegateConfig ExoPlayerDelegateConfig = ExoPlayerDelegateConfigKt.ExoPlayerDelegateConfig(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory$Companion$create$delegateConfig$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(ExoPlayerDelegateConfig.Builder builder) {
                    final boolean z = automaticallyHandleAudioFocus;
                    builder.setAudioDelegateConfig(AudioDelegateConfigKt.AudioDelegateConfig(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory$Companion$create$delegateConfig$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void invoke(AudioDelegateConfig.Builder builder2) {
                            builder2.setAutomaticallyHandleAudioFocus(Boolean.valueOf(z));
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((AudioDelegateConfig.Builder) obj);
                            return zy11.a;
                        }
                    }));
                    builder.setPreloadPrioritySettings(PreloadPrioritySettingsKt.PreloadPrioritySettings$default(PriorityTaskManager.this, null, 2, null));
                    builder.setSupplementalDelegateProperties(SupplementalDelegatePropertiesKt.SupplementalDelegateProperties(new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory$Companion$create$delegateConfig$1.2
                        public final void invoke(SupplementalDelegateProperties.Builder builder2) {
                            Boolean bool = Boolean.TRUE;
                            builder2.setEnableDecoderFallback(bool);
                            builder2.setAllowDisabledAudioTrackVariant(bool);
                            builder2.setAllowPendingAudioTrackDisabling(bool);
                        }

                        @Override // defpackage.tls
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SupplementalDelegateProperties.Builder) obj);
                            return zy11.a;
                        }
                    }));
                    builder.setRecoverType("RESET_AND_RESTART");
                    builder.setMaxRecoverAttempts(3);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ExoPlayerDelegateConfig.Builder) obj);
                    return zy11.a;
                }
            });
            return ExoPlayerDelegateFactoryKt.ExoPlayerDelegateFactory(context, new tls() { // from class: ru.yandex.video.m3.list_player_manager.impl.ypfactories.DefaultPlayerDelegateFactory$Companion$create$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(ExoPlayerDelegateFactory.Builder builder) {
                    builder.setDrmOkHttpClient(OkHttpClient.this);
                    builder.setMediaSourceFactory(DefaultMediaSourceFactory);
                    builder.setScheduledExecutorService(newSingleThreadScheduledExecutor);
                    builder.setTrackSelectorFactory(TargetFormatTrackSelectorFactory$default);
                    builder.setLoadControlFactory(MemoryDependsLoadControlFactory);
                    builder.setConfig(ExoPlayerDelegateConfig);
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ExoPlayerDelegateFactory.Builder) obj);
                    return zy11.a;
                }
            });
        }

        private Companion() {
        }
    }
}
