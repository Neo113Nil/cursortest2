package app.cash.passcode.backend;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AppLockMonitor$appLockLoop$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AppLockMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockMonitor$appLockLoop$1(AppLockMonitor appLockMonitor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = appLockMonitor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        AppLockMonitor.access$appLockLoop(this.this$0, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
