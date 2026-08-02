package androidx.camera.camera2.pipe.compat;

import androidx.appcompat.widget.Toolbar;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SessionSequencer$awaitSessionLock$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Toolbar.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionSequencer$awaitSessionLock$1(Toolbar.AnonymousClass1 anonymousClass1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.awaitSessionLock(this);
    }
}
