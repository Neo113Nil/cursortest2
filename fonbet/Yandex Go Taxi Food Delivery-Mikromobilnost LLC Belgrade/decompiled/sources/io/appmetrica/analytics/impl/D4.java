package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;

/* loaded from: classes9.dex */
public final class D4 implements ProcessDetector {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector
    public final boolean isMainProcess() {
        return V4.l().a.b();
    }
}
