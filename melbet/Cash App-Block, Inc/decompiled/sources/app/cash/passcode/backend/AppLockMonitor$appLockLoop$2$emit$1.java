package app.cash.passcode.backend;

import app.cash.cdp.integration.CashCdpConfigProvider$1$2;
import app.cash.passcode.backend.RealAppLockState;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AppLockMonitor$appLockLoop$2$emit$1 extends ContinuationImpl {
    public RealAppLockState.InternalState L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashCdpConfigProvider$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLockMonitor$appLockLoop$2$emit$1(CashCdpConfigProvider$1$2 cashCdpConfigProvider$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = cashCdpConfigProvider$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((RealAppLockState.InternalState) null, (Continuation) this);
    }
}
