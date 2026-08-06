package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;

/* loaded from: classes.dex */
public final class I3 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(Context context) {
        C0290b0 b2 = C0294b4.l().b();
        b2.f5576c.a().executeDelayed(new C0264a0(b2, context), b2.f5577d);
    }
}
