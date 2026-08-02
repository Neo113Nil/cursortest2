package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class FileStorageConnection$writeScope$1 extends ContinuationImpl {
    public FileStorageConnection L$0;
    public Object L$1;
    public Object L$2;
    public FileWriteScope L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FileStorageConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$writeScope$1(FileStorageConnection fileStorageConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.writeScope(null, this);
    }
}
