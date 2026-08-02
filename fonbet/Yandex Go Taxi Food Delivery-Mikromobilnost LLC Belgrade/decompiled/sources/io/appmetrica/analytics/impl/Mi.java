package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Mi implements Vr {
    @Override // io.appmetrica.analytics.impl.Vr
    public final Tr a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new Tr(this, true, "");
        }
        return new Tr(this, false, "Invalid quantity value " + num);
    }
}
