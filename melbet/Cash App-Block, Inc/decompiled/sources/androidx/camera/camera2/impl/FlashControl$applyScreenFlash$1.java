package androidx.camera.camera2.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FlashControl$applyScreenFlash$1 extends ContinuationImpl {
    public long J$0;
    public CompletableDeferredImpl L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlashControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashControl$applyScreenFlash$1(FlashControl flashControl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = flashControl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.applyScreenFlash(0L, this);
    }
}
