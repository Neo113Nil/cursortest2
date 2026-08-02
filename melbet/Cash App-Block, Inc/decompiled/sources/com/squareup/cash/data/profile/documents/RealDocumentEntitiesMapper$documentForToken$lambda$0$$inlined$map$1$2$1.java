package com.squareup.cash.data.profile.documents;

import com.squareup.cash.data.blockers.RealBlockersHelper$collectBlockersActions$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBlockersHelper$collectBlockersActions$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDocumentEntitiesMapper$documentForToken$lambda$0$$inlined$map$1$2$1(RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2, Continuation continuation) {
        super(continuation);
        this.this$0 = realBlockersHelper$collectBlockersActions$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
