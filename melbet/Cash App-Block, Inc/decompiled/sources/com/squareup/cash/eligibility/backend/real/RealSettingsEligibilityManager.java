package com.squareup.cash.eligibility.backend.real;

import androidx.room.Room;
import app.cash.api.ApiResult;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.cdf.settingseligibility.SettingsEligibilityRetrieveFailed;
import com.squareup.cash.cdf.settingseligibility.SettingsEligibilityRetrieveStarted;
import com.squareup.cash.cdf.settingseligibility.SettingsEligibilityRetrieveSucceeded;
import com.squareup.cash.cdf.settingseligibility.SettingsEligibilityRetrieveUnchanged;
import com.squareup.cash.eligibility.backend.api.EligibilityRefreshAnalyticsData;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.session.backend.RealSessionManager$updateSessionState$newOnboarded$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.protos.cash.janus.api.JanusService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSettingsEligibilityManager {
    public static final long CACHE_TTL_DURATION;
    public final Analytics analytics;
    public SettingsEligibilityManager$AccountSettingsResult cachedSettingsResult;
    public final AndroidClock clock;
    public long lastFetch;
    public final JanusService service;
    public final MutexImpl settingsStateLock = new MutexImpl();

    static {
        Duration.Companion companion = Duration.Companion;
        CACHE_TTL_DURATION = DurationKt.toDuration(24, DurationUnit.HOURS);
    }

    public RealSettingsEligibilityManager(JanusService janusService, AndroidClock androidClock, Analytics analytics) {
        this.service = janusService;
        this.clock = androidClock;
        this.analytics = analytics;
        Duration.Companion.getClass();
        this.lastFetch = 0L;
    }

    public static List toSettings(InMemoryAccountSettingsCache inMemoryAccountSettingsCache) {
        List list = inMemoryAccountSettingsCache.settingsResponse;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((GetAccountSettingsResponse.SettingCollection) it.next()).settings, arrayList);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchRemote(EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData, ContinuationImpl continuationImpl) {
        RealSettingsEligibilityManager$fetchRemote$1 realSettingsEligibilityManager$fetchRemote$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealSettingsEligibilityManager$fetchRemote$1) {
            realSettingsEligibilityManager$fetchRemote$1 = (RealSettingsEligibilityManager$fetchRemote$1) continuationImpl;
            int i2 = realSettingsEligibilityManager$fetchRemote$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSettingsEligibilityManager$fetchRemote$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSettingsEligibilityManager$fetchRemote$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSettingsEligibilityManager$fetchRemote$1.label;
                Analytics analytics = this.analytics;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new SettingsEligibilityRetrieveStarted(eligibilityRefreshAnalyticsData != null ? new Long(eligibilityRefreshAnalyticsData.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.originDescription : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.currentAttempt : null), null);
                    RealSessionManager$updateSessionState$newOnboarded$1 realSessionManager$updateSessionState$newOnboarded$1 = new RealSessionManager$updateSessionState$newOnboarded$1(this, continuation, 2);
                    realSettingsEligibilityManager$fetchRemote$1.L$0 = eligibilityRefreshAnalyticsData;
                    realSettingsEligibilityManager$fetchRemote$1.label = 1;
                    obj = PlatformKt.retryWhenRetryable$default(null, realSessionManager$updateSessionState$newOnboarded$1, realSettingsEligibilityManager$fetchRemote$1, 3);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eligibilityRefreshAnalyticsData = realSettingsEligibilityManager$fetchRemote$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    String analyticsString = Room.toAnalyticsString(failure);
                    analytics.track(new SettingsEligibilityRetrieveFailed(eligibilityRefreshAnalyticsData != null ? new Long(eligibilityRefreshAnalyticsData.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.currentAttempt : null, analyticsString, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.originDescription : null), null);
                    return new SettingsEligibilityManager$AccountSettingsResult.SettingsError(failure);
                }
                this.lastFetch = DimensionKt.elapsedRealtimeDuration(this.clock);
                InMemoryAccountSettingsCache inMemoryAccountSettingsCache = new InMemoryAccountSettingsCache(((GetAccountSettingsResponse) ((ApiResult.Success) apiResult).response).collection);
                SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded settingsLoaded = new SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded(inMemoryAccountSettingsCache);
                SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult = this.cachedSettingsResult;
                SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded settingsLoaded2 = settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded ? (SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult : null;
                if (Intrinsics.areEqual(settingsLoaded2 != null ? toSettings(settingsLoaded2.cache) : EmptyList.INSTANCE, toSettings(inMemoryAccountSettingsCache))) {
                    analytics.track(new SettingsEligibilityRetrieveUnchanged(eligibilityRefreshAnalyticsData != null ? Long.valueOf(eligibilityRefreshAnalyticsData.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.originDescription : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.currentAttempt : null), null);
                    return settingsLoaded;
                }
                analytics.track(new SettingsEligibilityRetrieveSucceeded(eligibilityRefreshAnalyticsData != null ? Long.valueOf(eligibilityRefreshAnalyticsData.policyChangeTimestamp) : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.originDescription : null, eligibilityRefreshAnalyticsData != null ? eligibilityRefreshAnalyticsData.currentAttempt : null), null);
                return settingsLoaded;
            }
        }
        realSettingsEligibilityManager$fetchRemote$1 = new RealSettingsEligibilityManager$fetchRemote$1(this, continuationImpl);
        Object obj2 = realSettingsEligibilityManager$fetchRemote$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSettingsEligibilityManager$fetchRemote$1.label;
        Analytics analytics2 = this.analytics;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData, ContinuationImpl continuationImpl) {
        RealSettingsEligibilityManager$refresh$1 realSettingsEligibilityManager$refresh$1;
        int i;
        if (continuationImpl instanceof RealSettingsEligibilityManager$refresh$1) {
            realSettingsEligibilityManager$refresh$1 = (RealSettingsEligibilityManager$refresh$1) continuationImpl;
            int i2 = realSettingsEligibilityManager$refresh$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSettingsEligibilityManager$refresh$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSettingsEligibilityManager$refresh$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSettingsEligibilityManager$refresh$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realSettingsEligibilityManager$refresh$1.L$1 = this;
                    realSettingsEligibilityManager$refresh$1.label = 1;
                    obj = fetchRemote(eligibilityRefreshAnalyticsData, realSettingsEligibilityManager$refresh$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = realSettingsEligibilityManager$refresh$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                this.cachedSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                return Unit.INSTANCE;
            }
        }
        realSettingsEligibilityManager$refresh$1 = new RealSettingsEligibilityManager$refresh$1(this, continuationImpl);
        Object obj2 = realSettingsEligibilityManager$refresh$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSettingsEligibilityManager$refresh$1.label;
        if (i != 0) {
        }
        this.cachedSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager] */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object settings(ContinuationImpl continuationImpl) {
        RealSettingsEligibilityManager$settings$1 realSettingsEligibilityManager$settings$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z;
        MutexImpl mutexImpl;
        int i2;
        Mutex mutex;
        long j;
        SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult;
        Object fetchRemote;
        try {
            if (continuationImpl instanceof RealSettingsEligibilityManager$settings$1) {
                realSettingsEligibilityManager$settings$1 = (RealSettingsEligibilityManager$settings$1) continuationImpl;
                int i3 = realSettingsEligibilityManager$settings$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realSettingsEligibilityManager$settings$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realSettingsEligibilityManager$settings$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realSettingsEligibilityManager$settings$1.label;
                    z = false;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = this.settingsStateLock;
                        realSettingsEligibilityManager$settings$1.L$0 = mutexImpl;
                        realSettingsEligibilityManager$settings$1.I$0 = 0;
                        realSettingsEligibilityManager$settings$1.label = 1;
                        if (mutexImpl.lock(realSettingsEligibilityManager$settings$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutex = realSettingsEligibilityManager$settings$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                            this.cachedSettingsResult = settingsEligibilityManager$AccountSettingsResult;
                            mutex.unlock(null);
                            return settingsEligibilityManager$AccountSettingsResult;
                        } catch (Throwable th) {
                            th = th;
                            mutex.unlock(null);
                            throw th;
                        }
                    }
                    i2 = realSettingsEligibilityManager$settings$1.I$0;
                    ?? r7 = realSettingsEligibilityManager$settings$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutexImpl = r7;
                    j = this.lastFetch;
                    Duration.Companion.getClass();
                    if (Duration.m4164compareToLRDsOJo(j, 0L) > 0 && Duration.m4164compareToLRDsOJo(Duration.m4172minusLRDsOJo(DimensionKt.elapsedRealtimeDuration(this.clock), this.lastFetch), CACHE_TTL_DURATION) < 0) {
                        z = true;
                    }
                    settingsEligibilityManager$AccountSettingsResult = this.cachedSettingsResult;
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) && z) {
                        mutex = mutexImpl;
                        this.cachedSettingsResult = settingsEligibilityManager$AccountSettingsResult;
                        mutex.unlock(null);
                        return settingsEligibilityManager$AccountSettingsResult;
                    }
                    realSettingsEligibilityManager$settings$1.L$0 = mutexImpl;
                    realSettingsEligibilityManager$settings$1.I$0 = i2;
                    realSettingsEligibilityManager$settings$1.label = 2;
                    fetchRemote = fetchRemote(null, realSettingsEligibilityManager$settings$1);
                    if (fetchRemote != coroutineSingletons) {
                        mutex = mutexImpl;
                        obj = fetchRemote;
                        settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                        this.cachedSettingsResult = settingsEligibilityManager$AccountSettingsResult;
                        mutex.unlock(null);
                        return settingsEligibilityManager$AccountSettingsResult;
                    }
                    return coroutineSingletons;
                }
            }
            j = this.lastFetch;
            Duration.Companion.getClass();
            if (Duration.m4164compareToLRDsOJo(j, 0L) > 0) {
                z = true;
            }
            settingsEligibilityManager$AccountSettingsResult = this.cachedSettingsResult;
            if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
            }
            realSettingsEligibilityManager$settings$1.L$0 = mutexImpl;
            realSettingsEligibilityManager$settings$1.I$0 = i2;
            realSettingsEligibilityManager$settings$1.label = 2;
            fetchRemote = fetchRemote(null, realSettingsEligibilityManager$settings$1);
            if (fetchRemote != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex = mutexImpl;
            mutex.unlock(null);
            throw th;
        }
        realSettingsEligibilityManager$settings$1 = new RealSettingsEligibilityManager$settings$1(this, continuationImpl);
        Object obj2 = realSettingsEligibilityManager$settings$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSettingsEligibilityManager$settings$1.label;
        z = false;
        if (i != 0) {
        }
    }
}
