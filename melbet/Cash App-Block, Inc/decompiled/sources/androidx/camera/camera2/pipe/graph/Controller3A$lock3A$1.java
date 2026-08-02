package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Controller3A$lock3A$1 extends ContinuationImpl {
    public int I$0;
    public Lock3ABehavior L$0;
    public Lock3ABehavior L$1;
    public AeMode L$2;
    public Long L$4;
    public Ref$ObjectRef L$5;
    public Result3AStateListenerImpl L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Controller3A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Controller3A$lock3A$1(Controller3A controller3A, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = controller3A;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m86lock3AQz1gx5w(null, null, null, null, null, null, null, null, 0, null, null, this);
    }
}
