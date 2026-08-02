package coil3.decode;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.SemaphoreImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class StaticImageDecoder$decode$1 extends ContinuationImpl {
    public SemaphoreImpl L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StaticImageDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticImageDecoder$decode$1(StaticImageDecoder staticImageDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = staticImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.decode(this);
    }
}
