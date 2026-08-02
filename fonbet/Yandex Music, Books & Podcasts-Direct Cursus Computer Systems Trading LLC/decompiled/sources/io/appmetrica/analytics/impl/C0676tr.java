package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.tr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0676tr implements InterfaceC0530op {
    public final UtilityServiceProvider a;

    public C0676tr(@NotNull UtilityServiceProvider utilityServiceProvider) {
        this.a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0530op
    public final void a(@NotNull C0385jp c0385jp) {
        this.a.updateConfiguration(new UtilityServiceConfiguration(c0385jp.w, c0385jp.v));
    }
}
