package com.squareup.cash.history.backend.real;

import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import okio.AsyncTimeout;

/* loaded from: classes6.dex */
public final class RealInvestingActivitiesManager implements ActivitiesManager {
    public final /* synthetic */ ActivitiesManager $$delegate_0;
    public final AndroidClock clock;
    public final CoroutineContext computationDispatcher;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HistoricalRange.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AsyncTimeout.Companion companion = HistoricalRange.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AsyncTimeout.Companion companion2 = HistoricalRange.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AsyncTimeout.Companion companion3 = HistoricalRange.Companion;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AsyncTimeout.Companion companion4 = HistoricalRange.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[Role.values().length];
            try {
                iArr2[Role.SENDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Role.RECIPIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Role.DO_NOT_USE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RealInvestingActivitiesManager(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache, ActivitiesManager.Factory factory, AndroidClock androidClock, CoroutineContext coroutineContext) {
        activityContext.getClass();
        activitiesCache.getClass();
        this.$$delegate_0 = factory.create(activityContext, activitiesCache);
        this.clock = androidClock;
        this.computationDispatcher = coroutineContext;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow activities() {
        return this.$$delegate_0.activities();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final void clear() {
        this.$$delegate_0.clear();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow firstServerPages() {
        return this.$$delegate_0.firstServerPages();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Object load(ActivitiesManager.LoadMode loadMode, Continuation continuation) {
        return this.$$delegate_0.load(loadMode, continuation);
    }
}
