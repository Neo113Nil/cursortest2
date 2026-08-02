package androidx.camera.viewfinder.compose;

import com.squareup.cash.filament.engine.FilamentDisplayHelper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1 extends ContinuationImpl {
    public FilamentDisplayHelper L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ViewfinderInitScopeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewfinderInitScopeImpl$dispatchOnSurfaceSession$1(ViewfinderInitScopeImpl viewfinderInitScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = viewfinderInitScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.dispatchOnSurfaceSession(null, this);
    }
}
