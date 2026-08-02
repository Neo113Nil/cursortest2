package com.squareup.cash.initialscreenloader.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealSquareStaffSwitchAccountContextStore$clear$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSquareStaffSwitchAccountContextStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSquareStaffSwitchAccountContextStore$clear$1(RealSquareStaffSwitchAccountContextStore realSquareStaffSwitchAccountContextStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSquareStaffSwitchAccountContextStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.clear(this);
    }
}
