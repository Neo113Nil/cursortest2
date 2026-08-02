package com.squareup.cash.intent;

import android.content.Intent;
import app.cash.broadway.navigation.Navigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealIntentHandler$handleCryptoIntent$1 extends ContinuationImpl {
    public Navigator L$0;
    public Intent L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealIntentHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealIntentHandler$handleCryptoIntent$1(RealIntentHandler realIntentHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realIntentHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealIntentHandler.access$handleCryptoIntent(this.this$0, null, null, this);
    }
}
