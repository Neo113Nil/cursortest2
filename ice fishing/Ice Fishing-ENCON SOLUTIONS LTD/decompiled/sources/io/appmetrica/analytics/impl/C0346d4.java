package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346d4 implements ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0802ul f5784a;

    public C0346d4(InterfaceC0802ul interfaceC0802ul) {
        this.f5784a = interfaceC0802ul;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Xc(str, this.f5784a);
    }
}
