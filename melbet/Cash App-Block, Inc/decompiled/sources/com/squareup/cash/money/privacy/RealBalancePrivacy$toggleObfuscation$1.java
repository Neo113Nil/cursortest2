package com.squareup.cash.money.privacy;

import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class RealBalancePrivacy$toggleObfuscation$1 extends ContinuationImpl {
    public SharedPreferencesKeyValue L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBalancePrivacy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBalancePrivacy$toggleObfuscation$1(RealBalancePrivacy realBalancePrivacy, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBalancePrivacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.toggleObfuscation(this);
    }
}
