package com.squareup.cash.account.presenters.settings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class BusinessInfoSetting$checkAdditionalIsAvailable$1 extends ContinuationImpl {
    public int I$0;
    public BusinessInfoSetting L$0;
    public boolean Z$0;
    public boolean Z$1;
    public boolean Z$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BusinessInfoSetting this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessInfoSetting$checkAdditionalIsAvailable$1(BusinessInfoSetting businessInfoSetting, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = businessInfoSetting;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.checkAdditionalIsAvailable(this);
    }
}
