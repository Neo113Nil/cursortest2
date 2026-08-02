package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes9.dex */
public final class Ko implements FunctionWithThrowable {
    public final /* synthetic */ Lo a;

    public Ko(Lo lo) {
        this.a = lo;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public final Object mo489apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        Lo lo = this.a;
        if (lo.b.hasPermission(lo.a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
