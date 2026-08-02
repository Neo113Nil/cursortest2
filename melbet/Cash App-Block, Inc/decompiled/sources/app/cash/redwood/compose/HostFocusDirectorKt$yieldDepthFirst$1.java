package app.cash.redwood.compose;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.SequenceScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class HostFocusDirectorKt$yieldDepthFirst$1 extends ContinuationImpl {
    public SequenceScope L$0;
    public Iterator L$2;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return HostFocusDirectorKt.access$yieldDepthFirst(null, null, this);
    }
}
