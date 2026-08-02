package app.cash.local.google.pay.payments;

import androidx.emoji2.text.MetadataRepo;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealLocalGooglePayPaymentsClient$isReadyToPay$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetadataRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocalGooglePayPaymentsClient$isReadyToPay$1(MetadataRepo metadataRepo, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = metadataRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.isReadyToPay(this);
    }
}
