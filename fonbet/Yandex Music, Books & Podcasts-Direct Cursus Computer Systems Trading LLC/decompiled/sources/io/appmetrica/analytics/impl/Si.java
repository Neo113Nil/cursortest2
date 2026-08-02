package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public class Si {
    public final InterfaceC0113ac a;
    public final Ni b;
    public final Yb c;

    public Si(InterfaceC0113ac interfaceC0113ac, Ni ni, Yb yb) {
        this.a = interfaceC0113ac;
        this.b = ni;
        this.c = yb;
    }

    public final void a(Qi qi) {
        if (this.a.a(qi)) {
            this.b.a(qi);
            this.c.a();
        }
    }

    @NonNull
    public final Ni b() {
        return this.b;
    }

    @NonNull
    public final Yb c() {
        return this.c;
    }

    @NonNull
    public final InterfaceC0113ac a() {
        return this.a;
    }
}
