package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Dd implements InterfaceC0831za {
    public final C0165c6 a;

    public Dd(@NotNull Da da, @NotNull E7 e7, @NotNull C0668tj c0668tj, @NotNull C0250f5 c0250f5, @NotNull H5 h5, @NotNull C0637sh c0637sh) {
        Cd cd = new Cd(e7, c0668tj, this, c0250f5, c0637sh);
        this.a = new C0165c6(da, cd.a(), cd.b(), h5);
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
