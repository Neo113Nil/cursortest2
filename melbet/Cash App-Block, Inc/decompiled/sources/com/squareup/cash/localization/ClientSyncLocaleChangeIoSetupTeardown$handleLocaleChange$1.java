package com.squareup.cash.localization;

import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ClientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1 extends ContinuationImpl {
    public RealClientSyncer L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ClientSyncLocaleChangeIoSetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientSyncLocaleChangeIoSetupTeardown$handleLocaleChange$1(ClientSyncLocaleChangeIoSetupTeardown clientSyncLocaleChangeIoSetupTeardown, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = clientSyncLocaleChangeIoSetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ClientSyncLocaleChangeIoSetupTeardown.access$handleLocaleChange(this.this$0, this);
    }
}
