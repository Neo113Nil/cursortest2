package app.cash.sqldelight.async.coroutines;

import androidx.tracing.Trace;
import app.cash.sqldelight.ExecutableQuery;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class QueryExtensionsKt$awaitAsOne$1 extends ContinuationImpl {
    public ExecutableQuery L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return Trace.awaitAsOne(null, this);
    }
}
