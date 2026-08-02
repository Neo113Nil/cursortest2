package com.squareup.cash.data.contacts;

import com.squareup.cash.data.contacts.ContactSyncEvent;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealContactSync$syncContactsToDatabaseAndUploadAliases$1 extends ContinuationImpl {
    public List L$0;
    public ContactSyncEvent.SyncRoutines L$1;
    public Long L$2;
    public ContactSync$SyncReason L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealContactSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSync$syncContactsToDatabaseAndUploadAliases$1(RealContactSync realContactSync, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realContactSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealContactSync.access$syncContactsToDatabaseAndUploadAliases(this.this$0, null, null, false, null, null, this);
    }
}
