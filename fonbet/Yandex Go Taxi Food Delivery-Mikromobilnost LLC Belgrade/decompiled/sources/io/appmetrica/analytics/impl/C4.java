package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;

/* loaded from: classes9.dex */
public final class C4 implements ModuleClientActivator {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator
    public final void activate(Context context) {
        C0377h0 b = V4.l().b();
        b.c.a().executeDelayed(new C0348g0(b, context), b.d);
    }
}
