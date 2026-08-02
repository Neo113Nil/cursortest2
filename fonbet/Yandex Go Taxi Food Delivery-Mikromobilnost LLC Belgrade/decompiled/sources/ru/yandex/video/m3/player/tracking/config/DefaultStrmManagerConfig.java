package ru.yandex.video.m3.player.tracking.config;

import android.content.Context;
import defpackage.jxi;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.config.AccountProvider;
import ru.yandex.video.m3.data.network.UrlParams;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCodeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultEventNameProvider;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultEventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultLoggingFilter;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCategoryProvider;
import ru.yandex.video.m3.player.impl.tracking.data.ErrorCodeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventNameProvider;
import ru.yandex.video.m3.player.impl.tracking.data.EventTypeProvider;
import ru.yandex.video.m3.player.impl.tracking.data.LoggingFilter;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProvider;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider;
import ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0007\u0018\u0000 >2\u00020\u0001:\u0005?@>ABBu\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\u0004\u0018\u0001`\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00002\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R+\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=¨\u0006C"}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;", "Lru/yandex/video/m3/player/tracking/config/StrmManagerConfig;", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "Ljava/util/concurrent/Executor;", "executorService", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "providers", "", "", "testIds", "from", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "playlistRequestConfiguration", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "additionalFeatures", "<init>", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "Ljava/util/concurrent/Executor;", "getExecutorService", "()Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/ScheduledExecutorService;", "getScheduledExecutorService", "()Ljava/util/concurrent/ScheduledExecutorService;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "getProviders", "()Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "Ljava/util/List;", "getTestIds", "()Ljava/util/List;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "Ljava/util/Map;", "getAdditionalParameters", "()Ljava/util/Map;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "getPlaylistRequestConfiguration", "()Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "getAdditionalFeatures", "()Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "Companion", "AdditionalFeatures", "Builder", "InfoProviders", "PlaylistRequestConfiguration", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultStrmManagerConfig extends StrmManagerConfig {
    public static final String ANDROID_PLAYER_TELEMETRY_SERVICE = "AndroidPlayer";
    private final AdditionalFeatures additionalFeatures;
    private final Map<String, Object> additionalParameters;
    private final Context context;
    private final Executor executorService;
    private final String from;
    private final OkHttpClient okHttpClient;
    private final PlaylistRequestConfiguration playlistRequestConfiguration;
    private final InfoProviders providers;
    private final ScheduledExecutorService scheduledExecutorService;
    private final List<String> testIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private DefaultStrmManagerConfig(Context context, OkHttpClient okHttpClient, Executor executor, ScheduledExecutorService scheduledExecutorService, InfoProviders infoProviders, List<String> list, String str, Map<String, ? extends Object> map, PlaylistRequestConfiguration playlistRequestConfiguration, AdditionalFeatures additionalFeatures) {
        super(null);
        this.context = context;
        this.okHttpClient = okHttpClient;
        this.executorService = executor;
        this.scheduledExecutorService = scheduledExecutorService;
        this.providers = infoProviders;
        this.testIds = list;
        this.from = str;
        this.additionalParameters = map;
        this.playlistRequestConfiguration = playlistRequestConfiguration;
        this.additionalFeatures = additionalFeatures;
    }

    public static /* synthetic */ DefaultStrmManagerConfig copy$default(DefaultStrmManagerConfig defaultStrmManagerConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DefaultStrmManagerConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DefaultStrmManagerConfig.Builder builder) {
                }
            };
        }
        return defaultStrmManagerConfig.copy(tlsVar);
    }

    public final DefaultStrmManagerConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final AdditionalFeatures getAdditionalFeatures() {
        return this.additionalFeatures;
    }

    public final Map<String, Object> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Executor getExecutorService() {
        return this.executorService;
    }

    public final String getFrom() {
        return this.from;
    }

    public final OkHttpClient getOkHttpClient() {
        return this.okHttpClient;
    }

    public final PlaylistRequestConfiguration getPlaylistRequestConfiguration() {
        return this.playlistRequestConfiguration;
    }

    public final InfoProviders getProviders() {
        return this.providers;
    }

    public final ScheduledExecutorService getScheduledExecutorService() {
        return this.scheduledExecutorService;
    }

    public final List<String> getTestIds() {
        return this.testIds;
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$Companion;", "", "<init>", "()V", "Lru/yandex/video/m3/config/AccountProvider;", "accountProvider", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "deviceInfoProvider", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "InfoProviders", "(Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;Ltls;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration$Builder;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "PlaylistRequestConfiguration", "(Ltls;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures$Builder;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "AdditionalFeatures", "(Ltls;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "", "ANDROID_PLAYER_TELEMETRY_SERVICE", "Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AdditionalFeatures AdditionalFeatures$default(Companion companion, tls tlsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig$Companion$AdditionalFeatures$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DefaultStrmManagerConfig.AdditionalFeatures.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(DefaultStrmManagerConfig.AdditionalFeatures.Builder builder) {
                    }
                };
            }
            return companion.AdditionalFeatures(tlsVar);
        }

        public static /* synthetic */ InfoProviders InfoProviders$default(Companion companion, AccountProvider accountProvider, DeviceInfoProvider deviceInfoProvider, tls tlsVar, int i, Object obj) {
            if ((i & 4) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig$Companion$InfoProviders$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DefaultStrmManagerConfig.InfoProviders.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(DefaultStrmManagerConfig.InfoProviders.Builder builder) {
                    }
                };
            }
            return companion.InfoProviders(accountProvider, deviceInfoProvider, tlsVar);
        }

        public static /* synthetic */ PlaylistRequestConfiguration PlaylistRequestConfiguration$default(Companion companion, tls tlsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig$Companion$PlaylistRequestConfiguration$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DefaultStrmManagerConfig.PlaylistRequestConfiguration.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(DefaultStrmManagerConfig.PlaylistRequestConfiguration.Builder builder) {
                    }
                };
            }
            return companion.PlaylistRequestConfiguration(tlsVar);
        }

        public final /* synthetic */ AdditionalFeatures AdditionalFeatures(tls builderAction) {
            AdditionalFeatures.Builder builder = new AdditionalFeatures.Builder();
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }

        public final /* synthetic */ InfoProviders InfoProviders(AccountProvider accountProvider, DeviceInfoProvider deviceInfoProvider, tls builderAction) {
            InfoProviders.Builder builder = new InfoProviders.Builder(accountProvider, deviceInfoProvider);
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }

        public final /* synthetic */ PlaylistRequestConfiguration PlaylistRequestConfiguration(tls builderAction) {
            PlaylistRequestConfiguration.Builder builder = new PlaylistRequestConfiguration.Builder();
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "", "", "enableAudioMbr", "enableLowLatency", "loadPreviewsInDashPlaylistIfApplicable", "requestSecondaryVideoTracks", "<init>", "(ZZZZ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "Z", "getEnableAudioMbr", "()Z", "getEnableAudioMbr$annotations", "()V", "getEnableLowLatency", "getLoadPreviewsInDashPlaylistIfApplicable", "getRequestSecondaryVideoTracks", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlaylistRequestConfiguration {
        public static final int $stable = 0;
        private final boolean enableAudioMbr;
        private final boolean enableLowLatency;
        private final boolean loadPreviewsInDashPlaylistIfApplicable;
        private final boolean requestSecondaryVideoTracks;

        private PlaylistRequestConfiguration(boolean z, boolean z2, boolean z3, boolean z4) {
            this.enableAudioMbr = z;
            this.enableLowLatency = z2;
            this.loadPreviewsInDashPlaylistIfApplicable = z3;
            this.requestSecondaryVideoTracks = z4;
        }

        public static /* synthetic */ PlaylistRequestConfiguration copy$default(PlaylistRequestConfiguration playlistRequestConfiguration, tls tlsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig$PlaylistRequestConfiguration$copy$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DefaultStrmManagerConfig.PlaylistRequestConfiguration.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(DefaultStrmManagerConfig.PlaylistRequestConfiguration.Builder builder) {
                    }
                };
            }
            return playlistRequestConfiguration.copy(tlsVar);
        }

        @jxi
        public static /* synthetic */ void getEnableAudioMbr$annotations() {
        }

        public final PlaylistRequestConfiguration copy(tls builderAction) {
            Builder builder = new Builder(this);
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }

        public final boolean getEnableAudioMbr() {
            return this.enableAudioMbr;
        }

        public final boolean getEnableLowLatency() {
            return this.enableLowLatency;
        }

        public final boolean getLoadPreviewsInDashPlaylistIfApplicable() {
            return this.loadPreviewsInDashPlaylistIfApplicable;
        }

        public final boolean getRequestSecondaryVideoTracks() {
            return this.requestSecondaryVideoTracks;
        }

        public /* synthetic */ PlaylistRequestConfiguration(boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, z3, z4);
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration$Builder;", "", "playlistRequestConfiguration", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;)V", "()V", "enableAudioMbr", "", "getEnableAudioMbr", "()Ljava/lang/Boolean;", "setEnableAudioMbr", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "enableLowLatency", "getEnableLowLatency", "setEnableLowLatency", "loadPreviewsInDashPlaylistIfApplicable", "getLoadPreviewsInDashPlaylistIfApplicable", "setLoadPreviewsInDashPlaylistIfApplicable", "requestSecondaryVideoTracks", "getRequestSecondaryVideoTracks", "setRequestSecondaryVideoTracks", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private Boolean enableAudioMbr;
            private Boolean enableLowLatency;
            private Boolean loadPreviewsInDashPlaylistIfApplicable;
            private Boolean requestSecondaryVideoTracks;

            public Builder(PlaylistRequestConfiguration playlistRequestConfiguration) {
                this();
                this.enableAudioMbr = Boolean.valueOf(playlistRequestConfiguration.getEnableAudioMbr());
                this.enableLowLatency = Boolean.valueOf(playlistRequestConfiguration.getEnableLowLatency());
                this.loadPreviewsInDashPlaylistIfApplicable = Boolean.valueOf(playlistRequestConfiguration.getLoadPreviewsInDashPlaylistIfApplicable());
                this.requestSecondaryVideoTracks = Boolean.valueOf(playlistRequestConfiguration.getRequestSecondaryVideoTracks());
            }

            public final PlaylistRequestConfiguration build$video_player_internalRelease() {
                Boolean bool = this.enableAudioMbr;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = this.enableLowLatency;
                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = this.loadPreviewsInDashPlaylistIfApplicable;
                boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = this.requestSecondaryVideoTracks;
                return new PlaylistRequestConfiguration(booleanValue, booleanValue2, booleanValue3, bool4 != null ? bool4.booleanValue() : false, null);
            }

            public final Boolean getEnableAudioMbr() {
                return this.enableAudioMbr;
            }

            public final Boolean getEnableLowLatency() {
                return this.enableLowLatency;
            }

            public final Boolean getLoadPreviewsInDashPlaylistIfApplicable() {
                return this.loadPreviewsInDashPlaylistIfApplicable;
            }

            public final Boolean getRequestSecondaryVideoTracks() {
                return this.requestSecondaryVideoTracks;
            }

            public final void setEnableAudioMbr(Boolean bool) {
                this.enableAudioMbr = bool;
            }

            public final void setEnableLowLatency(Boolean bool) {
                this.enableLowLatency = bool;
            }

            public final void setLoadPreviewsInDashPlaylistIfApplicable(Boolean bool) {
                this.loadPreviewsInDashPlaylistIfApplicable = bool;
            }

            public final void setRequestSecondaryVideoTracks(Boolean bool) {
                this.requestSecondaryVideoTracks = bool;
            }

            public Builder() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0001'B=\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "", "shouldUseBatteryObserver", "Lru/yandex/video/m3/data/network/UrlParams;", "strmTrackingUrlParams", "optimizeTelemetry", "", Constants.KEY_SERVICE, "<init>", "(Lru/yandex/video/m3/player/utils/JsonConverter;Lru/yandex/video/m3/player/utils/PlayerLogger;ZLru/yandex/video/m3/data/network/UrlParams;ZLjava/lang/String;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "getJsonConverter", "()Lru/yandex/video/m3/player/utils/JsonConverter;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "Z", "getShouldUseBatteryObserver", "()Z", "getShouldUseBatteryObserver$annotations", "()V", "Lru/yandex/video/m3/data/network/UrlParams;", "getStrmTrackingUrlParams", "()Lru/yandex/video/m3/data/network/UrlParams;", "getOptimizeTelemetry", "Ljava/lang/String;", "getService", "()Ljava/lang/String;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AdditionalFeatures {
        public static final int $stable = 0;
        private final JsonConverter jsonConverter;
        private final boolean optimizeTelemetry;
        private final PlayerLogger playerLogger;
        private final String service;
        private final boolean shouldUseBatteryObserver;
        private final UrlParams strmTrackingUrlParams;

        private AdditionalFeatures(JsonConverter jsonConverter, PlayerLogger playerLogger, boolean z, UrlParams urlParams, boolean z2, String str) {
            this.jsonConverter = jsonConverter;
            this.playerLogger = playerLogger;
            this.shouldUseBatteryObserver = z;
            this.strmTrackingUrlParams = urlParams;
            this.optimizeTelemetry = z2;
            this.service = str;
        }

        public static /* synthetic */ AdditionalFeatures copy$default(AdditionalFeatures additionalFeatures, tls tlsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig$AdditionalFeatures$copy$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DefaultStrmManagerConfig.AdditionalFeatures.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(DefaultStrmManagerConfig.AdditionalFeatures.Builder builder) {
                    }
                };
            }
            return additionalFeatures.copy(tlsVar);
        }

        @jxi
        public static /* synthetic */ void getShouldUseBatteryObserver$annotations() {
        }

        public final AdditionalFeatures copy(tls builderAction) {
            Builder builder = new Builder(this);
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }

        public final JsonConverter getJsonConverter() {
            return this.jsonConverter;
        }

        public final boolean getOptimizeTelemetry() {
            return this.optimizeTelemetry;
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        public final String getService() {
            return this.service;
        }

        public final boolean getShouldUseBatteryObserver() {
            return this.shouldUseBatteryObserver;
        }

        public final UrlParams getStrmTrackingUrlParams() {
            return this.strmTrackingUrlParams;
        }

        public /* synthetic */ AdditionalFeatures(JsonConverter jsonConverter, PlayerLogger playerLogger, boolean z, UrlParams urlParams, boolean z2, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(jsonConverter, playerLogger, z, urlParams, z2, str);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010)\u001a\u00020\u0003H\u0000¢\u0006\u0002\b*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0012\u0012\u0004\b \u0010\u0005\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures$Builder;", "", "additionalFeatures", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;)V", "()V", "jsonConverter", "Lru/yandex/video/m3/player/utils/JsonConverter;", "getJsonConverter", "()Lru/yandex/video/m3/player/utils/JsonConverter;", "setJsonConverter", "(Lru/yandex/video/m3/player/utils/JsonConverter;)V", "optimizeTelemetry", "", "getOptimizeTelemetry", "()Ljava/lang/Boolean;", "setOptimizeTelemetry", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "setPlayerLogger", "(Lru/yandex/video/m3/player/utils/PlayerLogger;)V", Constants.KEY_SERVICE, "", "getService", "()Ljava/lang/String;", "setService", "(Ljava/lang/String;)V", "shouldUseBatteryObserver", "getShouldUseBatteryObserver$annotations", "getShouldUseBatteryObserver", "setShouldUseBatteryObserver", "strmTrackingUrlParams", "Lru/yandex/video/m3/data/network/UrlParams;", "getStrmTrackingUrlParams", "()Lru/yandex/video/m3/data/network/UrlParams;", "setStrmTrackingUrlParams", "(Lru/yandex/video/m3/data/network/UrlParams;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private JsonConverter jsonConverter;
            private Boolean optimizeTelemetry;
            private PlayerLogger playerLogger;
            private String service;
            private Boolean shouldUseBatteryObserver;
            private UrlParams strmTrackingUrlParams;

            public Builder(AdditionalFeatures additionalFeatures) {
                this();
                this.jsonConverter = additionalFeatures.getJsonConverter();
                this.playerLogger = additionalFeatures.getPlayerLogger();
                this.shouldUseBatteryObserver = Boolean.valueOf(additionalFeatures.getShouldUseBatteryObserver());
                this.strmTrackingUrlParams = additionalFeatures.getStrmTrackingUrlParams();
                this.optimizeTelemetry = Boolean.valueOf(additionalFeatures.getOptimizeTelemetry());
                this.service = additionalFeatures.getService();
            }

            @jxi
            public static /* synthetic */ void getShouldUseBatteryObserver$annotations() {
            }

            public final AdditionalFeatures build$video_player_internalRelease() {
                boolean z;
                boolean z2;
                JsonConverter jsonConverter = this.jsonConverter;
                PlayerLogger playerLogger = this.playerLogger;
                if (playerLogger == null) {
                    playerLogger = new DummyPlayerLogger();
                }
                Boolean bool = this.shouldUseBatteryObserver;
                if (bool != null) {
                    z = bool.booleanValue();
                    z2 = false;
                } else {
                    z = false;
                    z2 = false;
                }
                UrlParams urlParams = this.strmTrackingUrlParams;
                Boolean bool2 = this.optimizeTelemetry;
                if (bool2 != null) {
                    z2 = bool2.booleanValue();
                }
                String str = this.service;
                if (str == null) {
                    str = DefaultStrmManagerConfig.ANDROID_PLAYER_TELEMETRY_SERVICE;
                }
                return new AdditionalFeatures(jsonConverter, playerLogger, z, urlParams, z2, str, null);
            }

            public final JsonConverter getJsonConverter() {
                return this.jsonConverter;
            }

            public final Boolean getOptimizeTelemetry() {
                return this.optimizeTelemetry;
            }

            public final PlayerLogger getPlayerLogger() {
                return this.playerLogger;
            }

            public final String getService() {
                return this.service;
            }

            public final Boolean getShouldUseBatteryObserver() {
                return this.shouldUseBatteryObserver;
            }

            public final UrlParams getStrmTrackingUrlParams() {
                return this.strmTrackingUrlParams;
            }

            public final void setJsonConverter(JsonConverter jsonConverter) {
                this.jsonConverter = jsonConverter;
            }

            public final void setOptimizeTelemetry(Boolean bool) {
                this.optimizeTelemetry = bool;
            }

            public final void setPlayerLogger(PlayerLogger playerLogger) {
                this.playerLogger = playerLogger;
            }

            public final void setService(String str) {
                this.service = str;
            }

            public final void setShouldUseBatteryObserver(Boolean bool) {
                this.shouldUseBatteryObserver = bool;
            }

            public final void setStrmTrackingUrlParams(UrlParams urlParams) {
                this.strmTrackingUrlParams = urlParams;
            }

            public Builder() {
            }
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u00002\u00020\u0001:\u00017BU\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00002\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "", "Lru/yandex/video/m3/config/AccountProvider;", "accountProvider", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "deviceInfoProvider", "Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "liveSpeedControlInfoProvider", "Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "loggingFilter", "Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "eventNameProvider", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "eventTypeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "errorCodeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "errorCategoryProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "<init>", "(Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "Lru/yandex/video/m3/config/AccountProvider;", "getAccountProvider", "()Lru/yandex/video/m3/config/AccountProvider;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "getDeviceInfoProvider", "()Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "getLiveSpeedControlInfoProvider", "()Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "getLoggingFilter", "()Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "getEventNameProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "getEventTypeProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "getErrorCodeProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "getErrorCategoryProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "getTimeProvider", "()Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InfoProviders {
        public static final int $stable = 0;
        private final AccountProvider accountProvider;
        private final DeviceInfoProvider deviceInfoProvider;
        private final ErrorCategoryProvider errorCategoryProvider;
        private final ErrorCodeProvider errorCodeProvider;
        private final EventNameProvider eventNameProvider;
        private final EventTypeProvider eventTypeProvider;
        private final LiveSpeedControlInfoProvider liveSpeedControlInfoProvider;
        private final LoggingFilter loggingFilter;
        private final TimeProvider timeProvider;

        private InfoProviders(AccountProvider accountProvider, DeviceInfoProvider deviceInfoProvider, LiveSpeedControlInfoProvider liveSpeedControlInfoProvider, LoggingFilter loggingFilter, EventNameProvider eventNameProvider, EventTypeProvider eventTypeProvider, ErrorCodeProvider errorCodeProvider, ErrorCategoryProvider errorCategoryProvider, TimeProvider timeProvider) {
            this.accountProvider = accountProvider;
            this.deviceInfoProvider = deviceInfoProvider;
            this.liveSpeedControlInfoProvider = liveSpeedControlInfoProvider;
            this.loggingFilter = loggingFilter;
            this.eventNameProvider = eventNameProvider;
            this.eventTypeProvider = eventTypeProvider;
            this.errorCodeProvider = errorCodeProvider;
            this.errorCategoryProvider = errorCategoryProvider;
            this.timeProvider = timeProvider;
        }

        public static /* synthetic */ InfoProviders copy$default(InfoProviders infoProviders, tls tlsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.player.tracking.config.DefaultStrmManagerConfig$InfoProviders$copy$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((DefaultStrmManagerConfig.InfoProviders.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(DefaultStrmManagerConfig.InfoProviders.Builder builder) {
                    }
                };
            }
            return infoProviders.copy(tlsVar);
        }

        public final InfoProviders copy(tls builderAction) {
            Builder builder = new Builder(this);
            builderAction.invoke(builder);
            return builder.build$video_player_internalRelease();
        }

        public final AccountProvider getAccountProvider() {
            return this.accountProvider;
        }

        public final DeviceInfoProvider getDeviceInfoProvider() {
            return this.deviceInfoProvider;
        }

        public final ErrorCategoryProvider getErrorCategoryProvider() {
            return this.errorCategoryProvider;
        }

        public final ErrorCodeProvider getErrorCodeProvider() {
            return this.errorCodeProvider;
        }

        public final EventNameProvider getEventNameProvider() {
            return this.eventNameProvider;
        }

        public final EventTypeProvider getEventTypeProvider() {
            return this.eventTypeProvider;
        }

        public final LiveSpeedControlInfoProvider getLiveSpeedControlInfoProvider() {
            return this.liveSpeedControlInfoProvider;
        }

        public final LoggingFilter getLoggingFilter() {
            return this.loggingFilter;
        }

        public final TimeProvider getTimeProvider() {
            return this.timeProvider;
        }

        public /* synthetic */ InfoProviders(AccountProvider accountProvider, DeviceInfoProvider deviceInfoProvider, LiveSpeedControlInfoProvider liveSpeedControlInfoProvider, LoggingFilter loggingFilter, EventNameProvider eventNameProvider, EventTypeProvider eventTypeProvider, ErrorCodeProvider errorCodeProvider, ErrorCategoryProvider errorCategoryProvider, TimeProvider timeProvider, DefaultConstructorMarker defaultConstructorMarker) {
            this(accountProvider, deviceInfoProvider, liveSpeedControlInfoProvider, loggingFilter, eventNameProvider, eventTypeProvider, errorCodeProvider, errorCategoryProvider, timeProvider);
        }

        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010<\u001a\u00020\u0003H\u0000¢\u0006\u0002\b=R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders$Builder;", "", "infoProviders", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;)V", "accountProvider", "Lru/yandex/video/m3/config/AccountProvider;", "deviceInfoProvider", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "(Lru/yandex/video/m3/config/AccountProvider;Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;)V", "getAccountProvider", "()Lru/yandex/video/m3/config/AccountProvider;", "setAccountProvider", "(Lru/yandex/video/m3/config/AccountProvider;)V", "getDeviceInfoProvider", "()Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "setDeviceInfoProvider", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;)V", "errorCategoryProvider", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "getErrorCategoryProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;", "setErrorCategoryProvider", "(Lru/yandex/video/m3/player/impl/tracking/data/ErrorCategoryProvider;)V", "errorCodeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "getErrorCodeProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;", "setErrorCodeProvider", "(Lru/yandex/video/m3/player/impl/tracking/data/ErrorCodeProvider;)V", "eventNameProvider", "Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "getEventNameProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "setEventNameProvider", "(Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;)V", "eventTypeProvider", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "getEventTypeProvider", "()Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "setEventTypeProvider", "(Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;)V", "liveSpeedControlInfoProvider", "Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "getLiveSpeedControlInfoProvider", "()Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "setLiveSpeedControlInfoProvider", "(Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;)V", "loggingFilter", "Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "getLoggingFilter", "()Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "setLoggingFilter", "(Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;)V", "timeProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "getTimeProvider", "()Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "setTimeProvider", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private AccountProvider accountProvider;
            private DeviceInfoProvider deviceInfoProvider;
            private ErrorCategoryProvider errorCategoryProvider;
            private ErrorCodeProvider errorCodeProvider;
            private EventNameProvider eventNameProvider;
            private EventTypeProvider eventTypeProvider;
            private LiveSpeedControlInfoProvider liveSpeedControlInfoProvider;
            private LoggingFilter loggingFilter;
            private TimeProvider timeProvider;

            public Builder(InfoProviders infoProviders) {
                this(infoProviders.getAccountProvider(), infoProviders.getDeviceInfoProvider());
                this.liveSpeedControlInfoProvider = infoProviders.getLiveSpeedControlInfoProvider();
                this.loggingFilter = infoProviders.getLoggingFilter();
                this.eventNameProvider = infoProviders.getEventNameProvider();
                this.eventTypeProvider = infoProviders.getEventTypeProvider();
                this.errorCodeProvider = infoProviders.getErrorCodeProvider();
                this.errorCategoryProvider = infoProviders.getErrorCategoryProvider();
                this.timeProvider = infoProviders.getTimeProvider();
            }

            public final InfoProviders build$video_player_internalRelease() {
                AccountProvider accountProvider = this.accountProvider;
                DeviceInfoProvider deviceInfoProvider = this.deviceInfoProvider;
                LiveSpeedControlInfoProvider liveSpeedControlInfoProvider = this.liveSpeedControlInfoProvider;
                LoggingFilter loggingFilter = this.loggingFilter;
                if (loggingFilter == null) {
                    loggingFilter = new DefaultLoggingFilter();
                }
                EventNameProvider eventNameProvider = this.eventNameProvider;
                if (eventNameProvider == null) {
                    eventNameProvider = new DefaultEventNameProvider();
                }
                EventTypeProvider eventTypeProvider = this.eventTypeProvider;
                if (eventTypeProvider == null) {
                    eventTypeProvider = new DefaultEventTypeProvider();
                }
                ErrorCodeProvider errorCodeProvider = this.errorCodeProvider;
                if (errorCodeProvider == null) {
                    errorCodeProvider = new DefaultErrorCodeProvider();
                }
                ErrorCategoryProvider errorCategoryProvider = this.errorCategoryProvider;
                if (errorCategoryProvider == null) {
                    errorCategoryProvider = new DefaultErrorCategoryProvider();
                }
                TimeProvider timeProvider = this.timeProvider;
                if (timeProvider == null) {
                    timeProvider = new SystemTimeProvider();
                }
                return new InfoProviders(accountProvider, deviceInfoProvider, liveSpeedControlInfoProvider, loggingFilter, eventNameProvider, eventTypeProvider, errorCodeProvider, errorCategoryProvider, timeProvider, null);
            }

            public final AccountProvider getAccountProvider() {
                return this.accountProvider;
            }

            public final DeviceInfoProvider getDeviceInfoProvider() {
                return this.deviceInfoProvider;
            }

            public final ErrorCategoryProvider getErrorCategoryProvider() {
                return this.errorCategoryProvider;
            }

            public final ErrorCodeProvider getErrorCodeProvider() {
                return this.errorCodeProvider;
            }

            public final EventNameProvider getEventNameProvider() {
                return this.eventNameProvider;
            }

            public final EventTypeProvider getEventTypeProvider() {
                return this.eventTypeProvider;
            }

            public final LiveSpeedControlInfoProvider getLiveSpeedControlInfoProvider() {
                return this.liveSpeedControlInfoProvider;
            }

            public final LoggingFilter getLoggingFilter() {
                return this.loggingFilter;
            }

            public final TimeProvider getTimeProvider() {
                return this.timeProvider;
            }

            public final void setAccountProvider(AccountProvider accountProvider) {
                this.accountProvider = accountProvider;
            }

            public final void setDeviceInfoProvider(DeviceInfoProvider deviceInfoProvider) {
                this.deviceInfoProvider = deviceInfoProvider;
            }

            public final void setErrorCategoryProvider(ErrorCategoryProvider errorCategoryProvider) {
                this.errorCategoryProvider = errorCategoryProvider;
            }

            public final void setErrorCodeProvider(ErrorCodeProvider errorCodeProvider) {
                this.errorCodeProvider = errorCodeProvider;
            }

            public final void setEventNameProvider(EventNameProvider eventNameProvider) {
                this.eventNameProvider = eventNameProvider;
            }

            public final void setEventTypeProvider(EventTypeProvider eventTypeProvider) {
                this.eventTypeProvider = eventTypeProvider;
            }

            public final void setLiveSpeedControlInfoProvider(LiveSpeedControlInfoProvider liveSpeedControlInfoProvider) {
                this.liveSpeedControlInfoProvider = liveSpeedControlInfoProvider;
            }

            public final void setLoggingFilter(LoggingFilter loggingFilter) {
                this.loggingFilter = loggingFilter;
            }

            public final void setTimeProvider(TimeProvider timeProvider) {
                this.timeProvider = timeProvider;
            }

            public Builder(AccountProvider accountProvider, DeviceInfoProvider deviceInfoProvider) {
                this.accountProvider = accountProvider;
                this.deviceInfoProvider = deviceInfoProvider;
            }
        }
    }

    public /* synthetic */ DefaultStrmManagerConfig(Context context, OkHttpClient okHttpClient, Executor executor, ScheduledExecutorService scheduledExecutorService, InfoProviders infoProviders, List list, String str, Map map, PlaylistRequestConfiguration playlistRequestConfiguration, AdditionalFeatures additionalFeatures, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, okHttpClient, executor, scheduledExecutorService, infoProviders, list, str, map, playlistRequestConfiguration, additionalFeatures);
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B=\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\u0010\u0012J\r\u0010C\u001a\u00020\u0003H\u0000¢\u0006\u0002\bDR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$Builder;", "", ConfigConstants.CONFIG, "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig;)V", "context", "Landroid/content/Context;", "okHttpClient", "Lokhttp3/OkHttpClient;", "executorService", "Ljava/util/concurrent/Executor;", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "providers", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "testIds", "", "", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;Ljava/util/List;)V", "additionalFeatures", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "getAdditionalFeatures", "()Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;", "setAdditionalFeatures", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$AdditionalFeatures;)V", "additionalParameters", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "getAdditionalParameters", "()Ljava/util/Map;", "setAdditionalParameters", "(Ljava/util/Map;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getExecutorService", "()Ljava/util/concurrent/Executor;", "setExecutorService", "(Ljava/util/concurrent/Executor;)V", "from", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "playlistRequestConfiguration", "Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "getPlaylistRequestConfiguration", "()Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;", "setPlaylistRequestConfiguration", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$PlaylistRequestConfiguration;)V", "getProviders", "()Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;", "setProviders", "(Lru/yandex/video/m3/player/tracking/config/DefaultStrmManagerConfig$InfoProviders;)V", "getScheduledExecutorService", "()Ljava/util/concurrent/ScheduledExecutorService;", "setScheduledExecutorService", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "getTestIds", "()Ljava/util/List;", "setTestIds", "(Ljava/util/List;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AdditionalFeatures additionalFeatures;
        private Map<String, ? extends Object> additionalParameters;
        private Context context;
        private Executor executorService;
        private String from;
        private OkHttpClient okHttpClient;
        private PlaylistRequestConfiguration playlistRequestConfiguration;
        private InfoProviders providers;
        private ScheduledExecutorService scheduledExecutorService;
        private List<String> testIds;

        public Builder(DefaultStrmManagerConfig defaultStrmManagerConfig) {
            this(defaultStrmManagerConfig.getContext(), defaultStrmManagerConfig.getOkHttpClient(), defaultStrmManagerConfig.getExecutorService(), defaultStrmManagerConfig.getScheduledExecutorService(), defaultStrmManagerConfig.getProviders(), defaultStrmManagerConfig.getTestIds());
            this.from = defaultStrmManagerConfig.getFrom();
            this.additionalParameters = defaultStrmManagerConfig.getAdditionalParameters();
            this.playlistRequestConfiguration = defaultStrmManagerConfig.getPlaylistRequestConfiguration();
            this.additionalFeatures = defaultStrmManagerConfig.getAdditionalFeatures();
        }

        public final DefaultStrmManagerConfig build$video_player_internalRelease() {
            Context context = this.context;
            OkHttpClient okHttpClient = this.okHttpClient;
            Executor executor = this.executorService;
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
            InfoProviders infoProviders = this.providers;
            List<String> list = this.testIds;
            String str = this.from;
            Map<String, ? extends Object> map = this.additionalParameters;
            PlaylistRequestConfiguration playlistRequestConfiguration = this.playlistRequestConfiguration;
            if (playlistRequestConfiguration == null) {
                playlistRequestConfiguration = Companion.PlaylistRequestConfiguration$default(DefaultStrmManagerConfig.INSTANCE, null, 1, null);
            }
            AdditionalFeatures additionalFeatures = this.additionalFeatures;
            if (additionalFeatures == null) {
                additionalFeatures = Companion.AdditionalFeatures$default(DefaultStrmManagerConfig.INSTANCE, null, 1, null);
            }
            return new DefaultStrmManagerConfig(context, okHttpClient, executor, scheduledExecutorService, infoProviders, list, str, map, playlistRequestConfiguration, additionalFeatures, null);
        }

        public final AdditionalFeatures getAdditionalFeatures() {
            return this.additionalFeatures;
        }

        public final Map<String, Object> getAdditionalParameters() {
            return this.additionalParameters;
        }

        public final Context getContext() {
            return this.context;
        }

        public final Executor getExecutorService() {
            return this.executorService;
        }

        public final String getFrom() {
            return this.from;
        }

        public final OkHttpClient getOkHttpClient() {
            return this.okHttpClient;
        }

        public final PlaylistRequestConfiguration getPlaylistRequestConfiguration() {
            return this.playlistRequestConfiguration;
        }

        public final InfoProviders getProviders() {
            return this.providers;
        }

        public final ScheduledExecutorService getScheduledExecutorService() {
            return this.scheduledExecutorService;
        }

        public final List<String> getTestIds() {
            return this.testIds;
        }

        public final void setAdditionalFeatures(AdditionalFeatures additionalFeatures) {
            this.additionalFeatures = additionalFeatures;
        }

        public final void setAdditionalParameters(Map<String, ? extends Object> map) {
            this.additionalParameters = map;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setExecutorService(Executor executor) {
            this.executorService = executor;
        }

        public final void setFrom(String str) {
            this.from = str;
        }

        public final void setOkHttpClient(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
        }

        public final void setPlaylistRequestConfiguration(PlaylistRequestConfiguration playlistRequestConfiguration) {
            this.playlistRequestConfiguration = playlistRequestConfiguration;
        }

        public final void setProviders(InfoProviders infoProviders) {
            this.providers = infoProviders;
        }

        public final void setScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
            this.scheduledExecutorService = scheduledExecutorService;
        }

        public final void setTestIds(List<String> list) {
            this.testIds = list;
        }

        public Builder(Context context, OkHttpClient okHttpClient, Executor executor, ScheduledExecutorService scheduledExecutorService, InfoProviders infoProviders, List<String> list) {
            this.context = context;
            this.okHttpClient = okHttpClient;
            this.executorService = executor;
            this.scheduledExecutorService = scheduledExecutorService;
            this.providers = infoProviders;
            this.testIds = list;
        }
    }
}
