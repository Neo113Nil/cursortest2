package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class SponseeWalletSnapshotFetcher$doFetch$1 extends ContinuationImpl {
    public TagThemeDefinitions L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SponseeWalletSnapshotFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponseeWalletSnapshotFetcher$doFetch$1(SponseeWalletSnapshotFetcher sponseeWalletSnapshotFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sponseeWalletSnapshotFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.doFetch(null, null, this);
    }
}
