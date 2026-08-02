package com.squareup.cash.payments.presenters;

import androidx.lifecycle.Lifecycle;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.payments.backend.api.PersonalizationRepository;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.preferences.KeyValue;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

/* loaded from: classes.dex */
public final class PersonalizePaymentResourceRefresher implements IoActivitySetupTeardown {
    public final FeatureFlagManager featureFlagManager;
    public final PersonalizationRepository personalizationRepository;
    public final KeyValue personalizePaymentResourceVersion;
    public final SessionManager sessionManager;

    public PersonalizePaymentResourceRefresher(KeyValue keyValue, PersonalizationRepository personalizationRepository, FeatureFlagManager featureFlagManager, SessionManager sessionManager) {
        this.personalizePaymentResourceVersion = keyValue;
        this.personalizationRepository = personalizationRepository;
        this.featureFlagManager = featureFlagManager;
        this.sessionManager = sessionManager;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        Lifecycle lifecycle = (Lifecycle) obj;
        coroutineScope.getClass();
        lifecycle.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new CombineKt$combineInternal$2.AnonymousClass1(null, this, lifecycle, 4), 1);
        return StateFlowKt.noOpTeardown;
    }
}
