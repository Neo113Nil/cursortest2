package androidx.datastore.core;

import java.io.FileOutputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class FileWriteScope$writeData$1 extends ContinuationImpl {
    public FileOutputStream L$0;
    public FileOutputStream L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FileWriteScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope$writeData$1(FileWriteScope fileWriteScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fileWriteScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.writeData(null, this);
    }
}
