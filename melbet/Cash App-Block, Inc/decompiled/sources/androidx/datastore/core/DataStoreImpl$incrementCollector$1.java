package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DataStoreImpl$incrementCollector$1 extends ContinuationImpl {
    public DataStoreImpl L$0;
    public MutexImpl L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DataStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$incrementCollector$1(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DataStoreImpl.access$incrementCollector(this.this$0, this);
    }
}
