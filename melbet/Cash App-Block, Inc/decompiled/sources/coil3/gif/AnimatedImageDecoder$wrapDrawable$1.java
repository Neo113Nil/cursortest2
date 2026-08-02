package coil3.gif;

import android.graphics.drawable.AnimatedImageDrawable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AnimatedImageDecoder$wrapDrawable$1 extends ContinuationImpl {
    public AnimatedImageDrawable L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnimatedImageDecoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageDecoder$wrapDrawable$1(AnimatedImageDecoder animatedImageDecoder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = animatedImageDecoder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.wrapDrawable(null, this);
    }
}
