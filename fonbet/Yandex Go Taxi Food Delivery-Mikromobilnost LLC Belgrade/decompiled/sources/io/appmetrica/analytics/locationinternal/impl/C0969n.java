package io.appmetrica.analytics.locationinternal.impl;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0969n implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public final Object mo489apply(Object obj) {
        String networkOperator = ((TelephonyManager) obj).getNetworkOperator();
        String substring = !TextUtils.isEmpty(networkOperator) ? networkOperator.substring(0, 3) : null;
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(substring));
    }
}
