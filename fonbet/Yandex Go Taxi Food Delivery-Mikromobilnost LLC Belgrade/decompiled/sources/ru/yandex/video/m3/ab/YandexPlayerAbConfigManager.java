package ru.yandex.video.m3.ab;

import android.content.Context;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rol0;
import defpackage.sbx;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.r0;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.ab.YandexPlayerAbConfigManager;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.ab.config.UtilKt;
import ru.yandex.video.m3.ab.database.impl.AbConfigDatabaseImpl;
import ru.yandex.video.m3.ab.interactor.AbConfigInteractor;
import ru.yandex.video.m3.ab.interactor.SimpleInteractor;
import ru.yandex.video.m3.ab.internal.SticknessHolder;
import ru.yandex.video.m3.ab.internal.VpuidHolder;
import ru.yandex.video.m3.ab.internal.testing.TestingParameters;
import ru.yandex.video.m3.ab.repository.impl.ReadOnlyAbConfigRepositoryImpl;
import ru.yandex.video.m3.ab.util.VsidToAbConfigHolder;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.crashmanager.CrashManager;
import ru.yandex.video.m3.player.crashmanager.CrashManagerImpl;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 :2\u00020\u0001:\u0003;:<B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010)\u001a\u00020\u00112\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001e038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020*038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, d2 = {"Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager;", "", "", Constants.KEY_SERVICE, "Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;", "initialInteractor", "Ltpr;", "interactorSupplier", "Ltse;", "scope", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;Ltpr;Ltse;)V", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/crashmanager/CrashManager;", "maybeRegisterCrashManager", "(Landroid/content/Context;)Lru/yandex/video/m3/player/crashmanager/CrashManager;", "Lzy11;", "initDeferredInteractorInitialization", "(Ltpr;)V", "initListenersNotifications", "()V", "Lru/yandex/video/m3/ab/config/AbConfig;", "abConfig", "maybeUpdatePublishedAbConfig", "(Lru/yandex/video/m3/ab/config/AbConfig;)V", "handlePlayerLifecycleUpdate", "", "canStartConfigUpdates", "()Z", "Lru/yandex/video/m3/ab/PlayerLifecycleObserver;", "createPlayerLifecycleObserver", "()Lru/yandex/video/m3/ab/PlayerLifecycleObserver;", "vsid", "getConfig$video_player_internalRelease", "(Ljava/lang/String;)Lru/yandex/video/m3/ab/config/AbConfig;", "getConfig", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "onPlayerCreated$video_player_internalRelease", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "onPlayerCreated", "Lru/yandex/video/m3/ab/YandexPlayerAbConfigUpdateListener;", "listener", "addAbConfigUpdateListener$video_player_internalRelease", "(Lru/yandex/video/m3/ab/YandexPlayerAbConfigUpdateListener;)V", "addAbConfigUpdateListener", "Ljava/lang/String;", "Ltse;", "interactor", "Lru/yandex/video/m3/ab/interactor/AbConfigInteractor;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "playerObservers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "abConfigUpdatesListeners", "Lpz40;", "actualPublishedAbConfig", "Lpz40;", "Companion", "Builder", "InitializationParameters", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class YandexPlayerAbConfigManager {
    private static volatile YandexPlayerAbConfigManager INSTANCE;
    private final CopyOnWriteArraySet<YandexPlayerAbConfigUpdateListener> abConfigUpdatesListeners;
    private final pz40 actualPublishedAbConfig;
    private AbConfigInteractor interactor;
    private final CopyOnWriteArraySet<PlayerLifecycleObserver> playerObservers;
    private final tse scope;
    private final String service;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001BF\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000b\u0010\t\u001a\u00070\u0007¢\u0006\u0002\b\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u00070\u0007¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$InitializationParameters;", "", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", "okHttpClientProvider", "", "Lru/yandex/video/m3/ab/UpdateAbConfigStrategy;", "updateAbConfigStrategy", "", "deviceId", "", "abConfigUpdatePollingMs", "Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", "testingParameters", "<init>", "(Landroid/content/Context;Lsls;ILjava/lang/String;JLru/yandex/video/m3/ab/internal/testing/TestingParameters;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lsls;", "getOkHttpClientProvider", "()Lsls;", CA20Status.STATUS_USER_I, "getUpdateAbConfigStrategy", "()I", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "J", "getAbConfigUpdatePollingMs", "()J", "Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", "getTestingParameters", "()Lru/yandex/video/m3/ab/internal/testing/TestingParameters;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InitializationParameters {
        public static final int $stable = 8;
        private final long abConfigUpdatePollingMs;
        private final Context context;
        private final String deviceId;
        private final sls okHttpClientProvider;
        private final TestingParameters testingParameters;
        private final int updateAbConfigStrategy;

        public InitializationParameters(Context context, sls slsVar, int i, String str, long j, TestingParameters testingParameters) {
            this.context = context;
            this.okHttpClientProvider = slsVar;
            this.updateAbConfigStrategy = i;
            this.deviceId = str;
            this.abConfigUpdatePollingMs = j;
            this.testingParameters = testingParameters;
        }

        public final long getAbConfigUpdatePollingMs() {
            return this.abConfigUpdatePollingMs;
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final sls getOkHttpClientProvider() {
            return this.okHttpClientProvider;
        }

        public final TestingParameters getTestingParameters() {
            return this.testingParameters;
        }

        public final int getUpdateAbConfigStrategy() {
            return this.updateAbConfigStrategy;
        }
    }

    private YandexPlayerAbConfigManager(String str, AbConfigInteractor abConfigInteractor, tpr tprVar, tse tseVar) {
        this.service = str;
        this.scope = tseVar;
        this.interactor = abConfigInteractor;
        this.playerObservers = new CopyOnWriteArraySet<>();
        this.abConfigUpdatesListeners = new CopyOnWriteArraySet<>();
        this.actualPublishedAbConfig = bvf0.c(null);
        initDeferredInteractorInitialization(tprVar);
        initListenersNotifications();
    }

    private final boolean canStartConfigUpdates() {
        Object obj;
        Iterator<T> it = this.playerObservers.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) ((PlayerLifecycleObserver) obj).getIsAliveFlow().getValue()).booleanValue()) {
                break;
            }
        }
        return obj != null;
    }

    private final PlayerLifecycleObserver createPlayerLifecycleObserver() {
        return new PlayerLifecycleObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePlayerLifecycleUpdate() {
        boolean canStartConfigUpdates = canStartConfigUpdates();
        AbConfigInteractor abConfigInteractor = this.interactor;
        if (canStartConfigUpdates) {
            abConfigInteractor.startUpdates$video_player_internalRelease();
        } else {
            abConfigInteractor.stopUpdates$video_player_internalRelease();
        }
    }

    private final void initDeferredInteractorInitialization(tpr interactorSupplier) {
        tje.N(this.scope, null, null, new YandexPlayerAbConfigManager$initDeferredInteractorInitialization$1(interactorSupplier, this, null), 3);
    }

    private final void initListenersNotifications() {
        tje.N(this.scope, null, null, new YandexPlayerAbConfigManager$initListenersNotifications$1(this, null), 3);
    }

    private final CrashManager maybeRegisterCrashManager(Context context) {
        CrashManager companion = CrashManagerImpl.INSTANCE.getInstance(context);
        CrashManager.registerCrashManager$default(companion, context, null, 2, null);
        return companion;
    }

    private final void maybeUpdatePublishedAbConfig(AbConfig abConfig) {
        r0 r0Var;
        Object value;
        AbConfig abConfig2;
        pz40 pz40Var = this.actualPublishedAbConfig;
        do {
            r0Var = (r0) pz40Var;
            value = r0Var.getValue();
            abConfig2 = (AbConfig) value;
            if (!jl40.l(abConfig2, abConfig)) {
                abConfig2 = abConfig;
            }
        } while (!r0Var.k(value, abConfig2));
    }

    public final void addAbConfigUpdateListener$video_player_internalRelease(YandexPlayerAbConfigUpdateListener listener) {
        AbConfig abConfig = (AbConfig) ((r0) this.actualPublishedAbConfig).getValue();
        if (abConfig != null) {
            listener.onAbConfigUpdated(abConfig.getTestIds());
        }
        this.abConfigUpdatesListeners.add(listener);
    }

    public final AbConfig getConfig$video_player_internalRelease(String vsid) {
        Object failure;
        try {
            failure = UtilKt.toPublic(this.interactor.getConfig$video_player_internalRelease(vsid), this.service);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object dEFAULT$video_player_internalRelease = AbConfig.INSTANCE.getDEFAULT$video_player_internalRelease();
        if (failure instanceof Result.Failure) {
            failure = dEFAULT$video_player_internalRelease;
        }
        AbConfig abConfig = (AbConfig) failure;
        tje.N(this.scope, null, null, new YandexPlayerAbConfigManager$getConfig$abConfig$2$1(vsid, abConfig, null), 3);
        maybeUpdatePublishedAbConfig(abConfig);
        return abConfig;
    }

    public final void onPlayerCreated$video_player_internalRelease(YandexPlayer<?> player) {
        PlayerLifecycleObserver createPlayerLifecycleObserver = createPlayerLifecycleObserver();
        tse tseVar = this.scope;
        tje.N(tseVar, null, null, new YandexPlayerAbConfigManager$onPlayerCreated$1$1(createPlayerLifecycleObserver, this, null), 3);
        tje.N(tseVar, null, null, new YandexPlayerAbConfigManager$onPlayerCreated$1$2(createPlayerLifecycleObserver, player, this, null), 3);
        this.playerObservers.add(createPlayerLifecycleObserver);
        player.addObserver(createPlayerLifecycleObserver);
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR)\u0010\u001e\u001a\t\u0018\u00010\u001c¢\u0006\u0002\b\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u0010,\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010,\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010,\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$InitializationParameters;", "build$video_player_internalRelease", "()Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$InitializationParameters;", "build", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lkotlin/Function0;", "okHttpClientProvider", "Lsls;", "getOkHttpClientProvider", "()Lsls;", "setOkHttpClientProvider", "(Lsls;)V", "", "Lru/yandex/video/m3/ab/UpdateAbConfigStrategy;", "updateAbConfigStrategy", "Ljava/lang/Integer;", "getUpdateAbConfigStrategy", "()Ljava/lang/Integer;", "setUpdateAbConfigStrategy", "(Ljava/lang/Integer;)V", "", "deviceId", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getDeviceId$annotations", "()V", "", "abConfigUpdatePollingMs", "Ljava/lang/Long;", "getAbConfigUpdatePollingMs", "()Ljava/lang/Long;", "setAbConfigUpdatePollingMs", "(Ljava/lang/Long;)V", "getAbConfigUpdatePollingMs$annotations", "Lru/yandex/video/m3/ab/internal/VpuidHolder;", "vpuidHolder", "Lru/yandex/video/m3/ab/internal/VpuidHolder;", "getVpuidHolder", "()Lru/yandex/video/m3/ab/internal/VpuidHolder;", "setVpuidHolder", "(Lru/yandex/video/m3/ab/internal/VpuidHolder;)V", "getVpuidHolder$annotations", "Lru/yandex/video/m3/ab/internal/SticknessHolder;", "sticknessHolder", "Lru/yandex/video/m3/ab/internal/SticknessHolder;", "getSticknessHolder", "()Lru/yandex/video/m3/ab/internal/SticknessHolder;", "setSticknessHolder", "(Lru/yandex/video/m3/ab/internal/SticknessHolder;)V", "getSticknessHolder$annotations", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private static final long DEFAULT_UPDATE_TIMEOUT = 420000;
        private Long abConfigUpdatePollingMs;
        private Context context;
        private String deviceId;
        private OkHttpClient okHttpClient;
        private sls okHttpClientProvider;
        private SticknessHolder sticknessHolder;
        private Integer updateAbConfigStrategy;
        private VpuidHolder vpuidHolder;
        private static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public Builder(Context context) {
            this.context = context;
        }

        public static /* synthetic */ void getAbConfigUpdatePollingMs$annotations() {
        }

        public static /* synthetic */ void getDeviceId$annotations() {
        }

        public static /* synthetic */ void getSticknessHolder$annotations() {
        }

        public static /* synthetic */ void getVpuidHolder$annotations() {
        }

        public final InitializationParameters build$video_player_internalRelease() {
            sls slsVar = this.okHttpClientProvider;
            final OkHttpClient okHttpClient = this.okHttpClient;
            if (slsVar == null) {
                slsVar = okHttpClient != null ? new sls() { // from class: ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$Builder$build$okHttpClientProvider$1
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final OkHttpClient invoke() {
                        return OkHttpClient.this;
                    }
                } : new sls() { // from class: ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$Builder$build$okHttpClientProvider$2
                    @Override // defpackage.sls
                    public final OkHttpClient invoke() {
                        return new OkHttpClient();
                    }
                };
            }
            sls slsVar2 = slsVar;
            Integer num = this.updateAbConfigStrategy;
            int i = 1;
            if ((num == null || num.intValue() != 1) && this.deviceId == null) {
                i = 0;
            }
            return new InitializationParameters(this.context.getApplicationContext(), slsVar2, i, this.deviceId, DEFAULT_UPDATE_TIMEOUT, TestingParameters.INSTANCE);
        }

        public final Long getAbConfigUpdatePollingMs() {
            return this.abConfigUpdatePollingMs;
        }

        public final Context getContext() {
            return this.context;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final OkHttpClient getOkHttpClient() {
            return this.okHttpClient;
        }

        public final sls getOkHttpClientProvider() {
            return this.okHttpClientProvider;
        }

        public final SticknessHolder getSticknessHolder() {
            return this.sticknessHolder;
        }

        public final Integer getUpdateAbConfigStrategy() {
            return this.updateAbConfigStrategy;
        }

        public final VpuidHolder getVpuidHolder() {
            return this.vpuidHolder;
        }

        public final void setAbConfigUpdatePollingMs(Long l) {
            this.abConfigUpdatePollingMs = l;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setDeviceId(String str) {
            this.deviceId = str;
        }

        public final void setOkHttpClient(OkHttpClient okHttpClient) {
            this.okHttpClient = okHttpClient;
        }

        public final void setOkHttpClientProvider(sls slsVar) {
            this.okHttpClientProvider = slsVar;
        }

        public final void setSticknessHolder(SticknessHolder sticknessHolder) {
            this.sticknessHolder = sticknessHolder;
        }

        public final void setUpdateAbConfigStrategy(Integer num) {
            this.updateAbConfigStrategy = num;
        }

        public final void setVpuidHolder(VpuidHolder vpuidHolder) {
            this.vpuidHolder = vpuidHolder;
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$Builder$Companion;", "", "()V", "DEFAULT_UPDATE_TIMEOUT", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0003R\u0014\u0010\"\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "canBeInitialized", "(Landroid/content/Context;)Z", "Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$InitializationParameters;", "initializationParameters", "Lzy11;", "initializeInternal", "(Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$InitializationParameters;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager$Builder;", "builderAction", "initialize", "(Landroid/content/Context;Ltls;)V", "Lru/yandex/video/m3/ab/YandexPlayerAbConfigUpdateListener;", "listener", "addAbConfigUpdateListener", "(Lru/yandex/video/m3/ab/YandexPlayerAbConfigUpdateListener;)Z", "Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager;", "getInstanceOrNull$video_player_internalRelease", "()Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager;", "getInstanceOrNull", "getInstanceOrThrow$video_player_internalRelease", "getInstanceOrThrow", "INSTANCE", "Lru/yandex/video/m3/ab/YandexPlayerAbConfigManager;", "getINSTANCE$annotations", "isInitialized$video_player_internalRelease", "()Z", "isInitialized", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean canBeInitialized(Context context) {
            return YandexPlayerAbConfigManager.INSTANCE == null && ru.yandex.video.m3.ab.util.UtilKt.isMainProcess(context);
        }

        private static /* synthetic */ void getINSTANCE$annotations() {
        }

        public static /* synthetic */ void initialize$default(Companion companion, Context context, tls tlsVar, int i, Object obj) {
            if ((i & 2) != 0) {
                tlsVar = new tls() { // from class: ru.yandex.video.m3.ab.YandexPlayerAbConfigManager$Companion$initialize$1
                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((YandexPlayerAbConfigManager.Builder) obj2);
                        return zy11.a;
                    }

                    public final void invoke(YandexPlayerAbConfigManager.Builder builder) {
                    }
                };
            }
            companion.initialize(context, tlsVar);
        }

        private final void initializeInternal(InitializationParameters initializationParameters) {
            if (YandexPlayerAbConfigManager.INSTANCE != null) {
                return;
            }
            synchronized (this) {
                if (YandexPlayerAbConfigManager.INSTANCE == null) {
                    Context context = initializationParameters.getContext();
                    sbx providePlayerAbExpsJson = ru.yandex.video.m3.ab.util.UtilKt.providePlayerAbExpsJson(sbx.d);
                    AbConfigDatabaseImpl.Companion companion = AbConfigDatabaseImpl.INSTANCE;
                    companion.initialize(context, providePlayerAbExpsJson);
                    VsidToAbConfigHolder vsidToAbConfigHolder = new VsidToAbConfigHolder(null, 1, null);
                    YandexPlayerAbConfigManager.INSTANCE = new YandexPlayerAbConfigManager(context.getPackageName(), new SimpleInteractor(new ReadOnlyAbConfigRepositoryImpl(companion.get()), vsidToAbConfigHolder), new rol0(new YandexPlayerAbConfigManager$Companion$initializeInternal$1$1(context, initializationParameters, providePlayerAbExpsJson, vsidToAbConfigHolder, null)), null, 8, null);
                }
            }
        }

        public final boolean addAbConfigUpdateListener(YandexPlayerAbConfigUpdateListener listener) {
            YandexPlayerAbConfigManager yandexPlayerAbConfigManager = YandexPlayerAbConfigManager.INSTANCE;
            if (yandexPlayerAbConfigManager == null) {
                return false;
            }
            yandexPlayerAbConfigManager.addAbConfigUpdateListener$video_player_internalRelease(listener);
            return true;
        }

        public final YandexPlayerAbConfigManager getInstanceOrNull$video_player_internalRelease() {
            return YandexPlayerAbConfigManager.INSTANCE;
        }

        public final YandexPlayerAbConfigManager getInstanceOrThrow$video_player_internalRelease() throws IllegalStateException {
            YandexPlayerAbConfigManager yandexPlayerAbConfigManager = YandexPlayerAbConfigManager.INSTANCE;
            if (yandexPlayerAbConfigManager != null) {
                return yandexPlayerAbConfigManager;
            }
            ny61.r("YandexPlayerAbConfigManager is not initialized. Was YandexPlayerAbConfigManager.initialize(..) called?");
            return null;
        }

        public final void initialize(Context context, tls builderAction) {
            if (YandexPlayerAbConfigManager.INSTANCE != null) {
                return;
            }
            synchronized (this) {
                Companion companion = YandexPlayerAbConfigManager.INSTANCE;
                if (companion.canBeInitialized(context)) {
                    Builder builder = new Builder(context);
                    builderAction.invoke(builder);
                    companion.initializeInternal(builder.build$video_player_internalRelease());
                }
            }
        }

        public final boolean isInitialized$video_player_internalRelease() {
            boolean z;
            synchronized (this) {
                z = YandexPlayerAbConfigManager.INSTANCE != null;
            }
            return z;
        }

        private Companion() {
        }
    }

    public YandexPlayerAbConfigManager(String str, AbConfigInteractor abConfigInteractor, tpr tprVar, tse tseVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, abConfigInteractor, tprVar, (i & 8) != 0 ? bvf0.a(uyj.a) : tseVar);
    }
}
