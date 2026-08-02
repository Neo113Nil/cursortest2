package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellIdentityWcdma;

/* loaded from: classes2.dex */
public final class T1 implements N1 {
    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final Integer a(Object obj) {
        return Integer.valueOf(((CellIdentityWcdma) obj).getMnc());
    }

    public final Integer b(CellIdentityWcdma cellIdentityWcdma) {
        return Integer.valueOf(cellIdentityWcdma.getMnc());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final Integer c(Object obj) {
        return Integer.valueOf(((CellIdentityWcdma) obj).getMcc());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.N1
    public final String b(Object obj) {
        return null;
    }

    public final Integer a(CellIdentityWcdma cellIdentityWcdma) {
        return Integer.valueOf(cellIdentityWcdma.getMcc());
    }

    public final String c(CellIdentityWcdma cellIdentityWcdma) {
        return null;
    }
}
