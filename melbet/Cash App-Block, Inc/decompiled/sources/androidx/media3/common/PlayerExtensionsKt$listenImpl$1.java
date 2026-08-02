package androidx.media3.common;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PlayerExtensionsKt$listenImpl$1 extends ContinuationImpl {
    public Player L$0;
    public Function2 L$2;
    public Ref$ObjectRef L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        PlayerExtensionsKt.listenImpl(null, null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
