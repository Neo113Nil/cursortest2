package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class T4 implements ClientStorageProvider {
    public final InterfaceC0789xo a;

    public T4(@NotNull InterfaceC0789xo interfaceC0789xo) {
        this.a = interfaceC0789xo;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new De(str, this.a);
    }
}
