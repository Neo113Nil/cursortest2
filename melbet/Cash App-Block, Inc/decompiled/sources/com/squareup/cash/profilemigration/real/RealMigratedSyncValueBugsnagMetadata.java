package com.squareup.cash.profilemigration.real;

import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class RealMigratedSyncValueBugsnagMetadata implements UiSetupTeardown {
    public final BugsnagClient bugsnagClient;

    public RealMigratedSyncValueBugsnagMetadata(BugsnagClient bugsnagClient) {
        this.bugsnagClient = bugsnagClient;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new RealBrazeManager$$ExternalSyntheticLambda0(this, 29));
    }
}
