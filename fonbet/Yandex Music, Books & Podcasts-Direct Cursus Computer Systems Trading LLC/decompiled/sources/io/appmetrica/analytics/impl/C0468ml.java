package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ml, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0468ml extends AbstractCallableC0121ak {
    public final Xh e;

    public C0468ml(@NotNull C0649t0 c0649t0, InterfaceC0183co interfaceC0183co, @NotNull Xh xh) {
        super(c0649t0, interfaceC0183co);
        this.e = xh;
    }

    @Override // io.appmetrica.analytics.impl.AbstractCallableC0121ak
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Bundle bundle = new Bundle();
        Xh xh = this.e;
        synchronized (xh) {
            bundle.putParcelable("PROCESS_CFG_OBJ", xh);
        }
        iAppMetricaService.resumeUserSession(bundle);
    }
}
