package com.squareup.cash.bitcoin.capability;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public abstract class BTCxCapability {
    public Object checkAdditionalIsAvailable(Continuation continuation) {
        return Boolean.TRUE;
    }

    public abstract RealBitcoinCapabilityProvider getBitcoinCapabilityProvider();
}
