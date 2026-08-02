package com.squareup.cash.integration.echo;

import androidx.lifecycle.Lifecycle;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class EchoModule$provideEchoWorkerFactory$1$create$1 implements IoActivitySetupTeardown {
    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        return StateFlowKt.noOpTeardown;
    }
}
