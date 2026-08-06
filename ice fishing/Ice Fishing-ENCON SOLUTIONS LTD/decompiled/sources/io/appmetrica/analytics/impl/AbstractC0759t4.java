package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0759t4 extends Ad {

    /* renamed from: f, reason: collision with root package name */
    public final Object f6932f;

    public AbstractC0759t4(int i2, String str, Object obj, InterfaceC0753so interfaceC0753so, J2 j2) {
        super(i2, str, interfaceC0753so, j2);
        this.f6932f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ad, io.appmetrica.analytics.impl.InterfaceC0391eo
    public final void a(Cdo cdo) {
        if (f()) {
            J2 j2 = this.f4146d;
            int i2 = this.f4144b;
            C0417fo a2 = j2.a(cdo, (C0417fo) ((HashMap) cdo.f5848a.get(i2)).get(this.f4143a), this);
            if (a2 != null) {
                a(a2);
            }
        }
    }

    public abstract void a(C0417fo c0417fo);

    public final Object g() {
        return this.f6932f;
    }
}
