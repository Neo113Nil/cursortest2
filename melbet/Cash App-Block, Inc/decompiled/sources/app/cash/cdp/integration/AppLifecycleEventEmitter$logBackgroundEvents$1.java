package app.cash.cdp.integration;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AppLifecycleEventEmitter$logBackgroundEvents$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppLifecycleEventEmitter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLifecycleEventEmitter$logBackgroundEvents$1(AppLifecycleEventEmitter appLifecycleEventEmitter, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appLifecycleEventEmitter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        AppLifecycleEventEmitter.access$logBackgroundEvents(this.this$0, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
