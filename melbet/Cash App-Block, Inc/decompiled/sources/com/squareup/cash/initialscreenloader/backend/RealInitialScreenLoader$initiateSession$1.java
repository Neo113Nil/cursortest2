package com.squareup.cash.initialscreenloader.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealInitialScreenLoader$initiateSession$1 extends ContinuationImpl {
    public Function2 L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealInitialScreenLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInitialScreenLoader$initiateSession$1(RealInitialScreenLoader realInitialScreenLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realInitialScreenLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m3569initiateSessionzO7DZzo(null, false, this);
    }
}
