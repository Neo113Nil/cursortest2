package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0437lj implements No {
    public final Ep a;

    public C0437lj(@NonNull Ep ep) {
        this.a = ep;
    }

    @Override // io.appmetrica.analytics.impl.No
    public final void a() {
        NetworkTask c = this.a.c();
        if (c != null) {
            C0747wb.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c);
        }
    }
}
