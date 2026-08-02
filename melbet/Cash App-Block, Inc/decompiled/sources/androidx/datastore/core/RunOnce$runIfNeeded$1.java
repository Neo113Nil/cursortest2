package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RunOnce$runIfNeeded$1 extends ContinuationImpl {
    public SimpleActor L$0;
    public Mutex L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SimpleActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunOnce$runIfNeeded$1(SimpleActor simpleActor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.runIfNeeded(this);
    }
}
