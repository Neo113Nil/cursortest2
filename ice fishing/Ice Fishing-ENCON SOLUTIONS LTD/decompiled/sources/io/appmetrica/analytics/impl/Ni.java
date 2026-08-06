package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class Ni implements InterfaceC0753so {

    /* renamed from: a, reason: collision with root package name */
    public final C0727ro f4828a = new C0727ro();

    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(Revenue revenue) {
        C0702qo c0702qo;
        C0727ro c0727ro = this.f4828a;
        Sf sf = new Sf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c0702qo = new C0702qo(sf, true, "");
        } else {
            c0702qo = new C0702qo(sf, false, "Invalid quantity value " + num);
        }
        List<C0702qo> asList = Arrays.asList(c0702qo);
        c0727ro.getClass();
        return c0727ro.a(asList);
    }
}
