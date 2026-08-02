package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* loaded from: classes9.dex */
public final class X4 implements ClientStorageProvider {
    public final So a;

    public X4(So so) {
        this.a = so;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Se(str, this.a);
    }
}
