package ru.yandex.video.m3.ab.interactor.update;

import defpackage.bvf0;
import defpackage.d5z0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h5z0;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.random.Random;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.ab.api.AbConfigApi;
import ru.yandex.video.m3.ab.api.AbConfigApiException;
import ru.yandex.video.m3.ab.api.AbConfigApiSuccessfulResponse;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.config.internal.InternalAbConfig;
import ru.yandex.video.m3.ab.repository.AbConfigRepository;
import ru.yandex.video.m3.ab.validation.ExperimentAndFeatureToggleValidator;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.TimberPlayerLogger;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010$R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateSchedulerImpl;", "Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateScheduler;", "Ltse;", "coroutineScope", "Lru/yandex/video/m3/ab/repository/AbConfigRepository;", "abConfigRepository", "Lru/yandex/video/m3/ab/api/AbConfigApi;", "abConfigApi", "", "pollingPeriod", "<init>", "(Ltse;Lru/yandex/video/m3/ab/repository/AbConfigRepository;Lru/yandex/video/m3/ab/api/AbConfigApi;J)V", "Ll8x;", "initUpdatesWithState", "()Ll8x;", "Ltpr;", "Lzy11;", "startUpdateFlow", "()Ltpr;", "update", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "throwable", "calculateRetryDelayOnFailure", "(Ljava/lang/Throwable;)J", "calculateDefaultTimeout", "()J", "calculateRetryInCaseOf429ResponseCode", "calculateRetryInCaseOfNetworkTimeout", "forceUpdate", "()V", "startUpdates", "stopUpdates", "Ltse;", "Lru/yandex/video/m3/ab/repository/AbConfigRepository;", "Lru/yandex/video/m3/ab/api/AbConfigApi;", "J", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "", "retryAttemptsCount", CA20Status.STATUS_USER_I, "lastUpdateTime", "Lpz40;", "", ClidProvider.STATE, "Lpz40;", "Lg050;", "mutex", "Lg050;", "updateJob", "Ll8x;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbConfigUpdateSchedulerImpl implements AbConfigUpdateScheduler {
    private static final long DEFAULT_RETRY_TIMEOUT = 2000;
    private static final long DEFAULT_RETRY_TIMEOUT_IN_CASE_OF_NETWORK_TIMEOUT = 2000;
    private static final long DO_NOT_SCHEDULE_UPDATE = -1;
    private static final long EXHAUSTED_TIMEOUT = 0;
    private static final long FIRST_RETRY_BASE_TIMEOUT = 1000;
    private static final int MAX_RETRY_ATTEMPTS = 3;
    private static final int PHASING_END = 500;
    private static final int PHASING_START = -500;
    private static final int RECOVERABLE_RESPONSE_CODE = 429;
    private static final long SECOND_RETRY_BASE_TIMEOUT = 3000;
    private static final long THIRD_RETRY_BASE_TIMEOUT = 7000;
    private final AbConfigApi abConfigApi;
    private final AbConfigRepository abConfigRepository;
    private final tse coroutineScope;
    private long lastUpdateTime;
    private final long pollingPeriod;
    private int retryAttemptsCount;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final PlayerLogger playerLogger = new TimberPlayerLogger();
    private final pz40 state = bvf0.c(Boolean.FALSE);
    private final g050 mutex = gtq0.a();
    private l8x updateJob = initUpdatesWithState();

    public AbConfigUpdateSchedulerImpl(tse tseVar, AbConfigRepository abConfigRepository, AbConfigApi abConfigApi, long j) {
        this.coroutineScope = tseVar;
        this.abConfigRepository = abConfigRepository;
        this.abConfigApi = abConfigApi;
        this.pollingPeriod = j;
    }

    private final long calculateDefaultTimeout() {
        this.retryAttemptsCount++;
        Random.a.getClass();
        return Random.b.f(PHASING_START, 500) + 2000;
    }

    private final long calculateRetryDelayOnFailure(Throwable throwable) throws IllegalStateException {
        int i = this.retryAttemptsCount;
        if (i < 0) {
            ny61.r("Illegal state retryAttemptsCount less then zero. Check the code.");
            return 0L;
        }
        if (i == 3) {
            this.retryAttemptsCount = 0;
            return this.pollingPeriod;
        }
        if (!(throwable instanceof AbConfigApiException)) {
            return -1L;
        }
        AbConfigApiException abConfigApiException = (AbConfigApiException) throwable;
        if (abConfigApiException instanceof AbConfigApiException.UuidUnavailableApiException ? true : abConfigApiException instanceof AbConfigApiException.IncorrectUrlParameters) {
            return -1L;
        }
        if (abConfigApiException instanceof AbConfigApiException.ResponseExtractionApiException) {
            return calculateDefaultTimeout();
        }
        if (abConfigApiException instanceof AbConfigApiException.ResponseIsNotSuccessful) {
            return ((AbConfigApiException.ResponseIsNotSuccessful) throwable).getResponseCode() == 429 ? calculateRetryInCaseOf429ResponseCode() : calculateDefaultTimeout();
        }
        if (abConfigApiException instanceof AbConfigApiException.AbConfigFetchException) {
            return calculateRetryInCaseOfNetworkTimeout();
        }
        w511.b();
        return 0L;
    }

    private final long calculateRetryInCaseOf429ResponseCode() {
        long j;
        long j2;
        Random.a.getClass();
        int f = Random.b.f(PHASING_START, 500);
        int i = this.retryAttemptsCount;
        if (i == 0) {
            j = 1000;
        } else if (i == 1) {
            j = 3000;
        } else {
            if (i != 2) {
                j2 = 0;
                this.retryAttemptsCount = i + 1;
                return j2;
            }
            j = THIRD_RETRY_BASE_TIMEOUT;
        }
        j2 = j + f;
        this.retryAttemptsCount = i + 1;
        return j2;
    }

    private final long calculateRetryInCaseOfNetworkTimeout() {
        this.retryAttemptsCount++;
        return 2000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l8x initUpdatesWithState() {
        return e.H(this.coroutineScope, e.X(this.state, new AbConfigUpdateSchedulerImpl$initUpdatesWithState$$inlined$flatMapLatest$1(null, this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tpr startUpdateFlow() {
        return new rol0(new AbConfigUpdateSchedulerImpl$startUpdateFlow$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:11:0x004e, B:13:0x0064, B:15:0x006b, B:16:0x00b2, B:17:0x0096, B:19:0x009a, B:20:0x00b8, B:22:0x00be, B:24:0x00c6, B:25:0x00d4, B:26:0x00d8), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be A[Catch: all -> 0x0094, TryCatch #0 {all -> 0x0094, blocks: (B:11:0x004e, B:13:0x0064, B:15:0x006b, B:16:0x00b2, B:17:0x0096, B:19:0x009a, B:20:0x00b8, B:22:0x00be, B:24:0x00c6, B:25:0x00d4, B:26:0x00d8), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object update(Continuation<? super Long> continuation) {
        AbConfigUpdateSchedulerImpl$update$1 abConfigUpdateSchedulerImpl$update$1;
        int i;
        g050 g050Var;
        Object m731fetchConfigIoAF18A$video_player_internalRelease;
        Throwable a;
        AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl = this;
        try {
            if (continuation instanceof AbConfigUpdateSchedulerImpl$update$1) {
                abConfigUpdateSchedulerImpl$update$1 = (AbConfigUpdateSchedulerImpl$update$1) continuation;
                int i2 = abConfigUpdateSchedulerImpl$update$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    abConfigUpdateSchedulerImpl$update$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = abConfigUpdateSchedulerImpl$update$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = abConfigUpdateSchedulerImpl$update$1.label;
                    if (i != 0) {
                        b.b(obj);
                        g050Var = abConfigUpdateSchedulerImpl.mutex;
                        abConfigUpdateSchedulerImpl$update$1.L$0 = abConfigUpdateSchedulerImpl;
                        abConfigUpdateSchedulerImpl$update$1.L$1 = g050Var;
                        abConfigUpdateSchedulerImpl$update$1.label = 1;
                        if (g050Var.a(abConfigUpdateSchedulerImpl$update$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050 g050Var2 = (g050) abConfigUpdateSchedulerImpl$update$1.L$1;
                        AbConfigUpdateSchedulerImpl abConfigUpdateSchedulerImpl2 = (AbConfigUpdateSchedulerImpl) abConfigUpdateSchedulerImpl$update$1.L$0;
                        b.b(obj);
                        g050Var = g050Var2;
                        abConfigUpdateSchedulerImpl = abConfigUpdateSchedulerImpl2;
                    }
                    AbConfigWithMeta config = abConfigUpdateSchedulerImpl.abConfigRepository.getConfig();
                    m731fetchConfigIoAF18A$video_player_internalRelease = abConfigUpdateSchedulerImpl.abConfigApi.m731fetchConfigIoAF18A$video_player_internalRelease(config.getEtag());
                    long j = abConfigUpdateSchedulerImpl.pollingPeriod;
                    if (!(m731fetchConfigIoAF18A$video_player_internalRelease instanceof Result.Failure)) {
                        AbConfigApiSuccessfulResponse abConfigApiSuccessfulResponse = (AbConfigApiSuccessfulResponse) m731fetchConfigIoAF18A$video_player_internalRelease;
                        if (abConfigApiSuccessfulResponse instanceof AbConfigApiSuccessfulResponse.NewConfig) {
                            InternalAbConfig internalAbConfig = ((AbConfigApiSuccessfulResponse.NewConfig) abConfigApiSuccessfulResponse).getInternalAbConfig();
                            ExperimentAndFeatureToggleValidator experimentAndFeatureToggleValidator = ExperimentAndFeatureToggleValidator.INSTANCE;
                            abConfigUpdateSchedulerImpl.abConfigRepository.updateConfig(new AbConfigWithMeta(((AbConfigApiSuccessfulResponse.NewConfig) abConfigApiSuccessfulResponse).getFetchTimestamp(), ((AbConfigApiSuccessfulResponse.NewConfig) abConfigApiSuccessfulResponse).getEtag(), experimentAndFeatureToggleValidator.validateExperiments$video_player_internalRelease(internalAbConfig), experimentAndFeatureToggleValidator.validateFeatureToggle$video_player_internalRelease(internalAbConfig), internalAbConfig));
                        } else if (abConfigApiSuccessfulResponse instanceof AbConfigApiSuccessfulResponse.KeepConfig) {
                            abConfigUpdateSchedulerImpl.abConfigRepository.updateConfig(AbConfigWithMeta.copy$default(config, ((AbConfigApiSuccessfulResponse.KeepConfig) abConfigApiSuccessfulResponse).getUpdateTimestamp(), null, null, null, null, 30, null));
                        }
                        abConfigUpdateSchedulerImpl.lastUpdateTime = System.currentTimeMillis();
                    }
                    a = Result.a(m731fetchConfigIoAF18A$video_player_internalRelease);
                    if (a != null) {
                        if (PlayerLoggerExtensionsKt.getEnabled(abConfigUpdateSchedulerImpl.playerLogger)) {
                            d5z0 d5z0Var = h5z0.a;
                            d5z0Var.t("AbConfigUpdater");
                            d5z0Var.e(Result.a(m731fetchConfigIoAF18A$video_player_internalRelease));
                        }
                        j = abConfigUpdateSchedulerImpl.calculateRetryDelayOnFailure(a);
                    }
                    Long l = new Long(j);
                    g050Var.d(null);
                    return l;
                }
            }
            AbConfigWithMeta config2 = abConfigUpdateSchedulerImpl.abConfigRepository.getConfig();
            m731fetchConfigIoAF18A$video_player_internalRelease = abConfigUpdateSchedulerImpl.abConfigApi.m731fetchConfigIoAF18A$video_player_internalRelease(config2.getEtag());
            long j2 = abConfigUpdateSchedulerImpl.pollingPeriod;
            if (!(m731fetchConfigIoAF18A$video_player_internalRelease instanceof Result.Failure)) {
            }
            a = Result.a(m731fetchConfigIoAF18A$video_player_internalRelease);
            if (a != null) {
            }
            Long l2 = new Long(j2);
            g050Var.d(null);
            return l2;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        abConfigUpdateSchedulerImpl$update$1 = new AbConfigUpdateSchedulerImpl$update$1(abConfigUpdateSchedulerImpl, continuation);
        Object obj2 = abConfigUpdateSchedulerImpl$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = abConfigUpdateSchedulerImpl$update$1.label;
        if (i != 0) {
        }
    }

    @Override // ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler
    public void forceUpdate() {
        tje.N(this.coroutineScope, null, null, new AbConfigUpdateSchedulerImpl$forceUpdate$1(this, null), 3);
    }

    @Override // ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler
    public void startUpdates() {
        if (!this.updateJob.isActive()) {
            this.updateJob = initUpdatesWithState();
        }
        pz40 pz40Var = this.state;
        Boolean bool = Boolean.TRUE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // ru.yandex.video.m3.ab.interactor.update.AbConfigUpdateScheduler
    public void stopUpdates() {
        pz40 pz40Var = this.state;
        Boolean bool = Boolean.FALSE;
        r0 r0Var = (r0) pz40Var;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ab/interactor/update/AbConfigUpdateSchedulerImpl$Companion;", "", "()V", "DEFAULT_RETRY_TIMEOUT", "", "DEFAULT_RETRY_TIMEOUT_IN_CASE_OF_NETWORK_TIMEOUT", "DO_NOT_SCHEDULE_UPDATE", "EXHAUSTED_TIMEOUT", "FIRST_RETRY_BASE_TIMEOUT", "MAX_RETRY_ATTEMPTS", "", "PHASING_END", "PHASING_START", "RECOVERABLE_RESPONSE_CODE", "SECOND_RETRY_BASE_TIMEOUT", "THIRD_RETRY_BASE_TIMEOUT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
