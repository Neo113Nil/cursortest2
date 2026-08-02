package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Rect L$0;
    public Object[] L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BringIntoViewRequesterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.bringIntoView(null, this);
    }
}
