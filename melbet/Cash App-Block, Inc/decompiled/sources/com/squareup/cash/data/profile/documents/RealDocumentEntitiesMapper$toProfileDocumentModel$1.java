package com.squareup.cash.data.profile.documents;

import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db2.profile.documents.Document;
import com.squareup.protos.franklin.investing.resources.StatementType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealDocumentEntitiesMapper$toProfileDocumentModel$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public Document L$0;
    public Recipient L$1;
    public FillrWidgetFactory L$3;
    public String L$4;
    public String L$5;
    public StatementType L$6;
    public String L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealDocumentEntitiesMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDocumentEntitiesMapper$toProfileDocumentModel$1(RealDocumentEntitiesMapper realDocumentEntitiesMapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realDocumentEntitiesMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealDocumentEntitiesMapper.access$toProfileDocumentModel(this.this$0, null, null, this);
    }
}
