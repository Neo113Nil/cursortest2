package androidx.room.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ConnectionPoolImpl$useConnection$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Pool L$2;
    public Ref$ObjectRef L$3;
    public CoroutineContext L$4;
    public Ref$ObjectRef L$5;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConnectionPoolImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPoolImpl$useConnection$1(ConnectionPoolImpl connectionPoolImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = connectionPoolImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.useConnection(false, null, this);
    }
}
