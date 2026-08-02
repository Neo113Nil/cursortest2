package com.squareup.cash.fidesmo.real;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$2 extends FunctionReferenceImpl implements Function0 {
    public final /* synthetic */ long $connectionId;
    public final /* synthetic */ RealFidesmoClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$2(long j, RealFidesmoClient realFidesmoClient) {
        super(0, ArrayIteratorKt.class, "isCurrentConnection", "invokeSuspend$isCurrentConnection(JLcom/squareup/cash/fidesmo/real/RealFidesmoClient;)Z", 0);
        this.$connectionId = j;
        this.this$0 = realFidesmoClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.invokeSuspend$isCurrentConnection(this.$connectionId, this.this$0));
    }
}
