package com.squareup.cash.blockers.presenters;

import com.google.mlkit.vision.common.zzb;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class UnlockAppEndpoint$call$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ zzb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockAppEndpoint$call$1(zzb zzbVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zzbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.call(null, null, null, this);
    }
}
