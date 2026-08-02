package androidx.camera.camera2.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class UseCaseSurfaceManager$awaitSetupCompletion$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UseCaseSurfaceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseSurfaceManager$awaitSetupCompletion$1(UseCaseSurfaceManager useCaseSurfaceManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = useCaseSurfaceManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return UseCaseSurfaceManager.awaitSetupCompletion$suspendImpl(this.this$0, this);
    }
}
