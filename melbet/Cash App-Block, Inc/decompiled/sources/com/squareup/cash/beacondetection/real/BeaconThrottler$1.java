package com.squareup.cash.beacondetection.real;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class BeaconThrottler$1 extends FunctionReferenceImpl implements Function0 {
    public static final BeaconThrottler$1 INSTANCE = new BeaconThrottler$1(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
