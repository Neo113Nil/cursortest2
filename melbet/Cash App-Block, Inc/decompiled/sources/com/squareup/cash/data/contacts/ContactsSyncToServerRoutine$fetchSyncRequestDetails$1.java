package com.squareup.cash.data.contacts;

import coil3.ComponentRegistry;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ContactsSyncToServerRoutine$fetchSyncRequestDetails$1 extends ContinuationImpl {
    public ContactRepository$AliasBySyncState L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ComponentRegistry.Builder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSyncToServerRoutine$fetchSyncRequestDetails$1(ComponentRegistry.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchSyncRequestDetails(this);
    }
}
