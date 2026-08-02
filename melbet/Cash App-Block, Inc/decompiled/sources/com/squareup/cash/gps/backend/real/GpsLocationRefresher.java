package com.squareup.cash.gps.backend.real;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

/* loaded from: classes.dex */
public final class GpsLocationRefresher implements IoActivitySetupTeardown {
    public final RealGpsLocationManager gpsLocationManager;
    public final SessionManager sessionManager;

    public GpsLocationRefresher(RealGpsLocationManager realGpsLocationManager, SessionManager sessionManager, RealUuidGenerator realUuidGenerator) {
        this.gpsLocationManager = realGpsLocationManager;
        this.sessionManager = sessionManager;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new CombineKt$combineInternal$2.AnonymousClass1(null, this, lifecycle, 3), 1);
        return StateFlowKt.noOpTeardown;
    }
}
