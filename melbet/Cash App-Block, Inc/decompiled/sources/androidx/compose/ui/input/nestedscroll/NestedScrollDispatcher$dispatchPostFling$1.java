package androidx.compose.ui.input.nestedscroll;

import androidx.datastore.core.SimpleActor;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SimpleActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(SimpleActor simpleActor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m1109dispatchPostFlingRZ2iAVY(0L, 0L, this);
    }
}
