package coil3.util;

import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LifecyclesKt$awaitStarted$1 extends ContinuationImpl {
    public Lifecycle L$0;
    public Ref$ObjectRef L$1;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LifecyclesKt.awaitStarted(null, this);
    }
}
