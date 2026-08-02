package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityLte;

/* loaded from: classes2.dex */
public final class R1 implements N1 {
    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final Integer a(Object obj) {
        return Integer.valueOf(((CellIdentityLte) obj).getMnc());
    }

    public final Integer b(CellIdentityLte cellIdentityLte) {
        return Integer.valueOf(cellIdentityLte.getMnc());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final Integer c(Object obj) {
        return Integer.valueOf(((CellIdentityLte) obj).getMcc());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final String b(Object obj) {
        return null;
    }

    public final Integer a(CellIdentityLte cellIdentityLte) {
        return Integer.valueOf(cellIdentityLte.getMcc());
    }

    public final String c(CellIdentityLte cellIdentityLte) {
        return null;
    }
}
