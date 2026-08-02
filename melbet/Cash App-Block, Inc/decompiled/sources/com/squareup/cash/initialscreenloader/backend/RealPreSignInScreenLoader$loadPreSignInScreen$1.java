package com.squareup.cash.initialscreenloader.backend;

import com.squareup.cash.attribution.deeplink.DeepLink;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealPreSignInScreenLoader$loadPreSignInScreen$1 extends ContinuationImpl {
    public Function0 L$0;
    public DeepLink L$1;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealPreSignInScreenLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealPreSignInScreenLoader$loadPreSignInScreen$1(RealPreSignInScreenLoader realPreSignInScreenLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realPreSignInScreenLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.loadPreSignInScreen(null, false, false, this);
    }
}
