package com.squareup.cash.data.contacts;

import androidx.compose.ui.node.NodeChain;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class DetailedContactsSyncEncryptedRoutine$buildProtoList$1 extends ContinuationImpl {
    public List L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NodeChain this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedContactsSyncEncryptedRoutine$buildProtoList$1(NodeChain nodeChain, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nodeChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.buildProtoList(null, this);
    }
}
