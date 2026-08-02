package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class Gl implements Vr {
    public final Ur a = new Ur();

    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(Revenue revenue) {
        Tr tr;
        Ur ur = this.a;
        Mi mi = new Mi();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            tr = new Tr(mi, true, "");
        } else {
            tr = new Tr(mi, false, "Invalid quantity value " + num);
        }
        List<Tr> asList = Arrays.asList(tr);
        ur.getClass();
        return ur.a(asList);
    }
}
