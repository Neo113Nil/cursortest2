package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class HoverableNode$emitEnter$1 extends ContinuationImpl {
    public HoverInteraction$Enter L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HoverableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverableNode$emitEnter$1(HoverableNode hoverableNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hoverableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return HoverableNode.access$emitEnter(this.this$0, this);
    }
}
