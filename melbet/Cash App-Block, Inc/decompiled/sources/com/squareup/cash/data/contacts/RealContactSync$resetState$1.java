package com.squareup.cash.data.contacts;

import com.squareup.cash.cdf.contact.ContactSyncReset;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealContactSync$resetState$1 extends ContinuationImpl {
    public ContactSyncState L$0;
    public Analytics L$4;
    public ContactSyncReset.ResetReason L$5;
    public Boolean L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealContactSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSync$resetState$1(RealContactSync realContactSync, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realContactSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealContactSync.access$resetState(this.this$0, null, null, this);
    }
}
