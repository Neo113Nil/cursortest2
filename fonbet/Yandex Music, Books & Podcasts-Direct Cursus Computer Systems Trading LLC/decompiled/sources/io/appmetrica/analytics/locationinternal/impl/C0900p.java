package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0900p implements FunctionWithThrowable {
    public final /* synthetic */ C0908s a;

    public C0900p(C0908s c0908s) {
        this.a = c0908s;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C0908s c0908s = this.a;
        if (!c0908s.b.hasNecessaryPermissions(c0908s.a.d)) {
            return null;
        }
        GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
        int cid = gsmCellLocation != null ? gsmCellLocation.getCid() : 1;
        if (-1 != cid) {
            return Integer.valueOf(cid);
        }
        return null;
    }
}
