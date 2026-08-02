package io.appmetrica.analytics.impl;

import defpackage.arf;
import defpackage.btf;
import defpackage.t75;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Cd {
    public final C0668tj a;
    public final InterfaceC0831za b;
    public final C0250f5 c;
    public final C0637sh d;
    public final E5 e;
    public final Xd f = new Xd();
    public final arf g = btf.b(new Bd(this));

    public Cd(@NotNull E7 e7, @NotNull C0668tj c0668tj, @NotNull InterfaceC0831za interfaceC0831za, @NotNull C0250f5 c0250f5, @NotNull C0637sh c0637sh) {
        this.a = c0668tj;
        this.b = interfaceC0831za;
        this.c = c0250f5;
        this.d = c0637sh;
        this.e = new E5(e7, c0668tj);
    }

    @NotNull
    public final List<N9> a() {
        return this.e.a();
    }

    @NotNull
    public final List<N9> b() {
        return CollectionsKt.g0(t75.c(this.e.c), t75.c((N9) this.g.getValue()));
    }
}
