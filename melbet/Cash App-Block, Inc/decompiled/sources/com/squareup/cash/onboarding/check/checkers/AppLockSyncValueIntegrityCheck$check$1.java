package com.squareup.cash.onboarding.check.checkers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class AppLockSyncValueIntegrityCheck$check$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppLockSyncValueIntegrityCheck this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockSyncValueIntegrityCheck$check$1(AppLockSyncValueIntegrityCheck appLockSyncValueIntegrityCheck, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appLockSyncValueIntegrityCheck;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.check(this);
    }
}
