package coil3.network.internal;

import coil3.network.SourceResponseBody;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.Buffer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class UtilsKt$readBuffer$1 extends ContinuationImpl {
    public SourceResponseBody L$0;
    public Buffer L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return UtilsKt.readBuffer(null, this);
    }
}
