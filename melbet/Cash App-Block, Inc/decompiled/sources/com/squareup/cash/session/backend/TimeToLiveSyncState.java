package com.squareup.cash.session.backend;

import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class TimeToLiveSyncState {
    public final AndroidClock clock;
    public final long expirationTime;
    public long lastAttemptedRefresh;
    public StateFlowImpl progress;
    public final CoroutineScope scope;
    public final SessionManager sessionManager;
    public final Flow signOut;

    public TimeToLiveSyncState(long j, AndroidClock androidClock, SessionManager sessionManager, Flow flow, CoroutineScope coroutineScope) {
        TimeUnit.MINUTES.getClass();
        this.expirationTime = j;
        this.clock = androidClock;
        this.sessionManager = sessionManager;
        this.signOut = flow;
        this.scope = coroutineScope;
        this.progress = FlowKt.MutableStateFlow(SyncState$Progress.SUCCESS);
        JobKt.launch$default(coroutineScope, null, null, new Cache.AnonymousClass1(this, null, 4), 3);
    }
}
