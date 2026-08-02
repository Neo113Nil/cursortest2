package androidx.compose.ui.platform;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        PlatformTextInputModifierNodeKt.interceptedTextInputSession(null, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
