package io.appmetrica.analytics.impl;

import android.app.Service;

/* loaded from: classes9.dex */
public final class A0 implements T1 {
    public final Service a;

    public A0(Service service) {
        this.a = service;
    }

    public final void a(int i) {
        this.a.stopSelf(i);
    }
}
