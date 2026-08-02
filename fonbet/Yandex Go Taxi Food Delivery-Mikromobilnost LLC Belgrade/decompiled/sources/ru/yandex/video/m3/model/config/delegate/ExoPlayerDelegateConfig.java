package ru.yandex.video.m3.model.config.delegate;

import androidx.media3.common.PriorityTaskManager;
import defpackage.b64;
import defpackage.jl40;
import defpackage.tls;
import defpackage.yd10;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.delegate.ExoPlayerDelegateConfig;
import ru.yandex.video.m3.player.live.LiveSpeedControlObserver;
import ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider;
import ru.yandex.video.m3.preload.PreloadPrioritySettings;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001:\u0001KBy\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00002\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010I\u001a\u0004\bJ\u0010'¨\u0006L"}, d2 = {"Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;", "", "Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "audioDelegateConfig", "Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;", "drmConfig", "Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;", "supplementalDelegateProperties", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "initialBandwidthValueProvider", "Landroidx/media3/common/PriorityTaskManager;", "priorityTaskManager", "Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "preloadPrioritySettings", "Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "liveSpeedControlObserver", "Lyd10;", "liveConfigurationOverride", "", "useBandwidthLastValueProvider", "enableOutputSurfaceWorkaround", "", "maxRecoverAttempts", "", "recoverType", "<init>", "(Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;Landroidx/media3/common/PriorityTaskManager;Lru/yandex/video/m3/preload/PreloadPrioritySettings;Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;Lyd10;ZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "getAudioDelegateConfig", "()Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;", "getDrmConfig", "()Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;", "Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;", "getSupplementalDelegateProperties", "()Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "getInitialBandwidthValueProvider", "()Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "Landroidx/media3/common/PriorityTaskManager;", "getPriorityTaskManager", "()Landroidx/media3/common/PriorityTaskManager;", "Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "getPreloadPrioritySettings", "()Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "getLiveSpeedControlObserver", "()Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "Lyd10;", "getLiveConfigurationOverride", "()Lyd10;", "Z", "getUseBandwidthLastValueProvider", "()Z", "Ljava/lang/Boolean;", "getEnableOutputSurfaceWorkaround$video_player_internalRelease", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "getMaxRecoverAttempts$video_player_internalRelease", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getRecoverType$video_player_internalRelease", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoPlayerDelegateConfig {
    public static final int $stable = 8;
    private final AudioDelegateConfig audioDelegateConfig;
    private final DrmDelegateConfig drmConfig;
    private final Boolean enableOutputSurfaceWorkaround;
    private final InitialBandwidthValueProvider initialBandwidthValueProvider;
    private final yd10 liveConfigurationOverride;
    private final LiveSpeedControlObserver liveSpeedControlObserver;
    private final Integer maxRecoverAttempts;
    private final PreloadPrioritySettings preloadPrioritySettings;
    private final PriorityTaskManager priorityTaskManager;
    private final String recoverType;
    private final SupplementalDelegateProperties supplementalDelegateProperties;
    private final boolean useBandwidthLastValueProvider;

    private ExoPlayerDelegateConfig(AudioDelegateConfig audioDelegateConfig, DrmDelegateConfig drmDelegateConfig, SupplementalDelegateProperties supplementalDelegateProperties, InitialBandwidthValueProvider initialBandwidthValueProvider, PriorityTaskManager priorityTaskManager, PreloadPrioritySettings preloadPrioritySettings, LiveSpeedControlObserver liveSpeedControlObserver, yd10 yd10Var, boolean z, Boolean bool, Integer num, String str) {
        this.audioDelegateConfig = audioDelegateConfig;
        this.drmConfig = drmDelegateConfig;
        this.supplementalDelegateProperties = supplementalDelegateProperties;
        this.initialBandwidthValueProvider = initialBandwidthValueProvider;
        this.priorityTaskManager = priorityTaskManager;
        this.preloadPrioritySettings = preloadPrioritySettings;
        this.liveSpeedControlObserver = liveSpeedControlObserver;
        this.liveConfigurationOverride = yd10Var;
        this.useBandwidthLastValueProvider = z;
        this.enableOutputSurfaceWorkaround = bool;
        this.maxRecoverAttempts = num;
        this.recoverType = str;
    }

    public static /* synthetic */ ExoPlayerDelegateConfig copy$default(ExoPlayerDelegateConfig exoPlayerDelegateConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.delegate.ExoPlayerDelegateConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ExoPlayerDelegateConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(ExoPlayerDelegateConfig.Builder builder) {
                }
            };
        }
        return exoPlayerDelegateConfig.copy(tlsVar);
    }

    public final ExoPlayerDelegateConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!ExoPlayerDelegateConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        ExoPlayerDelegateConfig exoPlayerDelegateConfig = (ExoPlayerDelegateConfig) other;
        return this.useBandwidthLastValueProvider == exoPlayerDelegateConfig.useBandwidthLastValueProvider && jl40.l(this.enableOutputSurfaceWorkaround, exoPlayerDelegateConfig.enableOutputSurfaceWorkaround) && jl40.l(this.maxRecoverAttempts, exoPlayerDelegateConfig.maxRecoverAttempts) && jl40.l(this.audioDelegateConfig, exoPlayerDelegateConfig.audioDelegateConfig) && jl40.l(this.drmConfig, exoPlayerDelegateConfig.drmConfig) && jl40.l(this.supplementalDelegateProperties, exoPlayerDelegateConfig.supplementalDelegateProperties) && jl40.l(this.initialBandwidthValueProvider, exoPlayerDelegateConfig.initialBandwidthValueProvider) && jl40.l(this.priorityTaskManager, exoPlayerDelegateConfig.priorityTaskManager) && jl40.l(this.preloadPrioritySettings, exoPlayerDelegateConfig.preloadPrioritySettings) && jl40.l(this.liveSpeedControlObserver, exoPlayerDelegateConfig.liveSpeedControlObserver) && jl40.l(this.liveConfigurationOverride, exoPlayerDelegateConfig.liveConfigurationOverride) && jl40.l(this.recoverType, exoPlayerDelegateConfig.recoverType);
    }

    public final AudioDelegateConfig getAudioDelegateConfig() {
        return this.audioDelegateConfig;
    }

    public final DrmDelegateConfig getDrmConfig() {
        return this.drmConfig;
    }

    /* renamed from: getEnableOutputSurfaceWorkaround$video_player_internalRelease, reason: from getter */
    public final Boolean getEnableOutputSurfaceWorkaround() {
        return this.enableOutputSurfaceWorkaround;
    }

    public final InitialBandwidthValueProvider getInitialBandwidthValueProvider() {
        return this.initialBandwidthValueProvider;
    }

    public final yd10 getLiveConfigurationOverride() {
        return this.liveConfigurationOverride;
    }

    public final LiveSpeedControlObserver getLiveSpeedControlObserver() {
        return this.liveSpeedControlObserver;
    }

    /* renamed from: getMaxRecoverAttempts$video_player_internalRelease, reason: from getter */
    public final Integer getMaxRecoverAttempts() {
        return this.maxRecoverAttempts;
    }

    public final PreloadPrioritySettings getPreloadPrioritySettings() {
        return this.preloadPrioritySettings;
    }

    public final PriorityTaskManager getPriorityTaskManager() {
        return this.priorityTaskManager;
    }

    /* renamed from: getRecoverType$video_player_internalRelease, reason: from getter */
    public final String getRecoverType() {
        return this.recoverType;
    }

    public final SupplementalDelegateProperties getSupplementalDelegateProperties() {
        return this.supplementalDelegateProperties;
    }

    public final boolean getUseBandwidthLastValueProvider() {
        return this.useBandwidthLastValueProvider;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.useBandwidthLastValueProvider) * 31;
        Boolean bool = this.enableOutputSurfaceWorkaround;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.maxRecoverAttempts;
        int hashCode3 = (this.supplementalDelegateProperties.hashCode() + ((this.drmConfig.hashCode() + ((this.audioDelegateConfig.hashCode() + ((hashCode2 + (num != null ? num.intValue() : 0)) * 31)) * 31)) * 31)) * 31;
        InitialBandwidthValueProvider initialBandwidthValueProvider = this.initialBandwidthValueProvider;
        int hashCode4 = (hashCode3 + (initialBandwidthValueProvider != null ? initialBandwidthValueProvider.hashCode() : 0)) * 31;
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        int hashCode5 = (hashCode4 + (priorityTaskManager != null ? priorityTaskManager.hashCode() : 0)) * 31;
        PreloadPrioritySettings preloadPrioritySettings = this.preloadPrioritySettings;
        int hashCode6 = (hashCode5 + (preloadPrioritySettings != null ? preloadPrioritySettings.hashCode() : 0)) * 31;
        LiveSpeedControlObserver liveSpeedControlObserver = this.liveSpeedControlObserver;
        int hashCode7 = (hashCode6 + (liveSpeedControlObserver != null ? liveSpeedControlObserver.hashCode() : 0)) * 31;
        yd10 yd10Var = this.liveConfigurationOverride;
        int hashCode8 = (hashCode7 + (yd10Var != null ? yd10Var.hashCode() : 0)) * 31;
        String str = this.recoverType;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExoPlayerDelegateConfig(audioDelegateConfig=");
        sb.append(this.audioDelegateConfig);
        sb.append(", drmConfig=");
        sb.append(this.drmConfig);
        sb.append(", supplementalDelegateProperties=");
        sb.append(this.supplementalDelegateProperties);
        sb.append(", initialBandwidthValueProvider=");
        sb.append(this.initialBandwidthValueProvider);
        sb.append(", priorityTaskManager=");
        sb.append(this.priorityTaskManager);
        sb.append(", preloadPrioritySettings=");
        sb.append(this.preloadPrioritySettings);
        sb.append(", liveSpeedControlObserver=");
        sb.append(this.liveSpeedControlObserver);
        sb.append(", liveConfigurationOverride=");
        sb.append(this.liveConfigurationOverride);
        sb.append(", useBandwidthLastValueProvider=");
        sb.append(this.useBandwidthLastValueProvider);
        sb.append(", enableOutputSurfaceWorkaround=");
        sb.append(this.enableOutputSurfaceWorkaround);
        sb.append(", maxRecoverAttempts=");
        sb.append(this.maxRecoverAttempts);
        sb.append(", recoverType=");
        return b64.p(sb, this.recoverType, ')');
    }

    public /* synthetic */ ExoPlayerDelegateConfig(AudioDelegateConfig audioDelegateConfig, DrmDelegateConfig drmDelegateConfig, SupplementalDelegateProperties supplementalDelegateProperties, InitialBandwidthValueProvider initialBandwidthValueProvider, PriorityTaskManager priorityTaskManager, PreloadPrioritySettings preloadPrioritySettings, LiveSpeedControlObserver liveSpeedControlObserver, yd10 yd10Var, boolean z, Boolean bool, Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioDelegateConfig, drmDelegateConfig, supplementalDelegateProperties, initialBandwidthValueProvider, priorityTaskManager, preloadPrioritySettings, liveSpeedControlObserver, yd10Var, z, bool, num, str);
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010C\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010I\u001a\u0004\u0018\u00010B8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010M\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006Z"}, d2 = {"Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig$Builder;", "", "<init>", "()V", "Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;", ConfigConstants.CONFIG, "(Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;)V", "build$video_player_internalRelease", "()Lru/yandex/video/m3/model/config/delegate/ExoPlayerDelegateConfig;", "build", "Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "audioDelegateConfig", "Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "getAudioDelegateConfig", "()Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "setAudioDelegateConfig", "(Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;)V", "Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;", "drmConfig", "Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;", "getDrmConfig", "()Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;", "setDrmConfig", "(Lru/yandex/video/m3/model/config/delegate/DrmDelegateConfig;)V", "Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;", "supplementalDelegateProperties", "Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;", "getSupplementalDelegateProperties", "()Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;", "setSupplementalDelegateProperties", "(Lru/yandex/video/m3/model/config/delegate/SupplementalDelegateProperties;)V", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "initialBandwidthValueProvider", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "getInitialBandwidthValueProvider", "()Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "setInitialBandwidthValueProvider", "(Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;)V", "Landroidx/media3/common/PriorityTaskManager;", "priorityTaskManager", "Landroidx/media3/common/PriorityTaskManager;", "getPriorityTaskManager", "()Landroidx/media3/common/PriorityTaskManager;", "setPriorityTaskManager", "(Landroidx/media3/common/PriorityTaskManager;)V", "Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "preloadPrioritySettings", "Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "getPreloadPrioritySettings", "()Lru/yandex/video/m3/preload/PreloadPrioritySettings;", "setPreloadPrioritySettings", "(Lru/yandex/video/m3/preload/PreloadPrioritySettings;)V", "Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "liveSpeedControlObserver", "Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "getLiveSpeedControlObserver", "()Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "setLiveSpeedControlObserver", "(Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;)V", "Lyd10;", "liveConfigurationOverride", "Lyd10;", "getLiveConfigurationOverride", "()Lyd10;", "setLiveConfigurationOverride", "(Lyd10;)V", "", "useBandwidthLastValueProvider", "Ljava/lang/Boolean;", "getUseBandwidthLastValueProvider", "()Ljava/lang/Boolean;", "setUseBandwidthLastValueProvider", "(Ljava/lang/Boolean;)V", "enableOutputSurfaceWorkaround", "getEnableOutputSurfaceWorkaround", "setEnableOutputSurfaceWorkaround", "", "maxRecoverAttempts", "Ljava/lang/Integer;", "getMaxRecoverAttempts", "()Ljava/lang/Integer;", "setMaxRecoverAttempts", "(Ljava/lang/Integer;)V", "", "recoverType", "Ljava/lang/String;", "getRecoverType", "()Ljava/lang/String;", "setRecoverType", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AudioDelegateConfig audioDelegateConfig;
        private DrmDelegateConfig drmConfig;
        private Boolean enableOutputSurfaceWorkaround;
        private InitialBandwidthValueProvider initialBandwidthValueProvider;
        private yd10 liveConfigurationOverride;
        private LiveSpeedControlObserver liveSpeedControlObserver;
        private Integer maxRecoverAttempts;
        private PreloadPrioritySettings preloadPrioritySettings;
        private PriorityTaskManager priorityTaskManager;
        private String recoverType;
        private SupplementalDelegateProperties supplementalDelegateProperties;
        private Boolean useBandwidthLastValueProvider;

        public Builder(ExoPlayerDelegateConfig exoPlayerDelegateConfig) {
            this();
            this.audioDelegateConfig = exoPlayerDelegateConfig.getAudioDelegateConfig();
            this.drmConfig = exoPlayerDelegateConfig.getDrmConfig();
            this.supplementalDelegateProperties = exoPlayerDelegateConfig.getSupplementalDelegateProperties();
            this.initialBandwidthValueProvider = exoPlayerDelegateConfig.getInitialBandwidthValueProvider();
            this.priorityTaskManager = exoPlayerDelegateConfig.getPriorityTaskManager();
            this.preloadPrioritySettings = exoPlayerDelegateConfig.getPreloadPrioritySettings();
            this.liveSpeedControlObserver = exoPlayerDelegateConfig.getLiveSpeedControlObserver();
            this.liveConfigurationOverride = exoPlayerDelegateConfig.getLiveConfigurationOverride();
            this.useBandwidthLastValueProvider = Boolean.valueOf(exoPlayerDelegateConfig.getUseBandwidthLastValueProvider());
            this.enableOutputSurfaceWorkaround = exoPlayerDelegateConfig.getEnableOutputSurfaceWorkaround();
            this.maxRecoverAttempts = exoPlayerDelegateConfig.getMaxRecoverAttempts();
            this.recoverType = exoPlayerDelegateConfig.getRecoverType();
        }

        public final ExoPlayerDelegateConfig build$video_player_internalRelease() {
            AudioDelegateConfig audioDelegateConfig = this.audioDelegateConfig;
            if (audioDelegateConfig == null) {
                audioDelegateConfig = AudioDelegateConfigKt.AudioDelegateConfig$default(null, 1, null);
            }
            DrmDelegateConfig drmDelegateConfig = this.drmConfig;
            if (drmDelegateConfig == null) {
                drmDelegateConfig = DrmDelegateConfigKt.DrmDelegateConfig$default(null, 1, null);
            }
            SupplementalDelegateProperties supplementalDelegateProperties = this.supplementalDelegateProperties;
            if (supplementalDelegateProperties == null) {
                supplementalDelegateProperties = SupplementalDelegatePropertiesKt.SupplementalDelegateProperties$default(null, 1, null);
            }
            DrmDelegateConfig drmDelegateConfig2 = drmDelegateConfig;
            SupplementalDelegateProperties supplementalDelegateProperties2 = supplementalDelegateProperties;
            InitialBandwidthValueProvider initialBandwidthValueProvider = this.initialBandwidthValueProvider;
            PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
            PreloadPrioritySettings preloadPrioritySettings = this.preloadPrioritySettings;
            LiveSpeedControlObserver liveSpeedControlObserver = this.liveSpeedControlObserver;
            yd10 yd10Var = this.liveConfigurationOverride;
            Boolean bool = this.useBandwidthLastValueProvider;
            return new ExoPlayerDelegateConfig(audioDelegateConfig, drmDelegateConfig2, supplementalDelegateProperties2, initialBandwidthValueProvider, priorityTaskManager, preloadPrioritySettings, liveSpeedControlObserver, yd10Var, bool != null ? bool.booleanValue() : false, this.enableOutputSurfaceWorkaround, this.maxRecoverAttempts, this.recoverType, null);
        }

        public final AudioDelegateConfig getAudioDelegateConfig() {
            return this.audioDelegateConfig;
        }

        public final DrmDelegateConfig getDrmConfig() {
            return this.drmConfig;
        }

        public final Boolean getEnableOutputSurfaceWorkaround() {
            return this.enableOutputSurfaceWorkaround;
        }

        public final InitialBandwidthValueProvider getInitialBandwidthValueProvider() {
            return this.initialBandwidthValueProvider;
        }

        public final yd10 getLiveConfigurationOverride() {
            return this.liveConfigurationOverride;
        }

        public final LiveSpeedControlObserver getLiveSpeedControlObserver() {
            return this.liveSpeedControlObserver;
        }

        public final Integer getMaxRecoverAttempts() {
            return this.maxRecoverAttempts;
        }

        public final PreloadPrioritySettings getPreloadPrioritySettings() {
            return this.preloadPrioritySettings;
        }

        public final PriorityTaskManager getPriorityTaskManager() {
            return this.priorityTaskManager;
        }

        public final String getRecoverType() {
            return this.recoverType;
        }

        public final SupplementalDelegateProperties getSupplementalDelegateProperties() {
            return this.supplementalDelegateProperties;
        }

        public final Boolean getUseBandwidthLastValueProvider() {
            return this.useBandwidthLastValueProvider;
        }

        public final void setAudioDelegateConfig(AudioDelegateConfig audioDelegateConfig) {
            this.audioDelegateConfig = audioDelegateConfig;
        }

        public final void setDrmConfig(DrmDelegateConfig drmDelegateConfig) {
            this.drmConfig = drmDelegateConfig;
        }

        public final void setEnableOutputSurfaceWorkaround(Boolean bool) {
            this.enableOutputSurfaceWorkaround = bool;
        }

        public final void setInitialBandwidthValueProvider(InitialBandwidthValueProvider initialBandwidthValueProvider) {
            this.initialBandwidthValueProvider = initialBandwidthValueProvider;
        }

        public final void setLiveConfigurationOverride(yd10 yd10Var) {
            this.liveConfigurationOverride = yd10Var;
        }

        public final void setLiveSpeedControlObserver(LiveSpeedControlObserver liveSpeedControlObserver) {
            this.liveSpeedControlObserver = liveSpeedControlObserver;
        }

        public final void setMaxRecoverAttempts(Integer num) {
            this.maxRecoverAttempts = num;
        }

        public final void setPreloadPrioritySettings(PreloadPrioritySettings preloadPrioritySettings) {
            this.preloadPrioritySettings = preloadPrioritySettings;
        }

        public final void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
            this.priorityTaskManager = priorityTaskManager;
        }

        public final void setRecoverType(String str) {
            this.recoverType = str;
        }

        public final void setSupplementalDelegateProperties(SupplementalDelegateProperties supplementalDelegateProperties) {
            this.supplementalDelegateProperties = supplementalDelegateProperties;
        }

        public final void setUseBandwidthLastValueProvider(Boolean bool) {
            this.useBandwidthLastValueProvider = bool;
        }

        public Builder() {
        }
    }
}
