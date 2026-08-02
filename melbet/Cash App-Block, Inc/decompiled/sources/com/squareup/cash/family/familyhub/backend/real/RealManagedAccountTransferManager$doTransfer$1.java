package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.cash.family.familyhub.backend.api.ManagedAccountTransferManager$ManagedAccountTransferType;
import com.squareup.protos.common.Money;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealManagedAccountTransferManager$doTransfer$1 extends ContinuationImpl {
    public ManagedAccountTransferManager$ManagedAccountTransferType L$0;
    public Money L$1;
    public Object L$10;
    public String L$2;
    public String L$3;
    public String L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealManagedAccountTransferManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealManagedAccountTransferManager$doTransfer$1(RealManagedAccountTransferManager realManagedAccountTransferManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realManagedAccountTransferManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealManagedAccountTransferManager.access$doTransfer(this.this$0, null, null, null, null, null, this);
    }
}
