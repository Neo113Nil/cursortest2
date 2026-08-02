package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0825z4 implements ProcessDetector {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector
    public final boolean isMainProcess() {
        return R4.l().a.b();
    }
}
