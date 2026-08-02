package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0978q implements FunctionWithThrowable {
    public final /* synthetic */ C0983s a;

    public C0978q(C0983s c0983s) {
        this.a = c0983s;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public final Object mo489apply(Object obj) {
        CellLocation cellLocation;
        int lac;
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C0983s c0983s = this.a;
        if (!c0983s.b.hasNecessaryPermissions(c0983s.a.d) || (cellLocation = telephonyManager.getCellLocation()) == null || -1 == (lac = ((GsmCellLocation) cellLocation).getLac())) {
            return null;
        }
        return Integer.valueOf(lac);
    }
}
