package com.google.maps.android.compose;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class CameraPositionState$animate$1 extends ContinuationImpl {
    public Job L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CameraPositionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPositionState$animate$1(CameraPositionState cameraPositionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cameraPositionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.animate(null, 0, this);
    }
}
