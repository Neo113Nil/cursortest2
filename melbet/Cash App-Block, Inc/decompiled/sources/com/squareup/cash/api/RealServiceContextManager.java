package com.squareup.cash.api;

import app.cash.molecule.GatedFrameClock;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealServiceContextManager {
    public final Lazy boostSyncer;
    public final Lazy demandDepositAccountManager;
    public final CoroutineContext ioDispatcher;
    public final Lazy paymentManager;
    public final InstrumentQueries profileQueries;
    public final Lazy profileSyncer;
    public final Lazy referralManager;
    public final RealRegionProvider regionProvider;
    public final Lazy responseContextProcessor;
    public final SessionManager sessionManager;

    public RealServiceContextManager(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, CashAccountDatabaseImpl cashAccountDatabaseImpl, Lazy lazy5, Lazy lazy6, SessionManager sessionManager, CoroutineContext coroutineContext, RealRegionProvider realRegionProvider) {
        this.responseContextProcessor = lazy;
        this.demandDepositAccountManager = lazy2;
        this.boostSyncer = lazy3;
        this.profileSyncer = lazy4;
        this.referralManager = lazy5;
        this.paymentManager = lazy6;
        this.sessionManager = sessionManager;
        this.ioDispatcher = coroutineContext;
        this.regionProvider = realRegionProvider;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
    }

    public final Object consumeResponseContext(RequestContext requestContext, ResponseContext responseContext, String str, Exception exc, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new RealServiceContextManager$consumeResponseContext$2(this, requestContext, responseContext, str, exc, null), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    public final Object produceRequestContext(RequestContext requestContext, ContinuationImpl continuationImpl) {
        return JobKt.withContext(this.ioDispatcher, new RealGcmRegistrar$unregister$2(this, requestContext, null, 10), continuationImpl);
    }

    public final Object requestComplete(RequestContext requestContext, ContinuationImpl continuationImpl) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new GatedFrameClock.AnonymousClass1(this, requestContext, null, 25), continuationImpl);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }
}
