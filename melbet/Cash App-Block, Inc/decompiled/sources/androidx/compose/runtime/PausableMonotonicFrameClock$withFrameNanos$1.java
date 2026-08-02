package androidx.compose.runtime;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock$withFrameNanos$1 extends ContinuationImpl {
    public Function1 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PausableMonotonicFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, Continuation continuation) {
        super(continuation);
        this.this$0 = pausableMonotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.withFrameNanos(this, null);
    }
}
