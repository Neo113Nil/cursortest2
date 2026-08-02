package com.squareup.cash.clientrouting.routers.work;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SquareStaffSwitchAccountRouter$route$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SquareStaffSwitchAccountRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareStaffSwitchAccountRouter$route$1(SquareStaffSwitchAccountRouter squareStaffSwitchAccountRouter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = squareStaffSwitchAccountRouter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.route(null, this);
    }
}
