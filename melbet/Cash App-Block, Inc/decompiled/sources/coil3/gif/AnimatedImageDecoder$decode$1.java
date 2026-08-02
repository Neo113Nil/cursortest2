package coil3.gif;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AnimatedImageDecoder$decode$1 extends ContinuationImpl {
    public Ref$BooleanRef L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnimatedImageDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageDecoder$decode$1(AnimatedImageDecoder animatedImageDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = animatedImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.decode(this);
    }
}
