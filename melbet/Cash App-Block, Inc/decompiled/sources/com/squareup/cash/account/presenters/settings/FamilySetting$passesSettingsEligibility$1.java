package com.squareup.cash.account.presenters.settings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class FamilySetting$passesSettingsEligibility$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FamilySetting this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilySetting$passesSettingsEligibility$1(FamilySetting familySetting, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = familySetting;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.passesSettingsEligibility(this);
    }
}
