package com.squareup.cash.data.profile.documents;

import com.squareup.protos.franklin.investing.resources.StatementType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealDocumentEntitiesMapper$toProfileDocumentModel$2 extends ContinuationImpl {
    public long J$0;
    public String L$1;
    public String L$2;
    public StatementType L$3;
    public String L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealDocumentEntitiesMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDocumentEntitiesMapper$toProfileDocumentModel$2(RealDocumentEntitiesMapper realDocumentEntitiesMapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realDocumentEntitiesMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealDocumentEntitiesMapper.access$toProfileDocumentModel(this.this$0, null, this);
    }
}
