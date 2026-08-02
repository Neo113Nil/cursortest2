package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {
    public ScrollingLogic L$0;
    public Ref$FloatRef L$1;
    public int label;
    public /* synthetic */ Object result;

    public ScrollableKt$semanticsScrollBy$1(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ScrollableKt.m240access$semanticsScrollByd4ec7I(null, 0L, this);
    }
}
