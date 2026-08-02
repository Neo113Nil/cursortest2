package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PooledConnectionImpl$usePrepared$1 extends ContinuationImpl {
    public PooledConnectionImpl L$0;
    public String L$1;
    public Function1 L$2;
    public ConnectionWithLock L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PooledConnectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$usePrepared$1(PooledConnectionImpl pooledConnectionImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.usePrepared(null, null, this);
    }
}
