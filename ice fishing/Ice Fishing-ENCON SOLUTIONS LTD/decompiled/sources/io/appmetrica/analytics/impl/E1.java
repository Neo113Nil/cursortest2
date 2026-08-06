package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class E1 implements InterfaceC0362dk {

    /* renamed from: b, reason: collision with root package name */
    public static final D1 f4336b = new D1();

    /* renamed from: c, reason: collision with root package name */
    public static final int f4337c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0729s0 f4338a;

    public E1(InterfaceC0729s0 interfaceC0729s0) {
        this.f4338a = interfaceC0729s0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0362dk
    public final void reportData(int i2, Bundle bundle) {
        ((B1) this.f4338a).a(bundle);
    }
}
