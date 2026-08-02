package com.squareup.cash.initialscreenloader.backend;

import com.squareup.cash.initialscreenloader.backend.InitialScreenLoader$TriggeredBy;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter$models$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RealInitialScreenLoader$loadInitialScreen$1 extends ContinuationImpl {
    public InitialScreenLoader$TriggeredBy.ActivityLaunch L$0;
    public InitialScreenLoaderPresenter$models$1$1$1 L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealInitialScreenLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInitialScreenLoader$loadInitialScreen$1(RealInitialScreenLoader realInitialScreenLoader, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realInitialScreenLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.loadInitialScreen(null, null, this);
    }
}
