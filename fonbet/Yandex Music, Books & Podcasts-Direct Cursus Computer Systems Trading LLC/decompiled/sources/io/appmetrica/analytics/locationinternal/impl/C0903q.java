package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0903q implements FunctionWithThrowable {
    public final /* synthetic */ C0908s a;

    public C0903q(C0908s c0908s) {
        this.a = c0908s;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        CellLocation cellLocation;
        int lac;
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C0908s c0908s = this.a;
        if (!c0908s.b.hasNecessaryPermissions(c0908s.a.d) || (cellLocation = telephonyManager.getCellLocation()) == null || -1 == (lac = ((GsmCellLocation) cellLocation).getLac())) {
            return null;
        }
        return Integer.valueOf(lac);
    }
}
