package app.cash.badging.backend;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealBadger2$refreshCounts$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public List L$0;
    public Mutex L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBadger2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBadger2$refreshCounts$1(RealBadger2 realBadger2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBadger2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.refreshCounts(null, this);
    }
}
