package androidx.room.coroutines;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Pool$acquire$1 extends ContinuationImpl {
    public Pool L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pool$acquire$1(Pool pool, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.acquire(this);
    }
}
