package com.datadog.android.core.internal.privacy;

import com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator;
import com.datadog.android.privacy.TrackingConsent;

/* loaded from: classes4.dex */
public interface ConsentProvider {
    TrackingConsent getConsent();

    void registerCallback(ConsentAwareFileOrchestrator consentAwareFileOrchestrator);

    void setConsent();

    void unregisterAllCallbacks();

    void unregisterCallback(ConsentAwareFileOrchestrator consentAwareFileOrchestrator);
}
