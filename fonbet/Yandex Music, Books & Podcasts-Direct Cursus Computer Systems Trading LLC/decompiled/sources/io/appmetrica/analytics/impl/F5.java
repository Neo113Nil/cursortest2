package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class F5 implements InterfaceC0831za {
    public final C0165c6 a;

    public F5(@NotNull Da da, @NotNull E7 e7, @NotNull C0668tj c0668tj, @NotNull H5 h5) {
        E5 e5 = new E5(e7, c0668tj);
        this.a = new C0165c6(da, e5.a(), e5.b(), h5);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0831za
    public final InterfaceC0803ya a() {
        return this.a;
    }

    @NotNull
    public final C0165c6 b() {
        return this.a;
    }
}
