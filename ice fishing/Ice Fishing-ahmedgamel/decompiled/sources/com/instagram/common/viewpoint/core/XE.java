package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static AdError A00(C1332Vm c1332Vm) {
        if (c1332Vm.A03().isPublicError()) {
            return new AdError(c1332Vm.A03().getErrorCode(), c1332Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
