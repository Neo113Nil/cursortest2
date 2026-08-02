package com.squareup.cash.profile.views;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ProfileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1(ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2 profileCropView$3$1$invokeSuspend$$inlined$map$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = profileCropView$3$1$invokeSuspend$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
