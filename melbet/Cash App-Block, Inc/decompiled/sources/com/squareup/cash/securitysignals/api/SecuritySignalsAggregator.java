package com.squareup.cash.securitysignals.api;

import com.squareup.cash.securitysignals.backend.RealSecuritySignalsAggregator;
import com.squareup.protos.franklin.common.SignalsContext;
import java.util.List;

/* loaded from: classes.dex */
public interface SecuritySignalsAggregator {
    default SignalsContext buildSignalsContext(List list) {
        list.getClass();
        return ((RealSecuritySignalsAggregator) this).buildSignalsContext(new com.squareup.cash.securitysignals.models.SignalsContext(list));
    }
}
