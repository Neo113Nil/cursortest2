package com.squareup.cash.data.profile.documents;

import com.squareup.protos.cash.orderly.app.afterpaystatements.AfterpayStatementsClientService;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealAfterpayStatementManager$getAfterpayStatements$1 extends ContinuationImpl {
    public AfterpayStatementsClientService L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAfterpayStatementManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayStatementManager$getAfterpayStatements$1(RealAfterpayStatementManager realAfterpayStatementManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAfterpayStatementManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getAfterpayStatements(this);
    }
}
