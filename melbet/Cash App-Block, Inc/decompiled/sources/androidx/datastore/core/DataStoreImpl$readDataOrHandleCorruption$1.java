package androidx.datastore.core;

import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class DataStoreImpl$readDataOrHandleCorruption$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Serializable L$2;
    public Ref$ObjectRef L$3;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DataStoreImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$1(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DataStoreImpl.access$readDataOrHandleCorruption(this.this$0, false, this);
    }
}
