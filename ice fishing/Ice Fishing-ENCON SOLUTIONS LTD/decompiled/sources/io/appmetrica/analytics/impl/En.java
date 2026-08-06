package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* loaded from: classes.dex */
public class En implements InterfaceC0753so {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0753so f4366a;

    public En(InterfaceC0753so interfaceC0753so) {
        this.f4366a = interfaceC0753so;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(Object obj) {
        C0702qo a2 = this.f4366a.a(obj);
        if (a2.f6792a) {
            return a2;
        }
        throw new ValidationException(a2.f6793b);
    }

    public final InterfaceC0753so a() {
        return this.f4366a;
    }
}
