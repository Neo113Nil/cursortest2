package com.squareup.cash.pools.backend.real;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

/* loaded from: classes.dex */
public final class PoolsRefresher implements IoActivitySetupTeardown {
    public final FeatureFlagManager featureFlagManager;
    public final RealPoolsRepository poolsRepository;
    public final SessionManager sessionManager;

    public PoolsRefresher(RealPoolsRepository realPoolsRepository, SessionManager sessionManager, FeatureFlagManager featureFlagManager) {
        this.poolsRepository = realPoolsRepository;
        this.sessionManager = sessionManager;
        this.featureFlagManager = featureFlagManager;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new CombineKt$combineInternal$2.AnonymousClass1(null, this, lifecycle, 5), 1);
        return StateFlowKt.noOpTeardown;
    }
}
