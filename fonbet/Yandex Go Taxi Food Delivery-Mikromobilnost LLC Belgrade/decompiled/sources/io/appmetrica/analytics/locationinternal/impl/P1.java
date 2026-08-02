package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityGsm;

/* loaded from: classes2.dex */
public final class P1 implements N1 {
    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final Integer a(Object obj) {
        return Integer.valueOf(((CellIdentityGsm) obj).getMnc());
    }

    public final Integer b(CellIdentityGsm cellIdentityGsm) {
        return Integer.valueOf(cellIdentityGsm.getMnc());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final Integer c(Object obj) {
        return Integer.valueOf(((CellIdentityGsm) obj).getMcc());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final String b(Object obj) {
        return null;
    }

    public final Integer a(CellIdentityGsm cellIdentityGsm) {
        return Integer.valueOf(cellIdentityGsm.getMcc());
    }

    public final String c(CellIdentityGsm cellIdentityGsm) {
        return null;
    }
}
