package androidx.glance.session;

import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.Recomposer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SessionWorkerKt$runSession$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public InteractiveFrameClock L$4;
    public StandaloneCoroutine L$5;
    public Recomposer L$6;
    public CompositionImpl L$7;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return SessionWorkerKt.access$runSession(null, null, null, null, null, this);
    }
}
