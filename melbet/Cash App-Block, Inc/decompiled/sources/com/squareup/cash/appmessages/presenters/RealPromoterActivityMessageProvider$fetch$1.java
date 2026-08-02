package com.squareup.cash.appmessages.presenters;

import com.miteksystems.misnap.camera.a.n;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class RealPromoterActivityMessageProvider$fetch$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPromoterActivityMessageProvider$fetch$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetch(this);
    }
}
