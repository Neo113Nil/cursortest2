package app.cash.local.store.real;

import app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfigurations-yV01Fno$$inlined$map$1$2$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class RealLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocalInstalledStore$selectFulfillmentConfigurationsyV01Fno$$inlined$map$1$2$1(RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
