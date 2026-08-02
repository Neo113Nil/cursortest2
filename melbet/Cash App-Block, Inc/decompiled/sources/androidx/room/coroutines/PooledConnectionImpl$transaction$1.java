package androidx.room.coroutines;

import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PooledConnectionImpl$transaction$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Serializable L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PooledConnectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PooledConnectionImpl$transaction$1(PooledConnectionImpl pooledConnectionImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.transaction$1(null, null, this);
    }
}
