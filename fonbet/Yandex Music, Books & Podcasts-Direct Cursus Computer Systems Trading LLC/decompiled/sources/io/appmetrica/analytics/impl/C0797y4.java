package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.y4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0797y4 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(@NotNull Context context) {
        C0245f0 b = R4.l().b();
        b.c.a().executeDelayed(new C0216e0(b, context), b.d);
    }
}
