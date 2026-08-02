package androidx.room;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class ObservedTableVersions$collect$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ObservedTableVersions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservedTableVersions$collect$1(ObservedTableVersions observedTableVersions, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = observedTableVersions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.collect(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
