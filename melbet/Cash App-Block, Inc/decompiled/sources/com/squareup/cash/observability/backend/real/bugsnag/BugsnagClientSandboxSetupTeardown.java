package com.squareup.cash.observability.backend.real.bugsnag;

import com.squareup.cash.CashApp$onCreate$4$1$1;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.types.MetadataSection$AdditionalInfoSection;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.StorageLink;
import com.squareup.util.coroutines.SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import kotlin.Lazy;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class BugsnagClientSandboxSetupTeardown implements UiSetupTeardown {
    public final BugsnagClient bugsnagClient;
    public final Lazy profileManager;
    public final SessionManager sessionManager;
    public final StorageLink storageLink;

    public BugsnagClientSandboxSetupTeardown(Analytics analytics, BugsnagClient bugsnagClient, Lazy lazy, SessionManager sessionManager, StorageLink storageLink) {
        this.bugsnagClient = bugsnagClient;
        this.profileManager = lazy;
        this.sessionManager = sessionManager;
        this.storageLink = storageLink;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.bugsnagClient.addMetadata(MetadataSection$AdditionalInfoSection.INSTANCE, MetadataSection$AdditionalInfoSection.ActiveStorageLinkKey.INSTANCE, this.storageLink.toString());
        JobKt.launch$default(coroutineScope, null, null, new CashApp$onCreate$4$1$1(this, null, 29), 3);
        return new SetupTeardownKt$sam$com_squareup_util_coroutines_Teardown$0(new RealBrazeManager$$ExternalSyntheticLambda0(this, 28));
    }
}
