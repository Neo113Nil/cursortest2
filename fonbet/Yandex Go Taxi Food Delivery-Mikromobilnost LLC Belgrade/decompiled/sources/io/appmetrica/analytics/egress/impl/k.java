package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.egress.internal.config.EgressConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;

/* loaded from: classes4.dex */
public final class k {
    public final ModuleSelfReporter a;

    public k(EgressConfig egressConfig, ModuleSelfReporter moduleSelfReporter) {
        this.a = egressConfig.isDiagnosticsEnabled() ? moduleSelfReporter : null;
    }
}
