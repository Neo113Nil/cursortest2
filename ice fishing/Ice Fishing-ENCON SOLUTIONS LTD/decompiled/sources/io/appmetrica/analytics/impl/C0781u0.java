package io.appmetrica.analytics.impl;

import android.app.Service;

/* renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781u0 implements InterfaceC0912z1 {

    /* renamed from: a, reason: collision with root package name */
    public final Service f6960a;

    public C0781u0(Service service) {
        this.f6960a = service;
    }

    public final void a(int i2) {
        this.f6960a.stopSelf(i2);
    }
}
