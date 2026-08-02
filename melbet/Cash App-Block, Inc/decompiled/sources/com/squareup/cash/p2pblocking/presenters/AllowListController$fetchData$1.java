package com.squareup.cash.p2pblocking.presenters;

import com.google.android.gms.maps.zzai;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class AllowListController$fetchData$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ zzai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllowListController$fetchData$1(zzai zzaiVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zzaiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchData(null, null, this);
    }
}
