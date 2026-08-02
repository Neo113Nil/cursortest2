package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;

/* renamed from: io.appmetrica.analytics.impl.y8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0876y8 implements AskForPermissionStrategyModuleProvider {
    public final Ig a = new Ig();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.a;
    }
}
