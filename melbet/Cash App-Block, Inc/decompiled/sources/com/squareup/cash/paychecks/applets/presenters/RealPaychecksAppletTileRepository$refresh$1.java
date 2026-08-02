package com.squareup.cash.paychecks.applets.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealPaychecksAppletTileRepository$refresh$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPaychecksAppletTileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPaychecksAppletTileRepository$refresh$1(RealPaychecksAppletTileRepository realPaychecksAppletTileRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPaychecksAppletTileRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealPaychecksAppletTileRepository.access$refresh(this.this$0, this);
    }
}
