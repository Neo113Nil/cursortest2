package app.cash.local.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealOrderBuilder$models$createOrder$1 extends ContinuationImpl {
    public RealOrderBuilder L$0;
    public MutableState L$1;
    public String L$10;
    public CreateOrderResponse L$12;
    public String L$13;
    public State L$2;
    public OrderWorkflow L$7;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return RealOrderBuilder.models$createOrder(null, null, null, null, null, null, null, null, false, this);
    }
}
