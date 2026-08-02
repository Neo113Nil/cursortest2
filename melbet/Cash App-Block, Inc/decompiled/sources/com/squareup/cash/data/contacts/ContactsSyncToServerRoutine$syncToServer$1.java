package com.squareup.cash.data.contacts;

import app.cash.api.ApiResult;
import coil3.ComponentRegistry;
import com.squareup.cash.cdf.ContactSyncTriggerReason;
import com.squareup.cash.cdf.ContactSyncType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ContactsSyncToServerRoutine$syncToServer$1 extends ContinuationImpl {
    public long J$0;
    public ContactSync$SyncReason L$0;
    public ComponentRegistry.Builder L$1;
    public ContactRepository$AliasBySyncState L$2;
    public String L$3;
    public ContactSyncTriggerReason L$4;
    public ContactSyncType L$5;
    public ApiResult L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ComponentRegistry.Builder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsSyncToServerRoutine$syncToServer$1(ComponentRegistry.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.syncToServer(null, this);
    }
}
