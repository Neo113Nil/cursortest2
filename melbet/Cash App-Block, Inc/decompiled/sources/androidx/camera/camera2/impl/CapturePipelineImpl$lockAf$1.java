package androidx.camera.camera2.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CapturePipelineImpl$lockAf$1 extends ContinuationImpl {
    public long J$0;
    public AutoCloseable L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CapturePipelineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePipelineImpl$lockAf$1(CapturePipelineImpl capturePipelineImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = capturePipelineImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CapturePipelineImpl.access$lockAf(this.this$0, 0L, false, this);
    }
}
