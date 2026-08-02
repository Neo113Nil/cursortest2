package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class Zn extends AbstractC0796y3 {
    public Zn(@NonNull X2 x2) {
        super(x2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0796y3
    public final C0561pr a(@NonNull C0503nr c0503nr, C0561pr c0561pr, @NonNull W2 w2) {
        if (c0561pr != null && !c0561pr.c.b) {
            return null;
        }
        C0561pr a = ((Vf) w2).a();
        a.c.a = true;
        return this.a.a(c0503nr, a);
    }
}
