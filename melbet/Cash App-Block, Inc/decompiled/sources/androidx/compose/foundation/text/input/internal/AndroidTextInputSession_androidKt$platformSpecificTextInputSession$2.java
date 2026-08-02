package androidx.compose.foundation.text.input.internal;

import androidx.tracing.Trace;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Trace.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
