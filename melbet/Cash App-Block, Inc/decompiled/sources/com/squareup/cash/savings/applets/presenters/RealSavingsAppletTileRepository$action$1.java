package com.squareup.cash.savings.applets.presenters;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class RealSavingsAppletTileRepository$action$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealSavingsAppletTileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSavingsAppletTileRepository$action$1(RealSavingsAppletTileRepository realSavingsAppletTileRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realSavingsAppletTileRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealSavingsAppletTileRepository.access$action(this.this$0, null, this);
    }
}
