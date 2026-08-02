package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class DataStoreImpl$handleUpdate$1 extends ContinuationImpl {
    public Object L$0;
    public DataStoreImpl L$1;
    public CompletableDeferredImpl L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DataStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$handleUpdate$1(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DataStoreImpl.access$handleUpdate(this.this$0, null, this);
    }
}
