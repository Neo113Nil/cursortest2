package ru.yandex.video.m3.player.impl.load_control;

import android.content.Context;
import androidx.media3.common.PriorityTaskManager;
import defpackage.az50;
import defpackage.bq6;
import defpackage.cq6;
import defpackage.d260;
import defpackage.f260;
import defpackage.fns0;
import defpackage.ic2;
import defpackage.jc2;
import defpackage.kd2;
import defpackage.pm5;
import defpackage.tcc;
import defpackage.tls;
import defpackage.we6;
import defpackage.x6e;
import defpackage.zy11;
import defpackage.zy50;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfig;
import ru.yandex.video.m3.model.config.loadcontrol.LoadControlConfigKt;
import ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycle;
import ru.yandex.video.m3.player.impl.load_control.provider.NetworkQualityProviderImpl;
import ru.yandex.video.m3.player.impl.load_control.provider.SkipsProvider;
import ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl;
import ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;
import ru.yandex.video.m3.player.utils.network.NetworkType;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0003!\"#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0011\u001a\u00028\u0000\"\b\b\u0000\u0010\u000f*\u00020\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/MultiplatformLoadControlFactory;", "Lru/yandex/video/m3/player/impl/load_control/LoadControlFactory;", "Landroid/content/Context;", "context", "Landroidx/media3/common/PriorityTaskManager;", "priorityTaskManager", "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", ConfigConstants.CONFIG, "<init>", "(Landroid/content/Context;Landroidx/media3/common/PriorityTaskManager;Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;)V", "Lzy11;", "resolveBufferByNetworkConfig", "()V", "resolveBufferSizeBySkips", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycle;", "T", "provider", "addProvider", "(Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycle;)Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycle;", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "create", "()Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "Landroid/content/Context;", "Landroidx/media3/common/PriorityTaskManager;", "Lru/yandex/video/m3/model/config/loadcontrol/LoadControlConfig;", "", "", "Lcq6;", "bufferGoalRules", "Ljava/util/Map;", "", "providers", "Ljava/util/List;", "Companion", "NetworkQualityProviderAdapter", "NetworkTypeProviderAdapter", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MultiplatformLoadControlFactory implements LoadControlFactory {
    private static final String BUFFER_PROVIDER_BY_CONSTANT = "BUFFER_PROVIDER_BY_CONSTANT";
    private static final String BUFFER_PROVIDER_BY_NETWORK = "BUFFER_PROVIDER_BY_NETWORK";
    private static final String BUFFER_PROVIDER_BY_SKIPS = "BUFFER_PROVIDER_BY_SKIPS";
    private final Map<String, cq6> bufferGoalRules;
    private final LoadControlConfig config;
    private final Context context;
    private final PriorityTaskManager priorityTaskManager;
    private final List<DependentLifecycle> providers;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/MultiplatformLoadControlFactory$NetworkQualityProviderAdapter;", "Lzy50;", "provider", "<init>", "(Lzy50;)V", "", "getGoodNetworkCounter", "()I", "", "isGoodNetwork", "()Z", "Lzy50;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkQualityProviderAdapter implements zy50 {
        public static final int $stable = 8;
        private final zy50 provider;

        public NetworkQualityProviderAdapter(zy50 zy50Var) {
            this.provider = zy50Var;
        }

        @Override // defpackage.zy50
        public int getGoodNetworkCounter() {
            return this.provider.getGoodNetworkCounter();
        }

        @Override // defpackage.zy50
        public boolean isGoodNetwork() {
            return this.provider.isGoodNetwork();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/MultiplatformLoadControlFactory$NetworkTypeProviderAdapter;", "Ld260;", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "provider", "<init>", "(Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;)V", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "type", "Lru/yandex/videoplayer/multiplatform/utils/network/NetworkType;", "mapNetworkType", "(Lru/yandex/video/m3/player/utils/network/NetworkType;)Lru/yandex/videoplayer/multiplatform/utils/network/NetworkType;", "getNetworkType", "()Lru/yandex/videoplayer/multiplatform/utils/network/NetworkType;", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkTypeProviderAdapter implements d260 {
        public static final int $stable = 8;
        private final NetworkTypeProvider provider;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NetworkType.values().length];
                try {
                    iArr[NetworkType.NETWORK_TYPE_UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_OFFLINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_WIFI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_2G.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_3G.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_4G.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_5G_SA.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_5G_NSA.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_CELLULAR_UNKNOWN.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_ETHERNET.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[NetworkType.NETWORK_TYPE_OTHER.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public NetworkTypeProviderAdapter(NetworkTypeProvider networkTypeProvider) {
            this.provider = networkTypeProvider;
        }

        private final ru.yandex.videoplayer.multiplatform.utils.network.NetworkType mapNetworkType(NetworkType type) {
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_UNKNOWN;
                case 2:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_OFFLINE;
                case 3:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_WIFI;
                case 4:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_2G;
                case 5:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_3G;
                case 6:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_4G;
                case 7:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_5G_SA;
                case 8:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_5G_NSA;
                case 9:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_CELLULAR_UNKNOWN;
                case 10:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_ETHERNET;
                case 11:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_OTHER;
                default:
                    return ru.yandex.videoplayer.multiplatform.utils.network.NetworkType.NETWORK_TYPE_UNKNOWN;
            }
        }

        @Override // defpackage.d260
        public ru.yandex.videoplayer.multiplatform.utils.network.NetworkType getNetworkType() {
            return mapNetworkType(this.provider.getNetworkType());
        }
    }

    public MultiplatformLoadControlFactory(Context context, PriorityTaskManager priorityTaskManager, LoadControlConfig loadControlConfig) {
        this.context = context;
        this.priorityTaskManager = priorityTaskManager;
        this.config = loadControlConfig;
        this.bufferGoalRules = b.l(new Pair(BUFFER_PROVIDER_BY_CONSTANT, new x6e(loadControlConfig.getMaxBufferMs() / 1000.0d)));
        this.providers = new ArrayList();
        resolveBufferSizeBySkips();
        resolveBufferByNetworkConfig();
    }

    private final <T extends DependentLifecycle> T addProvider(T provider) {
        this.providers.add(provider);
        return provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [az50] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    private final void resolveBufferByNetworkConfig() {
        if (this.config.getDynamicBufferConfig() == null) {
            return;
        }
        f260 f260Var = new f260(new NetworkTypeProviderAdapter(NetworkTypeProviderImpl.INSTANCE.getInstance(this.context)), this.config.getMaxBufferMs() / 1000.0d, this.config.getDynamicBufferConfig().getMaxBufferByNetworkType().getMaxBufferWifiMs() / 1000.0d, this.config.getDynamicBufferConfig().getMaxBufferByNetworkType().getMaxBufferCellularMs() / 1000.0d);
        if (this.config.getDynamicBufferConfig().getDynamicBufferParams() != null) {
            f260Var = new az50(f260Var, this.config.getDynamicBufferConfig().getDynamicBufferParams().getBufferFactorGoodNetwork(), new NetworkQualityProviderAdapter((NetworkQualityProviderImpl) addProvider(new NetworkQualityProviderImpl(this.config.getDynamicBufferConfig().getDynamicBufferParams(), null, 2, 0 == true ? 1 : 0))));
        }
        this.bufferGoalRules.put(BUFFER_PROVIDER_BY_NETWORK, f260Var);
        this.bufferGoalRules.put(BUFFER_PROVIDER_BY_CONSTANT, new x6e(Math.max(this.config.getDynamicBufferConfig().getMaxBufferByNetworkType().getMaxBufferCellularMs() / 1000.0d, this.config.getMaxBufferMs() / 1000.0d)));
    }

    private final void resolveBufferSizeBySkips() {
        if (this.config.getBufferSizeBySkips()) {
            final jc2 jc2Var = new jc2();
            this.bufferGoalRules.put(BUFFER_PROVIDER_BY_SKIPS, jc2Var);
            addProvider(new SkipsProvider(new tls() { // from class: ru.yandex.video.m3.player.impl.load_control.MultiplatformLoadControlFactory$resolveBufferSizeBySkips$1
                {
                    super(1);
                }

                public final void invoke(List<PlayerSkip> list) {
                    jc2 jc2Var2 = jc2.this;
                    List<PlayerSkip> list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new fns0(r1.getStartTimeMs() / 1000.0d, r1.getEndTimeMs() / 1000.0d, ((PlayerSkip) it.next()).getAutoSkip()));
                    }
                    Object[] objArr = (fns0[]) arrayList.toArray(new fns0[0]);
                    jc2Var2.getClass();
                    ic2 ic2Var = new ic2();
                    if (objArr.length != 0) {
                        objArr = Arrays.copyOf(objArr, objArr.length);
                        if (objArr.length > 1) {
                            Arrays.sort(objArr, ic2Var);
                        }
                    }
                    jc2Var2.a = a.J0(Arrays.asList(objArr));
                }

                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((List<PlayerSkip>) obj);
                    return zy11.a;
                }
            }));
        }
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.LoadControlFactory
    public YandexLoadControl create() {
        int i = 11;
        return new MemoryDependsLoadControl(this.config.getBufferForPlaybackMs(), this.config.getBufferForPlaybackAfterRebufferMs(), new BufferGoalManagerAdapter(new bq6(new pm5(8, new we6[]{new we6(0, (cq6[]) this.bufferGoalRules.values().toArray(new cq6[0]), i), new we6(100, new cq6[]{new kd2(0)}, i)})), this.providers, null, null, 12, null), this.config.getMaxBufferBytes(), this.priorityTaskManager, this.config.getMemoryRatio(), this.config.getBackBufferDurationMs(), this.config.getRetainBackBufferFromKeyframe(), null, null, 768, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/MultiplatformLoadControlFactory$Companion;", "", "()V", MultiplatformLoadControlFactory.BUFFER_PROVIDER_BY_CONSTANT, "", MultiplatformLoadControlFactory.BUFFER_PROVIDER_BY_NETWORK, MultiplatformLoadControlFactory.BUFFER_PROVIDER_BY_SKIPS, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultiplatformLoadControlFactory(Context context, PriorityTaskManager priorityTaskManager, LoadControlConfig loadControlConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : priorityTaskManager, (i & 4) != 0 ? LoadControlConfigKt.LoadControlConfig$default(null, 1, null) : loadControlConfig);
    }
}
