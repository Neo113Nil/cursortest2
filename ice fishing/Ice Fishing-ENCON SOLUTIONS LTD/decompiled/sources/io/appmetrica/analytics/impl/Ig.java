package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes.dex */
public final class Ig implements Kl {

    /* renamed from: a, reason: collision with root package name */
    public final Am f4544a;

    public Ig(Am am) {
        this.f4544a = am;
    }

    @Override // io.appmetrica.analytics.impl.Kl
    public final void a() {
        NetworkTask c2 = this.f4544a.c();
        if (c2 != null) {
            C0610na.f6575I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c2);
        }
    }
}
