package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0975p implements FunctionWithThrowable {
    public final /* synthetic */ C0983s a;

    public C0975p(C0983s c0983s) {
        this.a = c0983s;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public final Object mo489apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C0983s c0983s = this.a;
        if (!c0983s.b.hasNecessaryPermissions(c0983s.a.d)) {
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
