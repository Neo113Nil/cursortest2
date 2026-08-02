package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0728vl implements Cr {
    public final Br a = new Br();

    @Override // io.appmetrica.analytics.impl.Cr
    public final Ar a(Revenue revenue) {
        Ar ar;
        Br br = this.a;
        C0725vi c0725vi = new C0725vi();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            ar = new Ar(c0725vi, true, "");
        } else {
            ar = new Ar(c0725vi, false, "Invalid quantity value " + num);
        }
        List<Ar> asList = Arrays.asList(ar);
        br.getClass();
        return br.a(asList);
    }
}
