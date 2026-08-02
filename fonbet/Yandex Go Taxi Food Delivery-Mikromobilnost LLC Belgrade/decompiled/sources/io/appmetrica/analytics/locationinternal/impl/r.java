package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes9.dex */
public final class r implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public final Object mo489apply(Object obj) {
        return ((TelephonyManager) obj).getNetworkOperatorName();
    }
}
