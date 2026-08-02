package androidx.datastore.core;

import java.io.FileInputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class FileReadScope$readData$1 extends ContinuationImpl {
    public Object L$0;
    public FileInputStream L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FileReadScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReadScope$readData$1(FileReadScope fileReadScope, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fileReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return FileReadScope.readData$suspendImpl(this.this$0, this);
    }
}
