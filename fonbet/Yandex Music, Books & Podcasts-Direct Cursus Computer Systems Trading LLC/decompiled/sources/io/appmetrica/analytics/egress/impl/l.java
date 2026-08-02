package io.appmetrica.analytics.egress.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;

/* loaded from: classes5.dex */
public final class l {
    public final ModuleSelfReporter a;

    public l(a aVar, ModuleSelfReporter moduleSelfReporter) {
        this.a = aVar.c() ? moduleSelfReporter : null;
    }
}
