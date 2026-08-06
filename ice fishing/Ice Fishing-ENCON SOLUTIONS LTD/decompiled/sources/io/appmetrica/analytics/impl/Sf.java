package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sf implements InterfaceC0753so {
    @Override // io.appmetrica.analytics.impl.InterfaceC0753so
    public final C0702qo a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() > 0) {
            return new C0702qo(this, true, "");
        }
        return new C0702qo(this, false, "Invalid quantity value " + num);
    }
}
