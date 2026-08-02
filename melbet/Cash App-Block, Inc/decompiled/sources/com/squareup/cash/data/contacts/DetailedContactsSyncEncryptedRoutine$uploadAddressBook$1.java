package com.squareup.cash.data.contacts;

import androidx.compose.ui.node.NodeChain;
import com.squareup.cash.cdf.ContactSyncTriggerReason;
import com.squareup.cash.cdf.ContactSyncType;
import com.squareup.protos.cash.contacts.app.ContactsPatch;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class DetailedContactsSyncEncryptedRoutine$uploadAddressBook$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public List L$0;
    public ContactSync$SyncReason L$1;
    public NodeChain L$2;
    public String L$3;
    public ContactSyncType L$4;
    public ContactSyncTriggerReason L$5;
    public ContactsPatch L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NodeChain this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedContactsSyncEncryptedRoutine$uploadAddressBook$1(NodeChain nodeChain, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nodeChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.uploadAddressBook(null, false, null, this);
    }
}
