package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.egress.internal.config.EgressConfig;
import java.util.concurrent.TimeUnit;
import kotlin.random.Random;

/* loaded from: classes4.dex */
public final class g {
    public final ICommonExecutor a;
    public final IExecutionPolicy b;
    public final e c;
    public volatile boolean d;

    public g(EgressConfig egressConfig, f fVar, Random.Default r9, IHandlerExecutor iHandlerExecutor, l lVar, m mVar) {
        this.a = iHandlerExecutor;
        this.b = mVar;
        e eVar = new e(this, fVar, lVar, egressConfig.getRepeatedDelay());
        this.c = eVar;
        if (fVar.a()) {
            eVar.run();
            return;
        }
        int randomDelayWindow = egressConfig.getRandomDelayWindow() + 1;
        r9.getClass();
        iHandlerExecutor.executeDelayed(eVar, Random.b.c(randomDelayWindow), TimeUnit.SECONDS);
    }
}
