package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.impl.rj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0684rj implements InterfaceC0344fp {
    public final Wp a;

    public C0684rj(Wp wp) {
        this.a = wp;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0344fp
    public final void a() {
        NetworkTask c = this.a.c();
        if (c != null) {
            Jb.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c);
        }
    }
}
